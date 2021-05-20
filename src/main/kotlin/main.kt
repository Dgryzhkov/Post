import netology.attachment.Attachment
import netology.data.Post
import netology.service.WallService


fun main() {
    val service = WallService()
    var attachments = emptyArray<Attachment>()
    attachments +=AudioAttachment(type = "audio", objects = Audio(1,"audio",true))
attachments+=VideosAttachment("video",Video(0,"Video", false))



    val post1 = Post(1, 1012012, "Пост номер 1", true, 1, null,attachments[0])
    val post2 = Post(2, 2012012, "Пост номер 2", false, 2, post1,attachments[1])
    val post3 = Post(3, 3012012, "Пост номер 3", true, 1, post2,null)
    val post4 = Post(4, 2302012, "Post number 5", true, 1, null,null)
    var allPost = emptyArray<Post>()
    allPost += post1
    allPost += post2
    allPost += post3
    allPost+=post4

    service.add(post1)
    service.add(post2)
    service.add(post3)
    service.update(post4)



   printAllPost(allPost)



}

fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }
}