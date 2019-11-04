package com.iqoption.charttools.e;

import androidx.core.app.NotificationCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/templates/TemplateMessage;", "Lcom/iqoption/charttools/templates/TemplateActionResult;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "techtools_release"})
/* compiled from: TemplateViewModel.kt */
public final class n extends g {
    private final String ahc;

    public n(String str) {
        kotlin.jvm.internal.i.f(str, NotificationCompat.CATEGORY_MESSAGE);
        super();
        this.ahc = str;
    }

    public final String Po() {
        return this.ahc;
    }
}
