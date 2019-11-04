package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.EventBinding.ActionType;
import com.facebook.appevents.codeless.internal.d;
import com.facebook.appevents.internal.b;
import com.facebook.f;
import java.lang.ref.WeakReference;

/* compiled from: CodelessLoggingEventListener */
public class a {
    private static final String TAG = "com.facebook.appevents.codeless.a";

    /* compiled from: CodelessLoggingEventListener */
    /* renamed from: com.facebook.appevents.codeless.a$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] vJ = new int[ActionType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.values();
            r0 = r0.length;
            r0 = new int[r0];
            vJ = r0;
            r0 = vJ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.CLICK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = vJ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.SELECTED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = vJ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.TEXT_CHANGED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.a$AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: CodelessLoggingEventListener */
    public static class a extends AccessibilityDelegate {
        private EventBinding vK;
        private WeakReference<View> vL;
        private WeakReference<View> vM;
        private int vN;
        private AccessibilityDelegate vO;
        private boolean vP = false;
        protected boolean vQ = false;

        public a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.vO = d.n(view2);
                this.vK = eventBinding;
                this.vL = new WeakReference(view2);
                this.vM = new WeakReference(view);
                ActionType iL = eventBinding.iL();
                int i = AnonymousClass1.vJ[eventBinding.iL().ordinal()];
                if (i == 1) {
                    this.vN = 1;
                } else if (i == 2) {
                    this.vN = 4;
                } else if (i == 3) {
                    this.vN = 16;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported action type: ");
                    stringBuilder.append(iL.toString());
                    throw new FacebookException(stringBuilder.toString());
                }
                this.vP = true;
            }
        }

        public void sendAccessibilityEvent(View view, int i) {
            if (i == -1) {
                Log.e(a.TAG, "Unsupported action type");
            }
            if (i == this.vN) {
                AccessibilityDelegate accessibilityDelegate = this.vO;
                if (!(accessibilityDelegate == null || (accessibilityDelegate instanceof a))) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i);
                }
                iA();
            }
        }

        private void iA() {
            final String eventName = this.vK.getEventName();
            final Bundle b = b.b(this.vK, (View) this.vM.get(), (View) this.vL.get());
            String str = "_valueToSum";
            if (b.containsKey(str)) {
                b.putDouble(str, b.aX(b.getString(str)));
            }
            b.putString("_is_fb_codeless", "1");
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    AppEventsLogger.O(f.getApplicationContext()).logEvent(eventName, b);
                }
            });
        }

        public boolean iB() {
            return this.vP;
        }
    }

    public static a a(EventBinding eventBinding, View view, View view2) {
        return new a(eventBinding, view, view2);
    }
}
