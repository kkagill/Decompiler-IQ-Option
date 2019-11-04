package com.iqoption.welcome.register.social;

import com.iqoption.core.microservices.core.register.SocialTypeId;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[SocialTypeId.values().length];

    static {
        aob[SocialTypeId.FACEBOOK.ordinal()] = 1;
        aob[SocialTypeId.GOOGLE_PLUS.ordinal()] = 2;
    }
}
