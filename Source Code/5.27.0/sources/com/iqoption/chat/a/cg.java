package com.iqoption.chat.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatUserTextMessageItemBinding */
public abstract class cg extends ViewDataBinding {
    @NonNull
    public final MessageView aRK;

    protected cg(Object obj, View view, int i, MessageView messageView) {
        super(obj, view, i);
        this.aRK = messageView;
    }
}
