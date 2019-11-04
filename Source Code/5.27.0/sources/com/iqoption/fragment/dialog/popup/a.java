package com.iqoption.fragment.dialog.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.b.d;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.qn;
import com.iqoption.fragment.aj;
import com.iqoption.fragment.b.b;
import com.iqoption.popup.c;
import com.iqoption.util.af;
import com.iqoption.util.e;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: LegalUpdate */
public class a extends b {
    private static final String TAG = "com.iqoption.fragment.dialog.popup.a";
    private Builder arm;
    private qn deK;
    private com.iqoption.core.microservices.popupserver.response.a deL;
    private c deM;

    public static void a(FragmentActivity fragmentActivity, com.iqoption.core.microservices.popupserver.response.a aVar) {
        a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), aVar);
    }

    private static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, com.iqoption.core.microservices.popupserver.response.a aVar) {
        c.A(fragmentActivity).a(new -$$Lambda$a$rJAiKmhkTdmPIjUH2W5UaOiK2z8(fragmentManager, aVar), aVar);
    }

    private static void a(FragmentManager fragmentManager, com.iqoption.core.microservices.popupserver.response.a aVar) {
        a aVar2 = new a();
        aVar2.setArguments(new e().b("arg_popup_id", (Parcelable) aVar).toBundle());
        fragmentManager.beginTransaction().add(R.id.fragment, aVar2, TAG).addToBackStack(TAG).commitAllowingStateLoss();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.deL = (com.iqoption.core.microservices.popupserver.response.a) getArguments().getParcelable("arg_popup_id");
        this.deM = c.A(requireActivity());
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.deK = (qn) DataBindingUtil.inflate(layoutInflater, R.layout.legal_update, viewGroup, false);
        this.deK.cmS.setOnClickListener(new -$$Lambda$a$4UdvNhr5eRuVctZdzxP-NIOXMFo(this));
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{new com.iqoption.core.util.b.a(getString(R.string.legal_provisions), getString(R.string.we_ve_updated_some_legal_provisions))};
        d.a(new com.iqoption.core.util.b.e(aVarArr, this.deK.ani, getString(R.string.we_ve_updated_some_legal_provisions), R.color.white, R.color.white_60, false, new -$$Lambda$a$YzDSYqc8vGRalxpedfxsU2bVIkA(this)));
        com.iqoption.core.util.b bVar = com.iqoption.core.util.b.bQf;
        this.deK.getRoot().setOnClickListener(new -$$Lambda$a$cGfkfECHMCPWFXE8VpkNRs6mgrA(this, com.iqoption.core.util.b.bi(requireContext())));
        return this.deK.getRoot();
    }

    private /* synthetic */ void aD(View view) {
        onClose();
    }

    private /* synthetic */ void a(com.iqoption.core.util.b.a aVar) {
        aBU();
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.arm = Event.Builder(Event.CATEGORY_POPUP_SERVED, "legal-update_show");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("legal-update-shown");
        stringBuilder.append(com.iqoption.app.b.DG().getUserId());
        com.iqoption.app.d.i(stringBuilder.toString(), true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.arm != null) {
            EventManager.BS().a(this.arm.calcDuration().build());
        }
    }

    private void aBU() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "legal-update_legal-provisions").build());
        String Vi = com.iqoption.core.d.EE().Vi();
        String str = "WebFragment";
        requireFragmentManager().beginTransaction().add(R.id.other_fragment, aj.O(new e().aF("EXTRA_URL", String.format(Locale.US, "%sen/articles/new-terms-announce", new Object[]{Vi})).toBundle()), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commitAllowingStateLoss();
    }

    public boolean onClose() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "legal-update_accept").build());
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
        this.deM.m(this.deL);
        return true;
    }

    public void att() {
        this.deK.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.deK.cmT.setTranslationX((float) dimensionPixelSize2);
            this.deK.cmT.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.deK.bYN, this.deK.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.deK.bYN.getWidth(), (double) this.deK.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            ConstraintLayout constraintLayout = this.deK.cmT;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.deK.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.deK.bYN.setTranslationX(f);
        this.deK.bYN.setTranslationY(f);
        this.deK.bYN.setPivotX((float) (this.deK.bYN.getWidth() - dimensionPixelOffset));
        this.deK.bYN.setPivotY(1.0f);
        this.deK.bYN.setScaleX(0.3f);
        this.deK.bYN.setScaleY(0.3f);
        this.deK.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.deK.bYN.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
