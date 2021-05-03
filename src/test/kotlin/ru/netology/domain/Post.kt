package ru.netology.domain

class Post (
    val id: Int,

    val ownerId: Int,
    val fromId: Int,

    val createdBy: Int,

    val data: Int,
    var text: String,

    val replyOwnerId: Int,

    val replyPostId: Int,
    val friendsOnly: Boolean,

    val countComment: Int,
    val canPostComment: Boolean,
    val groupsCanPostComment: Boolean,
    val canCloseComment: Boolean,
    val canOpenComment: Boolean,


    // val copyright: Object,
    val idCopyright: Int,
    val linkCopyright: String,
    val nameCopyright: String,
    val typeCopyright: String,



     countLikes: Int=0,
    val userLikes: Boolean,
    val canLikes: Boolean,
    val canPublishLikes: Boolean,


    val countReposts: Int,
    val userRepostedReposts: Boolean,


    val countViews: Int,


    val postType: String,

    val signerId: Int,

    val canPin: Boolean,

    val canDelete: Boolean,

    val canEdit: Boolean,

    val isPinned: Boolean,

    val markedAsAds: Boolean,

    val isFavorite: Boolean,



    val isDonut: Boolean,
    val paidDurationDonut: Int,
    val placeholderDonut: Boolean,
    val canPublishFreeCopyDonut: Boolean,
    val editModeDonut: String,

    val postponedId: Int
) {
    var countLikes= countLikes
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
}