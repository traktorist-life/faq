/*
 * Copyright 2022 traktorist.life
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import api.FaqApi
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import life.traktorist.api.dto.ContentItem
import life.traktorist.api.dto.FaqChapter
import life.traktorist.api.dto.Tag

class MainViewModel(
    private val scope: CoroutineScope,
    private val api: FaqApi,
) {
    private val chapterRoute = Regex("^#/chapter/(\\d+)$")
    private val chapters = Tag.values().associateBy { it.id }

    private val _area: MutableStateFlow<Area>
    private val _contents: MutableStateFlow<List<ContentItem>?>
    private val _chapter: MutableStateFlow<Pair<Tag, FaqChapter>?>

    private val _state: MutableStateFlow<ModelState>

    val state: StateFlow<ModelState>
        get() = _state


    init {
        val initState = ModelState(
            area = Area.Home,
            contents = null,
            chapter = null,
        )
        _state = MutableStateFlow(initState)
        _area = MutableStateFlow(initState.area)
        _contents = MutableStateFlow(initState.contents)
        _chapter = MutableStateFlow(initState.chapter)

        scope.launch {
            combine(
                _area,
                _contents,
                _chapter,
            ) { area, contents, chapter ->
                ModelState(
                    area = area,
                    contents = contents,
                    chapter = chapter
                )
            }.collect {
                _state.emit(it)
            }
        }
    }

    fun load() {
        window.onhashchange = { reloadRoute() }
        reloadRoute()
    }

    private fun reloadRoute() {
        val chapterId = chapterRoute.find(window.location.hash)?.groupValues?.drop(1)?.firstOrNull()?.toIntOrNull()
        if (chapterId != null)
            loadChapter(chapterId)
        else
            loadContents()
    }

    private fun loadContents() {
        _area.value = Area.Home
        scope.launch {
            _contents.value = api.getContents()
        }
    }

    private fun loadChapter(chapterId: Int) {
        val tag = chapters[chapterId] ?: return
        _area.value = Area.Chapter
        _chapter.value = null
        scope.launch {
            _chapter.value = tag to api.getChapter(chapterId)
        }
    }
}

data class ModelState(
    val area: Area,
    val contents: List<ContentItem>?,
    val chapter: Pair<Tag, FaqChapter>?,
)