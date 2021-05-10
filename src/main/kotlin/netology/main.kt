import netology.data.Post
import netology.service.WallService


fun main() {
    val post1 = Post(
        1, 0, 0, 0, 0, "Пост номер 1",
        0, 0, true, 0, true,
        true, true, true, 0,
        " ", " ",
        " ", 1, true, true, true, 0,
        true, 0, " ", " ",
        " ", " ", " ", " ", " ",
        0, " ", 0, 0, 0,
        " ", 0, 0, 0, 0,
        0, " ", null, 0, true, true,
        true,
        true, true, true, true, 0, true,
        true, " ", 0
    )

    val post2 = Post(2, 1, 1, 1, 1, "Пост номер 2",
        1, 1, false, 1, false,
        false, false, false, 1,
        " ", " ",
        " ", 3, false, false, false, 1,
        false, 1, " ", " ",
        " ", " ", " ", " ", " ",
        1, " ", 1, 1, 1,
        " ", 1, 1, 1, 1,
        1, " ", null, 0, false, false,
        false,
        false, false, false, false, 0, false,
        false, " ", 1
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