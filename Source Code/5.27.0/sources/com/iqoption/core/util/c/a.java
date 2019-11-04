package com.iqoption.core.util.c;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/util/qrcode/Contents;", "", "()V", "EMAIL_KEYS", "", "", "getEMAIL_KEYS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "EMAIL_TYPE_KEYS", "getEMAIL_TYPE_KEYS", "NOTE_KEY", "PHONE_KEYS", "getPHONE_KEYS", "PHONE_TYPE_KEYS", "getPHONE_TYPE_KEYS", "URL_KEY", "Type", "core_release"})
/* compiled from: Contents.kt */
public final class a {
    private static final String[] bSc = new String[]{"phone", "secondary_phone", "tertiary_phone"};
    private static final String[] bSd = new String[]{"phone_type", "secondary_phone_type", "tertiary_phone_type"};
    private static final String[] bSe = new String[]{"email", "secondary_email", "tertiary_email"};
    private static final String[] bSf = new String[]{"email_type", "secondary_email_type", "tertiary_email_type"};
    public static final a bSg = new a();

    private a() {
    }

    public final String[] anX() {
        return bSc;
    }

    public final String[] anY() {
        return bSe;
    }
}
