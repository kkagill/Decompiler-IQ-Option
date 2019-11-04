package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatRoomCantSendLayoutBinding */
public abstract class be extends ViewDataBinding {
    @NonNull
    public final ImageView aRO;
    @NonNull
    public final LinearLayout aRl;

    protected be(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView) {
        super(obj, view, i);
        this.aRl = linearLayout;
        this.aRO = imageView;
    }
}
