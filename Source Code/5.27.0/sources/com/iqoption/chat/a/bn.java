package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatRoomSupportToolbarBinding */
public abstract class bn extends ViewDataBinding {
    @Nullable
    public final ImageView aRS;
    @NonNull
    public final TextView aRT;
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;

    protected bn(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aRS = imageView;
        this.aRu = textView;
        this.alH = textView2;
        this.aRT = textView3;
    }
}
