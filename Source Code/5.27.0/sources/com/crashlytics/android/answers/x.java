package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.b.b;
import io.fabric.sdk.android.services.b.c;
import io.fabric.sdk.android.services.common.j;
import java.util.UUID;

/* compiled from: SessionAnalyticsFilesManager */
class x extends b<SessionEvent> {
    private io.fabric.sdk.android.services.settings.b oL;

    x(Context context, ac acVar, j jVar, c cVar) {
        super(context, acVar, jVar, cVar, 100);
    }

    /* Access modifiers changed, original: protected */
    public String ex() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sa");
        String str = "_";
        stringBuilder.append(str);
        stringBuilder.append(randomUUID.toString());
        stringBuilder.append(str);
        stringBuilder.append(this.eOl.bjw());
        stringBuilder.append(".tap");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public int ey() {
        io.fabric.sdk.android.services.settings.b bVar = this.oL;
        return bVar == null ? super.ey() : bVar.ePb;
    }

    /* Access modifiers changed, original: protected */
    public int ez() {
        io.fabric.sdk.android.services.settings.b bVar = this.oL;
        return bVar == null ? super.ez() : bVar.eOZ;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(io.fabric.sdk.android.services.settings.b bVar) {
        this.oL = bVar;
    }
}
