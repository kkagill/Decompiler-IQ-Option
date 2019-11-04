package com.iqoption.charttools;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.charttools.model.indicator.x;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001DB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u001e\u0010'\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0-2\u0006\u0010\"\u001a\u00020\u0004J\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u000e2\u0006\u0010\"\u001a\u00020\u0004J\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0-2\u0006\u0010\"\u001a\u00020\u0004J\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180-J\u0006\u00103\u001a\u00020\u0018J\u0006\u00104\u001a\u00020\u0018J\u0006\u00105\u001a\u00020(J\u000e\u00106\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0004J\u0016\u00107\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u00108\u001a\u00020!J\u000e\u00109\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0004J\u001c\u0010:\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\f\u0010;\u001a\b\u0012\u0004\u0012\u0002000/J\u0016\u0010<\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0018J\u000e\u0010>\u001a\u00020?2\u0006\u0010=\u001a\u00020\u0018J?\u0010@\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u00108\u001a\u00020!2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010B\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010CR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\f0\f0\u000bX\u0004¢\u0006\u0002\n\u0000R?\u0010\r\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R;\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178B@BX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006E"}, bng = {"Lcom/iqoption/charttools/ActiveIndicatorsManager;", "", "()V", "KEY_ALL", "", "PREF_APPLY_TO_ALL_ASSETS_KEY", "PREF_NAME", "PREF_VOLUME_KEY", "TAG", "kotlin.jvm.PlatformType", "eventsProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/iqoption/charttools/ActiveIndicatorEvent;", "helperStream", "Lio/reactivex/Single;", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "getHelperStream", "()Lio/reactivex/Single;", "helperStream$delegate", "Lkotlin/Lazy;", "prefs", "Lcom/iqoption/core/data/prefs/SharedPrefs;", "<set-?>", "Lio/reactivex/processors/BehaviorProcessor;", "", "volumeStateProcessor", "getVolumeStateProcessor", "()Lio/reactivex/processors/BehaviorProcessor;", "setVolumeStateProcessor", "(Lio/reactivex/processors/BehaviorProcessor;)V", "volumeStateProcessor$delegate", "Lkotlin/properties/ReadWriteProperty;", "addIndicator", "", "key", "metaIndicator", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "values", "Lcom/google/gson/JsonArray;", "applyTemplate", "Lio/reactivex/Completable;", "activeId", "template", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "getEvents", "Lio/reactivex/Flowable;", "getIndicators", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "getIndicatorsStream", "getVolumeEnabledStream", "isApplyToAllAssetsEnabled", "isVolumeEnabled", "persistState", "removeAllIndicators", "removeIndicator", "index", "removeKey", "replaceIndicators", "indicators", "setApplyToAllAssetsEnabled", "enabled", "setVolumeEnabled", "", "updateIndicator", "isHidden", "isCallback", "(Ljava/lang/String;ILjava/lang/Boolean;Lcom/google/gson/JsonArray;Z)Lio/reactivex/Completable;", "Helper", "techtools_release"})
/* compiled from: ActiveIndicatorsManager.kt */
public final class f {
    private static final String TAG = f.class.getSimpleName();
    private static final kotlin.f.d aCN = com.iqoption.core.d.c.bL(null);
    private static final kotlin.d aCO = g.c(ActiveIndicatorsManager$helperStream$2.aDb);
    private static final io.reactivex.processors.a<b> aCP;
    public static final f aCQ = new f();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(f.class), "volumeStateProcessor", "getVolumeStateProcessor()Lio/reactivex/processors/BehaviorProcessor;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(f.class), "helperStream", "getHelperStream()Lio/reactivex/Single;"))};
    private static final com.iqoption.core.data.d.d ayf = new com.iqoption.core.data.d.d("active_indicators");

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tJ\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "(Lcom/iqoption/charttools/IndicatorsLibrary;)V", "indexIncrement", "Ljava/util/concurrent/atomic/AtomicInteger;", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "store", "Lcom/iqoption/core/data/filestore/FileStore;", "trashKeys", "", "getIndicators", "key", "newIndex", "", "parseIndicators", "persist", "", "removeIndicator", "id", "removeIndicators", "replaceIndicators", "indicators", "scheduleRewrite", "setIndicator", "indicator", "WriteTask", "techtools_release"})
    /* compiled from: ActiveIndicatorsManager.kt */
    private static final class a {
        private final com.iqoption.core.data.a.a aCR = com.iqoption.core.data.a.b.fH("techtools/active_indicators");
        private AtomicInteger aCS = new AtomicInteger(0);
        private final ConcurrentHashMap<String, List<com.iqoption.charttools.model.indicator.h>> aCT = new ConcurrentHashMap();
        private final Set<String> aCU = new LinkedHashSet();
        private final j aCV;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper$WriteTask;", "Ljava/lang/Runnable;", "key", "", "(Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "run", "", "techtools_release"})
        /* compiled from: ActiveIndicatorsManager.kt */
        private final class a implements Runnable {
            final /* synthetic */ a aCW;
            private final String key;

            public a(a aVar, String str) {
                kotlin.jvm.internal.i.f(str, "key");
                this.aCW = aVar;
                this.key = str;
            }

            public void run() {
                this.aCW.eF(this.key);
            }
        }

        public a(j jVar) {
            kotlin.jvm.internal.i.f(jVar, "library");
            this.aCV = jVar;
        }

        private final void eC(String str) {
            com.iqoption.core.rx.i.aki().m(new a(this, str));
        }

        public final synchronized List<com.iqoption.charttools.model.indicator.h> eD(String str) {
            List<com.iqoption.charttools.model.indicator.h> list;
            kotlin.jvm.internal.i.f(str, "key");
            list = (List) this.aCT.get(str);
            if (list == null) {
                list = eG(str);
                if (list == null) {
                    list = m.emptyList();
                }
                this.aCT.put(str, list);
            }
            return list;
        }

        public final synchronized void eE(String str) {
            kotlin.jvm.internal.i.f(str, "key");
            this.aCT.remove(str);
            this.aCU.add(str);
            eC(str);
        }

        public final synchronized List<com.iqoption.charttools.model.indicator.h> b(String str, List<com.iqoption.charttools.model.indicator.h> list) {
            kotlin.jvm.internal.i.f(str, "key");
            kotlin.jvm.internal.i.f(list, "indicators");
            this.aCT.put(str, list);
            eC(str);
            return list;
        }

        public final synchronized List<com.iqoption.charttools.model.indicator.h> a(String str, com.iqoption.charttools.model.indicator.h hVar) {
            Object a;
            kotlin.jvm.internal.i.f(str, "key");
            kotlin.jvm.internal.i.f(hVar, "indicator");
            List<com.iqoption.charttools.model.indicator.h> eD = eD(str);
            int i = 0;
            for (com.iqoption.charttools.model.indicator.h index : eD) {
                if ((index.getIndex() == hVar.getIndex() ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                a = com.iqoption.core.ext.c.a((List) eD, i, (Object) hVar);
            } else {
                a = u.i((Collection) eD, (Object) hVar);
            }
            this.aCT.put(str, a);
            eC(str);
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x004d A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
        public final synchronized java.util.List<com.iqoption.charttools.model.indicator.h> w(java.lang.String r8, int r9) {
            /*
            r7 = this;
            monitor-enter(r7);
            r0 = "key";
            kotlin.jvm.internal.i.f(r8, r0);	 Catch:{ all -> 0x0096 }
            r0 = r7.eD(r8);	 Catch:{ all -> 0x0096 }
            r1 = r0.iterator();	 Catch:{ all -> 0x0096 }
            r2 = 0;
            r3 = 0;
        L_0x0010:
            r4 = r1.hasNext();	 Catch:{ all -> 0x0096 }
            r5 = -1;
            r6 = 1;
            if (r4 == 0) goto L_0x002d;
        L_0x0018:
            r4 = r1.next();	 Catch:{ all -> 0x0096 }
            r4 = (com.iqoption.charttools.model.indicator.h) r4;	 Catch:{ all -> 0x0096 }
            r4 = r4.getIndex();	 Catch:{ all -> 0x0096 }
            if (r4 != r9) goto L_0x0026;
        L_0x0024:
            r4 = 1;
            goto L_0x0027;
        L_0x0026:
            r4 = 0;
        L_0x0027:
            if (r4 == 0) goto L_0x002a;
        L_0x0029:
            goto L_0x002e;
        L_0x002a:
            r3 = r3 + 1;
            goto L_0x0010;
        L_0x002d:
            r3 = -1;
        L_0x002e:
            if (r3 == r5) goto L_0x008a;
        L_0x0030:
            r1 = r0.get(r3);	 Catch:{ all -> 0x0096 }
            r1 = (com.iqoption.charttools.model.indicator.h) r1;	 Catch:{ all -> 0x0096 }
            r1 = r1.MH();	 Catch:{ all -> 0x0096 }
            r1 = r1.Od();	 Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0086;
        L_0x0040:
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0096 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0096 }
            r1.<init>();	 Catch:{ all -> 0x0096 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0096 }
            r0 = r0.iterator();	 Catch:{ all -> 0x0096 }
        L_0x004d:
            r3 = r0.hasNext();	 Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0082;
        L_0x0053:
            r3 = r0.next();	 Catch:{ all -> 0x0096 }
            r4 = r3;
            r4 = (com.iqoption.charttools.model.indicator.h) r4;	 Catch:{ all -> 0x0096 }
            r5 = r4.getIndex();	 Catch:{ all -> 0x0096 }
            if (r5 == r9) goto L_0x007b;
        L_0x0060:
            r5 = r4.MH();	 Catch:{ all -> 0x0096 }
            r5 = r5 instanceof com.iqoption.charttools.model.indicator.k;	 Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0079;
        L_0x0068:
            r5 = r4.MH();	 Catch:{ all -> 0x0096 }
            r5 = (com.iqoption.charttools.model.indicator.k) r5;	 Catch:{ all -> 0x0096 }
            r4 = r4.Oh();	 Catch:{ all -> 0x0096 }
            r4 = r5.a(r4);	 Catch:{ all -> 0x0096 }
            if (r4 != r9) goto L_0x0079;
        L_0x0078:
            goto L_0x007b;
        L_0x0079:
            r4 = 0;
            goto L_0x007c;
        L_0x007b:
            r4 = 1;
        L_0x007c:
            if (r4 != 0) goto L_0x004d;
        L_0x007e:
            r1.add(r3);	 Catch:{ all -> 0x0096 }
            goto L_0x004d;
        L_0x0082:
            r0 = r1;
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x0096 }
            goto L_0x008a;
        L_0x0086:
            r0 = com.iqoption.core.ext.c.b(r0, r3);	 Catch:{ all -> 0x0096 }
        L_0x008a:
            r9 = r7.aCT;	 Catch:{ all -> 0x0096 }
            r9 = (java.util.Map) r9;	 Catch:{ all -> 0x0096 }
            r9.put(r8, r0);	 Catch:{ all -> 0x0096 }
            r7.eC(r8);	 Catch:{ all -> 0x0096 }
            monitor-exit(r7);
            return r0;
        L_0x0096:
            r8 = move-exception;
            monitor-exit(r7);
            goto L_0x009a;
        L_0x0099:
            throw r8;
        L_0x009a:
            goto L_0x0099;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.f$a.w(java.lang.String, int):java.util.List");
        }

        public final synchronized void Mf() {
            String jsonArray;
            Set<Entry> entrySet = this.aCT.entrySet();
            kotlin.jvm.internal.i.e(entrySet, "map.entries");
            for (Entry entry : entrySet) {
                String str = (String) entry.getKey();
                List<com.iqoption.charttools.model.indicator.h> list = (List) entry.getValue();
                com.iqoption.core.data.a.a aVar = this.aCR;
                kotlin.jvm.internal.i.e(str, "key");
                JsonArray jsonArray2 = new JsonArray();
                kotlin.jvm.internal.i.e(list, "indicators");
                for (com.iqoption.charttools.model.indicator.h hVar : list) {
                    JsonObject jsonObject = new JsonObject();
                    k.aDB.a(jsonObject, hVar);
                    jsonArray2.add((JsonElement) jsonObject);
                }
                jsonArray = jsonArray2.toString();
                kotlin.jvm.internal.i.e(jsonArray, "JsonArray().apply {\n    …             }.toString()");
                aVar.ae(str, jsonArray);
                this.aCU.remove(str);
            }
            for (String jsonArray3 : this.aCU) {
                this.aCR.remove(jsonArray3);
            }
            this.aCU.clear();
        }

        public final synchronized void eF(String str) {
            kotlin.jvm.internal.i.f(str, "key");
            List<com.iqoption.charttools.model.indicator.h> list = (List) this.aCT.get(str);
            if (list != null) {
                com.iqoption.core.data.a.a aVar = this.aCR;
                JsonArray jsonArray = new JsonArray();
                for (com.iqoption.charttools.model.indicator.h hVar : list) {
                    JsonObject jsonObject = new JsonObject();
                    k.aDB.a(jsonObject, hVar);
                    jsonArray.add((JsonElement) jsonObject);
                }
                String jsonArray2 = jsonArray.toString();
                kotlin.jvm.internal.i.e(jsonArray2, "JsonArray().apply {\n    …             }.toString()");
                aVar.ae(str, jsonArray2);
            } else if (this.aCU.contains(str)) {
                this.aCR.remove(str);
                this.aCU.remove(str);
            }
        }

        public final int Mg() {
            return this.aCS.incrementAndGet();
        }

        private final List<com.iqoption.charttools.model.indicator.h> eG(String str) {
            String r = this.aCR.r(str);
            List<com.iqoption.charttools.model.indicator.h> list = null;
            if (r != null) {
                try {
                    Map linkedHashMap = new LinkedHashMap();
                    JsonArray<JsonElement> jsonArray = (JsonArray) com.iqoption.core.ext.d.a(r, JsonArray.class, null, 2, null);
                    if (jsonArray != null) {
                        Collection arrayList = new ArrayList();
                        for (JsonElement jsonElement : jsonArray) {
                            Object a;
                            kotlin.jvm.internal.i.e(jsonElement, "json");
                            if (jsonElement.isJsonObject()) {
                                k kVar = k.aDB;
                                j jVar = this.aCV;
                                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                                kotlin.jvm.internal.i.e(asJsonObject, "json.asJsonObject");
                                a = kVar.a(jVar, asJsonObject);
                            } else {
                                a = null;
                            }
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        Iterable<com.iqoption.charttools.model.indicator.h> iterable = (List) arrayList;
                        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                        for (com.iqoption.charttools.model.indicator.h hVar : iterable) {
                            int Mg = Mg();
                            linkedHashMap.put(Integer.valueOf(hVar.getIndex()), Integer.valueOf(Mg));
                            x MH = hVar.MH();
                            JsonArray deepCopy = hVar.Oh().deepCopy();
                            if (MH instanceof com.iqoption.charttools.model.indicator.k) {
                                com.iqoption.charttools.model.indicator.k kVar2 = (com.iqoption.charttools.model.indicator.k) MH;
                                kotlin.jvm.internal.i.e(deepCopy, "this");
                                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(kVar2.a(deepCopy)));
                                int intValue = num != null ? num.intValue() : -1;
                                if (intValue != -1) {
                                    ((com.iqoption.charttools.model.indicator.k) MH).a(intValue, deepCopy);
                                }
                            }
                            kotlin.jvm.internal.i.e(deepCopy, "indicator.values.deepCop…                        }");
                            arrayList2.add(com.iqoption.charttools.model.indicator.h.a(hVar, null, Mg, false, deepCopy, 5, null));
                        }
                        list = (List) arrayList2;
                    }
                } catch (Throwable unused) {
                    this.aCR.remove(str);
                }
                if (list == null) {
                    if ((((CharSequence) r).length() > 0 ? 1 : null) != null) {
                        this.aCR.remove(str);
                    }
                }
            }
            return list;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "apply"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ JsonArray $values;
        final /* synthetic */ x aCX;
        final /* synthetic */ String aCY;

        b(x xVar, JsonArray jsonArray, String str) {
            this.aCX = xVar;
            this.$values = jsonArray;
            this.aCY = str;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(a((a) obj));
        }

        public final int a(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "helper");
            int Mg = aVar.Mg();
            com.iqoption.charttools.model.indicator.h hVar = new com.iqoption.charttools.model.indicator.h(this.aCX, Mg, false, this.$values);
            List a = aVar.a(this.aCY, hVar);
            if (f.aCQ.Me()) {
                aVar.a("all", hVar);
            }
            f.aCP.onNext(new a(this.aCY, a, hVar));
            return Mg;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class c<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ int $activeId;
        final /* synthetic */ String aCY;
        final /* synthetic */ com.iqoption.charttools.model.b.a aCZ;

        c(com.iqoption.charttools.model.b.a aVar, int i, String str) {
            this.aCZ = aVar;
            this.$activeId = i;
            this.aCY = str;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            Iterable<com.iqoption.charttools.model.indicator.h> LV = this.aCZ.LV();
            Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(LV, 10)), 16));
            for (com.iqoption.charttools.model.indicator.h index : LV) {
                Pair x = kotlin.j.x(Integer.valueOf(index.getIndex()), Integer.valueOf(aVar.Mg()));
                linkedHashMap.put(x.getFirst(), x.bni());
            }
            Collection arrayList = new ArrayList();
            Iterator it = this.aCZ.LV().iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                com.iqoption.charttools.model.indicator.h hVar = (com.iqoption.charttools.model.indicator.h) it.next();
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(hVar.getIndex()));
                if (num != null) {
                    obj = com.iqoption.charttools.model.indicator.h.a(hVar, null, num.intValue(), false, null, 13, null);
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            List list = (List) arrayList;
            Collection arrayList2 = new ArrayList();
            for (com.iqoption.charttools.model.indicator.h hVar2 : this.aCZ.Ms()) {
                Object obj2;
                x MH = hVar2.MH();
                if (!(MH instanceof com.iqoption.charttools.model.indicator.k)) {
                    MH = null;
                }
                com.iqoption.charttools.model.indicator.k kVar = (com.iqoption.charttools.model.indicator.k) MH;
                if (kVar == null || kVar.b(hVar2.Oh()) != this.$activeId) {
                    obj2 = null;
                } else {
                    int Mg = aVar.Mg();
                    Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(kVar.a(hVar2.Oh())));
                    int intValue = num2 != null ? num2.intValue() : -1;
                    JsonArray deepCopy = hVar2.Oh().deepCopy();
                    if (intValue != -1) {
                        kotlin.jvm.internal.i.e(deepCopy, "this");
                        kVar.a(intValue, deepCopy);
                    }
                    kotlin.jvm.internal.i.e(deepCopy, "figure.values.deepCopy()…                        }");
                    obj2 = com.iqoption.charttools.model.indicator.h.a(hVar2, null, Mg, false, deepCopy, 5, null);
                }
                if (obj2 != null) {
                    arrayList2.add(obj2);
                }
            }
            List b = u.b((Collection) list, (Iterable) (List) arrayList2);
            aVar.b(this.aCY, b);
            if (f.aCQ.Me()) {
                aVar.b("all", b);
            }
            f.aCP.onNext(new d(this.aCY, b));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/charttools/ActiveIndicatorEvent;", "test"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class d<T> implements io.reactivex.b.l<b> {
        final /* synthetic */ String aCY;

        d(String str) {
            this.aCY = str;
        }

        /* renamed from: a */
        public final boolean test(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return kotlin.jvm.internal.i.y(bVar.getKey(), this.aCY);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "apply"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ String aCY;

        e(String str) {
            this.aCY = str;
        }

        /* renamed from: c */
        public final List<com.iqoption.charttools.model.indicator.h> apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "helper");
            if (!f.aCQ.Me()) {
                return aVar.eD(this.aCY);
            }
            List<com.iqoption.charttools.model.indicator.h> eD = aVar.eD("all");
            aVar.b(this.aCY, eD);
            return eD;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "it", "Lcom/iqoption/charttools/ActiveIndicatorEvent;", "apply"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f aDa = new f();

        f() {
        }

        /* renamed from: b */
        public final List<com.iqoption.charttools.model.indicator.h> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.LV();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class g<T> implements io.reactivex.b.f<a> {
        public static final g aDd = new g();

        g() {
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            aVar.Mf();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class h<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ String aCY;
        final /* synthetic */ int aDe;

        h(String str, int i) {
            this.aCY = str;
            this.aDe = i;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            List w = aVar.w(this.aCY, this.aDe);
            if (f.aCQ.Me()) {
                aVar.w("all", this.aDe);
            }
            f.aCP.onNext(new c(this.aCY, w, this.aDe));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class i<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ String aCY;

        i(String str) {
            this.aCY = str;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            aVar.eE(this.aCY);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class j<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ String aCY;
        final /* synthetic */ List aDf;

        j(String str, List list) {
            this.aCY = str;
            this.aDf = list;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            aVar.b(this.aCY, this.aDf);
            if (f.aCQ.Me()) {
                aVar.b("all", this.aDf);
            }
            f.aCP.onNext(new d(this.aCY, this.aDf));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class k implements io.reactivex.b.a {
        final /* synthetic */ boolean aDg;

        k(boolean z) {
            this.aDg = z;
        }

        public final void run() {
            f.ayf.put("apply_to_all_assets", this.aDg);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class l<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ String aCY;

        l(String str) {
            this.aCY = str;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            aVar.b("all", aVar.eD(this.aCY));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "helper", "Lcom/iqoption/charttools/ActiveIndicatorsManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveIndicatorsManager.kt */
    static final class m<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ JsonArray $values;
        final /* synthetic */ String aCY;
        final /* synthetic */ int aDe;
        final /* synthetic */ Boolean aDh;
        final /* synthetic */ boolean aDi;

        m(String str, int i, Boolean bool, JsonArray jsonArray, boolean z) {
            this.aCY = str;
            this.aDe = i;
            this.aDh = bool;
            this.$values = jsonArray;
            this.aDi = z;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            for (Object next : aVar.eD(this.aCY)) {
                Object obj;
                if (((com.iqoption.charttools.model.indicator.h) next).getIndex() == this.aDe) {
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
            com.iqoption.charttools.model.indicator.h hVar = (com.iqoption.charttools.model.indicator.h) next2;
            if (hVar != null) {
                com.iqoption.charttools.model.indicator.h a;
                Boolean bool = this.aDh;
                if (bool == null || this.$values == null) {
                    bool = this.aDh;
                    if (bool != null) {
                        a = com.iqoption.charttools.model.indicator.h.a(hVar, null, 0, bool.booleanValue(), null, 11, null);
                    } else {
                        JsonArray jsonArray = this.$values;
                        if (jsonArray != null) {
                            a = com.iqoption.charttools.model.indicator.h.a(hVar, null, 0, false, jsonArray, 7, null);
                        } else {
                            throw new IllegalArgumentException("Nothing to update");
                        }
                    }
                }
                a = com.iqoption.charttools.model.indicator.h.a(hVar, null, 0, bool.booleanValue(), this.$values, 3, null);
                com.iqoption.charttools.model.indicator.h hVar2 = a;
                List a2 = aVar.a(this.aCY, hVar2);
                if (f.aCQ.Me()) {
                    aVar.a("all", hVar2);
                }
                f.aCP.onNext(new e(this.aCY, a2, hVar2, this.aDi, this.$values != null));
            }
        }
    }

    private final BehaviorProcessor<Boolean> LZ() {
        return (BehaviorProcessor) aCN.b(this, anY[0]);
    }

    private final p<a> Ma() {
        kotlin.d dVar = aCO;
        kotlin.reflect.j jVar = anY[1];
        return (p) dVar.getValue();
    }

    private final void a(BehaviorProcessor<Boolean> behaviorProcessor) {
        aCN.a(this, anY[0], behaviorProcessor);
    }

    static {
        io.reactivex.processors.a bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<…orEvent>().toSerialized()");
        aCP = bmJ;
    }

    private f() {
    }

    public final io.reactivex.e<b> ex(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        io.reactivex.e b = aCP.b((io.reactivex.b.l) new d(str));
        kotlin.jvm.internal.i.e(b, "eventsProcessor.filter { it.key == key }");
        return b;
    }

    public final io.reactivex.a Mb() {
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) g.aDd).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final p<List<com.iqoption.charttools.model.indicator.h>> ey(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        p t = Ma().t(new e(str));
        kotlin.jvm.internal.i.e(t, "helperStream\n           …      }\n                }");
        return t;
    }

    public final io.reactivex.e<List<com.iqoption.charttools.model.indicator.h>> ez(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        io.reactivex.e c = ey(str).bkO().c((org.a.b) ex(str).g(f.aDa));
        kotlin.jvm.internal.i.e(c, "getIndicators(key)\n     …y).map { it.indicators })");
        return c;
    }

    public final io.reactivex.a eA(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) new i(str)).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final p<Integer> a(String str, x xVar, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(xVar, "metaIndicator");
        kotlin.jvm.internal.i.f(jsonArray, "values");
        p t = Ma().t(new b(xVar, jsonArray, str));
        kotlin.jvm.internal.i.e(t, "helperStream\n           …      }\n                }");
        return t;
    }

    public static /* synthetic */ io.reactivex.a a(f fVar, String str, int i, Boolean bool, JsonArray jsonArray, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = (Boolean) null;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            jsonArray = (JsonArray) null;
        }
        return fVar.a(str, i, bool2, jsonArray, (i2 & 16) != 0 ? false : z);
    }

    public final io.reactivex.a a(String str, int i, Boolean bool, JsonArray jsonArray, boolean z) {
        kotlin.jvm.internal.i.f(str, "key");
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) new m(str, i, bool, jsonArray, z)).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a a(String str, List<com.iqoption.charttools.model.indicator.h> list) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(list, "indicators");
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) new j(str, list)).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a v(String str, int i) {
        kotlin.jvm.internal.i.f(str, "key");
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) new h(str, i)).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a eB(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        return a(str, m.emptyList());
    }

    public final io.reactivex.a a(String str, int i, com.iqoption.charttools.model.b.a aVar) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(aVar, "template");
        io.reactivex.a blf = Ma().h((io.reactivex.b.f) new c(aVar, i, str)).blf();
        kotlin.jvm.internal.i.e(blf, "helperStream\n           …         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.e<Boolean> Mc() {
        BehaviorProcessor LZ = LZ();
        if (LZ == null) {
            LZ = BehaviorProcessor.cX(Boolean.valueOf(Md()));
            aCQ.a(LZ);
            kotlin.jvm.internal.i.e(LZ, "BehaviorProcessor.create…eProcessor = it\n        }");
        }
        return LZ;
    }

    public final void bK(boolean z) {
        ayf.put("volume", z);
        BehaviorProcessor LZ = LZ();
        if (LZ != null) {
            LZ.onNext(Boolean.valueOf(z));
        }
    }

    public final boolean Md() {
        BehaviorProcessor LZ = LZ();
        if (LZ != null) {
            Boolean bool = (Boolean) LZ.getValue();
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return com.iqoption.core.data.d.c.b.a(ayf, "volume", false, 2, null);
    }

    public final io.reactivex.a k(String str, boolean z) {
        io.reactivex.a blf;
        kotlin.jvm.internal.i.f(str, "key");
        if (z) {
            blf = Ma().h((io.reactivex.b.f) new l(str)).blf();
        } else {
            blf = eA("all");
        }
        blf = blf.c((io.reactivex.b.a) new k(z));
        kotlin.jvm.internal.i.e(blf, "completable\n            …nabled)\n                }");
        return blf;
    }

    public final boolean Me() {
        return com.iqoption.core.data.d.c.b.a(ayf, "apply_to_all_assets", false, 2, null);
    }
}
