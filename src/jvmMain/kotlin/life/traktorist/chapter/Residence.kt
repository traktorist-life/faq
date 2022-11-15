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


private val residencePermit = FaqItem(
    question = "Вид на жительство: общее",
    answer = listOf(
        "Граждане других государств могут получить ВНЖ Черногории (он называется боравак) на одном из оснований: как директор и при этом основной владелец фирмы, по недвижимости, по воссоединению, как работник по трудовому договору, как индивидуальный предприниматель... Срок действия ВНЖ - 1 год, с возможностью продления (пакет документов на получение и на продление несколько отличается). Все виды ВНЖ (кроме ВНЖ по фирме) требуют находиться на территории Черногории не менее 11 месяцев в году.".paragraph(),
        "Уточнение".header(),
        "Формально боравак - это не вид на жительство, это разрешение на временное пребывание, чем-то близкое по своей сути к визе. Из-за этой особенности вам не нужно отчитываться перед российскими органами (если есть гражданство РФ, конечно) о наличии ВНЖ другой страны, т.к. ВНЖ у вас и нет.".paragraph(),
        "Для простоты, в данном FAQ термин \"ВНЖ\" применяется в отношении боравака.".paragraph(),
        "Продление".header(),
        "По окончании срока выдачи боравака, его можно продлить по упрощённой процедуре. Для боравака сотрудника фирмы есть нюансы, см. в соответствующем вопросе.".paragraph(),
    ),
    listOf(Tag.Residence),
    null,
)

private val howToGetBoravak = FaqItem(
    question = "Как получить ВНЖ",
    answer = "Для получения ВНЖ, помимо основных критериев (фирма, недвижимость, etc) необходимо заполнить пакет документов, для разных видов ВНЖ он несколько отличается. Все документы заполняются на черногорском языке. Если вы не владеете им в достаточной мере, общая рекомендация - обратиться к фирмам, сопровождающим процесс получения ВНЖ.",
    listOf(Tag.Residence),
    listOf(Tag.Company, Tag.Estate),
)

private val boravakForFamily = FaqItem(
    question = "ВНЖ для всей семьи",
    answer = "Как правило, ВНЖ получает один из членов семьи, остальные получают его потом по воссоединению",
    Tag.Residence,
    Tag.Family,
)
private val boravakByDoo = FaqItem(
    question = "ВНЖ по фирме",
    answer = listOf(
        "Владелец и директор фирмы (обязательно в одном лице) имеет право подать документы на ВНЖ. Фирма к моменту подачи документов должна быть уже открыта, срок действия фирмы значения не имеет, подавайте хоть сразу как откроете. В отличие от остальных, такой вид ВНЖ не имеет требования к владельцу находиться на территории Черногории не менее 11 месяцев в году.".paragraph(),
        "Подготовить и подать документы на открытие фирмы и на ВНЖ можно самостоятельно, но вы должны хорошо владеть языком и знать что и как делать.".paragraph(),
        "В остальных случаях (и это самый частый вариант) имеет смысл пользоваться услугами фирм или бухгалтеров, которые помогут и подготовить документы и сопроводят на подачу документов. Стоимость таких услуг варьируется, но обычно это в районе 300 евро за фирму и 300 за ВНЖ, +/-.".paragraph(),
        "Обслуживание фирмы минимально стоит от 50 евро/мес за бухгалтера (можете и сами, но смотрите выше), и налогов с минимальной зп директора в районе 30 евро/мес (если фирма не ведёт деятельность, директора можно устроить на 1/4 ставки и сэкономить на налогах)".paragraph(),
        "Сроки".header(),
        "Если вы пользуетесь услугами бухгалтеров/фирм, то регистрация вашей фирмы займёт до 15 календарных дней, и после этого ещё до 30-40 дней на оформление ВНЖ.".paragraph(),
        "Гражданам РФ нельзя оплачивать уставный капитал/покупать фирму".header(),
        "С 18.03.2022 <a href='http://kremlin.ru/acts/news/68015'>указом президента РФ</a> введены ограничения на оплату долей в иностранных юрлицах резидентами РФ (т.е. всеми гражданами РФ, как минимум), т.е. на взнос в уставный капитал фирм и на покупку долей в фирмах. Теперь эти операции запрещены (допускаются только с разрешения ЦБРФ, но все всё понимают).".paragraph(),
        "Как и в случае с ограничением на покупку недвижимости, механизмов контроля этого указа нет, Черногория не раскрывает сведения о юрлицах на регулярной основе. Это не значит что о таком юрлице вообще невозможно ничего узнать - сам по себе реестр ЮЛ открыт и доступен на государственном сайте Черногории".paragraph(),
    ),
    listOf(Tag.Residence, Tag.Company),
    null,
)
private val boravakByEstate = FaqItem(
    question = "ВНЖ по недвижимости",
    answer = listOf(
        "Имея недвижимость в собственности, можно подать заявление на ВНЖ.".paragraph(),
        "Ограничение".header(),
        "По одной недвижимости можно получить максимум два ВНЖ, т.е. два владельца одной квартиры могут получить ВНЖ, владея половиной квартиры каждый - из личного опыта участников группы.".paragraph(),
    ),
    listOf(Tag.Residence),
    listOf(Tag.Estate, Tag.Family),
)
private val boravakByJob = FaqItem(
    question = "ВНЖ по трудоустройству в качестве наёмного работника",
    answer = listOf(
        "Наёмным работникам доступен ВНЖ при условии работы на черногорскую фирму, оформлением ВНЖ занимается сама фирма.".paragraph(),
        "Ограничение:".header(),
        "Такой ВНЖ можно продлить по упрощённой процедуре максимум 2 раза, далее надо будет подавать полный пакет документов уже на новый боравак. Из-за этого по ВНЖ работника невозможно в дальнейшем получить ПМЖ.".paragraph(),
    ),
    listOf(Tag.Residence),
    null,
)
private val spravkaNesudimost = FaqItem(
    question = "А что со справкой о несудимости",
    answer = listOf(
        "Много всего и сразу.".paragraph(),
        "1. Она обязательна, и нет, без неё не получится.".paragraph(),
        "2. Она должна быть в оригинале на бумаге с синей гербовой печатью МВД, распечатки не принимают.".paragraph(),
        "3. Апостиль для граждан РФ делать не надо (а вот для граждан Белоруссии - надо).".paragraph(),
        "4. Срок действия - 6 месяцев с даты подготовки справки (написана на справке).".paragraph(),
        "5. Язык - русский. Перевод на местный успешно делают в Черногории.".paragraph(),
        "Справку можно заказать на Госуслугах, делается она как повезёт - по отзывам от 2 дней и максимум до 30, причём чаще именно 30.".paragraph(),
        "Также есть отзыв, что удалось подать распечатку и предложить проверить электронную подпись в PDF-документе с Госуслуг. Но здесь всё на усмотрение принимающего и ваше красноречие.".paragraph(),
        "Получение по доверенности".header(),
        "Справку за вас могут заказать и получить в России другие люди. Подробнее смотрите на <a href='https://www.gosuslugi.ru/help/faq/criminal_certificate/100134'>Госуслугах</a>".paragraph(),
        "Получение через консульство".header(),
        "Справку можно заказать и забрать в консульстве РФ в соседних странах (из ближайших безвизов - Босния, Сербия), т.к. в Черногории консульство больше не принимает заявки, закрылось. Сейчас людей сильно больше, чем возможности консульств, и очереди бывают на несколько месяцев вперёд.".paragraph(),
        "До недавнего времени был вариант заказать справку в электронном виде на Госуслугах, а когда справка будет готова - сходить в консульство РФ и забрать. Но сейчас консульство от этой практики отказалось и справки таким образом не выдаёт.".paragraph(),
    ),
    listOf(Tag.Residence),
    null,
)

private val livingTime = FaqItem(
    question = "Надо ли жить в стране какое-то время, чтобы подать на ВНЖ",
    answer = "Нет, на ВНЖ можно подавать как только у вас появляется документ-основание и собран пакет документов.",
    Tag.Residence,
)
private val permanentResidence = FaqItem(
    question = "Постоянный вид на жительство (ПМЖ, стальный боравак)",
    answer = listOf(
        "Постоянный вид на жительство даёт ряд прав, в частности:".paragraph(),
        "- нахождение в стране без ежегодного продления права на пребывание".paragraph(),
        "- упрощенная регистрация автотранспорта".paragraph(),
        "- некоторые банки не оказывают услуги по ВНЖ, но оказывают по ПМЖ (есть и те, что вообще оказывают услуги только гражданам страны)".paragraph(),
        "Для получения ПМЖ необходимо соблюсти ряд требований, они практически соответствуют требованиям по ВНЖ, но есть и дополнительные.".paragraph(),
        "Дополнительные требования к заявителю".header(),
        "- прожить в стране 5 лет (находиться на территории страны 5 лет, в течение этого срока можно отсутствовать максимум 10 месяцев, но не более 6 месяцев подряд)".paragraph(),
        "- не иметь перерывов в продлении ВНЖ (т.е. ВНЖ должен обновляться <b>только</b> по процедуре продления)".paragraph(),
    ),
    listOf(Tag.Residence),
    null
)
private val moneyForBoravak = FaqItem(
    question = "Сумма на счету для оформления ВНЖ",
    answer = listOf(
        "Один из обязательных документов в пакете на ВНЖ - справка из банка о наличии необходимой суммы на счёте.".paragraph(),
        "Справка должна быть сделана в тот же день, когда подаются документы, деньги на счёт надо положить хотя бы за день до этого.".paragraph(),
        "После подачи документов деньги со счёта можно снять хоть полностью.".paragraph()
    ),
    listOf(Tag.Residence),
    null,
)
private val childrenBoravak = FaqItem(
    question = "ВНЖ для детей",
    answer = listOf(
        "Для оформления ВНЖ детям необходимо нотариальное согласие супруга.".paragraph(),
    ),
    listOf(Tag.Residence),
    listOf(Tag.Family),
)


val residence = listOf(
    residencePermit,
    howToGetBoravak,
    boravakForFamily,
    boravakByDoo,
    boravakByJob,
    boravakByEstate,
    spravkaNesudimost,
    livingTime,
    permanentResidence,
    moneyForBoravak,
    childrenBoravak,
)