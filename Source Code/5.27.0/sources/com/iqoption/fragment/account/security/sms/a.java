package com.iqoption.fragment.account.security.sms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.e.e;
import com.iqoption.x.R;

/* compiled from: ConfirmPhone2StepAuthViewHelper */
public class a {
    public static final String TAG = "com.iqoption.fragment.account.security.sms.a";
    private e cZG;
    private a cZH;
    private int cZo;
    private long cZp;

    /* compiled from: ConfirmPhone2StepAuthViewHelper */
    public interface a {
        void v(int i, long j);
    }

    public static a b(Context context, ViewGroup viewGroup, int i, long j) {
        a aVar = new a();
        aVar.cZo = i;
        aVar.cZp = j;
        aVar.a(context, viewGroup);
        aVar.cZG.getRoot().setTag(TAG);
        return aVar;
    }

    public View getView() {
        return this.cZG.getRoot();
    }

    public void a(a aVar) {
        this.cZH = aVar;
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZG = (e) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirm_phone_2step_auth_fragment, viewGroup, viewGroup != null);
        this.cZG.a(this);
    }

    public void azK() {
        d(true, true);
        this.cZG.bSF.post(new Runnable() {
            public void run() {
                if (a.this.cZH != null) {
                    a.this.cZH.v(a.this.cZo, a.this.cZp);
                    a.this.d(false, false);
                }
            }
        });
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security-2tep_send"));
    }

    private void d(boolean z, boolean z2) {
        this.cZG.bSF.d(z, z2);
    }
}
