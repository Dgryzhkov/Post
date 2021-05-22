import netology.attachment.Attachment

class DocumentsAttachment(override val type: String="document",
                       private val document: Document=Document(0," ","pfd")) : Attachment
{
    override fun toString(): String {
        return "вложение типа $type ${document} "
    }
}
