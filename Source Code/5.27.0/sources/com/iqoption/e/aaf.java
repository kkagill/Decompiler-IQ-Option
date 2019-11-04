package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.whatsnew.a;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: TrailingWhatsNewDialogBinding */
public abstract class aaf extends ViewDataBinding {
    @NonNull
    public final ImageView cle;
    @NonNull
    public final FormattedTextView clf;
    @Bindable
    protected a clg;
    @NonNull
    public final TextView cuy;

    public abstract void a(@Nullable a aVar);

    protected aaf(Object obj, View view, int i, TextView textView, ImageView imageView, FormattedTextView formattedTextView) {
        super(obj, view, i);
        this.cuy = textView;
        this.cle = imageView;
        this.clf = formattedTextView;
    }
}
