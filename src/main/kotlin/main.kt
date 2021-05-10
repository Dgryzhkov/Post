import netology.data.Post
import netology.service.WallService


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
        1,
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
    val service = WallService()
    service.add(post1)
    service.add(post2)

    var allPost= emptyArray<Post>()
    allPost += post1
    allPost +=post2
    printAllPost(allPost)

}




fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }
}