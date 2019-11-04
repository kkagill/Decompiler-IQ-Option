package com.iqoption.feed.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.feed.a;
import com.iqoption.feed.feedlist.TagLayout;
import com.iqoption.feed.i.e;
import com.iqoption.feed.i.f;

/* compiled from: MacroVideoFeedBindingImpl */
public class r extends q {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(10);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"feed_title", "feed_bottom_panel"}, new int[]{1, 2}, new int[]{f.feed_title, f.feed_bottom_panel});
        aos.put(e.video_content, 3);
        aos.put(e.video_preview, 4);
        aos.put(e.play_button, 5);
        aos.put(e.video_title, 6);
        aos.put(e.main_topic, 7);
        aos.put(e.topics_container, 8);
        aos.put(e.time_text, 9);
    }

    public r(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private r(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (a) objArr[2], (e) objArr[1], (TextView) objArr[7], (ImageView) objArr[5], (TextView) objArr[9], (TagLayout) objArr[8], (FrameLayout) objArr[3], (ConstraintLayout) objArr[0], (ImageView) objArr[4], (TextView) objArr[6]);
        this.aot = -1;
        this.cQp.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4;
        }
        this.cQd.invalidateAll();
        this.cQc.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cQd.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.cQc.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0020, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0021 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        r0 = r6.cQd;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.cQc;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = 0;
        return r0;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.a.r.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cQd.setLifecycleOwner(lifecycleOwner);
        this.cQc.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return i != 1 ? false : a((a) obj, i2);
        } else {
            return a((e) obj, i2);
        }
    }

    private boolean a(e eVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(a aVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.cQd);
        ViewDataBinding.executeBindingsOn(this.cQc);
    }
}
