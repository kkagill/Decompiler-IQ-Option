package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector.Processor;
import java.util.ArrayList;
import java.util.List;

public class MultiDetector extends Detector<Object> {
    private List<Detector<? extends Object>> zzax;

    public static class Builder {
        private MultiDetector zzay = new MultiDetector();

        public Builder add(Detector<? extends Object> detector) {
            this.zzay.zzax.add(detector);
            return this;
        }

        public MultiDetector build() {
            if (this.zzay.zzax.size() != 0) {
                return this.zzay;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }

    public void release() {
        for (Detector release : this.zzax) {
            release.release();
        }
        this.zzax.clear();
    }

    public SparseArray<Object> detect(Frame frame) {
        SparseArray sparseArray = new SparseArray();
        for (Detector detect : this.zzax) {
            SparseArray detect2 = detect.detect(frame);
            int i = 0;
            while (i < detect2.size()) {
                int keyAt = detect2.keyAt(i);
                if (sparseArray.get(keyAt) == null) {
                    sparseArray.append(keyAt, detect2.valueAt(i));
                    i++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(104);
                    stringBuilder.append("Detection ID overlap for id = ");
                    stringBuilder.append(keyAt);
                    stringBuilder.append("  This means that one of the detectors is not using global IDs.");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        return sparseArray;
    }

    public void receiveFrame(Frame frame) {
        for (Detector receiveFrame : this.zzax) {
            receiveFrame.receiveFrame(frame);
        }
    }

    public void setProcessor(Processor<Object> processor) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }

    public boolean isOperational() {
        for (Detector isOperational : this.zzax) {
            if (!isOperational.isOperational()) {
                return false;
            }
        }
        return true;
    }

    private MultiDetector() {
        this.zzax = new ArrayList();
    }
}
