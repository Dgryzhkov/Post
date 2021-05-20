import netology.attachment.Attachment

class VideosAttachment(override val type: String, override val objects: Video) : Attachment
{
    override fun toString(): String {
        return "вложение типа $type $objects"
    }
}
