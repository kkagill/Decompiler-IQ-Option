package com.iqoption.core.util.b;

import android.content.Context;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/util/link/OpenBrowserClickListener;", "Lcom/iqoption/core/util/link/LinkClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "core_release"})
/* compiled from: LinkUtils.kt */
public class g implements b {
    private final Context context;

    public g(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        this.context = context;
    }

    public void onLinkClicked(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "link");
        d.a(this.context, aVar.getUrl(), Integer.valueOf(268435456), null, 8, null);
    }
}
