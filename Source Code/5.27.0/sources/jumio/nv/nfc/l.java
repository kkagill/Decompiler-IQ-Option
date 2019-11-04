package jumio.nv.nfc;

import android.util.SparseArray;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.jmrtd.lds.icao.DG12File;

/* compiled from: MrtdDocumentDetails */
public class l implements Serializable {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final String d;
    public final List<String> e;
    public final String f;
    public Date g;
    public Date h;

    public l(DG12File dG12File) {
        try {
            this.g = new SimpleDateFormat("yyyyMMddhhmmss").parse(dG12File.bRT());
        } catch (Exception unused) {
        }
        try {
            this.h = new SimpleDateFormat("yyyyMMdd").parse(dG12File.bRO());
        } catch (Exception unused2) {
        }
        this.a = dG12File.bRQ();
        this.b = dG12File.bRR();
        this.c = dG12File.bRS();
        this.d = dG12File.bRN();
        this.e = dG12File.bRP();
        this.f = dG12File.bRU();
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        String str = "\n";
        String str2 = "";
        if (this.g != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.g.toString());
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.h != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.h.toString());
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.a != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.b != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("front image length: ");
            stringBuilder.append(this.b.length);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.c != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("back image length: ");
            stringBuilder.append(this.c.length);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.d != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.e != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(this.e));
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.f != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f);
            stringBuilder.append(str);
            str2 = stringBuilder.toString();
        }
        stringBuilder3.append(str2);
        return stringBuilder3.toString();
    }

    private String a(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(", ");
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder.toString();
    }

    public SparseArray<Object> a() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(13, this.g);
        sparseArray.put(14, this.h);
        sparseArray.put(15, this.a);
        sparseArray.put(16, this.b);
        sparseArray.put(17, this.c);
        sparseArray.put(18, this.d);
        sparseArray.put(19, this.e);
        sparseArray.put(20, this.f);
        return sparseArray;
    }
}
