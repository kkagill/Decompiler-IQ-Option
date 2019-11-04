package jumio.bam;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import com.jumio.bam.R;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorDialog;
import com.jumio.sdk.exception.JumioErrorDialog.ErrorInterface;
import com.jumio.sdk.models.CredentialsModel;
import com.jumio.sdk.view.fragment.BaseScanFragment;
import java.nio.CharBuffer;

@RequiresPresenter(x.class)
/* compiled from: BamScanFragment */
public class ad extends BaseScanFragment<x, af> implements ae, ag, jumio.bam.o.a {
    protected boolean a = false;
    private s b = null;
    private o c = null;
    private MenuItem d;
    private ConditionVariable e = new ConditionVariable(false);

    /* compiled from: BamScanFragment */
    class a implements ErrorInterface {
        private a() {
        }

        /* synthetic */ a(ad adVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public int getCaption() {
            return R.string.bam_error_view_button_cancel;
        }

        public void getAction() {
            ((x) ad.this.getPresenter()).a(true, false);
        }

        public int getColorID() {
            return R.attr.bam_dialogNegativeButtonTextColor;
        }
    }

    /* compiled from: BamScanFragment */
    class b implements ErrorInterface {
        private b() {
        }

        /* synthetic */ b(ad adVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public int getCaption() {
            return R.string.bam_error_view_button_try_again;
        }

        public void getAction() {
            ad adVar = ad.this;
            adVar.a = false;
            ((x) adVar.getPresenter()).c();
        }

        public int getColorID() {
            return R.attr.bam_dialogPositiveButtonTextColor;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((af) this.callback).registerActivityCallback(this);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((af) this.callback).setUiAutomationId(R.string.bam_automation_scan_card);
        this.b = new s(getActivity());
        this.b.setVisibility(4);
        this.mFragmentRootView.addView(this.b);
        this.c = new o(getActivity(), this);
        this.c.setVisibility(4);
        this.c.setLayoutParams(new LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(getActivity());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(3, R.id.topInfoBar);
        scrollView.setLayoutParams(layoutParams);
        scrollView.addView(this.c);
        scrollView.setFillViewport(true);
        scrollView.setImportantForAccessibility(2);
        this.mFragmentRootView.setImportantForAccessibility(1);
        this.mFragmentRootView.setContentDescription(getString(R.string.bam_scan_area_present_your_card_number));
        this.mFragmentRootView.addView(scrollView);
        setActionbarTitle(R.string.bam_activity_title_scan);
        this.mFragmentRootView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                ad.this.mFragmentRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ad.this.e.open();
            }
        });
        return onCreateView;
    }

    public void onLayoutRotated(boolean z) {
        super.onLayoutRotated(z);
        if (this.overlayView != null) {
            this.overlayView.requestLayout();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(com.jumio.core.R.attr.colorControlNormal, typedValue, true);
        Drawable drawable = CompatibilityLayer.getDrawable(getResources(), R.drawable.bam_ic_check);
        drawable.setColorFilter(typedValue.data, Mode.SRC_ATOP);
        this.d = menu.add(3, 3, 3, "");
        this.d.setEnabled(false);
        this.d.setVisible(false);
        this.d.setShowAsAction(2);
        this.d.setTitle(R.string.bam_accessibility_confirm_values);
        this.d.setIcon(drawable);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 3) {
            this.c.a(((x) getPresenter()).a());
            ((x) getPresenter()).a(false, false);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            ((x) getPresenter()).a(true, false);
            return true;
        }
    }

    public boolean onBackButtonPressed() {
        ((x) getPresenter()).a(true, false);
        return true;
    }

    public void c() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                ad.this.handleBranding(false);
                ad.this.handleControls(false, false);
                ad.this.a = true;
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void handleControls(boolean z, boolean z2) {
        if (!this.a) {
            super.handleControls(z, z2);
        }
    }

    public void updateBranding(boolean z) {
        this.e.block();
        super.updateBranding(z);
    }

    public CredentialsModel d() {
        return ((af) this.callback).getCredentials();
    }

    public boolean a(w wVar, v vVar) {
        return (vVar.a() && vVar.b()) || vVar.c() || vVar.n().size() != 0 || (vVar.e() && vVar.d());
    }

    public void b(w wVar, v vVar) {
        s sVar;
        StringBuilder stringBuilder;
        boolean z = vVar.a() && vVar.b();
        ((af) this.callback).setUiAutomationId(R.string.bam_automation_additional_info);
        this.c.setVisibility(0);
        handleControls(false, false);
        this.mFragmentRootView.removeView(this.textureView);
        this.mFragmentRootView.removeView(this.overlayView);
        this.mFragmentRootView.removeView(this.flashSwitcher);
        this.mFragmentRootView.removeView(this.cameraSwitcher);
        this.mFragmentRootView.setContentDescription("");
        this.mFragmentRootView.setImportantForAccessibility(2);
        this.b.setCreditCardNumber(CharBuffer.wrap(wVar.a(vVar.h())));
        if (!(wVar.getCardExpiryDateMonth().length == 0 || wVar.getCardExpiryDateYear().length == 0 || z)) {
            sVar = this.b;
            stringBuilder = new StringBuilder();
            stringBuilder.append(CharBuffer.wrap(wVar.getCardExpiryDateMonth()));
            stringBuilder.append(" / ");
            stringBuilder.append(CharBuffer.wrap(wVar.getCardExpiryDateYear()));
            sVar.setExpiryDate(stringBuilder.toString());
        }
        if (wVar.isCardAccountNumberValid() && wVar.isCardSortCodeValid() && wVar.getCardSortCode().length != 0 && wVar.getCardAccountNumber().length != 0) {
            sVar = this.b;
            stringBuilder = new StringBuilder();
            stringBuilder.append(CharBuffer.wrap(wVar.getCardSortCode()));
            stringBuilder.append(" ");
            stringBuilder.append(CharBuffer.wrap(wVar.getCardAccountNumber()));
            sVar.setSortCodeAndAccountNumber(stringBuilder.toString());
        }
        this.b.a(wVar.getCardType(), getResources());
        this.b.setVisibility(0);
        o oVar = this.c;
        boolean c = vVar.c();
        boolean z2 = vVar.d() && vVar.e();
        oVar.a(z, c, z2, vVar.n(), true);
        if (vVar.d()) {
            CharSequence wrap = CharBuffer.wrap(wVar.getCardHolderName());
            if (vVar.e() && wrap.length() != 0) {
                this.c.a(wrap);
            } else if (!(wrap.length() == 0 || wrap.toString().isEmpty())) {
                this.b.setCardHolderName(wrap);
            }
        }
        if (z) {
            this.c.a(wVar.getCardExpiryDateMonth(), wVar.getCardExpiryDateYear());
        }
        if (vVar.c()) {
            this.c.a(wVar.getCardType());
        }
        setActionbarTitle(R.string.bam_activity_title_additional_info);
    }

    public void onError(Throwable th) {
        if (th instanceof JumioError) {
            JumioErrorDialog.getAlertDialogBuilder(getContext(), (JumioError) th, new b(this, null), new a(this, null));
        }
    }

    public void a() {
        ((x) getPresenter()).a(true, true);
    }

    public void a(boolean z) {
        MenuItem menuItem = this.d;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.d.setEnabled(z);
        }
    }
}
