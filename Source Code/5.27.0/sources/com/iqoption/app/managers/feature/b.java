package com.iqoption.app.managers.feature;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.collect.ImmutableList;
import com.iqoption.core.util.z;
import io.reactivex.e;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¨\u0006\u0014"}, bng = {"Lcom/iqoption/app/managers/feature/FeaturesProviderImpl;", "Lcom/iqoption/core/features/FeaturesProvider;", "()V", "checkFeaturesToggled", "", "clearInstance", "getBooleanState", "", "name", "", "getCachingStateFeatureStatus", "getFeature", "Lcom/iqoption/core/microservices/features/response/Feature;", "getFeaturesCopy", "", "observeFeatures", "Lio/reactivex/Flowable;", "save", "update", "features", "app_optionXRelease"})
/* compiled from: FeaturesProviderImpl.kt */
public final class b implements com.iqoption.core.features.a {
    public static final b avH = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/google/common/collect/ImmutableList;", "Lcom/iqoption/core/microservices/features/response/Feature;", "kotlin.jvm.PlatformType", "call"})
    /* compiled from: FeaturesProviderImpl.kt */
    static final class a<V> implements Callable<T> {
        public static final a avI = new a();

        a() {
        }

        /* renamed from: Iq */
        public final ImmutableList<com.iqoption.core.microservices.features.a.a> call() {
            c Iw = c.Iw();
            kotlin.jvm.internal.i.e(Iw, "FeaturesToggledManager.instance()");
            return Iw.Iy();
        }
    }

    private b() {
    }

    public e<z<com.iqoption.core.microservices.features.a.a>> el(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        return com.iqoption.core.features.a.a.a(this, str);
    }

    public com.iqoption.core.microservices.features.a.a ei(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        return c.Iw().ei(str);
    }

    public boolean ej(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        return c.Iw().ej(str);
    }

    public String ek(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        str = c.en(str);
        kotlin.jvm.internal.i.e(str, "FeaturesToggledManager.g…CachingStateFeature(name)");
        return str;
    }

    public List<com.iqoption.core.microservices.features.a.a> Im() {
        c Iw = c.Iw();
        kotlin.jvm.internal.i.e(Iw, "FeaturesToggledManager.instance()");
        ImmutableList Iy = Iw.Iy();
        kotlin.jvm.internal.i.e(Iy, "FeaturesToggledManager.instance().listFeatures");
        return Iy;
    }

    public void In() {
        c.IB();
    }

    public void Io() {
        c.Iw().Io();
    }

    public void D(List<com.iqoption.core.microservices.features.a.a> list) {
        kotlin.jvm.internal.i.f(list, "features");
        c Iw = c.Iw();
        Object[] toArray = list.toArray(new com.iqoption.core.microservices.features.a.a[0]);
        if (toArray != null) {
            Iw.a((com.iqoption.core.microservices.features.a.a[]) toArray);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public void save() {
        c.Iw().save();
    }

    public e<List<com.iqoption.core.microservices.features.a.a>> Ip() {
        e f = e.f((Callable) a.avI);
        c Iw = c.Iw();
        kotlin.jvm.internal.i.e(Iw, "FeaturesToggledManager.instance()");
        f = f.c((org.a.b) Iw.Iz());
        kotlin.jvm.internal.i.e(f, "Flowable\n               …nager.instance().updates)");
        return f;
    }
}
