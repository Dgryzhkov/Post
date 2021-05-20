class Video (
    val id: Int,// id видео
    val title: String,// название
    val isFavorite: Boolean//добавлено видео в закладки или нет
)
{
    override fun toString(): String {
        return "ID:$id, Название:$title, Добавлено во вкладки:$isFavorite"
    }
}
