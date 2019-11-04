package com.jumio.dv.view.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.commons.view.ScaleableImageView;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.dv.R;
import com.jumio.dv.b.b;
import com.jumio.dv.view.interactors.DvScanView;
import com.jumio.dv.view.interactors.DvScanView.GuiState;
import com.jumio.dv.view.interactors.DvScanView.HelpViewStyle;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorDialog;
import com.jumio.sdk.exception.JumioErrorDialog.ErrorInterface;
import com.jumio.sdk.gui.MaterialProgressBar;
import com.jumio.sdk.presentation.BaseScanPresenterBase.BaseScanControl;
import com.jumio.sdk.view.fragment.BaseScanFragment;

@RequiresPresenter(b.class)
public class DvScanFragment extends BaseScanFragment<b, IDvFragmentCallback> implements IDvActivityCallback, DvScanView {
    @Nullable
    private View a;
    @Nullable
    private View b;
    private boolean c = true;
    private Bitmap d;
    private int e;
    @Nullable
    private MaterialProgressBar f;
    @Nullable
    private RelativeLayout g;

    /* renamed from: com.jumio.dv.view.fragment.DvScanFragment$6 */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a = new int[HelpViewStyle.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.NONE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.MICRO;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.MINI;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.dv.view.interactors.DvScanView.HelpViewStyle.SMALL;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.dv.view.fragment.DvScanFragment$AnonymousClass6.<clinit>():void");
        }
    }

    private class a implements ErrorInterface {
        private JumioError b;

        public a(JumioError jumioError) {
            this.b = jumioError;
        }

        public int getCaption() {
            return R.string.dv_button_cancel;
        }

        public void getAction() {
            ((b) DvScanFragment.this.getPresenter()).a(this.b);
        }

        public int getColorID() {
            return R.attr.dv_dialogNegativeButtonTextColor;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((IDvFragmentCallback) this.callback).registerActivityCallback(this);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            ((b) getPresenter()).a((GuiState) bundle.getSerializable("guiState"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int i = (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) ? R.layout.dv_confirmationview_portrait : R.layout.dv_confirmationview_landscape;
        this.b = layoutInflater.inflate(i, this.mFragmentRootView, false);
        this.b.setVisibility(4);
        this.mFragmentRootView.addView(this.b);
        i = (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) ? R.layout.dv_helpview_portrait : R.layout.dv_helpview_landscape;
        this.a = layoutInflater.inflate(i, null, false);
        this.a.setVisibility(4);
        this.mFragmentRootView.addView(this.a);
        this.overlayView.setAlpha(0.0f);
        return onCreateView;
    }

    public void showLoading() {
        if (this.g != null) {
            this.mFragmentRootView.removeView(this.g);
            this.g = null;
            this.f = null;
        }
        TypedValue typedValue = new TypedValue();
        int dpToPx = ScreenUtil.dpToPx(getContext(), 45);
        getContext().getTheme().resolveAttribute(R.attr.dv_scanOptionsLoadingBackground, typedValue, true);
        this.g = new RelativeLayout(this.mFragmentRootView.getContext());
        this.g.setLayoutParams(new LayoutParams(-1, -1));
        this.g.setPadding(dpToPx, 0, dpToPx, 0);
        this.g.setBackgroundColor(typedValue.data);
        dpToPx = ScreenUtil.dpToPx(getContext(), 190);
        int dpToPx2 = ScreenUtil.dpToPx(getContext(), 6);
        getContext().getTheme().resolveAttribute(R.attr.dv_scanOptionsLoadingProgress, typedValue, true);
        this.f = new MaterialProgressBar(this.mFragmentRootView.getContext(), false);
        this.f.setLayoutParams(new LayoutParams(dpToPx, dpToPx));
        this.f.setCircleBackgroundEnabled(false);
        this.f.setColorSchemeColors(typedValue.data);
        this.f.setProgressStokeWidth(dpToPx2);
        this.g.addView(this.f);
        a();
        this.mFragmentRootView.addView(this.g);
    }

    private void a() {
        MaterialProgressBar materialProgressBar = this.f;
        if (materialProgressBar != null) {
            LayoutParams layoutParams = (LayoutParams) materialProgressBar.getLayoutParams();
            if (!this.rotationManager.isScreenLandscape() || this.rotationManager.isTablet()) {
                layoutParams.addRule(14);
                layoutParams.topMargin = ScreenUtil.dpToPx(getContext(), 60);
            } else {
                layoutParams.addRule(13);
                layoutParams.topMargin = 0;
            }
            this.f.setLayoutParams(layoutParams);
        }
    }

    public void onResume() {
        super.onResume();
        ((IDvFragmentCallback) this.callback).animateActionbar(true);
        setActionbarTitle(R.string.dv_scanview_title);
    }

    /* Access modifiers changed, original: protected */
    public void handleControls(boolean z, boolean z2) {
        if (this.c) {
            super.handleControls(z, z2);
        }
    }

    public void onLayoutRotated(boolean z) {
        int visibility;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (this.overlayView != null) {
            this.overlayView.requestLayout();
        }
        View view = this.a;
        if (view != null) {
            visibility = view.getVisibility();
            this.mFragmentRootView.removeView(this.a);
            this.a = from.inflate(z ? R.layout.dv_helpview_portrait : R.layout.dv_helpview_landscape, this.mFragmentRootView, false);
            this.a.setVisibility(visibility);
            this.mFragmentRootView.addView(this.a);
            if (visibility == 0) {
                ((b) getPresenter()).a(com.jumio.dv.b.b.a.HELP, z);
            }
        }
        view = this.b;
        if (view != null) {
            visibility = view.getVisibility();
            this.mFragmentRootView.removeView(this.b);
            this.b = from.inflate(z ? R.layout.dv_confirmationview_portrait : R.layout.dv_confirmationview_landscape, this.mFragmentRootView, false);
            this.b.setVisibility(visibility);
            this.mFragmentRootView.addView(this.b);
            if (visibility == 0) {
                ((b) getPresenter()).a(com.jumio.dv.b.b.a.CONFIRMATION, z);
            }
        }
        if (this.g != null) {
            a();
            this.g.bringToFront();
        }
        super.onLayoutRotated(z);
    }

    public void showConfirmation(String str, boolean z) {
        handleControls(false, false);
        this.c = false;
        setActionbarTitle(R.string.dv_scanview_title_check);
        if (this.b != null) {
            ObjectAnimator ofFloat;
            ((IDvFragmentCallback) this.callback).setUiAutomationId(R.string.documentverification_automation_confirmation);
            View findViewById = this.b.findViewById(R.id.confirmation_layout_base);
            ScaleableImageView scaleableImageView = (ScaleableImageView) this.b.findViewById(R.id.confirmationImage);
            TextView textView = (TextView) this.b.findViewById(R.id.confirmationSnackBar);
            final TextView textView2 = (TextView) this.b.findViewById(R.id.confirmationPositiveTextView);
            final TextView textView3 = (TextView) this.b.findViewById(R.id.confirmationNegativeTextView);
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                bitmap.recycle();
                this.d = null;
                System.gc();
            }
            this.d = BitmapFactory.decodeFile(str);
            scaleableImageView.setImageBitmap(this.d);
            textView.setText(R.string.dv_scanview_snackbar_check);
            if (!TextUtils.isEmpty(textView.getText())) {
                scaleableImageView.setContentDescription(textView.getText());
                findViewById.setContentDescription(textView.getText());
            }
            textView2.setEnabled(true);
            textView2.setText(R.string.dv_scanview_readable);
            textView2.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    textView2.setEnabled(false);
                    textView3.setEnabled(false);
                    ((b) DvScanFragment.this.getPresenter()).a();
                }
            });
            textView3.setEnabled(true);
            textView3.setText(R.string.dv_scanview_retake);
            final TextView textView4 = textView3;
            final ScaleableImageView scaleableImageView2 = scaleableImageView;
            final TextView textView5 = textView;
            textView3.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    textView2.setEnabled(false);
                    textView4.setEnabled(false);
                    DvScanFragment.this.c = true;
                    DvScanFragment dvScanFragment = DvScanFragment.this;
                    dvScanFragment.handleControls(((b) dvScanFragment.getPresenter()).control(BaseScanControl.hasMultipleCameras), ((b) DvScanFragment.this.getPresenter()).control(BaseScanControl.hasFlash));
                    if (DvScanFragment.this.b != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(scaleableImageView2, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(400);
                        ofFloat.setStartDelay(100);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        Builder play = animatorSet.play(ofFloat);
                        View findViewById = DvScanFragment.this.b.findViewById(R.id.buttonLayout);
                        ObjectAnimator ofFloat2;
                        if (DvScanFragment.this.rotationManager.isScreenPortrait() || DvScanFragment.this.rotationManager.isTablet()) {
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
                            }

                            public void onAnimationEnd(Animator animator) {
                                if (DvScanFragment.this.b != null) {
                                    DvScanFragment.this.b.setVisibility(4);
                                }
                                ((b) DvScanFragment.this.getPresenter()).b();
                                if (DvScanFragment.this.d != null) {
                                    DvScanFragment.this.d.recycle();
                                    DvScanFragment.this.d = null;
                                    System.gc();
                                }
                            }
                        });
                        animatorSet.start();
                    }
                    DvScanFragment.this.setActionbarTitle(R.string.dv_scanview_title);
                }
            });
            scaleableImageView.setAlpha(0.0f);
            View findViewById2 = this.b.findViewById(R.id.buttonLayout);
            AnimatorSet animatorSet = new AnimatorSet();
            String str2 = "alpha";
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(scaleableImageView, str2, new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            Builder play = animatorSet.play(ofFloat2);
            if (this.rotationManager.isScreenPortrait() || this.rotationManager.isTablet()) {
                textView.setTranslationY((float) textView.getHeight());
                String str3 = "translationY";
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, str3, new float[]{(float) textView.getHeight(), 0.0f});
                ofFloat3.setStartDelay(100);
                ofFloat3.setDuration(400);
                ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                findViewById2.setTranslationY((float) findViewById2.getHeight());
                ofFloat = ObjectAnimator.ofFloat(findViewById2, str3, new float[]{(float) findViewById2.getHeight(), 0.0f});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                play.with(ofFloat3).with(ofFloat);
            } else {
                findViewById2.setTranslationX((float) findViewById2.getWidth());
                ofFloat = ObjectAnimator.ofFloat(findViewById2, "translationX", new float[]{(float) findViewById2.getWidth(), 0.0f});
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
            this.b.setVisibility(0);
            animatorSet.start();
        }
    }

    public void extractionStarted() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                DvScanFragment.this.handleControls(false, false);
                DvScanFragment.this.c = false;
            }
        });
    }

    public void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.d.recycle();
            this.d = null;
            System.gc();
        }
    }

    public void scansComplete() {
        ((IDvFragmentCallback) this.callback).startFragment(new CompleteFragment(), true, 0, R.animator.dv_fade_out);
    }

    public void displayBlurHint() {
        Toast makeText = Toast.makeText(getContext(), com.jumio.core.R.string.jumio_scanview_refocus, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public void updateUiAutomationScanId(PluginMode pluginMode) {
        StringBuilder stringBuilder = new StringBuilder(getResources().getString(R.string.documentverification_automation_scan));
        stringBuilder.append(pluginMode.toString().toLowerCase());
        ((IDvFragmentCallback) this.callback).setUiAutomationString(stringBuilder.toString());
    }

    /* JADX WARNING: Missing block: B:79:0x015d, code skipped:
            if (r10.equals("IC") != false) goto L_0x018b;
     */
    public void showHelp(java.lang.String r10, com.jumio.dv.view.interactors.DvScanView.HelpViewStyle r11, java.lang.String r12, boolean r13) {
        /*
        r9 = this;
        r0 = r9.a;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = com.jumio.dv.R.string.dv_scanview_title;
        r9.setActionbarTitle(r0);
        r0 = r9.a;
        r1 = 2;
        r0.setImportantForAccessibility(r1);
        r0 = r9.a;
        r2 = 4;
        r0.setVisibility(r2);
        r0 = r9.a;
        r3 = com.jumio.dv.R.id.smallHelpView;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.RelativeLayout) r0;
        r3 = r9.a;
        r4 = com.jumio.dv.R.id.help_tv_title;
        r3 = r3.findViewById(r4);
        r3 = (androidx.appcompat.widget.AppCompatTextView) r3;
        r4 = r9.getPresenter();
        r4 = (com.jumio.dv.b.b) r4;
        r4 = r4.a(r11);
        r9.e = r4;
        r4 = com.jumio.dv.view.fragment.DvScanFragment.AnonymousClass6.a;
        r11 = r11.ordinal();
        r11 = r4[r11];
        r4 = 3;
        r5 = 8;
        r6 = 1;
        r7 = 0;
        if (r11 == r6) goto L_0x0058;
    L_0x0045:
        if (r11 == r1) goto L_0x0054;
    L_0x0047:
        if (r11 == r4) goto L_0x0050;
    L_0x0049:
        if (r11 == r2) goto L_0x004c;
    L_0x004b:
        goto L_0x005b;
    L_0x004c:
        r3.setVisibility(r7);
        goto L_0x005b;
    L_0x0050:
        r3.setVisibility(r7);
        goto L_0x005b;
    L_0x0054:
        r3.setVisibility(r5);
        goto L_0x005b;
    L_0x0058:
        r3.setVisibility(r5);
    L_0x005b:
        r11 = com.jumio.dv.R.string.dv_helpview_header_document;
        if (r12 == 0) goto L_0x0067;
    L_0x005f:
        r8 = r12.isEmpty();
        if (r8 != 0) goto L_0x0067;
    L_0x0065:
        goto L_0x01e7;
    L_0x0067:
        r12 = -1;
        r8 = r10.hashCode();
        switch(r8) {
            case 2113: goto L_0x017f;
            case 2129: goto L_0x0175;
            case 2143: goto L_0x016a;
            case 2144: goto L_0x0160;
            case 2330: goto L_0x0157;
            case 2546: goto L_0x014c;
            case 2656: goto L_0x0141;
            case 2686: goto L_0x0136;
            case 2701: goto L_0x012c;
            case 2733: goto L_0x0121;
            case 2750: goto L_0x0115;
            case 66547: goto L_0x010a;
            case 66996: goto L_0x00ff;
            case 71336: goto L_0x00f3;
            case 75122: goto L_0x00e8;
            case 81978: goto L_0x00dc;
            case 82403: goto L_0x00d0;
            case 82806: goto L_0x00c4;
            case 2060557: goto L_0x00b9;
            case 2342130: goto L_0x00ad;
            case 2362391: goto L_0x00a1;
            case 2371921: goto L_0x0095;
            case 2541447: goto L_0x0089;
            case 2556079: goto L_0x007d;
            case 2677568: goto L_0x0071;
            default: goto L_0x006f;
        };
    L_0x006f:
        goto L_0x018a;
    L_0x0071:
        r1 = "WWCC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0079:
        r1 = 19;
        goto L_0x018b;
    L_0x007d:
        r1 = "STUC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0085:
        r1 = 13;
        goto L_0x018b;
    L_0x0089:
        r1 = "SENC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0091:
        r1 = 16;
        goto L_0x018b;
    L_0x0095:
        r1 = "MOAP";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x009d:
        r1 = 9;
        goto L_0x018b;
    L_0x00a1:
        r1 = "MEDC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00a9:
        r1 = 17;
        goto L_0x018b;
    L_0x00ad:
        r1 = "LOAP";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00b5:
        r1 = 8;
        goto L_0x018b;
    L_0x00b9:
        r1 = "CAAP";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00c1:
        r1 = 4;
        goto L_0x018b;
    L_0x00c4:
        r1 = "TAC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00cc:
        r1 = 21;
        goto L_0x018b;
    L_0x00d0:
        r1 = "SSC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00d8:
        r1 = 24;
        goto L_0x018b;
    L_0x00dc:
        r1 = "SEL";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00e4:
        r1 = 22;
        goto L_0x018b;
    L_0x00e8:
        r1 = "LAG";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00f0:
        r1 = 7;
        goto L_0x018b;
    L_0x00f3:
        r1 = "HCC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x00fb:
        r1 = 14;
        goto L_0x018b;
    L_0x00ff:
        r1 = "CRC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0107:
        r1 = 5;
        goto L_0x018b;
    L_0x010a:
        r1 = "CCS";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0112:
        r1 = 6;
        goto L_0x018b;
    L_0x0115:
        r1 = "VT";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x011d:
        r1 = 11;
        goto L_0x018b;
    L_0x0121:
        r1 = "VC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0129:
        r1 = 12;
        goto L_0x018b;
    L_0x012c:
        r1 = "UB";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0134:
        r1 = 3;
        goto L_0x018b;
    L_0x0136:
        r1 = "TR";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x013e:
        r1 = 10;
        goto L_0x018b;
    L_0x0141:
        r1 = "SS";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0149:
        r1 = 20;
        goto L_0x018b;
    L_0x014c:
        r1 = "PB";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0154:
        r1 = 23;
        goto L_0x018b;
    L_0x0157:
        r2 = "IC";
        r10 = r10.equals(r2);
        if (r10 == 0) goto L_0x018a;
    L_0x015f:
        goto L_0x018b;
    L_0x0160:
        r1 = "CC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0168:
        r1 = 1;
        goto L_0x018b;
    L_0x016a:
        r1 = "CB";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0172:
        r1 = 15;
        goto L_0x018b;
    L_0x0175:
        r1 = "BS";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x017d:
        r1 = 0;
        goto L_0x018b;
    L_0x017f:
        r1 = "BC";
        r10 = r10.equals(r1);
        if (r10 == 0) goto L_0x018a;
    L_0x0187:
        r1 = 18;
        goto L_0x018b;
    L_0x018a:
        r1 = -1;
    L_0x018b:
        switch(r1) {
            case 0: goto L_0x01d7;
            case 1: goto L_0x01d4;
            case 2: goto L_0x01d1;
            case 3: goto L_0x01ce;
            case 4: goto L_0x01cb;
            case 5: goto L_0x01c8;
            case 6: goto L_0x01c5;
            case 7: goto L_0x01c2;
            case 8: goto L_0x01bf;
            case 9: goto L_0x01bc;
            case 10: goto L_0x01b9;
            case 11: goto L_0x01b6;
            case 12: goto L_0x01b3;
            case 13: goto L_0x01b0;
            case 14: goto L_0x01ad;
            case 15: goto L_0x01aa;
            case 16: goto L_0x01a7;
            case 17: goto L_0x01a4;
            case 18: goto L_0x01a1;
            case 19: goto L_0x019e;
            case 20: goto L_0x019b;
            case 21: goto L_0x0198;
            case 22: goto L_0x0195;
            case 23: goto L_0x0192;
            case 24: goto L_0x018f;
            default: goto L_0x018e;
        };
    L_0x018e:
        goto L_0x01d9;
    L_0x018f:
        r11 = com.jumio.dv.R.string.dv_helpview_header_social_security_card;
        goto L_0x01d9;
    L_0x0192:
        r11 = com.jumio.dv.R.string.dv_helpview_header_phone_bill;
        goto L_0x01d9;
    L_0x0195:
        r11 = com.jumio.dv.R.string.dv_helpview_header_school_enrolment_letter;
        goto L_0x01d9;
    L_0x0198:
        r11 = com.jumio.dv.R.string.dv_helpview_header_trade_association_card;
        goto L_0x01d9;
    L_0x019b:
        r11 = com.jumio.dv.R.string.dv_helpview_header_superannuation_statement;
        goto L_0x01d9;
    L_0x019e:
        r11 = com.jumio.dv.R.string.dv_helpview_header_working_with_children_check;
        goto L_0x01d9;
    L_0x01a1:
        r11 = com.jumio.dv.R.string.dv_helpview_header_birth_certificate;
        goto L_0x01d9;
    L_0x01a4:
        r11 = com.jumio.dv.R.string.dv_helpview_header_medicare_card;
        goto L_0x01d9;
    L_0x01a7:
        r11 = com.jumio.dv.R.string.dv_helpview_header_seniors_card;
        goto L_0x01d9;
    L_0x01aa:
        r11 = com.jumio.dv.R.string.dv_helpview_header_council_bill;
        goto L_0x01d9;
    L_0x01ad:
        r11 = com.jumio.dv.R.string.dv_helpview_header_health_care_card;
        goto L_0x01d9;
    L_0x01b0:
        r11 = com.jumio.dv.R.string.dv_helpview_header_student_card;
        goto L_0x01d9;
    L_0x01b3:
        r11 = com.jumio.dv.R.string.dv_helpview_header_voided_check;
        goto L_0x01d9;
    L_0x01b6:
        r11 = com.jumio.dv.R.string.dv_helpview_header_vehicle_title;
        goto L_0x01d9;
    L_0x01b9:
        r11 = com.jumio.dv.R.string.dv_helpview_header_tax_return;
        goto L_0x01d9;
    L_0x01bc:
        r11 = com.jumio.dv.R.string.dv_helpview_header_mortgage_application;
        goto L_0x01d9;
    L_0x01bf:
        r11 = com.jumio.dv.R.string.dv_helpview_header_loan_application;
        goto L_0x01d9;
    L_0x01c2:
        r11 = com.jumio.dv.R.string.dv_helpview_header_lease_agreement;
        goto L_0x01d9;
    L_0x01c5:
        r11 = com.jumio.dv.R.string.dv_helpview_header_credit_card_statement;
        goto L_0x01d9;
    L_0x01c8:
        r11 = com.jumio.dv.R.string.dv_helpview_header_corporate_resolution_certificate;
        goto L_0x01d9;
    L_0x01cb:
        r11 = com.jumio.dv.R.string.dv_helpview_header_cash_advance_application;
        goto L_0x01d9;
    L_0x01ce:
        r11 = com.jumio.dv.R.string.dv_helpview_header_utility_bill;
        goto L_0x01d9;
    L_0x01d1:
        r11 = com.jumio.dv.R.string.dv_helpview_header_insurance_card;
        goto L_0x01d9;
    L_0x01d4:
        r11 = com.jumio.dv.R.string.dv_helpview_header_credit_card;
        goto L_0x01d9;
    L_0x01d7:
        r11 = com.jumio.dv.R.string.dv_helpview_header_bank_statement;
    L_0x01d9:
        if (r11 == 0) goto L_0x01e4;
    L_0x01db:
        r10 = r9.getContext();
        r10 = r10.getString(r11);
        goto L_0x01e6;
    L_0x01e4:
        r10 = "";
    L_0x01e6:
        r12 = r10;
    L_0x01e7:
        r10 = r9.getContext();
        r11 = com.jumio.dv.R.string.dv_helpview_small_title_capture;
        r1 = new java.lang.Object[r6];
        r1[r7] = r12;
        r10 = r10.getString(r11, r1);
        r11 = android.text.Html.fromHtml(r10);
        r3.setText(r11);
        r10 = android.text.Html.fromHtml(r10);
        r0.setContentDescription(r10);
        r10 = r9.rotationManager;
        r10 = r10.isScreenPortrait();
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r10 != 0) goto L_0x0222;
    L_0x020d:
        r10 = r9.rotationManager;
        r10 = r10.isTablet();
        if (r10 == 0) goto L_0x0216;
    L_0x0215:
        goto L_0x0222;
    L_0x0216:
        r10 = r9.overlayView;
        r12 = 0;
        r10.setTranslationY(r12);
        r10 = r9.overlayView;
        r10.setAlpha(r11);
        goto L_0x0230;
    L_0x0222:
        r10 = r9.overlayView;
        r12 = r9.e;
        r12 = -r12;
        r12 = (float) r12;
        r10.setTranslationY(r12);
        r10 = r9.overlayView;
        r10.setAlpha(r11);
    L_0x0230:
        if (r13 != 0) goto L_0x0241;
    L_0x0232:
        r10 = r9.mFragmentRootView;
        r10 = r10.getViewTreeObserver();
        r11 = new com.jumio.dv.view.fragment.DvScanFragment$4;
        r11.<init>();
        r10.addOnGlobalLayoutListener(r11);
        goto L_0x0258;
    L_0x0241:
        r10 = r9.a;
        r12 = r9.mFragmentRootView;
        r12 = r12.getHeight();
        r13 = r9.e;
        r12 = r12 - r13;
        r12 = (float) r12;
        r10.setTranslationY(r12);
        r0.setAlpha(r11);
        r10 = r9.a;
        r10.setVisibility(r7);
    L_0x0258:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.dv.view.fragment.DvScanFragment.showHelp(java.lang.String, com.jumio.dv.view.interactors.DvScanView$HelpViewStyle, java.lang.String, boolean):void");
    }

    public void hideHelp() {
        View view = this.a;
        if (view != null) {
            view.setOnTouchListener(null);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationY", new float[]{(float) (this.mFragmentRootView.getHeight() - this.e), (float) this.mFragmentRootView.getHeight()});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }

    public void onError(Throwable th) {
        if (th instanceof JumioError) {
            JumioError jumioError = (JumioError) th;
            if (!jumioError.isRetryable()) {
                JumioErrorDialog.getAlertDialogBuilder(getContext(), jumioError, null, new a(jumioError));
            }
        }
    }

    private void b() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationY", new float[]{(float) this.mFragmentRootView.getHeight(), (float) (this.mFragmentRootView.getHeight() - this.e)});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                DvScanFragment dvScanFragment = DvScanFragment.this;
                dvScanFragment.handleControls(((b) dvScanFragment.getPresenter()).control(BaseScanControl.hasMultipleCameras), ((b) DvScanFragment.this.getPresenter()).control(BaseScanControl.hasFlash));
            }
        });
        animatorSet.play(ofFloat);
        animatorSet.start();
    }
}
