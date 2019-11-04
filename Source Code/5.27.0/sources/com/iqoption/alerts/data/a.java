package com.iqoption.alerts.data;

import com.iqoption.core.util.z;
import io.reactivex.e;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000fRs\u0010\u0003\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0004j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006`\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, bng = {"Lcom/iqoption/alerts/data/AlertsRepository;", "", "()V", "alertsStreamSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getAlertsStreamSupplier", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "alertsStreamSupplier$delegate", "Lkotlin/Lazy;", "getAlerts", "Lio/reactivex/Flowable;", "alerts_release"})
/* compiled from: AlertsRepository.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "alertsStreamSupplier", "getAlertsStreamSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final d anZ = g.c(AlertsRepository$alertsStreamSupplier$2.aoc);
    public static final a aoa = new a();

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.useralerts.response.a>>, List<com.iqoption.core.microservices.useralerts.response.a>> AV() {
        d dVar = anZ;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private a() {
    }

    public final e<List<com.iqoption.core.microservices.useralerts.response.a>> AW() {
        return AV().ako();
    }
}
