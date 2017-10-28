package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * recentMeUrlChat#a01b22f9
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRecentMeUrlChat() : TLAbsRecentMeUrl() {
    override var url: String = ""

    var chatId: Int = 0

    private val _constructor: String = "recentMeUrlChat#a01b22f9"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(url: String, chatId: Int) : this() {
        this.url = url
        this.chatId = chatId
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(url)
        writeInt(chatId)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        url = readString()
        chatId = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(url)
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRecentMeUrlChat) return false
        if (other === this) return true

        return url == other.url
                && chatId == other.chatId
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xa01b22f9.toInt()
    }
}