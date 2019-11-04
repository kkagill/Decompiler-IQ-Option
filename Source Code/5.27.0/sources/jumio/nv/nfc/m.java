package jumio.nv.nfc;

import android.util.SparseArray;
import com.jumio.commons.log.Log;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.jmrtd.lds.icao.DG11File;

/* compiled from: MrtdPersonalDetails */
public class m implements Serializable {
    private static final String n = "m";
    public final String a;
    public final String b;
    public final List<String> c;
    public final List<String> d;
    public final List<String> e;
    public final String f;
    public final String g;
    public final List<String> h;
    public final String i;
    public final byte[] j;
    public final String k;
    public final String l;
    public Date m;

    public m(DG11File dG11File) {
        this.a = dG11File.bRM();
        try {
            this.m = new SimpleDateFormat("yyyyMMdd").parse(dG11File.bRE());
        } catch (Exception e) {
            Log.e(n, e);
        }
        this.b = dG11File.bRC();
        List bRD = dG11File.bRD();
        if (bRD != null && bRD.size() == 0) {
            bRD = null;
        }
        this.c = bRD;
        this.d = dG11File.bRL();
        this.e = dG11File.bRG();
        this.f = dG11File.getPersonalNumber();
        this.g = dG11File.bRJ();
        this.h = dG11File.bRF();
        this.i = dG11File.bRI();
        this.j = dG11File.bRK();
        this.k = dG11File.bRH();
        this.l = dG11File.getTitle();
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        String str = "\n";
        String str2 = "";
        if (this.a != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.m != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.m.toString());
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.b != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.c != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(this.c));
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.d != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(this.d));
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
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.g != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.g);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.h != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(this.h));
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.i != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.i);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.j != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(Arrays.toString(this.j));
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.k != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.k);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.l != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.l);
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
        sparseArray.put(0, this.a);
        sparseArray.put(1, this.m);
        sparseArray.put(2, this.b);
        sparseArray.put(3, this.c);
        sparseArray.put(4, this.d);
        sparseArray.put(5, this.e);
        sparseArray.put(6, this.f);
        sparseArray.put(7, this.g);
        sparseArray.put(8, this.h);
        sparseArray.put(9, this.i);
        sparseArray.put(10, this.j);
        sparseArray.put(11, this.k);
        sparseArray.put(12, this.l);
        return sparseArray;
    }
}
