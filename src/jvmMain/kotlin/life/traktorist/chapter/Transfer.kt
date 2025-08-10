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


private val optionsToArrive = FaqItem(
    question = "Как добраться",
    answer = "Самые популярные варианты - по суше и по воздуху. Экзотический вариант морем тоже возможен.",
    Tag.Transfer,
)

private val directAvia = FaqItem(
    question = "Есть ли прямой авиарейс",
    answer = "Прямого авиасообщения между Россией и Черногорией нет с 2020 года (не восстановлено после Covid-19)",
    Tag.Transfer,
)

private val nonVisaAvia = FaqItem(
    question = "Авиарейсы без визы",
    answer = "Наиболее популярные безвизовые рейсы это Москва-Белград-Подгорица (AirSerbia) и Москва-Стамбул-Подгорица (TurkishAirlines). Возможны рейсы не в Подгорицу, а в Тиват, но менее популярны т.к. как часто они дороже.",
    Tag.Transfer,
)
private val availableAvia = FaqItem(
    question = "Что вообще летает",
    answer = "Сейчас немного. AirSerbia и TurkishAirlines с одной пересадкой без виз. Также есть варианты с 2 и более пересадками, билеты лучше смотреть на агрегаторах",
    Tag.Transfer,
)
private val touristRegister = FaqItem(
    question = "Регистрация по приезду",
    answer = listOf(
        "Если у вас есть ВНЖ, вам написанное далее НЕ актуально.".paragraph(),
        "Если к вам в вашу недвижимость приехали родственники, их тоже надо регистрировать. При этом если у родственников фамилия совпадает с вашей, то регистрация бесплатна. Если фамилия другая, то регистрация уже на общих основаниях (хотя всегда можно попробовать объяснить про родственника, если у вас есть знание языка).".paragraph(),
        "Для Украины вам лучше сразу к инспектору по иностранцам. Если не можете сразу к нему, регистрируйтесь в ТУРБЮРО в городе где вы остановились. За вас платит тот, кто вас размещает.".paragraph(),
        "Для РФ и других стран кроме Украины - ваша обязанность регистрации подразумевает оплату туристического налога в размере 1 евро в день со взрослого, для подростков 12-17 лет 0,5 евро в день, для детей бесплатно. Но всем нужна регистрация. И детям тоже! Регистрация осуществляется в Турбюро, они есть во многих городах".paragraph(),
        "Игнорирование повлечет штрафы и даже запрет на въезд в Черногорию. Уже несколько лет у полиции и пограничников одна база, не верьте тем, кто вам скажет, что регистрация не обязательна или что на границе можно договориться.".paragraph(),
        "Штраф за явку с повинной к инспектору за небольшую просрочку (несколько дней) 40 евро с человека (подростки тоже 40 евро, дети скорее всего тоже).".paragraph(),
        "Если вас на границе обнаружат незарегистрированным, это 160-200 евро с лица, обратно могут не пустить. Уже было немало прецедентов, хватит хитрить. Это всегда выходит боком. Водителю, который на границу привез нелегалов, тоже прилетает.".paragraph(),
        "Для регистрации нужны паспорта всех прибывших, хозяин жилья, где вы поселились и его доказательство владения этим жильем (хозяина можно заменить листом непокретности (распечатка о свидетельстве на собственность) или даже адресом недвижимости, если хозяин сдаёт постоянно и от того он уже есть в базе Турбюро). +Деньги на тур.налог.".paragraph(),
        "Отели и хостелы регистрируют вас по базе сами, но ровно на срок вашего у них пребывания. Выехали из отеля - и снова на регистрацию.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val sputnikAcceptance = FaqItem(
    question = "Вакцина или ПЦР для въезда",
    answer = listOf(
        "Вакцинацию не спрашивают, ношение масок не требуется.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val belgradeTransfer = FaqItem(
    question = "Трансфер/поездка в Белград",
    answer = listOf(
        "Актуальный список требований можно посмотреть <a href='https://www.mfa.gov.rs/en/citizens/travel-serbia'>тут</a>.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val belgradeTransferOneHour = FaqItem(
    question = "Реально ли успеть на стыковку 1 час или даже 55 минут в Белграде",
    answer = listOf(
        "Много стыковочных рейсов AirSerbia идут с такой стыковкой, есть и в Тиват и в Подгорицу.".paragraph(),
        "Аэропорт в Белграде маленький, переход между гейтами от 2 до 8 минут, пересадка вполне нормальная. Даже успеете посидеть подождать открытия ворот.".paragraph(),
        "Главное берите такую стыковку одним билетом, чтобы не получать багаж и не проходить повторную регистрацию в Белграде.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val carTransfer = FaqItem(
    question = "Из России на автомобиле через Европу",
    answer = listOf(
        "Чтобы проехать нужна шенгенская виза и основание проезда через Европу.".paragraph(),
        "Многие европейские страны перестали пускать автомобили без основания проезда, даже транзитом, а туризма списке разрешённых оснований нет. Ситуация постоянно усложняется, возможности проезда лучше уточнять в профильных группах.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val trainTransfer = FaqItem(
    question = "Из России на поезде",
    answer = listOf(
        "Всё аналогично автомобилю.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val visaRun = FaqItem(
    question = "Визаран (visarun)",
    answer = listOf(
        "Визаран требуется, если у вас нет основания пребывания в стране более определённого количества времени. В частности, если вы приехали и не получали ВНЖ, то максимальный срок пребывания в Черногории для граждан РФ - 30 дней. По истечении это срока достаточно выехать из страны и вернуться этим же днём, чтобы срок пребывания начал идти сначала.".paragraph(),
        "Чаще всего для визарана выбирается Босния и Герцеговина (как более близкая безвизовая страна). До 2023 года в летний период также была доступна Албания, то сейчас для россиян она требует визу.".paragraph(),
        "Надо ли детям".header(),
        "Визовый режим должны соблюдать все, поэтому визаран необходим и детям.".paragraph(),
        "Можно ли самому не ехать, а дать покататься паспорту".header(),
        "Нет, пересечение границы только лично с документом. Детям - точно также.".paragraph(),
        "Но у меня соседи так паспорт катали и всё хорошо".header(),
        "Это незаконно и периодически в новостях проходят случаи пойманных водителей с паспортами. Нередко это приводит к депортации владельцев паспортов.".paragraph(),
    ),
    listOf(Tag.Transfer),
    listOf(Tag.Residence)
)
private val airSerbiaTicketTransfer = FaqItem(
    question = "Замена пассажира в билете/переоформление билета AirSerbia или Turkish Airlines",
    answer = listOf(
        "Обе авиакомпании не позволяют поменять ФИО в билете (вообще, даже в офисе), как и не позволяют заменить пассажира.".paragraph(),
        "Если вы не будете использовать билет, то его можно либо сдать, либо перенести дату, если ваш билет допускает такие действия. Уточнять возможность и делать это необходимо в самой авиакомпании (позвонить/приехать в офис).".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val lowcosterPayment = FaqItem(
    question = "Оплата билетов зарубежных лоукостеров",
    answer = listOf(
        "Такие билеты, как правило, невозможно купить у агрегаторов (у российских агрегаторов оплата российскими картами возможна).".paragraph(),
        "Оплата на зарубежных сайтах российскими картами недоступна (если это не карты МИР, конечно, но таких сайтов крайне мало), поэтому билеты лоукостеров можно оплатить с зарубежной карты, а если у вас такой нет - попросить знакомых/друзей, у которых карта есть.".paragraph(),
    ),
    listOf(Tag.Transfer),
    listOf(Tag.Finance)
)
private val bookingOnCustoms = FaqItem(
    question = "Проверяют ли на таможне бронь жилья при въезде",
    answer = listOf(
        "Не проверяют и не спрашивают.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)
private val customsDevicesCheck = FaqItem(
    question = "Я везу с собой два фотоаппарата, монитор и ноут, пару системных блоков и планшет. Будут ди проблемы на таможне? Пошлина? Растаможка?",
    answer = listOf(
        "Нет, если это ваши личные вещи, на которых видны следы эксплуатации.".paragraph(),
    ),
    listOf(Tag.Transfer),
    null
)

val transfer = listOf(
    optionsToArrive,
    directAvia,
    nonVisaAvia,
    availableAvia,
    touristRegister,
    sputnikAcceptance,
    belgradeTransfer,
    belgradeTransferOneHour,
    carTransfer,
    trainTransfer,
    visaRun,
    airSerbiaTicketTransfer,
    lowcosterPayment,
    bookingOnCustoms,
    customsDevicesCheck,
)