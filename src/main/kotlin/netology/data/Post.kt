package netology.data

import netology.attachment.Attachment

data class Post(
    val id: Int, //идентификатор записи.

    val data: Int, //время публикации записи в формате unixtime.

    var text: String, //текст записи.

    val friendsOnly: Boolean, // true если запись была создана с опцией «Только для друзей».

    val countLikes: Int = 0, //число пользователей, которым понравилась запись;

    val original: Post?,
    val attachment: Attachment?

) {
    override fun toString(): String {
        return "$data  $text $attachment"
    }


}
