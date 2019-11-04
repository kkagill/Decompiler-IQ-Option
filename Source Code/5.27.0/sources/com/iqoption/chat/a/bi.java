package com.iqoption.chat.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatRoomPublicToolbarBinding */
public abstract class bi extends ViewDataBinding {
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;

    protected bi(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aRu = textView;
        this.alH = textView2;
    }
}
