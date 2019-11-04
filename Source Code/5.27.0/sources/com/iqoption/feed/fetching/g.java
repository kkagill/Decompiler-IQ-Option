package com.iqoption.feed.fetching;

import com.iqoption.core.microservices.feed.MediaType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] aob = new int[MediaType.values().length];

    static {
        aob[MediaType.ORIGINAL.ordinal()] = 1;
        aob[MediaType.THUMBNAIL.ordinal()] = 2;
    }
}
