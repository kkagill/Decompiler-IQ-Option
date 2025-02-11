package com.iqoption.core.f;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.d;
import com.iqoption.core.microservices.d.a.b;
import com.iqoption.core.util.l;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/resources/ResourcesStorage;", "", "()V", "file", "Ljava/io/File;", "getPersistent", "", "Lcom/iqoption/core/microservices/resources/responses/ResourceElement;", "persist", "", "list", "core_release"})
/* compiled from: ResourceStorage.kt */
public final class c {
    private final File file = new File(d.Uo().getFilesDir(), "resources.json");

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/resources/ResourcesStorage$getPersistent$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/resources/responses/ResourceElement;", "core_release"})
    /* compiled from: ResourceStorage.kt */
    public static final class a extends TypeToken<List<? extends b>> {
        a() {
        }
    }

    public final void aE(List<b> list) {
        kotlin.jvm.internal.i.f(list, "list");
        String toJson = new Gson().toJson((Object) list);
        if (!TextUtils.isEmpty(toJson)) {
            File file = this.file;
            kotlin.jvm.internal.i.e(toJson, "dataString");
            l.d(file, toJson);
        }
    }

    public final List<b> aka() {
        String t = l.t(this.file);
        if (TextUtils.isEmpty(t)) {
            List emptyList = Collections.emptyList();
            kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList()");
            return emptyList;
        }
        Object fromJson = new Gson().fromJson(t, new a().getType());
        kotlin.jvm.internal.i.e(fromJson, "Gson().fromJson(dataStri…ourceElement>>() {}.type)");
        return (List) fromJson;
    }
}
