package com.iqoption.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.iqoption.app.IQApp;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.dialog.k;
import com.iqoption.fragment.dialog.k.b;
import com.iqoption.fragment.leftpanel.BackListenerObserver;
import com.iqoption.menu.SupportView;
import com.iqoption.menu.c;
import com.iqoption.menu.c.a;
import com.iqoption.x.R;

public class MenuFragment extends d implements b, a {
    public static final String TAG = "com.iqoption.fragment.MenuFragment";
    private com.iqoption.core.analytics.d aZI;
    private View ajI;
    private MenuItem cVW;
    private u cVX;
    private FrameLayout cmZ;

    /* renamed from: com.iqoption.fragment.MenuFragment$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] cVY = new int[MenuItem.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.fragment.MenuFragment.MenuItem.values();
            r0 = r0.length;
            r0 = new int[r0];
            cVY = r0;
            r0 = cVY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.fragment.MenuFragment.MenuItem.PERSONAL_INFO;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = cVY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.fragment.MenuFragment.MenuItem.SUPPORT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.MenuFragment$AnonymousClass1.<clinit>():void");
        }
    }

    public enum MenuItem {
        PERSONAL_INFO,
        SUPPORT
    }

    public static Fragment axU() {
        MenuFragment menuFragment = new MenuFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("item", MenuItem.SUPPORT);
        menuFragment.setArguments(bundle);
        return menuFragment;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.cVX = u.n(getActivity());
        this.aZI = IQApp.Eu().EC();
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.menu_fragment, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        bi(view);
        zY();
        if (axV() && !com.iqoption.app.b.aK(getContext()).Ej() && com.iqoption.core.d.EH().ej("jumio-card-verification")) {
            com.iqoption.verify.a.H(getActivity()).aXe().observe(this, new -$$Lambda$MenuFragment$Pvy5YIXpGVd-tzgdpItUpSXl84M(this));
        }
        if (getActivity() instanceof com.iqoption.view.b) {
            getLifecycle().addObserver(new BackListenerObserver((com.iqoption.view.b) getActivity(), new -$$Lambda$MenuFragment$r_0umX6r1i8okd2IJ-x6W8Ql61Q(this)));
        }
    }

    private /* synthetic */ void n(Boolean bool) {
        View view = this.ajI;
        if (view instanceof c) {
            ((c) view).setCardVerificationFailed(Boolean.TRUE.equals(bool));
        }
    }

    private /* synthetic */ Boolean aya() {
        if (this.cVW == MenuItem.SUPPORT) {
            ((SupportView) this.ajI).onBackPressed();
        } else if (this.cVW == MenuItem.PERSONAL_INFO) {
            ((c) this.ajI).onBackPressed();
        }
        requireFragmentManager().popBackStackImmediate();
        return Boolean.valueOf(true);
    }

    public void onStart() {
        super.onStart();
        axW();
        axX();
    }

    private void bi(View view) {
        this.cmZ = (FrameLayout) view.findViewById(R.id.layout);
    }

    private void zY() {
        b((MenuItem) getArguments().getSerializable("item"));
    }

    public void b(MenuItem menuItem) {
        if (this.cVW != menuItem) {
            this.cmZ.removeAllViews();
            this.cVW = menuItem;
            int i = AnonymousClass1.cVY[menuItem.ordinal()];
            if (i == 1) {
                c cVar = new c(getTradeRoomActivity());
                cVar.setCallback(this);
                this.ajI = cVar;
            } else if (i == 2) {
                this.ajI = new SupportView(getActivity());
            }
            this.cmZ.addView(this.ajI);
        }
    }

    public void b(long j, int i) {
        View view = this.ajI;
        if (view != null && (view instanceof SupportView)) {
            ((SupportView) view).b(j, i);
        }
    }

    public boolean axV() {
        return this.ajI instanceof c;
    }

    public void axW() {
        View view = this.ajI;
        if (view instanceof c) {
            ((c) view).aNW();
            ((c) this.ajI).aNX();
        }
    }

    public void axX() {
        View view = this.ajI;
        if (view instanceof c) {
            ((c) view).axX();
        }
    }

    public void onResume() {
        super.onResume();
        axX();
    }

    public void LI() {
        this.aZI.c("delete-account_choose-answer", 0.0d);
    }

    public void axY() {
        if (isAdded()) {
            this.aZI.dl("delete-account_show").Cc();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getString(R.string.we_will_not_be_able_to_process_your_request));
            stringBuilder.append("\n\n");
            stringBuilder.append(getString(R.string.if_you_choose_to_delete_your_account));
            k.a(getChildFragmentManager(), R.id.menuOtherFragment, getString(R.string.confirm_account_and_personal_data_deletion), getString(R.string.are_you_sure_you_want_to_delete_your_account), stringBuilder, getString(R.string.cancel), getString(R.string.confirm), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dp480)));
        }
    }

    @SuppressLint({"CheckResult"})
    public void LJ() {
        this.aZI.c("delete-account_choose-answer", 1.0d);
        this.cVX.ayb().a(new -$$Lambda$MenuFragment$dQJLBguVUQSxsKKeyxbyPjRk8HY(this), -$$Lambda$MenuFragment$76lOIz91-M57UmWOcc-cTgOVGSY.INSTANCE);
    }

    private /* synthetic */ void axZ() {
        if (isAdded()) {
            getFragmentManager().popBackStack();
        }
    }
}
