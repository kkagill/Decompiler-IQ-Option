package com.google.android.material.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import androidx.annotation.AnimatorRes;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec */
public class h {
    private final SimpleArrayMap<String, i> DX = new SimpleArrayMap();

    public boolean bI(String str) {
        return this.DX.get(str) != null;
    }

    public i bJ(String str) {
        if (bI(str)) {
            return (i) this.DX.get(str);
        }
        throw new IllegalArgumentException();
    }

    public void a(String str, @Nullable i iVar) {
        this.DX.put(str, iVar);
    }

    public long getTotalDuration() {
        int size = this.DX.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            i iVar = (i) this.DX.valueAt(i);
            j = Math.max(j, iVar.mv() + iVar.getDuration());
        }
        return j;
    }

    @Nullable
    public static h c(Context context, @AnimatorRes int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return h(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return h(arrayList);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            Log.w("MotionSpec", stringBuilder.toString(), e);
            return null;
        }
    }

    private static h h(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ValueAnimator valueAnimator = (ObjectAnimator) animator;
            hVar.a(valueAnimator.getPropertyName(), i.a(valueAnimator));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animator must be an ObjectAnimator: ");
        stringBuilder.append(animator);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.DX.equals(((h) obj).DX);
    }

    public int hashCode() {
        return this.DX.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.DX);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
