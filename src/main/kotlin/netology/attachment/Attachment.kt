package netology.attachment

import Audio
import Document
import Foto
import Link
import Video
import kotlin.coroutines.coroutineContext

sealed class Attachment {
    abstract val type: String
}

data class VideoAttachment(
    override val type: String = "video",
    private val video: Video = Video(0, "", true)
) : Attachment(){
    override fun toString(): String {
        return "Вложение типа $type $video"
    }
}

data class AudioAttachment(
    override val type: String = "audio",
    private val audio: Audio = Audio(0, "_", true)
) : Attachment() {
    override fun toString(): String {
        return "Вложение типа $type $audio"
    }
}

data class DocumentsAttachment(
    override val type: String = "document",
    private val document: Document = Document(0, " ", "pfd")
) : Attachment()

data class FotosAttachment(
    override val type: String = "foto",
    private val foto: Foto = Foto(0, 0, "Фотка")
) : Attachment()

data class LinksAttachment(override val type: String="link",
                      private val link: Link= Link("mail.ru","Почта","Почтовый сервис")
) : Attachment()