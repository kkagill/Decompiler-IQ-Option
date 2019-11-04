package jumio.nv.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MappingUtil */
public abstract class ae {
    protected HashMap<String, Long> a = new HashMap();

    public String a(ArrayList<String> arrayList) {
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            long j2;
            Long l = (Long) this.a.get((String) it.next());
            if (l == null) {
                j2 = 0;
            } else {
                j2 = l.longValue();
            }
            j += j2;
        }
        return Long.toHexString(j);
    }
}
