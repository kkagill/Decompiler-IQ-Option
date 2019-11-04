package com.iqoption.feed.feedlist.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.iqoption.feed.a.a;
import com.iqoption.feed.feedlist.b;

/* compiled from: MacroContentViewHolder */
public abstract class c extends b {
    private final a cRo;

    public boolean Ng() {
        return false;
    }

    public void avN() {
    }

    c(a aVar, View view, com.iqoption.feed.feedlist.c.a aVar2) {
        super(view, aVar2);
        this.cRo = aVar;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public ViewGroup avT() {
        return this.cRo.cPG;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public TextView avU() {
        return this.cRo.cPI;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public TextView avV() {
        return this.cRo.cPL;
    }
}
