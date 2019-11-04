package com.iqoption.fragment.leftmenu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.google.common.b.e;
import com.google.common.base.Optional;
import com.iqoption.e.px;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.leftmenu.content.c;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.List;

public class LeftMenuFragment extends d {
    private static final String TAG = "com.iqoption.fragment.leftmenu.LeftMenuFragment";
    @Nullable
    private b diC;
    @Nullable
    private b diD;
    public px diE;
    private final a diF = new a(this, null);
    @NonNull
    private f diG;
    @Nullable
    private StatusType diH;
    @Nullable
    private g diI;
    private com.iqoption.fragment.leftmenu.b.b diJ = new com.iqoption.fragment.leftmenu.b.b() {
        public void b(com.iqoption.fragment.leftmenu.content.a aVar) {
            if (LeftMenuFragment.this.diC != null) {
                LeftMenuFragment.this.diC.a(aVar);
            }
        }
    };
    private com.iqoption.fragment.leftmenu.a.a diK = new -$$Lambda$LeftMenuFragment$02zvG_7VEW7PWz6nyJ4IS97_JNo(this);
    private com.iqoption.fragment.leftmenu.a.b.a diL = new com.iqoption.fragment.leftmenu.a.b.a() {
        public void aEh() {
            LeftMenuFragment.this.diH = null;
            LeftMenuFragment.this.diG.aEp();
            LeftMenuFragment.this.aEf();
        }
    };

    public interface b {
        void a(com.iqoption.fragment.leftmenu.content.a aVar);
    }

    private class a extends com.iqoption.system.a.d {
        private a() {
        }

        /* synthetic */ a(LeftMenuFragment leftMenuFragment, AnonymousClass1 anonymousClass1) {
            this();
        }

        @e
        public void onMenuIsUpdated(com.iqoption.fragment.leftmenu.d.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    LeftMenuFragment.this.aEf();
                }
            });
        }
    }

    private static /* synthetic */ void G(Throwable th) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.diG = f.q(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.diE = (px) DataBindingUtil.inflate(layoutInflater, R.layout.left_menu_item_list, viewGroup, false);
        this.diE.cmH.setHasFixedSize(true);
        this.diD = new b(this.diJ, this.diK, this.diL);
        this.diE.cmH.setAdapter(this.diD);
        this.diD.aV(aEg());
        this.diF.register();
        return this.diE.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        a(this.diG.aEn().a(new -$$Lambda$LeftMenuFragment$Jg9Rh5eggqGOlEnc8pizuJXciSE(this), -$$Lambda$LeftMenuFragment$ct_w75mJzLzt9q9wRXAt53247aM.INSTANCE));
        this.diG.aEo().observe(this, new -$$Lambda$LeftMenuFragment$B650GAXepIiaO7Ljzufyh8nJ0P0(this));
    }

    private /* synthetic */ void d(Optional optional) {
        this.diH = (StatusType) optional.pN();
        aEf();
    }

    public void onDestroyView() {
        this.diF.unregister();
        super.onDestroyView();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.diC = (b) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.diC = null;
    }

    public void aEe() {
        aEf();
    }

    private void aEf() {
        b bVar = this.diD;
        if (bVar != null) {
            bVar.aV(aEg());
        }
    }

    @NonNull
    private List<com.iqoption.fragment.leftmenu.content.a> aEg() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this.diI));
        g gVar = this.diI;
        if (!(gVar == null || gVar.aEv() == null)) {
            arrayList.add(new com.iqoption.fragment.leftmenu.content.d(this.diI.aEv()));
        }
        StatusType statusType = this.diH;
        if (statusType != null) {
            arrayList.add(new com.iqoption.fragment.leftmenu.content.b(statusType));
        }
        return arrayList;
    }
}
