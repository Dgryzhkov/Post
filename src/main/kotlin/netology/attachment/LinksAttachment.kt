import netology.attachment.Attachment

class LinksAttachment(override val type: String="link",
                       private val link: Link= Link("mail.ru","Почта","Почтовый сервис")
) : Attachment
{
    override fun toString(): String {
        return "Вложение типа $type $link"
    }
}
