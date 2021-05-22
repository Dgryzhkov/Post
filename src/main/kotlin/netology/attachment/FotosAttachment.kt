import netology.attachment.Attachment

class FotosAttachment(override val type: String = "foto",
                      private val foto: Foto = Foto(0, 0, "Фотка")) : Attachment {

    override fun toString(): String {
        return "вложение типа $type $foto"
    }
}