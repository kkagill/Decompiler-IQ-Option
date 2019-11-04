package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import io.card.payment.a.a;
import io.card.payment.a.c;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.b;
import java.io.ByteArrayInputStream;
import java.util.Date;

public final class CardIOActivity extends Activity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String EXTRA_CAPTURED_CARD_IMAGE = "io.card.payment.capturedCardImage";
    public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
    public static final String EXTRA_HIDE_CARDIO_LOGO = "io.card.payment.hideLogo";
    public static final String EXTRA_KEEP_APPLICATION_THEME = "io.card.payment.keepApplicationTheme";
    public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
    public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
    public static final String EXTRA_REQUIRE_CARDHOLDER_NAME = "io.card.payment.requireCardholderName";
    public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
    public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
    public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
    public static final String EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY = "io.card.payment.restrictPostalCodeToNumericOnly";
    public static final String EXTRA_RETURN_CARD_IMAGE = "io.card.payment.returnCardImage";
    public static final String EXTRA_SCAN_EXPIRY = "io.card.payment.scanExpiry";
    public static final String EXTRA_SCAN_INSTRUCTIONS = "io.card.payment.scanInstructions";
    public static final String EXTRA_SCAN_OVERLAY_LAYOUT_ID = "io.card.payment.scanOverlayLayoutId";
    public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
    public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
    public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
    public static final String EXTRA_SUPPRESS_SCAN = "io.card.payment.suppressScan";
    public static final String EXTRA_UNBLUR_DIGITS = "io.card.payment.unblurDigits";
    public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
    public static final String EXTRA_USE_PAYPAL_ACTIONBAR_ICON = "io.card.payment.intentSenderIsPayPal";
    public static final int RESULT_CARD_INFO;
    public static final int RESULT_CONFIRMATION_SUPPRESSED;
    public static final int RESULT_ENTRY_CANCELED;
    public static final int RESULT_SCAN_NOT_AVAILABLE;
    public static final int RESULT_SCAN_SUPPRESSED;
    private static final String TAG = CardIOActivity.class.getSimpleName();
    private static int eJH = 13274384;
    private static final long[] eJI = new long[]{0, 70, 10, 40};
    private static int eJX;
    static Bitmap eKa = null;
    private i eJJ;
    private OrientationEventListener eJK;
    j eJL;
    private CreditCard eJM;
    private Rect eJN;
    private int eJO;
    private int eJP;
    private boolean eJQ;
    private boolean eJR;
    private LinearLayout eJS;
    private boolean eJT;
    private RelativeLayout eJU;
    private FrameLayout eJV;
    private boolean eJW;
    private CardScanner eJY;
    private boolean eJZ = false;

    public static String sdkVersion() {
        return BuildConfig.PRODUCT_VERSION;
    }

    static {
        int i = eJH;
        eJH = i + 1;
        RESULT_CARD_INFO = i;
        i = eJH;
        eJH = i + 1;
        RESULT_ENTRY_CANCELED = i;
        i = eJH;
        eJH = i + 1;
        RESULT_SCAN_NOT_AVAILABLE = i;
        i = eJH;
        eJH = i + 1;
        RESULT_SCAN_SUPPRESSED = i;
        i = eJH;
        eJH = i + 1;
        RESULT_CONFIRMATION_SUPPRESSED = i;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        String str = "android.permission.CAMERA";
        super.onCreate(bundle);
        eJX++;
        if (eJX != 1) {
            Log.i(TAG, String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[]{Integer.valueOf(r1)}));
        }
        Intent intent = getIntent();
        this.eJW = getIntent().getBooleanExtra(EXTRA_KEEP_APPLICATION_THEME, false);
        a.b(this, this.eJW);
        b.x(intent);
        this.eJR = intent.getBooleanExtra(EXTRA_SUPPRESS_SCAN, false);
        String a = m.a(getPackageManager().resolveActivity(intent, 65536), CardIOActivity.class);
        if (a == null) {
            this.eJQ = intent.getBooleanExtra(EXTRA_SUPPRESS_MANUAL_ENTRY, false);
            if (bundle != null) {
                this.eJT = bundle.getBoolean("io.card.payment.waitingForPermission");
            }
            boolean booleanExtra = intent.getBooleanExtra(EXTRA_NO_CAMERA, false);
            String str2 = "card.io";
            if (booleanExtra) {
                Log.i(str2, "EXTRA_NO_CAMERA set to true. Skipping camera.");
                this.eJZ = true;
                return;
            } else if (CardScanner.biu()) {
                try {
                    if (VERSION.SDK_INT < 23) {
                        bim();
                        bik();
                        return;
                    } else if (!this.eJT) {
                        if (checkSelfPermission(str) == -1) {
                            Log.d(TAG, "permission denied to camera - requesting it");
                            String[] strArr = new String[]{str};
                            this.eJT = true;
                            requestPermissions(strArr, 11);
                            return;
                        }
                        bim();
                        bij();
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    e(e);
                    return;
                }
            } else {
                Log.i(str2, "Processor not Supported. Skipping camera.");
                this.eJZ = true;
                return;
            }
        }
        throw new RuntimeException(a);
    }

    private void bij() {
        if (this.eJZ) {
            bil();
        } else {
            bin();
        }
    }

    private void bik() {
        if (this.eJZ) {
            bil();
            return;
        }
        requestWindowFeature(1);
        bin();
    }

    private void bil() {
        if (this.eJQ) {
            Log.i("card.io", "Camera not available and manual entry suppressed.");
            h(RESULT_SCAN_NOT_AVAILABLE, null);
        }
    }

    private void bim() {
        String str = ": ";
        String str2 = "card.io";
        StringKey stringKey;
        String a;
        StringBuilder stringBuilder;
        try {
            if (!m.biM()) {
                stringKey = StringKey.ERROR_NO_DEVICE_SUPPORT;
                a = b.a(stringKey);
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringKey);
                stringBuilder.append(str);
                stringBuilder.append(a);
                Log.w(str2, stringBuilder.toString());
                this.eJZ = true;
            }
        } catch (CameraUnavailableException unused) {
            stringKey = StringKey.ERROR_CAMERA_CONNECT_FAIL;
            a = b.a(stringKey);
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringKey);
            stringBuilder.append(str);
            stringBuilder.append(a);
            Log.e(str2, stringBuilder.toString());
            Toast makeText = Toast.makeText(this, a, 1);
            makeText.setGravity(17, 0, -75);
            makeText.show();
            this.eJZ = true;
        }
    }

    private void bin() {
        if (VERSION.SDK_INT >= 16) {
            getWindow().getDecorView().setSystemUiVisibility(4);
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        }
        try {
            this.eJN = new Rect();
            this.eJP = 1;
            if (!getIntent().getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) {
                this.eJY = new CardScanner(this, this.eJP);
            } else if (getPackageName().contentEquals("io.card.development")) {
                this.eJY = (CardScanner) Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[]{getClass(), Integer.TYPE}).newInstance(new Object[]{this, Integer.valueOf(this.eJP)});
            } else {
                throw new IllegalStateException("Illegal access of private extra");
            }
            this.eJY.biv();
            bir();
            this.eJK = new OrientationEventListener(this, 2) {
                public void onOrientationChanged(int i) {
                    CardIOActivity.this.je(i);
                }
            };
        } catch (Exception e) {
            e(e);
        }
    }

    private void e(Exception exception) {
        String a = b.a(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL);
        Log.e("card.io", "Unknown exception, please post the stack trace as a GitHub issue", exception);
        Toast makeText = Toast.makeText(this, a, 1);
        makeText.setGravity(17, 0, -75);
        makeText.show();
        this.eJZ = true;
    }

    private void je(int i) {
        if (i >= 0) {
            CardScanner cardScanner = this.eJY;
            if (cardScanner != null) {
                i += cardScanner.biz();
                if (i > 360) {
                    i -= 360;
                }
                int i2 = -1;
                if (i < 15 || i > 345) {
                    i2 = 0;
                    this.eJP = 1;
                } else if (i > 75 && i < 105) {
                    this.eJP = 4;
                    i2 = 90;
                } else if (i > 165 && i < 195) {
                    i2 = 180;
                    this.eJP = 2;
                } else if (i > 255 && i < 285) {
                    this.eJP = 3;
                    i2 = 270;
                }
                if (i2 >= 0 && i2 != this.eJO) {
                    this.eJY.setDeviceOrientation(this.eJP);
                    jg(i2);
                    if (i2 == 90) {
                        at(270.0f);
                    } else if (i2 == 270) {
                        at(90.0f);
                    } else {
                        at((float) i2);
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        if (!this.eJT) {
            if (this.eJZ) {
                bio();
                return;
            }
            m.biP();
            getWindow().addFlags(1024);
            getWindow().addFlags(128);
            a.q(this);
            setRequestedOrientation(1);
            this.eJK.enable();
            if (bip()) {
                gf(false);
            } else {
                Log.e(TAG, "Could not connect to camera.");
                kY(b.a(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL));
                bio();
            }
            je(this.eJO);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("io.card.payment.waitingForPermission", this.eJT);
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.eJK;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        gf(false);
        CardScanner cardScanner = this.eJY;
        if (cardScanner != null) {
            cardScanner.biw();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        this.eJJ = null;
        eJX--;
        OrientationEventListener orientationEventListener = this.eJK;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        gf(false);
        CardScanner cardScanner = this.eJY;
        if (cardScanner != null) {
            cardScanner.bix();
            this.eJY = null;
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 11) {
            this.eJT = false;
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.eJZ = true;
            } else {
                bin();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            if (i2 == 0) {
                Log.d(TAG, "ignoring onActivityResult(RESULT_CANCELED) caused only when Camera Permissions are Denied in Android 23");
            } else if (i2 == RESULT_CARD_INFO || i2 == RESULT_ENTRY_CANCELED || this.eJZ) {
                if (intent != null) {
                    String str = EXTRA_SCAN_RESULT;
                    if (intent.hasExtra(str)) {
                        String str2 = TAG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("EXTRA_SCAN_RESULT: ");
                        stringBuilder.append(intent.getParcelableExtra(str));
                        Log.v(str2, stringBuilder.toString());
                        h(i2, intent);
                    }
                }
                Log.d(TAG, "no data in EXTRA_SCAN_RESULT");
                h(i2, intent);
            } else {
                RelativeLayout relativeLayout = this.eJU;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
            }
        }
    }

    public void onBackPressed() {
        if (!this.eJZ && this.eJJ.isAnimating()) {
            try {
                bip();
            } catch (RuntimeException e) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("*** could not return to preview: ");
                stringBuilder.append(e);
                Log.w(str, stringBuilder.toString());
            }
        } else if (this.eJY != null) {
            super.onBackPressed();
        }
    }

    public static boolean canReadCardWithCamera() {
        boolean z = false;
        try {
            z = m.biM();
            return z;
        } catch (CameraUnavailableException unused) {
            return z;
        } catch (RuntimeException unused2) {
            Log.w(TAG, "RuntimeException accessing Util.hardwareSupported()");
            return z;
        }
    }

    public static Date sdkBuildDate() {
        return new Date(BuildConfig.BUILD_TIME);
    }

    public static Bitmap getCapturedCardImage(Intent intent) {
        if (intent != null) {
            String str = EXTRA_CAPTURED_CARD_IMAGE;
            if (intent.hasExtra(str)) {
                return BitmapFactory.decodeStream(new ByteArrayInputStream(intent.getByteArrayExtra(str)), null, new Options());
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void jf(int i) {
        SurfaceView biK = this.eJL.biK();
        i iVar = this.eJJ;
        if (iVar != null) {
            iVar.o(new Rect(biK.getLeft(), biK.getTop(), biK.getRight(), biK.getBottom()));
        }
        this.eJP = 1;
        jg(0);
        if (i != this.eJP) {
            Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
        }
        onEdgeUpdate(new DetectionInfo());
    }

    /* Access modifiers changed, original: 0000 */
    public void onEdgeUpdate(DetectionInfo detectionInfo) {
        this.eJJ.b(detectionInfo);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Bitmap bitmap, DetectionInfo detectionInfo) {
        float f;
        float f2;
        String str = "card.io";
        try {
            ((Vibrator) getSystemService("vibrator")).vibrate(eJI, -1);
        } catch (SecurityException unused) {
            Log.e(str, "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        } catch (Exception e) {
            Log.w(str, "Exception while attempting to vibrate: ", e);
        }
        this.eJY.biw();
        this.eJU.setVisibility(4);
        if (detectionInfo.biE()) {
            this.eJM = detectionInfo.biF();
            this.eJJ.a(this.eJM);
        }
        int i = this.eJP;
        if (i == 1 || i == 2) {
            f = ((float) this.eJN.right) / 428.0f;
            f2 = 0.95f;
        } else {
            f = ((float) this.eJN.right) / 428.0f;
            f2 = 1.15f;
        }
        f *= f2;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        this.eJJ.setBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false));
        if (this.eJR) {
            Intent intent = new Intent();
            m.a(getIntent(), intent, this.eJJ);
            h(RESULT_SCAN_SUPPRESSED, intent);
            return;
        }
        bio();
    }

    private void bio() {
        final Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra(EXTRA_SUPPRESS_CONFIRMATION, false)) {
            new Handler().post(new Runnable() {
                public void run() {
                    CardIOActivity.this.getWindow().clearFlags(1024);
                    CardIOActivity.this.getWindow().addFlags(512);
                    Intent intent = new Intent(CardIOActivity.this, DataEntryActivity.class);
                    m.a(intent, intent, CardIOActivity.this.eJJ);
                    if (CardIOActivity.this.eJJ != null) {
                        CardIOActivity.this.eJJ.biJ();
                        if (!(CardIOActivity.eKa == null || CardIOActivity.eKa.isRecycled())) {
                            CardIOActivity.eKa.recycle();
                        }
                        CardIOActivity.eKa = CardIOActivity.this.eJJ.biH();
                    }
                    if (CardIOActivity.this.eJM != null) {
                        intent.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, CardIOActivity.this.eJM);
                        CardIOActivity.this.eJM = null;
                    } else {
                        intent.putExtra("io.card.payment.manualEntryScanResult", true);
                    }
                    intent.putExtras(CardIOActivity.this.getIntent());
                    intent.addFlags(1082195968);
                    CardIOActivity.this.startActivityForResult(intent, 10);
                }
            });
            return;
        }
        Intent intent2 = new Intent(this, DataEntryActivity.class);
        CreditCard creditCard = this.eJM;
        if (creditCard != null) {
            intent2.putExtra(EXTRA_SCAN_RESULT, creditCard);
            this.eJM = null;
        }
        m.a(intent, intent2, this.eJJ);
        h(RESULT_CONFIRMATION_SUPPRESSED, intent2);
    }

    private void kY(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error display: ");
        stringBuilder.append(str);
        Log.e("card.io", stringBuilder.toString());
        Toast.makeText(this, str, 1).show();
    }

    private boolean bip() {
        this.eJM = null;
        boolean b = this.eJY.b(this.eJL.getSurfaceHolder());
        if (b) {
            this.eJU.setVisibility(0);
        }
        return b;
    }

    private void jg(int i) {
        SurfaceView biK = this.eJL.biK();
        if (biK == null) {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        }
        this.eJN = this.eJY.aU(biK.getWidth(), biK.getHeight());
        Rect rect = this.eJN;
        rect.top += biK.getTop();
        rect = this.eJN;
        rect.bottom += biK.getTop();
        this.eJJ.a(this.eJN, i);
        this.eJO = i;
    }

    /* Access modifiers changed, original: 0000 */
    public void toggleFlash() {
        gf(this.eJY.isFlashOn() ^ 1);
    }

    /* Access modifiers changed, original: 0000 */
    public void gf(boolean z) {
        Object obj = (this.eJL == null || this.eJJ == null || !this.eJY.gh(z)) ? null : 1;
        if (obj != null) {
            this.eJJ.gk(z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void biq() {
        this.eJY.gg(true);
    }

    private void bir() {
        int i;
        String stringExtra;
        this.eJV = new FrameLayout(this);
        this.eJV.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.eJV.setLayoutParams(new LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(1);
        this.eJY.getClass();
        this.eJY.getClass();
        this.eJL = new j(this, null, 640, 480);
        this.eJL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        frameLayout.addView(this.eJL);
        this.eJJ = new i(this, null, m.bU(this));
        this.eJJ.setLayoutParams(new LayoutParams(-1, -1));
        if (getIntent() != null) {
            this.eJJ.gl(getIntent().getBooleanExtra(EXTRA_USE_CARDIO_LOGO, false));
            int intExtra = getIntent().getIntExtra(EXTRA_GUIDE_COLOR, 0);
            if (intExtra != 0) {
                i = ViewCompat.MEASURED_STATE_MASK | intExtra;
                if (intExtra != i) {
                    Log.w("card.io", "Removing transparency from provided guide color.");
                }
                this.eJJ.jj(i);
            } else {
                this.eJJ.jj(-16711936);
            }
            this.eJJ.gj(getIntent().getBooleanExtra(EXTRA_HIDE_CARDIO_LOGO, false));
            stringExtra = getIntent().getStringExtra(EXTRA_SCAN_INSTRUCTIONS);
            if (stringExtra != null) {
                this.eJJ.ld(stringExtra);
            }
        }
        frameLayout.addView(this.eJJ);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, 2);
        this.eJV.addView(frameLayout, layoutParams);
        this.eJU = new RelativeLayout(this);
        this.eJU.setGravity(80);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.eJU.setLayoutParams(layoutParams2);
        this.eJU.setId(2);
        this.eJU.setGravity(85);
        if (!this.eJQ) {
            Button button = new Button(this);
            button.setId(3);
            button.setText(b.a(StringKey.KEYBOARD));
            button.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    CardIOActivity.this.bio();
                }
            });
            this.eJU.addView(button);
            c.a(button, false, this, this.eJW);
            if (!this.eJW) {
                button.setTextSize(14.0f);
            }
            button.setMinimumHeight(c.d("42dip", this));
            layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.addRule(12);
            stringExtra = "16dip";
            c.a(button, stringExtra, null, stringExtra, null);
            stringExtra = "4dip";
            c.b(button, stringExtra, stringExtra, stringExtra, stringExtra);
        }
        layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        i = (int) ((getResources().getDisplayMetrics().density * 15.0f) + 0.5f);
        layoutParams2.setMargins(0, i, 0, i);
        this.eJV.addView(this.eJU, layoutParams2);
        if (getIntent() != null) {
            LinearLayout linearLayout = this.eJS;
            if (linearLayout != null) {
                this.eJV.removeView(linearLayout);
                this.eJS = null;
            }
            int intExtra2 = getIntent().getIntExtra(EXTRA_SCAN_OVERLAY_LAYOUT_ID, -1);
            if (intExtra2 != -1) {
                this.eJS = new LinearLayout(this);
                this.eJS.setLayoutParams(new LayoutParams(-1, -1));
                getLayoutInflater().inflate(intExtra2, this.eJS);
                this.eJV.addView(this.eJS);
            }
        }
        setContentView(this.eJV);
    }

    private void at(float f) {
        LinearLayout linearLayout = this.eJS;
        if (linearLayout != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f, (float) (linearLayout.getWidth() / 2), (float) (this.eJS.getHeight() / 2));
            rotateAnimation.setDuration(0);
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setFillAfter(true);
            this.eJS.setAnimation(rotateAnimation);
        }
    }

    private void h(int i, Intent intent) {
        setResult(i, intent);
        eKa = null;
        finish();
    }

    public Rect getTorchRect() {
        i iVar = this.eJJ;
        if (iVar == null) {
            return null;
        }
        return iVar.getTorchRect();
    }
}
