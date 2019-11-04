package com.iqoption.core.manager;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "invoke"})
/* compiled from: Toggles.kt */
final class Toggles$initVersionsAndDefaults$1 extends Lambda implements b<String, Integer> {
    public static final Toggles$initVersionsAndDefaults$1 bkZ = new Toggles$initVersionsAndDefaults$1();

    Toggles$initVersionsAndDefaults$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(fZ((String) obj));
    }

    public final int fZ(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        switch (str.hashCode()) {
            case -1621285096:
                if (str.equals("forex-instrument")) {
                    return 2;
                }
                break;
            case -1536311532:
                if (str.equals("google-pay")) {
                    return 2;
                }
                break;
            case -1442020685:
                if (str.equals("select-registration-country")) {
                    return 2;
                }
                break;
            case -1240459439:
                if (str.equals("fx-options-instrument")) {
                    return 2;
                }
                break;
            case -648001817:
                if (str.equals("ws-new-lib")) {
                    return 2;
                }
                break;
            case -40334142:
                if (str.equals("kyc-show-after-registration")) {
                    return 2;
                }
                break;
            case 229040601:
                if (str.equals("show-social-login")) {
                    return 3;
                }
                break;
            case 672991131:
                if (str.equals("price-alerts")) {
                    return 2;
                }
                break;
            case 2046702474:
                if (str.equals("margin-add-on")) {
                    return 4;
                }
                break;
        }
        return 1;
    }
}
