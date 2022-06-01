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

package life.traktorist.route

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import life.traktorist.api.ApiEndpoint
import life.traktorist.api.dto.FaqChapter
import life.traktorist.api.dto.Tag
import life.traktorist.base.FaqContext

fun Route.chapter(faqContext: FaqContext) {
    get("${ApiEndpoint.Chapter}/{id}") {

        val id = call.parameters["id"]?.toIntOrNull()
        val tag = Tag.values().firstOrNull { it.id == id }
        if (tag == null) {
            call.respond(HttpStatusCode.NotFound)
            return@get
        }

        call.respond(HttpStatusCode.OK, FaqChapter(faqContext.data[tag]?.items ?: emptyList(), faqContext.data[tag]?.addItems ?: emptyList()))
    }
}
