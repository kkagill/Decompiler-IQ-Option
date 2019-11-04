package com.iqoption.fragment.account.security.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.af;
import com.iqoption.dto.Event;
import com.iqoption.e.m;
import com.iqoption.view.text.j;
import com.iqoption.x.R;

/* compiled from: ConfirmEmailViewHelper */
public class a {
    public static final String TAG = "com.iqoption.fragment.account.security.a.a";
    private m cYX;
    private b cYY;
    private TextWatcher cYZ = new j() {
        public void afterTextChanged(Editable editable) {
            a.this.azu();
        }
    };

    /* compiled from: ConfirmEmailViewHelper */
    public interface b {
        t<com.iqoption.mobbtech.connect.response.j> ik(String str);
    }

    /* compiled from: ConfirmEmailViewHelper */
    private static class a extends com.iqoption.system.c.b<a, com.iqoption.mobbtech.connect.response.j> {
        public a(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            aVar.d(false, false);
        }
    }

    public static a a(Context context, ViewGroup viewGroup, String str, b bVar) {
        a aVar = new a();
        aVar.a(context, viewGroup);
        aVar.cYX.getRoot().setTag(TAG);
        aVar.cYY = bVar;
        if (!TextUtils.isEmpty(str)) {
            aVar.cYX.bSR.setText(str);
            aVar.azu();
        }
        return aVar;
    }

    public View getView() {
        return this.cYX.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cYX = (m) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_email_confirm_fragment, viewGroup, viewGroup != null);
        this.cYX.a(this);
        this.cYX.bSQ.setEnabled(false);
        this.cYX.bSR.addTextChangedListener(this.cYZ);
        this.cYX.bSR.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EventManager.BS().a(new Event(Event.CATEGORY_TEXT_CHANGED, "security_email-resend"));
            }
        });
    }

    public void LJ() {
        if (this.cYY != null) {
            String obj = this.cYX.bSR.getText().toString();
            this.cYX.bSR.clearFocus();
            d(true, true);
            p.a(this.cYY.ik(obj), new a(this), com.iqoption.core.c.a.biN);
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security_email-resend-confirm"));
        }
    }

    private void d(boolean z, boolean z2) {
        this.cYX.bSR.setEnabled(z ^ 1);
        this.cYX.bSQ.d(z, z2);
    }

    private void azu() {
        this.cYX.bSQ.setEnabled(af.G(this.cYX.bSR.getText()));
    }
}
