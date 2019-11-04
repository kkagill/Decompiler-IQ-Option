package com.iqoption.fragment.account.security.sms;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import com.google.common.b.e;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.b.b.n;
import com.iqoption.dto.Event;
import com.iqoption.e.s;
import com.iqoption.util.ag;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: TurnOn2StepAuthViewHelper */
public class b implements OnCheckedChangeListener {
    public static final String TAG = "com.iqoption.fragment.account.security.sms.b";
    private s cZQ;
    private b cZR;
    private int cZo;
    private long cZp;

    /* compiled from: TurnOn2StepAuthViewHelper */
    private static class a {
        private final WeakReference<b> cZS;

        private a(b bVar) {
            this.cZS = new WeakReference(bVar);
        }

        @e
        public void authIsTwoFactor(com.iqoption.app.b.b.c cVar) {
            b bVar = (b) this.cZS.get();
            if (bVar != null && ViewCompat.isAttachedToWindow(bVar.getView()) && ((Boolean) cVar.getValue()).booleanValue() != bVar.cZQ.bTd.isChecked()) {
                bVar.dA(((Boolean) cVar.getValue()).booleanValue());
                bVar.cZQ.bTd.d(false, false);
            }
        }

        @e
        public void phoneChanged(n nVar) {
            b bVar = (b) this.cZS.get();
            if (bVar != null && ViewCompat.isAttachedToWindow(bVar.getView())) {
                int i;
                long j;
                Context context = bVar.getView().getContext();
                PhoneNumber DV = com.iqoption.app.b.aK(context).DV();
                if (DV == null) {
                    i = 0;
                } else {
                    i = DV.xK();
                }
                bVar.cZo = i;
                if (DV == null) {
                    j = 0;
                } else {
                    j = DV.yj();
                }
                bVar.cZp = j;
                bVar.b(context, bVar.cZo, bVar.cZp);
            }
        }
    }

    /* compiled from: TurnOn2StepAuthViewHelper */
    public interface b {
        t<? extends com.iqoption.core.microservices.c> a(boolean z, int i, long j);
    }

    /* compiled from: TurnOn2StepAuthViewHelper */
    private static class c extends com.iqoption.system.c.b<b, com.iqoption.core.microservices.c> {
        private final boolean cZT;

        public c(b bVar, boolean z) {
            super(bVar);
            this.cZT = z;
        }

        /* renamed from: a */
        public void v(b bVar, com.iqoption.core.microservices.c cVar) {
            if (!this.cZT) {
                e(bVar);
            }
        }

        /* renamed from: a */
        public void c(b bVar, Throwable th) {
            e(bVar);
            bVar.dA(com.iqoption.app.b.aK(bVar.getView().getContext()).Ec());
        }

        private static void e(b bVar) {
            bVar.cZQ.bTd.d(false, false);
        }
    }

    public static b a(Context context, ViewGroup viewGroup, int i, long j, boolean z, b bVar) {
        b bVar2 = new b();
        bVar2.cZo = i;
        bVar2.cZp = j;
        bVar2.cZR = bVar;
        bVar2.a(context, viewGroup);
        bVar2.cZQ.getRoot().setTag(TAG);
        bVar2.dA(z);
        bVar2.cZQ.bTd.setOnCheckedChangeListener(bVar2);
        bVar2.b(context, i, j);
        return bVar2;
    }

    public Object azN() {
        return new a();
    }

    private void dA(boolean z) {
        this.cZQ.bTd.setOnCheckedChangeListener(null);
        this.cZQ.bTd.setChecked(z);
        this.cZQ.bTe.setText(z ? R.string.turn_off : R.string.turn_on);
        this.cZQ.bTd.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        dB(z);
    }

    public void dB(boolean z) {
        this.cZQ.bTd.d(true, true);
        p.a(this.cZR.a(z, this.cZo, this.cZp), new c(this, z), com.iqoption.core.c.a.biN);
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "security_2step-auth-set").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }

    public void b(Context context, int i, long j) {
        String x = ag.x(i, j);
        if (TextUtils.isEmpty(x) || "0".equals(x)) {
            Log.e(TAG, "phone number is not set");
            this.cZQ.bTc.setText("");
            return;
        }
        this.cZQ.bTc.setText(context.getString(R.string.via_phone_number, new Object[]{x}));
    }

    public View getView() {
        return this.cZQ.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZQ = (s) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_turn_on_2step_auth_fragment, viewGroup, viewGroup != null);
        this.cZQ.a(this);
    }
}
