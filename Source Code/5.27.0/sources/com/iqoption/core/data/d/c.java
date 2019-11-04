package com.iqoption.core.data.d;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ext.d;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\bf\u0018\u0000 52\u00020\u0001:\u00015J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\nH&J*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH&J*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH&J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0010H&J*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fH&J*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH&J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0014H&J*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fH&J*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH&J7\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H\u0018H\u0016¢\u0006\u0002\u0010\u001bJ%\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u001a\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020!H&J*\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\fH&J*\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eH&J\u001e\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH&J*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0010H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0014H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020!H&J\u001a\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0007H&J\u001e\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\fH&J\u001e\u0010*\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH&J\u001e\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\fH&J\u001e\u0010,\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u001e\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\fH&J\u001e\u0010.\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0016J\u001e\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\fH&J\u001e\u00101\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u000eH&J\u001e\u00102\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u001e\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH&J\u0010\u00104\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u00066"}, bng = {"Lcom/iqoption/core/data/prefs/Prefs;", "", "clear", "", "getBool", "", "key", "", "def", "getDouble", "", "getDoubleList", "", "getDoubleSet", "", "getFloat", "", "getFloatList", "getFloatSet", "getInt", "", "getIntList", "getIntSet", "getJson", "T", "cls", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "getKeys", "getLong", "", "getLongList", "getLongSet", "getString", "getStringList", "getStringSet", "put", "v", "putDoubleList", "putDoubleSet", "putFloatList", "putFloatSet", "putIntList", "putIntSet", "putJson", "putLongList", "putLongSet", "putStringList", "putStringSet", "remove", "Companion", "core_release"})
/* compiled from: Prefs.kt */
public interface c {
    public static final a bdl = a.bdn;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/data/prefs/Prefs$Companion;", "", "()V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/iqoption/core/data/prefs/Prefs;", "get", "name", "core_release"})
    /* compiled from: Prefs.kt */
    public static final class a {
        private static final ConcurrentHashMap<String, c> bdm = new ConcurrentHashMap();
        static final /* synthetic */ a bdn = new a();

        private a() {
        }

        public final c fL(String str) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            c cVar = (c) bdm.get(str);
            if (cVar != null) {
                return cVar;
            }
            d dVar = new d(str);
            bdm.put(str, dVar);
            return dVar;
        }
    }

    @i(bne = {1, 1, 15})
    /* compiled from: Prefs.kt */
    public static final class b {
        public static void a(c cVar, String str, Object obj) {
            kotlin.jvm.internal.i.f(str, "key");
            kotlin.jvm.internal.i.f(obj, "v");
            cVar.put(str, d.a(obj, com.iqoption.core.d.Ez()));
        }

        public static /* synthetic */ Object a(c cVar, String str, Class cls, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    obj = null;
                }
                return cVar.a(str, cls, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getJson");
        }

        public static <T> T a(c cVar, String str, Class<T> cls, T t) {
            kotlin.jvm.internal.i.f(str, "key");
            kotlin.jvm.internal.i.f(cls, "cls");
            return com.iqoption.core.d.Ez().fromJson(a(cVar, str, null, 2, null), (Class) cls);
        }
    }

    <T> T a(String str, Class<T> cls, T t);

    Set<Integer> a(String str, Set<Integer> set);

    void clear();

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    boolean n(String str, boolean z);

    void put(String str, int i);

    void put(String str, long j);

    void put(String str, String str2);

    void put(String str, boolean z);

    void remove(String str);
}
