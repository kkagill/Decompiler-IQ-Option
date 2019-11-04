package com.iqoption.fragment.account.security.touchId;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.iqoption.core.d;
import com.iqoption.e.im;
import com.iqoption.x.R;

/* compiled from: PasscodesErrorFragment */
public class a extends Fragment {
    public static final String TAG = "com.iqoption.fragment.account.security.touchId.a";
    private static final String dai;
    private im daj;

    /* compiled from: PasscodesErrorFragment */
    public interface a {
        void zR();

        void zT();
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".ARG_ERROR_TEXT");
        dai = stringBuilder.toString();
    }

    public static a in(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString(dai, str);
        aVar.setArguments(bundle);
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.daj = (im) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_passcode_error, viewGroup, false);
        this.daj.a(this);
        if (d.Un().Dq()) {
            this.daj.cfa.setBackground(com.iqoption.core.ext.a.n(getContext(), R.drawable.bg_radial_gradient));
        } else {
            this.daj.cfa.setBackground(com.iqoption.core.ext.a.n(getContext(), R.drawable.iq_bg));
        }
        if (!((getTargetFragment() instanceof a) || (getActivity() instanceof a))) {
            Log.e(TAG, "OnFragmentInteractionListener is not implemented by target fragment or activity");
        }
        Bundle arguments = getArguments();
        if (!(arguments == null || arguments.getString(dai) == null)) {
            this.daj.cfq.setText(arguments.getString(dai));
        }
        return this.daj.getRoot();
    }

    public void azT() {
        a azV = azV();
        if (azV != null) {
            azV.zR();
        }
    }

    public void onBackPressed() {
        azT();
    }

    public void azU() {
        a azV = azV();
        if (azV != null) {
            azV.zT();
        }
    }

    private a azV() {
        Fragment targetFragment = getTargetFragment();
        if (getActivity() instanceof a) {
            return (a) getActivity();
        }
        return targetFragment instanceof a ? (a) targetFragment : null;
    }
}
