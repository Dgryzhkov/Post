class Link (
    private val url: String,// URL ссылки.
    private val title: String,// заголовок ссылки
    private val description: String//описание ссылки.
)
{
    override fun toString(): String {
        return "Адресс: $url, Описание: $title, Описание: $description"
    }
}
