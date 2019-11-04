package com.iqoption.core.analytics.b;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.iqoption.core.d;

/* compiled from: TextChangedEventHelper */
public class a implements OnFocusChangeListener, OnEditorActionListener {
    private static final String TAG = "com.iqoption.core.analytics.b.a";
    private final EditText Pv;
    private String aZR = "";
    private final String eventName;

    public a(EditText editText, String str) {
        this.Pv = editText;
        this.eventName = str;
        editText.setOnEditorActionListener(this);
        editText.setOnFocusChangeListener(this);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            try {
                if (this.Pv.getText().toString().compareTo(this.aZR) != 0) {
                    Uu();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.aZR = this.Pv.getText().toString();
            } catch (Exception unused) {
            }
        } else if (this.Pv.getText().toString().compareTo(this.aZR) != 0) {
            Uu();
        }
    }

    /* Access modifiers changed, original: protected */
    public void Uu() {
        d.Um().EC().dk(this.eventName);
    }
}
