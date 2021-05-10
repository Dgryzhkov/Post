package netology.service

import netology.data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    @Test
    fun updateExistingAdd() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(1, 1012012, "Пост номер 1", true, 1))
        service.add(Post(2, 2012012, "Пост номер 2", false, 2))
        service.add(Post(3, 3012012, "Пост номер 3", true, 3))
        val result = service.add(Post(3, 3012012, "Пост номер 3", true, 3))
        assertEquals(result.id >0 , true)


        @Test
        fun updateExistingTrue() {
            // создаём целевой сервис
            val service = WallService()
            // заполняем несколькими постами
            service.add(Post(1, 1012012, "Пост номер 1", true, 1))
            service.add(Post(2, 2012012, "Пост номер 2", false, 2))
            service.add(Post(3, 3012012, "Пост номер 3", true, 3))
            // создаём информацию об обновлении
            val update = Post(1, 1012012, "Пост номер 5", true, 1)
            // выполняем целевое действие
            val result = service.update(1, Post(1, 1012012, "Пост номер 5", true, 1))
            // проверяем результат (используйте assertTrue или assertFalse)
            assertTrue("Пост номер 5", true)
        }

        @Test
        fun updateExistingFalse() {
            // создаём целевой сервис
            val service = WallService()
            // заполняем несколькими постами
            service.add(Post(1, 1012012, "Пост номер 1", true, 1))
            service.add(Post(2, 2012012, "Пост номер 2", false, 2))
            service.add(Post(3, 3012012, "Пост номер 3", true, 3))
            // создаём информацию об обновлении
            val update = Post(4, 1012012, "Пост номер 40", true, 1)
            // выполняем целевое действие
            val result = service.update(4, Post(4, 1012012, "Пост номер 40", true, 1))
            // проверяем результат (используйте assertTrue или assertFalse)
            assertFalse("Пост номер 40", false)
        }
    }
}

