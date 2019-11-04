package com.rd.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.draw.a.b;
import com.rd.draw.a.c;

/* compiled from: DrawManager */
public class a {
    private com.rd.draw.data.a eHs = new com.rd.draw.data.a();
    private b eIw = new b(this.eHs);
    private c eIx = new c();
    private com.rd.draw.a.a eIy = new com.rd.draw.a.a(this.eHs);

    @NonNull
    public com.rd.draw.data.a bhe() {
        if (this.eHs == null) {
            this.eHs = new com.rd.draw.data.a();
        }
        return this.eHs;
    }

    public void setClickListener(@Nullable com.rd.draw.a.b.a aVar) {
        this.eIw.setClickListener(aVar);
    }

    public void d(@Nullable MotionEvent motionEvent) {
        this.eIw.d(motionEvent);
    }

    public void b(@Nullable com.rd.animation.b.a aVar) {
        this.eIw.b(aVar);
    }

    public void draw(@NonNull Canvas canvas) {
        this.eIw.draw(canvas);
    }

    public Pair<Integer, Integer> aQ(int i, int i2) {
        return this.eIx.a(this.eHs, i, i2);
    }

    public void a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.eIy.init(context, attributeSet);
    }
}
