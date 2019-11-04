package com.iqoption.fragment.dialog.popup.whatsnew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import com.iqoption.activity.VideoActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.e.aaf;
import com.iqoption.e.aap;
import com.iqoption.e.aaz;
import com.iqoption.e.abd;
import com.iqoption.e.abf;
import com.iqoption.e.oh;
import com.iqoption.fragment.ae;
import com.iqoption.fragment.b.g;
import com.iqoption.fragment.dialog.popup.whatsnew.a.b;
import com.iqoption.popup.c;
import com.iqoption.util.aj;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: WhatsNewDialogFragment */
public class a extends g {
    private static final String TAG = "com.iqoption.fragment.dialog.popup.whatsnew.a";
    private static final ImmutableMap<String, String> dfA;
    private static final ImmutableMap<String, String> dfB = ImmutableMap.sX().m("WHATS_NEW_DIALOG_TYPE_BINARY", "binary").m("WHATS_NEW_DIALOG_TYPE_DIGITAL", "digital").m("WHATS_NEW_DIALOG_TYPE_FOREX", "forex").m("WHATS_NEW_DIALOG_TYPE_FX_OPTION", "fx-option").m("WHATS_NEW_DIALOG_TYPE_NEW_INDICATORS2", "new-indicator2").m("WHATS_NEW_DIALOG_TYPE_PENDING", "pending").m("WHATS_NEW_DIALOG_TYPE_TPSL", "tpsl").m("WHATS_NEW_DIALOG_TYPE_TRAILING_STOP", "trailing-stop").m("WHATS_NEW_DIALOG_TYPE_TEMPLATES", "templates").m("WHATS_NEW_DIALOG_TYPE_SPOT", "spot").tf();
    private static final ImmutableList<Pair<String, Object>> dfL = ImmutableList.sT().sU();
    private static final ImmutableMap<String, String> dfu;
    private static final ImmutableMap<String, String> dfv;
    private static final ImmutableMap<String, String> dfw;
    private static final ImmutableMap<String, String> dfx;
    private static final ImmutableMap<String, String> dfy;
    private static final ImmutableMap<String, String> dfz;
    private aap dfC;
    private aaf dfD;
    private oh dfE;
    private abf dfF;
    private abd dfG;
    private aaz dfH;
    private boolean dfI;
    @Nullable
    private String dfJ;
    private String dfK;

    /* compiled from: WhatsNewDialogFragment */
    public class a extends FragmentStatePagerAdapter {
        public int getCount() {
            return 2;
        }

        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            if (i == 0) {
                return b.aCY();
            }
            if (i == 1) {
                return com.iqoption.fragment.dialog.popup.whatsnew.a.a.aCX();
            }
            throw new RuntimeException("Unsupported position");
        }
    }

    public String getEventName() {
        return "whats-new_show-popup";
    }

    static {
        String str = "xxxhdpi";
        String str2 = "xxhdpi";
        String str3 = "xhdpi";
        String str4 = "hdpi";
        String str5 = "mdpi";
        dfu = ImmutableMap.sX().m(str, "storage/public/59/80/381ba4c10.png").m(str2, "storage/public/59/80/3c4d37a48.png").m(str3, "storage/public/59/80/3c6378607.png").m(str4, "storage/public/59/80/3c895bfbe.png").m(str5, "storage/public/59/80/3c765aa11.png").tf();
        dfv = ImmutableMap.sX().m(str, "storage/public/59/80/4340b18ee.png").m(str2, "storage/public/59/80/43715598d.png").m(str3, "storage/public/59/80/437fedc7b.png").m(str4, "storage/public/59/80/43a5c357f.png").m(str5, "storage/public/59/80/439581929.png").tf();
        dfw = ImmutableMap.sX().m(str, "storage/public/59/80/8f8457db2.png").m(str2, "storage/public/59/80/8f60a2424.png").m(str3, "storage/public/59/80/8f48aaf61.png").m(str4, "storage/public/59/80/8e9aa32df.png").m(str5, "storage/public/59/80/8ed6cd64f.png").tf();
        dfx = ImmutableMap.sX().m(str, "storage/public/59/80/90a4e3b11.png").m(str2, "storage/public/59/80/90957da7e.png").m(str3, "storage/public/59/80/9082ef9c4.png").m(str4, "storage/public/59/80/906f2348d.png").m(str5, "storage/public/59/80/90534db97.png").tf();
        dfy = ImmutableMap.sX().m(str, "storage/public/59/95/7cfdc8e8d.png").m(str2, "storage/public/59/95/7cfda6b76.png").m(str3, "storage/public/59/95/7cfd86af8.png").m(str4, "storage/public/59/95/7cfd76225.png").m(str5, "storage/public/59/95/7cfd66ff6.png").tf();
        dfz = ImmutableMap.sX().m(str, "storage/public/5a/09/4aa7b7868.png").m(str2, "storage/public/5a/09/4a85c6fd7.png").m(str3, "storage/public/5a/09/4a5e9f26d.png").m(str4, "storage/public/5a/09/49428561f.png").m(str5, "storage/public/5a/09/4a09413ec.png").tf();
        dfA = ImmutableMap.sX().m(str, "storage/public/5b/35/d8bcd8568.png").m(str2, "storage/public/5b/35/d9288a635.png").m(str3, "storage/public/5b/35/d95a93d1b.png").m(str4, "storage/public/5b/35/d9868e77a.png").m(str5, "storage/public/5b/35/d9b97a7d0.png").tf();
    }

    public static boolean a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, String str) {
        if (!E(fragmentActivity, str) || it(str) == null) {
            return false;
        }
        c.A(fragmentActivity).a(new -$$Lambda$a$XnGQxgOxhah_6kpfyjHdnKt_qGk(fragmentManager, str), str);
        return true;
    }

    private static void show(FragmentManager fragmentManager, String str) {
        fragmentManager.beginTransaction().add(R.id.fragment, is(str), TAG).addToBackStack(TAG).commitAllowingStateLoss();
        d.Fa().c(true, str);
    }

    public static boolean E(Context context, String str) {
        return (com.iqoption.core.d.Un().Dq() || d.aP(context).dT(str)) ? false : true;
    }

    private static a is(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_DIALOG_TYPE", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dfJ = bundle.getString("ARG_DIALOG_TYPE");
        }
        this.dfK = aj.bl(getContext());
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = this.dfJ;
        if (str == null) {
            return null;
        }
        int i = -1;
        switch (str.hashCode()) {
            case -2102316932:
                if (str.equals("WHATS_NEW_DIALOG_TYPE_TEMPLATES")) {
                    i = 3;
                    break;
                }
                break;
            case -1752503470:
                if (str.equals("WHATS_NEW_DIALOG_TYPE_NEW_INDICATORS2")) {
                    i = 0;
                    break;
                }
                break;
            case -748315163:
                if (str.equals("WHATS_NEW_DIALOG_TYPE_FX_OPTION")) {
                    i = 2;
                    break;
                }
                break;
            case -135626305:
                if (str.equals("WHATS_NEW_DIALOG_TYPE_SPOT")) {
                    i = 4;
                    break;
                }
                break;
            case 781536808:
                if (str.equals("WHATS_NEW_DIALOG_TYPE_TRAILING_STOP")) {
                    i = 1;
                    break;
                }
                break;
        }
        if (i == 0) {
            return h(layoutInflater, viewGroup, bundle);
        }
        if (i == 1) {
            return g(layoutInflater, viewGroup, bundle);
        }
        if (i == 2) {
            return d(layoutInflater, viewGroup, bundle);
        }
        if (i == 3) {
            return e(layoutInflater, viewGroup, bundle);
        }
        if (i != 4) {
            return c(layoutInflater, viewGroup, bundle);
        }
        return f(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARNING: Missing block: B:6:0x002f, code skipped:
            if (r5.equals("WHATS_NEW_DIALOG_TYPE_FOREX") != false) goto L_0x0051;
     */
    private android.view.View c(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
        r4 = this;
        r7 = 0;
        r0 = 2131559253; // 0x7f0d0355 float:1.8743845E38 double:1.053130199E-314;
        r5 = androidx.databinding.DataBindingUtil.inflate(r5, r0, r6, r7);
        r5 = (com.iqoption.e.aaz) r5;
        r4.dfH = r5;
        r5 = r4.dfH;
        r5.a(r4);
        r5 = r4.dfJ;
        r6 = r5.hashCode();
        r0 = 4;
        r1 = 3;
        r2 = 2;
        r3 = 1;
        switch(r6) {
            case -1981065858: goto L_0x0046;
            case -1857785958: goto L_0x003c;
            case -135596398: goto L_0x0032;
            case 78518783: goto L_0x0029;
            case 485282843: goto L_0x001f;
            default: goto L_0x001e;
        };
    L_0x001e:
        goto L_0x0050;
    L_0x001f:
        r6 = "WHATS_NEW_DIALOG_TYPE_DIGITAL";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0050;
    L_0x0027:
        r7 = 1;
        goto L_0x0051;
    L_0x0029:
        r6 = "WHATS_NEW_DIALOG_TYPE_FOREX";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0050;
    L_0x0031:
        goto L_0x0051;
    L_0x0032:
        r6 = "WHATS_NEW_DIALOG_TYPE_TPSL";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0050;
    L_0x003a:
        r7 = 3;
        goto L_0x0051;
    L_0x003c:
        r6 = "WHATS_NEW_DIALOG_TYPE_PENDING";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0050;
    L_0x0044:
        r7 = 4;
        goto L_0x0051;
    L_0x0046:
        r6 = "WHATS_NEW_DIALOG_TYPE_BINARY";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0050;
    L_0x004e:
        r7 = 2;
        goto L_0x0051;
    L_0x0050:
        r7 = -1;
    L_0x0051:
        r5 = "00:49";
        if (r7 == 0) goto L_0x015e;
    L_0x0055:
        if (r7 == r3) goto L_0x011b;
    L_0x0057:
        if (r7 == r2) goto L_0x00e7;
    L_0x0059:
        if (r7 == r1) goto L_0x00a3;
    L_0x005b:
        if (r7 == r0) goto L_0x005f;
    L_0x005d:
        goto L_0x019e;
    L_0x005f:
        r5 = r4.dfH;
        r5 = r5.cuW;
        r6 = 2131887951; // 0x7f12074f float:1.9410524E38 double:1.0532925974E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.clj;
        r6 = 2131888945; // 0x7f120b31 float:1.941254E38 double:1.0532930885E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.cuD;
        r6 = "00:37";
        r5.setText(r6);
        r5 = r4.getContext();
        r5 = com.squareup.picasso.Picasso.with(r5);
        r6 = com.iqoption.core.d.EE();
        r7 = dfz;
        r0 = r4.dfK;
        r7 = r7.get(r0);
        r7 = (java.lang.String) r7;
        r6 = r6.fz(r7);
        r5 = r5.load(r6);
        r6 = r4.dfH;
        r6 = r6.cuU;
        r5.into(r6);
        goto L_0x019e;
    L_0x00a3:
        r5 = r4.dfH;
        r5 = r5.cuW;
        r6 = 2131888426; // 0x7f12092a float:1.9411487E38 double:1.053292832E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.clj;
        r6 = 2131887340; // 0x7f1204ec float:1.9409284E38 double:1.0532922955E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.cuD;
        r6 = "00:47";
        r5.setText(r6);
        r5 = r4.getContext();
        r5 = com.squareup.picasso.Picasso.with(r5);
        r6 = com.iqoption.core.d.EE();
        r7 = dfy;
        r0 = r4.dfK;
        r7 = r7.get(r0);
        r7 = (java.lang.String) r7;
        r6 = r6.fz(r7);
        r5 = r5.load(r6);
        r6 = r4.dfH;
        r6 = r6.cuU;
        r5.into(r6);
        goto L_0x019e;
    L_0x00e7:
        r6 = r4.dfH;
        r6 = r6.cuW;
        r7 = 2131886341; // 0x7f120105 float:1.9407258E38 double:1.053291802E-314;
        r6.setText(r7);
        r6 = r4.dfH;
        r6 = r6.clj;
        r7 = 2131887862; // 0x7f1206f6 float:1.9410343E38 double:1.0532925534E-314;
        r6.setText(r7);
        r6 = r4.dfH;
        r6 = r6.cuD;
        r6.setText(r5);
        r5 = r4.getContext();
        r5 = com.squareup.picasso.Picasso.with(r5);
        r6 = r4.aCy();
        r5 = r5.load(r6);
        r6 = r4.dfH;
        r6 = r6.cuU;
        r5.into(r6);
        goto L_0x019e;
    L_0x011b:
        r5 = r4.dfH;
        r5 = r5.cuW;
        r6 = 2131886996; // 0x7f120394 float:1.9408587E38 double:1.0532921255E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.clj;
        r6 = 2131886939; // 0x7f12035b float:1.940847E38 double:1.0532920974E-314;
        r5.setText(r6);
        r5 = r4.dfH;
        r5 = r5.cuD;
        r6 = "01:27";
        r5.setText(r6);
        r5 = r4.getContext();
        r5 = com.squareup.picasso.Picasso.with(r5);
        r6 = com.iqoption.core.d.EE();
        r7 = dfv;
        r0 = r4.dfK;
        r7 = r7.get(r0);
        r7 = (java.lang.String) r7;
        r6 = r6.fz(r7);
        r5 = r5.load(r6);
        r6 = r4.dfH;
        r6 = r6.cuU;
        r5.into(r6);
        goto L_0x019e;
    L_0x015e:
        r6 = r4.dfH;
        r6 = r6.cuW;
        r7 = 2131886964; // 0x7f120374 float:1.9408522E38 double:1.0532921097E-314;
        r6.setText(r7);
        r6 = r4.dfH;
        r6 = r6.clj;
        r7 = 2131887339; // 0x7f1204eb float:1.9409282E38 double:1.053292295E-314;
        r6.setText(r7);
        r6 = r4.dfH;
        r6 = r6.cuD;
        r6.setText(r5);
        r5 = r4.getContext();
        r5 = com.squareup.picasso.Picasso.with(r5);
        r6 = com.iqoption.core.d.EE();
        r7 = dfu;
        r0 = r4.dfK;
        r7 = r7.get(r0);
        r7 = (java.lang.String) r7;
        r6 = r6.fz(r7);
        r5 = r5.load(r6);
        r6 = r4.dfH;
        r6 = r6.cuU;
        r5.into(r6);
    L_0x019e:
        r5 = r4.dfH;
        r5 = r5.cuT;
        r6 = new com.iqoption.fragment.dialog.popup.whatsnew.a$1;
        r6.<init>();
        r5.setOnClickListener(r6);
        r5 = r4.dfH;
        r5 = r5.getRoot();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.whatsnew.a.c(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public static void c(Activity activity, String str) {
        String it = it(str);
        if (it != null) {
            Intent intent = new Intent(activity, VideoActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("path", it);
            bundle.putString("RETURN_PARAM", str);
            if (((String) dfB.get(str)) != null) {
                bundle.putString("ARG_SCREEN_OPENED_EVENT", String.format(Locale.US, "whats-new_play-%s-video", new Object[]{str}));
            }
            intent.putExtra("params", bundle);
            activity.startActivityForResult(intent, 101);
            activity.overridePendingTransition(R.anim.fast_fade_in, R.anim.fast_fade_out);
        }
    }

    /* Access modifiers changed, original: protected */
    public int aBO() {
        return getResources().getDimensionPixelSize(R.dimen.dp439);
    }

    private View d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dfE = (oh) DataBindingUtil.inflate(layoutInflater, R.layout.fx_whats_new_dialog, viewGroup, false);
        this.dfE.a(this);
        this.dfE.cld.setOnClickListener(new -$$Lambda$a$plPO3frxqhZHmDEZ1xfzUtifxbs(this));
        return this.dfE.getRoot();
    }

    private /* synthetic */ void bz(View view) {
        onClose();
        com.iqoption.core.microservices.tradingengine.response.active.a b = com.iqoption.app.helpers.a.Gs().b(InstrumentType.FX_INSTRUMENT);
        if (b != null) {
            TabHelper.IM().u(b);
        }
    }

    private View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dfF = (abf) DataBindingUtil.inflate(layoutInflater, R.layout.whats_new_dialog_templates, viewGroup, false);
        this.dfF.a(this);
        return this.dfF.getRoot();
    }

    private View f(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dfG = (abd) DataBindingUtil.inflate(layoutInflater, R.layout.whats_new_dialog_spot, viewGroup, false);
        this.dfG.a(this);
        return this.dfG.getRoot();
    }

    private View g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dfD = (aaf) DataBindingUtil.inflate(layoutInflater, R.layout.trailing_whats_new_dialog, viewGroup, false);
        this.dfD.a(this);
        this.dfD.cuy.setOnClickListener(new -$$Lambda$a$fM-qNEWdj731bhEvE6VGvuGPZqo(this));
        return this.dfD.getRoot();
    }

    private /* synthetic */ void by(View view) {
        ae.g(requireFragmentManager());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "whats-new_activate-feature").build());
    }

    @Nullable
    public JsonObject aBP() {
        String str = (String) dfB.get(this.dfJ);
        if (str == null) {
            return null;
        }
        return u.anp().o("type", str).anr();
    }

    public void aCw() {
        onClose();
    }

    public boolean onClose() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "whats-new_close").build());
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr(this.dfJ);
        return true;
    }

    public void aCx() {
        onClose();
        if ("WHATS_NEW_DIALOG_TYPE_SPOT".equals(this.dfJ)) {
            TabHelper.IM().k(InstrumentType.DIGITAL_INSTRUMENT);
        }
    }

    private String aCy() {
        String language = Locale.getDefault().getLanguage();
        Object obj = (language.hashCode() == 3651 && language.equals("ru")) ? null : -1;
        if (obj != null) {
            language = (String) dfx.get(this.dfK);
        } else {
            language = (String) dfw.get(this.dfK);
        }
        return com.iqoption.core.d.EE().fz(language);
    }

    @androidx.annotation.Nullable
    private static java.lang.String it(java.lang.String r5) {
        /*
        r0 = r5.hashCode();
        r1 = 4;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        switch(r0) {
            case -1981065858: goto L_0x0034;
            case -1857785958: goto L_0x002a;
            case -135596398: goto L_0x0020;
            case 78518783: goto L_0x0016;
            case 485282843: goto L_0x000c;
            default: goto L_0x000b;
        };
    L_0x000b:
        goto L_0x003e;
    L_0x000c:
        r0 = "WHATS_NEW_DIALOG_TYPE_DIGITAL";
        r5 = r5.equals(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x0014:
        r5 = 1;
        goto L_0x003f;
    L_0x0016:
        r0 = "WHATS_NEW_DIALOG_TYPE_FOREX";
        r5 = r5.equals(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x001e:
        r5 = 0;
        goto L_0x003f;
    L_0x0020:
        r0 = "WHATS_NEW_DIALOG_TYPE_TPSL";
        r5 = r5.equals(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x0028:
        r5 = 3;
        goto L_0x003f;
    L_0x002a:
        r0 = "WHATS_NEW_DIALOG_TYPE_PENDING";
        r5 = r5.equals(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x0032:
        r5 = 4;
        goto L_0x003f;
    L_0x0034:
        r0 = "WHATS_NEW_DIALOG_TYPE_BINARY";
        r5 = r5.equals(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x003c:
        r5 = 2;
        goto L_0x003f;
    L_0x003e:
        r5 = -1;
    L_0x003f:
        r0 = "use-cdn-storage";
        if (r5 == 0) goto L_0x0093;
    L_0x0044:
        if (r5 == r4) goto L_0x007f;
    L_0x0046:
        r0 = 0;
        if (r5 == r3) goto L_0x0058;
    L_0x0049:
        if (r5 == r2) goto L_0x0053;
    L_0x004b:
        if (r5 == r1) goto L_0x004e;
    L_0x004d:
        return r0;
    L_0x004e:
        r5 = aCC();
        return r5;
    L_0x0053:
        r5 = aCB();
        return r5;
    L_0x0058:
        r5 = java.util.Locale.getDefault();
        r5 = r5.getLanguage();
        r1 = "en";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x006b;
    L_0x0068:
        r5 = "storage/public/5b/e5/860b162de.mp4";
        goto L_0x0075;
    L_0x006b:
        r1 = "ru";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x007e;
    L_0x0073:
        r5 = "storage/public/5b/e5/8650c5ee2.mp4";
    L_0x0075:
        r0 = com.iqoption.core.d.EE();
        r5 = r0.fz(r5);
        return r5;
    L_0x007e:
        return r0;
    L_0x007f:
        r5 = com.iqoption.app.managers.feature.c.Iw();
        r5 = r5.ej(r0);
        if (r5 == 0) goto L_0x008e;
    L_0x0089:
        r5 = aCE();
        return r5;
    L_0x008e:
        r5 = aCD();
        return r5;
    L_0x0093:
        r5 = com.iqoption.app.managers.feature.c.Iw();
        r5 = r5.ej(r0);
        if (r5 == 0) goto L_0x00a2;
    L_0x009d:
        r5 = aCA();
        return r5;
    L_0x00a2:
        r5 = aCz();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.whatsnew.a.it(java.lang.String):java.lang.String");
    }

    @androidx.annotation.Nullable
    private static java.lang.String aCz() {
        /*
        r0 = java.util.Locale.getDefault();
        r0 = r0.getLanguage();
        r1 = r0.hashCode();
        switch(r1) {
            case 3201: goto L_0x0092;
            case 3246: goto L_0x0087;
            case 3276: goto L_0x007c;
            case 3355: goto L_0x0072;
            case 3365: goto L_0x0068;
            case 3371: goto L_0x005d;
            case 3428: goto L_0x0053;
            case 3588: goto L_0x0048;
            case 3651: goto L_0x003e;
            case 3666: goto L_0x0034;
            case 3683: goto L_0x0029;
            case 3710: goto L_0x001d;
            case 3886: goto L_0x0011;
            default: goto L_0x000f;
        };
    L_0x000f:
        goto L_0x009d;
    L_0x0011:
        r1 = "zh";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x001a:
        r0 = 1;
        goto L_0x009e;
    L_0x001d:
        r1 = "tr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0026:
        r0 = 2;
        goto L_0x009e;
    L_0x0029:
        r1 = "sv";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0031:
        r0 = 5;
        goto L_0x009e;
    L_0x0034:
        r1 = "se";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x003c:
        r0 = 4;
        goto L_0x009e;
    L_0x003e:
        r1 = "ru";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0046:
        r0 = 0;
        goto L_0x009e;
    L_0x0048:
        r1 = "pt";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0050:
        r0 = 11;
        goto L_0x009e;
    L_0x0053:
        r1 = "ko";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x005b:
        r0 = 3;
        goto L_0x009e;
    L_0x005d:
        r1 = "it";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0065:
        r0 = 10;
        goto L_0x009e;
    L_0x0068:
        r1 = "in";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0070:
        r0 = 6;
        goto L_0x009e;
    L_0x0072:
        r1 = "id";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x007a:
        r0 = 7;
        goto L_0x009e;
    L_0x007c:
        r1 = "fr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0084:
        r0 = 12;
        goto L_0x009e;
    L_0x0087:
        r1 = "es";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x008f:
        r0 = 9;
        goto L_0x009e;
    L_0x0092:
        r1 = "de";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x009a:
        r0 = 8;
        goto L_0x009e;
    L_0x009d:
        r0 = -1;
    L_0x009e:
        switch(r0) {
            case 0: goto L_0x00c2;
            case 1: goto L_0x00bf;
            case 2: goto L_0x00bc;
            case 3: goto L_0x00b9;
            case 4: goto L_0x00b6;
            case 5: goto L_0x00b6;
            case 6: goto L_0x00b3;
            case 7: goto L_0x00b3;
            case 8: goto L_0x00b0;
            case 9: goto L_0x00ad;
            case 10: goto L_0x00aa;
            case 11: goto L_0x00a7;
            case 12: goto L_0x00a4;
            default: goto L_0x00a1;
        };
    L_0x00a1:
        r0 = "https://player.vimeo.com/external/224643209.hd.mp4?s=91108dd3927e28b83e94ae5f72ffccd73b15abe0&profile_id=174";
        return r0;
    L_0x00a4:
        r0 = "https://player.vimeo.com/external/225852221.hd.mp4?s=dd0fab17c8845aedb2d3fff30426efda8b93cecd&profile_id=174";
        return r0;
    L_0x00a7:
        r0 = "https://player.vimeo.com/external/224703968.hd.mp4?s=5985a9df9cb96f47b085f8bd8cc1c9077abf5874&profile_id=174";
        return r0;
    L_0x00aa:
        r0 = "https://player.vimeo.com/external/224692886.hd.mp4?s=b2cea06c4404770ca9e7f8f706b8bd910b1aea77&profile_id=174";
        return r0;
    L_0x00ad:
        r0 = "https://player.vimeo.com/external/224704718.hd.mp4?s=81146cbe08fff0f121d24b255f0f13d8177eaa76&profile_id=174";
        return r0;
    L_0x00b0:
        r0 = "https://player.vimeo.com/external/224687261.hd.mp4?s=a28bdf42a526f2c9f85f7ad912d16e85dc2feddb&profile_id=174";
        return r0;
    L_0x00b3:
        r0 = "https://player.vimeo.com/external/224704328.hd.mp4?s=b3078455279f5e37f130100a8a9f8b0f031ebe78&profile_id=174";
        return r0;
    L_0x00b6:
        r0 = "https://player.vimeo.com/external/224704564.hd.mp4?s=364c677605410cb41d5ffb0af99e55e81c563285&profile_id=174";
        return r0;
    L_0x00b9:
        r0 = "https://player.vimeo.com/external/224745985.hd.mp4?s=dd609897098eb24493549030956c95c9ae487437&profile_id=174";
        return r0;
    L_0x00bc:
        r0 = "https://player.vimeo.com/external/224747307.hd.mp4?s=39f10f4831e4718feeb4088aaa9bdd1039e25f26&profile_id=174";
        return r0;
    L_0x00bf:
        r0 = "https://player.vimeo.com/external/224745988.hd.mp4?s=faab3c4690bed3f73a0d992c474e33a46160bf08&profile_id=174";
        return r0;
    L_0x00c2:
        r0 = "https://player.vimeo.com/external/224683317.hd.mp4?s=a09d480dc4b32e68ff377556f61c497e28f4459c&profile_id=174";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.whatsnew.a.aCz():java.lang.String");
    }

    @Nullable
    private static String aCA() {
        String language = Locale.getDefault().getLanguage();
        Object obj = (language.hashCode() == 3886 && language.equals("zh")) ? null : -1;
        return com.iqoption.core.d.EE().fz(obj != null ? "storage/public/59/63/83b4c166d.mp4" : "storage/public/59/63/84c40ff18.mp4");
    }

    @Nullable
    private static String aCB() {
        return com.iqoption.core.d.EE().fz("storage/public/59/95/7cfd39ccb.mp4");
    }

    @Nullable
    private static String aCC() {
        return com.iqoption.core.d.EE().fz("storage/public/5a/05/bd7469b37.mp4");
    }

    private static java.lang.String aCD() {
        /*
        r0 = java.util.Locale.getDefault();
        r0 = r0.getLanguage();
        r1 = r0.hashCode();
        switch(r1) {
            case 3201: goto L_0x0092;
            case 3246: goto L_0x0087;
            case 3276: goto L_0x007c;
            case 3355: goto L_0x0072;
            case 3365: goto L_0x0068;
            case 3371: goto L_0x005d;
            case 3428: goto L_0x0053;
            case 3588: goto L_0x0048;
            case 3651: goto L_0x003e;
            case 3666: goto L_0x0034;
            case 3683: goto L_0x0029;
            case 3710: goto L_0x001d;
            case 3886: goto L_0x0011;
            default: goto L_0x000f;
        };
    L_0x000f:
        goto L_0x009d;
    L_0x0011:
        r1 = "zh";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x001a:
        r0 = 1;
        goto L_0x009e;
    L_0x001d:
        r1 = "tr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0026:
        r0 = 2;
        goto L_0x009e;
    L_0x0029:
        r1 = "sv";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0031:
        r0 = 5;
        goto L_0x009e;
    L_0x0034:
        r1 = "se";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x003c:
        r0 = 4;
        goto L_0x009e;
    L_0x003e:
        r1 = "ru";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0046:
        r0 = 0;
        goto L_0x009e;
    L_0x0048:
        r1 = "pt";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0050:
        r0 = 11;
        goto L_0x009e;
    L_0x0053:
        r1 = "ko";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x005b:
        r0 = 3;
        goto L_0x009e;
    L_0x005d:
        r1 = "it";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0065:
        r0 = 10;
        goto L_0x009e;
    L_0x0068:
        r1 = "in";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0070:
        r0 = 6;
        goto L_0x009e;
    L_0x0072:
        r1 = "id";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x007a:
        r0 = 7;
        goto L_0x009e;
    L_0x007c:
        r1 = "fr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x0084:
        r0 = 12;
        goto L_0x009e;
    L_0x0087:
        r1 = "es";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x008f:
        r0 = 9;
        goto L_0x009e;
    L_0x0092:
        r1 = "de";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009d;
    L_0x009a:
        r0 = 8;
        goto L_0x009e;
    L_0x009d:
        r0 = -1;
    L_0x009e:
        switch(r0) {
            case 0: goto L_0x00c2;
            case 1: goto L_0x00bf;
            case 2: goto L_0x00bc;
            case 3: goto L_0x00b9;
            case 4: goto L_0x00b6;
            case 5: goto L_0x00b6;
            case 6: goto L_0x00b3;
            case 7: goto L_0x00b3;
            case 8: goto L_0x00b0;
            case 9: goto L_0x00ad;
            case 10: goto L_0x00aa;
            case 11: goto L_0x00a7;
            case 12: goto L_0x00a4;
            default: goto L_0x00a1;
        };
    L_0x00a1:
        r0 = "https://player.vimeo.com/external/222076227.hd.mp4?s=09146791b4eaea00e964919c0c8658511a5ea00c&profile_id=174";
        return r0;
    L_0x00a4:
        r0 = "https://player.vimeo.com/external/224912713.hd.mp4?s=043b52a0ab28c45de6c47e3bbba14a3eefea3e37&profile_id=174";
        return r0;
    L_0x00a7:
        r0 = "https://player.vimeo.com/external/224042741.hd.mp4?s=c7d46030f684c11045034e74101e69e83d71c87e&profile_id=174";
        return r0;
    L_0x00aa:
        r0 = "https://player.vimeo.com/external/224035522.hd.mp4?s=e7f92f4564ac4a4e7b89d289d034aefe203379c0&profile_id=174";
        return r0;
    L_0x00ad:
        r0 = "https://player.vimeo.com/external/224035698.hd.mp4?s=8f73347d642f3e44cab0a7377d150fb925920f0c&profile_id=174";
        return r0;
    L_0x00b0:
        r0 = "https://player.vimeo.com/external/223796903.hd.mp4?s=107ca54ea89349450e3aa67a9fb19a921758e7bb&profile_id=174";
        return r0;
    L_0x00b3:
        r0 = "https://player.vimeo.com/external/223795924.hd.mp4?s=c003c449ff88591742a126a9ae1c2929e8d427ab&profile_id=174";
        return r0;
    L_0x00b6:
        r0 = "https://player.vimeo.com/external/223795096.hd.mp4?s=49e06b3018a603bc2ed440b34e00dfa05d7be0c8&profile_id=174";
        return r0;
    L_0x00b9:
        r0 = "https://player.vimeo.com/external/223794980.hd.mp4?s=d4a40bd36a60467185fa8f70c14e7ac16106b58b&profile_id=174";
        return r0;
    L_0x00bc:
        r0 = "https://player.vimeo.com/external/223794879.hd.mp4?s=042c3c5fad7f5f94462c90ea9c0fd75db0079dc3&profile_id=174";
        return r0;
    L_0x00bf:
        r0 = "https://player.vimeo.com/external/223793486.hd.mp4?s=570cf3a7781533cbbc3e8ced7b8aaeb0d5107383&profile_id=174";
        return r0;
    L_0x00c2:
        r0 = "https://player.vimeo.com/external/223791732.hd.mp4?s=c903ba902e4196cffe188a40a6fbc1de7c9ef0d6&profile_id=174";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.whatsnew.a.aCD():java.lang.String");
    }

    private static String aCE() {
        String language = Locale.getDefault().getLanguage();
        Object obj = (language.hashCode() == 3886 && language.equals("zh")) ? null : -1;
        return com.iqoption.core.d.EE().fz(obj != null ? "storage/public/59/5c/f4a1daa00.mp4" : "storage/public/59/5c/f5bd95881.mp4");
    }

    private View h(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dfC = (aap) DataBindingUtil.inflate(layoutInflater, R.layout.view_pager_whats_new_dialog, viewGroup, false);
        this.dfC.a(this);
        this.dfC.ceT.setAdapter(new a(getChildFragmentManager()));
        this.dfC.ceT.setOffscreenPageLimit(1);
        this.dfC.cuG.setOnClickListener(new -$$Lambda$a$GKL6LPndlEgxJgN47A1aOqmaVwQ(this));
        l(0, true);
        l(1, false);
        this.dfC.ceT.addOnPageChangeListener(new SimpleOnPageChangeListener() {
            public void onPageSelected(int i) {
                a.this.l(i, true);
                if (i == 0) {
                    a.this.l(1, false);
                    a.this.dfC.cuG.setText(R.string.next);
                } else if (i == 1) {
                    a.this.l(0, false);
                    a.this.dfC.cuG.setText(R.string.trade);
                } else {
                    throw new RuntimeException("Unsupported position");
                }
            }
        });
        return this.dfC.getRoot();
    }

    private /* synthetic */ void bx(View view) {
        int currentItem = this.dfC.ceT.getCurrentItem();
        if (currentItem == 0) {
            this.dfC.ceT.setCurrentItem(currentItem + 1, true);
        } else {
            onClose();
        }
    }

    private void l(int i, boolean z) {
        float f = 1.0f;
        ViewPropertyAnimator animate;
        if (i == 0) {
            animate = this.dfC.ceH.animate();
            if (!z) {
                f = 0.3f;
            }
            animate.alpha(f);
        } else if (i == 1) {
            animate = this.dfC.ceI.animate();
            if (!z) {
                f = 0.3f;
            }
            animate.alpha(f);
        } else {
            throw new RuntimeException("Unsupported position");
        }
    }
}
