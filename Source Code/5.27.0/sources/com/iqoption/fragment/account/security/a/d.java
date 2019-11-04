package com.iqoption.fragment.account.security.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.core.ui.widget.c;
import com.iqoption.e.q;
import com.iqoption.util.ak;
import com.iqoption.x.R;

/* compiled from: ResendEmailViewHelper */
public class d {
    public static final String TAG = "com.iqoption.fragment.account.security.a.d";
    private c bJU;
    private q cZk;
    private a cZl;

    /* compiled from: ResendEmailViewHelper */
    public interface a {
        void azw();
    }

    public static d a(Context context, ViewGroup viewGroup, String str, a aVar) {
        d dVar = new d();
        dVar.a(context, viewGroup);
        dVar.cZk.getRoot().setTag(TAG);
        dVar.cZl = aVar;
        a(context, str, dVar);
        return dVar;
    }

    private static void a(Context context, String str, d dVar) {
        ak.a(context.getString(R.string.sending_email_description, new Object[]{str}), str, dVar.cZk.bSY, -1, true);
    }

    public View getView() {
        return this.cZk.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZk = (q) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_resend_email_fragment, viewGroup, viewGroup != null);
        this.cZk.a(this);
        bu(context);
    }

    private void bu(Context context) {
        this.bJU = new c(context, this.cZk.getRoot());
        this.cZk.bJZ.setImageDrawable(this.bJU);
    }

    public void azw() {
        if (this.cZl != null) {
            this.cZk.bSZ.setClickable(false);
            this.cZl.azw();
        }
    }

    public c azz() {
        return this.bJU;
    }
}
