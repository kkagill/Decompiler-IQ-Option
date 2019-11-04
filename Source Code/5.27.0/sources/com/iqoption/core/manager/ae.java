package com.iqoption.core.manager;

import androidx.core.util.Pools.SynchronizedPool;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.manager.LogoutClearList.Clearable;
import com.iqoption.core.util.ab;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.a.m;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001SB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u000209H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u0004J\u0010\u0010>\u001a\u0004\u0018\u00010\u00112\u0006\u0010?\u001a\u00020\u0004J\u001a\u0010>\u001a\u0004\u0018\u00010\u00112\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0010H\u0002J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u0004J\u001a\u0010C\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00042\b\b\u0002\u0010D\u001a\u00020\u0010H\u0007J\u0006\u0010E\u001a\u000209J\u0018\u0010F\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020(J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u000209J\u0006\u0010L\u001a\u00020IJ\b\u0010M\u001a\u000209H\u0002J\b\u0010N\u001a\u000209H\u0002J\b\u0010O\u001a\u000209H\u0002J\u001c\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010Q\u001a\u00020\u0011H\u0002J\u0014\u0010R\u001a\u0002092\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u001fX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b'\u0010)R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, bng = {"Lcom/iqoption/core/manager/Toggles;", "Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "()V", "PREF_KEY", "", "PREF_NAME", "cachedFeatures", "", "getCachedFeatures", "()Ljava/util/List;", "setCachedFeatures", "(Ljava/util/List;)V", "cachedStatuses", "", "defaultFeatures", "Lkotlin/Function2;", "", "Lcom/iqoption/core/microservices/features/response/Feature;", "getDefaultFeatures", "()Lkotlin/jvm/functions/Function2;", "setDefaultFeatures", "(Lkotlin/jvm/functions/Function2;)V", "defaultVersions", "Lkotlin/Function1;", "getDefaultVersions", "()Lkotlin/jvm/functions/Function1;", "setDefaultVersions", "(Lkotlin/jvm/functions/Function1;)V", "features", "Lcom/iqoption/core/manager/Toggles$Key;", "featuresProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "featuresStream", "Lio/reactivex/Flowable;", "getFeaturesStream", "()Lio/reactivex/Flowable;", "identity", "getIdentity", "()Ljava/lang/String;", "isDebugMode", "", "()Z", "isIgnored", "setIgnored", "keyPool", "Landroidx/core/util/Pools$SynchronizedPool;", "prefs", "Lcom/iqoption/core/data/prefs/Prefs;", "trackUpdates", "Lio/reactivex/disposables/Disposable;", "updateFeaturesListFunc", "Lio/reactivex/functions/Function;", "Lcom/iqoption/core/microservices/features/response/FeaturesResponse;", "Lio/reactivex/CompletableSource;", "updateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "clear", "", "clearOnLogout", "getCachedStatus", "featureName", "defStatus", "getFeature", "name", "version", "getFeaturesCopy", "getStatus", "getVersion", "defVersion", "initVersionsAndDefaults", "isEnabled", "defValue", "loadFromHttp", "Lio/reactivex/Completable;", "loadFromSocket", "restore", "save", "startTrackUpdates", "stopTrackUpdates", "updateCachedStatuses", "updateFeature", "feature", "updateFeatures", "Key", "core_release"})
/* compiled from: Toggles.kt */
public final class ae implements Clearable {
    private static final com.iqoption.core.data.d.c bdh = com.iqoption.core.data.d.c.bdl.fL("features_manager_pref_name");
    private static final com.iqoption.core.rx.d<List<com.iqoption.core.microservices.features.a.a>> bkI = com.iqoption.core.rx.d.bER.akd();
    private static final io.reactivex.e<List<com.iqoption.core.microservices.features.a.a>> bkJ;
    private static volatile kotlin.jvm.a.b<? super String, Integer> bkK;
    private static volatile m<? super String, ? super Integer, com.iqoption.core.microservices.features.a.a> bkL;
    private static volatile kotlin.jvm.a.b<? super String, Boolean> bkM;
    private static volatile List<String> bkN;
    private static final String bkO = com.iqoption.core.data.d.e.bdq.getIdentity();
    private static final SynchronizedPool<a> bkP = new SynchronizedPool(10);
    private static Map<a, com.iqoption.core.microservices.features.a.a> bkQ = af.emptyMap();
    private static Map<String, String> bkR = af.emptyMap();
    private static final ReentrantReadWriteLock bkS = new ReentrantReadWriteLock();
    private static final g<com.iqoption.core.microservices.features.a.b, io.reactivex.c> bkT = e.bld;
    private static io.reactivex.disposables.b bkU;
    public static final ae bkV;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0000J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/manager/Toggles$Key;", "Lcom/iqoption/core/util/Recyclable;", "n", "", "v", "", "(Ljava/lang/String;I)V", "getN", "()Ljava/lang/String;", "<set-?>", "name", "getName", "getV", "()I", "version", "getVersion", "copy", "equals", "", "other", "", "hashCode", "recycle", "", "toString", "Companion", "core_release"})
    /* compiled from: Toggles.kt */
    private static final class a implements ab {
        public static final a bkY = new a();
        @SerializedName("n")
        private final String n;
        private String name = this.n;
        @SerializedName("v")
        private final int v;
        private int version = this.v;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/manager/Toggles$Key$Companion;", "", "()V", "obtain", "Lcom/iqoption/core/manager/Toggles$Key;", "name", "", "version", "", "core_release"})
        /* compiled from: Toggles.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final a B(String str, int i) {
                kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
                a aVar = (a) ae.bkP.acquire();
                if (aVar != null) {
                    aVar.name = str;
                    aVar.version = i;
                    if (aVar != null) {
                        return aVar;
                    }
                }
                return new a(str, i);
            }
        }

        public a(String str, int i) {
            kotlin.jvm.internal.i.f(str, "n");
            this.n = str;
            this.v = i;
        }

        public void recycle() {
            ae.bkP.release(this);
        }

        public final a YN() {
            return new a(this.name, this.version);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                a aVar = (a) obj;
                if ((kotlin.jvm.internal.i.y(this.name, aVar.name) ^ 1) == 0 && this.version == aVar.version) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.manager.Toggles.Key");
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.version;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key(name='");
            stringBuilder.append(this.name);
            stringBuilder.append("', version=");
            stringBuilder.append(this.version);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/manager/Toggles$restore$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/features/response/Feature;", "core_release"})
    /* compiled from: Toggles.kt */
    public static final class b extends TypeToken<List<? extends com.iqoption.core.microservices.features.a.a>> {
        b() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/features/response/Feature;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: Toggles.kt */
    static final class c<T> implements f<com.iqoption.core.microservices.features.a.a> {
        public static final c blb = new c();

        c() {
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.features.a.a aVar) {
            if (!ae.bkV.YK()) {
                ReentrantReadWriteLock b = ae.bkS;
                ReadLock readLock = b.readLock();
                int i = 0;
                int readHoldCount = b.getWriteHoldCount() == 0 ? b.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                WriteLock writeLock = b.writeLock();
                writeLock.lock();
                try {
                    ae aeVar = ae.bkV;
                    ae aeVar2 = ae.bkV;
                    kotlin.jvm.internal.i.e(aVar, "it");
                    ae.bkQ = aeVar2.a(aVar);
                    ae.bkV.YL();
                    ae.bkI.onNext(u.T(ae.bkQ.values()));
                    l lVar = l.eVB;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: Toggles.kt */
    static final class d<T> implements f<Throwable> {
        public static final d blc = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/iqoption/core/microservices/features/response/FeaturesResponse;", "apply"})
    /* compiled from: Toggles.kt */
    static final class e<T, R> implements g<com.iqoption.core.microservices.features.a.b, io.reactivex.c> {
        public static final e bld = new e();

        e() {
        }

        /* renamed from: a */
        public final io.reactivex.a apply(com.iqoption.core.microservices.features.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            com.iqoption.core.data.d.e.bdq.setIdentity(bVar.getIdentity());
            com.iqoption.core.connect.http.c.baF.UI();
            if (!((bVar.adB().isEmpty() ^ 1) == 0 || ae.bkV.YK())) {
                ae.bkV.ay(bVar.adB());
            }
            return io.reactivex.a.bkL();
        }
    }

    public final int fY(String str) {
        return a(this, str, 0, 2, null);
    }

    static {
        ae aeVar = new ae();
        bkV = aeVar;
        io.reactivex.e c = bkI.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "featuresProcessor.observeOn(bg)");
        bkJ = c;
        aeVar.restore();
        LogoutClearList.a(aeVar);
        ac.bkp.YF().c(com.iqoption.core.rx.i.aki()).d(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass1.bkW, (f) AnonymousClass2.bkX);
    }

    private ae() {
    }

    public final String getIdentity() {
        return bkO;
    }

    private final void YI() {
        io.reactivex.disposables.b bVar = bkU;
        if (bVar == null || bVar.isDisposed()) {
            bkU = com.iqoption.core.microservices.features.a.bsY.adx().c(com.iqoption.core.rx.i.aki()).d(com.iqoption.core.rx.i.aki()).a((f) c.blb, (f) d.blc);
        }
    }

    private final void YJ() {
        io.reactivex.disposables.b bVar = bkU;
        Object obj = (bVar == null || bVar.isDisposed()) ? 1 : null;
        if (obj != null) {
        }
    }

    public final boolean YK() {
        return com.iqoption.core.d.Un().Ds() && com.iqoption.core.data.d.a.bdi.Wr();
    }

    public void clearOnLogout() {
        clear();
    }

    public final void clear() {
        bkQ = af.emptyMap();
        bdh.clear();
    }

    private final void YL() {
        Map linkedHashMap;
        List list = bkN;
        if (list != null) {
            Iterable<String> iterable = list;
            linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
            for (String str : iterable) {
                Pair x = j.x(str, a(bkV, str, null, 2, null));
                linkedHashMap.put(x.getFirst(), x.bni());
            }
        } else {
            linkedHashMap = af.emptyMap();
        }
        bkR = linkedHashMap;
    }

    private final Map<a, com.iqoption.core.microservices.features.a.a> a(com.iqoption.core.microservices.features.a.a aVar) {
        ab B = a.bkY.B(aVar.getName(), aVar.getVersion());
        Object obj = (a) B;
        Map V = af.V(bkQ);
        if (!bkQ.containsKey(obj)) {
            obj = obj.YN();
        }
        V.put(obj, aVar);
        B.recycle();
        return V;
    }

    public final void ay(List<com.iqoption.core.microservices.features.a.a> list) {
        kotlin.jvm.internal.i.f(list, "features");
        ReentrantReadWriteLock reentrantReadWriteLock = bkS;
        ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterable<com.iqoption.core.microservices.features.a.a> iterable = list;
            Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
            for (com.iqoption.core.microservices.features.a.a aVar : iterable) {
                Pair x = j.x(new a(aVar.getName(), aVar.getVersion()), aVar);
                linkedHashMap.put(x.getFirst(), x.bni());
            }
            bkQ = linkedHashMap;
            bkV.YL();
            bkI.onNext(list);
            l lVar = l.eVB;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    private final com.iqoption.core.microservices.features.a.a s(String str, int i) {
        ReadLock readLock = bkS.readLock();
        readLock.lock();
        try {
            com.iqoption.core.microservices.features.a.a aVar = null;
            m mVar;
            if (bkQ.isEmpty()) {
                mVar = bkL;
                if (mVar != null) {
                    aVar = (com.iqoption.core.microservices.features.a.a) mVar.w(str, Integer.valueOf(i));
                }
                readLock.unlock();
                return aVar;
            }
            a B = a.bkY.B(str, i);
            com.iqoption.core.microservices.features.a.a aVar2 = (com.iqoption.core.microservices.features.a.a) bkQ.get(B);
            B.recycle();
            if (aVar2 != null) {
                aVar = aVar2;
            } else {
                mVar = bkL;
                if (mVar != null) {
                    aVar = (com.iqoption.core.microservices.features.a.a) mVar.w(str, Integer.valueOf(i));
                }
            }
            readLock.unlock();
            return aVar;
        } catch (Throwable th) {
            readLock.unlock();
        }
    }

    public final com.iqoption.core.microservices.features.a.a ei(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.a.b bVar = bkM;
        if (bVar == null || !((Boolean) bVar.invoke(str)).booleanValue()) {
            return s(str, a(this, str, 0, 2, null));
        }
        return null;
    }

    public final boolean o(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "featureName");
        com.iqoption.core.microservices.features.a.a ei = ei(str);
        return ei != null ? ei.isEnabled() : z;
    }

    public final String ah(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "featureName");
        kotlin.jvm.internal.i.f(str2, "defStatus");
        com.iqoption.core.microservices.features.a.a ei = ei(str);
        if (ei != null) {
            str = ei.getStatus();
            if (str != null) {
                return str;
            }
        }
        return str2;
    }

    public final int A(String str, int i) {
        kotlin.jvm.internal.i.f(str, "featureName");
        kotlin.jvm.a.b bVar = bkK;
        if (bVar == null) {
            return i;
        }
        Integer num = (Integer) bVar.invoke(str);
        return num != null ? num.intValue() : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A:{Catch:{ Exception -> 0x0087 }} */
    public final void restore() {
        /*
        r7 = this;
        r0 = r7.YK();
        if (r0 == 0) goto L_0x0087;
    L_0x0006:
        r0 = new com.iqoption.core.manager.ae$b;
        r0.<init>();
        r0 = r0.getType();
        r1 = bdh;	 Catch:{ Exception -> 0x0087 }
        r2 = "features_manager_pref_json";
        r3 = 2;
        r4 = 0;
        r1 = com.iqoption.core.data.d.c.b.a(r1, r2, r4, r3, r4);	 Catch:{ Exception -> 0x0087 }
        if (r1 == 0) goto L_0x002a;
    L_0x001b:
        r2 = "type";
        kotlin.jvm.internal.i.e(r0, r2);	 Catch:{ Exception -> 0x0087 }
        r0 = com.iqoption.core.ext.d.a(r1, r0, r4, r3, r4);	 Catch:{ Exception -> 0x0087 }
        r0 = (java.util.List) r0;	 Catch:{ Exception -> 0x0087 }
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002e;
    L_0x002a:
        r0 = kotlin.collections.m.emptyList();	 Catch:{ Exception -> 0x0087 }
    L_0x002e:
        r1 = r0;
        r1 = (java.util.Collection) r1;	 Catch:{ Exception -> 0x0087 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0087 }
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0087;
    L_0x0039:
        r1 = r0;
        r1 = (java.lang.Iterable) r1;	 Catch:{ Exception -> 0x0087 }
        r2 = 10;
        r2 = kotlin.collections.n.e(r1, r2);	 Catch:{ Exception -> 0x0087 }
        r2 = kotlin.collections.af.jL(r2);	 Catch:{ Exception -> 0x0087 }
        r3 = 16;
        r2 = kotlin.g.m.bi(r2, r3);	 Catch:{ Exception -> 0x0087 }
        r3 = new java.util.LinkedHashMap;	 Catch:{ Exception -> 0x0087 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x0087 }
        r3 = (java.util.Map) r3;	 Catch:{ Exception -> 0x0087 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x0087 }
    L_0x0057:
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x0087 }
        if (r2 == 0) goto L_0x0080;
    L_0x005d:
        r2 = r1.next();	 Catch:{ Exception -> 0x0087 }
        r2 = (com.iqoption.core.microservices.features.a.a) r2;	 Catch:{ Exception -> 0x0087 }
        r4 = new com.iqoption.core.manager.ae$a;	 Catch:{ Exception -> 0x0087 }
        r5 = r2.getName();	 Catch:{ Exception -> 0x0087 }
        r6 = r2.getVersion();	 Catch:{ Exception -> 0x0087 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x0087 }
        r2 = kotlin.j.x(r4, r2);	 Catch:{ Exception -> 0x0087 }
        r4 = r2.getFirst();	 Catch:{ Exception -> 0x0087 }
        r2 = r2.bni();	 Catch:{ Exception -> 0x0087 }
        r3.put(r4, r2);	 Catch:{ Exception -> 0x0087 }
        goto L_0x0057;
    L_0x0080:
        bkQ = r3;	 Catch:{ Exception -> 0x0087 }
        r1 = bkI;	 Catch:{ Exception -> 0x0087 }
        r1.onNext(r0);	 Catch:{ Exception -> 0x0087 }
    L_0x0087:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.manager.ae.restore():void");
    }

    public final void YM() {
        bkK = Toggles$initVersionsAndDefaults$1.bkZ;
        bkL = Toggles$initVersionsAndDefaults$2.bla;
    }
}
