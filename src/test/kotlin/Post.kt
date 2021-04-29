import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    var text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comment: Int,
    val copyright: Int,
    var likes: Int =0,
    val reposts: Int,
    val views: Int,// TODO
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Boolean,
    val postponedId: Int
) {
    var like = likes
        get() {
            return field
        }
        set(value) {
            if (value < 0) {
                return
            }
            field = value
    }
    override fun toString(): String {
        return "Id: $id , текст поста: \"$text\" "
    }
}
