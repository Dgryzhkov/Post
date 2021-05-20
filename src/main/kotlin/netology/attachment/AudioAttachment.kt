import netology.attachment.Attachment
import java.util.*

class AudioAttachment(override val type: String, override val objects: Audio) : Attachment
{
    override fun toString(): String {
        return "вложение типа $type $objects"
    }
}
