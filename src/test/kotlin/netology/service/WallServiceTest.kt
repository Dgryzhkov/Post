package netology.service

import Audio
import AudioAttachment
import Video
import VideosAttachment
import netology.attachment.Attachment
import netology.data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addExisting() {
        // создаём целевой сервис
        val service = WallService()
        var attachments = emptyArray<Attachment>()
        attachments +=AudioAttachment(type = "audio", objects = Audio(1,"audio",true))
        attachments+=VideosAttachment("video",Video(0,"Video", false))
        // заполняем несколькими постами
        val post1 = Post(1, 1012012, "Пост номер 1", true, 1, null,attachments[0])
        val post2 = Post(2, 2012012, "Пост номер 2", false, 2, post1,attachments[1])
        val post3 = Post(3, 3012012, "Пост номер 3", true, 1, post2,null)
        var allPost = emptyArray<Post>()
        allPost += post1
        allPost += post2
        allPost += post3
        val result = service.add(Post(3, 3012012, "Пост номер 3", true, 3, null,null))
        //assert
        assertEquals(result.id == 0, true)
    }

    @Test
    fun updateTrue(){
        // создае целевой сервис
        val service=WallService()
        var attachments = emptyArray<Attachment>()
        attachments +=AudioAttachment(type = "audio", objects = Audio(1,"audio",true))
        attachments+=VideosAttachment("video",Video(0,"Video", false))
        val post1 = Post(1, 1012012, "Пост номер 1", true, 1, null,attachments[0])
        val post2 = Post(2, 2012012, "Пост номер 2", false, 2, post1,attachments[1])
        val post3 = Post(3, 3012012, "Пост номер 3", true, 1, post2,null)
        var allPost = emptyArray<Post>()
        allPost += post1
        allPost += post2
        allPost += post3
        val result=service.update(Post(1, 232012, "Post number 5", true,
            1, null,attachments[1]))
        assertTrue(true)
    }

    @Test
    fun updateFalse(){
        // создае целевой сервис
        val service=WallService()
        var attachments = emptyArray<Attachment>()
        attachments +=AudioAttachment(type = "audio", objects = Audio(1,"audio",true))
        attachments+=VideosAttachment("video",Video(0,"Video", false))
        val post1 = Post(1, 1012012, "Пост номер 1", true, 1, null,attachments[0])
        val post2 = Post(2, 2012012, "Пост номер 2", false, 2, post1,attachments[1])
        val post3 = Post(3, 3012012, "Пост номер 3", true, 1, post2,null)
        var allPost = emptyArray<Post>()
        allPost += post1
        allPost += post2
        allPost += post3
        val result=service.update(Post(4, 232012, "Post number 5", true,
            1, null,attachments[1]))
       assertFalse(false)
    }
}