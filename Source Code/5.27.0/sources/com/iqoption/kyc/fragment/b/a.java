package com.iqoption.kyc.fragment.b;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.e.ja;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycAcceptableDocumentsFragment */
public class a extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.a";
    private boolean aZy;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && a.this.isAdded() && t.a(a.this.getFragmentManager(), a.TAG)) {
                y.j(a.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private ja dyi;

    public String aKn() {
        return "IdentityProving";
    }

    public String aKo() {
        return "AcceptableDocuments";
    }

    public boolean aKp() {
        return false;
    }

    public static a eJ(boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_IS_REGULATED", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.aZy = getArguments().getBoolean("KEY_IS_REGULATED", true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        this.dyi = (ja) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_acceptable_documents, viewGroup, false);
        Lb();
        LinearLayout linearLayout = this.dyi.cfR;
        if (!this.aZy) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        return this.dyi.getRoot();
    }

    private void Lb() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<font color='#ffffff'>");
        stringBuilder.append(getString(R.string.kyc_acceptable_documents));
        stringBuilder.append("</font>");
        s.a((AppCompatActivity) getActivity(), this.dyi.cfS.toolbar, Html.fromHtml(stringBuilder.toString()));
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
