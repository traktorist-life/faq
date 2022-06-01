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

package components

import androidx.compose.runtime.Composable
import life.traktorist.api.dto.AnswerBlockType
import life.traktorist.api.dto.FaqChapter
import life.traktorist.api.dto.FaqItem
import life.traktorist.api.dto.Tag
import org.jetbrains.compose.web.dom.*
import theme.AppStylesheet

@Composable
fun ChapterArea(chapterData: Pair<Tag, FaqChapter>?) {
    if (chapterData == null) {
        Text("loading...")
        return
    }

    val (tag, chapter) = chapterData

    H1 {
        Text("FAQ: ${tag.title}")
    }
    P {
        A(href = "/") {
            Text("В начало")
        }
    }
    Hr()
    P {
        Text("Основные вопросы в теме")
    }

    Ol(attrs = {
        //type=1
    }) {
        chapter.items.forEachIndexed { index, item ->
            Li {
                A(href = "#$index") {
                    Text(item.question)
                }
            }
        }
    }
    if (chapter.addItems.isNotEmpty()) {
        P {
            Text("Связанные с темой вопросы")
        }
        Ol(attrs = {
            //type=1
        }) {
            chapter.addItems.forEachIndexed { index, item ->
                Li {
                    //A(href = "#$index") {
                    Text(item.question)
                    //}
                }
            }
        }
    }
    Hr()

    QuestionList(chapter.items)

    if (chapter.addItems.isNotEmpty()) {
        H3 { Text("Связанные темы") }
        QuestionList(chapter.addItems)
    }
}

@Composable
private fun QuestionList(items: List<FaqItem>) {
    items.forEachIndexed { index, item ->
        Div(attrs = {
            classes(AppStylesheet.item)
        }) {
            H3(attrs = {
                id(index.toString())
                classes(AppStylesheet.itemQuestion)
            }) {
                Text(item.question)
            }
            item.answer.forEach { line ->
                when (line.type) {
                    AnswerBlockType.Header -> H3(attrs = { classes(AppStylesheet.itemAnswerHeader) }) { Text(line.data) }
                    AnswerBlockType.Paragraph -> P(attrs = { classes(AppStylesheet.itemAnswer) }) { Text(line.data) }
                }
            }
            Div {
                item.tags.forEach { tag ->
                    A(href = "/chapter/${tag.id}", attrs = { classes(AppStylesheet.itemMainTag) }) {
                        Text(tag.title)
                    }
                }
                item.addTags?.forEach { tag ->
                    A(href = "/chapter/${tag.id}", attrs = { classes(AppStylesheet.itemAddTag) }) {
                        Text(tag.title)
                    }
                }
            }
        }
    }
}