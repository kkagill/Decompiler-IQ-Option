package com.iqoption.videoeducation.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.analytics.q;
import com.iqoption.core.microservices.videoeducation.response.g;
import com.iqoption.dto.Event.Builder;
import com.iqoption.fragment.b.h;
import com.iqoption.util.e;
import com.iqoption.videoeducation.i;

/* compiled from: VideoPlayerFragment */
public final class c extends h {
    public static final String TAG = "com.iqoption.videoeducation.b.c";
    private Builder edA;

    private static /* synthetic */ void V(Throwable th) {
    }

    private static /* synthetic */ void aXB() {
    }

    public static c a(long j, Rect rect) {
        c cVar = new c();
        cVar.setArguments(new e().g("arg.videoId", j).a("arg.revealRect", (Parcelable) rect).z("arg.allowMediaController", true).toBundle());
        return cVar;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        long ahs = ahs();
        if (ahs == 0) {
            onClose();
            return;
        }
        g gVar = (g) i.cs(ahs).ble();
        if (gVar == null) {
            onClose();
            return;
        }
        String ajp = gVar.ajp();
        if (TextUtils.isEmpty(ajp)) {
            onClose();
            return;
        }
        this.edA = q.b(gVar.getId(), gVar.Mk(), gVar.ajs());
        getArguments().putString("arg.videoPath", ajp);
        super.onViewCreated(view, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        q.c(this.edA);
    }

    /* Access modifiers changed, original: protected */
    public void axE() {
        super.axE();
        i.ct(ahs()).b(com.iqoption.core.rx.i.aki()).a(-$$Lambda$c$7DJ1VWY8Ccvr9gLI87L-CsYg5JY.INSTANCE, -$$Lambda$c$8RtYK3x559VGjJFmWlGQjIDbt_8.INSTANCE);
    }

    private long ahs() {
        return getArguments().getLong("arg.videoId");
    }
}
