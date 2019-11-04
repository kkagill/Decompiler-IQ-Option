package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.Detector.Processor;
import java.util.HashSet;

public class MultiProcessor<T> implements Processor<T> {
    private int zzal;
    private Factory<T> zzaz;
    private SparseArray<zza> zzba;

    public static class Builder<T> {
        private MultiProcessor<T> zzbb = new MultiProcessor();

        public Builder(Factory<T> factory) {
            if (factory != null) {
                this.zzbb.zzaz = factory;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        public Builder<T> setMaxGapFrames(int i) {
            if (i >= 0) {
                this.zzbb.zzal = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("Invalid max gap: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public MultiProcessor<T> build() {
            return this.zzbb;
        }
    }

    public interface Factory<T> {
        Tracker<T> create(T t);
    }

    class zza {
        private Tracker<T> zzak;
        private int zzao;

        private zza(MultiProcessor multiProcessor) {
            this.zzao = 0;
        }
    }

    public void release() {
        for (int i = 0; i < this.zzba.size(); i++) {
            ((zza) this.zzba.valueAt(i)).zzak.onDone();
        }
        this.zzba.clear();
    }

    public void receiveDetections(Detections<T> detections) {
        int i;
        int keyAt;
        Object valueAt;
        zza zza;
        SparseArray detectedItems = detections.getDetectedItems();
        for (i = 0; i < detectedItems.size(); i++) {
            keyAt = detectedItems.keyAt(i);
            valueAt = detectedItems.valueAt(i);
            if (this.zzba.get(keyAt) == null) {
                zza = new zza();
                zza.zzak = this.zzaz.create(valueAt);
                zza.zzak.onNewItem(keyAt, valueAt);
                this.zzba.append(keyAt, zza);
            }
        }
        detectedItems = detections.getDetectedItems();
        HashSet<Integer> hashSet = new HashSet();
        for (keyAt = 0; keyAt < this.zzba.size(); keyAt++) {
            int keyAt2 = this.zzba.keyAt(keyAt);
            if (detectedItems.get(keyAt2) == null) {
                zza = (zza) this.zzba.valueAt(keyAt);
                zza.zzao = zza.zzao + 1;
                if (zza.zzao >= this.zzal) {
                    zza.zzak.onDone();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    zza.zzak.onMissing(detections);
                }
            }
        }
        for (Integer intValue : hashSet) {
            this.zzba.delete(intValue.intValue());
        }
        detectedItems = detections.getDetectedItems();
        for (i = 0; i < detectedItems.size(); i++) {
            keyAt = detectedItems.keyAt(i);
            valueAt = detectedItems.valueAt(i);
            zza zza2 = (zza) this.zzba.get(keyAt);
            zza2.zzao = 0;
            zza2.zzak.onUpdate(detections, valueAt);
        }
    }

    private MultiProcessor() {
        this.zzba = new SparseArray();
        this.zzal = 3;
    }
}
