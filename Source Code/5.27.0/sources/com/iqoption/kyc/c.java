package com.iqoption.kyc;

import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/kyc/CountryUtils;", "", "()V", "canChangeCountry", "", "kyc_release"})
/* compiled from: CountryUtils.kt */
public final class c {
    public static final c drO = new c();

    private c() {
    }

    public static final boolean aIF() {
        return d.EA().Er() || d.EA().Es() == 0;
    }
}
