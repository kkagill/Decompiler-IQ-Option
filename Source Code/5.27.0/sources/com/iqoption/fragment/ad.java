package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationManagerCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.util.concurrent.p;
import com.iqoption.a.g;
import com.iqoption.a.g.b;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.iqbus.Subscriptions;
import com.iqoption.dto.entity.iqbus.Subscriptions.Category;
import com.iqoption.dto.entity.iqbus.Subscriptions.Group;
import com.iqoption.e.mz;
import com.iqoption.fragment.b.e;
import com.iqoption.util.aj;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PushSettingsFragment */
public class ad extends e {
    public static final String TAG = "com.iqoption.fragment.ad";
    private mz cWO;
    private g cWP;
    private a cWQ;
    AnimationDrawable cWR;
    protected Builder cWS;

    /* compiled from: PushSettingsFragment */
    private static class a extends ItemAnimator implements AnimatorListener, AnimatorUpdateListener {
        private ValueAnimator cWU = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        private ArrayList<ViewHolder> cWV = new ArrayList();

        public boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
            return false;
        }

        public boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2) {
            return false;
        }

        public boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
            return false;
        }

        public void endAnimation(ViewHolder viewHolder) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public a() {
            this.cWU.setDuration(getAddDuration());
            this.cWU.setStartDelay(250);
            this.cWU.addUpdateListener(this);
            this.cWU.addListener(this);
        }

        public boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
            if (viewHolder.getItemViewType() == 1) {
                this.cWV.add(viewHolder);
                View AO = ((b) viewHolder).AO();
                AO.setAlpha(0.0f);
                ((MarginLayoutParams) AO.getLayoutParams()).setMargins(0, -AO.getHeight(), 0, 0);
                AO.requestLayout();
            }
            return true;
        }

        public void runPendingAnimations() {
            this.cWU.start();
        }

        public void endAnimations() {
            this.cWU.end();
        }

        public boolean isRunning() {
            return this.cWU.isRunning();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = this.cWV.iterator();
            while (it.hasNext()) {
                View AO = ((b) ((ViewHolder) it.next())).AO();
                AO.setAlpha(floatValue);
                ((MarginLayoutParams) AO.getLayoutParams()).setMargins(0, (int) ((floatValue - 1.0f) * ((float) AO.getHeight())), 0, 0);
                AO.requestLayout();
            }
        }

        public void onAnimationEnd(Animator animator) {
            Iterator it = this.cWV.iterator();
            while (it.hasNext()) {
                dispatchAnimationFinished((ViewHolder) it.next());
            }
            this.cWV.clear();
        }

        public void onAnimationCancel(Animator animator) {
            Iterator it = this.cWV.iterator();
            while (it.hasNext()) {
                ViewHolder viewHolder = (ViewHolder) it.next();
                View AO = ((b) viewHolder).AO();
                AO.setAlpha(1.0f);
                ((MarginLayoutParams) AO.getLayoutParams()).setMargins(0, 0, 0, 0);
                AO.requestLayout();
                dispatchAnimationFinished(viewHolder);
            }
            this.cWV.clear();
        }
    }

    public String getEventName() {
        return "push-settings";
    }

    public static ad ayf() {
        return new ad();
    }

    public static void f(FragmentManager fragmentManager) {
        ad ayf = ayf();
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, ayf, TAG).addToBackStack(TAG).commit();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cWO = (mz) DataBindingUtil.inflate(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), (int) R.style.PushSettingsTheme)), R.layout.fragment_push_settings, viewGroup, false);
        this.cWO.a(this);
        this.cWO.ciw.setLayoutManager(new LinearLayoutManager(getContext()));
        this.cWP = new g();
        this.cWP.setHasStableIds(true);
        this.cWO.ciw.setAdapter(this.cWP);
        this.cWQ = new a();
        this.cWQ.setAddDuration(250);
        this.cWO.ciw.setItemAnimator(this.cWQ);
        this.cWO.cit.setBackgroundResource(R.drawable.push_settings_alert_anim);
        this.cWR = (AnimationDrawable) this.cWO.cit.getBackground();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onResume() {
        super.onResume();
        if (NotificationManagerCompat.from(getContext()).areNotificationsEnabled()) {
            this.cWS = null;
            this.cWO.Dk.setVisibility(0);
            this.cWO.ciw.setVisibility(0);
            this.cWO.ciu.setVisibility(8);
            p.a(com.iqoption.mobbtech.connect.request.api.e.aPw(), new com.iqoption.system.c.b<ad, Subscriptions>(this) {
                /* renamed from: b */
                public void v(ad adVar, Subscriptions subscriptions) {
                    if (adVar.isAdded()) {
                        adVar.a(subscriptions);
                    }
                }

                /* renamed from: a */
                public void c(ad adVar, Throwable th) {
                    if (adVar.isAdded()) {
                        ad.this.cWO.Dk.setVisibility(8);
                        com.iqoption.app.a.b.aQ(ad.this.getContext());
                    }
                }
            }, com.iqoption.core.c.a.biN);
            return;
        }
        this.cWS = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "push-settings-enabling");
        this.cWO.Dk.setVisibility(8);
        this.cWO.ciw.setVisibility(8);
        this.cWO.ciu.setVisibility(0);
        this.cWO.civ.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "push-settings-enabling_go-to-settings"));
                aj.bm(ad.this.getContext());
            }
        });
        this.cWR.start();
    }

    public void onPause() {
        super.onPause();
        if (this.cWS != null) {
            EventManager.BS().a(this.cWS.calcDuration().build());
        }
    }

    public View getContentView() {
        return this.cWO.getRoot();
    }

    public void ayg() {
        onClose();
    }

    private void a(Subscriptions subscriptions) {
        this.cWO.Dk.setVisibility(8);
        if (subscriptions == null || subscriptions.categories == null) {
            com.iqoption.app.a.b.aQ(getContext());
            return;
        }
        this.cWP.AN();
        Iterator it = subscriptions.categories.iterator();
        while (it.hasNext()) {
            Category category = (Category) it.next();
            this.cWP.a(category.id, category.title);
            if (category.groups != null) {
                Iterator it2 = category.groups.iterator();
                while (it2.hasNext()) {
                    Group group = (Group) it2.next();
                    this.cWP.a(group.id, group.title, group.description, group.enabled.booleanValue());
                }
            }
        }
        this.cWP.notifyDataSetChanged();
    }
}
