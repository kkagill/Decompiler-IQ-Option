package com.iqoption.activity;

import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.iqoption.app.b;
import com.iqoption.app.b.b.h;
import com.iqoption.core.microservices.busapi.response.ForgetUserStatus;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.gdpr.removal.PendingRemovalActivity;
import com.iqoption.system.a.e;
import com.iqoption.util.fragmentstack.FragmentAwareLifecycleListener;
import java.util.List;

/* compiled from: IQActivity */
public abstract class a extends com.iqoption.core.ui.a.a {
    private boolean aiT;
    private boolean aiU;
    private FragmentAwareLifecycleListener aiV;
    @NonNull
    private final a aiW = new a(this);

    /* compiled from: IQActivity */
    private static class a extends e<a> {
        public a(a aVar) {
            super(aVar);
        }

        @com.google.common.b.e
        public void onForgetUserDataChanged(h hVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$a$a$rSj_pHZH18j9YWsI8XNC3AB20iE(this, hVar));
        }

        private /* synthetic */ void a(h hVar) {
            a aVar = (a) this.dUo.get();
            if (aVar != null && !aVar.isDestroyed()) {
                aVar.a((com.iqoption.core.microservices.busapi.response.a) hVar.getValue());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(d dVar) {
    }

    /* Access modifiers changed, original: protected */
    public void zL() {
    }

    public FragmentAwareLifecycleListener zK() {
        return this.aiV;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.aiV = new FragmentAwareLifecycleListener(getSupportFragmentManager());
        getLifecycle().addObserver(this.aiV);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        com.iqoption.app.d.aP(this).aT(true);
        this.aiU = true;
        this.aiW.register();
        a(b.aK(this).Eg());
    }

    public void onPause() {
        super.onPause();
        com.iqoption.app.d.aP(this).aT(false);
        this.aiU = false;
        this.aiW.unregister();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        this.aiT = true;
    }

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!supportFragmentManager.isStateSaved() || VERSION.SDK_INT > 25) {
            List fragments = supportFragmentManager.getFragments();
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) fragments.get(size);
                if (fragment instanceof d) {
                    d dVar = (d) fragment;
                    if (dVar.aly()) {
                        a(dVar);
                        return;
                    }
                }
            }
            zL();
            ActivityCompat.finishAfterTransition(this);
        }
    }

    public void zM() {
        new com.iqoption.dialog.b().show(getSupportFragmentManager(), "ProcessingDialog");
    }

    public void zN() {
        com.iqoption.dialog.b bVar = (com.iqoption.dialog.b) getSupportFragmentManager().findFragmentByTag("ProcessingDialog");
        if (bVar != null) {
            getSupportFragmentManager().beginTransaction().remove(bVar).commitAllowingStateLoss();
        }
    }

    public boolean zO() {
        return this.aiT;
    }

    public boolean zP() {
        return this.aiU;
    }

    private void a(@Nullable com.iqoption.core.microservices.busapi.response.a aVar) {
        if (aVar != null && aVar.abt() == ForgetUserStatus.WAITING) {
            zQ();
        }
    }

    /* Access modifiers changed, original: protected */
    public void zQ() {
        PendingRemovalActivity.v(this);
    }
}
