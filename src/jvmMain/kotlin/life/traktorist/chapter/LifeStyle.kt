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


private val internet = FaqItem(
    question = "Какой интернет и сколько он стоит",
    answer = listOf(
        "Ответ на примере Будвы, в других городах могут быть вариации.".paragraph(),
        "Проводной".header(),
        "Провайдеров мало, местечковые вообще не встречаются. Если вы снимаете квартиру, то там уже что есть, то и будет. Максимум получится договориться с хозяином (и то только на смену тарифа, если в доме нет оптики). Для нового подключения понадобится ВНЖ.".paragraph(),
        "Каналы асинхронные, upload обычно в 10 раз ниже чем download. Чаще всего это adsl (8мбит download/2 upload у провайдера t-com, например). Но во многих новых домах уже заведена оптика. Скорость оптики зависит от тарифа, например у провайдера mtel предлагается от 40мбит до 200. Оптика тоже асинхронная, то есть это будет от 40/4 до 200/20.".paragraph(),
        "Если нужен ещё и мобильный телефон, то брать пакетным предложением с мобилкой выгоднее.".paragraph(),
        "Мобильный".header(),
        "Провайдеры те же, что для проводного. При отсутствии ВНЖ можно купить предоплаченные туристические тарифы с интернетом, а с ВНЖ доступны постоплатные с разными пакетами минут/интернета.".paragraph(),
        "Приём стабильный, скорость интернета хорошая, но в сильный дождь могут быть проблемы.".paragraph(),
        "Лимиты на скачивание".header(),
        "Проводной интернет безлимитный, на мобильных тарифах лимиты есть. Туристические пакеты часто подпадают под разные акции. Например, к вашему пакету на 50ГБ могут разово накинуть 512ГБ на месяц, если будет такая акция (акции бывают разные, эта приведена только как пример).".paragraph(),
        "Стоимость".header(),
        "Сильно зависит от выбранного тарифа/пакета. Проводной интернет в среднем от 20-25 евро в месяц, мобильный от 10-15 евро в месяц, пакеты проводной+мобильный+телевидение+домашний телефон - от 30 евро в месяц. Можно посмотреть тарифы на сайтах mtel.me и telekom.me.".paragraph(),
        "Для скайпа хватит?".header(),
        "Любого стабильного интернета хватит, и проводного (даже с невысокой скоростью), и мобильного.".paragraph()
    ),
    listOf(Tag.LifeStyle),
    null
)
private val touristsCount = FaqItem(
    question = "Много ли туристов",
    answer = listOf(
        "Страна туристическая, это означает что не в сезон туристов почти нет, а в сезон их много.".paragraph(),
        "Официально сезон с 15 мая по 15 сентября, но туристический пик идёт летом.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    null
)
private val relationToRussians = FaqItem(
    question = "Отношение к русским, украинцам, белорусам",
    answer = listOf(
        "Отношение у местных хорошее, происходящие события не привели к изменению отношения.".paragraph(),
        "Есть отзывы о разовых случаях конфликтов, но неясно был ли это конфликт с местными, и уж точно это нельзя назвать правилом.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    null
)
private val workSearch = FaqItem(
    question = "Реально ли найти работу",
    answer = listOf(
        "Работу по найму в сфере туризма найти сложно: во-первых это сильно сезонный вариант, и во-вторых, нужен язык и чаще берут местных/знакомых/просто своих.".paragraph(),
        "Работа бывает в русскоязычном и нетуристическом инженерном секторе (в той части, где он есть). Например, учителями в школах, в институтах, ремонт/обслуживание авто в сервисах.".paragraph(),
        "Основной поток приезжающих для жизни работает на себя (локальный бизнес, удалёнка в т.ч. на Европу).".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    null
)
private val winterHeating = FaqItem(
    question = "Отопление в зимний сезон",
    answer = listOf(
        "Центрального отопления нет. Учитывая, что температура довольно редко опускается ниже нуля, отопление используют время от времени.".paragraph(),
        "Печное отопление встречается, дровами топить дешевле всего. Из электрических видов самый эффективный это кондиционер, а различные виды обогревателей в работе обойдутся дороже всего.".paragraph(),
        "Если топить не дровами, то зимние счета за электричество ограничены только вашими потребностями в тепле. От 0 (если не греться) до 300+ евро в месяц если обогреватели/кондиционеры и тёплые полы использовать круглосуточно. Средневзвешенный счёт 60-80 евро.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    null
)
private val shengenVisaApplication = FaqItem(
    question = "Можно ли сделать шенген в Черногории",
    answer = listOf(
        "Да, можно подать документы на шенген, но только если у вас есть ВНЖ Черногории.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    listOf(Tag.Residence)
)
private val mobileSim = FaqItem(
    question = "Можно ли купить sim-карту нерезиденту",
    answer = listOf(
        "Можно. Для нерезидентов тарифы ограничены, в основном доступны лишь туристические.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    null
)
private val lifeCost = FaqItem(
    question = "Стоимость жизни",
    answer = listOf(
        "Продукты питания".header(),
        "Стоимость продуктов питания до февраля была сравнима с российскими магазинами среднего класса, но с пересчётом в евро по курсу 80р. Т.е. если условные яблоки стоили 60 рублей за килограмм, то в Черногории они стоят 75 евроцентов за кило. Есть и дороже и дешевле, конечно, но в среднем можно прикинуть.".paragraph(),
        "Существенно дороже (в районе +20% - +30%) разве что молочная продукция, справедливости ради стоит отметить что она вкуснее. Даже обычное свежее молоко небольшого срока хранения отличается по вкусу в положительную сторону (в сравнении с обычным ассортиментом московских магазинов). Также дешевле локальные и сезонные продукты.".paragraph(),
        "Некоторые продукты только сезонные. Например, свежую зелень типа петрушки/укропа найти в зимний период в супермаркетах вам будет довольно сложно, смотрите на рынках.".paragraph(),
        "Некоторые продукты отсутствуют. Например, самый обычный рассыпной чёрный и зелёный чай в фабричных коробках в  супермаркетах отсутствует. Чай продаётся только в пакетиках, наряду с пакетиками ромашки, ройбуша, каркаде и ещё всяких трав, которые в России продаются в аптеке. Есть редкие чайные магазины, но цена в них (в районе 5-20 евро в Будве за 100 граммов чая, 2-15 евро в Подгорице) делает этот продукт элитным.".paragraph(),
        "Рестораны".header(),
        "Самый отличительный пункт местных ресторанов - огромные порции. Если вы в России заказывали салат и второе, и было в норму по сытости, то в Черногории так делать не стоит, т.к. высока вероятность что даже одно второе блюдо вы не сможете съесть.".paragraph(),
        "Ценник сильно зависит от расположения и степени пафоса, особенно в прибрежных городах.".paragraph(),
        "Одно и то же блюдо в ресторане на пляже может стоить в 2 раза выше, чем 100 метрах глубже в город. Блюдо с курицей на второе стоит в районе 6-9 евро, с мясом 8-15 евро (обычное, не мраморный стейк).".paragraph(),
        "Рыбные рестораны есть, но их существенно меньше, чем мясных. Несмотря на то, что страна прибрежная, мясо в Черногории уважают больше, чем рыбу и морепродукты.".paragraph(),
        "Довольно много фастфуда, причём локального, а Макдоналдс, KFC, BurgerKing вы не встретите. Есть пицца, бургеры, мясо в пите, всевозможные виды мяса на гриле. По порциям аналогично, бургер будет граммов на 300, с большим курсом мяса или котлетой. Стоимость 2,5-4евро в среднем за бургеры/мясо в пите.".paragraph(),
        "Техника".header(),
        "В столице компьютерная техника примерно на 50% дороже, чем в интернет-магазине computer universe. В Будве - уже в два раза (при том что билет автобус Будва-Подгорица 6 евро в одну сторону).".paragraph(),
        "В текущей ситуации прыгающего курса евро в РФ, цены в Подгорице нередко даже ниже чем в РФ.".paragraph(),
        "Плюс, если вы оплачиваете наличными, некоторые магазины готовы предоставить вам неплохую скидку.".paragraph(),
        "Доставка с AliExpress в Черногорию большинством продавцов предоставляется только DHL/Fedex, что прибавит к вашему заказу ещё 50-130 евро сверху чисто на доставку.".paragraph(),
    ),
    listOf(Tag.LifeStyle),
    listOf(Tag.Finance)
)


val lifeStyle = listOf(
    internet,
    mobileSim,
    touristsCount,
    relationToRussians,
    workSearch,
    winterHeating,
    shengenVisaApplication,
    lifeCost,
)