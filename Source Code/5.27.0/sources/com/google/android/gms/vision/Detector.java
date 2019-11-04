package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Frame.Metadata;

public abstract class Detector<T> {
    private final Object zzad = new Object();
    private Processor<T> zzae;

    public static class Detections<T> {
        private final SparseArray<T> zzaf;
        private final Metadata zzag;
        private final boolean zzah;

        public Detections(SparseArray<T> sparseArray, Metadata metadata, boolean z) {
            this.zzaf = sparseArray;
            this.zzag = metadata;
            this.zzah = z;
        }

        public SparseArray<T> getDetectedItems() {
            return this.zzaf;
        }

        public Metadata getFrameMetadata() {
            return this.zzag;
        }

        public boolean detectorIsOperational() {
            return this.zzah;
        }
    }

    public interface Processor<T> {
        void receiveDetections(Detections<T> detections);

        void release();
    }

    public abstract SparseArray<T> detect(Frame frame);

    public boolean isOperational() {
        return true;
    }

    public boolean setFocus(int i) {
        return true;
    }

    public void release() {
        synchronized (this.zzad) {
            if (this.zzae != null) {
                this.zzae.release();
                this.zzae = null;
            }
        }
    }

    public void receiveFrame(Frame frame) {
        Metadata metadata = new Metadata(frame.getMetadata());
        metadata.zzd();
        Detections detections = new Detections(detect(frame), metadata, isOperational());
        synchronized (this.zzad) {
            if (this.zzae != null) {
                this.zzae.receiveDetections(detections);
            } else {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
        }
    }

    public void setProcessor(Processor<T> processor) {
        synchronized (this.zzad) {
            if (this.zzae != null) {
                this.zzae.release();
            }
            this.zzae = processor;
        }
    }
}
