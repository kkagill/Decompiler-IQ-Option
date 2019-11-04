package com.iqoption.portfolio.component;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.portfolio.fragment.o;

/* compiled from: ViewHolderCreatorBinder */
public abstract class n<VH extends ViewHolder, I, Context extends o> {
    private final Context dMW;

    public abstract void a(int i, VH vh, I i2);

    public abstract VH b(int i, ViewGroup viewGroup);

    public n(Context context) {
        this.dMW = context;
    }

    /* Access modifiers changed, original: protected|final */
    public final Context aRo() {
        return this.dMW;
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutInflater getLayoutInflater() {
        return this.dMW.aRX().layoutInflater;
    }
}
