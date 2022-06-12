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
import life.traktorist.api.dto.ContentItem
import org.jetbrains.compose.web.dom.*
import theme.AppStylesheet

@Composable
fun HomeArea(contents: List<ContentItem>?) {
    Div(attrs = { classes(AppStylesheet.homeContainer) }) {
        H1 {
            Text("FAQ по вопросам приезда/переезда в Черногорию")
        }
        Img(src = "/sitepic.jpg")
        P {
            Text("NOTE: некоторые моменты в FAQ могут не отвечать вашим ожиданиям или вашей информации. Чаще всего это означает, что ваши данные устарели из-за новых веяний в законодательстве, но могут встречаться и ошибки или информация может устареть. Если вы точно знаете, что в FAQ ошибка, пожалуйста, напишите нам, вы очень поможете дать людям правильную информацию. см. раздел ниже О Сайте")
        }

        if (contents == null) {
            Text("loading...")
            return@Div
        }

        contents.forEach { item ->
            Div {
                H3 {
                    A(
                        href = "/#/chapter/${item.tag.id}"
                    ) {
                        Text(item.tag.title)
                    }
                }
                P {
                    Text("Вопросов в теме: ${item.count}")
                }
            }
        }
        Hr()
        A(href = "/#/about") {
            Text("О сайте")
        }
    }
    LaunchedEffect(true) {
        document.title = "FAQ по Черногории"
    }
}