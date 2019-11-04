package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzag;
import com.google.android.gms.internal.vision.zzak;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.internal.vision.zzp;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame.Metadata;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class TextRecognizer extends Detector<TextBlock> {
    private final zzak zzez;

    public static class Builder {
        private Context zze;
        private zzal zzfa = new zzal();

        public Builder(Context context) {
            this.zze = context;
        }

        public TextRecognizer build() {
            return new TextRecognizer(new zzak(this.zze, this.zzfa));
        }
    }

    private TextRecognizer() {
        throw new IllegalStateException("Default constructor called");
    }

    private TextRecognizer(zzak zzak) {
        this.zzez = zzak;
    }

    public final SparseArray<TextBlock> detect(Frame frame) {
        zzag zzag = new zzag(new Rect());
        if (frame != null) {
            Bitmap bitmap;
            int i;
            zzn zzc = zzn.zzc(frame);
            int i2 = 0;
            if (frame.getBitmap() != null) {
                bitmap = frame.getBitmap();
            } else {
                byte[] array;
                Metadata metadata = frame.getMetadata();
                ByteBuffer grayscaleImageData = frame.getGrayscaleImageData();
                int format = metadata.getFormat();
                i = zzc.width;
                int i3 = zzc.height;
                if (grayscaleImageData.hasArray() && grayscaleImageData.arrayOffset() == 0) {
                    array = grayscaleImageData.array();
                } else {
                    byte[] bArr = new byte[grayscaleImageData.capacity()];
                    grayscaleImageData.get(bArr);
                    array = bArr;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(array, format, i, i3, null).compressToJpeg(new Rect(0, 0, i, i3), 100, byteArrayOutputStream);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                bitmap = BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length);
            }
            bitmap = zzp.zzb(bitmap, zzc);
            if (!zzag.zzfl.isEmpty()) {
                Rect rect;
                Rect rect2 = zzag.zzfl;
                int width = frame.getMetadata().getWidth();
                int height = frame.getMetadata().getHeight();
                int i4 = zzc.rotation;
                if (i4 == 1) {
                    rect = new Rect(height - rect2.bottom, rect2.left, height - rect2.top, rect2.right);
                } else if (i4 == 2) {
                    rect = new Rect(width - rect2.right, height - rect2.bottom, width - rect2.left, height - rect2.top);
                } else if (i4 != 3) {
                    rect = rect2;
                } else {
                    rect = new Rect(rect2.top, width - rect2.right, rect2.bottom, width - rect2.left);
                }
                zzag.zzfl.set(rect);
            }
            zzc.rotation = 0;
            zzae[] zza = this.zzez.zza(bitmap, zzc, zzag);
            SparseArray sparseArray = new SparseArray();
            for (zzae zzae : zza) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzae.zzfj);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzae.zzfj, sparseArray2);
                }
                sparseArray2.append(zzae.zzfk, zzae);
            }
            SparseArray sparseArray3 = new SparseArray(sparseArray.size());
            while (i2 < sparseArray.size()) {
                sparseArray3.append(sparseArray.keyAt(i2), new TextBlock((SparseArray) sparseArray.valueAt(i2)));
                i2++;
            }
            return sparseArray3;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public final boolean isOperational() {
        return this.zzez.isOperational();
    }

    public final void release() {
        super.release();
        this.zzez.zzp();
    }
}
