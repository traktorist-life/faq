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

package life.traktorist.chapter

import life.traktorist.api.dto.FaqItem
import life.traktorist.api.dto.Tag
import life.traktorist.api.dto.paragraph


private val general = FaqItem(
    question = "Подготовка и процедура перевозки",
    answer = listOf(
        "Много вопросов описано в <a href='https://t.me/SerbiaInMyMind/3473'>сообщении Telegram</a>".paragraph(),
    ),
    listOf(Tag.Pets),
    null
)

val pets = listOf(
    general,
)