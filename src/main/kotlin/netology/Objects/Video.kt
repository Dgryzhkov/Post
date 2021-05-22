class Video (
    private val id: Int,// id видео
    private val title: String,// название
    private val isFavorite: Boolean//добавлено видео в закладки или нет
)
{
    override fun toString(): String {
        return "ID: $id, Название: $title, Добавлено во вкладки: $isFavorite"
    }
}
