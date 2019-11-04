package com.iqoption.e;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.whatsnew.a;
import com.iqoption.view.RobotoTextView;

/* compiled from: GifWhatsNewDialogBinding */
public abstract class oj extends ViewDataBinding {
    @NonNull
    public final ImageView cle;
    @Bindable
    protected a clg;
    @NonNull
    public final WebView cli;
    @NonNull
    public final RobotoTextView clj;
    @NonNull
    public final TextView clk;

    protected oj(Object obj, View view, int i, WebView webView, ImageView imageView, RobotoTextView robotoTextView, TextView textView) {
        super(obj, view, i);
        this.cli = webView;
        this.cle = imageView;
        this.clj = robotoTextView;
        this.clk = textView;
    }
}
