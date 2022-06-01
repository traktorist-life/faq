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
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutArea() {
    H1 { Text("О нас") }
    P { Text("Это частный ресурс, поддерживаемый на общественных началах.") }
    P { Text("Ввиду принятия ряда законодательных инициатив, у нас нет и не будет форумов/обсуждений/пользовательского контента без премодерации. В telegram есть группы, где можно пообщаться с людьми в той или иной стадии переезда и узнать больше подробностей об этом событии.") }
    P {
        Text("Если у вас есть предложения-пожелания, или вы можете помочь (очень был бы полезен css, но только если вы понимаете что это) - пишите в телегу ")
        A(href = "https://t.me/traktoristlife") { Text("@traktoristlife") }
        Text(" :)")
    }
}