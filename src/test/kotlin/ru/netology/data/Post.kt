package ru.netology.data

data class Post(
    val id: Int, //идентификатор записи.

    val ownerId: Int,//идентификатор владельца стены, на которой размещена запись.

    val fromId: Int, //идентификатор автора записи (от чьего имени опубликована запись).

    val createdBy: Int,/*//идентификатор администратора,
    // который опубликовал запись
    // (возвращается только для сообществ при запросе с ключом доступа администратора).
    // Возвращается в записях, опубликованных менее 24 часов назад.*/

    val data: Int, //время публикации записи в формате unixtime.

    var text: String, //текст записи.

    val replyOwnerId: Int, //идентификатор владельца записи, в ответ на которую была оставлена текущая.

    val replyPostId: Int, //идентификатор записи, в ответ на которую была оставлена текущая.

    val friendsOnly: Boolean, // true если запись была создана с опцией «Только для друзей».

    val countComment: Int, // количество комментариев
    val canPostComment: Boolean, //информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPostComment: Boolean,// информация о том, могут ли сообщества комментировать запись
    val canCloseComment: Boolean,//может ли текущий пользователь закрыть комментарии к записи
    val canOpenComment: Boolean,// может ли текущий пользователь открыть комментарии к записи

    //copyright: Object,
    val idCopyright: Int,
    val linkCopyright: String,
    val nameCopyright: String,
    val typeCopyright: String,

    //Likes: Object,
    val countLikes: Int = 0, //число пользователей, которым понравилась запись;
    val userLikes: Boolean,//наличие отметки «Мне нравится» от текущего пользователя
    val canLikes: Boolean,/*//информация о том, может ли текущий пользователь
    // поставить отметку «Мне нравится»*/
    val canPublishLikes: Boolean,//информация о том, может ли текущий пользователь сделать репост записи

    //Reposts: Object,
    val countReposts: Int, // число пользователей, скопировавших запись;
    val userRepostedReposts: Boolean,//наличие репоста от текущего пользователя

    //Views: Object//
    val countViews: Int, // число просмотров записи.

    val postType: String, /*тип записи, может принимать следующие значения:
     post, copy, reply, postpone, suggest.*/

    // postSource: Object//
    val typePostSource: String, /*тип источника. Возможные значения:
vk — запись создана через основной интерфейс сайта (http://vk.com/);
widget — запись создана через виджет на стороннем сайте;
api — запись создана приложением через API;
rss— запись создана посредством импорта RSS-ленты со стороннего сайта;
sms — запись создана посредством отправки SMS-сообщения на специальный номер.*/
    val platformPostSource: String, /*название платформы, если оно доступно. Возможные значения:
android;
iphone;
wphone.*/
    val dataPostSource: String,  /*тип действия (только для type = vk или widget). Возможные значения:
 profile_activity — изменение статуса под именем пользователя (для type = vk);
 profile_photo — изменение профильной фотографии пользователя (для type = vk);
 comments — виджет комментариев (для type = widget);
 like — виджет «Мне нравится» (для type = widget);
 poll — виджет опросов (для type = widget);*/
    val urlPstSource: String, // URL ресурса, с которого была опубликована запись.

    //geo: Object//
    val typeGeo: String, // тип места;
    val coordinatesGeo: String, // координаты места;
    //geo/place: Object//
    val idGeoPlace: Int, //идентификатор места
    val titleGeoPlace: String, //название места
    val latitudeGeoPlace: Int, // географическая широта, заданная в градусах (от -90 до 90).
    val longitudeGeoPlace: Int, // географическая широта, заданная в градусах (от -90 до 90).
    val createdGeoPlace: Int, // дата создания места в Unixtime.
    val iconGeoPlace: String, // иконка места, URL изображения.
    val checkinsGeoPlace: Int, // число отметок в этом месте.
    val updatedGeoPlace: Int, // дата обновления места в Unixtime.
    val typeGeoPlace: Int, //тип места
    val countryGeoPlace: Int, // идентификатор страны.
    val cityGeoPlace: Int, // идентификатор города.
    val addressGeoPlace: String, // адрес места.

    val copy_history: Array<Post>, /* массив, содержащий историю репостов для записи.
    Возвращается только в том случае, если запись является репостом.
    Каждый из объектов массива, в свою очередь, является объектом-записью стандартного формата.*/

    val signerId: Int, /*идентификатор автора, если запись была опубликована
     от имени сообщества и подписана пользователем*/

    val canPin: Boolean, // информация о том, может ли текущий пользователь закрепить запись

    val canDelete: Boolean, //информация о том, может ли текущий пользователь удалить запись

    val canEdit: Boolean, //информация о том, может ли текущий пользователь редактировать запись

    val isPinned: Boolean, //информация о том, что запись закреплена

    val markedAsAds: Boolean, //информация о том, содержит ли запись отметку "реклама"

    val isFavorite: Boolean, //true, если объект добавлен в закладки у текущего пользователя

    //Donut: Object,
    val isDonut: Boolean, //запись доступна только платным подписчикам VK Donut;
    val paidDurationDonut: Int, /*время, в течение которого запись будет доступна только
     платным подписчикам VK Donut;*/
    val placeholderDonut: Boolean, /*заглушка для пользователей, которые не оформили подписку VK Donut.
     Отображается вместо содержимого записи.*/
    val canPublishFreeCopyDonut: Boolean, /*можно ли открыть запись для всех пользователей,
     а не только подписчиков VK Donut;*/
    val editModeDonut: String,/* информация о том, какие значения VK
     Donut можно изменить в записи. Возможные значения:
     all — всю информацию о VK Donut.
     duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.*/

    val postponedId: Int /*идентификатор отложенной записи.
     Это поле возвращается тогда, когда запись стояла на таймере*/
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (data != other.data) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (countComment != other.countComment) return false
        if (canPostComment != other.canPostComment) return false
        if (groupsCanPostComment != other.groupsCanPostComment) return false
        if (canCloseComment != other.canCloseComment) return false
        if (canOpenComment != other.canOpenComment) return false
        if (idCopyright != other.idCopyright) return false
        if (linkCopyright != other.linkCopyright) return false
        if (nameCopyright != other.nameCopyright) return false
        if (typeCopyright != other.typeCopyright) return false
        if (countLikes != other.countLikes) return false
        if (userLikes != other.userLikes) return false
        if (canLikes != other.canLikes) return false
        if (canPublishLikes != other.canPublishLikes) return false
        if (countReposts != other.countReposts) return false
        if (userRepostedReposts != other.userRepostedReposts) return false
        if (countViews != other.countViews) return false
        if (postType != other.postType) return false
        if (typePostSource != other.typePostSource) return false
        if (platformPostSource != other.platformPostSource) return false
        if (dataPostSource != other.dataPostSource) return false
        if (urlPstSource != other.urlPstSource) return false
        if (typeGeo != other.typeGeo) return false
        if (coordinatesGeo != other.coordinatesGeo) return false
        if (idGeoPlace != other.idGeoPlace) return false
        if (titleGeoPlace != other.titleGeoPlace) return false
        if (latitudeGeoPlace != other.latitudeGeoPlace) return false
        if (longitudeGeoPlace != other.longitudeGeoPlace) return false
        if (createdGeoPlace != other.createdGeoPlace) return false
        if (iconGeoPlace != other.iconGeoPlace) return false
        if (checkinsGeoPlace != other.checkinsGeoPlace) return false
        if (updatedGeoPlace != other.updatedGeoPlace) return false
        if (typeGeoPlace != other.typeGeoPlace) return false
        if (countryGeoPlace != other.countryGeoPlace) return false
        if (cityGeoPlace != other.cityGeoPlace) return false
        if (addressGeoPlace != other.addressGeoPlace) return false
        if (!copy_history.contentEquals(other.copy_history)) return false
        if (signerId != other.signerId) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (isDonut != other.isDonut) return false
        if (paidDurationDonut != other.paidDurationDonut) return false
        if (placeholderDonut != other.placeholderDonut) return false
        if (canPublishFreeCopyDonut != other.canPublishFreeCopyDonut) return false
        if (editModeDonut != other.editModeDonut) return false
        if (postponedId != other.postponedId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + createdBy
        result = 31 * result + data
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId
        result = 31 * result + replyPostId
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + countComment
        result = 31 * result + canPostComment.hashCode()
        result = 31 * result + groupsCanPostComment.hashCode()
        result = 31 * result + canCloseComment.hashCode()
        result = 31 * result + canOpenComment.hashCode()
        result = 31 * result + idCopyright
        result = 31 * result + linkCopyright.hashCode()
        result = 31 * result + nameCopyright.hashCode()
        result = 31 * result + typeCopyright.hashCode()
        result = 31 * result + countLikes
        result = 31 * result + userLikes.hashCode()
        result = 31 * result + canLikes.hashCode()
        result = 31 * result + canPublishLikes.hashCode()
        result = 31 * result + countReposts
        result = 31 * result + userRepostedReposts.hashCode()
        result = 31 * result + countViews
        result = 31 * result + postType.hashCode()
        result = 31 * result + typePostSource.hashCode()
        result = 31 * result + platformPostSource.hashCode()
        result = 31 * result + dataPostSource.hashCode()
        result = 31 * result + urlPstSource.hashCode()
        result = 31 * result + typeGeo.hashCode()
        result = 31 * result + coordinatesGeo.hashCode()
        result = 31 * result + idGeoPlace
        result = 31 * result + titleGeoPlace.hashCode()
        result = 31 * result + latitudeGeoPlace
        result = 31 * result + longitudeGeoPlace
        result = 31 * result + createdGeoPlace
        result = 31 * result + iconGeoPlace.hashCode()
        result = 31 * result + checkinsGeoPlace
        result = 31 * result + updatedGeoPlace
        result = 31 * result + typeGeoPlace
        result = 31 * result + countryGeoPlace
        result = 31 * result + cityGeoPlace
        result = 31 * result + addressGeoPlace.hashCode()
        result = 31 * result + copy_history.contentHashCode()
        result = 31 * result + signerId
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + isDonut.hashCode()
        result = 31 * result + paidDurationDonut
        result = 31 * result + placeholderDonut.hashCode()
        result = 31 * result + canPublishFreeCopyDonut.hashCode()
        result = 31 * result + editModeDonut.hashCode()
        result = 31 * result + postponedId
        return result
    }
}