package com.iqoption.core.microservices.f.a.a;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000fR&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/topassets/response/spread/SpreadDataResult;", "", "()V", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "data", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "Lkotlin/collections/ArrayList;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getResult", "", "", "core_release"})
/* compiled from: SpreadDataResult.kt */
public final class b {
    @SerializedName("data")
    private final ArrayList<a> bzi;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;

    public b(InstrumentType instrumentType, ArrayList<a> arrayList) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(arrayList, "data");
        this.instrumentType = instrumentType;
        this.bzi = arrayList;
    }

    public /* synthetic */ b(InstrumentType instrumentType, ArrayList arrayList, int i, f fVar) {
        if ((i & 1) != 0) {
            instrumentType = InstrumentType.UNKNOWN;
        }
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        this(instrumentType, arrayList);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public b() {
        this(InstrumentType.UNKNOWN, null, 2, null);
    }

    public final Map<Integer, a> ahE() {
        a aVar = new a();
        Iterator it = this.bzi.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            aVar2.M(this.instrumentType);
            aVar.m(Integer.valueOf(aVar2.getActiveId()), aVar2);
        }
        ImmutableMap tf = aVar.tf();
        kotlin.jvm.internal.i.e(tf, "result.build()");
        return tf;
    }
}
