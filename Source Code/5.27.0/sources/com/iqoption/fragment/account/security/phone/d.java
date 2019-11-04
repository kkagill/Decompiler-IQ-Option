package com.iqoption.fragment.account.security.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.e.k;
import com.iqoption.util.ag;
import com.iqoption.view.text.FormattedTextView.a;
import com.iqoption.x.R;

/* compiled from: ConfirmedPhoneViewHelper */
public class d {
    public static final String TAG = "com.iqoption.fragment.account.security.phone.d";
    private k cZw;

    /* compiled from: ConfirmedPhoneViewHelper */
    /* renamed from: com.iqoption.fragment.account.security.phone.d$1 */
    static class AnonymousClass1 implements a {
        final /* synthetic */ d cZx;

        AnonymousClass1(d dVar) {
            this.cZx = dVar;
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            this.cZx.cZw.bSP.setFrameTopGapSize((float) i);
        }
    }

    public static d a(Context context, ViewGroup viewGroup, int i, long j) {
        d dVar = new d();
        dVar.a(context, viewGroup);
        dVar.cZw.getRoot().setTag(TAG);
        dVar.cZw.bSP.setText(ag.x(i, j));
        dVar.cZw.bSO.setOnSizeChangedListener(new AnonymousClass1(dVar));
        return dVar;
    }

    public View getView() {
        return this.cZw.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZw = (k) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirmed_phone_fragment, viewGroup, viewGroup != null);
    }
}
