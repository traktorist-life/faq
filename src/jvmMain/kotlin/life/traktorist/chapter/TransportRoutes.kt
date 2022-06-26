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

@file:Suppress("MaxLineLength")

package life.traktorist.chapter

import life.traktorist.api.dto.FaqItem
import life.traktorist.api.dto.Tag
import life.traktorist.api.dto.header
import life.traktorist.api.dto.paragraph


private val georgia = FaqItem(
    question = "На машине через Грузию",
    answer = listOf(
        "Отзыв <a href='https://t.me/nasnedogonyt'>в группе</a>".paragraph(),
        "По России".header(),
        "По платке от Москвы трасса дон м-4, а далее трасса Кавказ.".paragraph(),
        "Грузия".header(),
        "Одна дорога до Батуми, она начинается не доезжая Тбилиси, на нее сразу можно попасть с Военно-грузинской дороги.".paragraph(),
        "Турция".header(),
        "От города Сарпи, что на границе с Грузией, по дороге вдоль черного моря до города Самсун, от Самсуна до Стамбула. Здесь можно как по платке, так и по обычным дорогам. От Стамбула до границы с Болгарией пропускной пункт капитан-андреево.".paragraph(),
        "Болгария".header(),
        "От пункта пропуска с Турцией до Софии, около Софии нужно уходить на город Калотина, там есть пропускной пункт Калотина с границей Сербии.".paragraph(),
        "Сербия".header(),
        "От границы ехали до города Ниш по платке. От города Ниш шли до города Ужице, прямой дороги до него нет. Навигатор строит много вариантов, причем стоит только не туда повернуть, как он перестраивает маршрут. От города Ужице до погранперехода бело поле.".paragraph(),
    ),
    listOf(Tag.TransportRoutes),
    null
)

private val europe = FaqItem(
    question = "На машине по Европе",
    answer = listOf(
        "Отзыв <a href='https://t.me/nasnedogonyt'>в группе</a>".paragraph(),
        "Всем доброе утро. Хотела написать огромное спасибо группе за существование и подсказки! Мой отчёт о переезде из России в ЕС.".paragraph(),
        "14 мая выехали из Москвы в Черногорию.".paragraph(),
        "Маршрут - Москва-Беларусь (кпп Каменный Лог)-Литва-Польша-Словакия-Венгрия-Сербия-Черногория.".paragraph(),
        "Документы - виза шенген С, диагностическая карта на машину, Грин карта на машину.".paragraph(),
        "Машина - номера РФ.".paragraph(),
        "Выезд из Беларуси - не спрашивают абсолютно ничего, проверка паспорта и все. Ни одного вопроса, беглый взгляд внутрь машины.".paragraph(),
        "Обратите внимание - перед въездом на КПП на кругу надо повернуть направо, проехать дальше мимо стоящих фур на электронную регистрацию. Указателя прямого нет, пока не проедешь фуры, есть плакат про въезд на сервисную зону. Это оно. Там есть зона с площадкой под шлагбаумом с камерой. Нужно на неё въехать и там постоять минуту, пока на табло не отразится номер вашей Машины. Затем обратно на КПП.".paragraph(),
        "Оплата за выезд из Беларуси в окошке банка на КПП. Там медленный принтер, печатающий километры бумаги, и оттого очередь долгая. Оплата возможна картой МИР.".paragraph(),
        "Въезд в Литву - вопрос мимоходом - а куда едете? Ответ - в Черногорию. - Далековато! - у нас там квартира. - А документы есть? - есть.".paragraph(),
        "Показать не просили. Ответить можно было и что-то другое - туризм, кто-то говорил - еду в Германию и т.д.  Лишних вопросов не задают. Диагностическую карту смотрят. Машину проверяли поверхностно. Открыли пару чемоданов, беглый взгляд на вещи сверху и все. Машина была забита вещами, по чемоданам распиханы кучи БАДов, обычных лекарств. Везли с собой евро, но это вообще никому не интересно.".paragraph(),
        "При переезде через другие страны ЕС никого на границах нет.".paragraph(),
        "В Польше два раза остановила полиция. Первый раз долго проверяли документы на водителя. Взяли только его паспорт, права и документы на машину. Через 10 мин все отдали и пожелали счастливого пути. Никаких вопросов.".paragraph(),
        "Второй раз проверили оба паспорта и по-русски сказали - до свидания.".paragraph(),
        "Все с улыбками, абсолютная доброжелательность.".paragraph(),
        "Не увидели ни одного косого взгляда. На заправках все прекрасно. НИЧЕГО!! Все спокойно и как в прежние времена!".paragraph(),
        "Граница Венгрия-Сербия - ВООБЩЕ ни одного вопроса ни с какой стороны. Улыбки, извинения за минутную задержку (в Венгрии влез без очереди какой-то дипломат) и все.".paragraph(),
        "Никаких досмотров машин нигде.".paragraph(),
        "Вывод - боялись и готовились основательно. Но в итоге никаких проблем нигде нет.".paragraph(),
    ),
    listOf(Tag.TransportRoutes),
    null
)

private val routeGeorgia = FaqItem(
    question = "На машине через Грузию, Турцию, Болгарию, Сербию",
    answer = listOf(
        "Отзыв <a href='https://t.me/nasnedogonyt/66502'>в группе</a>. Орфография сохранена".paragraph(),
        "Здравствуйте!".paragraph(),
        "И так расскажу как мы, это пара с 2 кошками, добрались до Черногории на машине если кому интересно. Наш маршрут был через такие страны как Грузия, Турция, Болгария, Сербия и конечный пункт Черногория. Для пересечения сухопутной границы РФ независимо где ты ее пересекаешь нужны основания, это уже все и так знают.".paragraph(),
        "Почему именно такой маршрут?".header(),
        "На этом маршруте всего одна страна для которой нужна виза. Это Болгария. Получить болгарскую визу проще и быстрее, нежели Шенген. Мы кстати взяли мульти визу болгарскую. В чем плюсы? Даётся она на один год, так же с ней можно посетить Хорватию, Кипр, Румынию.".paragraph(),
        "Про дороги непосредственно.".header(),
        "Весь путь составил порядка 5100км. Военно-грузинская дорога в целом не плохая с хорошим покрытием, но в самих горах есть участки с разбитым покрытием, после спуска с перевала дорога до Батуми это автострада в 4 полосы по которой можно ехать 120км/ч. Но есть участки с объездами, как я понял эта дорога ещё не полностью введена в строй, и есть участки где ее достраивают, точнее прорубают тоннели.".paragraph(),
        "Далее Турция.".header(),
        "Здесь вообще все шикарно! И обычные дороги, которые кстати 4 полосные с отличным покрытием и проходят в большинстве случаев вблизи населенных пунктов. Про платные дороги молчу, по 3 полосы в каждую сторону. Про оплату дорог в Турции идете в любое отделение почты у них она называется PTT  и оформляете карту HGS. Наклеиваете стикер HGS на лобовое стекло и спокойно проезжаете по платным дорогам Турции.".paragraph(),
        "Болгария.".header(),
        "Здесь все проще заезжаете после прохождения границы на первую попавшуюся АЗС, кстати первая АЗС это ЛУКОЙЛ. Подходите к продавцу и просите оформить виньетку. Это обязательно! Есть терминалы на АЗС, но карты российские не принимаются, поэтому только за нал. Кстати в Болгарии спокойно принимают оплату в евро. Так можно не менять на границе евро на их валюту лев. Дорога от границы Турции и Болгарии это автострада с 2 полосами в каждую сторону. Болгарию мы пролетели быстро. Но, сейчас ведутся ремонтные работы как после турецкой границы, так и у границы с Сербией. У границы с Сербией участок в км 20.".paragraph(),
        "Сербия.".header(),
        "После границы с Болгарией до города Ниш идёт отличная платная дорога. Оплата здесь все по старинке. На пунктах, правда есть нюансы. При въезде на платку вы берете талончик, а при выезде по этому талончику производите оплату. От города Ниш мы поехали обычными дорогами, тоже местами ведутся дорожные работы. Местные дороги в большинстве с хорошим покрытием, но очень много поворотов, и ограничение в населенных пунктах не более 50км/ч. В принципе дороги Черногории такие же все вертлявые спуски, подъемы, повороты. Но сами дороги лучше, судя по покрытию, многие были сделаны не так давно.".paragraph(),
        "Что касается денег.".header(),
        "В Грузии принимают только лари. В Турции для оплаты принимаются только лиры, кстати карты мир работают только для снятия наличных, не раз пробовал расплатиться в магазинах, не получалось, писали отказ. В Болгарии принимают и евро и их валюту Лев. В Сербии по-разному. На востоке в основном принимают их валюту динар, на западе же и динар и евро. Кстати обменников в Сербии во многих крупных городах много, так что спокойно доллары, евро можно обменять. Можно кстати и доллары на евро поменять. Средний курс 1$-0.92€.".paragraph(),
        "Продолжение <a href='https://t.me/nasnedogonyt/66519'>в группе</a>".paragraph(),
        "Мы ехали с 2 кошками останавливались с помощью сайта Booking. Отели Grand Atakum это около города Самсун. Город Самсун это как раз полпути пересечения Турции. А вообще не переживайте по поводу отелей смотрите на Booking оптимальный вариант. Турция довольно спокойна страна, особенно в регионах. Что касается Болгарии как я написал выше в своем посту, ее прилетите за один день. Ее протяженность с востока на запад всего 400км. Проехав границу с Турцией в 10часов утра, мы к восьми вечера уже были в городе Ниш, Сербия.".paragraph(),
        "Продолжение <a href='https://t.me/nasnedogonyt/66520'>в группе</a>".paragraph(),
        "По воду Болгарии. От границы с Турцией до города София идёт автострада, она идёт мимо всех городов, до Софии долетите без проблем, почти на одном дыхании. Перед Софией есть объездная можно уйти на нее а с ней дорогу на границу с Сербией, или уйти на эту дорогу через город. Перед границей с Сербией ведутся дорожные работы, км 20. Но по времени в принципе быстро. В Сербии до города Ниш платная хорошая дорога.Да советую заночевать перед болгарской границей, а потом уже в Сербии. Отдельно про Сербию. Не старайтесь ее проехать за один день. Сербия имеет много местных дорог, они хоть и с хорошим покрытием, но на них много поворотов и спусков. С не привычки просто устаните. В Черногории дороги тоже такие же. Советую заночевать вблизи с Черногорской границей.Ещё все же хочу сказать подробнее про дороги Сербии и Черногории. Дороги у них хорошие. Мы ехали по Гугл навигатору, он спокойно может завести вас в такие е...ня, он строит короткий маршрут который порой проходит через населенные пункты, в которых узкие дороги и много поворотов и спусков. Ограничение скорости в населенных пунктах 50км/ч, при этом превышение скорости даже на 1 км, может быть поводом чтобы выписать вам штраф. Камер на дорогах практически нет, есть но мало. Полицейские стоят обычно на дорогах и останавливают. Меня не останавливали за превышение, все же старался придерживаться скоростного режима. Но из разговоров с местными процедура геморная. У вас изымают права, и отдают только после оплаты штрафа. А это нужно ехать либо в отделение банка, потом в отделение полиции. Штрафы от 20евро. Не смотрите больно-то на местных которые гоняют.По России по платке от мск трасса дон м-4, а далее трасса Кавказ. Грузия одна дорога до Батуми, она начинается не доезжая Тбилиси, на нее сразу можно попасть с Военно-грузинской дороги. Турция. От города Сарпи, что на границе с Грузией , по дороге вдоль черного моря до города Самсун, от Самсуна до Стамбула. Здесь можно как по платке, так и по обычным дорогам. От Стамбула до границы с Болгарией пропускной пункт капитан-андреево. От него по Болгарии до Софии, около Софии нужно уходить на город Калотина, там есть пропускной пункт Калотина с границей Сербии. Здесь от границы ехали до города Ниш по платке. От города Ниш шли до города Ужице, прямой дороги до него нет. Навигатор строит много вариантов, причем стоит только не туда повернуть, как он перестраивает маршрут. От города Ужице до погранперехода бело поле. Дорог в Сербии много, дорожное покрытие хорошее. Но многие они через населенные пункты.".paragraph(),
    ),
    listOf(Tag.TransportRoutes),
    null
)


val transportRoutes = listOf(
    georgia,
    europe,
    routeGeorgia,
)