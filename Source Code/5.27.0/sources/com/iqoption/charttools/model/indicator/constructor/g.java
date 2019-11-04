package com.iqoption.charttools.model.indicator.constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\bJ@\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\bJB\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00132\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/InputsBuilder;", "", "()V", "groups", "", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroupBuilder;", "getGroups", "()Ljava/util/List;", "build", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "group", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "name", "", "description", "icon", "", "techtools_release"})
/* compiled from: InputBuilder.kt */
public final class g {
    private final List<d> aKc = new ArrayList();

    public final List<d> OS() {
        return this.aKc;
    }

    public final f OT() {
        List arrayList = new ArrayList();
        Iterable<d> iterable = this.aKc;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        int i = 0;
        for (d dVar : iterable) {
            arrayList.addAll(dVar.OE());
            String name = dVar.getName();
            String description = dVar.getDescription();
            String OD = dVar.OD();
            int[] iArr = new int[dVar.OE().size()];
            int length = iArr.length;
            int i2 = i;
            i = 0;
            while (i < length) {
                int i3 = i2 + 1;
                iArr[i] = i2;
                i++;
                i2 = i3;
            }
            arrayList2.add(new c(name, description, OD, iArr));
            i = i2;
        }
        Object[] toArray = ((List) arrayList2).toArray(new c[0]);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (toArray != null) {
            c[] cVarArr = (c[]) toArray;
            Object[] toArray2 = arrayList.toArray(new InputItem[0]);
            if (toArray2 != null) {
                return new f(cVarArr, (InputItem[]) toArray2);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }
}
