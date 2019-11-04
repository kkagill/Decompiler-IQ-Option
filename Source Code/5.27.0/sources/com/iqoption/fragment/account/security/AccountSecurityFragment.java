package com.iqoption.fragment.account.security;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import androidx.core.os.OperationCanceledException;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.activity.SetPasscodeActivity;
import com.iqoption.app.IQApp;
import com.iqoption.e.ig;
import com.iqoption.fragment.account.security.phone.PhoneFragment;
import com.iqoption.fragment.account.security.sms.SmsFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AccountSecurityFragment extends com.iqoption.fragment.b.e implements com.iqoption.fragment.account.security.sms.SmsFragment.d, com.iqoption.fragment.account.security.touchId.b.a, com.iqoption.util.y.a {
    public static final String TAG = "com.iqoption.fragment.account.security.AccountSecurityFragment";
    private List<View> cYF = new ArrayList();
    private List<View> cYG = new ArrayList();
    private a cYH;
    private ig cYI;
    private int cYJ = 0;
    private boolean cYK = true;
    private View cYL;
    private int cYM;
    private int cYN;
    private int cYO;
    private int cYP;
    private aa<Long> cYQ;
    private final c cYR = new c(this, null);
    private ScrollDirection cYS = ScrollDirection.none;

    private enum ScrollDirection {
        none,
        left,
        right
    }

    private static class b implements Runnable {
        private WeakReference<AccountSecurityFragment> bJf;
        private final boolean visible;

        public b(AccountSecurityFragment accountSecurityFragment, boolean z) {
            this.bJf = new WeakReference(accountSecurityFragment);
            this.visible = z;
        }

        public void run() {
            AccountSecurityFragment accountSecurityFragment = (AccountSecurityFragment) this.bJf.get();
            if (accountSecurityFragment != null && accountSecurityFragment.isAdded()) {
                accountSecurityFragment.dy(this.visible);
            }
        }
    }

    private static class c {
        private final WeakReference<AccountSecurityFragment> bJf;

        /* synthetic */ c(AccountSecurityFragment accountSecurityFragment, AnonymousClass1 anonymousClass1) {
            this(accountSecurityFragment);
        }

        private c(AccountSecurityFragment accountSecurityFragment) {
            this.bJf = new WeakReference(accountSecurityFragment);
        }

        @com.google.common.b.e
        public void accountEvent(com.iqoption.app.b.b bVar) {
            azp();
        }

        @com.google.common.b.e
        public void passcodeEvent(com.iqoption.app.b.e.b bVar) {
            azp();
        }

        private void azp() {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    AccountSecurityFragment accountSecurityFragment = (AccountSecurityFragment) c.this.bJf.get();
                    if (accountSecurityFragment != null) {
                        accountSecurityFragment.azp();
                    }
                }
            });
        }
    }

    private class e implements Runnable {
        private final WeakReference<ViewPager> cYV;
        private final int cYW;

        /* synthetic */ e(AccountSecurityFragment accountSecurityFragment, ViewPager viewPager, int i, AnonymousClass1 anonymousClass1) {
            this(viewPager, i);
        }

        private e(ViewPager viewPager, int i) {
            this.cYV = new WeakReference(viewPager);
            this.cYW = i;
        }

        public void run() {
            ViewPager viewPager = (ViewPager) this.cYV.get();
            if (viewPager != null) {
                try {
                    viewPager.setOffscreenPageLimit(this.cYW);
                } catch (Exception unused) {
                }
            }
        }
    }

    private class d implements OnPageChangeListener {
        private d() {
        }

        /* synthetic */ d(AccountSecurityFragment accountSecurityFragment, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (AccountSecurityFragment.this.cYS == ScrollDirection.none && AccountSecurityFragment.this.cYJ == 1) {
                if (f < 0.5f) {
                    AccountSecurityFragment.this.cYS = ScrollDirection.right;
                } else {
                    AccountSecurityFragment.this.cYS = ScrollDirection.left;
                }
            }
            if (AccountSecurityFragment.this.cYS != ScrollDirection.none) {
                int min;
                if (AccountSecurityFragment.this.cYS == ScrollDirection.right) {
                    min = Math.min(i + 1, AccountSecurityFragment.this.cYI.ceT.getAdapter().getCount() - 1);
                } else {
                    min = i;
                    i = Math.min(i + 1, AccountSecurityFragment.this.cYI.ceT.getAdapter().getCount() - 1);
                }
                View view = (View) AccountSecurityFragment.this.cYG.get(i);
                View view2 = (View) AccountSecurityFragment.this.cYG.get(min);
                if (f != 0.0f && i2 != 0) {
                    float f2 = AccountSecurityFragment.this.cYS == ScrollDirection.right ? 1.0f - f : f;
                    float f3 = (f2 * 0.2f) + 1.0f;
                    view.setScaleX(f3);
                    view.setScaleY(f3);
                    f2 = (f2 * 0.7f) + 0.3f;
                    view.setAlpha(f2);
                    ((View) AccountSecurityFragment.this.cYF.get(i)).setAlpha(f2);
                    if (view2 != view) {
                        if (AccountSecurityFragment.this.cYS != ScrollDirection.right) {
                            f = 1.0f - f;
                        }
                        float f4 = (0.2f * f) + 1.0f;
                        view2.setScaleX(f4);
                        view2.setScaleY(f4);
                        f = (f * 0.7f) + 0.3f;
                        view2.setAlpha(f);
                        ((View) AccountSecurityFragment.this.cYF.get(min)).setAlpha(f);
                    }
                }
            }
        }

        public void onPageScrollStateChanged(int i) {
            AccountSecurityFragment.this.cYJ = i;
            if (i == 0) {
                AccountSecurityFragment.this.cYS = ScrollDirection.none;
            }
        }

        public void onPageSelected(int i) {
            if (AccountSecurityFragment.this.cYL != null) {
                AccountSecurityFragment.this.cYL.setClickable(true);
            }
            AccountSecurityFragment accountSecurityFragment = AccountSecurityFragment.this;
            accountSecurityFragment.cYL = (View) accountSecurityFragment.cYG.get(i);
            AccountSecurityFragment.this.cYL.setClickable(false);
        }
    }

    public class a extends FragmentStatePagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            View view = (View) AccountSecurityFragment.this.cYG.get(i);
            switch (view.getId()) {
                case R.id.mailIcon /*2131363241*/:
                    return com.iqoption.fragment.account.security.a.c.azv();
                case R.id.phoneIcon /*2131363546*/:
                    int i2;
                    long j;
                    PhoneNumber DV = com.iqoption.app.b.DG().DV();
                    if (DV == null) {
                        i2 = 0;
                    } else {
                        i2 = DV.xK();
                    }
                    if (DV == null) {
                        j = 0;
                    } else {
                        j = DV.yj();
                    }
                    return PhoneFragment.r(i2, j);
                case R.id.smsIcon /*2131363888*/:
                    return SmsFragment.azL();
                case R.id.touchIdIcon /*2131364221*/:
                    return com.iqoption.fragment.account.security.touchId.b.azW();
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported tab, id=");
                    stringBuilder.append(view.getId());
                    throw new RuntimeException(stringBuilder.toString());
            }
        }

        public int getCount() {
            return AccountSecurityFragment.this.cYG.size();
        }
    }

    public String getEventName() {
        return "security";
    }

    public void onKeyboardVisibilityChanged(boolean z) {
        this.cYI.ceT.setSwipeable(z ^ 1);
        this.cYI.getRoot().postDelayed(new b(this, z), 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public static AccountSecurityFragment azn() {
        return new AccountSecurityFragment();
    }

    public static void f(FragmentManager fragmentManager) {
        if (!h(fragmentManager)) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, azn(), TAG).addToBackStack(TAG).commit();
        }
    }

    public static boolean h(FragmentManager fragmentManager) {
        return fragmentManager.findFragmentByTag(TAG) != null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cYI = (ig) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security, viewGroup, false);
        this.cYI.a(this);
        a(this.cYI);
        b(this.cYI);
        this.cYH = new a(getChildFragmentManager());
        this.cYI.ceT.setAdapter(this.cYH);
        this.cYI.ceT.setOffscreenPageLimit(1);
        com.iqoption.core.c.a.biN.postDelayed(new e(this, this.cYI.ceT, 3, null), 5000);
        this.cYI.ceT.addOnPageChangeListener(new d(this, null));
        azt();
        this.cYI.ceT.setCurrentItem(bn(this.cYL), false);
        IQApp.Ex().bb(this.cYR);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        IQApp.Ex().bc(this.cYR);
        super.onDestroyView();
    }

    public View getContentView() {
        return this.cYI.getRoot();
    }

    public void k(int i, long j) {
        bo(this.cYI.getRoot().findViewById(R.id.phoneIcon));
    }

    public t<Long> dx(boolean z) {
        startActivityForResult(SetPasscodeActivity.a(getContext(), z ? PasscodeScreen.newPasscode : PasscodeScreen.passcodeToTurnTouchIdOff), 1);
        this.cYQ = aa.vM();
        return this.cYQ;
    }

    public void azo() {
        startActivityForResult(SetPasscodeActivity.a(getContext(), PasscodeScreen.oldPasscode), 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 != -1) {
            aa aaVar = this.cYQ;
            if (aaVar != null) {
                aaVar.setException(new OperationCanceledException());
                this.cYQ = null;
            }
        } else if (intent != null) {
            long j = intent.getExtras().getLong(SetPasscodeActivity.aiZ);
            aa aaVar2 = this.cYQ;
            if (aaVar2 != null) {
                aaVar2.set(Long.valueOf(j));
                this.cYQ = null;
            }
        }
    }

    private void a(ig igVar) {
        if (igVar.ceP.getChildCount() == igVar.ceL.getChildCount()) {
            for (int i = 0; i < igVar.ceL.getChildCount(); i++) {
                this.cYF.add(igVar.ceL.getChildAt(i));
            }
            return;
        }
        throw new RuntimeException("dots are not equal tabs");
    }

    private void b(ig igVar) {
        for (int i = 0; i < igVar.ceP.getChildCount(); i++) {
            this.cYG.add(igVar.ceP.getChildAt(i));
        }
        azp();
        this.cYL = igVar.ceP.findViewById(com.iqoption.app.d.aP(getContext()).FL());
        if (this.cYL == null) {
            this.cYL = (View) this.cYG.get(0);
        }
        this.cYL.setAlpha(1.0f);
        this.cYL.setScaleX(1.2f);
        this.cYL.setScaleY(1.2f);
        this.cYL.setClickable(false);
        int bn = bn(this.cYL);
        if (bn == -1) {
            this.cYL = (View) this.cYG.get(0);
            bn = 0;
        }
        ((View) this.cYF.get(bn)).setAlpha(1.0f);
    }

    private void azp() {
        int i = Eq() ? R.drawable.ic_iq_security_mail_ok : R.drawable.ic_iq_security_mail;
        if (i != this.cYM) {
            this.cYM = i;
            this.cYI.ceN.setImageResource(i);
        }
        i = Eo() ? R.drawable.ic_iq_security_phone_ok : R.drawable.ic_iq_security_phone;
        if (i != this.cYN) {
            this.cYN = i;
            this.cYI.ceO.setImageResource(i);
        }
        i = azr() ? R.drawable.ic_iq_security_sms_ok : R.drawable.ic_iq_security_sms;
        if (i != this.cYO) {
            this.cYO = i;
            this.cYI.ceR.setImageResource(i);
        }
        i = azq() ? R.drawable.ic_iq_security_touchid_ok : R.drawable.ic_iq_security_touchid;
        if (i != this.cYP) {
            this.cYP = i;
            this.cYI.ceS.setImageResource(i);
        }
    }

    private boolean azq() {
        return com.iqoption.app.d.aP(getContext()).FM() >= 0;
    }

    private boolean azr() {
        return com.iqoption.app.b.aK(getContext()).Ec();
    }

    private boolean Eo() {
        com.iqoption.app.b aK = com.iqoption.app.b.aK(getContext());
        return !TextUtils.isEmpty(aK.getPhone()) && aK.Eo();
    }

    private boolean Eq() {
        return com.iqoption.fragment.account.security.a.c.bt(getContext());
    }

    private int bn(View view) {
        return this.cYI.ceP.indexOfChild(view);
    }

    private int azs() {
        View view = this.cYL;
        return view == null ? -1 : view.getId();
    }

    public void ayg() {
        onClose();
    }

    private void azt() {
        View root = this.cYI.getRoot();
        root.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                FragmentManager childFragmentManager = AccountSecurityFragment.this.getChildFragmentManager();
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(com.iqoption.fragment.account.security.touchId.a.TAG);
                if (findFragmentByTag != null) {
                    ((com.iqoption.fragment.account.security.touchId.a) findFragmentByTag).onBackPressed();
                } else {
                    Fragment findFragmentByTag2 = childFragmentManager.findFragmentByTag(PasscodeFragment.TAG);
                    if (findFragmentByTag2 != null) {
                        ((PasscodeFragment) findFragmentByTag2).onBackPressed();
                    } else {
                        AccountSecurityFragment.this.onClose();
                    }
                }
                return true;
            }
        });
        root.setFocusableInTouchMode(true);
    }

    public void bo(View view) {
        if (view.isClickable()) {
            view.setClickable(false);
            View view2 = this.cYL;
            if (view2 != null) {
                view2.setClickable(true);
                if (view2.getScaleX() > 1.0f) {
                    view2.animate().scaleX(1.0f).scaleY(1.0f).alpha(0.3f);
                }
                l(bn(view2), false);
            }
            this.cYL = view;
            this.cYL.animate().scaleX(1.2f).scaleY(1.2f).alpha(1.0f);
            int bn = bn(this.cYL);
            l(bn, true);
            this.cYI.ceT.setCurrentItem(bn, true);
            view.getId();
        }
    }

    private void l(int i, boolean z) {
        ((View) this.cYF.get(i)).animate().alpha(z ? 1.0f : 0.3f);
    }

    public void onResume() {
        super.onResume();
        this.cYK = true;
        getActivity().getWindow().setSoftInputMode(48);
        y.a(this);
    }

    public void onPause() {
        super.onPause();
        com.iqoption.app.d.aP(getContext()).dP(azs());
        getActivity().getWindow().setSoftInputMode(32);
        y.b(this);
        y.j(getActivity());
        onKeyboardVisibilityChanged(false);
    }

    private void dy(boolean z) {
        long j;
        if (z) {
            int i = this.cYK ? 550 : 200;
            this.cYK = false;
            getActivity().getWindowManager().getDefaultDisplay().getSize(new Point());
            float f = -this.cYI.ceT.getY();
            j = (long) i;
            this.cYI.ceQ.animate().alpha(0.0f).setDuration(j);
            this.cYI.ceP.animate().alpha(0.0f).setDuration(j);
            this.cYI.ceT.animate().translationY(f).setDuration(j);
            this.cYI.ceL.animate().alpha(0.0f).setDuration(j);
            return;
        }
        j = (long) 300;
        this.cYI.ceQ.animate().alpha(1.0f).setDuration(j);
        this.cYI.ceP.animate().alpha(1.0f).setDuration(j);
        this.cYI.ceT.animate().translationY(0.0f).setDuration(j);
        this.cYI.ceL.animate().alpha(1.0f).setDuration(j);
    }
}
