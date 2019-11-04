package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

class CardScanner implements AutoFocusCallback, PreviewCallback, Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "CardScanner";
    private static boolean eKf;
    private static boolean eKv = false;
    final int dRA = 640;
    final int dRC = 480;
    private Camera dRb;
    private int eJP = 1;
    private Bitmap eKe;
    protected WeakReference<CardIOActivity> eKg;
    private boolean eKh = false;
    private boolean eKi;
    private int eKj = -1;
    private boolean eKk = true;
    private long eKl;
    private long eKm;
    private long eKn;
    private byte[] eKo;
    protected boolean eKp = true;
    private boolean eKq;
    private int eKr;
    private int eKs;
    private int eKt;
    private int eKu;

    private native void nCleanup();

    private native void nGetGuideFrame(int i, int i2, int i3, Rect rect);

    private native int nGetNumFramesScanned();

    private native void nResetAnalytics();

    private native void nScanFrame(byte[] bArr, int i, int i2, int i3, DetectionInfo detectionInfo, Bitmap bitmap, boolean z);

    private native void nSetup(boolean z, float f);

    private native void nSetup(boolean z, float f, int i);

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    public static native boolean nUseX86();

    static {
        String str = "card.io";
        Log.i(str, "card.io 5.5.1 03/17/2017 14:23:12 -0400");
        try {
            loadLibrary("cardioDecider");
            Log.d(str, "Loaded card.io decider library.");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("    nUseNeon(): ");
            stringBuilder.append(nUseNeon());
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("    nUseTegra():");
            stringBuilder.append(nUseTegra());
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("    nUseX86():  ");
            stringBuilder.append(nUseX86());
            Log.d(str, stringBuilder.toString());
            if (bit()) {
                loadLibrary("opencv_core");
                Log.d(str, "Loaded opencv core library");
                loadLibrary("opencv_imgproc");
                Log.d(str, "Loaded opencv imgproc library");
            }
            String str2 = "cardioRecognizer";
            if (nUseNeon()) {
                loadLibrary(str2);
                Log.i(str, "Loaded card.io NEON library");
            } else if (nUseX86()) {
                loadLibrary(str2);
                Log.i(str, "Loaded card.io x86 library");
            } else if (nUseTegra()) {
                loadLibrary("cardioRecognizer_tegra2");
                Log.i(str, "Loaded card.io Tegra2 library");
            } else {
                Log.w(str, "unsupported processor - card.io scanning requires ARMv7 or x86 architecture");
                eKf = true;
            }
        } catch (UnsatisfiedLinkError e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to load native library: ");
            stringBuilder2.append(e.getMessage());
            Log.e(str, stringBuilder2.toString());
            eKf = true;
        }
    }

    private static void loadLibrary(String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            String bis = CardIONativeLibsConfig.bis();
            if (bis == null || bis.length() == 0) {
                throw e;
            }
            StringBuilder stringBuilder;
            if (!File.separator.equals(Character.valueOf(bis.charAt(bis.length() - 1)))) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(bis);
                stringBuilder.append(File.separator);
                bis = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(bis);
            stringBuilder.append(Build.CPU_ABI);
            stringBuilder.append(File.separator);
            stringBuilder.append(System.mapLibraryName(str));
            String stringBuilder2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("loadLibrary failed for library ");
            stringBuilder3.append(str);
            stringBuilder3.append(". Trying ");
            stringBuilder3.append(stringBuilder2);
            Log.d("card.io", stringBuilder3.toString());
            System.load(stringBuilder2);
        }
    }

    private static boolean bit() {
        return nUseNeon() || nUseTegra() || nUseX86();
    }

    static boolean biu() {
        return !eKf && bit();
    }

    CardScanner(CardIOActivity cardIOActivity, int i) {
        boolean z = false;
        Intent intent = cardIOActivity.getIntent();
        if (intent != null) {
            this.eKh = intent.getBooleanExtra(CardIOActivity.EXTRA_SUPPRESS_SCAN, false);
            if (intent.getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, false) && intent.getBooleanExtra(CardIOActivity.EXTRA_SCAN_EXPIRY, true)) {
                z = true;
            }
            this.eKi = z;
            this.eKj = intent.getIntExtra(CardIOActivity.EXTRA_UNBLUR_DIGITS, -1);
        }
        this.eKg = new WeakReference(cardIOActivity);
        this.eJP = i;
        nSetup(this.eKh, 6.0f, this.eKj);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
    /* JADX WARNING: Missing block: B:4:0x000e, code skipped:
            return r9;
     */
    private android.hardware.Camera aT(int r9, int r10) {
        /*
        r8 = this;
        r0 = "card.io";
        r1 = java.lang.System.currentTimeMillis();
        r3 = r8.eKp;
        if (r3 == 0) goto L_0x0031;
    L_0x000a:
        r9 = android.hardware.Camera.open();	 Catch:{ RuntimeException -> 0x0017, Exception -> 0x000f }
        return r9;
    L_0x000f:
        r10 = move-exception;
        r3 = "Unexpected exception. Please report it as a GitHub issue";
        android.util.Log.e(r0, r3, r10);
        r10 = 0;
        goto L_0x0027;
    L_0x0017:
        r3 = "Wasn't able to connect to camera service. Waiting and trying again...";
        android.util.Log.w(r0, r3);	 Catch:{ InterruptedException -> 0x0021 }
        r3 = (long) r9;	 Catch:{ InterruptedException -> 0x0021 }
        java.lang.Thread.sleep(r3);	 Catch:{ InterruptedException -> 0x0021 }
        goto L_0x0027;
    L_0x0021:
        r3 = move-exception;
        r4 = "Interrupted while waiting for camera";
        android.util.Log.e(r0, r4, r3);
    L_0x0027:
        r3 = java.lang.System.currentTimeMillis();
        r3 = r3 - r1;
        r5 = (long) r10;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x000a;
    L_0x0031:
        r9 = TAG;
        r10 = "camera connect timeout";
        android.util.Log.w(r9, r10);
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.card.payment.CardScanner.aT(int, int):android.hardware.Camera");
    }

    /* Access modifiers changed, original: 0000 */
    public void biv() {
        this.eKk = true;
        this.eKm = 0;
        this.eKn = 0;
        this.eKr = 0;
        this.eKs = 0;
        this.eKt = 0;
        this.eKu = 0;
        if (this.eKp && this.dRb == null) {
            this.dRb = aT(50, 5000);
            Camera camera = this.dRb;
            String str = "card.io";
            if (camera == null) {
                Log.e(str, "prepare scanner couldn't connect to camera!");
                return;
            }
            b(camera);
            Parameters parameters = this.dRb.getParameters();
            List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null) {
                Size size = null;
                for (Size size2 : supportedPreviewSizes) {
                    if (size2.width == 640 && size2.height == 480) {
                        size = size2;
                        break;
                    }
                }
                if (size == null) {
                    Log.w(str, "Didn't find a supported 640x480 resolution, so forcing");
                    Size size3 = (Size) supportedPreviewSizes.get(0);
                    size3.width = 640;
                    size3.height = 480;
                }
            }
            parameters.setPreviewSize(640, 480);
            this.dRb.setParameters(parameters);
        } else if (!this.eKp) {
            Log.w(TAG, "useCamera is false!");
        } else if (this.dRb != null) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("we already have a camera instance: ");
            stringBuilder.append(this.dRb);
            Log.v(str2, stringBuilder.toString());
        }
        if (this.eKe == null) {
            this.eKe = Bitmap.createBitmap(428, 270, Config.ARGB_8888);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(SurfaceHolder surfaceHolder) {
        if (this.dRb == null) {
            biv();
        }
        if (this.eKp && this.dRb == null) {
            Log.i(TAG, "null camera. failure");
            return false;
        }
        if (this.eKp && this.eKo == null) {
            this.eKo = new byte[(((ImageFormat.getBitsPerPixel(this.dRb.getParameters().getPreviewFormat()) / 8) * 307200) * 3)];
            this.dRb.addCallbackBuffer(this.eKo);
        }
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(3);
        if (this.eKp) {
            this.dRb.setPreviewCallbackWithBuffer(this);
        }
        if (this.eKq) {
            c(surfaceHolder);
        }
        gh(false);
        this.eKl = System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    public void biw() {
        gh(false);
        Camera camera = this.dRb;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.dRb.setPreviewDisplay(null);
            } catch (IOException e) {
                Log.w("card.io", "can't stop preview display", e);
            }
            this.dRb.setPreviewCallback(null);
            this.dRb.release();
            this.eKo = null;
            this.dRb = null;
        }
    }

    public void bix() {
        if (this.dRb != null) {
            biw();
        }
        nCleanup();
        this.eKo = null;
    }

    private boolean c(SurfaceHolder surfaceHolder) {
        String str = "card.io";
        this.eKk = true;
        if (this.eKp) {
            try {
                this.dRb.setPreviewDisplay(surfaceHolder);
                try {
                    this.dRb.startPreview();
                    this.dRb.autoFocus(this);
                } catch (RuntimeException e) {
                    Log.e(str, "startPreview failed on camera. Error: ", e);
                    return false;
                }
            } catch (IOException e2) {
                Log.e(str, "can't set preview display", e2);
                return false;
            }
        }
        return true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.dRb == null && this.eKp) {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
            return;
        }
        this.eKq = true;
        c(surfaceHolder);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String str = TAG;
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(surfaceHolder != null);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        Log.d(str, String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", objArr));
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.dRb;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.e("card.io", "error stopping camera", e);
            }
        }
        this.eKq = false;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr == null) {
            Log.w(TAG, "frame is null! skipping");
            return;
        }
        int i = 1;
        if (eKv) {
            Log.e(TAG, "processing in progress.... dropping frame");
            this.eKu++;
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
            return;
        }
        eKv = true;
        if (this.eKk) {
            this.eKk = false;
            this.eJP = 1;
            ((CardIOActivity) this.eKg.get()).jf(1);
        }
        DetectionInfo detectionInfo = new DetectionInfo();
        nScanFrame(bArr, 640, 480, this.eJP, detectionInfo, this.eKe, this.eKi);
        if (detectionInfo.focusScore < 6.0f) {
            i = 0;
        }
        if (i == 0) {
            gg(false);
        } else if (detectionInfo.biE() || (this.eKh && detectionInfo.biD())) {
            ((CardIOActivity) this.eKg.get()).a(this.eKe, detectionInfo);
        }
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
        eKv = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void onEdgeUpdate(DetectionInfo detectionInfo) {
        ((CardIOActivity) this.eKg.get()).onEdgeUpdate(detectionInfo);
    }

    /* Access modifiers changed, original: 0000 */
    public Rect w(int i, int i2, int i3) {
        if (!biu()) {
            return null;
        }
        Rect rect = new Rect();
        nGetGuideFrame(i, i2, i3, rect);
        return rect;
    }

    /* Access modifiers changed, original: 0000 */
    public Rect aU(int i, int i2) {
        return w(this.eJP, i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public void setDeviceOrientation(int i) {
        this.eJP = i;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.eKn = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean biy() {
        return this.eKn < this.eKm;
    }

    /* Access modifiers changed, original: 0000 */
    public void gg(boolean z) {
        if (this.eKp && !biy()) {
            try {
                this.eKm = System.currentTimeMillis();
                this.dRb.autoFocus(this);
                if (z) {
                    this.eKr++;
                } else {
                    this.eKs++;
                }
            } catch (RuntimeException e) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("could not trigger auto focus: ");
                stringBuilder.append(e);
                Log.w(str, stringBuilder.toString());
            }
        }
    }

    public boolean isFlashOn() {
        if (this.eKp) {
            return this.dRb.getParameters().getFlashMode().equals("torch");
        }
        return false;
    }

    public boolean gh(boolean z) {
        Camera camera = this.dRb;
        if (camera != null) {
            try {
                Parameters parameters = camera.getParameters();
                parameters.setFlashMode(z ? "torch" : "off");
                this.dRb.setParameters(parameters);
                this.eKt++;
                return true;
            } catch (RuntimeException e) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not set flash mode: ");
                stringBuilder.append(e);
                Log.w(str, stringBuilder.toString());
            }
        }
        return false;
    }

    private void b(Camera camera) {
        int biz;
        if (VERSION.SDK_INT >= 21) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
            biz = ((cameraInfo.orientation - biz()) + 360) % 360;
        } else {
            biz = 90;
        }
        camera.setDisplayOrientation(biz);
    }

    /* Access modifiers changed, original: 0000 */
    public int biz() {
        int rotation = ((WindowManager) ((CardIOActivity) this.eKg.get()).getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        return rotation == 3 ? 270 : 0;
    }
}
