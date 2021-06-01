
data class WallReportComment(
    val ownerId: Int, // идентификатор пользователя или сообщества, которому принадлежит комментарий
    val commentId: Int, // идентификатор комментария.
    val reason: String
) {
    override fun toString(): String {
        return """
             |ID польователя оставившего жалобу: $ownerId,
             |Причина:
             |$reason
                 """
            .trimMargin()
    }


}
