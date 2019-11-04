package com.iqoption.fragment.dialog.popup.whatsnew.constructor;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.iqoption.core.analytics.c;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.deposit.l;
import com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.e;
import com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.f;
import com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.g;
import com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.h;
import com.iqoption.fragment.rightpanel.n;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "getPopup", "()Lcom/iqoption/core/microservices/popupserver/response/Popup;", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "close", "", "event", "", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "app_optionXRelease"})
/* compiled from: WhatsNewDialog.kt */
public final class b extends d {
    public static final String TAG = b.class.getName();
    public static final a dfT = new a();
    private HashMap apm;
    private c dfd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewDialog$Companion;", "", "()V", "ARG_POPUP", "", "TAG", "kotlin.jvm.PlatformType", "newInstance", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewDialog;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "app_optionXRelease"})
    /* compiled from: WhatsNewDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b j(com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "popup");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.popup", aVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "action", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WhatsNewDialog.kt */
    static final class b<T> implements Observer<com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a> {
        final /* synthetic */ b dfU;
        final /* synthetic */ d dfV;

        b(b bVar, d dVar) {
            this.dfU = bVar;
            this.dfV = dVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a aVar) {
            if (aVar != null) {
                com.iqoption.fragment.dialog.popup.b.deN.k(this.dfV.aCn().getId().longValue(), aVar.getId());
                if (aVar instanceof com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.a) {
                    this.dfU.close();
                    return;
                }
                String str = "activity";
                FragmentActivity activity;
                com.iqoption.o.d.b bVar;
                if (aVar instanceof g) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        bVar = com.iqoption.o.d.dUK;
                        kotlin.jvm.internal.i.e(activity, str);
                        bVar.F(activity).fj(true);
                    }
                } else if (aVar instanceof com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.d) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        com.iqoption.o.d.b bVar2 = com.iqoption.o.d.dUK;
                        kotlin.jvm.internal.i.e(activity, str);
                        com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.d dVar = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.d) aVar;
                        com.iqoption.o.d.a(bVar2.F(activity), dVar.getInstrumentType(), dVar.getActiveId(), false, 4, null);
                    }
                } else if (aVar instanceof e) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        com.iqoption.o.d.b bVar3 = com.iqoption.o.d.dUK;
                        kotlin.jvm.internal.i.e(activity, str);
                        e eVar = (e) aVar;
                        bVar3.F(activity).a(eVar.getInstrumentType(), eVar.getActiveId(), true);
                    }
                } else if (aVar instanceof h) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        bVar = com.iqoption.o.d.dUK;
                        kotlin.jvm.internal.i.e(activity, str);
                        bVar.F(activity).aUS();
                    }
                } else if (aVar instanceof f) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        kotlin.jvm.internal.i.e(activity, str);
                        com.iqoption.deposit.g.a(activity, true, false, new l(((f) aVar).aCI(), false), 4, null);
                    }
                } else if (aVar instanceof com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.c) {
                    activity = this.dfU.getActivity();
                    if (activity != null) {
                        this.dfU.close(aVar.getId());
                        com.iqoption.fragment.rightpanel.n.a aVar2 = n.doT;
                        kotlin.jvm.internal.i.e(activity, str);
                        com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.c cVar = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.c) aVar;
                        aVar2.s(activity).c(cVar.aiq(), cVar.getInstrumentType());
                    }
                }
            }
        }
    }

    public static final b j(com.iqoption.core.microservices.popupserver.response.a aVar) {
        return dfT.j(aVar);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final com.iqoption.core.microservices.popupserver.response.a aCn() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("arg.popup");
        kotlin.jvm.internal.i.e(parcelable, "args.getParcelable(ARG_POPUP)");
        return (com.iqoption.core.microservices.popupserver.response.a) parcelable;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        d b = d.dfX.b(this, aCn());
        View view = null;
        if (b.isInvalid()) {
            close();
            return null;
        }
        this.dfd = com.iqoption.fragment.dialog.popup.b.deN.f(aCn());
        int i = c.aob[aCn().agi().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            view = a.a(this, layoutInflater, viewGroup, b);
        }
        b.aCp().observe(this, new b(this, b));
        return view;
    }

    public void onDestroyView() {
        super.onDestroyView();
        c cVar = this.dfd;
        if (cVar != null) {
            cVar.Cc();
        }
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    public final void close() {
        close("close");
    }

    private final void close(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && isAdded() && !isStateSaved()) {
            com.iqoption.core.ext.a.t(this).popBackStack();
            com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
            kotlin.jvm.internal.i.e(activity, "activity");
            aVar.A(activity).a(aCn(), str);
        }
    }
}
