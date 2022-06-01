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

package api

import life.traktorist.api.ApiEndpoint
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import life.traktorist.api.dto.ContentItem
import life.traktorist.api.dto.ContentResponse
import life.traktorist.api.dto.FaqChapter

class FaqApi {
    private val jsonClient = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getContents(): List<ContentItem> {
        val response = jsonClient.get(ApiEndpoint.fullPath(ApiEndpoint.Contents)) {
            contentType(ContentType.Application.Json)
        }
        return response.body<ContentResponse>().content
    }

    suspend fun getChapter(id: Int): FaqChapter {
        val response = jsonClient.get(ApiEndpoint.fullPath(ApiEndpoint.Chapter) + "/$id") {
            contentType(ContentType.Application.Json)
        }
        return response.body()
    }
}