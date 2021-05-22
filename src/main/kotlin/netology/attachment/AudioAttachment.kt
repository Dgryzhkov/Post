import netology.attachment.Attachment


class AudioAttachment(override val type: String="audio", private val audio: Audio=Audio(0,"_",true)) : Attachment
{
    override fun toString(): String {
        return "Вложение типа $type $audio"
    }
}
