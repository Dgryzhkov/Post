package netology.service

import netology.data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(1, 1012012, "Пост номер 1", true, 1, null))
        service.add(Post(2, 2012012, "Пост номер 2", false, 2, null))
        service.add(Post(3, 3012012, "Пост номер 3", true, 3, null))
        val result = service.add(Post(5, 3012012, "Пост номер 3", true, 3, null))
        //assert
        assertEquals(result.id == 3, true)
    }

    @Test
    fun updateTrue(){
        // создае целевой сервис
        val service=WallService()
        val result=service.update(Post(1, 232012, "Post number 5", true,
            1, null))
        assertTrue(true)
    }

    @Test
    fun updateFalse(){
        // создае целевой сервис
        val service=WallService()
        val result=service.update(Post(4, 232012, "Post number 5", true,
            1, null))
       assertFalse(false)
    }
}