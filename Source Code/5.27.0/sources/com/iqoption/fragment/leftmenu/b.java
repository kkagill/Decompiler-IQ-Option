package com.iqoption.fragment.leftmenu;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.collect.i;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.dto.Event;
import com.iqoption.e.pp;
import com.iqoption.e.pr;
import com.iqoption.e.pt;
import com.iqoption.e.pv;
import com.iqoption.e.pz;
import com.iqoption.e.qb;
import com.iqoption.e.qd;
import com.iqoption.e.qf;
import com.iqoption.e.qh;
import com.iqoption.fragment.leftmenu.a.d;
import com.iqoption.fragment.leftmenu.a.e;
import com.iqoption.fragment.leftmenu.content.HistoryMenu;
import com.iqoption.fragment.leftmenu.content.MainMenu;
import com.iqoption.fragment.leftmenu.content.SettingsMenu;
import com.iqoption.fragment.leftmenu.content.VipMangerMenu;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: LeftMenuAdapter */
public class b extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c, com.iqoption.fragment.leftmenu.content.a> {
    private static final String TAG = "com.iqoption.fragment.leftmenu.b";
    private static final ImmutableMap<com.iqoption.fragment.leftmenu.content.a, String> din = new com.google.common.collect.ImmutableMap.a().m(MainMenu.Debug, "Debug").m(MainMenu.Deposit, "Deposit").m(MainMenu.History, "History").m(HistoryMenu.Operations, "OperationHistory").m(HistoryMenu.Trading, "TradingHistory").m(MainMenu.VipManager, "VipManager").m(VipMangerMenu.about, "About").m(VipMangerMenu.request_call, "RequestCall").m(VipMangerMenu.education, "Education").m(MainMenu.Settings, "Settings").m(SettingsMenu.General, "General").m(SettingsMenu.Security, "Security").m(SettingsMenu.PushNotifications, "PushNotifications").m(SettingsMenu.NewsAndUpdates, "NewsAndUpdates").m(SettingsMenu.TechnicalLog, "TechnicalLog").m(MainMenu.LogOut, "LogOut").m(MainMenu.Support, "Support").m(MainMenu.RateUs, "RateApp").m(MainMenu.TermsAndConditions, "TermsAndConditions").tf();
    private final Set<com.iqoption.fragment.leftmenu.content.a> dio = Sets.uw();
    private final Set<com.iqoption.fragment.leftmenu.content.a> dip = Sets.uw();
    private a diq;
    private ImmutableList<com.iqoption.fragment.leftmenu.content.a> dis = i.d(MainMenu.values()).b(com.iqoption.fragment.leftmenu.content.a.djo).b(com.iqoption.fragment.leftmenu.content.a.djp).sC();
    private final b dit;
    private final com.iqoption.fragment.leftmenu.a.a diu;
    private final com.iqoption.fragment.leftmenu.a.b.a div;

    /* compiled from: LeftMenuAdapter */
    private static class a {
        private final Context context;
        private final Map<com.iqoption.fragment.leftmenu.content.a, Drawable> diA;
        private final Map<com.iqoption.fragment.leftmenu.content.a, Drawable> diz;

        /* synthetic */ a(Context context, AnonymousClass1 anonymousClass1) {
            this(context);
        }

        private a(@NonNull Context context) {
            this.diz = Maps.uk();
            this.diA = Maps.uk();
            this.context = context;
        }

        private Drawable a(@NonNull com.iqoption.fragment.leftmenu.content.a aVar, boolean z) {
            Drawable drawable;
            if (z) {
                drawable = (Drawable) this.diz.get(aVar);
                if (drawable != null) {
                    return drawable;
                }
                drawable = AppCompatResources.getDrawable(this.context, aVar.getExpandIcon());
                this.diz.put(aVar, drawable);
                return drawable;
            }
            drawable = (Drawable) this.diA.get(aVar);
            if (drawable != null) {
                return drawable;
            }
            drawable = AppCompatResources.getDrawable(this.context, aVar.getCollapseIcon());
            this.diA.put(aVar, drawable);
            return drawable;
        }

        public void a(@NonNull ImageView imageView, @NonNull com.iqoption.fragment.leftmenu.content.a aVar, boolean z) {
            Drawable a = a(aVar, z);
            Object obj = a != imageView.getDrawable() ? 1 : null;
            imageView.setImageDrawable(a);
            if (a != null && (a instanceof Animatable) && obj != null) {
                Animatable animatable = (Animatable) a;
                if (animatable.isRunning()) {
                    animatable.stop();
                }
                animatable.start();
            }
        }

        public void b(@NonNull ImageView imageView, @NonNull com.iqoption.fragment.leftmenu.content.a aVar, boolean z) {
            imageView.setImageDrawable(a(aVar, z));
        }
    }

    /* compiled from: LeftMenuAdapter */
    public interface b {
        void b(com.iqoption.fragment.leftmenu.content.a aVar);
    }

    /* compiled from: LeftMenuAdapter */
    public static class c extends ViewHolder {
        private final ViewDataBinding amm;
        final int cWK;
        com.iqoption.fragment.leftmenu.content.a diB;

        public c(ViewDataBinding viewDataBinding, int i) {
            super(viewDataBinding.getRoot());
            this.amm = viewDataBinding;
            this.cWK = i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append(" '");
            stringBuilder.append(this.amm);
            return stringBuilder.toString();
        }
    }

    public b(b bVar, com.iqoption.fragment.leftmenu.a.a aVar, com.iqoption.fragment.leftmenu.a.b.a aVar2) {
        this.dit = bVar;
        this.diu = aVar;
        this.div = aVar2;
    }

    public void aV(List<com.iqoption.fragment.leftmenu.content.a> list) {
        this.dis = i.d(MainMenu.values()).b(com.iqoption.fragment.leftmenu.content.a.djo).b(com.iqoption.fragment.leftmenu.content.a.djp).d((Iterable) list).a(-$$Lambda$b$tfYtzgWDU32y6DjSBmv6__rttVs.INSTANCE);
        ash();
    }

    private void ash() {
        ArrayList arrayList = new ArrayList();
        aj sK = this.dis.iterator();
        while (sK.hasNext()) {
            com.iqoption.fragment.leftmenu.content.a aVar = (com.iqoption.fragment.leftmenu.content.a) sK.next();
            arrayList.add(aVar);
            if (this.dio.contains(aVar)) {
                for (int i = 0; i < aVar.getChildCount(); i++) {
                    arrayList.add(aVar.getChild(i));
                }
            }
        }
        aG(arrayList);
    }

    public int getItemViewType(int i) {
        return ((com.iqoption.fragment.leftmenu.content.a) fp(i)).layoutResId();
    }

    /* renamed from: K */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        switch (i) {
            case R.layout.left_menu_item_notification /*2131558961*/:
                return new e((pz) inflate, this.diu);
            case R.layout.left_menu_item_pro_trader /*2131558962*/:
                return new com.iqoption.fragment.leftmenu.a.b((qb) inflate, this.div);
            case R.layout.left_menu_item_profile /*2131558963*/:
                return new d((qd) inflate);
            default:
                return new c(inflate, i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(final c cVar, int i) {
        final com.iqoption.fragment.leftmenu.content.a aVar = (com.iqoption.fragment.leftmenu.content.a) fp(i);
        cVar.diB = aVar;
        a(cVar, aVar);
        if (aVar.isClickable()) {
            cVar.itemView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (cVar.diB.getChildCount() > 0) {
                        b.this.a(cVar);
                    } else if (!TextUtils.isEmpty(aVar.analyticsEventName())) {
                        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, aVar.analyticsEventName()).build());
                    }
                    if (b.this.dit != null) {
                        b.this.dit.b(cVar.diB);
                    }
                }
            });
        } else {
            cVar.itemView.setOnClickListener(null);
        }
        cVar.itemView.setTag(din.get(aVar));
    }

    private void a(c cVar, com.iqoption.fragment.leftmenu.content.a aVar) {
        cVar.itemView.setEnabled(aVar.isEnabled());
        int i = 0;
        switch (cVar.cWK) {
            case R.layout.left_menu_item /*2131558956*/:
                pp ppVar = (pp) cVar.amm;
                ppVar.cmC.setCompoundDrawablesWithIntrinsicBounds(aVar.getIcon(), 0, 0, 0);
                ppVar.cmC.setText(aVar.getNameToDisplay());
                return;
            case R.layout.left_menu_item_child /*2131558957*/:
                ((pr) cVar.amm).cmC.setText(aVar.getNameToDisplay());
                return;
            case R.layout.left_menu_item_counter /*2131558958*/:
                pt ptVar = (pt) cVar.amm;
                ptVar.cmC.setCompoundDrawablesWithIntrinsicBounds(aVar.getIcon(), 0, 0, 0);
                ptVar.cmC.setText(aVar.getNameToDisplay());
                int intValue = ((Integer) com.iqoption.app.b.aK(IQApp.Eu()).asb.getValue()).intValue();
                if (intValue > 0) {
                    ptVar.cmD.setVisibility(0);
                    ptVar.cmD.setText(String.valueOf(intValue));
                    return;
                }
                ptVar.cmD.setVisibility(8);
                return;
            case R.layout.left_menu_item_drop_down /*2131558959*/:
                pv pvVar = (pv) cVar.amm;
                pvVar.cmC.setText(aVar.getNameToDisplay());
                boolean contains = this.dio.contains(aVar);
                if (contains != this.dip.contains(aVar)) {
                    i = 1;
                }
                if (this.diq == null) {
                    this.diq = new a(pvVar.getRoot().getContext(), null);
                }
                float f = 180.0f;
                if (i != 0) {
                    this.diq.a(pvVar.cmF, aVar, contains);
                    ViewPropertyAnimator animate = pvVar.cmE.animate();
                    if (!contains) {
                        f = 0.0f;
                    }
                    animate.rotation(f);
                    return;
                }
                this.diq.b(pvVar.cmF, aVar, contains);
                ImageView imageView = pvVar.cmE;
                if (!contains) {
                    f = 0.0f;
                }
                imageView.setRotation(f);
                return;
            case R.layout.left_menu_item_notification /*2131558961*/:
                ((e) cVar).b(((com.iqoption.fragment.leftmenu.content.d) aVar).aEv());
                return;
            case R.layout.left_menu_item_pro_trader /*2131558962*/:
                ((com.iqoption.fragment.leftmenu.a.b) cVar).c(((com.iqoption.fragment.leftmenu.content.b) aVar).aED());
                return;
            case R.layout.left_menu_item_profile /*2131558963*/:
                d dVar = (d) cVar;
                dVar.a(com.iqoption.app.b.aK(cVar.itemView.getContext()), ((com.iqoption.fragment.leftmenu.content.c) aVar).aEE());
                return;
            case R.layout.left_menu_item_terms_and_conditions /*2131558964*/:
                ((qf) cVar.amm).cmC.setText(aVar.getNameToDisplay());
                return;
            case R.layout.left_menu_item_with_progress /*2131558965*/:
                qh qhVar = (qh) cVar.amm;
                qhVar.cmC.setCompoundDrawablesWithIntrinsicBounds(aVar.getIcon(), 0, 0, 0);
                qhVar.cmC.setText(aVar.getNameToDisplay());
                if (aVar.isInProgress()) {
                    qhVar.cmP.setVisibility(0);
                    return;
                } else {
                    qhVar.cmP.setVisibility(8);
                    return;
                }
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown menu item type. Item: ");
                stringBuilder.append(aVar.name());
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void a(c cVar) {
        com.iqoption.fragment.leftmenu.content.a aVar = cVar.diB;
        boolean contains = this.dio.contains(aVar);
        String str = Event.CATEGORY_BUTTON_PRESSED;
        if (contains) {
            this.dip.add(aVar);
            this.dio.remove(aVar);
            if (!TextUtils.isEmpty(aVar.analyticsEventName())) {
                EventManager.BS().a(Event.Builder(str, aVar.analyticsEventName()).setValue(Double.valueOf(0.0d)).build());
            }
            ash();
            return;
        }
        this.dip.remove(aVar);
        this.dio.add(aVar);
        if (!TextUtils.isEmpty(aVar.analyticsEventName())) {
            EventManager.BS().a(Event.Builder(str, aVar.analyticsEventName()).setValue(Double.valueOf(1.0d)).build());
        }
        ash();
    }
}
