package com.iqoption.videoeducation.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.iqoption.analytics.q;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.ui.widget.e;
import com.iqoption.e.nr;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.videoeducation.a.f;
import com.iqoption.videoeducation.j;
import com.iqoption.x.R;

/* compiled from: VideoCatalogsFragment */
public class a extends d {
    public static final String TAG = "com.iqoption.videoeducation.b.a";

    public static a aXy() {
        return new a();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        nr nrVar = (nr) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_video_education_categories, viewGroup, false);
        nrVar.cky.setHasFixedSize(true);
        nrVar.cky.setLayoutManager(new LinearLayoutManager(getContext()));
        nrVar.cky.addItemDecoration(new e(com.iqoption.core.ext.a.c((Fragment) this, (int) R.dimen.dp8)));
        j I = j.I(requireActivity());
        f fVar = new f(new -$$Lambda$a$pd2l8t0-Y5tLSZv1T78YXNruiqY(I));
        nrVar.cky.setAdapter(fVar);
        com.iqoption.core.ui.f.a.B(this).alI().observe(this, new -$$Lambda$a$7XKF4CjCv8H-awDIuM5r85s1WGA(this, I, fVar));
        getLifecycle().addObserver(new EventSenderLifecycleObserver(q.CB(), null));
        return nrVar.getRoot();
    }

    private /* synthetic */ void a(j jVar, f fVar, Boolean bool) {
        if (Boolean.FALSE.equals(bool)) {
            jVar.aXo().observe(this, new -$$Lambda$a$cqri-OHsMXO-0B1BYW340KYZv3I(fVar));
            jVar.aXp().observe(this, new -$$Lambda$a$F3noIoi1jNBV4SS_2EDs7jU768M(this));
        }
    }

    private /* synthetic */ void c(com.iqoption.videoeducation.c.a aVar) {
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(d.TAG);
        if (aVar != null) {
            if (findFragmentByTag == null) {
                supportFragmentManager.beginTransaction().add(R.id.other_fragment, new d(), d.TAG).commitNow();
            }
        } else if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitNow();
        }
    }

    @Nullable
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation loadAnimation = i2 == 0 ? null : AnimationUtils.loadAnimation(requireContext(), i2);
        if (z && loadAnimation != null) {
            com.iqoption.core.ui.f.a.B(this).a(loadAnimation);
        }
        return loadAnimation;
    }
}
