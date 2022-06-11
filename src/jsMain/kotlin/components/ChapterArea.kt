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
import androidx.compose.runtime.LaunchedEffect
import kotlinx.browser.document
import life.traktorist.api.dto.AnswerBlockType
import life.traktorist.api.dto.FaqItem
import life.traktorist.api.dto.Tag
import org.jetbrains.compose.web.dom.*
import theme.AppStylesheet

@Composable
fun ChapterArea(model: ChapterModel?) {
    if (model == null) {
        Text("loading...")
        return
    }

    H1 {
        Text("FAQ: ${model.tag.title}")
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
        model.data.items.forEachIndexed { index, item ->
            Li {
                A(href = "/#/chapter/${model.tag.id}/$index") {
                    Text(item.question)
                }
            }
        }
    }
    if (model.data.addItems.isNotEmpty()) {
        P {
            Text("Связанные с темой вопросы")
        }
        Ol(attrs = {
            //type=1
        }) {
            model.data.addItems.forEachIndexed { index, item ->
                Li {
                    //A(href = "#$index") {
                    Text(item.question)
                    //}
                }
            }
        }
    }
    Hr()

    QuestionList(model.data.items, model.tag)

    if (model.data.addItems.isNotEmpty()) {
        H3 { Text("Связанные темы") }
        QuestionList(model.data.addItems, model.tag)
    }
    LaunchedEffect(model.selectedQuestion) {
        model.selectedQuestion?.let {
            document.getElementById("$it")?.scrollIntoView()
        }
    }
}

@Composable
private fun QuestionList(items: List<FaqItem>, chapterTage: Tag) {
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
                    QuestionTag(tag, AppStylesheet.itemMainTag, tag != chapterTage)
                }
                item.addTags?.forEach { tag ->
                    QuestionTag(tag, AppStylesheet.itemAddTag, tag != chapterTage)
                }
            }
        }
    }
}

@Composable
fun QuestionTag(tag: Tag, style: String, selectable: Boolean) {
    if (!selectable)
        Span(attrs = { classes(style) }) {
            Text(tag.title)
        }
    else
        A(href = "#/chapter/${tag.id}", attrs = { classes(style) }) {
            Text(tag.title)
        }
}