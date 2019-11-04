package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.o;
import java.util.concurrent.CountDownLatch;

/* compiled from: CrashPromptDialog */
class h {
    private final b px;
    private final Builder py;

    /* compiled from: CrashPromptDialog */
    interface a {
        void z(boolean z);
    }

    /* compiled from: CrashPromptDialog */
    private static class b {
        private boolean pB;
        private final CountDownLatch pC;

        private b() {
            this.pB = false;
            this.pC = new CountDownLatch(1);
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void A(boolean z) {
            this.pB = z;
            this.pC.countDown();
        }

        /* Access modifiers changed, original: 0000 */
        public boolean eH() {
            return this.pB;
        }

        /* Access modifiers changed, original: 0000 */
        public void await() {
            try {
                this.pC.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private static int a(float f, int i) {
        return (int) (f * ((float) i));
    }

    public static h a(Activity activity, o oVar, final a aVar) {
        final b bVar = new b();
        x xVar = new x(activity, oVar);
        Builder builder = new Builder(activity);
        ScrollView a = a(activity, xVar.getMessage());
        builder.setView(a).setTitle(xVar.getTitle()).setCancelable(false).setNeutralButton(xVar.fB(), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                bVar.A(true);
                dialogInterface.dismiss();
            }
        });
        if (oVar.ePG) {
            builder.setNegativeButton(xVar.fD(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    bVar.A(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (oVar.ePI) {
            builder.setPositiveButton(xVar.fC(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    aVar.z(true);
                    bVar.A(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new h(builder, bVar);
    }

    private static ScrollView a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = a(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(a(f, 14), a(f, 2), a(f, 10), a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    private h(Builder builder, b bVar) {
        this.px = bVar;
        this.py = builder;
    }

    public void show() {
        this.py.show();
    }

    public void await() {
        this.px.await();
    }

    public boolean eH() {
        return this.px.eH();
    }
}
