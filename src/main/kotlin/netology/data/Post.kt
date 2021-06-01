package netology.data

import Comment
import netology.attachment.Attachment

data class Post(
    val id: Int, //идентификатор записи.

    val data: Int, //время публикации записи в формате unixtime.

    var text: String, //текст записи.

    val friendsOnly: Boolean, // true если запись была создана с опцией «Только для друзей».

    val countLikes: Int = 0, //число пользователей, которым понравилась запись;

    val original: Post?,
    val attachment: Array<Attachment>?,
    val comment: Array<Comment> = emptyArray()

) {

    override fun toString(): String {
        return """
             |Дата создания $data, текст "$text",
             |${attachment?.joinToString(separator = "\n")?: "Вложений нет"},
             |${comment?.joinToString(separator = "\n")?: "Комментариев нет"}
                 """
                     .trimMargin()
             }

    private fun printComments(array: Array<Comment>) {
        for (post in array) {
            println(post)
        }
    }

    private fun printAttachment(array: Array<Attachment>) {
        for (post in array) {
            println(post)
        }
    }

}
