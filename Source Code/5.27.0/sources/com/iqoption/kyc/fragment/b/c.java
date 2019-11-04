package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.core.microservices.kyc.response.document.i;
import com.iqoption.e.jo;
import com.iqoption.e.kw;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.util.List;

/* compiled from: KycDocumentAddressFragment */
public class c extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.c";
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && t.a(c.this.getFragmentManager(), c.TAG)) {
                y.j(c.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dyp;
    private jo dyq;
    @NonNull
    private d dyr;
    private boolean isInProgress;

    /* compiled from: KycDocumentAddressFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> iM(String str);
    }

    /* compiled from: KycDocumentAddressFragment */
    private static class b extends com.iqoption.system.c.b<c, Object> {
        public b(c cVar) {
            super(cVar, Object.class);
        }

        /* renamed from: a */
        public void v(c cVar, Object obj) {
            super.v(cVar, obj);
            cVar.ev(false);
        }

        /* renamed from: a */
        public void c(c cVar, Throwable th) {
            super.c(cVar, th);
            cVar.ev(false);
        }
    }

    public String aKn() {
        return "IdentityProving";
    }

    public String aKo() {
        return "AddressDocument";
    }

    public boolean aKp() {
        return true;
    }

    public static c aLi() {
        return new c();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.dyr = d.as(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dyq = (jo) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_document_address, viewGroup, false);
        this.dyq.cfW.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (!c.this.isInProgress) {
                    c.this.ev(true);
                    p.a(c.this.dyp.iM(c.this.aLj()), new b(c.this), com.iqoption.core.c.a.biN);
                }
            }
        });
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                c.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dyq.cgl.setVisibility(0);
        this.dyr.aLk().observe(this, new -$$Lambda$c$sf69tuoxfKdRL7svWvgVQoOJX9o(this, layoutInflater, viewGroup));
        return this.dyq.getRoot();
    }

    private /* synthetic */ void a(LayoutInflater layoutInflater, ViewGroup viewGroup, List list) {
        this.dyq.cgl.setVisibility(8);
        this.dyq.cgk.removeAllViews();
        for (final i iVar : list) {
            kw kwVar = (kw) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_radio_button, viewGroup, false);
            kwVar.cgb.setText(iVar.getName());
            kwVar.cgc.setTag(iVar);
            kwVar.cgc.setOnClickListener(new com.iqoption.view.d.b() {
                public void M(View view) {
                    c.this.a(iVar);
                }
            });
            this.dyq.cgk.addView(kwVar.getRoot());
        }
        if (!list.isEmpty()) {
            a((i) list.get(0));
        }
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyq.cfS.toolbar);
    }

    private String aLj() {
        int childCount = this.dyq.cgk.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dyq.cgk.getChildAt(i);
            if (childAt.findViewById(R.id.checkMark).getVisibility() == 0) {
                return ((i) childAt.getTag()).getCode();
            }
        }
        return null;
    }

    private void a(i iVar) {
        int childCount = this.dyq.cgk.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dyq.cgk.getChildAt(i);
            childAt.findViewById(R.id.checkMark).setVisibility(((i) childAt.getTag()) == iVar ? 0 : 4);
        }
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
        if (context instanceof a) {
            this.dyp = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyp = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.isInProgress = z;
        this.dyq.cfW.d(z, false);
    }
}
