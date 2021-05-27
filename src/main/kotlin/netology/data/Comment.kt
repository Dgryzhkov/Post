data class Comment(
    val ownerId: Int, //идентификатор пользователя или сообщества,
    // на чьей стене находится запись,
    // к которой необходимо добавить комментарий
    val postId: Int, // идентификатор записи на стене
    val message: String // текст комментария
){
    override fun toString(): String {
        return "Комментарий: $message, ID пользователя: $ownerId"
    }



}