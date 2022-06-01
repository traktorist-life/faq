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


private val school = FaqItem(
    question = "Какие есть школы",
    answer = listOf(
        "Есть местные государственные (бесплатные), есть частные - русскоязычные, англоязычные.".paragraph(),
        "По качеству стандартно: обучение в местных школах может не отвечать вашим ожиданиям (детей к поступлению в МГУ не готовят), но есть репетиторы, которые помогут подтянуть предметы.".paragraph(),
        "Довольно подробная информация в ролике на <a href='https://www.youtube.com/watch?v=urI-CwgE2d4'>youtube</a>".paragraph(),
    ),
    listOf(Tag.Family),
    null
)


val family = listOf(
    school,
)