package com.iqoption.kyc.fragment.e;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.lc;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycRisksFragment */
public class a extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.e.a";
    @Nullable
    private g dtm;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && a.this.isAdded() && t.a(a.this.getFragmentManager(), a.TAG)) {
                y.j(a.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private lc dzQ;
    @Nullable
    private String dzR;

    /* compiled from: KycRisksFragment */
    private class a extends com.iqoption.system.c.b<a, Pair<String, String>> {
        public a(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void v(a aVar, Pair<String, String> pair) {
            super.v(aVar, pair);
            aVar.ev(false);
            aVar.dzR = (String) pair.first;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<font color='#ffffff'>");
            stringBuilder.append(aVar.dzR);
            stringBuilder.append("</font>");
            s.a((AppCompatActivity) a.this.getActivity(), a.this.dzQ.cfS.toolbar, Html.fromHtml(stringBuilder.toString()));
            stringBuilder = new StringBuilder();
            stringBuilder.append("<html><head><style type=\"text/css\">body{color: rgb(255,255,255); background-color: rgba(0,0,0,0);} ol li { list-style-type: none; }</style></head><body>");
            stringBuilder.append((String) pair.second);
            stringBuilder.append("</body></html>");
            aVar.dzQ.Aa.loadData(stringBuilder.toString(), "text/html; charset=utf-8", null);
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            super.c(aVar, th);
            aVar.ev(false);
            MobbErrorException.R(th);
        }
    }

    @NonNull
    public String aKn() {
        return "TradingExperience";
    }

    @NonNull
    public String aKo() {
        return "RiskDisclosure";
    }

    public boolean aKp() {
        return false;
    }

    public static a g(KycState kycState) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzQ = (lc) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_risks_old, viewGroup, false);
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            private boolean dzT;

            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                this.dzT = true;
                a.this.Lb();
            }

            /* Access modifiers changed, original: protected */
            public void aKs() {
                super.aKs();
                if (this.dzT && a.this.dtm != null) {
                    com.iqoption.kyc.a.a.l(a.this.aKn(), a.this.aKo(), a.this.dtm.Er());
                }
                this.dzT = false;
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        this.dzQ.Aa.setBackgroundColor(0);
        this.dzQ.Aa.setLayerType(1, null);
        this.dzQ.Aa.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                a.this.dzQ.Aa.setBackgroundColor(0);
                a.this.dzQ.Aa.setLayerType(1, null);
                a.this.dzQ.Aa.loadUrl("javascript:document.body.style.setProperty(\"color\", \"white\");");
            }
        });
        ev(true);
        p.a(this.dtm.aIT(), new a(this), com.iqoption.core.c.a.biN);
        return this.dzQ.getRoot();
    }

    private void Lb() {
        CharSequence fromHtml;
        String str = "</font>";
        String str2 = "<font color='#ffffff'>";
        StringBuilder stringBuilder;
        if (TextUtils.isEmpty(this.dzR)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(getString(R.string.kyc_risk_disclosure));
            stringBuilder.append(str);
            fromHtml = Html.fromHtml(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(this.dzR);
            stringBuilder.append(str);
            fromHtml = Html.fromHtml(stringBuilder.toString());
        }
        s.a((AppCompatActivity) getActivity(), this.dzQ.cfS.toolbar, fromHtml);
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.dzQ.bYW.setVisibility(z ? 0 : 8);
    }
}
