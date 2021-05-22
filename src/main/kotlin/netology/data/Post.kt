package netology.data

import netology.attachment.Attachment

data class Post(
    val id: Int, //идентификатор записи.

    val data: Int, //время публикации записи в формате unixtime.

    var text: String, //текст записи.

    val friendsOnly: Boolean, // true если запись была создана с опцией «Только для друзей».

    val countLikes: Int = 0, //число пользователей, которым понравилась запись;

    val original: Post?,
    val attachment: Array<Attachment>?

) {

    override fun toString(): String {
        return " Дата создания $data, текст \"$text\" ${attachment?.let { printAttachment(it) } }"
    }

    private fun printAttachment(array: Array<Attachment>) {
        for (post in array) {
            println(post)
        }
    }

    }
