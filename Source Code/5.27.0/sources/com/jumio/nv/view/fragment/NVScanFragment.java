package com.jumio.nv.view.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.commons.view.ScaleableImageView;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.core.plugins.Plugin;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.gui.DrawView;
import com.jumio.nv.R;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.liveness.overlay.LivenessOverlay;
import com.jumio.nv.view.interactors.NVScanView;
import com.jumio.nv.view.interactors.NVScanView.GuiState;
import com.jumio.nv.view.interactors.NVScanView.HelpViewStyle;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorDialog;
import com.jumio.sdk.exception.JumioErrorDialog.ErrorInterface;
import com.jumio.sdk.gui.MaterialProgressBar;
import com.jumio.sdk.models.CredentialsModel;
import com.jumio.sdk.presentation.BaseScanPresenterBase.BaseScanControl;
import com.jumio.sdk.view.fragment.BaseScanFragment;
import java.util.UUID;
import jumio.nv.core.aa;
import jumio.nv.core.ah;

@RequiresPresenter(aa.class)
public class NVScanFragment extends BaseScanFragment<aa, INetverifyFragmentCallback> implements INetverifyActivityCallback, NVScanView {
    @Nullable
    private View a;
    private OnSwipeTouchListener b = null;
    @Nullable
    private View c;
    @Nullable
    private RelativeLayout d;
    @Nullable
    private MaterialProgressBar e;
    private boolean f = true;
    private Bitmap g;
    private int h;
    private LinearLayout i;
    private LinearLayout j;
    private ImageView k;
    private ah l;
    private AnimatorSet m;
    private RelativeLayout n;

    /* renamed from: com.jumio.nv.view.fragment.NVScanFragment$7 */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a = new int[HelpViewStyle.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(3:37|38|40)) */
        static {
            /*
            r0 = com.jumio.core.data.document.DocumentScanMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.jumio.core.data.document.DocumentScanMode.MRP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.jumio.core.data.document.DocumentScanMode.MRV;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.jumio.core.data.document.DocumentScanMode.TD1;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.jumio.core.data.document.DocumentScanMode.TD2;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = com.jumio.core.data.document.DocumentScanMode.CNIS;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = com.jumio.core.data.document.DocumentScanMode.CSSN;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = 6;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = com.jumio.core.data.document.DocumentScanMode.LINEFINDER;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r6 = 7;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = com.jumio.core.data.document.DocumentScanMode.TEMPLATEMATCHER;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r6 = 8;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = com.jumio.core.data.document.DocumentScanMode.PDF417;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r6 = 9;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = com.jumio.core.data.document.DocumentScanMode.FACE;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r6 = 10;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = com.jumio.core.data.document.DocumentScanMode.MANUAL;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r6 = 11;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r4 = com.jumio.nv.view.interactors.NVScanView.HelpViewStyle.values();
            r4 = r4.length;
            r4 = new int[r4];
            a = r4;
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = com.jumio.nv.view.interactors.NVScanView.HelpViewStyle.NONE;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r4 = com.jumio.nv.view.interactors.NVScanView.HelpViewStyle.MICRO;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r1 = com.jumio.nv.view.interactors.NVScanView.HelpViewStyle.MINI;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r1 = com.jumio.nv.view.interactors.NVScanView.HelpViewStyle.SMALL;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.view.fragment.NVScanFragment$AnonymousClass7.<clinit>():void");
        }
    }

    public class OnSwipeTouchListener implements OnTouchListener {
        private GestureDetector b;

        final class a extends SimpleOnGestureListener {
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            private a() {
            }

            /* synthetic */ a(OnSwipeTouchListener onSwipeTouchListener, AnonymousClass1 anonymousClass1) {
                this();
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (NVScanFragment.this.a == null || ((Integer) NVScanFragment.this.a.getTag()).intValue() != 0) {
                    JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.HELP_SELECTED, "OFF"));
                    NVScanFragment.this.a(false);
                } else {
                    JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.HELP_SELECTED, "ON"));
                    NVScanFragment.this.a(true);
                }
                return super.onSingleTapUp(motionEvent);
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                try {
                    float y = motionEvent2.getY() - motionEvent.getY();
                    if (Math.abs(y) > 100.0f && Math.abs(f2) > 100.0f) {
                        if (y > 0.0f) {
                            if (NVScanFragment.this.a != null && ((Integer) NVScanFragment.this.a.getTag()).intValue() == 1) {
                                JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.HELP_SELECTED, "OFF"));
                                NVScanFragment.this.a(false);
                            }
                        } else if (NVScanFragment.this.a != null && ((Integer) NVScanFragment.this.a.getTag()).intValue() == 0) {
                            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.HELP_SELECTED, "ON"));
                            NVScanFragment.this.a(true);
                        }
                    }
                } catch (Exception e) {
                    Log.printStackTrace(e);
                }
                return true;
            }
        }

        public OnSwipeTouchListener(Context context) {
            this.b = new GestureDetector(context, new a(this, null));
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.b.onTouchEvent(motionEvent);
        }
    }

    class a implements ErrorInterface {
        private JumioError b;

        public a(JumioError jumioError) {
            this.b = jumioError;
        }

        public int getCaption() {
            return R.string.netverify_button_cancel;
        }

        public void getAction() {
            ((aa) NVScanFragment.this.getPresenter()).a(this.b);
            UUID sessionId = JumioAnalytics.getSessionId();
            Screen screen = Screen.ERROR;
            UserAction userAction = UserAction.CANCEL;
            JumioError jumioError = this.b;
            JumioAnalytics.add(MobileEvents.userAction(sessionId, screen, userAction, jumioError != null ? String.valueOf(jumioError.getErrorCode()) : null));
        }

        public int getColorID() {
            return R.attr.netverify_dialogNegativeButtonTextColor;
        }
    }

    class b implements ErrorInterface {
        private JumioError b;

        public b(JumioError jumioError) {
            this.b = jumioError;
        }

        public int getCaption() {
            return R.string.netverify_button_retry;
        }

        public void getAction() {
            ((aa) NVScanFragment.this.getPresenter()).m();
            UUID sessionId = JumioAnalytics.getSessionId();
            Screen screen = Screen.ERROR;
            UserAction userAction = UserAction.RETRY;
            JumioError jumioError = this.b;
            JumioAnalytics.add(MobileEvents.userAction(sessionId, screen, userAction, jumioError != null ? String.valueOf(jumioError.getErrorCode()) : null));
        }

        public int getColorID() {
            return R.attr.netverify_dialogPositiveButtonTextColor;
        }
    }

    public void flipDocument() {
    }

    public void noUsAddressFound() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((INetverifyFragmentCallback) this.callback).registerActivityCallback(this);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            ((aa) getPresenter()).a((GuiState) bundle.getSerializable("guiState"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int i = (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) ? R.layout.nv_confirmationview_portrait : R.layout.nv_confirmationview_landscape;
        this.c = layoutInflater.inflate(i, this.mFragmentRootView, false);
        this.c.setVisibility(4);
        this.mFragmentRootView.addView(this.c);
        i = (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) ? R.layout.nv_newhelpview_portrait : R.layout.nv_newhelpview_land;
        this.a = layoutInflater.inflate(i, null, false);
        this.a.setVisibility(4);
        this.mFragmentRootView.addView(this.a);
        this.l = new ah(getContext());
        this.overlayView.setAlpha(0.0f);
        return onCreateView;
    }

    public void onResume() {
        super.onResume();
        ((INetverifyFragmentCallback) this.callback).animateActionbar(true, false, null, null, null);
        setActionbarTitle(ScanSide.FACE.equals(((aa) getPresenter()).d()) ? R.string.netverify_scanview_title_face : R.string.netverify_scanview_title);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("guiState", ((aa) getPresenter()).k());
    }

    /* Access modifiers changed, original: protected */
    public void handleControls(boolean z, boolean z2) {
        if (this.f) {
            super.handleControls(z, z2);
        }
    }

    public CredentialsModel getCredentialsModel() {
        return ((INetverifyFragmentCallback) this.callback).getCredentials();
    }

    public NfcController getNfcController() {
        return ((INetverifyFragmentCallback) this.callback).getNfcController();
    }

    public void showNFC(Bundle bundle) {
        Plugin plugin = PluginRegistry.getPlugin(PluginMode.NFC);
        ((INetverifyFragmentCallback) this.callback).setUiAutomationId(R.string.netverify_automation_scan_nfc);
        ((INetverifyFragmentCallback) this.callback).startFragment((Fragment) plugin.getOverlay(getContext(), bundle), true, 0, R.animator.nv_fade_out);
    }

    /* JADX WARNING: Missing block: B:35:0x010c, code skipped:
            r7 = 0;
            r8 = 0;
     */
    /* JADX WARNING: Missing block: B:51:0x015e, code skipped:
            r7 = r6;
            r6 = null;
     */
    /* JADX WARNING: Missing block: B:53:0x0163, code skipped:
            r8 = "retryPossible";
            r13 = "code";
     */
    /* JADX WARNING: Missing block: B:54:0x0169, code skipped:
            if (r1.isUSDLFallback == false) goto L_0x019c;
     */
    /* JADX WARNING: Missing block: B:55:0x016b, code skipped:
            r6 = new com.jumio.analytics.MetaInfo();
            r15 = new com.jumio.sdk.exception.JumioError(com.jumio.nv.enums.NVErrorCase.ADDRESS_MISSING);
            r6.put(r13, r15.getErrorCode());
            r6.put(r8, java.lang.Boolean.valueOf(r15.isRetryable()));
            com.jumio.analytics.JumioAnalytics.add(com.jumio.analytics.MobileEvents.pageView(com.jumio.analytics.JumioAnalytics.getSessionId(), com.jumio.analytics.Screen.ERROR, r6));
            r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
            r7 = com.jumio.nv.R.string.netverify_helpview_description_usdl_fallback;
     */
    /* JADX WARNING: Missing block: B:56:0x019a, code skipped:
            r8 = r7;
     */
    /* JADX WARNING: Missing block: B:58:0x01a0, code skipped:
            if (r1.initialScanMode != com.jumio.core.data.document.DocumentScanMode.CNIS) goto L_0x01a7;
     */
    /* JADX WARNING: Missing block: B:59:0x01a2, code skipped:
            r6 = com.jumio.nv.R.string.netverify_helpview_small_description_card;
            r7 = com.jumio.nv.R.string.netverify_helpview_full_description_card;
     */
    /* JADX WARNING: Missing block: B:61:0x01a9, code skipped:
            if (r1.isIdBackFaceDetected == false) goto L_0x01db;
     */
    /* JADX WARNING: Missing block: B:62:0x01ab, code skipped:
            r6 = new com.jumio.analytics.MetaInfo();
            r7 = new com.jumio.sdk.exception.JumioError(com.jumio.nv.enums.NVErrorCase.NO_FACE_ON_BACK);
            r6.put(r13, r7.getErrorCode());
            r6.put(r8, java.lang.Boolean.valueOf(r7.isRetryable()));
            com.jumio.analytics.JumioAnalytics.add(com.jumio.analytics.MobileEvents.pageView(com.jumio.analytics.JumioAnalytics.getSessionId(), com.jumio.analytics.Screen.ERROR, r6));
            r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
            r7 = com.jumio.nv.R.string.netverify_helpview_description_flip_document;
     */
    /* JADX WARNING: Missing block: B:63:0x01db, code skipped:
            r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
            r7 = com.jumio.nv.R.string.netverify_helpview_full_description;
     */
    /* JADX WARNING: Missing block: B:64:0x01e0, code skipped:
            if (r6 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Missing block: B:65:0x01e2, code skipped:
            r6 = getContext();
            r13 = com.jumio.nv.R.string.netverify_helpview_small_title_scan;
            r15 = new java.lang.Object[2];
            r15[0] = r4;
     */
    /* JADX WARNING: Missing block: B:66:0x01ec, code skipped:
            if (r12 == 0) goto L_0x01f7;
     */
    /* JADX WARNING: Missing block: B:67:0x01ee, code skipped:
            r4 = getContext().getString(r12);
     */
    /* JADX WARNING: Missing block: B:68:0x01f7, code skipped:
            r4 = r14;
     */
    /* JADX WARNING: Missing block: B:69:0x01f8, code skipped:
            r15[1] = r4;
            r6 = r6.getString(r13, r15);
     */
    /* JADX WARNING: Missing block: B:70:0x01ff, code skipped:
            if (r7 == 0) goto L_0x020a;
     */
    /* JADX WARNING: Missing block: B:71:0x0201, code skipped:
            r4 = getContext().getString(r7);
     */
    /* JADX WARNING: Missing block: B:72:0x020a, code skipped:
            r4 = null;
     */
    /* JADX WARNING: Missing block: B:73:0x020b, code skipped:
            if (r8 == 0) goto L_0x0216;
     */
    /* JADX WARNING: Missing block: B:74:0x020d, code skipped:
            r7 = getContext().getString(r8);
     */
    /* JADX WARNING: Missing block: B:75:0x0216, code skipped:
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:77:0x021a, code skipped:
            if (r1.totalParts <= 1) goto L_0x0238;
     */
    /* JADX WARNING: Missing block: B:78:0x021c, code skipped:
            r14 = getContext().getString(com.jumio.nv.R.string.netverify_helpview_progress_text, new java.lang.Object[]{java.lang.Integer.valueOf(r1.part), java.lang.Integer.valueOf(r1.totalParts)});
     */
    /* JADX WARNING: Missing block: B:79:0x0238, code skipped:
            r3 = new java.lang.StringBuilder(android.text.Html.fromHtml(r6));
            r2.setText(android.text.Html.fromHtml(r6));
     */
    /* JADX WARNING: Missing block: B:80:0x024c, code skipped:
            if (android.text.TextUtils.isEmpty(r14) != false) goto L_0x0255;
     */
    /* JADX WARNING: Missing block: B:81:0x024e, code skipped:
            r5.setText(r14);
            r3.append(r14);
     */
    /* JADX WARNING: Missing block: B:82:0x0255, code skipped:
            r5.setVisibility(8);
     */
    /* JADX WARNING: Missing block: B:83:0x025a, code skipped:
            if (r4 == null) goto L_0x0262;
     */
    /* JADX WARNING: Missing block: B:84:0x025c, code skipped:
            r10.setText(r4);
            r3.append(r4);
     */
    /* JADX WARNING: Missing block: B:85:0x0262, code skipped:
            if (r7 == null) goto L_0x0267;
     */
    /* JADX WARNING: Missing block: B:86:0x0264, code skipped:
            r11.setText(r7);
     */
    /* JADX WARNING: Missing block: B:87:0x0267, code skipped:
            r0.i.setContentDescription(r3.toString());
            r3 = 8;
            r12 = true;
     */
    public void showHelp(com.jumio.nv.view.interactors.NVScanView.NVHelpConfiguration r17, boolean r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r0.a;
        if (r2 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r2 = r1.side;
        r3 = com.jumio.core.data.document.ScanSide.FACE;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2 = com.jumio.nv.R.string.netverify_scanview_title_face;
        goto L_0x0018;
    L_0x0016:
        r2 = com.jumio.nv.R.string.netverify_scanview_title;
    L_0x0018:
        r0.setActionbarTitle(r2);
        r2 = r0.a;
        r3 = 2;
        r2.setImportantForAccessibility(r3);
        r2 = r0.a;
        r4 = 4;
        r2.setVisibility(r4);
        r2 = r0.a;
        r5 = com.jumio.nv.R.id.ic_toggle;
        r2 = r2.findViewById(r5);
        r2 = (android.widget.ImageView) r2;
        r0.k = r2;
        r2 = r0.a;
        r5 = com.jumio.nv.R.id.smallHelpView;
        r2 = r2.findViewById(r5);
        r2 = (android.widget.LinearLayout) r2;
        r0.i = r2;
        r2 = r0.a;
        r5 = com.jumio.nv.R.id.fullHelpView;
        r2 = r2.findViewById(r5);
        r2 = (android.widget.LinearLayout) r2;
        r0.j = r2;
        r2 = r1.scanMode;
        r5 = com.jumio.core.data.document.DocumentScanMode.FACE;
        r7 = 1;
        r8 = 8;
        r9 = 0;
        if (r2 == r5) goto L_0x0275;
    L_0x0055:
        r2 = r0.a;
        r5 = com.jumio.nv.R.id.help_tv_title;
        r2 = r2.findViewById(r5);
        r2 = (android.widget.TextView) r2;
        r5 = r0.a;
        r10 = com.jumio.nv.R.id.help_tv_steps;
        r5 = r5.findViewById(r10);
        r5 = (android.widget.TextView) r5;
        r10 = r0.a;
        r11 = com.jumio.nv.R.id.help_tv_description;
        r10 = r10.findViewById(r11);
        r10 = (android.widget.TextView) r10;
        r11 = r0.a;
        r12 = com.jumio.nv.R.id.help_tv_description_long;
        r11 = r11.findViewById(r12);
        r11 = (android.widget.TextView) r11;
        r12 = r1.helpViewStyle;
        r12 = r0.getHelpViewHeight(r12);
        r0.h = r12;
        r12 = com.jumio.nv.view.fragment.NVScanFragment.AnonymousClass7.a;
        r13 = r1.helpViewStyle;
        r13 = r13.ordinal();
        r12 = r12[r13];
        if (r12 == r7) goto L_0x00d5;
    L_0x0091:
        if (r12 == r3) goto L_0x00c1;
    L_0x0093:
        r13 = 3;
        if (r12 == r13) goto L_0x00ad;
    L_0x0096:
        if (r12 == r4) goto L_0x0099;
    L_0x0098:
        goto L_0x00e3;
    L_0x0099:
        r12 = r0.k;
        r13 = r1.isExpandable;
        if (r13 == 0) goto L_0x00a0;
    L_0x009f:
        r4 = 0;
    L_0x00a0:
        r12.setVisibility(r4);
        r2.setVisibility(r9);
        r5.setVisibility(r9);
        r10.setVisibility(r9);
        goto L_0x00e3;
    L_0x00ad:
        r12 = r0.k;
        r13 = r1.isExpandable;
        if (r13 == 0) goto L_0x00b4;
    L_0x00b3:
        r4 = 0;
    L_0x00b4:
        r12.setVisibility(r4);
        r2.setVisibility(r9);
        r5.setVisibility(r9);
        r10.setVisibility(r8);
        goto L_0x00e3;
    L_0x00c1:
        r12 = r0.k;
        r13 = r1.isExpandable;
        if (r13 == 0) goto L_0x00c8;
    L_0x00c7:
        r4 = 0;
    L_0x00c8:
        r12.setVisibility(r4);
        r2.setVisibility(r8);
        r5.setVisibility(r8);
        r10.setVisibility(r8);
        goto L_0x00e3;
    L_0x00d5:
        r4 = r0.k;
        r4.setVisibility(r8);
        r2.setVisibility(r8);
        r5.setVisibility(r8);
        r10.setVisibility(r8);
    L_0x00e3:
        r4 = r1.documentType;
        r12 = r16.getContext();
        r4 = r4.getLocalizedName(r12);
        r12 = r1.side;
        r13 = com.jumio.core.data.document.ScanSide.FRONT;
        r12 = r12.equals(r13);
        if (r12 == 0) goto L_0x00fa;
    L_0x00f7:
        r12 = com.jumio.nv.R.string.netverify_front;
        goto L_0x00fc;
    L_0x00fa:
        r12 = com.jumio.nv.R.string.netverify_back;
    L_0x00fc:
        r13 = com.jumio.nv.view.fragment.NVScanFragment.AnonymousClass7.b;
        r14 = r1.scanMode;
        r14 = r14.ordinal();
        r13 = r13[r14];
        r14 = "";
        switch(r13) {
            case 1: goto L_0x0162;
            case 2: goto L_0x0162;
            case 3: goto L_0x0163;
            case 4: goto L_0x0163;
            case 5: goto L_0x0163;
            case 6: goto L_0x0163;
            case 7: goto L_0x0163;
            case 8: goto L_0x015a;
            case 9: goto L_0x0155;
            case 10: goto L_0x014a;
            case 11: goto L_0x0110;
            default: goto L_0x010b;
        };
    L_0x010b:
        r6 = 0;
    L_0x010c:
        r7 = 0;
        r8 = 0;
        goto L_0x01e0;
    L_0x0110:
        r12 = com.jumio.nv.data.document.NVDocumentType.PASSPORT;
        r12 = r12.toString();
        r12 = r4.equalsIgnoreCase(r12);
        if (r12 == 0) goto L_0x011e;
    L_0x011c:
        r12 = 0;
        goto L_0x012d;
    L_0x011e:
        r12 = r1.side;
        r13 = com.jumio.core.data.document.ScanSide.FRONT;
        r12 = r12.equals(r13);
        if (r12 == 0) goto L_0x012b;
    L_0x0128:
        r12 = com.jumio.nv.R.string.netverify_inside;
        goto L_0x012d;
    L_0x012b:
        r12 = com.jumio.nv.R.string.netverify_outside;
    L_0x012d:
        r13 = r16.getContext();
        r15 = com.jumio.nv.R.string.netverify_helpview_small_title_capture;
        r6 = new java.lang.Object[r3];
        r6[r9] = r4;
        if (r12 == 0) goto L_0x0142;
    L_0x0139:
        r8 = r16.getContext();
        r8 = r8.getString(r12);
        goto L_0x0143;
    L_0x0142:
        r8 = r14;
    L_0x0143:
        r6[r7] = r8;
        r6 = r13.getString(r15, r6);
        goto L_0x010c;
    L_0x014a:
        r6 = r0.callback;
        r6 = (com.jumio.nv.view.fragment.INetverifyFragmentCallback) r6;
        r8 = com.jumio.nv.R.string.netverify_automation_help_face;
        r6.setUiAutomationId(r8);
        r6 = r14;
        goto L_0x010c;
    L_0x0155:
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description_barcode;
        r8 = com.jumio.nv.R.string.netverify_helpview_full_description_barcode;
        goto L_0x015e;
    L_0x015a:
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description_template;
        r8 = com.jumio.nv.R.string.netverify_helpview_full_description_template;
    L_0x015e:
        r7 = r6;
        r6 = 0;
        goto L_0x01e0;
    L_0x0162:
        r12 = 0;
    L_0x0163:
        r6 = r1.isUSDLFallback;
        r8 = "retryPossible";
        r13 = "code";
        if (r6 == 0) goto L_0x019c;
    L_0x016b:
        r6 = new com.jumio.analytics.MetaInfo;
        r6.<init>();
        r15 = new com.jumio.sdk.exception.JumioError;
        r7 = com.jumio.nv.enums.NVErrorCase.ADDRESS_MISSING;
        r15.<init>(r7);
        r7 = r15.getErrorCode();
        r6.put(r13, r7);
        r7 = r15.isRetryable();
        r7 = java.lang.Boolean.valueOf(r7);
        r6.put(r8, r7);
        r7 = com.jumio.analytics.JumioAnalytics.getSessionId();
        r8 = com.jumio.analytics.Screen.ERROR;
        r6 = com.jumio.analytics.MobileEvents.pageView(r7, r8, r6);
        com.jumio.analytics.JumioAnalytics.add(r6);
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
        r7 = com.jumio.nv.R.string.netverify_helpview_description_usdl_fallback;
    L_0x019a:
        r8 = r7;
        goto L_0x015e;
    L_0x019c:
        r6 = r1.initialScanMode;
        r7 = com.jumio.core.data.document.DocumentScanMode.CNIS;
        if (r6 != r7) goto L_0x01a7;
    L_0x01a2:
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description_card;
        r7 = com.jumio.nv.R.string.netverify_helpview_full_description_card;
        goto L_0x019a;
    L_0x01a7:
        r6 = r1.isIdBackFaceDetected;
        if (r6 == 0) goto L_0x01db;
    L_0x01ab:
        r6 = new com.jumio.analytics.MetaInfo;
        r6.<init>();
        r7 = new com.jumio.sdk.exception.JumioError;
        r15 = com.jumio.nv.enums.NVErrorCase.NO_FACE_ON_BACK;
        r7.<init>(r15);
        r15 = r7.getErrorCode();
        r6.put(r13, r15);
        r7 = r7.isRetryable();
        r7 = java.lang.Boolean.valueOf(r7);
        r6.put(r8, r7);
        r7 = com.jumio.analytics.JumioAnalytics.getSessionId();
        r8 = com.jumio.analytics.Screen.ERROR;
        r6 = com.jumio.analytics.MobileEvents.pageView(r7, r8, r6);
        com.jumio.analytics.JumioAnalytics.add(r6);
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
        r7 = com.jumio.nv.R.string.netverify_helpview_description_flip_document;
        goto L_0x019a;
    L_0x01db:
        r6 = com.jumio.nv.R.string.netverify_helpview_small_description;
        r7 = com.jumio.nv.R.string.netverify_helpview_full_description;
        goto L_0x019a;
    L_0x01e0:
        if (r6 != 0) goto L_0x01ff;
    L_0x01e2:
        r6 = r16.getContext();
        r13 = com.jumio.nv.R.string.netverify_helpview_small_title_scan;
        r15 = new java.lang.Object[r3];
        r15[r9] = r4;
        if (r12 == 0) goto L_0x01f7;
    L_0x01ee:
        r4 = r16.getContext();
        r4 = r4.getString(r12);
        goto L_0x01f8;
    L_0x01f7:
        r4 = r14;
    L_0x01f8:
        r12 = 1;
        r15[r12] = r4;
        r6 = r6.getString(r13, r15);
    L_0x01ff:
        if (r7 == 0) goto L_0x020a;
    L_0x0201:
        r4 = r16.getContext();
        r4 = r4.getString(r7);
        goto L_0x020b;
    L_0x020a:
        r4 = 0;
    L_0x020b:
        if (r8 == 0) goto L_0x0216;
    L_0x020d:
        r7 = r16.getContext();
        r7 = r7.getString(r8);
        goto L_0x0217;
    L_0x0216:
        r7 = 0;
    L_0x0217:
        r8 = r1.totalParts;
        r12 = 1;
        if (r8 <= r12) goto L_0x0238;
    L_0x021c:
        r8 = r16.getContext();
        r13 = com.jumio.nv.R.string.netverify_helpview_progress_text;
        r3 = new java.lang.Object[r3];
        r14 = r1.part;
        r14 = java.lang.Integer.valueOf(r14);
        r3[r9] = r14;
        r14 = r1.totalParts;
        r14 = java.lang.Integer.valueOf(r14);
        r3[r12] = r14;
        r14 = r8.getString(r13, r3);
    L_0x0238:
        r3 = new java.lang.StringBuilder;
        r8 = android.text.Html.fromHtml(r6);
        r3.<init>(r8);
        r6 = android.text.Html.fromHtml(r6);
        r2.setText(r6);
        r2 = android.text.TextUtils.isEmpty(r14);
        if (r2 != 0) goto L_0x0255;
    L_0x024e:
        r5.setText(r14);
        r3.append(r14);
        goto L_0x025a;
    L_0x0255:
        r2 = 8;
        r5.setVisibility(r2);
    L_0x025a:
        if (r4 == 0) goto L_0x0262;
    L_0x025c:
        r10.setText(r4);
        r3.append(r4);
    L_0x0262:
        if (r7 == 0) goto L_0x0267;
    L_0x0264:
        r11.setText(r7);
    L_0x0267:
        r2 = r0.i;
        r3 = r3.toString();
        r2.setContentDescription(r3);
        r3 = 8;
        r12 = 1;
        goto L_0x0326;
    L_0x0275:
        r2 = r0.k;
        r3 = 8;
        r2.setVisibility(r3);
        r2 = r16.getContext();
        r2 = android.view.LayoutInflater.from(r2);
        r5 = r0.j;
        r5.removeAllViews();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r1.isPortrait;
        if (r6 == 0) goto L_0x02e5;
    L_0x0292:
        r4 = com.jumio.nv.R.layout.nv_livenesshelp;
        r6 = r0.j;
        r7 = 1;
        r2.inflate(r4, r6, r7);
        r2 = com.jumio.nv.R.string.netverify_scanview_title_problems;
        r0.setActionbarTitle(r2);
        r2 = r0.j;
        r4 = com.jumio.nv.R.id.helpview_liveness_glasses_text;
        r2 = r2.findViewById(r4);
        r2 = (android.widget.TextView) r2;
        r4 = com.jumio.nv.R.string.netverify_helpview_full_description_liveness_glasses;
        r2.setText(r4);
        r2 = r2.getText();
        r5.append(r2);
        r2 = r0.j;
        r4 = com.jumio.nv.R.id.helpview_liveness_cap_text;
        r2 = r2.findViewById(r4);
        r2 = (android.widget.TextView) r2;
        r4 = com.jumio.nv.R.string.netverify_helpview_full_description_liveness_cap;
        r2.setText(r4);
        r2 = r2.getText();
        r5.append(r2);
        r2 = r0.j;
        r4 = com.jumio.nv.R.id.helpview_liveness_light_text;
        r2 = r2.findViewById(r4);
        r2 = (android.widget.TextView) r2;
        r4 = com.jumio.nv.R.string.netverify_helpview_full_description_liveness_light;
        r2.setText(r4);
        r2 = r2.getText();
        r5.append(r2);
        r12 = 1;
        r1.showFallback = r12;
        goto L_0x0322;
    L_0x02e5:
        r12 = 1;
        r2 = r0.j;
        r6 = r16.getContext();
        r6 = com.jumio.nv.liveness.overlay.LivenessOverlay.getRotationLayout(r6);
        r2.addView(r6);
        r2 = r0.j;
        r6 = com.jumio.nv.R.id.helpview_doctype_title;
        r2 = r2.findViewById(r6);
        r2 = (android.widget.TextView) r2;
        r2 = r2.getText();
        r5.append(r2);
        r2 = r0.j;
        r6 = com.jumio.nv.R.id.helpview_scan_instructions;
        r2 = r2.findViewById(r6);
        r2 = (android.widget.TextView) r2;
        r2 = r2.getText();
        r5.append(r2);
        r2 = r0.j;
        r6 = com.jumio.nv.R.id.helpview_fallback_button;
        r2 = r2.findViewById(r6);
        r2.setVisibility(r4);
        r1.showFallback = r9;
    L_0x0322:
        r7 = r5.toString();
    L_0x0326:
        r2 = r0.j;
        r2.setContentDescription(r7);
        r2 = r0.a;
        r4 = com.jumio.nv.R.id.helpview_fallback_button;
        r2 = r2.findViewById(r4);
        r2 = (android.widget.Button) r2;
        if (r2 == 0) goto L_0x0373;
    L_0x0337:
        r4 = r1.scanMode;
        r5 = com.jumio.core.data.document.DocumentScanMode.PDF417;
        if (r4 != r5) goto L_0x0343;
    L_0x033d:
        r4 = com.jumio.nv.R.string.netverify_helpview_fallback_barcode;
        r2.setText(r4);
        goto L_0x0363;
    L_0x0343:
        r4 = r1.scanMode;
        r5 = com.jumio.core.data.document.DocumentScanMode.FACE;
        if (r4 != r5) goto L_0x034f;
    L_0x0349:
        r4 = com.jumio.nv.R.string.netverify_helpview_liveness_continue;
        r2.setText(r4);
        goto L_0x0363;
    L_0x034f:
        r4 = r1.isUSDLFallback;
        if (r4 != 0) goto L_0x035e;
    L_0x0353:
        r4 = r1.isIdBackFaceDetected;
        if (r4 == 0) goto L_0x0358;
    L_0x0357:
        goto L_0x035e;
    L_0x0358:
        r4 = com.jumio.nv.R.string.netverify_helpview_fallback;
        r2.setText(r4);
        goto L_0x0363;
    L_0x035e:
        r4 = com.jumio.nv.R.string.netverify_helpview_usdl_fallback_continue;
        r2.setText(r4);
    L_0x0363:
        r4 = r1.showFallback;
        if (r4 == 0) goto L_0x0368;
    L_0x0367:
        r3 = 0;
    L_0x0368:
        r2.setVisibility(r3);
        r3 = new com.jumio.nv.view.fragment.NVScanFragment$1;
        r3.<init>(r1);
        r2.setOnClickListener(r3);
    L_0x0373:
        r2 = r1.isExpandable;
        if (r2 == 0) goto L_0x038a;
    L_0x0377:
        r2 = new com.jumio.nv.view.fragment.NVScanFragment$OnSwipeTouchListener;
        r3 = r16.getContext();
        r2.<init>(r3);
        r0.b = r2;
        r2 = r0.a;
        r3 = r0.b;
        r2.setOnTouchListener(r3);
        goto L_0x038d;
    L_0x038a:
        r2 = 0;
        r0.b = r2;
    L_0x038d:
        if (r18 != 0) goto L_0x03a8;
    L_0x038f:
        r2 = r0.a;
        r3 = java.lang.Integer.valueOf(r9);
        r2.setTag(r3);
        r2 = r0.mFragmentRootView;
        r2 = r2.getViewTreeObserver();
        r3 = new com.jumio.nv.view.fragment.NVScanFragment$2;
        r3.<init>(r1);
        r2.addOnGlobalLayoutListener(r3);
        goto L_0x0423;
    L_0x03a8:
        r2 = r0.l;
        r3 = r0.a;
        r4 = r0.rotationManager;
        r4 = r4.isScreenPortrait();
        if (r4 != 0) goto L_0x03be;
    L_0x03b4:
        r4 = r0.rotationManager;
        r4 = r4.isTablet();
        if (r4 == 0) goto L_0x03bd;
    L_0x03bc:
        goto L_0x03be;
    L_0x03bd:
        r12 = 0;
    L_0x03be:
        r2.a(r3, r1, r12);
        r2 = r0.a;
        r2 = r2.getTag();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        if (r2 != 0) goto L_0x0403;
    L_0x03d2:
        r2 = r0.a;
        r5 = r0.mFragmentRootView;
        r5 = r5.getHeight();
        r6 = r0.h;
        r5 = r5 - r6;
        r5 = (float) r5;
        r2.setTranslationY(r5);
        r2 = r0.i;
        r2.setAlpha(r3);
        r2 = r0.j;
        r2.setAlpha(r4);
        r2 = r0.overlayView;
        r2.setAlpha(r3);
        r2 = r0.k;
        r3 = com.jumio.nv.R.drawable.nv_slide_up;
        r2.setImageResource(r3);
        r1 = r1.scanMode;
        r2 = com.jumio.core.data.document.DocumentScanMode.FACE;
        if (r1 != r2) goto L_0x041e;
    L_0x03fd:
        r1 = com.jumio.nv.R.string.netverify_scanview_title_face;
        r0.setActionbarTitle(r1);
        goto L_0x041e;
    L_0x0403:
        r1 = r0.l;
        r1.a();
        r1 = r0.a;
        r1.setTranslationY(r4);
        r1 = r0.i;
        r1.setAlpha(r4);
        r1 = r0.j;
        r1.setAlpha(r3);
        r1 = r0.k;
        r2 = com.jumio.nv.R.drawable.nv_slide_down;
        r1.setImageResource(r2);
    L_0x041e:
        r1 = r0.a;
        r1.setVisibility(r9);
    L_0x0423:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.view.fragment.NVScanFragment.showHelp(com.jumio.nv.view.interactors.NVScanView$NVHelpConfiguration, boolean):void");
    }

    private void a(final boolean z) {
        View view = this.a;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.m.cancel();
            this.m.setupEndValues();
        }
        this.m = new AnimatorSet();
        this.m.setDuration(500);
        this.m.setInterpolator(new AccelerateDecelerateInterpolator());
        this.m.addListener(new AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                if (NVScanFragment.this.a != null) {
                    NVScanFragment.this.a.setTag(Integer.valueOf(z));
                }
                if (z) {
                    NVScanFragment.this.handleControls(false, false);
                    NVScanFragment.this.f = false;
                    ((aa) NVScanFragment.this.getPresenter()).a(z);
                    NVScanFragment.this.l.a();
                    return;
                }
                NVScanFragment.this.l.b();
                ((aa) NVScanFragment.this.getPresenter()).l();
            }

            public void onAnimationEnd(Animator animator) {
                NVScanFragment.this.k.setImageResource(z ? R.drawable.nv_slide_down : R.drawable.nv_slide_up);
                if (!z) {
                    ((aa) NVScanFragment.this.getPresenter()).a(z);
                    NVScanFragment.this.f = true;
                    NVScanFragment nVScanFragment = NVScanFragment.this;
                    nVScanFragment.handleControls(((aa) nVScanFragment.getPresenter()).control(BaseScanControl.hasMultipleCameras), ((aa) NVScanFragment.this.getPresenter()).control(BaseScanControl.hasFlash));
                }
                if (NVScanFragment.this.a != null) {
                    NVScanFragment.this.a.setOnTouchListener(NVScanFragment.this.b);
                }
            }
        });
        view = this.a;
        if (view != null) {
            LinearLayout linearLayout;
            float[] fArr;
            float[] fArr2 = new float[2];
            fArr2[0] = view.getTranslationY();
            float f = 0.0f;
            fArr2[1] = z ? 0.0f : (float) (this.mFragmentRootView.getHeight() - this.h);
            Builder play = this.m.play(ObjectAnimator.ofFloat(view, "translationY", fArr2));
            String str = "alpha";
            if ((z && this.i.getAlpha() == 1.0f) || (!z && this.i.getAlpha() == 0.0f)) {
                linearLayout = this.i;
                fArr = new float[2];
                fArr[0] = z ? 1.0f : 0.0f;
                fArr[1] = z ? 0.0f : 1.0f;
                play.with(ObjectAnimator.ofFloat(linearLayout, str, fArr));
            }
            if ((z && this.j.getAlpha() == 0.0f) || (!z && this.j.getAlpha() == 1.0f)) {
                linearLayout = this.j;
                fArr = new float[2];
                fArr[0] = z ? 0.0f : 1.0f;
                fArr[1] = z ? 1.0f : 0.0f;
                play.with(ObjectAnimator.ofFloat(linearLayout, str, fArr));
            }
            if ((z && this.overlayView.getAlpha() == 1.0f) || (!z && this.overlayView.getAlpha() == 0.0f)) {
                DrawView drawView = this.overlayView;
                float[] fArr3 = new float[2];
                fArr3[0] = z ? 1.0f : 0.0f;
                if (!z) {
                    f = 1.0f;
                }
                fArr3[1] = f;
                play.with(ObjectAnimator.ofFloat(drawView, str, fArr3));
            }
            this.m.start();
        }
    }

    public void showConfirmation(String str, boolean z) {
        handleControls(false, false);
        this.f = false;
        setActionbarTitle(R.string.netverify_scanview_title_check);
        ((INetverifyFragmentCallback) this.callback).setUiAutomationId(R.string.netverify_automation_confirmation);
        View view = this.c;
        if (view != null) {
            ObjectAnimator ofFloat;
            view = view.findViewById(R.id.confirmation_layout_base);
            ScaleableImageView scaleableImageView = (ScaleableImageView) this.c.findViewById(R.id.confirmationImage);
            TextView textView = (TextView) this.c.findViewById(R.id.confirmationSnackBar);
            final TextView textView2 = (TextView) this.c.findViewById(R.id.confirmationPositiveTextView);
            final TextView textView3 = (TextView) this.c.findViewById(R.id.confirmationNegativeTextView);
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
                this.g = null;
                System.gc();
            }
            this.g = BitmapFactory.decodeFile(str);
            bitmap = this.g;
            if (bitmap != null) {
                scaleableImageView.setImageBitmap(bitmap);
            }
            textView.setText(R.string.netverify_scanview_snackbar_check);
            if (!TextUtils.isEmpty(textView.getText())) {
                scaleableImageView.setContentDescription(textView.getText());
                view.setContentDescription(textView.getText());
            }
            textView2.setEnabled(true);
            textView2.setText(R.string.netverify_scanview_readable);
            textView2.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    textView2.setEnabled(false);
                    textView3.setEnabled(false);
                    ((aa) NVScanFragment.this.getPresenter()).f();
                }
            });
            textView3.setEnabled(true);
            textView3.setText(R.string.netverify_scanview_retake);
            final TextView textView4 = textView3;
            final ScaleableImageView scaleableImageView2 = scaleableImageView;
            final TextView textView5 = textView;
            textView3.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    textView2.setEnabled(false);
                    textView4.setEnabled(false);
                    NVScanFragment.this.f = true;
                    NVScanFragment nVScanFragment = NVScanFragment.this;
                    nVScanFragment.handleControls(((aa) nVScanFragment.getPresenter()).control(BaseScanControl.hasMultipleCameras), ((aa) NVScanFragment.this.getPresenter()).control(BaseScanControl.hasFlash));
                    if (NVScanFragment.this.c != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(scaleableImageView2, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(400);
                        ofFloat.setStartDelay(100);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        Builder play = animatorSet.play(ofFloat);
                        View findViewById = NVScanFragment.this.c.findViewById(R.id.buttonLayout);
                        ObjectAnimator ofFloat2;
                        if (NVScanFragment.this.rotationManager.isScreenPortrait() || NVScanFragment.this.rotationManager.isTablet()) {
                            String str = "translationY";
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, str, new float[]{0.0f, (float) textView5.getHeight()});
                            ofFloat3.setDuration(300);
                            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                            ofFloat2 = ObjectAnimator.ofFloat(findViewById, str, new float[]{0.0f, (float) findViewById.getHeight()});
                            ofFloat2.setStartDelay(100);
                            ofFloat2.setDuration(400);
                            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                            play.with(ofFloat3).with(ofFloat2);
                        } else {
                            ofFloat2 = ObjectAnimator.ofFloat(findViewById, "translationX", new float[]{0.0f, (float) findViewById.getWidth()});
                            ofFloat2.setDuration(300);
                            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                            play.with(ofFloat2);
                        }
                        animatorSet.addListener(new AnimatorListener() {
                            public void onAnimationCancel(Animator animator) {
                            }

                            public void onAnimationRepeat(Animator animator) {
                            }

                            public void onAnimationStart(Animator animator) {
                                ((aa) NVScanFragment.this.getPresenter()).a();
                            }

                            public void onAnimationEnd(Animator animator) {
                                NVScanFragment.this.c.setVisibility(4);
                                ((aa) NVScanFragment.this.getPresenter()).h();
                                if (NVScanFragment.this.g != null) {
                                    NVScanFragment.this.g.recycle();
                                    NVScanFragment.this.g = null;
                                    System.gc();
                                }
                            }
                        });
                        animatorSet.start();
                    }
                    NVScanFragment.this.setActionbarTitle(R.string.netverify_scanview_title);
                }
            });
            scaleableImageView.setAlpha(0.0f);
            View findViewById = this.c.findViewById(R.id.buttonLayout);
            AnimatorSet animatorSet = new AnimatorSet();
            String str2 = "alpha";
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(scaleableImageView, str2, new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            Builder play = animatorSet.play(ofFloat2);
            if (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) {
                textView.setTranslationY((float) (findViewById.getHeight() + textView.getHeight()));
                String str3 = "translationY";
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, str3, new float[]{(float) (findViewById.getHeight() + textView.getHeight()), 0.0f});
                ofFloat3.setStartDelay(100);
                ofFloat3.setDuration(400);
                ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                findViewById.setTranslationY((float) (findViewById.getHeight() + textView.getHeight()));
                ofFloat = ObjectAnimator.ofFloat(findViewById, str3, new float[]{(float) (findViewById.getHeight() + textView.getHeight()), 0.0f});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                play.with(ofFloat3).with(ofFloat);
            } else {
                findViewById.setTranslationX((float) findViewById.getWidth());
                ofFloat = ObjectAnimator.ofFloat(findViewById, "translationX", new float[]{(float) findViewById.getWidth(), 0.0f});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                play.with(ofFloat);
            }
            if (!z) {
                ofFloat = ObjectAnimator.ofFloat(this.overlayView, str2, new float[]{1.0f, 0.0f});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                play.before(ofFloat);
            }
            this.c.setVisibility(0);
            animatorSet.start();
            if (!z) {
                JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.CONFIRMATION, null));
            }
        }
    }

    public void showLoading() {
        if (this.d != null) {
            this.mFragmentRootView.removeView(this.d);
            this.d = null;
            this.e = null;
        }
        TypedValue typedValue = new TypedValue();
        int dpToPx = ScreenUtil.dpToPx(getContext(), 45);
        getContext().getTheme().resolveAttribute(R.attr.netverify_fastfillLoadingBackground, typedValue, true);
        this.d = new RelativeLayout(this.mFragmentRootView.getContext());
        this.d.setLayoutParams(new LayoutParams(-1, -1));
        this.d.setPadding(dpToPx, 0, dpToPx, 0);
        this.d.setBackgroundColor(typedValue.data);
        dpToPx = ScreenUtil.dpToPx(getContext(), 190);
        int dpToPx2 = ScreenUtil.dpToPx(getContext(), 6);
        getContext().getTheme().resolveAttribute(R.attr.netverify_fastfillLoadingProgress, typedValue, true);
        Context context = this.mFragmentRootView.getContext();
        boolean z = this.callback != null && ((INetverifyFragmentCallback) this.callback).isRunningTest();
        this.e = new MaterialProgressBar(context, z);
        this.e.setLayoutParams(new LayoutParams(dpToPx, dpToPx));
        this.e.setCircleBackgroundEnabled(false);
        this.e.setColorSchemeColors(typedValue.data);
        this.e.setProgressStokeWidth(dpToPx2);
        this.d.addView(this.e);
        a();
        this.mFragmentRootView.addView(this.d);
    }

    private void a() {
        MaterialProgressBar materialProgressBar = this.e;
        if (materialProgressBar != null) {
            LayoutParams layoutParams = (LayoutParams) materialProgressBar.getLayoutParams();
            if (!this.rotationManager.isScreenLandscape() || this.rotationManager.isTablet()) {
                layoutParams.addRule(14);
                layoutParams.topMargin = ScreenUtil.dpToPx(getContext(), 60);
            } else {
                layoutParams.addRule(13);
                layoutParams.topMargin = 0;
            }
            this.e.setLayoutParams(layoutParams);
        }
    }

    public void extractionStarted() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                NVScanFragment.this.handleControls(false, false);
                NVScanFragment.this.f = false;
            }
        });
    }

    public void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = this.g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.g.recycle();
            this.g = null;
            System.gc();
        }
    }

    public void scansComplete() {
        ((aa) getPresenter()).g();
        ((INetverifyFragmentCallback) this.callback).startFragment(new UploadFragment(), true, 0, R.animator.nv_fade_out);
    }

    public void partComplete() {
        ((aa) getPresenter()).j();
        ((INetverifyFragmentCallback) this.callback).startFragment(new NVScanFragment(), true, 0, R.animator.nv_fade_out);
    }

    public void updateUiAutomationScanId(PluginMode pluginMode) {
        StringBuilder stringBuilder = new StringBuilder(getResources().getString(R.string.netverify_automation_scan));
        stringBuilder.append(pluginMode.toString().toLowerCase());
        ((INetverifyFragmentCallback) this.callback).setUiAutomationString(stringBuilder.toString());
    }

    public void displayBlurHint() {
        Toast makeText = Toast.makeText(getContext(), com.jumio.core.R.string.jumio_scanview_refocus, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public void showLegalHint(int i) {
        if (i != 0) {
            String string = getString(i);
            if (string != null && string.length() != 0) {
                Toast makeText = Toast.makeText(getActivity(), i, 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
    }

    public boolean displayOverlay(boolean z) {
        if (!ScanSide.FACE.equals(((aa) getPresenter()).d())) {
            return true;
        }
        int i = 4;
        if (this.n == null) {
            this.n = LivenessOverlay.getRotationLayout(getContext());
            this.n.setVisibility(4);
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.netverify_scanOverlayLivenessBackground, typedValue, true);
            this.n.setBackgroundColor(typedValue.data);
            this.overlayView.addView(this.n);
        }
        RelativeLayout relativeLayout = this.n;
        if (!z) {
            i = 0;
        }
        relativeLayout.setVisibility(i);
        return z;
    }

    public int getHelpViewHeight(HelpViewStyle helpViewStyle) {
        int i = 0;
        if (helpViewStyle == null) {
            return 0;
        }
        float dimension;
        int i2 = AnonymousClass7.a[helpViewStyle.ordinal()];
        if (i2 == 2) {
            dimension = getContext().getResources().getDimension(R.dimen.nv_helpview_small_landscape_height);
        } else if (i2 != 3) {
            if (i2 == 4) {
                dimension = getContext().getResources().getDimension(R.dimen.nv_helpview_small_portrait_height);
            }
            return i;
        } else {
            dimension = getContext().getResources().getDimension(R.dimen.nv_helpview_small_portrait_manual_height);
        }
        i = (int) dimension;
        return i;
    }

    public void onLayoutRotated(boolean z) {
        Context context = getContext();
        if (context != null) {
            int intValue;
            LayoutInflater from = LayoutInflater.from(context);
            if (this.overlayView != null) {
                ((aa) getPresenter()).a(jumio.nv.core.aa.a.OVERLAY, z);
            }
            View view = this.a;
            if (view != null) {
                intValue = view.getTag() == null ? 0 : ((Integer) this.a.getTag()).intValue();
                if (intValue == 1) {
                    this.l.b();
                }
                this.mFragmentRootView.removeView(this.a);
                this.a = from.inflate(z ? R.layout.nv_newhelpview_portrait : R.layout.nv_newhelpview_land, this.mFragmentRootView, false);
                this.a.setTag(Integer.valueOf(intValue));
                this.mFragmentRootView.addView(this.a);
                ((aa) getPresenter()).a(jumio.nv.core.aa.a.HELP, z);
            }
            view = this.c;
            if (view != null) {
                intValue = view.getVisibility();
                this.mFragmentRootView.removeView(this.c);
                this.c = from.inflate(z ? R.layout.nv_confirmationview_portrait : R.layout.nv_confirmationview_landscape, this.mFragmentRootView, false);
                this.c.setVisibility(intValue);
                this.mFragmentRootView.addView(this.c);
                if (intValue == 0) {
                    ((aa) getPresenter()).a(jumio.nv.core.aa.a.CONFIRMATION, z);
                }
            }
            ((aa) getPresenter()).a(jumio.nv.core.aa.a.BRANDING, z);
            if (this.d != null) {
                a();
                this.d.bringToFront();
            }
            super.onLayoutRotated(z);
        }
    }

    public void hideHelp() {
        if (this.a != null) {
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.a.setOnTouchListener(null);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationY", new float[]{(float) (this.mFragmentRootView.getHeight() - this.h), (float) this.mFragmentRootView.getHeight()});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }

    public void onError(Throwable th) {
        if (th instanceof JumioError) {
            JumioError jumioError = (JumioError) th;
            if (!jumioError.isRetryable() || !((aa) getPresenter()).c() || jumioError.isErrorCase(NVErrorCase.OCR_LOADING_FAILED) || jumioError.isErrorCase(NVErrorCase.GOOGLE_VISION_LOADING_FAILED)) {
                JumioErrorDialog.getAlertDialogBuilder(getContext(), jumioError, new b(jumioError), new a(jumioError));
            }
        }
    }
}
