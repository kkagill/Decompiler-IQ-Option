package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.d;
import com.facebook.appevents.internal.b;
import com.facebook.f;
import java.lang.ref.WeakReference;

/* compiled from: RCTCodelessLoggingEventListener */
public class c {
    private static final String TAG = "com.facebook.appevents.codeless.c";

    /* compiled from: RCTCodelessLoggingEventListener */
    public static class a implements OnTouchListener {
        private EventBinding vK;
        private WeakReference<View> vL;
        private WeakReference<View> vM;
        private boolean vP = false;
        @Nullable
        private OnTouchListener wd;

        public a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.wd = d.o(view2);
                this.vK = eventBinding;
                this.vL = new WeakReference(view2);
                this.vM = new WeakReference(view);
                this.vP = true;
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                iA();
            }
            OnTouchListener onTouchListener = this.wd;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        private void iA() {
            EventBinding eventBinding = this.vK;
            if (eventBinding != null) {
                final String eventName = eventBinding.getEventName();
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
        }

        public boolean iB() {
            return this.vP;
        }
    }

    public static a c(EventBinding eventBinding, View view, View view2) {
        return new a(eventBinding, view, view2);
    }
}
