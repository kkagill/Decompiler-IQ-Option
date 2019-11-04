package com.crashlytics.android.answers;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.b.f;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.network.c;
import io.fabric.sdk.android.services.settings.b;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: EnabledSessionAnalyticsManagerStrategy */
class m implements aa {
    private final Context context;
    private final h nP;
    private final p nT;
    private final ScheduledExecutorService oh;
    private final c om;
    private final x oo;
    private final AtomicReference<ScheduledFuture<?>> op = new AtomicReference();
    final ab oq;
    f os;
    g ot = new g();
    n ou = new s();
    boolean ov = true;
    boolean ow = true;
    volatile int ox = -1;
    boolean oy = false;
    boolean oz = false;

    public m(h hVar, Context context, ScheduledExecutorService scheduledExecutorService, x xVar, c cVar, ab abVar, p pVar) {
        this.nP = hVar;
        this.context = context;
        this.oh = scheduledExecutorService;
        this.oo = xVar;
        this.om = cVar;
        this.oq = abVar;
        this.nT = pVar;
    }

    public void a(b bVar, String str) {
        this.os = i.a(new y(this.nP, str, bVar.eOX, this.om, this.ot.cj(this.context)));
        this.oo.a(bVar);
        this.oy = bVar.ePc;
        this.oz = bVar.oz;
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase analytics forwarding ");
        String str2 = "enabled";
        String str3 = "disabled";
        stringBuilder.append(this.oy ? str2 : str3);
        String str4 = "Answers";
        biX.d(str4, stringBuilder.toString());
        biX = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase analytics including purchase events ");
        stringBuilder.append(this.oz ? str2 : str3);
        biX.d(str4, stringBuilder.toString());
        this.ov = bVar.ePd;
        biX = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Custom event tracking ");
        stringBuilder.append(this.ov ? str2 : str3);
        biX.d(str4, stringBuilder.toString());
        this.ow = bVar.ePe;
        biX = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Predefined event tracking ");
        if (!this.ow) {
            str2 = str3;
        }
        stringBuilder.append(str2);
        biX.d(str4, stringBuilder.toString());
        if (bVar.oJ > 1) {
            io.fabric.sdk.android.c.biX().d(str4, "Event sampling enabled");
            this.ou = new w(bVar.oJ);
        }
        this.ox = bVar.eOY;
        a(0, (long) this.ox);
    }

    public void d(a aVar) {
        k biX;
        StringBuilder stringBuilder;
        SessionEvent a = aVar.a(this.oq);
        String str = "Answers";
        k biX2;
        StringBuilder stringBuilder2;
        if (!this.ov && Type.CUSTOM.equals(a.oS)) {
            biX2 = io.fabric.sdk.android.c.biX();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Custom events tracking disabled - skipping event: ");
            stringBuilder2.append(a);
            biX2.d(str, stringBuilder2.toString());
        } else if (!this.ow && Type.PREDEFINED.equals(a.oS)) {
            biX2 = io.fabric.sdk.android.c.biX();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Predefined events tracking disabled - skipping event: ");
            stringBuilder2.append(a);
            biX2.d(str, stringBuilder2.toString());
        } else if (this.ou.a(a)) {
            biX2 = io.fabric.sdk.android.c.biX();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Skipping filtered event: ");
            stringBuilder2.append(a);
            biX2.d(str, stringBuilder2.toString());
        } else {
            try {
                this.oo.cB(a);
            } catch (IOException e) {
                biX = io.fabric.sdk.android.c.biX();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to write event: ");
                stringBuilder.append(a);
                biX.e(str, stringBuilder.toString(), e);
            }
            et();
            Object obj = (Type.CUSTOM.equals(a.oS) || Type.PREDEFINED.equals(a.oS)) ? 1 : null;
            boolean equals = ProductAction.ACTION_PURCHASE.equals(a.oW);
            if (this.oy && obj != null && (!equals || this.oz)) {
                try {
                    this.nT.b(a);
                } catch (Exception e2) {
                    biX = io.fabric.sdk.android.c.biX();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to map event to Firebase: ");
                    stringBuilder.append(a);
                    biX.e(str, stringBuilder.toString(), e2);
                }
            }
        }
    }

    public void et() {
        if ((this.ox != -1 ? 1 : null) != null) {
            a((long) this.ox, (long) this.ox);
        }
    }

    public void ep() {
        if (this.os == null) {
            CommonUtils.K(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.K(this.context, "Sending all files");
        List bkb = this.oo.bkb();
        int i = 0;
        while (bkb.size() > 0) {
            try {
                CommonUtils.K(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(bkb.size())}));
                boolean f = this.os.f(bkb);
                if (f) {
                    i += bkb.size();
                    this.oo.bN(bkb);
                }
                if (!f) {
                    break;
                }
                bkb = this.oo.bkb();
            } catch (Exception e) {
                Context context = this.context;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to send batch of analytics files to server: ");
                stringBuilder.append(e.getMessage());
                CommonUtils.a(context, stringBuilder.toString(), e);
            }
        }
        if (i == 0) {
            this.oo.bkd();
        }
    }

    public void es() {
        if (this.op.get() != null) {
            CommonUtils.K(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.op.get()).cancel(false);
            this.op.set(null);
        }
    }

    public void eq() {
        this.oo.bkc();
    }

    public boolean er() {
        try {
            return this.oo.er();
        } catch (IOException e) {
            CommonUtils.a(this.context, "Failed to roll file over.", e);
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(long j, long j2) {
        if ((this.op.get() == null ? 1 : null) != null) {
            i iVar = new i(this.context, this);
            Context context = this.context;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scheduling time based file roll over every ");
            stringBuilder.append(j2);
            stringBuilder.append(" seconds");
            CommonUtils.K(context, stringBuilder.toString());
            try {
                this.op.set(this.oh.scheduleAtFixedRate(iVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                CommonUtils.a(this.context, "Failed to schedule time based file roll over", e);
            }
        }
    }
}
