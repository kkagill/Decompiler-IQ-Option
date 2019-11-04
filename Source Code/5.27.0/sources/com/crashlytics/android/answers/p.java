package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

/* compiled from: FirebaseAnalyticsApiAdapter */
class p {
    private final Context context;
    private final r oA;
    private o oB;

    public p(Context context) {
        this(context, new r());
    }

    public p(Context context, r rVar) {
        this.context = context;
        this.oA = rVar;
    }

    public o eu() {
        if (this.oB == null) {
            this.oB = j.I(this.context);
        }
        return this.oB;
    }

    public void b(SessionEvent sessionEvent) {
        o eu = eu();
        String str = "Answers";
        if (eu == null) {
            c.biX().d(str, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        q c = this.oA.c(sessionEvent);
        if (c == null) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fabric event was not mappable to Firebase event: ");
            stringBuilder.append(sessionEvent);
            biX.d(str, stringBuilder.toString());
            return;
        }
        eu.logEvent(c.getEventName(), c.ev());
        if ("levelEnd".equals(sessionEvent.oW)) {
            eu.logEvent("post_score", c.ev());
        }
    }
}
