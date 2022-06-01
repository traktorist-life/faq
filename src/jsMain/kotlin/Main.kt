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

import androidx.compose.runtime.*
import api.FaqApi
import components.ChapterArea
import components.HomeArea
import kotlinx.coroutines.MainScope
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import theme.AppStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        val model = remember { MainViewModel(MainScope(), FaqApi()) }
        val state by model.state.collectAsState()

        Style(AppStylesheet)

        Div(
            attrs = {
                classes(AppStylesheet.container)
            }
        ) {
            when(state.area){
                Area.Home -> HomeArea(state.contents)
                Area.Chapter -> ChapterArea(state.chapter)
            }
        }

        LaunchedEffect(true) {
            model.load()
        }
    }
}

