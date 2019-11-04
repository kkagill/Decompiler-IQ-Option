package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CameraSource {
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;
    private int facing;
    private int rotation;
    private Context zze;
    private final Object zzf;
    private Camera zzg;
    private Size zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private SurfaceTexture zzm;
    private boolean zzn;
    private Thread zzo;
    private zzb zzp;
    private Map<byte[], ByteBuffer> zzq;

    public static class Builder {
        private final Detector<?> zzr;
        private CameraSource zzs = new CameraSource();

        public Builder(Context context, Detector<?> detector) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (detector != null) {
                this.zzr = detector;
                this.zzs.zze = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                this.zzs.zzi = f;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("Invalid fps: ");
            stringBuilder.append(f);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Invalid preview size: ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.zzs.zzj = i;
            this.zzs.zzk = i2;
            return this;
        }

        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.zzs.facing = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("Invalid camera: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setAutoFocusEnabled(boolean z) {
            this.zzs.zzl = z;
            return this;
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzs;
            cameraSource.getClass();
            cameraSource.zzp = new zzb(this.zzr);
            return this.zzs;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    class zza implements PreviewCallback {
        private zza() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzp.zza(bArr, camera);
        }

        /* synthetic */ zza(CameraSource cameraSource, zza zza) {
            this();
        }
    }

    class zzb implements Runnable {
        private final Object lock = new Object();
        private Detector<?> zzr;
        private long zzu = SystemClock.elapsedRealtime();
        private boolean zzv = true;
        private long zzw;
        private int zzx = 0;
        private ByteBuffer zzy;

        zzb(Detector<?> detector) {
            this.zzr = detector;
        }

        /* Access modifiers changed, original: final */
        @SuppressLint({"Assert"})
        public final void release() {
            this.zzr.release();
            this.zzr = null;
        }

        /* Access modifiers changed, original: final */
        public final void setActive(boolean z) {
            synchronized (this.lock) {
                this.zzv = z;
                this.lock.notifyAll();
            }
        }

        /* Access modifiers changed, original: final */
        public final void zza(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                if (this.zzy != null) {
                    camera.addCallbackBuffer(this.zzy.array());
                    this.zzy = null;
                }
                if (CameraSource.this.zzq.containsKey(bArr)) {
                    this.zzw = SystemClock.elapsedRealtime() - this.zzu;
                    this.zzx++;
                    this.zzy = (ByteBuffer) CameraSource.this.zzq.get(bArr);
                    this.lock.notifyAll();
                    return;
                }
                Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
            }
        }

        /* JADX WARNING: Missing block: B:21:?, code skipped:
            r6.zzr.receiveFrame(r1);
     */
        /* JADX WARNING: Missing block: B:23:0x0077, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:25:?, code skipped:
            android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
     */
        /* JADX WARNING: Missing block: B:26:0x008e, code skipped:
            com.google.android.gms.vision.CameraSource.zzb(r6.zzt).addCallbackBuffer(r2.array());
     */
        @android.annotation.SuppressLint({"InlinedApi"})
        public final void run() {
            /*
            r6 = this;
        L_0x0000:
            r0 = r6.lock;
            monitor-enter(r0);
        L_0x0003:
            r1 = r6.zzv;	 Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x001b;
        L_0x0007:
            r1 = r6.zzy;	 Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x001b;
        L_0x000b:
            r1 = r6.lock;	 Catch:{ InterruptedException -> 0x0011 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0003;
        L_0x0011:
            r1 = move-exception;
            r2 = "CameraSource";
            r3 = "Frame processing loop terminated.";
            android.util.Log.d(r2, r3, r1);	 Catch:{ all -> 0x009c }
            monitor-exit(r0);	 Catch:{ all -> 0x009c }
            return;
        L_0x001b:
            r1 = r6.zzv;	 Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x0021;
        L_0x001f:
            monitor-exit(r0);	 Catch:{ all -> 0x009c }
            return;
        L_0x0021:
            r1 = new com.google.android.gms.vision.Frame$Builder;	 Catch:{ all -> 0x009c }
            r1.<init>();	 Catch:{ all -> 0x009c }
            r2 = r6.zzy;	 Catch:{ all -> 0x009c }
            r3 = com.google.android.gms.vision.CameraSource.this;	 Catch:{ all -> 0x009c }
            r3 = r3.zzh;	 Catch:{ all -> 0x009c }
            r3 = r3.getWidth();	 Catch:{ all -> 0x009c }
            r4 = com.google.android.gms.vision.CameraSource.this;	 Catch:{ all -> 0x009c }
            r4 = r4.zzh;	 Catch:{ all -> 0x009c }
            r4 = r4.getHeight();	 Catch:{ all -> 0x009c }
            r5 = 17;
            r1 = r1.setImageData(r2, r3, r4, r5);	 Catch:{ all -> 0x009c }
            r2 = r6.zzx;	 Catch:{ all -> 0x009c }
            r1 = r1.setId(r2);	 Catch:{ all -> 0x009c }
            r2 = r6.zzw;	 Catch:{ all -> 0x009c }
            r1 = r1.setTimestampMillis(r2);	 Catch:{ all -> 0x009c }
            r2 = com.google.android.gms.vision.CameraSource.this;	 Catch:{ all -> 0x009c }
            r2 = r2.rotation;	 Catch:{ all -> 0x009c }
            r1 = r1.setRotation(r2);	 Catch:{ all -> 0x009c }
            r1 = r1.build();	 Catch:{ all -> 0x009c }
            r2 = r6.zzy;	 Catch:{ all -> 0x009c }
            r3 = 0;
            r6.zzy = r3;	 Catch:{ all -> 0x009c }
            monitor-exit(r0);	 Catch:{ all -> 0x009c }
            r0 = r6.zzr;	 Catch:{ Exception -> 0x0077 }
            r0.receiveFrame(r1);	 Catch:{ Exception -> 0x0077 }
            r0 = com.google.android.gms.vision.CameraSource.this;
            r0 = r0.zzg;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x0075:
            r0 = move-exception;
            goto L_0x008e;
        L_0x0077:
            r0 = move-exception;
            r1 = "CameraSource";
            r3 = "Exception thrown from receiver.";
            android.util.Log.e(r1, r3, r0);	 Catch:{ all -> 0x0075 }
            r0 = com.google.android.gms.vision.CameraSource.this;
            r0 = r0.zzg;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x008e:
            r1 = com.google.android.gms.vision.CameraSource.this;
            r1 = r1.zzg;
            r2 = r2.array();
            r1.addCallbackBuffer(r2);
            throw r0;
        L_0x009c:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x009c }
            goto L_0x00a0;
        L_0x009f:
            throw r1;
        L_0x00a0:
            goto L_0x009f;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource$zzb.run():void");
        }
    }

    class zzc implements android.hardware.Camera.PictureCallback {
        private PictureCallback zzz;

        private zzc() {
        }

        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zzz;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzf) {
                if (CameraSource.this.zzg != null) {
                    CameraSource.this.zzg.startPreview();
                }
            }
        }

        /* synthetic */ zzc(CameraSource cameraSource, zza zza) {
            this();
        }
    }

    static class zzd implements android.hardware.Camera.ShutterCallback {
        private ShutterCallback zzaa;

        private zzd() {
        }

        public final void onShutter() {
            ShutterCallback shutterCallback = this.zzaa;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }

        /* synthetic */ zzd(zza zza) {
            this();
        }
    }

    @VisibleForTesting
    static class zze {
        private Size zzab;
        private Size zzac;

        public zze(Camera.Size size, Camera.Size size2) {
            this.zzab = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzac = new Size(size2.width, size2.height);
            }
        }

        public final Size zzb() {
            return this.zzab;
        }

        public final Size zzc() {
            return this.zzac;
        }
    }

    public void release() {
        synchronized (this.zzf) {
            stop();
            this.zzp.release();
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            this.zzm = new SurfaceTexture(100);
            this.zzg.setPreviewTexture(this.zzm);
            this.zzn = true;
            this.zzg.startPreview();
            this.zzo = new Thread(this.zzp);
            this.zzo.setName("gms.vision.CameraSource");
            this.zzp.setActive(true);
            this.zzo.start();
            return this;
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(SurfaceHolder surfaceHolder) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            this.zzg.setPreviewDisplay(surfaceHolder);
            this.zzg.startPreview();
            this.zzo = new Thread(this.zzp);
            this.zzp.setActive(true);
            this.zzo.start();
            this.zzn = false;
            return this;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0014 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    public void stop() {
        /*
        r6 = this;
        r0 = r6.zzf;
        monitor-enter(r0);
        r1 = r6.zzp;	 Catch:{ all -> 0x006e }
        r2 = 0;
        r1.setActive(r2);	 Catch:{ all -> 0x006e }
        r1 = r6.zzo;	 Catch:{ all -> 0x006e }
        r2 = 0;
        if (r1 == 0) goto L_0x001d;
    L_0x000e:
        r1 = r6.zzo;	 Catch:{ InterruptedException -> 0x0014 }
        r1.join();	 Catch:{ InterruptedException -> 0x0014 }
        goto L_0x001b;
    L_0x0014:
        r1 = "CameraSource";
        r3 = "Frame processing thread interrupted on release.";
        android.util.Log.d(r1, r3);	 Catch:{ all -> 0x006e }
    L_0x001b:
        r6.zzo = r2;	 Catch:{ all -> 0x006e }
    L_0x001d:
        r1 = r6.zzg;	 Catch:{ all -> 0x006e }
        if (r1 == 0) goto L_0x0067;
    L_0x0021:
        r1 = r6.zzg;	 Catch:{ all -> 0x006e }
        r1.stopPreview();	 Catch:{ all -> 0x006e }
        r1 = r6.zzg;	 Catch:{ all -> 0x006e }
        r1.setPreviewCallbackWithBuffer(r2);	 Catch:{ all -> 0x006e }
        r1 = r6.zzn;	 Catch:{ Exception -> 0x003b }
        if (r1 == 0) goto L_0x0035;
    L_0x002f:
        r1 = r6.zzg;	 Catch:{ Exception -> 0x003b }
        r1.setPreviewTexture(r2);	 Catch:{ Exception -> 0x003b }
        goto L_0x0060;
    L_0x0035:
        r1 = r6.zzg;	 Catch:{ Exception -> 0x003b }
        r1.setPreviewDisplay(r2);	 Catch:{ Exception -> 0x003b }
        goto L_0x0060;
    L_0x003b:
        r1 = move-exception;
        r3 = "CameraSource";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x006e }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x006e }
        r4 = r4.length();	 Catch:{ all -> 0x006e }
        r4 = r4 + 32;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006e }
        r5.<init>(r4);	 Catch:{ all -> 0x006e }
        r4 = "Failed to clear camera preview: ";
        r5.append(r4);	 Catch:{ all -> 0x006e }
        r5.append(r1);	 Catch:{ all -> 0x006e }
        r1 = r5.toString();	 Catch:{ all -> 0x006e }
        android.util.Log.e(r3, r1);	 Catch:{ all -> 0x006e }
    L_0x0060:
        r1 = r6.zzg;	 Catch:{ all -> 0x006e }
        r1.release();	 Catch:{ all -> 0x006e }
        r6.zzg = r2;	 Catch:{ all -> 0x006e }
    L_0x0067:
        r1 = r6.zzq;	 Catch:{ all -> 0x006e }
        r1.clear();	 Catch:{ all -> 0x006e }
        monitor-exit(r0);	 Catch:{ all -> 0x006e }
        return;
    L_0x006e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.stop():void");
    }

    public Size getPreviewSize() {
        return this.zzh;
    }

    public int getCameraFacing() {
        return this.facing;
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                zzd zzd = new zzd();
                zzd.zzaa = shutterCallback;
                zzc zzc = new zzc(this, null);
                zzc.zzz = pictureCallback;
                this.zzg.takePicture(zzd, null, null, zzc);
            }
        }
    }

    private CameraSource() {
        this.zzf = new Object();
        this.facing = 0;
        this.zzi = 30.0f;
        this.zzj = 1024;
        this.zzk = 768;
        this.zzl = false;
        this.zzq = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    private final Camera zza() {
        int i = this.facing;
        CameraInfo cameraInfo = new CameraInfo();
        int i2 = 0;
        int i3 = 0;
        while (i3 < Camera.getNumberOfCameras()) {
            Camera.getCameraInfo(i3, cameraInfo);
            if (cameraInfo.facing == i) {
                break;
            }
            i3++;
        }
        i3 = -1;
        if (i3 != -1) {
            Camera open = Camera.open(i3);
            int i4 = this.zzj;
            int i5 = this.zzk;
            Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                float f = ((float) size.width) / ((float) size.height);
                for (Camera.Size size2 : supportedPictureSizes) {
                    if (Math.abs(f - (((float) size2.width) / ((float) size2.height))) < 0.01f) {
                        arrayList.add(new zze(size, size2));
                        break;
                    }
                }
            }
            String str = "CameraSource";
            if (arrayList.size() == 0) {
                Log.w(str, "No preview sizes have a corresponding same-aspect-ratio picture size");
                for (Camera.Size zze : supportedPreviewSizes) {
                    arrayList.add(new zze(zze, null));
                }
            }
            arrayList = arrayList;
            int size3 = arrayList.size();
            zze zze2 = null;
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            while (i6 < size3) {
                Object obj = arrayList.get(i6);
                i6++;
                zze zze3 = (zze) obj;
                Size zzb = zze3.zzb();
                int abs = Math.abs(zzb.getWidth() - i4) + Math.abs(zzb.getHeight() - i5);
                if (abs < i7) {
                    zze2 = zze3;
                    i7 = abs;
                }
            }
            if (zze2 != null) {
                Size zzc = zze2.zzc();
                this.zzh = zze2.zzb();
                i5 = (int) (this.zzi * 1000.0f);
                int[] iArr = null;
                int i8 = Integer.MAX_VALUE;
                for (int[] iArr2 : open.getParameters().getSupportedPreviewFpsRange()) {
                    i7 = Math.abs(i5 - iArr2[0]) + Math.abs(i5 - iArr2[1]);
                    if (i7 < i8) {
                        iArr = iArr2;
                        i8 = i7;
                    }
                }
                if (iArr != null) {
                    Parameters parameters2 = open.getParameters();
                    if (zzc != null) {
                        parameters2.setPictureSize(zzc.getWidth(), zzc.getHeight());
                    }
                    parameters2.setPreviewSize(this.zzh.getWidth(), this.zzh.getHeight());
                    parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                    parameters2.setPreviewFormat(17);
                    i4 = ((WindowManager) this.zze.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (i4 != 0) {
                        if (i4 == 1) {
                            i2 = 90;
                        } else if (i4 == 2) {
                            i2 = 180;
                        } else if (i4 != 3) {
                            StringBuilder stringBuilder = new StringBuilder(31);
                            stringBuilder.append("Bad rotation value: ");
                            stringBuilder.append(i4);
                            Log.e(str, stringBuilder.toString());
                        } else {
                            i2 = 270;
                        }
                    }
                    cameraInfo = new CameraInfo();
                    Camera.getCameraInfo(i3, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        i4 = (cameraInfo.orientation + i2) % 360;
                        i2 = (360 - i4) % 360;
                    } else {
                        i4 = ((cameraInfo.orientation - i2) + 360) % 360;
                        i2 = i4;
                    }
                    this.rotation = i4 / 90;
                    open.setDisplayOrientation(i2);
                    parameters2.setRotation(i4);
                    if (this.zzl) {
                        String str2 = "continuous-video";
                        if (parameters2.getSupportedFocusModes().contains(str2)) {
                            parameters2.setFocusMode(str2);
                        } else {
                            Log.i(str, "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new zza(this, null));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] zza(Size size) {
        double height = (double) ((long) ((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(height);
        byte[] bArr = new byte[(((int) Math.ceil(height / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray() && wrap.array() == bArr) {
            this.zzq.put(bArr, wrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    /* synthetic */ CameraSource(zza zza) {
        this();
    }
}
