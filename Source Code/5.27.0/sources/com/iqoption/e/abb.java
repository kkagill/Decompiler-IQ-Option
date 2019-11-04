package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.dialog.popup.whatsnew.depositpage.d;

/* compiled from: WhatsNewDialogExperimentalDepositPageBinding */
public abstract class abb extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final TextView bYh;
    @NonNull
    public final ImageView cle;
    @NonNull
    public final TextView cuW;
    @Bindable
    protected d cuY;

    public abstract void a(@Nullable d dVar);

    protected abb(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.bYh = textView;
        this.aIq = recyclerView;
        this.cle = imageView;
        this.cuW = textView2;
    }
}
