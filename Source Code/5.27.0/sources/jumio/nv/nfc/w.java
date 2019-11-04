package jumio.nv.nfc;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.dto.ToastEntity;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.core.overlay.Overlay;
import com.jumio.nfc.R;
import com.jumio.nv.enums.EMRTDStatus;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.nfc.core.communication.TagAccessSpec;
import com.jumio.nv.view.fragment.INetverifyActivityCallback;
import com.jumio.nv.view.fragment.INetverifyFragmentCallback;
import com.jumio.nv.view.fragment.NVBaseFragment;
import com.jumio.nv.view.fragment.NVScanFragment;
import com.jumio.nv.view.fragment.UploadFragment;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.models.CredentialsModel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import net.sf.scuba.smartcards.CardServiceException;

@RequiresPresenter(v.class)
/* compiled from: NfcFragment */
public class w extends NVBaseFragment<v> implements OnGlobalLayoutListener, Overlay, INetverifyActivityCallback, u {
    private boolean a = false;
    private at.grabner.circleprogress.c b;
    private RelativeLayout c;
    private ViewFlipper d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private RelativeLayout i;
    private int j;
    private Animator k;
    private Point l;
    private Point m;
    private float[] n;
    private Bitmap o;
    private Bitmap p;
    private int q;

    /* compiled from: NfcFragment */
    class a implements InputFilter {
        private a() {
        }

        /* synthetic */ a(w wVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder stringBuilder = new StringBuilder();
            for (i3 = i; i3 < i2; i3++) {
                char charAt = charSequence.charAt(i3);
                if (Character.isLetterOrDigit(charAt)) {
                    stringBuilder.append(charAt);
                }
            }
            if ((stringBuilder.length() == i2 - i ? 1 : null) != null) {
                return null;
            }
            return stringBuilder.toString();
        }
    }

    /* compiled from: NfcFragment */
    public class b implements OnClickListener {
        private Dialog b;

        public b(Dialog dialog) {
            this.b = dialog;
        }

        public void onClick(View view) {
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.ERROR, UserAction.CANCEL, "BACErrorDialog"));
            this.b.dismiss();
            w.this.a = false;
            ((v) w.this.getPresenter()).a(EMRTDStatus.DENIED);
        }
    }

    /* compiled from: NfcFragment */
    public class c implements OnClickListener {
        private final EditText b;
        private final EditText c;
        private final EditText d;
        private Dialog e;

        public c(EditText editText, EditText editText2, EditText editText3, Dialog dialog) {
            this.b = editText;
            this.c = editText2;
            this.d = editText3;
            this.e = dialog;
        }

        public void onClick(View view) {
            if (this.b.getText().length() > 0 && this.c.getText().length() > 0 && this.d.getText().length() > 0) {
                ((v) w.this.getPresenter()).a().setDateOfBirth(a(this.c.getText().toString()));
                ((v) w.this.getPresenter()).a().setIdNumber(this.b.getText().toString());
                ((v) w.this.getPresenter()).a().setDateOfExpiry(a(this.d.getText().toString()));
                ((v) w.this.getPresenter()).a().setShouldDownloadFaceimage(false);
                this.e.dismiss();
                w.this.a = false;
                ((v) w.this.getPresenter()).a(true);
                w.this.g();
            }
        }

        private Date a(String str) {
            try {
                return DateFormat.getDateFormat(w.this.getView().getContext()).parse(str);
            } catch (ParseException unused) {
                return new Date();
            }
        }
    }

    /* compiled from: NfcFragment */
    class d implements OnClickListener {
        private final Calendar b = Calendar.getInstance();
        private OnDateSetListener c;

        public d(OnDateSetListener onDateSetListener, Date date) {
            this.c = onDateSetListener;
            if (date != null) {
                this.b.setTime(date);
            }
        }

        public void onClick(View view) {
            new DatePickerDialog(w.this.getActivity(), w.this.q, this.c, this.b.get(1), this.b.get(2), this.b.get(5)).show();
        }
    }

    /* compiled from: NfcFragment */
    class e implements TextWatcher {
        private TextView b;
        @Nullable
        private TextView c;
        @Nullable
        private View d;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public e(TextView textView, TextView textView2, @Nullable View view) {
            this.b = textView;
            this.c = textView2;
            this.d = view;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String charSequence2 = charSequence.toString();
            try {
                java.text.DateFormat dateFormat = DateFormat.getDateFormat(w.this.getActivity().getApplicationContext());
                dateFormat.setLenient(false);
                dateFormat.parse(charSequence2);
                this.b.setError(null);
                if (this.c != null) {
                    this.c.setVisibility(0);
                }
                if (this.d != null) {
                    this.d.setEnabled(true);
                    this.d.setAlpha(1.0f);
                }
            } catch (ParseException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("error parsing date ");
                stringBuilder.append(charSequence2);
                f.b("NfcFragment", stringBuilder.toString());
                this.b.setError("Invalid date");
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view = this.d;
                if (view != null) {
                    view.setEnabled(false);
                    this.d.setAlpha(0.5f);
                }
            }
        }
    }

    /* compiled from: NfcFragment */
    class f implements TextWatcher {
        private final TextView b;
        private final TextView c;

        public void afterTextChanged(Editable editable) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public f(TextView textView, TextView textView2) {
            this.c = textView;
            this.b = textView2;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            float measureText = this.b.getPaint().measureText(this.b.getText().toString());
            float measureText2 = this.c.getPaint().measureText(this.c.getText().toString());
            i2 = this.c.getWidth();
            if (i2 > 0) {
                if (measureText2 * 1.2f >= ((float) i2) - measureText) {
                    this.b.setVisibility(4);
                } else {
                    this.b.setVisibility(0);
                }
            }
        }
    }

    public void addViews(@NonNull ViewGroup viewGroup) {
    }

    public void calculate(@NonNull DocumentScanMode documentScanMode, @NonNull DocumentFormat documentFormat, Rect rect) {
    }

    public void doDraw(Canvas canvas) {
    }

    public void onError(Throwable th) {
    }

    public void prepareDraw(ScanSide scanSide, boolean z, boolean z2) {
    }

    public void setVisible(int i) {
    }

    public void update(ExtractionUpdate extractionUpdate) {
    }

    public static w a(Bundle bundle) {
        w wVar = new w();
        wVar.setArguments(bundle);
        return wVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            TagAccessSpec tagAccessSpec = new TagAccessSpec();
            String str = "";
            tagAccessSpec.setIdNumber(bundle.getString("idnumber", str));
            tagAccessSpec.setDateOfBirth(new Date(bundle.getLong("dob", 0)));
            tagAccessSpec.setDateOfExpiry(new Date(bundle.getLong("doe", 0)));
            tagAccessSpec.setCountryIso3(bundle.getString("country", str));
            String string = bundle.getString("scanReference", str);
            ((v) getPresenter()).a(tagAccessSpec);
            ((v) getPresenter()).a(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MRZ_");
            stringBuilder.append(string);
            f.a(stringBuilder.toString());
        }
        setActionbarTitle(R.string.netverify_nfc_view_title);
        ((INetverifyFragmentCallback) this.callback).registerActivityCallback(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = new RelativeLayout(getContext());
        this.c.setLayoutParams(new LayoutParams(-1, -1));
        this.d = new ViewFlipper(getContext());
        this.d.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.d.setInAnimation(AnimationUtils.loadAnimation(getContext(), 17432578));
        this.d.setOutAnimation(AnimationUtils.loadAnimation(getContext(), 17432579));
        this.c.addView(this.d);
        return this.c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
        g();
    }

    public void onResume() {
        super.onResume();
        boolean equals = ((v) getPresenter()).a().getCountryIso3().toLowerCase().equals("usa");
        if (this.o == null) {
            this.o = BitmapFactory.decodeResource(getResources(), equals ? R.drawable.nv_nfc_phone_usa : R.drawable.nv_nfc_phone_row);
        }
        if (this.p == null) {
            if (((v) getPresenter()).b() == DocumentScanMode.MRP) {
                this.p = BitmapFactory.decodeResource(getResources(), equals ? R.drawable.nv_nfc_passport_usa : R.drawable.nv_nfc_passport_row);
            } else {
                this.p = BitmapFactory.decodeResource(getResources(), R.drawable.nv_nfc_id);
            }
        }
        this.e.setImageBitmap(this.p);
        this.f.setImageBitmap(this.o);
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "alpha";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.getChildAt(0).findViewById(R.id.help_background), str, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d.getChildAt(0).findViewById(R.id.overall_container), str, new float[]{0.0f, 1.0f});
        ofFloat2.setStartDelay(200);
        ofFloat2.setDuration(500);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public void onDestroyView() {
        super.onDestroyView();
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        imageView = this.f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            bitmap.recycle();
            this.p = null;
        }
        bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
            this.o = null;
        }
        Animator animator = this.k;
        if (animator != null) {
            animator.cancel();
            this.k.removeAllListeners();
            this.k = null;
        }
        if (this.c.getViewTreeObserver() != null) {
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        System.gc();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0185  */
    public void handleOrientationChange(boolean r17, boolean r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = 0;
        if (r18 == 0) goto L_0x0013;
    L_0x0005:
        r2 = r0.d;
        if (r2 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.getDisplayedChild();
        r3 = r0.d;
        r3.removeAllViews();
        goto L_0x0014;
    L_0x0013:
        r2 = 0;
    L_0x0014:
        r3 = r16.getContext();
        r3 = android.view.LayoutInflater.from(r3);
        r4 = new android.util.TypedValue;
        r4.<init>();
        r5 = r16.getActivity();
        r5 = r5.getTheme();
        if (r17 == 0) goto L_0x002e;
    L_0x002b:
        r6 = com.jumio.nfc.R.layout.nv_helpview_portrait;
        goto L_0x0030;
    L_0x002e:
        r6 = com.jumio.nfc.R.layout.nv_helpview_land;
    L_0x0030:
        r7 = 0;
        r6 = r3.inflate(r6, r7);
        r6 = (android.widget.RelativeLayout) r6;
        r8 = r16.getContext();
        r9 = 45;
        r8 = com.jumio.commons.utils.ScreenUtil.dpToPx(r8, r9);
        r9 = com.jumio.nfc.R.id.overall_container;
        r9 = r6.findViewById(r9);
        r9.setPadding(r8, r1, r8, r1);
        r8 = com.jumio.nfc.R.id.helpview_doctype_title;
        r8 = r6.findViewById(r8);
        r8 = (android.widget.TextView) r8;
        r9 = com.jumio.nfc.R.string.netverify_nfc_header_start;
        r9 = r0.getString(r9);
        r9 = android.text.Html.fromHtml(r9);
        r8.setText(r9);
        r8 = com.jumio.nfc.R.attr.netverify_helpInstructions;
        r9 = 1;
        r5.resolveAttribute(r8, r4, r9);
        r8 = com.jumio.nfc.R.string.netverify_nfc_description_start;
        r8 = r0.getString(r8);
        r10 = com.jumio.nfc.R.id.helpview_scan_instructions;
        r10 = r6.findViewById(r10);
        r10 = (android.widget.TextView) r10;
        r11 = com.jumio.nfc.R.drawable.nv_nfc_epassport_white;
        r12 = r4.data;
        r13 = "${icon}";
        r8 = r0.a(r8, r13, r11, r12);
        r10.setText(r8);
        r8 = com.jumio.nfc.R.id.helpview_scan_instructions;
        r8 = r6.findViewById(r8);
        r8 = (android.widget.TextView) r8;
        r10 = com.jumio.nfc.R.string.netverify_accessibility_nfc_description_start;
        r10 = r0.getString(r10);
        r8.setContentDescription(r10);
        r8 = com.jumio.nfc.R.id.helpview_fallback_button;
        r8 = r6.findViewById(r8);
        r8 = (android.widget.Button) r8;
        r10 = com.jumio.nfc.R.string.netverify_nfc_requestview_button_text;
        r8.setText(r10);
        r10 = com.jumio.nfc.R.attr.netverify_helpFallback;
        r5.resolveAttribute(r10, r4, r9);
        r10 = r8.getBackground();
        r4 = r4.data;
        r11 = android.graphics.PorterDuff.Mode.MULTIPLY;
        r10.setColorFilter(r4, r11);
        r4 = new jumio.nv.nfc.w$1;
        r4.<init>();
        r8.setOnClickListener(r4);
        r4 = r16.getContext();
        r8 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r4 = com.jumio.commons.utils.ScreenUtil.dpToPx(r4, r8);
        r8 = r16.getContext();
        r10 = 60;
        r8 = com.jumio.commons.utils.ScreenUtil.dpToPx(r8, r10);
        r10 = com.jumio.nfc.R.id.doctype_container;
        r10 = r6.findViewById(r10);
        r10 = (android.widget.LinearLayout) r10;
        r11 = com.jumio.nfc.R.string.netverify_accessibility_nfc_description_start;
        r11 = r0.getString(r11);
        r10.setContentDescription(r11);
        r11 = new android.widget.RelativeLayout;
        r12 = r16.getContext();
        r11.<init>(r12);
        r12 = new android.widget.LinearLayout$LayoutParams;
        r8 = r8 + r4;
        r13 = -1;
        r12.<init>(r13, r8);
        r11.setLayoutParams(r12);
        r8 = new android.widget.ImageView;
        r12 = r16.getContext();
        r8.<init>(r12);
        r0.e = r8;
        r8 = new android.widget.RelativeLayout$LayoutParams;
        r8.<init>(r13, r4);
        r12 = 12;
        r8.addRule(r12);
        r12 = r0.e;
        r12.setLayoutParams(r8);
        r8 = r0.e;
        r8.setAdjustViewBounds(r9);
        r8 = r0.e;
        r12 = com.jumio.nfc.R.id.passport_imageview;
        r8.setId(r12);
        r8 = r0.e;
        r12 = r0.p;
        r8.setImageBitmap(r12);
        r8 = r0.e;
        r11.addView(r8);
        r8 = new android.widget.ImageView;
        r12 = r16.getContext();
        r8.<init>(r12);
        r0.f = r8;
        r8 = new android.widget.RelativeLayout$LayoutParams;
        r8.<init>(r13, r4);
        r12 = 5;
        r14 = com.jumio.nfc.R.id.passport_imageview;
        r8.addRule(r12, r14);
        r12 = com.jumio.nfc.R.id.passport_imageview;
        r14 = 6;
        r8.addRule(r14, r12);
        r12 = 7;
        r15 = com.jumio.nfc.R.id.passport_imageview;
        r8.addRule(r12, r15);
        r12 = com.jumio.nfc.R.id.passport_imageview;
        r15 = 8;
        r8.addRule(r15, r12);
        r12 = r0.f;
        r12.setLayoutParams(r8);
        r8 = r0.f;
        r8.setAdjustViewBounds(r9);
        r8 = r0.f;
        r12 = com.jumio.nfc.R.id.passport_phone_imageview;
        r8.setId(r12);
        r8 = r0.f;
        r12 = r0.o;
        r8.setImageBitmap(r12);
        r8 = r0.f;
        r11.addView(r8);
        r10.addView(r11);
        r8 = 0;
        if (r18 != 0) goto L_0x017e;
    L_0x016c:
        r10 = com.jumio.nfc.R.id.help_background;
        r10 = r6.findViewById(r10);
        r10.setAlpha(r8);
        r10 = com.jumio.nfc.R.id.overall_container;
        r10 = r6.findViewById(r10);
        r10.setAlpha(r8);
    L_0x017e:
        r10 = r0.d;
        r10.addView(r6);
        if (r17 == 0) goto L_0x0188;
    L_0x0185:
        r6 = com.jumio.nfc.R.layout.nv_helpview_portrait;
        goto L_0x018a;
    L_0x0188:
        r6 = com.jumio.nfc.R.layout.nv_helpview_land;
    L_0x018a:
        r3 = r3.inflate(r6, r7);
        r3 = (android.widget.RelativeLayout) r3;
        r6 = com.jumio.nfc.R.id.helpview_fallback_button;
        r6 = r3.findViewById(r6);
        r7 = 4;
        r6.setVisibility(r7);
        r6 = com.jumio.nfc.R.id.helpview_doctype_title;
        r6 = r3.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r0.g = r6;
        r6 = r0.g;
        r7 = com.jumio.nfc.R.string.netverify_nfc_header_download;
        r7 = r0.getString(r7);
        r7 = android.text.Html.fromHtml(r7);
        r6.setText(r7);
        r6 = com.jumio.nfc.R.id.helpview_scan_instructions;
        r6 = r3.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r0.h = r6;
        r6 = r0.h;
        r7 = com.jumio.nfc.R.string.netverify_nfc_description_download;
        r6.setText(r7);
        r6 = new android.util.TypedValue;
        r6.<init>();
        r7 = com.jumio.nfc.R.attr.netverify_nfc_dialog_theme;
        r5.resolveAttribute(r7, r6, r1);
        r6 = r6.data;
        r0.q = r6;
        r6 = new android.util.TypedValue;
        r6.<init>();
        r7 = com.jumio.nfc.R.attr.netverify_helpTitle;
        r5.resolveAttribute(r7, r6, r9);
        r6 = r6.data;
        r7 = new android.util.TypedValue;
        r7.<init>();
        r10 = com.jumio.nfc.R.attr.netverify_helpBackground;
        r5.resolveAttribute(r10, r7, r9);
        r5 = r7.data;
        r7 = com.jumio.nfc.R.id.doctype_container;
        r7 = r3.findViewById(r7);
        r7 = (android.widget.LinearLayout) r7;
        r10 = r16.getContext();
        r11 = 40;
        r10 = com.jumio.commons.utils.ScreenUtil.dpToPx(r10, r11);
        r11 = r16.getContext();
        r11 = com.jumio.commons.utils.ScreenUtil.dpToPx(r11, r14);
        r12 = r16.getContext();
        r14 = 1110704128; // 0x42340000 float:45.0 double:5.487607523E-315;
        r12 = com.jumio.commons.utils.ScreenUtil.spToPx(r12, r14);
        r12 = (int) r12;
        r14 = new at.grabner.circleprogress.c;
        r15 = r16.getContext();
        r14.<init>(r15);
        r0.b = r14;
        r14 = new android.widget.RelativeLayout$LayoutParams;
        r14.<init>(r4, r4);
        r15 = r0.b;
        r15.setLayoutParams(r14);
        r14 = r0.b;
        r15 = new int[r9];
        r15[r1] = r6;
        r14.setBarColor(r15);
        r14 = r0.b;
        r14.setBarWidth(r11);
        r14 = r0.b;
        r14.setBlockCount(r9);
        r14 = r0.b;
        r14.setContourSize(r8);
        r14 = r0.b;
        r15 = 1088421888; // 0x40e00000 float:7.0 double:5.37751863E-315;
        r14.setMaxValue(r15);
        r14 = r0.b;
        r14.setRimColor(r1);
        r14 = r0.b;
        r14.setRimWidth(r11);
        r11 = r0.b;
        r11.setTextColor(r6);
        r11 = r0.b;
        r11.setTextSize(r12);
        r11 = r0.b;
        r14 = "%";
        r11.setUnit(r14);
        r11 = r0.b;
        r11.setUnitColor(r6);
        r11 = r0.b;
        r11.setUnitSize(r12);
        r11 = r0.b;
        r11.setValue(r8);
        r8 = r0.b;
        r8.setShowUnit(r9);
        r8 = r0.b;
        r9 = at.grabner.circleprogress.TextMode.PERCENT;
        r8.setTextMode(r9);
        r8 = r0.b;
        r7.addView(r8);
        r8 = new android.widget.RelativeLayout;
        r9 = r16.getContext();
        r8.<init>(r9);
        r0.i = r8;
        r8 = r0.i;
        r9 = new android.widget.LinearLayout$LayoutParams;
        r11 = -2;
        r9.<init>(r13, r11);
        r8.setLayoutParams(r9);
        r8 = new com.jumio.sdk.gui.CircleView;
        r9 = r16.getContext();
        r8.<init>(r9);
        r9 = new android.widget.RelativeLayout$LayoutParams;
        r9.<init>(r4, r4);
        r11 = 14;
        r9.addRule(r11);
        r8.setLayoutParams(r9);
        r8.setPadding(r1, r1, r1, r1);
        r8.setFillColor(r6);
        r1 = r0.i;
        r1.addView(r8);
        r1 = new com.jumio.commons.view.SVGImageView;
        r6 = r16.getContext();
        r1.<init>(r6);
        r6 = new android.widget.RelativeLayout$LayoutParams;
        r6.<init>(r4, r4);
        r6.addRule(r11);
        r1.setLayoutParams(r6);
        r1.setPadding(r10, r10, r10, r10);
        r1.setPaintColor(r5);
        r4 = "M226.749912,330.55 L166.199912,270 L146.016579,290.183333 L226.749912,370.916667 L399.749912,197.916667 L379.566579,177.733333 L226.749912,330.55 Z";
        r1.setPathString(r4);
        r4 = r0.i;
        r4.addView(r1);
        r1 = r0.i;
        r4 = 8;
        r1.setVisibility(r4);
        r1 = r0.i;
        r7.addView(r1);
        r1 = r0.d;
        r1.addView(r3);
        if (r18 == 0) goto L_0x02f3;
    L_0x02ec:
        if (r2 == 0) goto L_0x02f3;
    L_0x02ee:
        r1 = r0.d;
        r1.setDisplayedChild(r2);
    L_0x02f3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.nfc.w.handleOrientationChange(boolean, boolean):void");
    }

    public CredentialsModel a() {
        return ((INetverifyFragmentCallback) this.callback).getCredentials();
    }

    public NfcController b() {
        return ((INetverifyFragmentCallback) this.callback).getNfcController();
    }

    public void a(boolean z) {
        ((v) getPresenter()).a(false);
        ((INetverifyFragmentCallback) this.callback).startFragment(z ? new UploadFragment() : new NVScanFragment(), true, 0, R.animator.nv_fade_out);
    }

    public Rect getOverlayBounds() {
        return new Rect();
    }

    public void onGlobalLayout() {
        if (this.l == null) {
            this.l = new Point();
            this.l.x = (int) (this.e.getX() + (((float) this.e.getWidth()) / 2.0f));
            this.l.y = (int) (this.e.getY() + (((float) this.e.getHeight()) / 2.0f));
        }
        if (this.m == null) {
            this.m = new Point();
            this.m.x = (int) (this.f.getX() + (((float) this.f.getWidth()) / 2.0f));
            this.m.y = (int) (this.f.getY() + (((float) this.f.getHeight()) / 2.0f));
        }
        if (this.j == 0) {
            this.j = ScreenUtil.dpToPx(getActivity(), 50);
        }
        if (this.n == null) {
            this.n = new float[]{this.f.getY() - (((float) this.j) * 0.9f), this.f.getY()};
        }
        Animator animator = this.k;
        if (animator != null) {
            animator.cancel();
        }
        if (this.j > 0) {
            this.k = a(this.f, this.n);
            this.k.start();
        }
    }

    private SpannableString a(String str, String str2, int i, int i2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return new SpannableString(str);
        }
        int spToPx = (int) ScreenUtil.spToPx(getContext(), 14.0f);
        float f = ((float) spToPx) * 1.8091873f;
        SpannableString spannableString = new SpannableString(str);
        Drawable drawable = getResources().getDrawable(i);
        drawable.mutate();
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) f, spToPx);
            drawable.setColorFilter(i2, Mode.SRC_ATOP);
            spannableString.setSpan(new ImageSpan(drawable, 1), indexOf, str2.length() + indexOf, 33);
        }
        return spannableString;
    }

    private Animator a(View view, float... fArr) {
        view.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", fArr);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(1000);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new AnimatorListener() {
            public boolean a;

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.a) {
                    animator.setStartDelay(ToastEntity.ERROR_TOAST_DURATION);
                    animator.start();
                }
            }

            public void onAnimationCancel(Animator animator) {
                this.a = true;
            }
        });
        return animatorSet;
    }

    public void c() {
        if (this.d.getDisplayedChild() == 0) {
            this.d.showNext();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("access view class ");
        stringBuilder.append(hashCode());
        Log.d("NfcFragment", stringBuilder.toString());
        this.i.setVisibility(8);
        this.b.setValue(0.0f);
        this.b.setVisibility(0);
        this.b.invalidate();
        this.g.setText(Html.fromHtml(getString(R.string.netverify_nfc_header_download)));
        this.h.setText(R.string.netverify_nfc_description_download);
    }

    public void a(int i) {
        this.b.setValueAnimated((float) i);
    }

    public void d() {
        this.b.setVisibility(8);
        this.i.setVisibility(0);
        this.g.setText(Html.fromHtml(getString(R.string.netverify_nfc_header_finish)));
        this.h.setText("");
    }

    public void a(o oVar) {
        Dialog f;
        Object obj;
        f.a("NfcFragment", "showing dialog");
        ((v) getPresenter()).a(false);
        if (oVar.a() == p.BAC_CHECK && (oVar.c() instanceof CardServiceException)) {
            f = f();
            obj = "NFC BAC authentication failed";
        } else {
            Builder e = e();
            f = e != null ? e.create() : null;
            obj = "NFC reading error";
        }
        if (f != null) {
            f.setCancelable(false);
            f.show();
        }
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("retryPossible", Boolean.valueOf(true));
        metaInfo.put("message", obj);
        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.ERROR, metaInfo));
        this.d.setDisplayedChild(0);
    }

    private Builder e() {
        if (this.a) {
            return null;
        }
        this.a = true;
        return new Builder(getActivity(), this.q).setTitle(R.string.netverify_nfc_general_error_dialog_title).setMessage(R.string.netverify_nfc_general_error_dialog_text).setPositiveButton(R.string.netverify_button_retry, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                w.this.g();
                w.this.a = false;
                w.this.d.showPrevious();
                ((v) w.this.getPresenter()).a(true);
                dialogInterface.dismiss();
            }
        }).setNegativeButton(R.string.netverify_button_cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.ERROR, UserAction.CANCEL));
                w.this.a = false;
                dialogInterface.dismiss();
                ((v) w.this.getPresenter()).a(EMRTDStatus.NOT_PERFORMED);
            }
        }).setIcon(17301543);
    }

    private Dialog f() {
        if (this.a) {
            return null;
        }
        Dialog dialog;
        this.a = true;
        if (VERSION.SDK_INT >= 21) {
            dialog = new Dialog(getActivity(), this.q);
        } else {
            dialog = new Dialog(getActivity());
        }
        dialog.setCanceledOnTouchOutside(false);
        dialog.setTitle(R.string.netverify_nfc_bac_dialog_title);
        dialog.setContentView(R.layout.nv_nfc_bac_entry_dialog);
        EditText editText = (EditText) dialog.findViewById(R.id.passportNumberTextfield);
        final EditText editText2 = (EditText) dialog.findViewById(R.id.dobEntryField);
        final EditText editText3 = (EditText) dialog.findViewById(R.id.doeEntryField);
        getActivity();
        TextView textView = (TextView) dialog.findViewById(R.id.ppNumberHint);
        TextView textView2 = (TextView) dialog.findViewById(R.id.hintDob);
        TextView textView3 = (TextView) dialog.findViewById(R.id.hintDoe);
        textView.setText(R.string.netverify_nfc_bac_dialog_id_number);
        textView2.setText(R.string.netverify_nfc_bac_dialog_date_of_birth);
        textView3.setText(R.string.netverify_nfc_bac_dialog_date_of_expiry);
        editText.addTextChangedListener(new f(editText, textView));
        ArrayList arrayList = new ArrayList(Arrays.asList(editText.getFilters()));
        arrayList.add(0, new AllCaps());
        arrayList.add(1, new a(this, null));
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
        editText2.addTextChangedListener(new f(editText2, textView2));
        View findViewById = dialog.findViewById(R.id.bacEntryOkButton);
        editText2.addTextChangedListener(new e(editText2, textView2, findViewById));
        editText2.setKeyListener(null);
        TagAccessSpec a = ((v) getPresenter()).a();
        editText2.setClickable(true);
        editText2.setFocusable(false);
        editText2.setOnClickListener(new d(new OnDateSetListener() {
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                Calendar instance = Calendar.getInstance();
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                editText2.setText(w.this.a(instance.getTime()));
            }
        }, a.getDateOfBirth()));
        editText3.addTextChangedListener(new f(editText3, textView3));
        editText3.addTextChangedListener(new e(editText3, textView3, findViewById));
        editText3.setKeyListener(null);
        editText3.setClickable(true);
        editText3.setFocusable(false);
        editText3.setOnClickListener(new d(new OnDateSetListener() {
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                Calendar instance = Calendar.getInstance();
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                editText3.setText(w.this.a(instance.getTime()));
            }
        }, a.getDateOfExpiry()));
        editText.setText(a.getIdNumber());
        editText2.setText(a(a.getDateOfBirth()));
        editText3.setText(a(a.getDateOfExpiry()));
        TextView textView4 = (TextView) dialog.findViewById(16908310);
        if (textView4 != null) {
            textView4.setSingleLine(false);
        }
        ((TextView) dialog.findViewById(R.id.content_description)).setText(R.string.netverify_nfc_bac_dialog_text);
        ((Button) findViewById).setText(R.string.netverify_button_retry);
        findViewById.setOnClickListener(new c(editText, editText2, editText3, dialog));
        dialog.findViewById(R.id.bacEntryCancelButton).setOnClickListener(new b(dialog));
        return dialog;
    }

    private String a(Date date) {
        return DateFormat.getDateFormat(getActivity().getApplicationContext()).format(date);
    }

    private void g() {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("type", "NFC");
        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.SCAN, metaInfo));
    }
}
