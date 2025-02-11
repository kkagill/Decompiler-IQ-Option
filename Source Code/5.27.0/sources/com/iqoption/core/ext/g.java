package com.iqoption.core.ext;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ext/OnDelayClickListener;", "Landroid/view/View$OnClickListener;", "delay", "", "(J)V", "lastClickTime", "onClick", "", "v", "Landroid/view/View;", "onDelayClick", "core_release"})
/* compiled from: AndroidExtensions.kt */
public abstract class g implements OnClickListener {
    private long bhf;
    private final long delay;

    public g() {
        this(0, 1, null);
    }

    public abstract void M(View view);

    public g(long j) {
        this.delay = j;
    }

    public /* synthetic */ g(long j, int i, f fVar) {
        if ((i & 1) != 0) {
            j = 250;
        }
        this(j);
    }

    public void onClick(View view) {
        kotlin.jvm.internal.i.f(view, "v");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.bhf >= this.delay) {
            this.bhf = currentTimeMillis;
            M(view);
        }
    }
}
