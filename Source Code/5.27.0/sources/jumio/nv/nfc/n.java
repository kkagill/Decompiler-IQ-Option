package jumio.nv.nfc;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import org.jmrtd.lds.icao.MRZInfo;

/* compiled from: PassportDataDetails */
public class n implements Serializable {
    private MRZInfo a;
    private l b;
    private m c;

    public void a(l lVar) {
        this.b = lVar;
    }

    public void a(m mVar) {
        this.c = mVar;
    }

    public void a(MRZInfo mRZInfo) {
        this.a = mRZInfo;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Additional document details: \n");
        m mVar = this.c;
        String str = "";
        stringBuilder.append(mVar != null ? mVar.toString() : str);
        l lVar = this.b;
        if (lVar != null) {
            str = lVar.toString();
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @Nullable
    public l a() {
        return this.b;
    }

    @Nullable
    public m b() {
        return this.c;
    }

    public MRZInfo c() {
        return this.a;
    }

    public int[] d() {
        int i = 0;
        if (b() == null && a() == null) {
            return new int[0];
        }
        SparseArray a;
        int i2;
        ArrayList arrayList = new ArrayList();
        m mVar = this.c;
        if (mVar != null) {
            a = mVar.a();
            for (i2 = 0; i2 < a.size(); i2++) {
                if (a.valueAt(i2) != null) {
                    arrayList.add(Integer.valueOf(a.keyAt(i2)));
                }
            }
        }
        l lVar = this.b;
        if (lVar != null) {
            a = lVar.a();
            for (i2 = 0; i2 < a.size(); i2++) {
                if (a.valueAt(i2) != null) {
                    arrayList.add(Integer.valueOf(a.keyAt(i2)));
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        while (i < arrayList.size()) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
            i++;
        }
        return iArr;
    }
}
