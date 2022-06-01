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

package life.traktorist.api.dto

import kotlinx.serialization.Serializable

@Serializable
data class FaqItem(
    val question: String,
    val answer: List<AnswerBlock>,
    val tags: List<Tag>,
    val addTags: List<Tag>?,
) {
    constructor(question: String, answer: String, tags: List<Tag>, addTags: List<Tag>?)
            : this(question, listOf(answer.paragraph()), tags, addTags)

    constructor(question: String, answer: String, tag: Tag, addTag: Tag? = null)
            : this(question, listOf(answer.paragraph()), listOf(tag), addTag?.let { listOf(it) })
}
