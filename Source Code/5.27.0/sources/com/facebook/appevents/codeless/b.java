package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.d;
import com.facebook.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CodelessMatcher */
public class b {
    private static final String TAG = "com.facebook.appevents.codeless.b";
    private final Handler vU = new Handler(Looper.getMainLooper());
    private Set<Activity> vV = new HashSet();
    private Set<b> vW = new HashSet();
    private HashMap<String, String> vX = new HashMap();

    /* compiled from: CodelessMatcher */
    public static class a {
        private WeakReference<View> vZ;
        private String wa;

        public a(View view, String str) {
            this.vZ = new WeakReference(view);
            this.wa = str;
        }

        @Nullable
        public View getView() {
            WeakReference weakReference = this.vZ;
            return weakReference == null ? null : (View) weakReference.get();
        }

        public String iD() {
            return this.wa;
        }
    }

    /* compiled from: CodelessMatcher */
    protected static class b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {
        private final Handler handler;
        private WeakReference<View> vM;
        private HashMap<String, String> vX;
        @Nullable
        private List<EventBinding> wb;
        private final String wc;

        public b(View view, Handler handler, HashMap<String, String> hashMap, String str) {
            this.vM = new WeakReference(view);
            this.handler = handler;
            this.vX = hashMap;
            this.wc = str;
            this.handler.postDelayed(this, 200);
        }

        public void run() {
            j bg = FetchedAppSettingsManager.bg(f.go());
            if (bg != null && bg.jR()) {
                this.wb = EventBinding.c(bg.jS());
                if (this.wb != null) {
                    View view = (View) this.vM.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        iE();
                    }
                }
            }
        }

        public void onGlobalLayout() {
            iE();
        }

        public void onScrollChanged() {
            iE();
        }

        private void iE() {
            if (this.wb != null && this.vM.get() != null) {
                for (int i = 0; i < this.wb.size(); i++) {
                    a((EventBinding) this.wb.get(i), (View) this.vM.get());
                }
            }
        }

        public void a(EventBinding eventBinding, View view) {
            if (eventBinding != null && view != null && (TextUtils.isEmpty(eventBinding.iM()) || eventBinding.iM().equals(this.wc))) {
                List iJ = eventBinding.iJ();
                if (iJ.size() <= 25) {
                    for (a a : a(eventBinding, view, iJ, 0, -1, this.wc)) {
                        a(a, view, eventBinding);
                    }
                }
            }
        }

        public static List<a> a(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str = ".";
            stringBuilder.append(str);
            stringBuilder.append(String.valueOf(i2));
            String stringBuilder2 = stringBuilder.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            List a;
            int i3;
            if (i >= list.size()) {
                arrayList.add(new a(view, stringBuilder2));
            } else {
                PathComponent pathComponent = (PathComponent) list.get(i);
                if (pathComponent.className.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        a = a((ViewGroup) parent);
                        i2 = a.size();
                        for (i3 = 0; i3 < i2; i3++) {
                            arrayList.addAll(a(eventBinding, (View) a.get(i3), list, i + 1, i3, stringBuilder2));
                        }
                    }
                    return arrayList;
                } else if (pathComponent.className.equals(str)) {
                    arrayList.add(new a(view, stringBuilder2));
                    return arrayList;
                } else if (!a(view, pathComponent, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new a(view, stringBuilder2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                a = a((ViewGroup) view);
                i2 = a.size();
                for (i3 = 0; i3 < i2; i3++) {
                    arrayList.addAll(a(eventBinding, (View) a.get(i3), list, i + 1, i3, stringBuilder2));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Missing block: B:12:0x0041, code skipped:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0043;
     */
        private static boolean a(android.view.View r5, com.facebook.appevents.codeless.internal.PathComponent r6, int r7) {
            /*
            r0 = r6.index;
            r1 = 0;
            r2 = -1;
            if (r0 == r2) goto L_0x000b;
        L_0x0006:
            r0 = r6.index;
            if (r7 == r0) goto L_0x000b;
        L_0x000a:
            return r1;
        L_0x000b:
            r7 = r5.getClass();
            r7 = r7.getCanonicalName();
            r0 = r6.className;
            r7 = r7.equals(r0);
            r0 = 1;
            if (r7 != 0) goto L_0x0044;
        L_0x001c:
            r7 = r6.className;
            r2 = ".*android\\..*";
            r7 = r7.matches(r2);
            if (r7 == 0) goto L_0x0043;
        L_0x0026:
            r7 = r6.className;
            r2 = "\\.";
            r7 = r7.split(r2);
            r2 = r7.length;
            if (r2 <= 0) goto L_0x0043;
        L_0x0031:
            r2 = r7.length;
            r2 = r2 - r0;
            r7 = r7[r2];
            r2 = r5.getClass();
            r2 = r2.getSimpleName();
            r7 = r2.equals(r7);
            if (r7 != 0) goto L_0x0044;
        L_0x0043:
            return r1;
        L_0x0044:
            r7 = r6.ww;
            r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID;
            r2 = r2.getValue();
            r7 = r7 & r2;
            if (r7 <= 0) goto L_0x0058;
        L_0x004f:
            r7 = r6.id;
            r2 = r5.getId();
            if (r7 == r2) goto L_0x0058;
        L_0x0057:
            return r1;
        L_0x0058:
            r7 = r6.ww;
            r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT;
            r2 = r2.getValue();
            r7 = r7 & r2;
            r2 = "";
            if (r7 <= 0) goto L_0x0080;
        L_0x0065:
            r7 = r6.text;
            r3 = com.facebook.appevents.codeless.internal.d.k(r5);
            r4 = com.facebook.internal.z.bp(r3);
            r4 = com.facebook.internal.z.E(r4, r2);
            r3 = r7.equals(r3);
            if (r3 != 0) goto L_0x0080;
        L_0x0079:
            r7 = r7.equals(r4);
            if (r7 != 0) goto L_0x0080;
        L_0x007f:
            return r1;
        L_0x0080:
            r7 = r6.ww;
            r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION;
            r3 = r3.getValue();
            r7 = r7 & r3;
            if (r7 <= 0) goto L_0x00b2;
        L_0x008b:
            r7 = r6.description;
            r3 = r5.getContentDescription();
            if (r3 != 0) goto L_0x0095;
        L_0x0093:
            r3 = r2;
            goto L_0x009d;
        L_0x0095:
            r3 = r5.getContentDescription();
            r3 = java.lang.String.valueOf(r3);
        L_0x009d:
            r4 = com.facebook.internal.z.bp(r3);
            r4 = com.facebook.internal.z.E(r4, r2);
            r3 = r7.equals(r3);
            if (r3 != 0) goto L_0x00b2;
        L_0x00ab:
            r7 = r7.equals(r4);
            if (r7 != 0) goto L_0x00b2;
        L_0x00b1:
            return r1;
        L_0x00b2:
            r7 = r6.ww;
            r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT;
            r3 = r3.getValue();
            r7 = r7 & r3;
            if (r7 <= 0) goto L_0x00d8;
        L_0x00bd:
            r7 = r6.wv;
            r3 = com.facebook.appevents.codeless.internal.d.l(r5);
            r4 = com.facebook.internal.z.bp(r3);
            r4 = com.facebook.internal.z.E(r4, r2);
            r3 = r7.equals(r3);
            if (r3 != 0) goto L_0x00d8;
        L_0x00d1:
            r7 = r7.equals(r4);
            if (r7 != 0) goto L_0x00d8;
        L_0x00d7:
            return r1;
        L_0x00d8:
            r7 = r6.ww;
            r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG;
            r3 = r3.getValue();
            r7 = r7 & r3;
            if (r7 <= 0) goto L_0x010a;
        L_0x00e3:
            r6 = r6.tag;
            r7 = r5.getTag();
            if (r7 != 0) goto L_0x00ed;
        L_0x00eb:
            r5 = r2;
            goto L_0x00f5;
        L_0x00ed:
            r5 = r5.getTag();
            r5 = java.lang.String.valueOf(r5);
        L_0x00f5:
            r7 = com.facebook.internal.z.bp(r5);
            r7 = com.facebook.internal.z.E(r7, r2);
            r5 = r6.equals(r5);
            if (r5 != 0) goto L_0x010a;
        L_0x0103:
            r5 = r6.equals(r7);
            if (r5 != 0) goto L_0x010a;
        L_0x0109:
            return r1;
        L_0x010a:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.b$b.a(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
        }

        private static List<View> a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        private void a(a aVar, View view, EventBinding eventBinding) {
            if (eventBinding != null) {
                try {
                    View view2 = aVar.getView();
                    if (view2 != null) {
                        View q = d.q(view2);
                        if (q != null && d.a(view2, q)) {
                            a(aVar, view, q, eventBinding);
                        } else if (!view2.getClass().getName().startsWith("com.facebook.react")) {
                            String iD = aVar.iD();
                            AccessibilityDelegate n = d.n(view2);
                            Object obj = 1;
                            Object obj2 = n != null ? 1 : null;
                            Object obj3 = (obj2 == null || !(n instanceof com.facebook.appevents.codeless.a.a)) ? null : 1;
                            if (obj3 == null || !((com.facebook.appevents.codeless.a.a) n).iB()) {
                                obj = null;
                            }
                            if (!this.vX.containsKey(iD) && (obj2 == null || obj3 == null || obj == null)) {
                                view2.setAccessibilityDelegate(a.a(eventBinding, view, view2));
                                this.vX.put(iD, eventBinding.getEventName());
                            }
                        }
                    }
                } catch (FacebookException e) {
                    Log.e(b.TAG, "Failed to attach auto logging event listener.", e);
                }
            }
        }

        private void a(a aVar, View view, View view2, EventBinding eventBinding) {
            if (eventBinding != null) {
                View view3 = aVar.getView();
                if (view3 != null && d.a(view3, view2)) {
                    String iD = aVar.iD();
                    OnTouchListener o = d.o(view3);
                    Object obj = 1;
                    Object obj2 = o != null ? 1 : null;
                    Object obj3 = (obj2 == null || !(o instanceof com.facebook.appevents.codeless.c.a)) ? null : 1;
                    if (obj3 == null || !((com.facebook.appevents.codeless.c.a) o).iB()) {
                        obj = null;
                    }
                    if (!this.vX.containsKey(iD) && (obj2 == null || obj3 == null || obj == null)) {
                        view3.setOnTouchListener(c.c(eventBinding, view, view3));
                        this.vX.put(iD, eventBinding.getEventName());
                    }
                }
            }
        }
    }

    public void add(Activity activity) {
        if (!q.ks()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.vV.add(activity);
                this.vX.clear();
                startTracking();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        }
    }

    public void d(Activity activity) {
        if (!q.ks()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.vV.remove(activity);
                this.vW.clear();
                this.vX.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        }
    }

    public static Bundle b(EventBinding eventBinding, View view, View view2) {
        Bundle bundle = new Bundle();
        if (eventBinding == null) {
            return bundle;
        }
        List<com.facebook.appevents.codeless.internal.a> iK = eventBinding.iK();
        if (iK != null) {
            for (com.facebook.appevents.codeless.internal.a aVar : iK) {
                if (aVar.value != null && aVar.value.length() > 0) {
                    bundle.putString(aVar.name, aVar.value);
                } else if (aVar.wr.size() > 0) {
                    List a;
                    if (aVar.wu.equals("relative")) {
                        a = b.a(eventBinding, view2, aVar.wr, 0, -1, view2.getClass().getSimpleName());
                    } else {
                        a = b.a(eventBinding, view, aVar.wr, 0, -1, view.getClass().getSimpleName());
                    }
                    for (a aVar2 : a) {
                        if (aVar2.getView() != null) {
                            String k = d.k(aVar2.getView());
                            if (k.length() > 0) {
                                bundle.putString(aVar.name, k);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    private void startTracking() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            iC();
        } else {
            this.vU.post(new Runnable() {
                public void run() {
                    b.this.iC();
                }
            });
        }
    }

    private void iC() {
        for (Activity activity : this.vV) {
            this.vW.add(new b(activity.getWindow().getDecorView().getRootView(), this.vU, this.vX, activity.getClass().getSimpleName()));
        }
    }
}
