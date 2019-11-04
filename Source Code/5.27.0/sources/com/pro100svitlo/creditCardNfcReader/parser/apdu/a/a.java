package com.pro100svitlo.creditCardNfcReader.parser.apdu.a;

import com.pro100svitlo.creditCardNfcReader.iso7816emv.ITag;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.b;
import java.lang.reflect.Field;

/* compiled from: AnnotationData */
public class a implements Cloneable, Comparable<a> {
    private boolean aTm;
    private String bDJ;
    private ITag eGA;
    private boolean eGT;
    private int eGU;
    private Field field;
    private int index;
    private int size;

    /* renamed from: a */
    public int compareTo(a aVar) {
        return Integer.valueOf(this.index).compareTo(Integer.valueOf(aVar.getIndex()));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && this.index == ((a) obj).getIndex()) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean bgP() {
        return this.eGT;
    }

    public Field bgQ() {
        return this.field;
    }

    public int bgR() {
        return this.eGU;
    }

    public String getFormat() {
        return this.bDJ;
    }

    public void a(Field field) {
        this.field = field;
    }

    public ITag bgy() {
        return this.eGA;
    }

    public void a(c cVar) {
        this.eGU = cVar.bgY();
        this.bDJ = cVar.bgX();
        this.index = cVar.bgZ();
        this.eGT = cVar.bha();
        this.size = cVar.size();
        if (cVar.bhb() != null) {
            this.eGA = b.F(b.a.a.b.kX(cVar.bhb()));
        }
    }

    /* Access modifiers changed, original: protected */
    public Object clone() {
        a aVar = new a();
        aVar.eGU = this.eGU;
        aVar.field = this.field;
        aVar.bDJ = new String(this.bDJ);
        aVar.index = this.index;
        aVar.eGT = this.eGT;
        aVar.size = this.size;
        aVar.eGA = this.eGA;
        return aVar;
    }

    public boolean bgS() {
        return this.aTm;
    }

    public void fZ(boolean z) {
        this.aTm = z;
    }
}
