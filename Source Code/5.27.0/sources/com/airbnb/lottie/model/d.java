package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath */
public class d {
    private final List<String> ht;
    @Nullable
    private e hu;

    public d(String... strArr) {
        this.ht = Arrays.asList(strArr);
    }

    private d(d dVar) {
        this.ht = new ArrayList(dVar.ht);
        this.hu = dVar.hu;
    }

    @CheckResult
    @RestrictTo({Scope.LIBRARY})
    public d x(String str) {
        d dVar = new d(this);
        dVar.ht.add(str);
        return dVar;
    }

    @RestrictTo({Scope.LIBRARY})
    public d a(e eVar) {
        d dVar = new d(this);
        dVar.hu = eVar;
        return dVar;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public e bk() {
        return this.hu;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean a(String str, int i) {
        if (y(str)) {
            return true;
        }
        if (i >= this.ht.size()) {
            return false;
        }
        if (((String) this.ht.get(i)).equals(str) || ((String) this.ht.get(i)).equals("**") || ((String) this.ht.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    @RestrictTo({Scope.LIBRARY})
    public int b(String str, int i) {
        if (y(str)) {
            return 0;
        }
        if (!((String) this.ht.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.ht.size() - 1 && ((String) this.ht.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean c(String str, int i) {
        boolean z = false;
        if (i >= this.ht.size()) {
            return false;
        }
        Object obj = i == this.ht.size() - 1 ? 1 : null;
        String str2 = (String) this.ht.get(i);
        if (str2.equals("**")) {
            Object obj2 = (obj == null && ((String) this.ht.get(i + 1)).equals(str)) ? 1 : null;
            if (obj2 != null) {
                if (i == this.ht.size() - 2 || (i == this.ht.size() - 3 && bl())) {
                    z = true;
                }
                return z;
            } else if (obj != null) {
                return true;
            } else {
                i++;
                if (i < this.ht.size() - 1) {
                    return false;
                }
                return ((String) this.ht.get(i)).equals(str);
            }
        }
        Object obj3 = (str2.equals(str) || str2.equals("*")) ? 1 : null;
        if ((obj != null || (i == this.ht.size() - 2 && bl())) && obj3 != null) {
            z = true;
        }
        return z;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean d(String str, int i) {
        boolean z = true;
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.ht.size() - 1 && !((String) this.ht.get(i)).equals("**")) {
            z = false;
        }
        return z;
    }

    private boolean y(String str) {
        return "__container".equals(str);
    }

    private boolean bl() {
        List list = this.ht;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyPath{keys=");
        stringBuilder.append(this.ht);
        stringBuilder.append(",resolved=");
        stringBuilder.append(this.hu != null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
