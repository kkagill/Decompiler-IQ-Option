package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: BinaryVersion.kt */
public abstract class a {
    public static final a fno = new a();
    private final int fnl;
    private final List<Integer> fnm;
    private final int[] fnn;
    private final int major;
    private final int minor;

    /* compiled from: BinaryVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public a(int... iArr) {
        i.f(iArr, "numbers");
        this.fnn = iArr;
        Integer d = i.d(this.fnn, 0);
        int i = -1;
        this.major = d != null ? d.intValue() : -1;
        d = i.d(this.fnn, 1);
        this.minor = d != null ? d.intValue() : -1;
        d = i.d(this.fnn, 2);
        if (d != null) {
            i = d.intValue();
        }
        this.fnl = i;
        iArr = this.fnn;
        this.fnm = iArr.length > 3 ? u.T(h.k(iArr).subList(3, this.fnn.length)) : m.emptyList();
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int[] toArray() {
        return this.fnn;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(a aVar) {
        i.f(aVar, "ourVersion");
        int i = this.major;
        if (i == 0) {
            if (aVar.major == 0 && this.minor == aVar.minor) {
                return true;
            }
        } else if (i == aVar.major && this.minor <= aVar.minor) {
            return true;
        }
        return false;
    }

    public final boolean b(a aVar) {
        i.f(aVar, "version");
        return C(aVar.major, aVar.minor, aVar.fnl);
    }

    public final boolean C(int i, int i2, int i3) {
        int i4 = this.major;
        boolean z = true;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        i = this.minor;
        if (i > i2) {
            return true;
        }
        if (i < i2) {
            return false;
        }
        if (this.fnl < i3) {
            z = false;
        }
        return z;
    }

    public String toString() {
        int[] toArray = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : toArray) {
            if ((i != -1 ? 1 : null) == null) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        List list = arrayList;
        return list.isEmpty() ? "unknown" : u.a(list, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (obj != null && i.y(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.major == aVar.major && this.minor == aVar.minor && this.fnl == aVar.fnl && i.y(this.fnm, aVar.fnm)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.major;
        i += (i * 31) + this.minor;
        i += (i * 31) + this.fnl;
        return i + ((i * 31) + this.fnm.hashCode());
    }
}
