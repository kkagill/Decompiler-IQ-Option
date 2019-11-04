package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Map;
import java.util.UUID;

/* compiled from: SessionMetadataCollector */
class ad {
    private final Context context;
    private final IdManager pj;
    private final String pk;
    private final String versionName;

    public ad(Context context, IdManager idManager, String str, String str2) {
        this.context = context;
        this.pj = idManager;
        this.pk = str;
        this.versionName = str2;
    }

    public ab eB() {
        Map eC = this.pj.eC();
        return new ab(this.pj.bjB(), UUID.randomUUID().toString(), this.pj.bjA(), this.pj.bjG(), (String) eC.get(DeviceIdentifierType.FONT_TOKEN), CommonUtils.cz(this.context), this.pj.bjC(), this.pj.bjF(), this.pk, this.versionName);
    }
}
