package com.iqoption.core.data.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import java.io.File;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, bng = {"newFolderFileStore", "Lcom/iqoption/core/data/filestore/FileStore;", "name", "", "core_release"})
/* compiled from: FileStore.kt */
public final class b {
    public static final a fH(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        return new c(new File(d.Uo().getFilesDir(), str));
    }
}
