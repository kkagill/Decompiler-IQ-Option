package com.iqoption.core.data.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.d.c.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000eH\u0016J(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0016J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010H\u0016J(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0018H\u0016J(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010H\u0016J(\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u001dH\u0016J(\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010H\u0016J(\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012H\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016J(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0016J(\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\nH\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0014H\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001dH\u0016J\u001a\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0003H\u0016J\u001e\u0010%\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u001e\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J\u001e\u0010'\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u001e\u0010(\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\u001e\u0010)\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0016J\u001e\u0010*\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0016J\u001c\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u001e\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0016J\u001e\u0010-\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0016J\u001c\u0010.\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u001e\u0010/\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\u001e\u00100\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, bng = {"Lcom/iqoption/core/data/prefs/SharedPrefs;", "Lcom/iqoption/core/data/prefs/Prefs;", "name", "", "(Ljava/lang/String;)V", "sp", "Landroid/content/SharedPreferences;", "clear", "", "getBool", "", "key", "def", "getDouble", "", "getDoubleList", "", "getDoubleSet", "", "getFloat", "", "getFloatList", "getFloatSet", "getInt", "", "getIntList", "getIntSet", "getKeys", "getLong", "", "getLongList", "getLongSet", "getString", "getStringList", "getStringSet", "put", "v", "putDoubleList", "putDoubleSet", "putFloatList", "putFloatSet", "putIntList", "putIntSet", "putList", "putLongList", "putLongSet", "putSet", "putStringList", "putStringSet", "remove", "Companion", "core_release"})
/* compiled from: SharedPrefs.kt */
public final class d implements c {
    public static final a bdp = new a();
    private final SharedPreferences bdo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/data/prefs/SharedPrefs$Companion;", "", "()V", "LIST_SEPARATOR", "", "core_release"})
    /* compiled from: SharedPrefs.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        SharedPreferences sharedPreferences = com.iqoption.core.d.Uo().getApplicationContext().getSharedPreferences(str, 0);
        kotlin.jvm.internal.i.e(sharedPreferences, "appContext.applicationCo…me, Context.MODE_PRIVATE)");
        this.bdo = sharedPreferences;
    }

    public <T> T a(String str, Class<T> cls, T t) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(cls, "cls");
        return b.a(this, str, cls, t);
    }

    public void m(String str, Object obj) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(obj, "v");
        b.a(this, str, obj);
    }

    public void put(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "key");
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Editor putBoolean = edit.putBoolean(str, z);
        kotlin.jvm.internal.i.e(putBoolean, "putBoolean(key, v)");
        putBoolean.apply();
    }

    public void put(String str, int i) {
        kotlin.jvm.internal.i.f(str, "key");
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Editor putInt = edit.putInt(str, i);
        kotlin.jvm.internal.i.e(putInt, "putInt(key, v)");
        putInt.apply();
    }

    public void put(String str, long j) {
        kotlin.jvm.internal.i.f(str, "key");
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Editor putLong = edit.putLong(str, j);
        kotlin.jvm.internal.i.e(putLong, "putLong(key, v)");
        putLong.apply();
    }

    public void put(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "key");
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Editor putString = edit.putString(str, str2);
        kotlin.jvm.internal.i.e(putString, "putString(key, v)");
        putString.apply();
    }

    private final void b(String str, Set<?> set) {
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Collection linkedHashSet = new LinkedHashSet();
        for (Object valueOf : set) {
            linkedHashSet.add(String.valueOf(valueOf));
        }
        Editor putStringSet = edit.putStringSet(str, (Set) linkedHashSet);
        kotlin.jvm.internal.i.e(putStringSet, "putStringSet(key, v.mapT…tOf()) { it.toString() })");
        putStringSet.apply();
    }

    public void c(String str, Set<Integer> set) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(set, "v");
        b(str, set);
    }

    public boolean n(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "key");
        return this.bdo.getBoolean(str, z);
    }

    public int getInt(String str, int i) {
        kotlin.jvm.internal.i.f(str, "key");
        return this.bdo.getInt(str, i);
    }

    public long getLong(String str, long j) {
        kotlin.jvm.internal.i.f(str, "key");
        return this.bdo.getLong(str, j);
    }

    public String getString(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "key");
        return this.bdo.getString(str, str2);
    }

    public Set<Integer> a(String str, Set<Integer> set) {
        kotlin.jvm.internal.i.f(str, "key");
        Set<String> stringSet = this.bdo.getStringSet(str, null);
        if (stringSet == null) {
            return set;
        }
        Collection linkedHashSet = new LinkedHashSet();
        for (String str2 : stringSet) {
            kotlin.jvm.internal.i.e(str2, "it");
            Integer mW = t.mW(str2);
            if (mW != null) {
                linkedHashSet.add(mW);
            }
        }
        return (Set) linkedHashSet;
    }

    public void remove(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        Editor remove = edit.remove(str);
        kotlin.jvm.internal.i.e(remove, "remove(key)");
        remove.apply();
    }

    public void clear() {
        Editor edit = this.bdo.edit();
        kotlin.jvm.internal.i.e(edit, "edit()");
        edit = edit.clear();
        kotlin.jvm.internal.i.e(edit, "clear()");
        edit.apply();
    }
}
