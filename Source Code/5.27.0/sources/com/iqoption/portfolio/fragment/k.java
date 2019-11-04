package com.iqoption.portfolio.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dialog.overnight.CommissionBottomSheet;
import com.iqoption.dialog.overnight.CommissionBottomSheet.FeeType;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.event.OtnEmissionExecuted;
import com.iqoption.e.vb;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.fragment.r;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.portfolio.activity.PortfolioActivity;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.portfolio.component.viewholder.w;
import com.iqoption.portfolio.e;
import com.iqoption.portfolio.f;
import com.iqoption.portfolio.h;
import com.iqoption.portfolio.i;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.system.a.g;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: PortfolioFragment */
public final class k extends d implements com.iqoption.fragment.dialog.b.a, com.iqoption.fragment.dialog.c.a, l, com.iqoption.portfolio.h.b {
    private static WeakReference<k> dPD = new WeakReference(null);
    private f dLB;
    private m dLU;
    private final a dPE = new a(this, null);
    private final b dPF = new b(this, null);
    private h dPG;
    private i dPH;
    private final com.iqoption.portfolio.i.a dPI = new com.iqoption.portfolio.i.a() {
        public boolean aB(String str, String str2) {
            aj sK = k.this.dLB.aQE().iterator();
            while (sK.hasNext()) {
                com.iqoption.portfolio.d dVar = (com.iqoption.portfolio.d) sK.next();
                if (com.google.common.base.f.equal(com.iqoption.portfolio.component.b.i.b(dVar), str2)) {
                    aj sK2 = dVar.aQy().iterator();
                    while (sK2.hasNext()) {
                        if (com.google.common.base.f.equal(j.v((c) sK2.next()), str)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    };
    private i dPJ;
    private final com.iqoption.portfolio.i.a dPK = new com.iqoption.portfolio.i.a() {
        public boolean aB(String str, String str2) {
            aj sK = k.this.dLB.aQG().iterator();
            while (sK.hasNext()) {
                e eVar = (e) sK.next();
                if (com.google.common.base.f.equal(com.iqoption.portfolio.component.b.l.b(eVar), str2)) {
                    aj sK2 = eVar.GR().iterator();
                    while (sK2.hasNext()) {
                        if (com.google.common.base.f.equal(com.iqoption.portfolio.component.b.m.s((Order) sK2.next()), str)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    };
    private com.iqoption.portfolio.j dPL;
    private boolean dPM;
    private aa<Object> dPN;
    private com.iqoption.portfolio.component.a.b dPO;
    private com.iqoption.portfolio.component.a.c dPP;
    private com.iqoption.portfolio.component.a.d dPQ;
    private com.iqoption.portfolio.component.a.f dPR;
    private com.iqoption.portfolio.component.a.a dPS;
    private com.iqoption.portfolio.component.a.e dPT;
    private aa dPU;
    private aa dPV;
    private aa dPW;
    private com.iqoption.core.ui.widget.i.a dPX;
    private i dPr;

    /* compiled from: PortfolioFragment */
    private static final class a extends com.iqoption.system.a.e<k> {
        /* synthetic */ a(k kVar, AnonymousClass1 anonymousClass1) {
            this(kVar);
        }

        private a(k kVar) {
            super(kVar);
        }

        @com.google.common.b.e
        public void onInvestPortfolioInfoShowed(com.iqoption.fragment.r.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$k$a$sYNdSa0y5-7j1EMdHe40N4U4HU0(this, aVar));
        }

        @com.google.common.b.e
        public void onFilterChosen(com.iqoption.portfolio.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$k$a$Lb_O6LLNqV1hCK8twAPJwqk-Pnw(this, cVar));
        }

        @com.google.common.b.e
        public void onEmissionExecuted(OtnEmissionExecuted otnEmissionExecuted) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$k$a$8pIdC8kS9wzjPKhTksf5atSZN4o(this, otnEmissionExecuted));
        }

        private /* synthetic */ void b(OtnEmissionExecuted otnEmissionExecuted) {
            k kVar = (k) this.dUo.get();
            if (kVar != null && kVar.isAdded()) {
                com.iqoption.fragment.dialog.d.a(kVar.getActivity(), kVar.dPr.aSm(), kVar.aym(), otnEmissionExecuted.getCount().doubleValue(), otnEmissionExecuted.getCommissionVolumeEnrolled(), otnEmissionExecuted.getTotalCommissionEnrolled());
            }
        }
    }

    /* compiled from: PortfolioFragment */
    private static final class b extends g<k> {
        /* synthetic */ b(k kVar, AnonymousClass1 anonymousClass1) {
            this(kVar);
        }

        private b(k kVar) {
            super(kVar);
        }

        @com.google.common.b.e
        public void onBalanceChanged(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$k$b$kUfPz32oRetNFSltNBApall4ejU(this));
        }

        private /* synthetic */ void aSL() {
            k kVar = (k) this.dUo.get();
            if (kVar != null && kVar.isAdded()) {
                kVar.aSH();
            }
        }

        @com.google.common.b.e
        public void onBalanceValueChanged(com.iqoption.service.e.k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$k$b$2W-X6WI_ijIs7WLpAbPC3bSUrDc(this));
        }

        private /* synthetic */ void aSK() {
            k kVar = (k) this.dUo.get();
            if (kVar != null && kVar.isAdded()) {
                kVar.aSI();
            }
        }
    }

    public void b(com.iqoption.mobbtech.connect.response.options.b bVar) {
    }

    public void i(com.iqoption.portfolio.component.b.m mVar) {
    }

    public static k gV(int i) {
        k kVar = new k();
        kVar.setArguments(new com.iqoption.util.e().O("arg.uiState", i).toBundle());
        return kVar;
    }

    public static void c(AppCompatActivity appCompatActivity) {
        d(appCompatActivity);
        com.iqoption.app.d.i("portfolio_opened", true);
    }

    public static void a(Activity activity, com.iqoption.portfolio.j jVar) {
        Intent intent = new Intent(activity, PortfolioActivity.class);
        intent.addFlags(603979776);
        if (jVar != null) {
            intent.putExtra("com.iqoption.portfolio:portfolioState", jVar);
        }
        activity.startActivity(intent);
    }

    private static void b(Activity activity, com.iqoption.portfolio.j jVar) {
        k kVar = (k) dPD.get();
        if (kVar != null) {
            kVar.a(jVar);
        }
        com.iqoption.util.a.i(activity);
    }

    private static void k(Activity activity) {
        activity.overridePendingTransition(0, R.anim.simple_activity_out);
        com.iqoption.util.a.i(activity);
        com.iqoption.app.d.i("portfolio_opened", false);
    }

    private static void d(AppCompatActivity appCompatActivity) {
        com.iqoption.fragment.leftpanel.i.r(appCompatActivity).c(LeftPanelSection.PORTFOIO);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return (z && i == 0) ? null : super.onCreateAnimation(i, z, i2);
    }

    private boolean aSF() {
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getInt("arg.uiState", 0) != 1) {
            return false;
        }
        return true;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.dPM = bundle == null;
        if (aSF()) {
            dPD = new WeakReference(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (aSF() && isRemoving()) {
            com.iqoption.app.d.i("portfolio_opened", false);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.dPG = h.aQJ();
        this.dLB = this.dPG.aQK();
        this.dPH = new i(this.dPI);
        this.dPJ = new i(this.dPK);
        if (bundle != null) {
            this.dPH.T(bundle.getBundle("key.openSelection"));
            this.dPJ.T(bundle.getBundle("key.pendingSelection"));
        }
        this.dLU = new m(getContext());
        aSG();
        if (aSF()) {
            this.dPr = new d(this, layoutInflater, viewGroup);
        } else {
            this.dPr = new b(this, layoutInflater, viewGroup);
        }
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("key.delegate");
            if (bundle2 != null) {
                this.dPr.T(bundle2);
            }
        }
        return this.dPr.getView();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.iqoption.portfolio.j jVar = this.dPL;
        if (jVar != null) {
            a(jVar);
            this.dPL = null;
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.dPr.destroy();
    }

    public void onStart() {
        super.onStart();
        WebSocketHandler.aTn().cj("PortfolioFragment");
        this.dPG.a((com.iqoption.portfolio.h.b) this);
        this.dPE.register();
        this.dPF.register();
        if (!this.dPM) {
            this.dPr.aSp();
        }
    }

    public void onStop() {
        super.onStop();
        WebSocketHandler.aTn().n("PortfolioFragment", 30000);
        this.dPG.b((com.iqoption.portfolio.h.b) this);
        this.dPE.unregister();
        this.dPF.unregister();
    }

    public void onResume() {
        super.onResume();
        this.dPr.resume();
        this.dPM = false;
    }

    public void onPause() {
        super.onPause();
        this.dPr.pause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("key.openSelection", this.dPH.aRa());
        bundle.putBundle("key.pendingSelection", this.dPJ.aRa());
        Bundle aRa = this.dPr.aRa();
        if (aRa != null) {
            bundle.putBundle("key.delegate", aRa);
        }
    }

    public boolean onBackPressed() {
        if (aSF()) {
            return false;
        }
        close();
        return true;
    }

    public void a(com.iqoption.portfolio.j jVar) {
        if (jVar != null) {
            if (getView() == null) {
                this.dPL = jVar;
                return;
            }
            i iVar = new i(this.dPI);
            iVar.T(jVar.aRb());
            if (this.dPH.a(iVar)) {
                this.dPH.T(jVar.aRb());
            } else {
                this.dPH = iVar;
                this.dPr.aSe();
            }
            iVar = new i(this.dPK);
            iVar.T(jVar.aRc());
            if (this.dPJ.a(iVar)) {
                this.dPJ.T(jVar.aRc());
            } else {
                this.dPJ = iVar;
                this.dPr.aSf();
            }
            this.dPr.X(jVar.akF());
            if (!(jVar.aRd() == null || jVar.aRe() == null)) {
                w(this.dLB.w(jVar.aRd().longValue(), jVar.aRe().longValue()));
            }
        }
    }

    public com.iqoption.portfolio.j i(j jVar) {
        com.iqoption.portfolio.j.a aVar = new com.iqoption.portfolio.j.a();
        aVar.V(this.dPH.aRa()).W(this.dPJ.aRa()).U(this.dPr.akF());
        if (jVar != null) {
            aVar.b(Long.valueOf(jVar.getId()), Long.valueOf(jVar.adj()));
        }
        return aVar.aRf();
    }

    public void aQU() {
        this.dPr.aQU();
    }

    public void aQV() {
        this.dPr.aSg();
    }

    public void aQW() {
        this.dPr.aSh();
    }

    public void aQX() {
        this.dPr.aSi();
    }

    public void aQY() {
        this.dPr.aSj();
    }

    public f aQK() {
        return this.dLB;
    }

    public m aRX() {
        return this.dLU;
    }

    public boolean c(com.iqoption.portfolio.component.b.i iVar) {
        String Or = iVar.Or();
        boolean jw = this.dPH.jw(Or);
        this.dPr.a(Or, iVar, jw);
        return jw;
    }

    public boolean b(com.iqoption.portfolio.component.b.i iVar) {
        return this.dPH.ju(iVar.Or());
    }

    public boolean h(j jVar) {
        String Or = jVar.Or();
        String aQZ = this.dPH.aQZ();
        boolean jx = this.dPH.jx(Or);
        this.dPr.r(Or, aQZ, jx);
        return jx;
    }

    public boolean g(j jVar) {
        return this.dPH.jv(jVar.Or());
    }

    /* Access modifiers changed, original: 0000 */
    public void aSG() {
        this.dPO = new com.iqoption.portfolio.component.a.b(this);
        this.dPP = new com.iqoption.portfolio.component.a.c(this);
        this.dPQ = new com.iqoption.portfolio.component.a.d(this);
        this.dPR = new com.iqoption.portfolio.component.a.f(this);
        this.dPS = new com.iqoption.portfolio.component.a.a(this);
        this.dPT = new com.iqoption.portfolio.component.a.e(getContext());
    }

    public com.iqoption.portfolio.component.a.b aRY() {
        return this.dPO;
    }

    public com.iqoption.portfolio.component.a.c aSa() {
        return this.dPP;
    }

    public com.iqoption.portfolio.component.a.d aRZ() {
        return this.dPQ;
    }

    public com.iqoption.portfolio.component.a.f aSb() {
        return this.dPR;
    }

    public com.iqoption.portfolio.component.a.a aSc() {
        return this.dPS;
    }

    public com.iqoption.portfolio.component.a.e aSd() {
        return this.dPT;
    }

    public void o(c cVar) {
        if (this.dPU != null) {
            cb(cVar.getId().longValue());
        }
        this.dPU = null;
    }

    public void ayM() {
        aa aaVar = this.dPU;
        if (aaVar != null) {
            aaVar.setException(new Throwable("canceled sell position"));
        }
        this.dPU = null;
    }

    @NonNull
    private FragmentManager aym() {
        return requireActivity().getSupportFragmentManager();
    }

    public t<?> f(j jVar) {
        this.dPU = aa.vM();
        switch (jVar.aRJ().getInstrumentType()) {
            case FOREX_INSTRUMENT:
                if (!com.iqoption.l.b.aTS().Gd()) {
                    cb(jVar.getId());
                    break;
                }
                com.iqoption.fragment.dialog.c.a(this.dPr.aSm(), aym(), (com.iqoption.fragment.dialog.c.a) this, jVar.aRJ());
                break;
            case CRYPTO_INSTRUMENT:
            case CFD_INSTRUMENT:
                com.iqoption.fragment.dialog.c.a(this.dPr.aSm(), aym(), (com.iqoption.fragment.dialog.c.a) this, jVar.aRJ());
                break;
            case MULTI_INSTRUMENT:
            case DIGITAL_INSTRUMENT:
            case FX_INSTRUMENT:
                com.iqoption.portfolio.a aQA = jVar.aQA();
                if (com.google.common.c.a.c(aQA.getInvest() + aQA.getSellPnl(), 0.0d, 0.001d) > 0) {
                    cb(jVar.getId());
                    break;
                }
                com.iqoption.fragment.dialog.a.a(this.dPr.aSm(), aym(), (com.iqoption.fragment.dialog.c.a) this, jVar.aRJ());
                break;
            default:
                cb(jVar.getId());
                break;
        }
        return this.dPU;
    }

    private void cb(long j) {
        t bZ = this.dPG.bZ(j);
        if (bZ != null) {
            this.dPU.setFuture(bZ);
            v.b(bZ, new o<Object>() {
                public void onSuccess(Object obj) {
                    gX(R.string.your_positioin_has_been_closed);
                    k.this.dPU = null;
                }

                public void l(Throwable th) {
                    gX(R.string.selling_failed_please_try_again_later);
                    k.this.dPU = null;
                }

                private void gX(@StringRes int i) {
                    if (!k.this.aSF()) {
                        c.a(k.this.dPr.aSm(), k.this.aym(), k.this.getString(i));
                    }
                }
            });
            return;
        }
        this.dPU.setException(new Throwable("position in progress"));
    }

    public boolean e(j jVar) {
        return this.dPG.ca(jVar.getId());
    }

    public void d(com.iqoption.portfolio.component.b.g gVar) {
        com.iqoption.dialog.b.b.a(aym(), this.dPr.aSm(), (Position) gVar.aRJ());
        com.iqoption.analytics.k.Ck();
    }

    public void c(com.iqoption.portfolio.b bVar) {
        InstrumentType instrumentType = bVar.getInstrumentType();
        if (instrumentType != null) {
            switch (instrumentType) {
                case FOREX_INSTRUMENT:
                case CRYPTO_INSTRUMENT:
                case CFD_INSTRUMENT:
                case MULTI_INSTRUMENT:
                case DIGITAL_INSTRUMENT:
                case FX_INSTRUMENT:
                    com.iqoption.dialog.a.b.a(aym(), instrumentType, com.iqoption.util.b.B(bVar.aQy()));
                    break;
                case TURBO_INSTRUMENT:
                case BINARY_INSTRUMENT:
                    ImmutableList aQx = bVar.aQx();
                    long[] jArr = new long[aQx.size()];
                    int size = aQx.size();
                    for (int i = 0; i < size; i++) {
                        jArr[i] = ((Long) aQx.get(i)).longValue();
                    }
                    com.iqoption.dialog.a.b.a(aym(), instrumentType, jArr);
                    break;
            }
        }
    }

    public void d(j jVar) {
        if (aSF()) {
            w(jVar.aRJ());
        } else {
            b(getActivity(), i(jVar));
        }
    }

    private void w(c cVar) {
        if (cVar != null) {
            com.iqoption.app.managers.c.GS().h(cVar);
        }
    }

    public void c(com.iqoption.portfolio.component.b.g gVar) {
        CommissionBottomSheet.a(aym(), this.dPr.aSn(), FeeType.OVERNIGHT, gVar.getId());
    }

    public void b(com.iqoption.portfolio.component.b.g gVar) {
        CommissionBottomSheet.a(aym(), this.dPr.aSn(), FeeType.CUSTODIAL, gVar.getId());
    }

    public t<?> m(Rect rect) {
        r.a(aym(), this.dPr.aSm(), rect.right, rect.top);
        this.dPV = aa.vM();
        return this.dPV;
    }

    public t<?> a(com.iqoption.portfolio.component.b.g gVar, Rect rect) {
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = gVar.Jt();
        if (Jt == null) {
            return p.bo(Boolean.valueOf(false));
        }
        int fA;
        Position position = (Position) gVar.aRJ();
        com.iqoption.dialogs.a.b bVar = new com.iqoption.dialogs.a.b(Jt.getActiveId(), Jt.getInstrumentType(), position.getCloseInvestSum(), position.getCreateTime(), position.getCustodialLastAge());
        if (aSF()) {
            fA = fA(R.dimen.dp264);
        } else {
            fA = rect.right + fA(R.dimen.dp4);
        }
        com.iqoption.core.ui.d.c a = com.iqoption.dialogs.a.a.a(bVar, fA, rect.bottom);
        Fragment bh = a.bh(requireContext());
        bh.getLifecycle().addObserver(new PortfolioFragment$4(this));
        aym().beginTransaction().add(this.dPr.aSm(), bh, a.getName()).addToBackStack(a.getName()).commit();
        this.dPW = aa.vM();
        return this.dPW;
    }

    public void reload() {
        com.iqoption.app.managers.c.GS().update();
    }

    public boolean b(com.iqoption.portfolio.component.b.l lVar) {
        String Or = lVar.Or();
        boolean jw = this.dPJ.jw(Or);
        this.dPr.a(Or, lVar, jw);
        return jw;
    }

    public boolean c(com.iqoption.portfolio.component.b.l lVar) {
        return this.dPJ.ju(lVar.Or());
    }

    public boolean e(com.iqoption.portfolio.component.b.m mVar) {
        String Or = mVar.Or();
        String aQZ = this.dPJ.aQZ();
        boolean jx = this.dPJ.jx(Or);
        this.dPr.s(Or, aQZ, jx);
        return jx;
    }

    public boolean f(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPJ.jv(mVar.Or());
    }

    public void l(Order order) {
        if (this.dPN != null) {
            t(order);
        }
        this.dPN = null;
    }

    public void m(Order order) {
        aa aaVar = this.dPN;
        if (aaVar != null) {
            aaVar.setException(new Throwable("cancelled closing order"));
        }
        this.dPN = null;
    }

    public t<?> g(com.iqoption.portfolio.component.b.m mVar) {
        this.dPN = aa.vM();
        com.iqoption.fragment.dialog.b.a(this.dPr.aSm(), aym(), this, mVar.aRP());
        return this.dPN;
    }

    private void t(Order order) {
        t q = this.dPG.q(order);
        if (q != null) {
            this.dPN.setFuture(q);
            v.b(q, new o<Object>() {
                public void onSuccess(Object obj) {
                    k.this.dPN = null;
                }

                public void l(Throwable th) {
                    k.this.dPN = null;
                }
            });
            return;
        }
        this.dPN.setException(new Throwable("order is in progress"));
    }

    public boolean h(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPG.r(mVar.aRP());
    }

    public void j(com.iqoption.portfolio.component.b.m mVar) {
        if (aSF()) {
            TabHelper.IM().u(mVar.Jt());
            com.iqoption.gl.c.aIy().selectLimitOrder(mVar.aRN(), mVar.isCall());
        }
    }

    private void gW(int i) {
        this.dPG.gD(i);
        this.dPr.aSk();
    }

    private void aSH() {
        this.dLU.aRm();
        this.dPr.aSl();
    }

    private void aSI() {
        this.dPr.aSo();
    }

    /* Access modifiers changed, original: 0000 */
    public void close() {
        k(requireActivity());
        com.iqoption.analytics.k.Cj();
    }

    /* Access modifiers changed, original: 0000 */
    public void rx() {
        a(getActivity(), i(null));
        com.iqoption.analytics.k.Ci();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSJ() {
        j.a(this.dPr.aSn(), aym());
        com.iqoption.analytics.k.Ch();
    }

    /* Access modifiers changed, original: 0000 */
    public void bU(@NonNull View view) {
        if (this.dPX == null) {
            this.dPX = new com.iqoption.core.ui.widget.i.a();
            vb vbVar = (vb) DataBindingUtil.inflate(getLayoutInflater(), R.layout.portfolio_filter_options, null, false);
            vbVar.aIq.setAdapter(new com.iqoption.portfolio.component.j(com.iqoption.portfolio.component.b.d.bG(requireContext()), new -$$Lambda$k$5Hpyh3v4shNMH257SevUp37arfM(this), null));
            View root = vbVar.getRoot();
            com.iqoption.core.ext.a.an(root);
            this.dPX.e(root, root.getMeasuredWidth(), root.getMeasuredHeight());
        }
        if (!this.dPX.isShowing()) {
            this.dPX.ak(view);
        }
    }

    private /* synthetic */ w v(ViewGroup viewGroup) {
        w wVar = new w(viewGroup);
        com.iqoption.core.ext.a.a(wVar.itemView, new -$$Lambda$k$nv6jiduWfwcF6qQWmNxYTMWA7Ks(this, wVar));
        return wVar;
    }
}
