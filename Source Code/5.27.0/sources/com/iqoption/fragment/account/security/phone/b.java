package com.iqoption.fragment.account.security.phone;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.e.c;
import com.iqoption.util.ag;
import com.iqoption.util.ak;
import com.iqoption.view.text.j;
import com.iqoption.widget.CountDownProgressBar;
import com.iqoption.x.R;

/* compiled from: ConfirmCodeViewHelper */
public class b implements com.iqoption.widget.CountDownProgressBar.b {
    public static final String TAG = "com.iqoption.fragment.account.security.phone.b";
    private int cZo;
    private long cZp;
    private c cZq;
    private b cZr;
    private int cZs;

    /* compiled from: ConfirmCodeViewHelper */
    /* renamed from: com.iqoption.fragment.account.security.phone.b$2 */
    static class AnonymousClass2 implements OnClickListener {
        final /* synthetic */ b cZt;

        AnonymousClass2(b bVar) {
            this.cZt = bVar;
        }

        public void onClick(View view) {
            int visibility = this.cZt.cZq.bSv.getVisibility();
            String str = Event.CATEGORY_TEXT_CHANGED;
            if (visibility == 0) {
                EventManager.BS().a(new Event(str, "security-2tep_code"));
            } else {
                EventManager.BS().a(new Event(str, "security_phone-confirm"));
            }
        }
    }

    /* compiled from: ConfirmCodeViewHelper */
    public interface b {
        t<?> a(int i, long j, String str);

        void m(int i, long j);

        void n(int i, long j);

        void o(int i, long j);
    }

    /* compiled from: ConfirmCodeViewHelper */
    /* renamed from: com.iqoption.fragment.account.security.phone.b$1 */
    static class AnonymousClass1 extends j {
        final /* synthetic */ b cZt;

        AnonymousClass1(b bVar) {
            this.cZt = bVar;
        }

        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            this.cZt.azC();
        }
    }

    /* compiled from: ConfirmCodeViewHelper */
    private static class a extends com.iqoption.system.c.b<b, Object> {
        /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        private a(b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void v(b bVar, Object obj) {
            bVar.cZq.bSz.stop();
        }

        /* renamed from: a */
        public void c(b bVar, Throwable th) {
            bVar.d(false, false);
            bVar.cZq.bSw.setEnabled(true);
            bVar.cZq.bSv.setEnabled(true);
            bVar.cZq.bSx.setEnabled(true);
        }
    }

    public static b a(Context context, ViewGroup viewGroup, int i, long j, int i2, int i3, b bVar) {
        b c = c(context, viewGroup, i, j, i2, i3, bVar);
        c.setTitle(R.string.phone_text);
        c.cZq.bSw.setVisibility(0);
        c.cZq.bSv.setVisibility(8);
        return c;
    }

    public static b b(Context context, ViewGroup viewGroup, int i, long j, int i2, int i3, b bVar) {
        b c = c(context, viewGroup, i, j, i2, i3, bVar);
        c.setTitle(R.string.two_factor_text);
        c.cZq.bSw.setVisibility(8);
        c.cZq.bSv.setVisibility(0);
        return c;
    }

    @NonNull
    private static b c(Context context, ViewGroup viewGroup, int i, long j, int i2, int i3, b bVar) {
        b bVar2 = new b();
        bVar2.cZo = i;
        bVar2.cZp = j;
        bVar2.cZs = i2;
        bVar2.cZr = bVar;
        bVar2.a(context, viewGroup);
        bVar2.cZq.getRoot().setTag(TAG);
        bVar2.b(context, i, j);
        bVar2.azC();
        bVar2.cZq.bSx.addTextChangedListener(new AnonymousClass1(bVar2));
        bVar2.cZq.bSx.setOnClickListener(new AnonymousClass2(bVar2));
        bVar2.gb(i2);
        bVar2.cZq.bSz.setCountDownFinishListener(bVar2);
        bVar2.cZq.bSz.hV(i3);
        return bVar2;
    }

    public View getView() {
        return this.cZq.getRoot();
    }

    public void setTitle(int i) {
        this.cZq.bSy.setText(i);
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZq = (c) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirm_code_fragment, viewGroup, viewGroup != null);
        this.cZq.bSz.setStartTimeMs(300000);
        this.cZq.a(this);
    }

    public String azB() {
        int i = this.cZs;
        return i > 0 ? String.valueOf(i) : "";
    }

    private void gb(int i) {
        if (i > 0) {
            this.cZq.bSx.setText(String.valueOf(i));
            azC();
        }
    }

    public void azC() {
        this.cZq.bSA.setEnabled(this.cZq.bSx.length() >= 6);
    }

    private void b(Context context, int i, long j) {
        String x = ag.x(i, j);
        if (TextUtils.isEmpty(x)) {
            this.cZq.bSx.setEnabled(false);
            return;
        }
        this.cZq.bSx.setEnabled(true);
        ak.a(context.getString(R.string.sending_phone_code_description, new Object[]{x}), x, this.cZq.bSq, -1, true);
    }

    public void azD() {
        this.cZq.bSx.clearFocus();
        this.cZq.bSw.setEnabled(false);
        this.cZq.bSv.setEnabled(false);
        this.cZq.bSx.setEnabled(false);
        d(true, true);
        p.a(this.cZr.a(this.cZo, this.cZp, this.cZq.bSx.getText().toString().trim()), new a(this, null), com.iqoption.core.c.a.biN);
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security_phone-confirm"));
    }

    public void azE() {
        this.cZq.bSx.clearFocus();
        this.cZr.m(this.cZo, this.cZp);
    }

    public void azF() {
        this.cZq.bSx.clearFocus();
        this.cZr.o(this.cZo, this.cZp);
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security-2tep_cancel"));
    }

    public void a(CountDownProgressBar countDownProgressBar) {
        this.cZq.bSx.clearFocus();
        this.cZr.n(this.cZo, this.cZp);
    }

    private void d(boolean z, boolean z2) {
        this.cZq.bSx.setEnabled(z ^ 1);
        this.cZq.bSw.setEnabled(z ^ 1);
        this.cZq.bSA.d(z, z2);
    }
}
