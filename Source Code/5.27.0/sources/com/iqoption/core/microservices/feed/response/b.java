package com.iqoption.core.microservices.feed.response;

import com.iqoption.core.microservices.feed.MediaType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[MediaType.values().length];

    static {
        aob[MediaType.THUMBNAIL.ordinal()] = 1;
        aob[MediaType.ORIGINAL.ordinal()] = 2;
    }
}
