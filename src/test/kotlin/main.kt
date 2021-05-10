import ru.netology.data.Post
import ru.netology.service.WallService


fun main() {
    val post1 = Post(
        1,
        1,
        1,
        1,
        1,
        "First ru.netology.data.Post",
        1,
        1,
        true,
        1,
        true,
        true,
        true,
        true,
        1,
        "www",
        "aaa",
        "bbb",
        1,
        true,
        true,
        true,
        1,
        true,
        1,
        "ccc",
        1,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        1,
        true,
        true,
        "ddd",
        1
    )
    val post2 = Post(
        2,
        1,
        1,
        1,
        1,
        "First ru.netology.data.Post",
        1,
        1,
        false,
        1,
        true,
        true,
        true,
        true,
        1,
        "www",
        "aaa",
        "bbb",
        1,
        true,
        true,
        true,
        1,
        true,
        1,
        "ccc",
        1,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        1,
        true,
        true,
        "ddd",
        1
    )
    val service = WallService
    service.add(post1)
    service.add(post2)
    service.update(3)
    service.update(4)

    var posts = emptyArray<Post>()
    posts += post1
    posts += post2

    printAllPost(posts)

}


fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }
}