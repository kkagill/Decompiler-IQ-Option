package com.iqoption.core.microservices.features;

import io.reactivex.e;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/microservices/features/FeaturesRequests;", "", "()V", "API_GET_FEATURES", "", "CMD_GET_FEATURES", "EVENT_FEATURE_UPDATED", "featureUpdatedStream", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/features/response/Feature;", "getFeatureUpdatedStream", "()Lio/reactivex/Flowable;", "featureUpdatedStream$delegate", "Lkotlin/Lazy;", "getFeatures", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/features/response/FeaturesResponse;", "category", "identity", "getFeaturesRest", "core_release"})
/* compiled from: FeaturesRequests.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "featureUpdatedStream", "getFeatureUpdatedStream()Lio/reactivex/Flowable;"))};
    private static final d bsX = g.c(FeaturesRequests$featureUpdatedStream$2.bsZ);
    public static final a bsY = new a();

    public final e<com.iqoption.core.microservices.features.a.a> adx() {
        d dVar = bsX;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    private a() {
    }
}
