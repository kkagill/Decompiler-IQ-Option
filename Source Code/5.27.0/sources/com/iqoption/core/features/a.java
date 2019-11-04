package com.iqoption.core.features;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r0\u000fH&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/features/FeaturesProvider;", "", "checkFeaturesToggled", "", "clearInstance", "getBooleanState", "", "name", "", "getCachingStateFeatureStatus", "getFeature", "Lcom/iqoption/core/microservices/features/response/Feature;", "getFeaturesCopy", "", "observeFeature", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/util/Optional;", "observeFeatures", "save", "update", "features", "core_release"})
/* compiled from: FeaturesProvider.kt */
public interface a {

    @i(bne = {1, 1, 15})
    /* compiled from: FeaturesProvider.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/features/response/Feature;", "it", "", "apply"})
        /* compiled from: FeaturesProvider.kt */
        static final class a<T, R> implements g<T, R> {
            final /* synthetic */ String $name;

            a(String str) {
                this.$name = str;
            }

            /* renamed from: as */
            public final z<com.iqoption.core.microservices.features.a.a> apply(List<com.iqoption.core.microservices.features.a.a> list) {
                kotlin.jvm.internal.i.f(list, "it");
                com.iqoption.core.util.z.a aVar = z.bRg;
                for (Object next : list) {
                    if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.features.a.a) next).getName(), this.$name)) {
                        break;
                    }
                }
                Object next2 = null;
                return aVar.bX(next2);
            }
        }

        public static e<z<com.iqoption.core.microservices.features.a.a>> a(a aVar, String str) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            e g = aVar.Ip().g(new a(str));
            kotlin.jvm.internal.i.e(g, "observeFeatures()\n      …nd { it.name == name }) }");
            return g;
        }
    }

    void D(List<com.iqoption.core.microservices.features.a.a> list);

    List<com.iqoption.core.microservices.features.a.a> Im();

    void In();

    void Io();

    e<List<com.iqoption.core.microservices.features.a.a>> Ip();

    com.iqoption.core.microservices.features.a.a ei(String str);

    boolean ej(String str);

    String ek(String str);

    e<z<com.iqoption.core.microservices.features.a.a>> el(String str);

    void save();
}
