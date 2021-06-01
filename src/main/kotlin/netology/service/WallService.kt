package netology.service

import Comment
import PostNotFoundException
import ReasonsReport
import WallReportComment
import netology.data.Post
import java.util.*

class WallService {
    private val reasons = arrayOf(
        ReasonsReport("спам"),
        ReasonsReport("детская порнография"),
        ReasonsReport("экстремизм"),
        ReasonsReport("насилие"),
        ReasonsReport("пропаганда наркотиков"),
        ReasonsReport("материал для взрослых"),
        ReasonsReport("оскорбление"),
        ReasonsReport("призывы к суициду"),
    )
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<WallReportComment>()

    fun add(post: Post): Post {//подсказал преподаватель
        posts += post.copy(id = if (posts.isEmpty()) 0 else posts.last().id + 1, comment = emptyArray())
        return posts.last()
    }

    fun update(post: Post): Boolean { // подсказал преподаватель
        val index = posts.indexOfFirst { it.id == post.id }
        return if (index < 0) false else {
            posts[index] = post.copy(
                id = posts[index].id, data = posts[index].data, text = post.text,
                friendsOnly = post.friendsOnly, countLikes = post.countLikes, original = post.original
            )
            true
        }
    }

    fun createComment(comment: Comment) {
        val index = posts.indexOfFirst { it.id == comment.postId }
        if (index < 0) throw PostNotFoundException("Поста с таким ID не существует") else {
            comments += comment.copy(message = comment.message)
            val post = posts[index]
            posts[index] = post.copy(comment = post.comment + comment)
        }
    }


    fun getPosts(): Array<Post> = posts.clone()

    fun createReport(wallReportComment: WallReportComment) {
        val index = posts.indexOfFirst { it.id == wallReportComment.commentId }
        if (index < 0) throw PostNotFoundException("Поста с таким ID не существует") else {
            reasons.find {
                it.reasons == wallReportComment.reason
            } ?: throw PostNotFoundException("Причина жалобы не корректна")
        }
    }

}
