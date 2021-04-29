fun main() {
    val post1 = Post(
        111,
        1212,
        1313,
        1010,
        "Первый пост",
        120120,
        121121,
        true,
        2,
        123456,
        12,
        10,
        1111,
        "post",
        1234321,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        1
    )
    val post2 = Post(
        112,
        2222,
        3333,
        1111,
        "Второй пост",
        133331,
        242424,
        false,
        15,
        654321,
        100,
        50,
        3000,
        "post",
        345676543,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        2
    )


    var array = emptyArray<Post>()
    array += post1
    array += post2

    printAllPost(array)

    WallService.add(post1)
    WallService.add(post2)

}

fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }
}