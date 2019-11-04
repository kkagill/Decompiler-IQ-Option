package com.iqoption.fragment.account.security.phone;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.microservices.c;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.dto.Event;
import com.iqoption.e.o;
import com.iqoption.util.ag;
import com.iqoption.view.text.j;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: PhoneNumberViewHelper */
public class e {
    public static final String TAG = "com.iqoption.fragment.account.security.phone.e";
    private final PhoneNumberUtil aeY = PhoneNumberUtil.xt();
    private o cZC;
    private b cZD;
    private TextWatcher cZE = new j() {
        public void afterTextChanged(Editable editable) {
            e.this.azJ();
        }
    };

    /* compiled from: PhoneNumberViewHelper */
    public interface b {
        t<com.iqoption.core.microservices.kyc.response.e> s(int i, long j);
    }

    /* compiled from: PhoneNumberViewHelper */
    private static class a extends com.iqoption.system.c.b<e, c> {
        /* synthetic */ a(e eVar, AnonymousClass1 anonymousClass1) {
            this(eVar);
        }

        private a(e eVar) {
            super(eVar);
        }

        /* renamed from: a */
        public void c(e eVar, Throwable th) {
            eVar.d(false, false);
        }
    }

    public static e a(Context context, ViewGroup viewGroup, int i, long j, b bVar) {
        e eVar = new e();
        eVar.a(context, viewGroup);
        eVar.cZC.getRoot().setTag(TAG);
        eVar.p(i, j);
        eVar.cZD = bVar;
        return eVar;
    }

    public View getView() {
        return this.cZC.getRoot();
    }

    private void p(int i, long j) {
        if (i > 0) {
            this.cZC.bSU.setText(ag.x(i, j));
        } else if (j > 0) {
            this.cZC.bSU.setText(String.valueOf(j));
        }
        azJ();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZC = (o) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_phone_number_fragment, viewGroup, viewGroup != null);
        this.cZC.a(this);
        this.cZC.bSU.addTextChangedListener(this.cZE);
        this.cZC.bSU.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EventManager BS = EventManager.BS();
                String str = Event.CATEGORY_TEXT_CHANGED;
                BS.a(new Event(str, "security_phone-country-code"));
                EventManager.BS().a(new Event(str, "security_phone-number"));
            }
        });
        azH();
    }

    private void azH() {
        this.cZC.bSU.setHint(this.aeY.a(this.aeY.a(Locale.getDefault().getCountry(), PhoneNumberType.MOBILE), PhoneNumberFormat.INTERNATIONAL));
    }

    public void azI() {
        this.cZC.bSU.clearFocus();
        try {
            PhoneNumber DV = DV();
            this.aeY.a(DV, PhoneNumberFormat.INTERNATIONAL);
            int xK = DV.xK();
            long yj = DV.yj();
            d(true, true);
            p.a(this.cZD.s(xK, yj), new a(this, null), com.iqoption.core.c.a.biN);
        } catch (NumberParseException e) {
            e.printStackTrace();
        }
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security_phone-send"));
    }

    private void d(boolean z, boolean z2) {
        this.cZC.bSU.setEnabled(z ^ 1);
        this.cZC.bSV.d(z, z2);
    }

    private void azJ() {
        try {
            PhoneNumber DV = DV();
            ConfirmButtonView confirmButtonView = this.cZC.bSV;
            boolean z = DV.yh() && DV.yi() && this.aeY.b(DV);
            confirmButtonView.setEnabled(z);
        } catch (NumberParseException unused) {
            this.cZC.bSV.setEnabled(false);
        }
    }

    private PhoneNumber DV() {
        return this.aeY.b(this.cZC.bSU.getText().toString(), Locale.getDefault().getCountry());
    }
}
