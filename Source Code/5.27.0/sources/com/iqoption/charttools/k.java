package com.iqoption.charttools;

import androidx.collection.LruCache;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.iqoption.charttools.model.indicator.aa;
import com.iqoption.charttools.model.indicator.ab;
import com.iqoption.charttools.model.indicator.ac;
import com.iqoption.charttools.model.indicator.ad;
import com.iqoption.charttools.model.indicator.ae;
import com.iqoption.charttools.model.indicator.af;
import com.iqoption.charttools.model.indicator.ag;
import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.charttools.model.indicator.constructor.f;
import com.iqoption.charttools.model.indicator.g;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.l;
import com.iqoption.charttools.model.indicator.m;
import com.iqoption.charttools.model.indicator.n;
import com.iqoption.charttools.model.indicator.o;
import com.iqoption.charttools.model.indicator.p;
import com.iqoption.charttools.model.indicator.q;
import com.iqoption.charttools.model.indicator.r;
import com.iqoption.charttools.model.indicator.s;
import com.iqoption.charttools.model.indicator.t;
import com.iqoption.charttools.model.indicator.u;
import com.iqoption.charttools.model.indicator.v;
import com.iqoption.charttools.model.indicator.w;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.core.gl.ChartLibrary;
import com.iqoption.core.util.z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002:;B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\"J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\u001bJ \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\"J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bJ\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\u001bJ\u000e\u0010'\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020(J\u0010\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u0017J\u0018\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020(J\u0016\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020(J\f\u00101\u001a\u00020\u001d*\u000202H\u0002J6\u00101\u001a\u00020\u0017*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u0002020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0014\u00108\u001a\u00020\u0015*\u00020\u00192\u0006\u00109\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R7\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000b0\tj\b\u0012\u0004\u0012\u00020\u000b`\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006<"}, bng = {"Lcom/iqoption/charttools/IndicatorsLibraryManager;", "", "()V", "DISPOSE_DELAY", "", "TAG", "", "kotlin.jvm.PlatformType", "libraryStreamSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/charttools/IndicatorsLibrary;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getLibraryStreamSupplier", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "libraryStreamSupplier$delegate", "Lkotlin/Lazy;", "scriptCache", "com/iqoption/charttools/IndicatorsLibraryManager$scriptCache$1", "Lcom/iqoption/charttools/IndicatorsLibraryManager$scriptCache$1;", "buildScriptedInputs", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "indicator", "Lcom/iqoption/charttools/model/indicator/ScriptedIndicator;", "values", "Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "getCategories", "Lio/reactivex/Single;", "", "Lcom/iqoption/charttools/model/IndicatorCategory;", "getConstructor", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "Lcom/google/gson/JsonArray;", "getIndicators", "getInputs", "getLibrary", "getMetaIndicators", "getParams", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getScript", "parseIndicator", "library", "json", "Lcom/google/gson/JsonObject;", "writeIndicator", "", "writeTitledIndicator", "map", "Lcom/iqoption/core/microservices/techinstruments/response/Category;", "Lcom/iqoption/core/microservices/techinstruments/response/Indicator;", "categories", "videos", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "indicatorCategories", "overwrite", "inputs", "JsonHelper", "Persistor", "techtools_release"})
/* compiled from: IndicatorsLibraryManager.kt */
public final class k {
    private static final String TAG = k.class.getSimpleName();
    private static final kotlin.d aDA = g.c(IndicatorsLibraryManager$libraryStreamSupplier$2.aDI);
    public static final k aDB = new k();
    private static final long aDy = TimeUnit.DAYS.toMillis(1);
    private static final e aDz = new e(2097152);
    static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "libraryStreamSupplier", "getLibraryStreamSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u0004\u0018\u00010\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/charttools/IndicatorsLibraryManager$JsonHelper;", "", "()V", "HIDDEN", "", "ID", "LIBRARY_ID", "TYPE", "parseIndicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "all", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "json", "Lcom/google/gson/JsonObject;", "parseMeta", "writeIndicator", "", "indicator", "writeMeta", "meta", "techtools_release"})
    /* compiled from: IndicatorsLibraryManager.kt */
    private static final class a {
        public static final a aDC = new a();

        private a() {
        }

        private final x a(List<? extends x> list, JsonObject jsonObject) {
            String a = com.iqoption.core.ext.d.a(jsonObject, "type", null, 2, null);
            if (a == null) {
                return null;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((x) next).eN(a)) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (u.h(list2, 0) instanceof v) {
                return (x) list2.get(0);
            }
            if ((list2.isEmpty() ^ 1) == 0) {
                return null;
            }
            Long a2 = com.iqoption.core.ext.d.a(jsonObject, "library_id", null, 2, null);
            if (a2 == null) {
                return null;
            }
            long longValue = a2.longValue();
            for (Object next2 : list2) {
                Object obj;
                x xVar = (x) next2;
                if (!(xVar instanceof ae)) {
                    xVar = null;
                }
                ae aeVar = (ae) xVar;
                if (aeVar == null || aeVar.getId() != longValue) {
                    obj = null;
                    continue;
                } else {
                    obj = 1;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next22 = null;
            return (x) next22;
        }

        private final void a(x xVar, JsonObject jsonObject) {
            jsonObject.addProperty("type", xVar.getType());
            if (xVar instanceof ae) {
                jsonObject.addProperty("library_id", (Number) Long.valueOf(((ae) xVar).getId()));
            }
        }

        public final h b(List<? extends x> list, JsonObject jsonObject) {
            kotlin.jvm.internal.i.f(list, "all");
            kotlin.jvm.internal.i.f(jsonObject, "json");
            x a = a((List) list, jsonObject);
            if (a != null) {
                return new h(a, com.iqoption.core.ext.d.a(jsonObject, "id", 0, 2, null), com.iqoption.core.ext.d.a(jsonObject, "hidden", false, 2, null), a.b(jsonObject));
            }
            return null;
        }

        public final void a(JsonObject jsonObject, h hVar) {
            kotlin.jvm.internal.i.f(jsonObject, "json");
            kotlin.jvm.internal.i.f(hVar, "indicator");
            x MH = hVar.MH();
            a(MH, jsonObject);
            jsonObject.addProperty("id", (Number) Integer.valueOf(hVar.getIndex()));
            jsonObject.addProperty("hidden", Boolean.valueOf(hVar.isHidden()));
            MH.a(jsonObject, hVar.Oh());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0014J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000f\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\tH\bJ@\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/charttools/IndicatorsLibraryManager$Persistor;", "", "()V", "PARENT_DIR", "", "SUBDIR_CATEGORIES", "SUBDIR_INDICATORS", "SUBDIR_SCRIPTS", "categoriesStore", "Lcom/iqoption/core/data/filestore/FileStore;", "indicatorsStore", "scriptsStore", "clear", "", "getCategories", "", "Lcom/iqoption/core/microservices/techinstruments/response/Category;", "getIndicators", "Lcom/iqoption/core/microservices/techinstruments/response/Indicator;", "getKnownLibraryVersion", "", "getKnownRuntimeVersion", "getScript", "id", "loadList", "T", "store", "saveLibrary", "libraryVersion", "runtimeVersion", "categories", "indicators", "scripts", "techtools_release"})
    /* compiled from: IndicatorsLibraryManager.kt */
    private static final class b {
        private static final com.iqoption.core.data.a.a aDD = com.iqoption.core.data.a.b.fH("techtools/indicators_library/categories");
        private static final com.iqoption.core.data.a.a aDE = com.iqoption.core.data.a.b.fH("techtools/indicators_library/indicators");
        private static final com.iqoption.core.data.a.a aDF = com.iqoption.core.data.a.b.fH("techtools/indicators_library/scripts");
        public static final b aDG = new b();

        private b() {
        }

        public final long Mo() {
            return com.iqoption.core.data.d.a.bdi.Wc();
        }

        public final long Mp() {
            return com.iqoption.core.data.d.a.bdi.Wd();
        }

        public final void a(long j, long j2, List<com.iqoption.core.microservices.techinstruments.a.a> list, List<com.iqoption.core.microservices.techinstruments.a.b> list2, List<String> list3) {
            kotlin.jvm.internal.i.f(list, "categories");
            kotlin.jvm.internal.i.f(list2, "indicators");
            kotlin.jvm.internal.i.f(list3, "scripts");
            com.iqoption.core.data.d.a.bdi.aD(j);
            com.iqoption.core.data.d.a.bdi.aE(j2);
            aDD.clear();
            for (com.iqoption.core.microservices.techinstruments.a.a aVar : list) {
                aDD.ae(String.valueOf(aVar.getId()), com.iqoption.core.ext.d.a(aVar, null, 1, null));
            }
            aDE.clear();
            aDF.clear();
            int i = 0;
            for (Object next : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                com.iqoption.core.microservices.techinstruments.a.b bVar = (com.iqoption.core.microservices.techinstruments.a.b) next;
                String valueOf = String.valueOf(bVar.getId());
                aDE.ae(valueOf, com.iqoption.core.ext.d.a(bVar, null, 1, null));
                String str = (String) u.h(list3, i);
                if (str != null) {
                    aDF.ae(valueOf, str);
                }
                i = i2;
            }
        }

        public final List<com.iqoption.core.microservices.techinstruments.a.a> Mk() {
            com.iqoption.core.data.a.a aVar = aDD;
            Collection arrayList = new ArrayList();
            for (String fG : aVar.getKeys()) {
                Closeable jsonReader = new JsonReader(aVar.fG(fG));
                Throwable th = (Throwable) null;
                try {
                    Object a = com.iqoption.core.ext.d.a((JsonReader) jsonReader, com.iqoption.core.microservices.techinstruments.a.a.class, null, 2, null);
                    kotlin.d.b.a(jsonReader, th);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } catch (Throwable th2) {
                    kotlin.d.b.a(jsonReader, th);
                }
            }
            return (List) arrayList;
        }

        public final List<com.iqoption.core.microservices.techinstruments.a.b> LV() {
            com.iqoption.core.data.a.a aVar = aDE;
            Collection arrayList = new ArrayList();
            for (String fG : aVar.getKeys()) {
                Closeable jsonReader = new JsonReader(aVar.fG(fG));
                Throwable th = (Throwable) null;
                try {
                    Object a = com.iqoption.core.ext.d.a((JsonReader) jsonReader, com.iqoption.core.microservices.techinstruments.a.b.class, null, 2, null);
                    kotlin.d.b.a(jsonReader, th);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } catch (Throwable th2) {
                    kotlin.d.b.a(jsonReader, th);
                }
            }
            return (List) arrayList;
        }

        public final String av(long j) {
            return aDF.r(String.valueOf(j));
        }

        public final void clear() {
            com.iqoption.core.data.d.a.bdi.aD(0);
            aDD.clear();
            aDE.clear();
            aDF.clear();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "call"})
    /* compiled from: IndicatorsLibraryManager.kt */
    static final class d<V> implements Callable<T> {
        final /* synthetic */ com.iqoption.charttools.model.indicator.constructor.h aDH;
        final /* synthetic */ x aDt;

        d(x xVar, com.iqoption.charttools.model.indicator.constructor.h hVar) {
            this.aDt = xVar;
            this.aDH = hVar;
        }

        /* renamed from: Mq */
        public final f call() {
            x xVar = this.aDt;
            if (xVar instanceof p) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.a(this.aDH);
            }
            if (xVar instanceof q) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.b(this.aDH);
            }
            if (xVar instanceof o) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.c(this.aDH);
            }
            if (xVar instanceof r) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.d(this.aDH);
            }
            if (xVar instanceof m) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.e(this.aDH);
            }
            if (xVar instanceof l) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.f(this.aDH);
            }
            if (xVar instanceof n) {
                return com.iqoption.charttools.model.indicator.constructor.a.a.g(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.f) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.p(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.c) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.o(this.aDH);
            }
            if (xVar instanceof ab) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.n(this.aDH);
            }
            if (xVar instanceof ad) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.q(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.a) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.r(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.b) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.s(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.d) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.t(this.aDH);
            }
            if (xVar instanceof g) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.u(this.aDH);
            }
            if (xVar instanceof s) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.v(this.aDH);
            }
            if (xVar instanceof w) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.w(this.aDH);
            }
            if (xVar instanceof ac) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.x(this.aDH);
            }
            if (xVar instanceof af) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.y(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.e) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.m(this.aDH);
            }
            if (xVar instanceof com.iqoption.charttools.model.indicator.j) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.l(this.aDH);
            }
            if (xVar instanceof t) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.j(this.aDH);
            }
            if (xVar instanceof u) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.k(this.aDH);
            }
            if (xVar instanceof aa) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.i(this.aDH);
            }
            if (xVar instanceof ag) {
                return com.iqoption.charttools.model.indicator.constructor.a.b.h(this.aDH);
            }
            if (xVar instanceof ae) {
                return k.aDB.a((ae) this.aDt, this.aDH);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "inputs", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "apply"})
    /* compiled from: IndicatorsLibraryManager.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ x aDt;

        c(x xVar) {
            this.aDt = xVar;
        }

        /* renamed from: a */
        public final com.iqoption.charttools.model.indicator.constructor.a apply(f fVar) {
            kotlin.jvm.internal.i.f(fVar, "inputs");
            x xVar = this.aDt;
            return new com.iqoption.charttools.model.indicator.constructor.a(xVar, xVar.On(), fVar.Oz(), fVar.OP());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0014¨\u0006\b"}, bng = {"com/iqoption/charttools/IndicatorsLibraryManager$scriptCache$1", "Landroidx/collection/LruCache;", "", "", "sizeOf", "", "key", "value", "techtools_release"})
    /* compiled from: IndicatorsLibraryManager.kt */
    public static final class e extends LruCache<Long, String> {
        e(int i) {
            super(i);
        }

        public /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return f(((Number) obj).longValue(), (String) obj2);
        }

        /* Access modifiers changed, original: protected */
        public int f(long j, String str) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
            return str.length() * 2;
        }
    }

    private final com.iqoption.core.rx.a.a<z<j>, j> Mm() {
        kotlin.d dVar = aDA;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private k() {
    }

    private final com.iqoption.charttools.model.a a(com.iqoption.core.microservices.techinstruments.a.a aVar) {
        return new com.iqoption.charttools.model.a(aVar);
    }

    private final ae a(com.iqoption.core.microservices.techinstruments.a.b bVar, List<com.iqoption.core.microservices.techinstruments.a.a> list, List<com.iqoption.core.microservices.videoeducation.response.g> list2, List<com.iqoption.charttools.model.a> list3) {
        com.iqoption.core.microservices.videoeducation.response.g gVar;
        String fz = com.iqoption.core.d.EE().fz(bVar.OD());
        if ((((CharSequence) fz).length() > 0 ? 1 : null) == null) {
            fz = null;
        }
        if (bVar.ahs() > 0) {
            for (Object next : list2) {
                Object obj;
                if (((com.iqoption.core.microservices.videoeducation.response.g) next).getId() == bVar.ahs()) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            gVar = (com.iqoption.core.microservices.videoeducation.response.g) next2;
        } else {
            gVar = null;
        }
        Collection arrayList = new ArrayList();
        for (Object next3 : list) {
            if (((com.iqoption.core.microservices.techinstruments.a.a) next3).ahr().contains(Long.valueOf(bVar.getId()))) {
                arrayList.add(next3);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (com.iqoption.core.microservices.techinstruments.a.a aVar : (List) arrayList) {
            for (Object next4 : list3) {
                Object obj2;
                if (((com.iqoption.charttools.model.a) next4).getId() == aVar.getId()) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    break;
                }
            }
            Object next42 = null;
            com.iqoption.charttools.model.a aVar2 = (com.iqoption.charttools.model.a) next42;
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        Set V = u.V((List) arrayList2);
        if ((1 ^ V.isEmpty()) == 0) {
            V = null;
        }
        return new ae(bVar, fz, gVar, V);
    }

    public final io.reactivex.p<j> Mn() {
        io.reactivex.p bkV = Mm().ako().bkV();
        kotlin.jvm.internal.i.e(bkV, "libraryStreamSupplier.ge…          .firstOrError()");
        return bkV;
    }

    public final io.reactivex.p<f> a(x xVar, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        io.reactivex.p j = io.reactivex.p.j(new d(xVar, jsonArray != null ? new com.iqoption.charttools.model.indicator.constructor.h(jsonArray) : com.iqoption.charttools.model.indicator.constructor.h.aKf.OV()));
        kotlin.jvm.internal.i.e(j, "Single\n                .…      }\n                }");
        return j;
    }

    public final String a(ae aeVar) {
        kotlin.jvm.internal.i.f(aeVar, "meta");
        String str = (String) aDz.get(Long.valueOf(aeVar.getId()));
        if (str != null) {
            return str;
        }
        str = b.aDG.av(aeVar.getId());
        if (str == null) {
            return null;
        }
        aDz.put(Long.valueOf(aeVar.getId()), str);
        return str;
    }

    private final f a(ae aeVar, com.iqoption.charttools.model.indicator.constructor.h hVar) {
        String a = a(aeVar);
        if (a != null) {
            a = ChartLibrary.getScriptedInstrumentInputs(a);
            f fVar = null;
            if (a != null) {
                fVar = (f) com.iqoption.core.ext.d.a(a, f.class, null, 2, null);
            }
            if (fVar != null) {
                f a2 = aDB.a(hVar, fVar);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return f.aKb.OR();
    }

    private final f a(com.iqoption.charttools.model.indicator.constructor.h hVar, f fVar) {
        com.iqoption.charttools.model.indicator.constructor.c[] Oz = fVar.Oz();
        InputItem[] OP = fVar.OP();
        Collection arrayList = new ArrayList(OP.length);
        for (InputItem inputItem : OP) {
            arrayList.add(InputItem.a(inputItem, null, null, hVar.eR(inputItem.getValue()), null, null, null, null, false, 251, null));
        }
        Object[] toArray = ((List) arrayList).toArray(new InputItem[0]);
        if (toArray != null) {
            return new f(Oz, (InputItem[]) toArray);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final io.reactivex.p<com.iqoption.charttools.model.indicator.constructor.a> b(x xVar, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        io.reactivex.p t = a(xVar, jsonArray).t(new c(xVar));
        kotlin.jvm.internal.i.e(t, "getInputs(meta, values)\n….groups, inputs.inputs) }");
        return t;
    }

    public final h a(j jVar, JsonObject jsonObject) {
        kotlin.jvm.internal.i.f(jVar, "library");
        kotlin.jvm.internal.i.f(jsonObject, "json");
        return a.aDC.b(jVar.getAll(), jsonObject);
    }

    public final void a(JsonObject jsonObject, h hVar) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        a.aDC.a(jsonObject, hVar);
    }

    public final void b(JsonObject jsonObject, h hVar) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        kotlin.jvm.internal.i.f(hVar, "indicator");
        a(jsonObject, hVar);
        x MH = hVar.MH();
        if (MH instanceof ae) {
            String a = a((ae) MH);
            if (a != null) {
                jsonObject.addProperty("script", a);
            }
        } else if (MH instanceof v) {
            jsonObject.addProperty(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, hVar.Of());
        }
    }

    public final String b(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "indicator");
        x MH = hVar.MH();
        if (MH instanceof v) {
            return ((v) hVar.MH()).e(hVar.Oh());
        }
        if (MH instanceof ae) {
            String a = a((ae) hVar.MH());
            if (a != null) {
                String scriptedInstrumentParams = ChartLibrary.getScriptedInstrumentParams(a, hVar.Oh().toString());
                if (scriptedInstrumentParams != null) {
                    return scriptedInstrumentParams;
                }
            }
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }
}
