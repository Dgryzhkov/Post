package netology.service

import Comment
import PostNotFoundException
import netology.attachment.*
import netology.data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addExisting() {
        // создаём целевой сервис
        val service = WallService()
        var attachments = emptyArray<Attachment>()
        attachments += AudioAttachment()
        attachments += VideoAttachment()
        attachments += FotosAttachment()
        attachments += DocumentsAttachment()
        attachments += LinksAttachment()
        // заполняем несколькими постами
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, attachments, null
        )
        val post2 = Post(
            2, 2012012, "Пост номер 2", false,
            2, post1, attachments, null
        )
        val post3 = Post(
            3, 3012012, "Пост номер 3", true,
            1, post2, null, null
        )
        var allPost = emptyArray<Post>()
        allPost += post1
        allPost += post2
        allPost += post3
        val result = service.add(
            Post(
                4, 3012012, "Пост номер 4", true,
                3, null, null, null
            )
        )
        //assert
        assertEquals(result.id == 0, true)
    }

    @Test
    fun updateTrue() {
        // создае целевой сервис
        val service = WallService()
        var attachments = emptyArray<Attachment>()
        attachments += AudioAttachment()
        attachments += VideoAttachment()
        attachments += FotosAttachment()
        attachments += DocumentsAttachment()
        attachments += LinksAttachment()

        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, attachments, null
        )
        val post2 = Post(
            2, 2012012, "Пост номер 2", false,
            2, post1, attachments, null
        )
        val post3 = Post(
            3, 3012012, "Пост номер 3", true,
            1, post2, null, null
        )
        service.add(post1)
        service.add(post2)
        service.add(post3)
        val result = service.update(
            Post(
                1, 232012, "Post number 5", true,
                1, null, attachments, null
            )
        )
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        // создае целевой сервис
        val service = WallService()
        var attachments = emptyArray<Attachment>()
        attachments += AudioAttachment()
        attachments += VideoAttachment()
        attachments += FotosAttachment()
        attachments += DocumentsAttachment()
        attachments += LinksAttachment()

        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, attachments, null
        )
        val post2 = Post(
            2, 2012012, "Пост номер 2", false,
            2, post1, attachments, null
        )
        val post3 = Post(
            3, 3012012, "Пост номер 3", true,
            1, post2, null, null
        )

        service.add(post1)
        service.add(post2)
        service.add(post3)
        val result = service.update(
            Post(
                4, 232012, "Post number 5", true,
                1, null, attachments, null
            )
        )
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        var commentsId0 = emptyArray<Comment>()
        val comment1 = Comment(4, 1,"Комментарий 1")
        var allPost = emptyArray<Post>()
        val post1 = Post(1, 1012012, "Пост номер 1", true, 1,
            null, null, commentsId0)
        service.add(post1)
        val result = service.createComment(comment1)
        assertTrue(allPost.equals(result))
        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
    }

}



