package com.jumio.nv.view.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.nv.R;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.DocumentType;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.view.interactors.SelectionView;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.exception.JumioErrorDialog;
import com.jumio.sdk.exception.JumioErrorDialog.ErrorInterface;
import com.jumio.sdk.gui.MaterialProgressBar;
import com.jumio.sdk.models.CredentialsModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import jumio.nv.core.ab;

@RequiresPresenter(ab.class)
public class SelectionFragment extends NVBaseFragment<ab> implements INetverifyActivityCallback, SelectionView {
    private ScrollView a;
    private TextView b;
    private LinearLayout c;
    private LinearLayout d;
    private View e;
    private int f;
    protected Toolbar toolbar;
    protected TextView toolbarSubtitle;
    protected LinearLayout toolbarSubtitleContainer;
    protected LinearLayout toolbarSubtitleSubcontainer;

    /* renamed from: com.jumio.nv.view.fragment.SelectionFragment$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[NVDocumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.jumio.nv.data.document.NVDocumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.nv.data.document.NVDocumentType.PASSPORT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.nv.data.document.NVDocumentType.DRIVER_LICENSE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.nv.data.document.NVDocumentType.VISA;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.view.fragment.SelectionFragment$AnonymousClass4.<clinit>():void");
        }
    }

    class a implements OnClickListener {
        private a() {
        }

        /* synthetic */ a(SelectionFragment selectionFragment, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onClick(View view) {
            view.setEnabled(false);
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN_OPTIONS, UserAction.CHOOSE_OTHER_COUNTRY_SELECTED));
            ((INetverifyFragmentCallback) SelectionFragment.this.callback).animateActionbar(true, false, SelectionFragment.this.b, null, null);
            ((INetverifyFragmentCallback) SelectionFragment.this.callback).startFragment(new CountryListFragment(), false, R.animator.nv_slide_up, R.animator.nv_slide_down);
            view.setEnabled(true);
        }
    }

    static class b {
        DocumentType a;
        NVDocumentVariant b;

        public b(DocumentType documentType, NVDocumentVariant nVDocumentVariant) {
            this.a = documentType;
            this.b = nVDocumentVariant;
        }

        public DocumentType a() {
            return this.a;
        }

        public NVDocumentVariant b() {
            return this.b;
        }
    }

    class c implements OnClickListener {
        private c() {
        }

        /* synthetic */ c(SelectionFragment selectionFragment, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onClick(View view) {
            b bVar = (b) view.getTag();
            ((ab) SelectionFragment.this.getPresenter()).a(bVar.a(), bVar.b());
        }
    }

    class d implements ErrorInterface {
        private JumioError b;

        public d(JumioError jumioError) {
            this.b = jumioError;
        }

        public int getCaption() {
            return R.string.netverify_button_cancel;
        }

        public void getAction() {
            ((ab) SelectionFragment.this.getPresenter()).a(this.b);
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

    class e implements ErrorInterface {
        private JumioError b;

        public e(JumioError jumioError) {
            this.b = jumioError;
        }

        public int getCaption() {
            return R.string.netverify_button_retry;
        }

        public void getAction() {
            ((ab) SelectionFragment.this.getPresenter()).a();
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

    public void handleOrientationChange(boolean z, boolean z2) {
        if (getActivity() != null) {
            if (getActivity().findViewById(R.id.selection_container) != null) {
                ((LayoutParams) getActivity().findViewById(R.id.selection_container).getLayoutParams()).topMargin = ScreenUtil.dpToPx(getActivity(), z ? 76 : 16);
            }
            if (getActivity().findViewById(R.id.scan_options_document_selection) != null) {
                ((LinearLayout.LayoutParams) getActivity().findViewById(R.id.scan_options_document_selection).getLayoutParams()).topMargin = ScreenUtil.dpToPx(getActivity(), z ? 112 : 80);
            }
        }
        if (z2) {
            if (z) {
                setActionbarTitle(0);
                setActionbarSubTitle(R.string.netverify_scan_options_subtitle_type);
            } else {
                setActionbarTitle(R.string.netverify_scan_options_subtitle_type);
                setActionbarSubTitle(0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((INetverifyFragmentCallback) this.callback).registerActivityCallback(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = (ScrollView) layoutInflater.inflate(R.layout.nv_fragment_selection, viewGroup, false);
        TypedValue typedValue = new TypedValue();
        Theme theme = getContext().getTheme();
        ((INetverifyFragmentCallback) this.callback).setUiAutomationId(R.string.netverify_automation_scan_options);
        this.c = (LinearLayout) this.a.findViewById(R.id.scan_options_document_selection);
        this.toolbarSubtitleContainer = (LinearLayout) getActivity().findViewById(R.id.toolbarSubtitleContainer);
        this.toolbarSubtitleSubcontainer = (LinearLayout) getActivity().findViewById(R.id.toolbarSubtitleSubcontainer);
        getActivity().findViewById(R.id.toolbarSubtitleContainer).bringToFront();
        getActivity().findViewById(R.id.toolbarContainer).bringToFront();
        if (this.b == null) {
            this.b = (TextView) layoutInflater.inflate(R.layout.nv_fragment_selection_country, null);
            this.b.setText(R.string.netverify_scan_options_country_selection);
            this.toolbarSubtitleSubcontainer.addView(this.b);
            this.toolbarSubtitleSubcontainer.setAlpha(0.0f);
        }
        this.e = getActivity().findViewById(R.id.loadingBackground);
        this.e.setVisibility(0);
        int dpToPx = ScreenUtil.dpToPx(getContext(), 190);
        int dpToPx2 = ScreenUtil.dpToPx(getContext(), 6);
        theme.resolveAttribute(R.attr.netverify_scanOptionsLoadingProgress, typedValue, true);
        this.d = (LinearLayout) getActivity().findViewById(R.id.spinnerContainer);
        this.d.setVisibility(0);
        this.d.setContentDescription(getResources().getString(R.string.jumio_accessibility_loading));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        Context context = viewGroup.getContext();
        boolean z = this.callback != null && ((INetverifyFragmentCallback) this.callback).isRunningTest();
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(context, z);
        materialProgressBar.setLayoutParams(layoutParams);
        materialProgressBar.setCircleBackgroundEnabled(false);
        materialProgressBar.setColorSchemeColors(typedValue.data);
        materialProgressBar.setProgressStokeWidth(dpToPx2);
        this.d.addView(materialProgressBar);
        theme.resolveAttribute(16842836, typedValue, true);
        this.f = typedValue.data;
        this.a.setAlpha(0.0f);
        return this.a;
    }

    public void onResume() {
        super.onResume();
        if (this.e.getTranslationY() != 0.0f) {
            ((INetverifyFragmentCallback) this.callback).animateActionbar(true, true, this.b, new Runnable() {
                public void run() {
                    SelectionFragment selectionFragment = SelectionFragment.this;
                    boolean z = ((INetverifyFragmentCallback) selectionFragment.callback).getRotationManager().isScreenPortrait() || ((INetverifyFragmentCallback) SelectionFragment.this.callback).getRotationManager().isTablet();
                    selectionFragment.handleOrientationChange(z, true);
                }
            }, null);
            this.e.setVisibility(8);
            return;
        }
        getActivity().findViewById(R.id.toolbarContainer).setVisibility(4);
        getActivity().findViewById(R.id.fragment_container).setVisibility(4);
    }

    public void onError(Throwable th) {
        if (th instanceof JumioError) {
            JumioError jumioError = (JumioError) th;
            JumioErrorDialog.getAlertDialogBuilder(getContext(), jumioError, new e(jumioError), new d(jumioError));
        }
    }

    public CredentialsModel getCredentialsModel() {
        return ((INetverifyFragmentCallback) this.callback).getCredentials();
    }

    public void onCountriesReceived(List<Country> list, Country country, boolean z) {
        if (country == null) {
            this.b.setText(Html.fromHtml(getString(R.string.netverify_scan_options_select_country)));
            this.b.setOnClickListener(new a(this, null));
        } else if (z) {
            this.b.setText(Html.fromHtml(getString(R.string.netverify_scan_options_country_selection, country.getName())));
            this.b.setOnClickListener(new a(this, null));
        } else {
            this.b.setText(Html.fromHtml(getString(R.string.netverify_scan_options_country_selection_lock, country.getName())));
            this.b.setOnClickListener(null);
        }
    }

    public void onDocumentTypesReceived(List<DocumentType> list, NVDocumentVariant nVDocumentVariant) {
        Collections.sort(list);
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i = 0; i < list.size(); i++) {
            DocumentType documentType = (DocumentType) list.get(i);
            NVDocumentType id = documentType.getId();
            ArrayList arrayList = new ArrayList();
            if (nVDocumentVariant == null) {
                arrayList.add(NVDocumentVariant.PLASTIC);
                if (documentType.hasPaperVariant()) {
                    arrayList.add(NVDocumentVariant.PAPER);
                }
            }
            int i2 = AnonymousClass4.a[id.ordinal()];
            i2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : R.drawable.nv_selection_id_card : R.drawable.nv_selection_visa : R.drawable.nv_selection_driver_license : R.drawable.nv_selection_passport;
            TypedValue typedValue = new TypedValue();
            Theme theme = getContext().getTheme();
            int dpToPx = ScreenUtil.dpToPx(getContext(), 16);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(dpToPx, dpToPx));
            linearLayout.setBackgroundColor(this.f);
            b bVar = new b(documentType, nVDocumentVariant != null ? nVDocumentVariant : NVDocumentVariant.PLASTIC);
            CardView cardView;
            if (arrayList.size() <= 1) {
                cardView = (CardView) from.inflate(R.layout.nv_fragment_selection_item, null);
                ImageView imageView = (ImageView) cardView.findViewById(R.id.item_scan_option_button_icon);
                TextView textView = (TextView) cardView.findViewById(R.id.item_scan_option_button_title);
                cardView.setTag(bVar);
                cardView.setOnClickListener(new c(this, null));
                cardView.setFilterTouchesWhenObscured(true);
                theme.resolveAttribute(R.attr.netverify_scanOptionsItemBackground, typedValue, true);
                cardView.setCardBackgroundColor(typedValue.data);
                imageView.setImageResource(i2);
                textView.setText(documentType.getId().getLocalizedName(getContext()));
                cardView.setContentDescription(documentType.getId().getLocalizedName(getContext()));
                this.c.addView(cardView);
            } else {
                cardView = (CardView) from.inflate(R.layout.nv_fragment_selection_subitem, null);
                cardView.setTag(bVar);
                theme.resolveAttribute(R.attr.netverify_scanOptionsItemBackground, typedValue, true);
                cardView.setCardBackgroundColor(typedValue.data);
                LinearLayout linearLayout2 = (LinearLayout) cardView.findViewById(R.id.item_scan_option_header_layout);
                View findViewById = cardView.findViewById(R.id.item_scan_option_variant_divider);
                theme.resolveAttribute(R.attr.netverify_scanOptionsItemHeaderBackground, typedValue, true);
                linearLayout2.setBackgroundColor(typedValue.data);
                findViewById.setBackgroundColor(typedValue.data);
                ((TextView) cardView.findViewById(R.id.item_scan_option_header_title)).setText(documentType.getId().getLocalizedName(getContext()));
                ImageView imageView2 = (ImageView) cardView.findViewById(R.id.item_scan_option_header_icon);
                TextView textView2 = (TextView) cardView.findViewById(R.id.item_scan_option_variant_plastic);
                textView2.setTag(new b(documentType, NVDocumentVariant.PLASTIC));
                textView2.setText(R.string.netverify_document_variant_plastic);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(documentType.getId().getLocalizedName(getContext()));
                String str = " ";
                stringBuilder.append(str);
                stringBuilder.append(getString(R.string.netverify_document_variant_plastic));
                textView2.setContentDescription(stringBuilder.toString());
                textView2.setOnClickListener(new c(this, null));
                textView2 = (TextView) cardView.findViewById(R.id.item_scan_option_variant_other);
                textView2.setText(R.string.netverify_document_variant_other);
                textView2.setTag(new b(documentType, NVDocumentVariant.PAPER));
                stringBuilder = new StringBuilder();
                stringBuilder.append(documentType.getId().getLocalizedName(getContext()));
                stringBuilder.append(str);
                stringBuilder.append(getString(R.string.netverify_document_variant_other));
                textView2.setContentDescription(stringBuilder.toString());
                textView2.setOnClickListener(new c(this, null));
                imageView2.setImageResource(i2);
                this.c.addView(cardView);
            }
            this.c.addView(linearLayout);
        }
        this.c.setVisibility(0);
    }

    public void jumpToScanFragment(boolean z) {
        int i;
        if (z) {
            this.e.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    SelectionFragment.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(SelectionFragment.this.e, "translationY", new float[]{0.0f, (float) (-SelectionFragment.this.e.getHeight())});
                    ofFloat.setStartDelay(150);
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(SelectionFragment.this.d, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat2.setDuration(300);
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    animatorSet.play(ofFloat).after(ofFloat2);
                    animatorSet.addListener(new AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                            SelectionFragment.this.a.setVisibility(4);
                            SelectionFragment.this.toolbarSubtitleContainer.setVisibility(0);
                            SelectionFragment.this.getActivity().findViewById(R.id.toolbarContainer).setVisibility(0);
                            SelectionFragment.this.getActivity().findViewById(R.id.fragment_container).setVisibility(0);
                        }

                        public void onAnimationEnd(Animator animator) {
                            SelectionFragment.this.e.setVisibility(8);
                        }
                    });
                    animatorSet.start();
                }
            });
            i = 0;
        } else {
            ((INetverifyFragmentCallback) this.callback).animateActionbar(false, false, this.b, null, null);
            i = R.animator.nv_fade_out;
        }
        ((INetverifyFragmentCallback) this.callback).startFragment(new NVScanFragment(), z, 0, i);
    }

    public void hideLoading(final boolean z, final boolean z2) {
        this.e.post(new Runnable() {
            public void run() {
                Animator loadAnimator = AnimatorInflater.loadAnimator(SelectionFragment.this.getContext(), R.animator.nv_slide_up);
                loadAnimator.setTarget(SelectionFragment.this.a);
                AnimatorSet animatorSet = new AnimatorSet();
                Builder play = animatorSet.play(loadAnimator);
                if (SelectionFragment.this.e.getTranslationY() == 0.0f) {
                    ObjectAnimator ofFloat;
                    ObjectAnimator ofFloat2;
                    String str = "alpha";
                    if (z) {
                        ofFloat = ObjectAnimator.ofFloat(SelectionFragment.this.e, "translationY", new float[]{0.0f, (float) (-SelectionFragment.this.e.getHeight())});
                        ofFloat.setStartDelay(150);
                        ofFloat.setDuration(450);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat2 = ObjectAnimator.ofFloat(SelectionFragment.this.d, str, new float[]{1.0f, 0.0f});
                        ofFloat2.setDuration(300);
                        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                        play.with(ofFloat).with(ofFloat2);
                    } else {
                        SelectionFragment.this.e.setTranslationY((float) (-SelectionFragment.this.e.getHeight()));
                        SelectionFragment.this.d.setAlpha(0.0f);
                        SelectionFragment.this.toolbarSubtitleSubcontainer.setAlpha(1.0f);
                    }
                    ofFloat = ObjectAnimator.ofFloat(SelectionFragment.this.getActivity().findViewById(R.id.toolbar), str, new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat2 = ObjectAnimator.ofFloat(SelectionFragment.this.getActivity().findViewById(R.id.toolbar_subtitle), str, new float[]{0.0f, 1.0f});
                    ofFloat2.setStartDelay(150);
                    ofFloat2.setDuration(300);
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(SelectionFragment.this.toolbarSubtitleSubcontainer, str, new float[]{0.0f, 1.0f});
                    ofFloat3.setStartDelay(300);
                    ofFloat3.setDuration(300);
                    ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                    play.before(ofFloat).before(ofFloat2).before(ofFloat3);
                    animatorSet.addListener(new AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                            SelectionFragment.this.getActivity().findViewById(R.id.toolbarContainer).setVisibility(0);
                            SelectionFragment.this.getActivity().findViewById(R.id.toolbarSubtitleContainer).setVisibility(0);
                            if (z2) {
                                if (SelectionFragment.this.b != null) {
                                    SelectionFragment.this.toolbarSubtitleSubcontainer.removeView(SelectionFragment.this.b);
                                    SelectionFragment.this.b.setAlpha(1.0f);
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("selectionSkipped", true);
                                CountryListFragment countryListFragment = new CountryListFragment();
                                countryListFragment.setArguments(bundle);
                                ((INetverifyFragmentCallback) SelectionFragment.this.callback).startFragment(countryListFragment, false, R.animator.nv_slide_up, 0);
                            } else if (((INetverifyFragmentCallback) SelectionFragment.this.callback).getRotationManager().isScreenPortrait() || ((INetverifyFragmentCallback) SelectionFragment.this.callback).getRotationManager().isTablet()) {
                                SelectionFragment.this.setActionbarTitle(0);
                                SelectionFragment.this.setActionbarSubTitle(R.string.netverify_scan_options_subtitle_type);
                            } else {
                                SelectionFragment.this.setActionbarTitle(R.string.netverify_scan_options_subtitle_type);
                                SelectionFragment.this.setActionbarSubTitle(0);
                            }
                            SelectionFragment.this.getActivity().findViewById(R.id.fragment_container).setVisibility(0);
                        }

                        public void onAnimationEnd(Animator animator) {
                            SelectionFragment.this.e.setVisibility(8);
                        }
                    });
                }
                animatorSet.start();
            }
        });
    }

    public NfcController getNfcController() {
        return ((INetverifyFragmentCallback) this.callback).getNfcController();
    }
}
