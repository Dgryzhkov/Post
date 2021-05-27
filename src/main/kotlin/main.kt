import netology.attachment.*
import netology.data.Post
import netology.service.WallService
import java.lang.RuntimeException


fun main() {
    val comment1 = Comment(4, 0,"Комментарий 1")
    val comment2 = Comment(2, 1,"Комментарий 2")
    val comment3 = Comment(3, 2,"Комментарий 3")
    val comment4 = Comment(3, 2,"Комментарий 4")


    val service = WallService()
    var attachments = emptyArray<Attachment>()
    attachments += AudioAttachment(audio = Audio(1, "Audio", true))
    attachments += VideoAttachment(video = Video(123, "film", true))
    attachments += FotosAttachment()
    attachments += DocumentsAttachment()
    attachments += LinksAttachment()

    var allPost = emptyArray<Post>()
    val post1 = Post(1, 1012012, "Пост номер 1", true, 1, null, null,null)
    val post2 = Post(2, 2012012, "Пост номер 2", false, 2, null, null,null)
    val post3 = Post(3, 3012012, "Пост номер 3", true, 1, null, null,null)
    val post4 = Post(2, 2302012, "Post number 5", true, 1, null, null,null)

    allPost += post1
    allPost += post2
    allPost += post3
    allPost += post4

    service.add(post1)
    service.add(post2)
    service.add(post3)
    service.update(post4)
    service.createComment(comment1)
    service.createComment(comment2)
    service.createComment(comment3)
    service.createComment(comment4)

    printAllPost(service.getPosts())


}

fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }

}

class PostNotFoundException(message: String) : RuntimeException(message)
