package com.iqoption.chat.a;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatRoomSendLayoutBinding */
public abstract class bl extends ViewDataBinding {
    @NonNull
    public final ImageView aRP;
    @NonNull
    public final EditText aRQ;
    @NonNull
    public final ProgressBar aRR;
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final ImageView aRw;

    protected bl(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, EditText editText, ProgressBar progressBar) {
        super(obj, view, i);
        this.aRP = imageView;
        this.aRw = imageView2;
        this.aRl = linearLayout;
        this.aRQ = editText;
        this.aRR = progressBar;
    }
}
