package com.iqoption.qrcode.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.vision.Detector;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CameraSource */
public class a {
    private final Object dRa;
    private Camera dRb;
    private int dRc;
    private int dRd;
    private Size dRe;
    private float dRf;
    private int dRg;
    private int dRh;
    private String dRi;
    private String dRj;
    private Thread dRk;
    private c dRl;
    private Map<byte[], ByteBuffer> dRm;
    private Context mContext;

    /* compiled from: CameraSource */
    public static class a {
        private a dQQ = new a();
        private final Detector<?> dRn;

        public a(Context context, Detector<?> detector) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (detector != null) {
                this.dRn = detector;
                this.dQQ.mContext = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public a ac(float f) {
            if (f > 0.0f) {
                this.dQQ.dRf = f;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid fps: ");
            stringBuilder.append(f);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public a jF(String str) {
            this.dQQ.dRi = str;
            return this;
        }

        public a jG(String str) {
            this.dQQ.dRj = str;
            return this;
        }

        public a aC(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid preview size: ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.dQQ.dRg = i;
            this.dQQ.dRh = i2;
            return this;
        }

        public a gZ(int i) {
            if (i == 0 || i == 1) {
                this.dQQ.dRc = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid camera: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public a aTh() {
            a aVar = this.dQQ;
            aVar.getClass();
            aVar.dRl = new c(this.dRn);
            return this.dQQ;
        }
    }

    /* compiled from: CameraSource */
    private class b implements PreviewCallback {
        private b() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            a.this.dRl.a(bArr, camera);
        }
    }

    /* compiled from: CameraSource */
    private class c implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Detector<?> dRn;
        private long dRp = SystemClock.elapsedRealtime();
        private long dRq;
        private int dRr = 0;
        private ByteBuffer dRs;
        private boolean mActive = true;
        private final Object mLock = new Object();

        static {
            Class cls = a.class;
        }

        c(Detector<?> detector) {
            this.dRn = detector;
        }

        /* Access modifiers changed, original: 0000 */
        @SuppressLint({"Assert"})
        public void release() {
            this.dRn.release();
            this.dRn = null;
        }

        /* Access modifiers changed, original: 0000 */
        public void setActive(boolean z) {
            synchronized (this.mLock) {
                this.mActive = z;
                this.mLock.notifyAll();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(byte[] bArr, Camera camera) {
            synchronized (this.mLock) {
                if (this.dRs != null) {
                    camera.addCallbackBuffer(this.dRs.array());
                    this.dRs = null;
                }
                if (a.this.dRm.containsKey(bArr)) {
                    this.dRq = SystemClock.elapsedRealtime() - this.dRp;
                    this.dRr++;
                    this.dRs = (ByteBuffer) a.this.dRm.get(bArr);
                    this.mLock.notifyAll();
                    return;
                }
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0011 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
        /* JADX WARNING: Missing block: B:12:0x0012, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            r6.dRn.receiveFrame(r1);
     */
        /* JADX WARNING: Missing block: B:22:0x006e, code skipped:
            com.iqoption.qrcode.camera.a.a(r6.dRo).addCallbackBuffer(r2.array());
     */
        public void run() {
            /*
            r6 = this;
        L_0x0000:
            r0 = r6.mLock;
            monitor-enter(r0);
        L_0x0003:
            r1 = r6.mActive;	 Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0013;
        L_0x0007:
            r1 = r6.dRs;	 Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0013;
        L_0x000b:
            r1 = r6.mLock;	 Catch:{ InterruptedException -> 0x0011 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0003;
        L_0x0011:
            monitor-exit(r0);	 Catch:{ all -> 0x008b }
            return;
        L_0x0013:
            r1 = r6.mActive;	 Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0019;
        L_0x0017:
            monitor-exit(r0);	 Catch:{ all -> 0x008b }
            return;
        L_0x0019:
            r1 = new com.google.android.gms.vision.Frame$Builder;	 Catch:{ all -> 0x008b }
            r1.<init>();	 Catch:{ all -> 0x008b }
            r2 = r6.dRs;	 Catch:{ all -> 0x008b }
            r3 = com.iqoption.qrcode.camera.a.this;	 Catch:{ all -> 0x008b }
            r3 = r3.dRe;	 Catch:{ all -> 0x008b }
            r3 = r3.getWidth();	 Catch:{ all -> 0x008b }
            r4 = com.iqoption.qrcode.camera.a.this;	 Catch:{ all -> 0x008b }
            r4 = r4.dRe;	 Catch:{ all -> 0x008b }
            r4 = r4.getHeight();	 Catch:{ all -> 0x008b }
            r5 = 17;
            r1 = r1.setImageData(r2, r3, r4, r5);	 Catch:{ all -> 0x008b }
            r2 = r6.dRr;	 Catch:{ all -> 0x008b }
            r1 = r1.setId(r2);	 Catch:{ all -> 0x008b }
            r2 = r6.dRq;	 Catch:{ all -> 0x008b }
            r1 = r1.setTimestampMillis(r2);	 Catch:{ all -> 0x008b }
            r2 = com.iqoption.qrcode.camera.a.this;	 Catch:{ all -> 0x008b }
            r2 = r2.dRd;	 Catch:{ all -> 0x008b }
            r1 = r1.setRotation(r2);	 Catch:{ all -> 0x008b }
            r1 = r1.build();	 Catch:{ all -> 0x008b }
            r2 = r6.dRs;	 Catch:{ all -> 0x008b }
            r3 = 0;
            r6.dRs = r3;	 Catch:{ all -> 0x008b }
            monitor-exit(r0);	 Catch:{ all -> 0x008b }
            r0 = r6.dRn;	 Catch:{ Throwable -> 0x007c, all -> 0x006d }
            r0.receiveFrame(r1);	 Catch:{ Throwable -> 0x007c, all -> 0x006d }
            r0 = com.iqoption.qrcode.camera.a.this;
            r0 = r0.dRb;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x006d:
            r0 = move-exception;
            r1 = com.iqoption.qrcode.camera.a.this;
            r1 = r1.dRb;
            r2 = r2.array();
            r1.addCallbackBuffer(r2);
            throw r0;
        L_0x007c:
            r0 = com.iqoption.qrcode.camera.a.this;
            r0 = r0.dRb;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x008b:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x008b }
            goto L_0x008f;
        L_0x008e:
            throw r1;
        L_0x008f:
            goto L_0x008e;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.qrcode.camera.a$c.run():void");
        }
    }

    /* compiled from: CameraSource */
    private static class d {
        private Size dRt;
        private Size dRu;

        public d(Camera.Size size, Camera.Size size2) {
            this.dRt = new Size(size.width, size.height);
            if (size2 != null) {
                this.dRu = new Size(size2.width, size2.height);
            }
        }

        public Size aTi() {
            return this.dRt;
        }

        public Size aTj() {
            return this.dRu;
        }
    }

    public void release() {
        synchronized (this.dRa) {
            stop();
            this.dRl.release();
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public a a(SurfaceHolder surfaceHolder) {
        synchronized (this.dRa) {
            if (this.dRb != null) {
                return this;
            }
            this.dRb = aTg();
            this.dRb.setPreviewDisplay(surfaceHolder);
            this.dRb.startPreview();
            this.dRk = new Thread(this.dRl);
            this.dRl.setActive(true);
            this.dRk.start();
            return this;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0039 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|(1:16)(1:17)|18|19) */
    public void stop() {
        /*
        r4 = this;
        r0 = r4.dRa;
        monitor-enter(r0);
        r1 = r4.dRl;	 Catch:{ all -> 0x0042 }
        r2 = 0;
        r1.setActive(r2);	 Catch:{ all -> 0x0042 }
        r1 = r4.dRk;	 Catch:{ all -> 0x0042 }
        r2 = 0;
        if (r1 == 0) goto L_0x0015;
    L_0x000e:
        r1 = r4.dRk;	 Catch:{ InterruptedException -> 0x0013 }
        r1.join();	 Catch:{ InterruptedException -> 0x0013 }
    L_0x0013:
        r4.dRk = r2;	 Catch:{ all -> 0x0042 }
    L_0x0015:
        r1 = r4.dRm;	 Catch:{ all -> 0x0042 }
        r1.clear();	 Catch:{ all -> 0x0042 }
        r1 = r4.dRb;	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0040;
    L_0x001e:
        r1 = r4.dRb;	 Catch:{ all -> 0x0042 }
        r1.stopPreview();	 Catch:{ all -> 0x0042 }
        r1 = r4.dRb;	 Catch:{ all -> 0x0042 }
        r1.setPreviewCallbackWithBuffer(r2);	 Catch:{ all -> 0x0042 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0039 }
        r3 = 11;
        if (r1 < r3) goto L_0x0034;
    L_0x002e:
        r1 = r4.dRb;	 Catch:{ Exception -> 0x0039 }
        r1.setPreviewTexture(r2);	 Catch:{ Exception -> 0x0039 }
        goto L_0x0039;
    L_0x0034:
        r1 = r4.dRb;	 Catch:{ Exception -> 0x0039 }
        r1.setPreviewDisplay(r2);	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        r1 = r4.dRb;	 Catch:{ all -> 0x0042 }
        r1.release();	 Catch:{ all -> 0x0042 }
        r4.dRb = r2;	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0042:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.qrcode.camera.a.stop():void");
    }

    public Size getPreviewSize() {
        return this.dRe;
    }

    public int getCameraFacing() {
        return this.dRc;
    }

    private a() {
        this.dRa = new Object();
        this.dRc = 0;
        this.dRf = 30.0f;
        this.dRg = 1024;
        this.dRh = 768;
        this.dRi = null;
        this.dRj = null;
        this.dRm = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    private Camera aTg() {
        int gY = gY(this.dRc);
        if (gY != -1) {
            Camera open = Camera.open(gY);
            d a = a(open, this.dRg, this.dRh);
            if (a != null) {
                Size aTj = a.aTj();
                this.dRe = a.aTi();
                int[] a2 = a(open, this.dRf);
                if (a2 != null) {
                    Parameters parameters = open.getParameters();
                    if (aTj != null) {
                        parameters.setPictureSize(aTj.getWidth(), aTj.getHeight());
                    }
                    parameters.setPreviewSize(this.dRe.getWidth(), this.dRe.getHeight());
                    parameters.setPreviewFpsRange(a2[0], a2[1]);
                    parameters.setPreviewFormat(17);
                    a(open, parameters, gY);
                    if (this.dRi != null && parameters.getSupportedFocusModes().contains(this.dRi)) {
                        parameters.setFocusMode(this.dRi);
                    }
                    this.dRi = parameters.getFocusMode();
                    if (!(this.dRj == null || parameters.getSupportedFlashModes() == null || !parameters.getSupportedFlashModes().contains(this.dRj))) {
                        parameters.setFlashMode(this.dRj);
                    }
                    this.dRj = parameters.getFlashMode();
                    open.setParameters(parameters);
                    open.setPreviewCallbackWithBuffer(new b());
                    open.addCallbackBuffer(a(this.dRe));
                    open.addCallbackBuffer(a(this.dRe));
                    open.addCallbackBuffer(a(this.dRe));
                    open.addCallbackBuffer(a(this.dRe));
                    return open;
                }
                throw new RuntimeException("Could not find suitable preview frames per second range.");
            }
            throw new RuntimeException("Could not find suitable preview size.");
        }
        throw new RuntimeException("Could not find requested camera.");
    }

    private static int gY(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    private static d a(Camera camera, int i, int i2) {
        d dVar = null;
        int i3 = Integer.MAX_VALUE;
        for (d dVar2 : a(camera)) {
            Size aTi = dVar2.aTi();
            int abs = Math.abs(aTi.getWidth() - i) + Math.abs(aTi.getHeight() - i2);
            if (abs < i3) {
                dVar = dVar2;
                i3 = abs;
            }
        }
        return dVar;
    }

    private static List<d> a(Camera camera) {
        Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = ((float) size.width) / ((float) size.height);
            for (Camera.Size size2 : supportedPictureSizes) {
                if (Math.abs(f - (((float) size2.width) / ((float) size2.height))) < 0.01f) {
                    arrayList.add(new d(size, size2));
                    break;
                }
            }
        }
        if (arrayList.size() == 0) {
            for (Camera.Size dVar : supportedPreviewSizes) {
                arrayList.add(new d(dVar, null));
            }
        }
        return arrayList;
    }

    private int[] a(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (abs < i2) {
                iArr = iArr2;
                i2 = abs;
            }
        }
        return iArr;
    }

    private void a(Camera camera, Parameters parameters, int i) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i = (cameraInfo.orientation + i2) % 360;
            rotation = (360 - i) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
            rotation = i;
        }
        this.dRd = i / 90;
        camera.setDisplayOrientation(rotation);
        parameters.setRotation(i);
    }

    private byte[] a(Size size) {
        double height = (double) ((long) ((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(height);
        byte[] bArr = new byte[(((int) Math.ceil(height / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray() && wrap.array() == bArr) {
            this.dRm.put(bArr, wrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }
}
