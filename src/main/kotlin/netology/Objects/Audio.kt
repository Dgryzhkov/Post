
class Audio (
    val id: Int,// id аудио
    val title: String,// название
    val isFavorite: Boolean//добавлено аудио в закладки или нет
        )
{
    override fun toString(): String {
        return "ID:$id, Название:$title, Добавлено во вкладки:$isFavorite"
    }
}
