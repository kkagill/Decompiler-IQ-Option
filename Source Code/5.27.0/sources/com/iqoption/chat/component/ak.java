package com.iqoption.chat.component;

import com.iqoption.core.microservices.chat.response.ChatRoomType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class ak {
    public static final /* synthetic */ int[] aob = new int[ChatRoomType.values().length];

    static {
        aob[ChatRoomType.SUPPORT.ordinal()] = 1;
        aob[ChatRoomType.FEEDBACK.ordinal()] = 2;
    }
}
