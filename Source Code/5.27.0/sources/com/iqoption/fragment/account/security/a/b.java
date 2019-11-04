package com.iqoption.fragment.account.security.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.e.i;
import com.iqoption.view.text.FormattedTextView.a;
import com.iqoption.x.R;

/* compiled from: ConfirmedEmailViewHelper */
public class b {
    public static final String TAG = "com.iqoption.fragment.account.security.a.b";
    private i cZb;

    /* compiled from: ConfirmedEmailViewHelper */
    /* renamed from: com.iqoption.fragment.account.security.a.b$1 */
    static class AnonymousClass1 implements a {
        final /* synthetic */ b cZc;

        AnonymousClass1(b bVar) {
            this.cZc = bVar;
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            this.cZc.cZb.bSN.setFrameTopGapSize((float) i);
        }
    }

    public static b a(Context context, ViewGroup viewGroup, String str) {
        b bVar = new b();
        bVar.a(context, viewGroup);
        bVar.cZb.getRoot().setTag(TAG);
        bVar.cZb.bSN.setText(str);
        bVar.cZb.bSO.setOnSizeChangedListener(new AnonymousClass1(bVar));
        return bVar;
    }

    public View getView() {
        return this.cZb.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZb = (i) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirmed_email_fragment, viewGroup, viewGroup != null);
    }
}
