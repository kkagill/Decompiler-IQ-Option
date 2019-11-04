package com.iqoption.core.microservices.withdraw.response;

import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, bng = {"DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "core_release"})
/* compiled from: WithdrawPayout.kt */
public final class p {
    private static final SimpleDateFormat aXf;

    static {
        SimpleDateFormat simpleDateFormat;
        if ((VERSION.SDK_INT >= 24 ? 1 : null) != null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSX", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSZZZZZ", Locale.US);
        }
        aXf = simpleDateFormat;
    }
}
