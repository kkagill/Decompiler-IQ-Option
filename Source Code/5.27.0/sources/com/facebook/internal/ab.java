package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.common.a.e;
import com.facebook.f;
import com.facebook.j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebDialog */
public class ab extends Dialog {
    private static volatile int Ai;
    private static final int zX = e.com_facebook_activity_theme;
    private WebView Aa;
    private ProgressDialog Ab;
    private ImageView Ac;
    private FrameLayout Ad;
    private d Ae;
    private boolean Af;
    private boolean Ag;
    private boolean Ah;
    private LayoutParams Aj;
    private String url;
    private String zY;
    private c zZ;

    /* compiled from: WebDialog */
    public static class a {
        private c Al;
        private String action;
        private String applicationId;
        private Context context;
        private com.facebook.a tT;
        private int theme;
        private Bundle ua;

        public a(Context context, String str, Bundle bundle) {
            this.tT = com.facebook.a.ge();
            if (!com.facebook.a.gf()) {
                String Z = z.Z(context);
                if (Z != null) {
                    this.applicationId = Z;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = z.Z(context);
            }
            aa.H(str, "applicationId");
            this.applicationId = str;
            a(context, str2, bundle);
        }

        public a b(c cVar) {
            this.Al = cVar;
            return this;
        }

        public ab ld() {
            com.facebook.a aVar = this.tT;
            String str = "app_id";
            if (aVar != null) {
                this.ua.putString(str, aVar.go());
                this.ua.putString("access_token", this.tT.getToken());
            } else {
                this.ua.putString(str, this.applicationId);
            }
            return ab.a(this.context, this.action, this.ua, this.theme, this.Al);
        }

        public String go() {
            return this.applicationId;
        }

        public Context getContext() {
            return this.context;
        }

        public int getTheme() {
            return this.theme;
        }

        public Bundle getParameters() {
            return this.ua;
        }

        public c le() {
            return this.Al;
        }

        private void a(Context context, String str, Bundle bundle) {
            this.context = context;
            this.action = str;
            if (bundle != null) {
                this.ua = bundle;
            } else {
                this.ua = new Bundle();
            }
        }
    }

    /* compiled from: WebDialog */
    private class b extends WebViewClient {
        private b() {
        }

        /* synthetic */ b(ab abVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
            r5 = this;
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r0 = "Redirect URL: ";
            r6.append(r0);
            r6.append(r7);
            r6 = r6.toString();
            r0 = "FacebookSDK.WebDialog";
            com.facebook.internal.z.G(r0, r6);
            r6 = com.facebook.internal.ab.this;
            r6 = r6.zY;
            r6 = r7.startsWith(r6);
            r0 = 1;
            if (r6 == 0) goto L_0x00a6;
        L_0x0023:
            r6 = com.facebook.internal.ab.this;
            r6 = r6.bd(r7);
            r7 = "error";
            r7 = r6.getString(r7);
            if (r7 != 0) goto L_0x0037;
        L_0x0031:
            r7 = "error_type";
            r7 = r6.getString(r7);
        L_0x0037:
            r1 = "error_msg";
            r1 = r6.getString(r1);
            if (r1 != 0) goto L_0x0045;
        L_0x003f:
            r1 = "error_message";
            r1 = r6.getString(r1);
        L_0x0045:
            if (r1 != 0) goto L_0x004d;
        L_0x0047:
            r1 = "error_description";
            r1 = r6.getString(r1);
        L_0x004d:
            r2 = "error_code";
            r2 = r6.getString(r2);
            r3 = com.facebook.internal.z.aB(r2);
            r4 = -1;
            if (r3 != 0) goto L_0x005f;
        L_0x005a:
            r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x005f }
            goto L_0x0060;
        L_0x005f:
            r2 = -1;
        L_0x0060:
            r3 = com.facebook.internal.z.aB(r7);
            if (r3 == 0) goto L_0x0074;
        L_0x0066:
            r3 = com.facebook.internal.z.aB(r1);
            if (r3 == 0) goto L_0x0074;
        L_0x006c:
            if (r2 != r4) goto L_0x0074;
        L_0x006e:
            r7 = com.facebook.internal.ab.this;
            r7.p(r6);
            goto L_0x00a5;
        L_0x0074:
            if (r7 == 0) goto L_0x008c;
        L_0x0076:
            r6 = "access_denied";
            r6 = r7.equals(r6);
            if (r6 != 0) goto L_0x0086;
        L_0x007e:
            r6 = "OAuthAccessDeniedException";
            r6 = r7.equals(r6);
            if (r6 == 0) goto L_0x008c;
        L_0x0086:
            r6 = com.facebook.internal.ab.this;
            r6.cancel();
            goto L_0x00a5;
        L_0x008c:
            r6 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
            if (r2 != r6) goto L_0x0096;
        L_0x0090:
            r6 = com.facebook.internal.ab.this;
            r6.cancel();
            goto L_0x00a5;
        L_0x0096:
            r6 = new com.facebook.FacebookRequestError;
            r6.<init>(r2, r7, r1);
            r7 = com.facebook.internal.ab.this;
            r2 = new com.facebook.FacebookServiceException;
            r2.<init>(r6, r1);
            r7.e(r2);
        L_0x00a5:
            return r0;
        L_0x00a6:
            r6 = "fbconnect://cancel";
            r6 = r7.startsWith(r6);
            if (r6 == 0) goto L_0x00b4;
        L_0x00ae:
            r6 = com.facebook.internal.ab.this;
            r6.cancel();
            return r0;
        L_0x00b4:
            r6 = "touch";
            r6 = r7.contains(r6);
            r1 = 0;
            if (r6 == 0) goto L_0x00bf;
        L_0x00be:
            return r1;
        L_0x00bf:
            r6 = com.facebook.internal.ab.this;	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            r6 = r6.getContext();	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            r3 = "android.intent.action.VIEW";
            r7 = android.net.Uri.parse(r7);	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            r2.<init>(r3, r7);	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            r6.startActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x00d4 }
            return r0;
        L_0x00d4:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ab$b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ab.this.e(new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            ab.this.e(new FacebookDialogException(null, -11, null));
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Webview loading URL: ");
            stringBuilder.append(str);
            z.G("FacebookSDK.WebDialog", stringBuilder.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!ab.this.Ag) {
                ab.this.Ab.show();
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!ab.this.Ag) {
                ab.this.Ab.dismiss();
            }
            ab.this.Ad.setBackgroundColor(0);
            ab.this.Aa.setVisibility(0);
            ab.this.Ac.setVisibility(0);
            ab.this.Ah = true;
        }
    }

    /* compiled from: WebDialog */
    public interface c {
        void b(Bundle bundle, FacebookException facebookException);
    }

    /* compiled from: WebDialog */
    private class d extends AsyncTask<Void, Void, String[]> {
        private Exception[] Am;
        private String action;
        private Bundle ua;

        d(String str, Bundle bundle) {
            this.action = str;
            this.ua = bundle;
        }

        /* Access modifiers changed, original: protected|varargs */
        /* renamed from: b */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.ua.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.Am = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            com.facebook.a ge = com.facebook.a.ge();
            int i = 0;
            while (i < stringArray.length) {
                Iterator it;
                try {
                    if (isCancelled()) {
                        it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (z.f(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(com.facebook.share.a.c.a(ge, parse, new com.facebook.g.b() {
                            public void a(j jVar) {
                                try {
                                    FacebookRequestError hG = jVar.hG();
                                    String str = "Error staging photo.";
                                    if (hG != null) {
                                        String errorMessage = hG.getErrorMessage();
                                        if (errorMessage == null) {
                                            errorMessage = str;
                                        }
                                        throw new FacebookGraphResponseException(jVar, errorMessage);
                                    }
                                    JSONObject hH = jVar.hH();
                                    if (hH != null) {
                                        String optString = hH.optString("uri");
                                        if (optString != null) {
                                            strArr[i] = optString;
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        throw new FacebookException(str);
                                    }
                                    throw new FacebookException(str);
                                } catch (Exception e) {
                                    d.this.Am[i] = e;
                                }
                            }
                        }).ho());
                    }
                    i++;
                } catch (Exception unused) {
                    it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        ((AsyncTask) it.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: c */
        public void onPostExecute(String[] strArr) {
            ab.this.Ab.dismiss();
            for (Throwable th : this.Am) {
                if (th != null) {
                    ab.this.e(th);
                    return;
                }
            }
            String str = "Failed to stage photos for web dialog";
            if (strArr == null) {
                ab.this.e(new FacebookException(str));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                ab.this.e(new FacebookException(str));
                return;
            }
            z.b(this.ua, "media", new JSONArray(asList));
            String kH = x.kH();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f.gU());
            stringBuilder.append("/");
            stringBuilder.append("dialog/");
            stringBuilder.append(this.action);
            ab.this.url = z.a(kH, stringBuilder.toString(), this.ua).toString();
            ab.this.aa((ab.this.Ac.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    protected static void ai(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || Ai != 0)) {
                    Z(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    public static ab a(Context context, String str, Bundle bundle, int i, c cVar) {
        ai(context);
        return new ab(context, str, bundle, i, cVar);
    }

    public static int kY() {
        aa.kV();
        return Ai;
    }

    public static void Z(int i) {
        if (i == 0) {
            i = zX;
        }
        Ai = i;
    }

    protected ab(Context context, String str) {
        this(context, str, kY());
    }

    private ab(Context context, String str, int i) {
        if (i == 0) {
            i = kY();
        }
        super(context, i);
        this.zY = "fbconnect://success";
        this.Af = false;
        this.Ag = false;
        this.Ah = false;
        this.url = str;
    }

    private ab(Context context, String str, Bundle bundle, int i, c cVar) {
        if (i == 0) {
            i = kY();
        }
        super(context, i);
        String str2 = "fbconnect://success";
        this.zY = str2;
        this.Af = false;
        this.Ag = false;
        this.Ah = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (z.ag(context)) {
            str2 = "fbconnect://chrome_os_success";
        }
        this.zY = str2;
        bundle.putString("redirect_uri", this.zY);
        bundle.putString("display", "touch");
        bundle.putString("client_id", f.go());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{f.gV()}));
        this.zZ = cVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.Ae = new d(str, bundle);
            return;
        }
        String kH = x.kH();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.gU());
        stringBuilder.append("/");
        stringBuilder.append("dialog/");
        stringBuilder.append(str);
        this.url = z.a(kH, stringBuilder.toString(), bundle).toString();
    }

    public void a(c cVar) {
        this.zZ = cVar;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void dismiss() {
        WebView webView = this.Aa;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.Ag) {
            ProgressDialog progressDialog = this.Ab;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.Ab.dismiss();
            }
        }
        super.dismiss();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        d dVar = this.Ae;
        if (dVar == null || dVar.getStatus() != Status.PENDING) {
            lb();
            return;
        }
        this.Ae.execute(new Void[0]);
        this.Ab.show();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        d dVar = this.Ae;
        if (dVar != null) {
            dVar.cancel(true);
            this.Ab.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.Ag = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        this.Ag = false;
        if (z.ae(getContext())) {
            LayoutParams layoutParams = this.Aj;
            if (layoutParams != null && layoutParams.token == null) {
                this.Aj.token = getOwnerActivity().getWindow().getAttributes().token;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Set token on onAttachedToWindow(): ");
                stringBuilder.append(this.Aj.token);
                z.G("FacebookSDK.WebDialog", stringBuilder.toString());
            }
        }
        super.onAttachedToWindow();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.Aj = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Ab = new ProgressDialog(getContext());
        this.Ab.requestWindowFeature(1);
        this.Ab.setMessage(getContext().getString(com.facebook.common.a.d.com_facebook_loading));
        this.Ab.setCanceledOnTouchOutside(false);
        this.Ab.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                ab.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.Ad = new FrameLayout(getContext());
        lb();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        lc();
        if (this.url != null) {
            aa((this.Ac.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.Ad.addView(this.Ac, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.Ad);
    }

    /* Access modifiers changed, original: protected */
    public void bt(String str) {
        this.zY = str;
    }

    /* Access modifiers changed, original: protected */
    public Bundle bd(String str) {
        Uri parse = Uri.parse(str);
        Bundle bq = z.bq(parse.getQuery());
        bq.putAll(z.bq(parse.getFragment()));
        return bq;
    }

    /* Access modifiers changed, original: protected */
    public boolean kZ() {
        return this.Af;
    }

    /* Access modifiers changed, original: protected */
    public boolean la() {
        return this.Ah;
    }

    /* Access modifiers changed, original: protected */
    public WebView getWebView() {
        return this.Aa;
    }

    public void lb() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    private int a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* Access modifiers changed, original: protected */
    public void p(Bundle bundle) {
        c cVar = this.zZ;
        if (cVar != null && !this.Af) {
            this.Af = true;
            cVar.b(bundle, null);
            dismiss();
        }
    }

    /* Access modifiers changed, original: protected */
    public void e(Throwable th) {
        if (this.zZ != null && !this.Af) {
            FacebookException facebookException;
            this.Af = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.zZ.b(null, facebookException);
            dismiss();
        }
    }

    public void cancel() {
        if (this.zZ != null && !this.Af) {
            e(new FacebookOperationCanceledException());
        }
    }

    private void lc() {
        this.Ac = new ImageView(getContext());
        this.Ac.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                ab.this.cancel();
            }
        });
        this.Ac.setImageDrawable(getContext().getResources().getDrawable(com.facebook.common.a.a.com_facebook_close));
        this.Ac.setVisibility(4);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void aa(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.Aa = new WebView(getContext()) {
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.Aa.setVerticalScrollBarEnabled(false);
        this.Aa.setHorizontalScrollBarEnabled(false);
        this.Aa.setWebViewClient(new b(this, null));
        this.Aa.getSettings().setJavaScriptEnabled(true);
        this.Aa.loadUrl(this.url);
        this.Aa.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.Aa.setVisibility(4);
        this.Aa.getSettings().setSavePassword(false);
        this.Aa.getSettings().setSaveFormData(false);
        this.Aa.setFocusable(true);
        this.Aa.setFocusableInTouchMode(true);
        this.Aa.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.Aa);
        linearLayout.setBackgroundColor(-872415232);
        this.Ad.addView(linearLayout);
    }
}
