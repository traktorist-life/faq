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

package theme

import org.jetbrains.compose.web.css.*

object AppStylesheet : StyleSheet() {

    val container by style {
//        fontFamily("sans-serif")
    }

    val homeContainer by style {
//        textAlign("center")
    }

    val item by style {
//        margin(12.px, 4.px)
//        padding(8.px, 12.px, 12.px)
    }

    val itemQuestion by style {
//        marginTop(4.px)
//        marginBottom(6.px)
//        marginLeft(12.px)
//        color(rgb(49, 49, 49))
//        fontSize(1.em)
    }

    val itemAnswerHeader by style {
//        marginTop(10.px)
//        marginBottom(4.px)
//        marginLeft(4.px)
//        color(rgb(73, 73, 73))
//        fontSize(0.9.em)
    }

    val itemAnswer by style {
//        marginTop(0.px)
//        marginBottom(4.px)
//        marginLeft(4.px)
//        color(rgb(73, 73, 73))
//        fontSize(0.9.em)
    }

    val itemMainTag by style {
//        padding(4.px, 8.px)
//        marginRight(4.px)
//        backgroundColor(rgb(199, 199, 199))
//        borderRadius(3.px)
//        color(rgb(63, 63, 63))
//        fontSize(0.7.em)
//        textDecoration("none")
    }

    val itemAddTag = itemMainTag
}