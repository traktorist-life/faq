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

package life.traktorist.plugins

import life.traktorist.api.ApiEndpoint
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.routing.*
import life.traktorist.api.dto.FaqChapter
import life.traktorist.base.FaqContext
import life.traktorist.api.dto.Tag
import life.traktorist.chapter.*
import life.traktorist.route.chapter
import life.traktorist.route.root

fun Application.configureRouting() {
    install(AutoHeadResponse)
    val context = FaqContext(
        data = buildFaq()
    )

    routing {
        route(ApiEndpoint.ApiRoot) {
            root(context)
            chapter(context)
        }
        static("/") {
            defaultResource("/static/index.html")
            resources("/static")
        }
    }
}

private fun buildFaq(): Map<Tag, FaqChapter> {
    val allQuestions = residence + transfer + transportRoutes + finance + family + lifeStyle + estate + pets
    val addTags = allQuestions.mapNotNull { it.addTags }.flatten().distinct()

    val byAddTag = addTags.associateWith { tag -> allQuestions.filter { it.addTags?.contains(tag) == true } }
    return Tag
        .values()
        .associateWith { tag ->
            val questions = allQuestions.filter { it.tags.contains(tag) }
            FaqChapter(
                questions,
                byAddTag[tag] ?: listOf()
            )
        }
}