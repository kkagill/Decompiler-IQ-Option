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

/* compiled from: WhatsNewDialogSpotBinding */
public abstract class abd extends ViewDataBinding {
    @NonNull
    public final ImageView De;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;
    @NonNull
    public final TextView cbl;
    @NonNull
    public final ImageView cle;
    @NonNull
    public final FormattedTextView clf;
    @Bindable
    protected a clg;
    @NonNull
    public final View cva;

    public abstract void a(@Nullable a aVar);

    protected abd(Object obj, View view, int i, View view2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, FormattedTextView formattedTextView) {
        super(obj, view, i);
        this.cva = view2;
        this.De = imageView;
        this.ani = textView;
        this.alH = textView2;
        this.cbl = textView3;
        this.cle = imageView2;
        this.clf = formattedTextView;
    }
}
