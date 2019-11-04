package com.iqoption.core.microservices.d;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.k;
import com.iqoption.core.d;
import com.iqoption.core.microservices.d.a.b;
import com.iqoption.core.util.ag;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/resources/ResourceRequests;", "", "()V", "CMD_GET_RESOURCES", "", "RESOLUTION_HDPI", "RESOLUTION_MDPI", "RESOLUTION_XHDPI", "RESOLUTION_XXHDPI", "RESOLUTION_XXXHDPI", "getResolution", "getResources", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/resources/responses/ResourceElement;", "id", "resolution", "core_release"})
/* compiled from: ResourceRequests.kt */
public final class a {
    public static final a bxS = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/resources/ResourceRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<List<? extends b>> {
    }

    private a() {
    }

    public final String agX() {
        String bl = ag.bl(d.Uo());
        if (bl != null) {
            switch (bl.hashCode()) {
                case -1619189395:
                    if (bl.equals("xxxhdpi")) {
                        return "4";
                    }
                    break;
                case -745448715:
                    if (bl.equals("xxhdpi")) {
                        return "3";
                    }
                    break;
                case 3197941:
                    if (bl.equals("hdpi")) {
                        return "1.5";
                    }
                    break;
                case 114020461:
                    if (bl.equals("xhdpi")) {
                        return "2";
                    }
                    break;
            }
        }
        return "1";
    }

    public static /* synthetic */ p a(a aVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        if ((i & 2) != 0) {
            str2 = aVar.agX();
        }
        return aVar.ap(str, str2);
    }

    public final p<List<b>> ap(String str, String str2) {
        String str3 = "resolution";
        kotlin.jvm.internal.i.f(str2, str3);
        k EV = d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("get-resources", type).fp("2.0").k(str3, str2).k("platform_id", d.Un().Dx()).k("locale", Locale.getDefault()).k("id", str).UB();
    }
}
