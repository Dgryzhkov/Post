import netology.data.Post
import netology.service.WallService


fun main() {
    val post1 = Post(1,1012012,"Пост номер 1",true,1)
    val post2 = Post(2,2012012,"Пост номер 2", false,2 )

    var allPost= emptyArray<Post>()
    allPost += post1
    allPost +=post2
    printAllPost(allPost)
/*
    WallService.add(post1)
    WallService.add(post2)
    WallService.update(post1.id, post1)
    WallService.update(post1.id,post2)
*/



}




fun printAllPost(array: Array<Post>) {
    for (post in array) {
        println(post)
    }
}