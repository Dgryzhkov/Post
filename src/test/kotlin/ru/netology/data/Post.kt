package ru.netology.data

data class Post(
    val id: Int, //идентификатор записи.

    val ownerId: Int,//идентификатор владельца стены, на которой размещена запись.

    val fromId: Int, //идентификатор автора записи (от чьего имени опубликована запись).

    val createdBy: Int,//идентификатор администратора,
    // который опубликовал запись
    // (возвращается только для сообществ при запросе с ключом доступа администратора).
    // Возвращается в записях, опубликованных менее 24 часов назад.

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


    // val copyright: Object,
    val idCopyright: Int,
    val linkCopyright: String,
    val nameCopyright: String,
    val typeCopyright: String,


    // var Likes: Object,
    val countLikes: Int =0, //число пользователей, которым понравилась запись;
    val userLikes: Boolean,//наличие отметки «Мне нравится» от текущего пользователя
    val canLikes: Boolean,//информация о том, может ли текущий пользователь
    // поставить отметку «Мне нравится»
    val canPublishLikes: Boolean,//информация о том, может ли текущий пользователь сделать репост записи


    //val Reposts: Object,
    val countReposts: Int, // число пользователей, скопировавших запись;
    val userRepostedReposts: Boolean,//наличие репоста от текущего пользователя

    // val Views: Object//
    val countViews: Int, // число просмотров записи.


    val postType: String, //тип записи, может принимать следующие значения:
    // post, copy, reply, postpone, suggest.

    val signerId: Int, //идентификатор автора, если запись была опубликована
    // от имени сообщества и подписана пользователем

    val canPin: Boolean, // информация о том, может ли текущий пользователь закрепить запись

    val canDelete: Boolean, //информация о том, может ли текущий пользователь удалить запись

    val canEdit: Boolean, //информация о том, может ли текущий пользователь редактировать запись

    val isPinned: Boolean, //информация о том, что запись закреплена

    val markedAsAds: Boolean, //информация о том, содержит ли запись отметку "реклама"

    val isFavorite: Boolean, //true, если объект добавлен в закладки у текущего пользователя


    //valDonut: Object,

    val isDonut: Boolean, //запись доступна только платным подписчикам VK Donut;
    val paidDurationDonut: Int, //время, в течение которого запись будет доступна только
    // платным подписчикам VK Donut;
    val placeholderDonut: Boolean, //заглушка для пользователей, которые не оформили подписку VK Donut.
    // Отображается вместо содержимого записи.
    val canPublishFreeCopyDonut: Boolean, //можно ли открыть запись для всех пользователей,
    // а не только подписчиков VK Donut;
    val editModeDonut: String, //информация о том, какие значения VK
   // Donut можно изменить в записи. Возможные значения:
   // all — всю информацию о VK Donut.
   // duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.

    val postponedId: Int //идентификатор отложенной записи.
    // Это поле возвращается тогда, когда запись стояла на таймере
)