package com.iqoption.portfolio.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.iqoption.activity.a;
import com.iqoption.fragment.b.d;
import com.iqoption.portfolio.fragment.k;
import com.iqoption.portfolio.j;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.view.b;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Collection;

public final class PortfolioActivity extends a implements b {
    private static final String TAG = "com.iqoption.portfolio.activity.PortfolioActivity";
    private Collection<b.a> dLP = new ArrayList();

    /* Access modifiers changed, original: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        WebSocketHandler.aTn().cj(TAG);
        setContentView((int) R.layout.activity_portfolio);
        if (bundle == null) {
            k gV = k.gV(0);
            gV.a((j) getIntent().getParcelableExtra("com.iqoption.portfolio:portfolioState"));
            getSupportFragmentManager().beginTransaction().add(R.id.portfolioFragment, gV, "PortfolioFragment").commit();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        WebSocketHandler.aTn().n(TAG, 0);
    }

    public void onBackPressed() {
        for (b.a onBackPressed : this.dLP) {
            if (onBackPressed.onBackPressed()) {
                return;
            }
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName());
            if (!(findFragmentByTag instanceof d) || !((d) findFragmentByTag).onBackPressed()) {
                supportFragmentManager.popBackStack();
                return;
            }
            return;
        }
        if (!aRg().onBackPressed()) {
            com.iqoption.util.a.i(this);
        }
    }

    public void onStop() {
        super.onStop();
    }

    private k aRg() {
        return (k) getSupportFragmentManager().findFragmentById(R.id.portfolioFragment);
    }

    public void a(@NonNull b.a aVar) {
        this.dLP.add(aVar);
    }

    public void b(@NonNull b.a aVar) {
        this.dLP.remove(aVar);
    }
}
