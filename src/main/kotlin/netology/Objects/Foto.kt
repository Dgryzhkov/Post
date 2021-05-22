class Foto (
    private val id: Int,// id Фото
    private val albumId: Int,// идентификатор альбома, в котором находится фотография.
    private val text: String//текст описания фотографии.
)
{
    override fun toString(): String {
        return "ID: $id, Альбом: $albumId, Описание фото: $text"
    }
}
