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

import life.traktorist.api.serialization.TagSerializer
import kotlinx.serialization.Serializable

@Serializable(with = TagSerializer::class)
enum class Tag(val id: Int, val title: String) {
    Residence(10, "Резидентство, ВНЖ"),
    Transfer(20, "Трансфер в Черногорию"),
    TransportRoutes(30, "Маршруты"),
    Company(40, "Своя компания/фирма"),
    Estate(50, "Недвижимость"),
    Family(60, "Семья, дети"),
    Finance(70, "Деньги, переводы денег"),
    LifeStyle(80, "О жизни"),
    Pets(90, "Кошки, собаки, другие животные"),
}