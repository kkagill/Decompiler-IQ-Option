package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;

public final class FaceDetector extends Detector<Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final Object lock;
    private final zzc zzcj;
    private final com.google.android.gms.vision.face.internal.client.zzc zzck;
    private boolean zzcl;

    public static class Builder {
        private int landmarkType = 0;
        private int mode = 0;
        private float proportionalMinFaceSize = -1.0f;
        private boolean trackingEnabled = true;
        private boolean zzcm = false;
        private int zzcn = 0;
        private final Context zze;

        public Builder(Context context) {
            this.zze = context;
        }

        public Builder setLandmarkType(int i) {
            if (i == 0 || i == 1 || i == 2) {
                this.landmarkType = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(34);
            stringBuilder.append("Invalid landmark type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setProminentFaceOnly(boolean z) {
            this.zzcm = z;
            return this;
        }

        public Builder setClassificationType(int i) {
            if (i == 0 || i == 1) {
                this.zzcn = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Invalid classification type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setTrackingEnabled(boolean z) {
            this.trackingEnabled = z;
            return this;
        }

        public Builder setMode(int i) {
            if (i == 0 || i == 1 || i == 2) {
                this.mode = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(25);
            stringBuilder.append("Invalid mode: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setMinFaceSize(float f) {
            if (f < 0.0f || f > 1.0f) {
                StringBuilder stringBuilder = new StringBuilder(47);
                stringBuilder.append("Invalid proportional face size: ");
                stringBuilder.append(f);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.proportionalMinFaceSize = f;
            return this;
        }

        public FaceDetector build() {
            zze zze = new zze();
            zze.mode = this.mode;
            zze.landmarkType = this.landmarkType;
            zze.zzcn = this.zzcn;
            zze.zzcm = this.zzcm;
            zze.trackingEnabled = this.trackingEnabled;
            zze.proportionalMinFaceSize = this.proportionalMinFaceSize;
            if (FaceDetector.zza(zze)) {
                return new FaceDetector(new com.google.android.gms.vision.face.internal.client.zzc(this.zze, zze));
            }
            throw new IllegalArgumentException("Invalid build options");
        }
    }

    public final void release() {
        super.release();
        synchronized (this.lock) {
            if (this.zzcl) {
                this.zzck.zzp();
                this.zzcl = false;
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            synchronized (this.lock) {
                if (this.zzcl) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    release();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final SparseArray<Face> detect(Frame frame) {
        if (frame != null) {
            int height;
            int i;
            ByteBuffer allocateDirect;
            int i2;
            Face[] zzb;
            if (frame.getBitmap() != null) {
                Bitmap bitmap = frame.getBitmap();
                int width = bitmap.getWidth();
                height = bitmap.getHeight();
                i = width * height;
                allocateDirect = ByteBuffer.allocateDirect(((((width + 1) / 2) * ((height + 1) / 2)) << 1) + i);
                i2 = i;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 % width;
                    int i5 = i3 / width;
                    int pixel = bitmap.getPixel(i4, i5);
                    float red = (float) Color.red(pixel);
                    float green = (float) Color.green(pixel);
                    float blue = (float) Color.blue(pixel);
                    allocateDirect.put(i3, (byte) ((int) (((0.299f * red) + (0.587f * green)) + (0.114f * blue))));
                    if (i5 % 2 == 0 && i4 % 2 == 0) {
                        red = (((red * 0.5f) + (green * -0.419f)) + (blue * -0.081f)) + 128.0f;
                        i5 = i2 + 1;
                        allocateDirect.put(i2, (byte) ((int) ((((-0.169f * red) + (-0.331f * green)) + (blue * 0.5f)) + 128.0f)));
                        i2 = i5 + 1;
                        allocateDirect.put(i5, (byte) ((int) red));
                    }
                }
            } else {
                allocateDirect = frame.getGrayscaleImageData();
            }
            synchronized (this.lock) {
                if (this.zzcl) {
                    zzb = this.zzck.zzb(allocateDirect, zzn.zzc(frame));
                } else {
                    throw new RuntimeException("Cannot use detector after release()");
                }
            }
            HashSet hashSet = new HashSet();
            SparseArray sparseArray = new SparseArray(zzb.length);
            i = 0;
            for (Face face : zzb) {
                i2 = face.getId();
                i = Math.max(i, i2);
                if (hashSet.contains(Integer.valueOf(i2))) {
                    i2 = i + 1;
                    i = i2;
                }
                hashSet.add(Integer.valueOf(i2));
                sparseArray.append(this.zzcj.zzb(i2), face);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public final boolean setFocus(int i) {
        boolean zzd;
        i = this.zzcj.zzc(i);
        synchronized (this.lock) {
            if (this.zzcl) {
                zzd = this.zzck.zzd(i);
            } else {
                throw new RuntimeException("Cannot use detector after release()");
            }
        }
        return zzd;
    }

    public final boolean isOperational() {
        return this.zzck.isOperational();
    }

    private FaceDetector() {
        this.zzcj = new zzc();
        this.lock = new Object();
        this.zzcl = true;
        throw new IllegalStateException("Default constructor called");
    }

    private FaceDetector(com.google.android.gms.vision.face.internal.client.zzc zzc) {
        this.zzcj = new zzc();
        this.lock = new Object();
        this.zzcl = true;
        this.zzck = zzc;
    }

    private static boolean zza(zze zze) {
        boolean z;
        String str = "FaceDetector";
        if (zze.mode == 2 || zze.landmarkType != 2) {
            z = true;
        } else {
            Log.e(str, "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (zze.landmarkType != 2 || zze.zzcn != 1) {
            return z;
        }
        Log.e(str, "Classification is not supported with contour.");
        return false;
    }
}
