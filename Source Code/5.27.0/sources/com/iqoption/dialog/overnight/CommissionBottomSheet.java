package com.iqoption.dialog.overnight;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.tradingengine.response.custodial.CustordialHistory;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.OvernightHistory;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.e.dm;
import com.iqoption.e.ie;
import com.iqoption.util.j;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class CommissionBottomSheet extends com.iqoption.fragment.b.a {
    private g cKn;
    private b cKo;
    private dm cKp;

    public enum FeeType {
        OVERNIGHT,
        CUSTODIAL
    }

    private static abstract class b {
        final Resources aOg;
        final String cHM;
        final int cKs;
        final long positionId;

        @NonNull
        public abstract String atS();

        @NonNull
        public abstract String atT();

        @NonNull
        public abstract String atU();

        public abstract t<c> atV();

        protected b(@NonNull Resources resources, @NonNull String str, int i, long j) {
            this.aOg = resources;
            this.cHM = str;
            this.cKs = i;
            this.positionId = j;
        }

        /* Access modifiers changed, original: final */
        @NonNull
        public final String bB(long j) {
            for (com.iqoption.portfolio.d aQy : com.iqoption.portfolio.h.aQJ().aQK().aQE()) {
                aj sK = aQy.aQy().iterator();
                while (sK.hasNext()) {
                    com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) sK.next();
                    if (cVar.getId().longValue() == j) {
                        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(cVar.getActiveId()), cVar.getInstrumentType());
                        if (a != null) {
                            return com.iqoption.core.microservices.tradingengine.response.active.d.B(a);
                        }
                    }
                }
            }
            return "";
        }
    }

    private static class c {
        final String cKt;
        final List<e> iA;

        c(String str, List<e> list) {
            this.cKt = str;
            this.iA = list;
        }
    }

    private static class a extends b {
        a(@NonNull Resources resources, @NonNull String str, int i, long j) {
            super(resources, str, i, j);
        }

        @NonNull
        public String atS() {
            return this.aOg.getString(R.string.custodial_fee);
        }

        @NonNull
        public String atT() {
            return this.aOg.getString(R.string.is_a_fee_that_decrease_your_investment);
        }

        @NonNull
        public String atU() {
            return this.aOg.getString(R.string.custodial_fee_charged);
        }

        /* Access modifiers changed, original: 0000 */
        public t<c> atV() {
            return v.a(com.iqoption.core.rx.g.c(com.iqoption.core.microservices.tradingengine.e.aV(this.positionId)), new com.google.common.base.d<CustordialHistory.List, c>() {
                /* renamed from: a */
                public c apply(CustordialHistory.List list) {
                    CustordialHistory.List list2 = list;
                    if (list2 == null) {
                        return null;
                    }
                    Collections.sort(list2, -$$Lambda$CommissionBottomSheet$a$1$znNqt4OLDJVgk2B467RdjWLxIZQ.INSTANCE);
                    a aVar = a.this;
                    String bB = aVar.bB(aVar.positionId);
                    double d = 0.0d;
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CustordialHistory custordialHistory = (CustordialHistory) it.next();
                        arrayList.add(new e(custordialHistory.aiw(), bB, com.iqoption.core.util.e.a(-custordialHistory.aiv(), a.this.cKs, a.this.cHM, false, false, true, true, RoundingMode.HALF_EVEN), TimeUtil.bRM.ay(custordialHistory.aiw())));
                        d += custordialHistory.aiv();
                    }
                    return new c(com.iqoption.core.util.e.a(-d, a.this.cKs, a.this.cHM, false, false, true, true, RoundingMode.HALF_EVEN), arrayList);
                }
            });
        }
    }

    private static class e implements com.iqoption.core.ui.widget.recyclerview.adapter.a.d<Long> {
        final String assetName;
        private final long cKu;
        final String cKv;
        final String cKw;

        e(long j, String str, String str2, String str3) {
            this.cKu = j;
            this.assetName = str;
            this.cKv = str2;
            this.cKw = str3;
        }

        public Long getId() {
            return Long.valueOf(this.cKu);
        }
    }

    private static class h extends b {
        h(@NonNull Resources resources, @NonNull String str, int i, long j) {
            super(resources, str, i, j);
        }

        @NonNull
        public String atS() {
            return this.aOg.getString(R.string.overnight_fee);
        }

        @NonNull
        public String atT() {
            return this.aOg.getString(R.string.overnight_fee_is_commission_for_transferring);
        }

        @NonNull
        public String atU() {
            return this.aOg.getString(R.string.overnight_fee_charged);
        }

        public t<c> atV() {
            return v.a(com.iqoption.mobbtech.connect.request.a.a.b.z(OvernightHistory.List.class).fo("get-overnight-history").k(PendingOrderWrapper.POSITION_ID, Long.valueOf(this.positionId)).UA(), new com.google.common.base.d<OvernightHistory.List, c>() {
                /* renamed from: a */
                public c apply(OvernightHistory.List list) {
                    OvernightHistory.List list2 = list;
                    if (list2 == null) {
                        return null;
                    }
                    Collections.sort(list2, -$$Lambda$CommissionBottomSheet$h$1$9q_DQtthjzQjZg5WG2qseHTb__s.INSTANCE);
                    h hVar = h.this;
                    String bB = hVar.bB(hVar.positionId);
                    double d = 0.0d;
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        OvernightHistory overnightHistory = (OvernightHistory) it.next();
                        arrayList.add(new e(overnightHistory.filledAt, bB, com.iqoption.core.util.e.a(-overnightHistory.amountDelta, h.this.cKs, h.this.cHM, false, false, true, true, RoundingMode.HALF_EVEN), TimeUtil.bRM.ay(overnightHistory.filledAt)));
                        d += overnightHistory.amountDelta;
                    }
                    return new c(com.iqoption.core.util.e.a(-d, h.this.cKs, h.this.cHM, false, false, true, true, RoundingMode.HALF_EVEN), arrayList);
                }
            });
        }
    }

    private static class d extends com.iqoption.system.c.b<CommissionBottomSheet, c> {
        d(CommissionBottomSheet commissionBottomSheet) {
            super(commissionBottomSheet);
        }

        /* renamed from: a */
        public void v(@NonNull CommissionBottomSheet commissionBottomSheet, @Nullable c cVar) {
            super.v(commissionBottomSheet, cVar);
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CommissionBottomSheet$d$sS8PIyaTGAu4f4OWvYuIs1JvNm0(commissionBottomSheet, cVar));
        }

        /* renamed from: a */
        public void c(@NonNull CommissionBottomSheet commissionBottomSheet, Throwable th) {
            super.c(commissionBottomSheet, th);
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CommissionBottomSheet$d$dpwgeTPO_YKLLhyRDoL2DSGytuA(commissionBottomSheet));
        }
    }

    private static class g extends com.iqoption.core.ui.widget.recyclerview.adapter.a<f, e> {
        @NonNull
        private final b cKo;

        /* synthetic */ g(b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        private g(@NonNull b bVar) {
            this.cKo = bVar;
        }

        @NonNull
        /* renamed from: B */
        public f onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new f(viewGroup, this.cKo);
        }

        /* renamed from: a */
        public void onBindViewHolder(@NonNull f fVar, int i) {
            fVar.bB(fp(i));
        }
    }

    private static class f extends com.iqoption.core.ui.widget.recyclerview.a.e<ie, e> {
        @NonNull
        private b cKo;

        f(ViewGroup viewGroup, @NonNull b bVar) {
            super(R.layout.fee_history_item, viewGroup, null);
            this.cKo = bVar;
        }

        public void a(ie ieVar, e eVar) {
            ieVar.ceE.setText(this.cKo.atU());
            ieVar.aoh.setText(eVar.assetName);
            ieVar.bYx.setText(eVar.cKv);
            ieVar.ceF.setText(eVar.cKw);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean amB() {
        return false;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, @NonNull FeeType feeType, long j) {
        a(fragmentManager, i, new com.iqoption.util.e().aF("arg.feeType", feeType.name()).g("arg.positionId", j).toBundle());
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle) {
        String str = "CommissionBottomSheet";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, J(bundle), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commit();
        }
    }

    private static CommissionBottomSheet J(Bundle bundle) {
        CommissionBottomSheet commissionBottomSheet = new CommissionBottomSheet();
        commissionBottomSheet.setArguments(bundle);
        return commissionBottomSheet;
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cKp = (dm) DataBindingUtil.inflate(layoutInflater, R.layout.bottom_sheet_commission, viewGroup, false);
        this.cKp.bYq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                CommissionBottomSheet.this.onClose();
            }
        });
        Context requireContext = requireContext();
        Bundle arguments = getArguments();
        if (arguments == null) {
            onClose();
            return null;
        }
        FeeType valueOf = FeeType.valueOf(arguments.getString("arg.feeType"));
        long j = arguments.getLong("arg.positionId");
        String DO = j.DO();
        int aWH = j.aWH();
        if (valueOf == FeeType.OVERNIGHT) {
            this.cKo = new h(getResources(), DO, aWH, j);
        } else {
            this.cKo = new a(getResources(), DO, aWH, j);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext, linearLayoutManager.getOrientation());
        Drawable drawable = ContextCompat.getDrawable(requireContext, R.drawable.separator_black);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        this.cKp.bYv.setText(this.cKo.atS());
        this.cKp.bYu.setText(this.cKo.atT());
        this.cKp.aIq.setLayoutManager(linearLayoutManager);
        this.cKp.aIq.addItemDecoration(dividerItemDecoration);
        this.cKp.aIq.setHasFixedSize(true);
        this.cKn = new g(this.cKo, null);
        this.cKp.aIq.setAdapter(this.cKn);
        return this.cKp.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public View atP() {
        return this.cKp.bYt;
    }

    /* Access modifiers changed, original: protected */
    public View atQ() {
        return this.cKp.bYo;
    }

    /* Access modifiers changed, original: protected */
    public int atR() {
        return (int) (((float) getResources().getDisplayMetrics().heightPixels) * 0.5625f);
    }

    public void onResume() {
        super.onResume();
        v.b(this.cKo.atV(), new d(this));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(c cVar) {
        this.cKp.bYs.setVisibility(8);
        if (cVar != null) {
            this.cKp.bYx.setText(cVar.cKt);
            this.cKn.w(cVar.iA);
            return;
        }
        com.iqoption.app.a.b.Gq();
    }
}
