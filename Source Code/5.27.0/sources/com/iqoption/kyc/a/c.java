package com.iqoption.kyc.a;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* compiled from: KycTextChangedEventHelper */
public class c implements OnFocusChangeListener, OnEditorActionListener {
    private static final String TAG = "com.iqoption.kyc.a.c";
    private final EditText Pv;
    private String aZR = "";
    private final boolean aZy;
    private final String dtM;
    private final String dtN;
    private final int fieldId;
    private final String fieldName;

    public c(EditText editText, String str, String str2, String str3, int i, boolean z) {
        this.Pv = editText;
        this.dtM = str;
        this.dtN = str2;
        this.fieldName = str3;
        this.fieldId = i;
        this.aZy = z;
        editText.setOnEditorActionListener(this);
        editText.setOnFocusChangeListener(this);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && this.Pv.getText().toString().compareTo(this.aZR) != 0) {
            a.a(this.dtM, this.dtN, this.fieldName, this.fieldId, this.aZy);
        }
        return false;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.aZR = this.Pv.getText().toString();
        } else if (this.Pv.getText().toString().compareTo(this.aZR) != 0) {
            a.a(this.dtM, this.dtN, this.fieldName, this.fieldId, this.aZy);
        }
    }
}
