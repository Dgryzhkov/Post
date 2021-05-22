
class Audio (
    private val id: Int,// id аудио
    private val title: String,// название
    private val isFavorite: Boolean//добавлено аудио в закладки или нет
        )
{
    override fun toString(): String {
        return "ID: $id, Название: $title, Добавлено во вкладки: $isFavorite"
    }
}
