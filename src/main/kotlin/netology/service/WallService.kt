package netology.service

import Comment
import PostNotFoundException
import netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

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
            comments+=comment.copy(message = comment.message)
            val post = posts[index]
            posts[index]=post.copy(comment = (post.comment?: emptyArray()) + comment)
        }
    }
    fun getPosts(): Array<Post> = posts.clone()

}

