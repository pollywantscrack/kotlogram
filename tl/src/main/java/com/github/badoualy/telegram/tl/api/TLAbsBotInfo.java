package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public abstract class TLAbsBotInfo extends TLObject {
    public TLAbsBotInfo() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLBotInfo getAsBotInfo() {
        return null;
    }
}