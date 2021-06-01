package netology.service

import Comment
import PostNotFoundException
import ReasonsReport
import WallReportComment
import netology.attachment.*
import netology.data.Post
import org.junit.Test

import org.junit.Assert.*
import kotlin.math.exp

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
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"))
        )
        service.add(post1)
        service.add(post2)
        service.createComment(Comment(4, 2, "Комментарий 1"))
        service.createComment(Comment(4, 3, "Комментарий 21"))
    }

    @Test
    fun shouldThrowComment() {
        val service = WallService()
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"),
                Comment(4, 2, "Комментарий 5"))
        )
        service.add(post2)
        service.add(post1)
        service.createComment(Comment(4, 0, "Комментарий 1"))
        service.createComment(Comment(4, 1, "Комментарий 5"))
    }


    @Test
    fun getPost() {
        val service = WallService()
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"))
        )
        service.add(post1)
        service.add(post2)
        service.getPosts()

    }


    @Test
    fun createComment() {
        val service = WallService()
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"))
        )
        service.add(post1)
        service.add(post2)
         service.getPosts()
        val report1 = WallReportComment(
            5,
            1,
            "насилие"
        )
        service.createReport(report1)

    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrowReportID() {
        val service = WallService()
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"))
        )
        service.add(post1)
        service.add(post2)
        val report1 = WallReportComment(
            5,
            1,
            "куку"
        )
        service.createReport(report1)
    }
    @Test(expected = PostNotFoundException::class)
    fun shouldThrowReportComment() {
        val service = WallService()
        val post1 = Post(
            1, 1012012, "Пост номер 1", true,
            1, null, null, null
        )
        val post2 = Post(
            2, 1012012, "Пост номер 2", true,
            1, null, null,
            comment = arrayOf(Comment(4, 2, "Комментарий 3"))
        )
        service.add(post1)
        service.add(post2)
        val report1 = WallReportComment(
            5,
            5,
            "спам"
        )
        service.createReport(report1)
    }
}




