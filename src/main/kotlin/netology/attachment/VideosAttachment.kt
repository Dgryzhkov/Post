import netology.attachment.Attachment

class VideosAttachment(override val type: String="video",
                       private val video: Video=Video(0,"",true)) : Attachment
{
    override fun toString(): String {
        return "Вложение типа $type $video"
    }
}

