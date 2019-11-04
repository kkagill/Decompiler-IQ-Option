package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder */
public class m {
    private final ArrayList<Object> eWe;

    public m(int i) {
        this.eWe = new ArrayList(i);
    }

    public void dg(Object obj) {
        if (obj != null) {
            Iterator it;
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = this.eWe;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.eWe, objArr);
                }
            } else if (obj instanceof Collection) {
                this.eWe.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.eWe.add(add);
                }
            } else if (obj instanceof Iterator) {
                it = (Iterator) obj;
                while (it.hasNext()) {
                    this.eWe.add(it.next());
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Don't know how to spread ");
                stringBuilder.append(obj.getClass());
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }

    public int size() {
        return this.eWe.size();
    }

    public void add(Object obj) {
        this.eWe.add(obj);
    }

    public Object[] toArray(Object[] objArr) {
        return this.eWe.toArray(objArr);
    }
}
