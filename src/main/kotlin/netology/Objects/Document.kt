class Document (
    private val id: Int,// id документа
    private val title: String,// название
    private val ext: String//расширение документа
)
{
    override fun toString(): String {
        return "ID: $id, Название: $title, Расширение документа: $ext"
    }
}
