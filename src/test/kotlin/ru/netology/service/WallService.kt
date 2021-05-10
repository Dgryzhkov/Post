package ru.netology.service

import ru.netology.data.Post

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(id: Int) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy()

            }
        }
    }

        fun removeById(id: Long): Boolean {
            TODO()
        }

        //доделать
        fun likeById(id: Int) {
            for ((index, post) in posts.withIndex()) {
                if (post.id == id) {
                    posts[index] = post.copy(countLikes = post.countLikes + 1)
                }
            }
        }
    }



