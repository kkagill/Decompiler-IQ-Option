package com.iqoption.charttools.constructor;

import com.google.gson.JsonArray;
import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.charttools.model.indicator.constructor.b;
import com.iqoption.charttools.model.indicator.constructor.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J_\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, bng = {"Lcom/iqoption/charttools/constructor/InputAdapterItemsHelper;", "", "()V", "makeAdapterItems", "", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "inputs", "", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "groups", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "defaults", "", "hosts", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "canChooseHost", "", "onChanged", "Lkotlin/Function0;", "", "([Lcom/iqoption/charttools/model/indicator/constructor/InputItem;[Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function0;)Ljava/util/List;", "makeValues", "Lcom/google/gson/JsonArray;", "activeId", "", "items", "(I[Lcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/util/List;)Lcom/google/gson/JsonArray;", "getByInputIndex", "inputIndex", "([Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;I)Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "techtools_release"})
/* compiled from: InputAdapterItemsHelper.kt */
public final class g {
    public final List<f> a(InputItem[] inputItemArr, c[] cVarArr, List<String> list, List<b> list2, boolean z, a<l> aVar) {
        Object obj = inputItemArr;
        Object obj2 = cVarArr;
        List<String> list3 = list;
        List<b> list4 = list2;
        kotlin.jvm.internal.i.f(obj, "inputs");
        kotlin.jvm.internal.i.f(obj2, "groups");
        kotlin.jvm.internal.i.f(list3, "defaults");
        kotlin.jvm.internal.i.f(list4, "hosts");
        kotlin.jvm.internal.i.f(aVar, "onChanged");
        List arrayList = new ArrayList();
        c cVar = (c) null;
        int length = obj.length;
        Object obj3 = cVar;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            InputItem inputItem = obj[i4];
            int i5 = i + 1;
            if (!inputItem.OO()) {
                int i6;
                Object obj4;
                int i7;
                c a = a(obj2, i);
                if (i == 0 || (kotlin.jvm.internal.i.y(a, obj3) ^ 1) != 0) {
                    if (a != null) {
                        if ((((CharSequence) a.getName()).length() > 0 ? 1 : null) != null) {
                            i2++;
                            arrayList.add(new n(i2, com.iqoption.core.ext.c.fU(a.getName()), com.iqoption.core.ext.c.fU(a.getDescription()), a.getDescription() != null, false, a));
                            if (a.getDescription() != null) {
                                i2++;
                            }
                        }
                    }
                    i6 = i3 + 1;
                    obj4 = a;
                } else {
                    obj4 = obj3;
                    i6 = i3;
                }
                switch (h.aob[inputItem.OK().ordinal()]) {
                    case 1:
                    case 2:
                        i7 = i2 + 1;
                        arrayList.add(new i(i7, i6, inputItem, (String) list3.get(i), aVar));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        if (inputItem.ON() == null) {
                            i7 = i2 + 1;
                            arrayList.add(new l(i7, i6, inputItem, (String) list3.get(i), aVar));
                            break;
                        }
                        i7 = i2 + 1;
                        arrayList.add(new x(i7, i6, inputItem, (String) list3.get(i), aVar));
                        break;
                    case 6:
                    case 7:
                    case 8:
                        i2++;
                        arrayList.add(new u(i2, i6, inputItem, (String) list3.get(i), null, 0, 48, null));
                        break;
                    case 9:
                        i7 = i2 + 1;
                        arrayList.add(new k(i7, i6, inputItem, (String) list3.get(i), aVar));
                        break;
                    case 10:
                        i7 = i2 + 1;
                        arrayList.add(new t(i7, i6, inputItem, (String) list3.get(i), aVar));
                        break;
                    case 11:
                        if ((list4.isEmpty() ^ 1) == 0) {
                            i2++;
                            arrayList.add(new o(i2, i6, inputItem, (String) list3.get(i), false, null, 0, 112, null));
                            break;
                        }
                        int i8 = i2 + 1;
                        String str = (String) list3.get(i);
                        b[] bVarArr = new b[(list2.size() + 1)];
                        i2 = bVarArr.length;
                        for (i3 = 0; i3 < i2; i3++) {
                            b Nk;
                            if (i3 == 0) {
                                Nk = o.aFx.Nk();
                            } else {
                                Nk = (b) list4.get(i3 - 1);
                            }
                            bVarArr[i3] = Nk;
                        }
                        arrayList.add(new o(i8, i6, inputItem, str, z, bVarArr, 0, 64, null));
                        i2 = i8;
                        break;
                }
                i2 = i7;
                i3 = i6;
                obj3 = obj4;
                continue;
            }
            i4++;
            i = i5;
        }
        return arrayList;
    }

    private final c a(c[] cVarArr, int i) {
        if ((cVarArr.length == 0 ? 1 : null) != null) {
            return null;
        }
        for (c cVar : cVarArr) {
            int[] OC = cVar.OC();
            if (OC != null) {
                if (((OC.length == 0 ? 1 : 0) ^ 1) == 0) {
                    continue;
                } else if (i.l(OC) <= i && i.m(OC) >= i) {
                    return cVar;
                } else {
                    if (i.l(OC) > i) {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final JsonArray a(int i, InputItem[] inputItemArr, List<? extends f> list) {
        kotlin.jvm.internal.i.f(inputItemArr, "inputs");
        kotlin.jvm.internal.i.f(list, "items");
        Iterator it = n.f(n.b(u.Z(list), (kotlin.jvm.a.b) InputAdapterItemsHelper$makeValues$iterator$1.aFp), InputAdapterItemsHelper$makeValues$iterator$2.aFq).iterator();
        JsonArray jsonArray = new JsonArray();
        for (InputItem inputItem : inputItemArr) {
            InputItem inputItem2;
            if (!inputItem2.OO()) {
                inputItem2 = null;
            }
            if (inputItem2 == null) {
                inputItem2 = (InputItem) it.next();
            }
            switch (h.axg[inputItem2.OK().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    jsonArray.add((Number) Integer.valueOf(inputItem2.getIntValue()));
                    break;
                case 7:
                    jsonArray.add((Number) Long.valueOf(com.iqoption.core.ext.c.toUnsignedLong(inputItem2.getIntValue())));
                    break;
                case 8:
                    jsonArray.add((Number) Double.valueOf(inputItem2.OF()));
                    break;
                case 9:
                case 10:
                    jsonArray.add(Boolean.valueOf(inputItem2.OG()));
                    break;
                case 11:
                    jsonArray.add((Number) Integer.valueOf(inputItem2.getIntValue() != -1 ? inputItem2.getIntValue() : i));
                    break;
                default:
                    jsonArray.add(inputItem2.getValue());
                    break;
            }
        }
        return jsonArray;
    }
}
