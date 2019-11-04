package com.iqoption.portfolio.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.iqoption.e.du;
import com.iqoption.e.vd;
import com.iqoption.fragment.b.a;
import com.iqoption.portfolio.component.b.d;
import com.iqoption.portfolio.component.viewholder.n;
import com.iqoption.portfolio.f;
import com.iqoption.portfolio.h;
import com.iqoption.portfolio.h.b;
import kotlin.l;

/* compiled from: PortfolioFilterChooserBottomSheet */
public final class j extends a implements b {
    private f dLB;
    private du dPB;
    private com.iqoption.portfolio.component.j dPC;

    public void aQW() {
    }

    public void aQX() {
    }

    public void aQY() {
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager) {
        String str = "PortfolioFilterChooserBottomSheet";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, new j(), str).addToBackStack(null).commit();
        }
    }

    /* Access modifiers changed, original: protected */
    public View atP() {
        return this.dPB.bYD;
    }

    /* Access modifiers changed, original: protected */
    public View atQ() {
        return this.dPB.bYo;
    }

    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.dPB = du.d(layoutInflater, viewGroup, false);
        this.dLB = h.aQJ().aQK();
        this.dPB.bYD.setHasFixedSize(true);
        this.dPC = new com.iqoption.portfolio.component.j(d.bG(requireContext()), new -$$Lambda$j$7UZ3ot38MwpGrkMxoiiDi3f34k0(this), new -$$Lambda$j$7eaFWOdw0I_v7Yoy0Vsd-zCRUJs(this));
        this.dPB.bYD.setAdapter(this.dPC);
        return this.dPB.getRoot();
    }

    private /* synthetic */ n u(ViewGroup viewGroup) {
        n nVar = new n(viewGroup);
        com.iqoption.core.ext.a.a(nVar.itemView, new -$$Lambda$j$QiFWV3ps4EZvLPkdxQo7Q2Rvkmc(this, nVar));
        return nVar;
    }

    private /* synthetic */ l a(n nVar) {
        d aRV = nVar.aRV();
        double value = this.dLB.gB(aRV.aQD()).getValue();
        if (value != 0.0d) {
            String mask = aRV.getMask();
            if (mask != null) {
                ((vd) nVar.getBinding()).aoq.setText(String.format(mask, new Object[]{com.iqoption.util.j.r(Double.valueOf(value))}));
            } else {
                ((vd) nVar.getBinding()).aoq.setText(com.iqoption.util.j.r(Double.valueOf(value)));
            }
        } else {
            ((vd) nVar.getBinding()).aoq.setText(null);
        }
        return null;
    }

    public void onStart() {
        super.onStart();
        h.aQJ().a((b) this);
    }

    public void onStop() {
        super.onStop();
        h.aQJ().b((b) this);
    }

    public void aQU() {
        aSE();
    }

    public void aQV() {
        aSE();
    }

    private void aSE() {
        this.dPC.aRk();
    }
}
