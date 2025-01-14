package androidx.databinding.adapters;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray();

    public static <T> T trackListener(View view, T t, int i) {
        if (VERSION.SDK_INT >= 14) {
            Object tag = view.getTag(i);
            view.setTag(i, t);
            return tag;
        }
        synchronized (sListeners) {
            WeakReference weakReference;
            WeakHashMap weakHashMap = (WeakHashMap) sListeners.get(i);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                sListeners.put(i, weakHashMap);
            }
            if (t == null) {
                weakReference = (WeakReference) weakHashMap.remove(view);
            } else {
                weakReference = (WeakReference) weakHashMap.put(view, new WeakReference(t));
            }
            if (weakReference == null) {
                return null;
            }
            Object obj = weakReference.get();
            return obj;
        }
    }

    public static <T> T getListener(View view, int i) {
        if (VERSION.SDK_INT >= 14) {
            return view.getTag(i);
        }
        synchronized (sListeners) {
            WeakHashMap weakHashMap = (WeakHashMap) sListeners.get(i);
            if (weakHashMap == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) weakHashMap.get(view);
            if (weakReference == null) {
                return null;
            }
            Object obj = weakReference.get();
            return obj;
        }
    }
}
