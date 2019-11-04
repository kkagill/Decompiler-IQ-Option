package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.b.a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* Access modifiers changed, original: protected */
    @NonNull
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
