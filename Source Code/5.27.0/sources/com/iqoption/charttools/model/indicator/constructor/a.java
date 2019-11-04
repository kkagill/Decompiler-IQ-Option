package com.iqoption.charttools.model.indicator.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.iqoption.charttools.model.indicator.p;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.model.indicator.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019J\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "Landroid/os/Parcelable;", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "title", "", "groups", "", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "inputs", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "(Lcom/iqoption/charttools/model/indicator/MetaIndicator;Ljava/lang/String;[Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;[Lcom/iqoption/charttools/model/indicator/constructor/InputItem;)V", "getGroups", "()[Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "[Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "getInputs", "()[Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "[Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "getMeta", "()Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "getTitle", "()Ljava/lang/String;", "describeContents", "", "getDefaults", "", "values", "Lcom/google/gson/JsonArray;", "(Lcom/google/gson/JsonArray;)[Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "techtools_release"})
/* compiled from: Constructor.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    private static final a aJR = new a(p.aJo, "", new c[0], new InputItem[0]);
    public static final a aJS = new a();
    private final x aEL;
    private final c[] aJP;
    private final InputItem[] aJQ;
    private final String title;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/Constructor$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "getEMPTY", "()Lcom/iqoption/charttools/model/indicator/constructor/Constructor;", "techtools_release"})
    /* compiled from: Constructor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a OB() {
            return a.aJR;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            x xVar = (x) z.aJA.U(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            c[] cVarArr = new c[readInt];
            for (int i = 0; readInt > i; i++) {
                cVarArr[i] = (c) c.CREATOR.createFromParcel(parcel);
            }
            readInt = parcel.readInt();
            InputItem[] inputItemArr = new InputItem[readInt];
            for (int i2 = 0; readInt > i2; i2++) {
                inputItemArr[i2] = (InputItem) InputItem.CREATOR.createFromParcel(parcel);
            }
            return new a(xVar, readString, cVarArr, inputItemArr);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        kotlin.jvm.internal.i.f(parcel, "parcel");
        z.aJA.b(this.aEL, parcel, i);
        parcel.writeString(this.title);
        c[] cVarArr = this.aJP;
        int length = cVarArr.length;
        parcel.writeInt(length);
        for (i2 = 0; length > i2; i2++) {
            cVarArr[i2].writeToParcel(parcel, 0);
        }
        InputItem[] inputItemArr = this.aJQ;
        length = inputItemArr.length;
        parcel.writeInt(length);
        for (i2 = 0; length > i2; i2++) {
            inputItemArr[i2].writeToParcel(parcel, 0);
        }
    }

    public a(x xVar, String str, c[] cVarArr, InputItem[] inputItemArr) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(cVarArr, "groups");
        kotlin.jvm.internal.i.f(inputItemArr, "inputs");
        this.aEL = xVar;
        this.title = str;
        this.aJP = cVarArr;
        this.aJQ = inputItemArr;
    }

    public final c[] Oz() {
        return this.aJP;
    }

    public final List<String> Oy() {
        InputItem[] inputItemArr = this.aJQ;
        Collection arrayList = new ArrayList(inputItemArr.length);
        for (InputItem value : inputItemArr) {
            arrayList.add(value.getValue());
        }
        return (List) arrayList;
    }

    public final InputItem[] f(JsonArray jsonArray) {
        JsonArray jsonArray2 = jsonArray;
        if (jsonArray2 == null) {
            return this.aJQ;
        }
        InputItem[] inputItemArr = this.aJQ;
        Object[] copyOf = Arrays.copyOf(inputItemArr, inputItemArr.length);
        kotlin.jvm.internal.i.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        inputItemArr = (InputItem[]) copyOf;
        int length = inputItemArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            InputItem inputItem = inputItemArr[i];
            int i3 = i2 + 1;
            JsonElement jsonElement = jsonArray2.get(i2);
            kotlin.jvm.internal.i.e(jsonElement, "values[index]");
            String asString = jsonElement.getAsString();
            kotlin.jvm.internal.i.e(asString, "values[index].asString");
            inputItemArr[i2] = InputItem.a(inputItem, null, null, asString, null, null, null, null, false, 251, null);
            i++;
            i2 = i3;
        }
        return inputItemArr;
    }
}
