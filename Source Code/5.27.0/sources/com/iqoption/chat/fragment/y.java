package com.iqoption.chat.fragment;

import com.iqoption.core.microservices.chat.response.ChatRoomType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class y {
    public static final /* synthetic */ int[] aob = new int[ChatRoomType.values().length];

    static {
        aob[ChatRoomType.GLOBAL.ordinal()] = 1;
        aob[ChatRoomType.SUPPORT.ordinal()] = 2;
        aob[ChatRoomType.VIP.ordinal()] = 3;
    }
}
