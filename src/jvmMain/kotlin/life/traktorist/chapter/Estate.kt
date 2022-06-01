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
import life.traktorist.api.dto.header
import life.traktorist.api.dto.paragraph


private val buy = FaqItem(
    question = "Как купить недвижимость",
    answer = listOf(
        "Сайтов с актуальными предложениями нет, картинки и цены на сайтах в интернете - только картинки и цифры. Ситуация осложняется тем, что в стране много нелегального самостроя. Легализовать его можно, но часто это довольно ощутимые расходы".paragraph(),
        "Учитывая вышесказанное, на рынке недвижимости работают риэлторы, которые могут вам подобрать варианты, показать (в том числе через интернет, и с видео), и помогут в сопровождении сделки. Риэлторам платит продавец, вы как покупатель платите только за недвижимость. Риэлторы есть русскоязычные и местные.".paragraph(),
        "Сделки оформляются через нотариуса. Оплачивать можно и наличными и на счёт, это по договорённости сторон.".paragraph(),
        "Цена квадратного метра очень зависит от города, места, площади, возраста дома, утепления, обстановки и ещё кучи факторов. Юг самый дорогой, чем дальше на север, тем дешевле.".paragraph(),
        "Покупка резидентами РФ запрещена указом президента".header(),//TODO ссылка на вопрос о резидентстве
        "Формально это называется \"ограничена\", но разрешение на сделку надо получать у правительственной комиссии, что в данном случае равно запрету.".paragraph(),
        "Согласно <a href='https://www.garant.ru/hotlaw/federal/1530115/'>указу президента РФ 81 от 01.03.2022</a> сделки резидентов РФ по покупке недвижимости у нерезидентов теперь делать нельзя (Черногория находится в списке недружественных стран). Механизма информирования контролирующих органов РФ о таких сделках нет, но от этого покупка не перестаёт быть нарушением указа.".paragraph(),
        "Небольшое исключение".header(),
        "По разъяснениям ЦБ, резиденты РФ могут покупать недвижимость при выполнении обоих следующих условий:".paragraph(),
        "- оплата производится со своего зарубежного счёта".paragraph(),
        "- об этом зарубежном счёте ФНС РФ была проинформирована до 1 марта 2022г в соответствии с действующим порядком".paragraph(),
        "Что будет при нарушении указа".header(),
        "Санкции при нарушении в указе не прописаны, но учитывая тематику указа, это деяние может трактоваться как нарушение валютного законодательства, что влечёт наложение штрафа в размере до 75% до 100% от суммы сделки.".paragraph(),
    ),
    listOf(Tag.Estate),
    null
)


val estate = listOf(
    buy,
)