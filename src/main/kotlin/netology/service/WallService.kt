package netology.service

import netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()


    fun add(post: Post): Post {//подсказал преподаватель
        posts += post.copy(id = if (posts.isEmpty()) 0 else posts.last().id + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean { // подсказал преподаватель
        val index = posts.indexOfFirst { it.id == post.id }
        return if (index < 0) false else {
            posts[index] = post.copy(id=posts[index].id, data=posts[index].data, text = post.text,
            friendsOnly = post.friendsOnly,countLikes = post.countLikes,original = post.original)
            true
        }
    }
}
