package com.iqoption.core.microservices.tradingengine.response.instrument;

import com.google.gson.stream.JsonReader;
import com.iqoption.core.data.model.InstrumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/ExpirationsJsonParser;", "Lkotlin/Function1;", "Lcom/google/gson/stream/JsonReader;", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/ExpirationsResponse;", "()V", "invoke", "reader", "parseExpiration", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration;", "Companion", "core_release"})
/* compiled from: ExpirationsJsonParser.kt */
public class b implements kotlin.jvm.a.b<JsonReader, c> {
    private static final String TAG = b.class.getSimpleName();
    @Deprecated
    public static final a bAO = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/ExpirationsJsonParser$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "core_release"})
    /* compiled from: ExpirationsJsonParser.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* renamed from: T */
    public c invoke(JsonReader jsonReader) {
        kotlin.jvm.internal.i.f(jsonReader, "reader");
        InstrumentType instrumentType = InstrumentType.UNKNOWN;
        List arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1770633379) {
                    if (hashCode != -837465425) {
                        if (hashCode == 3575610 && nextName.equals("type")) {
                            instrumentType = InstrumentType.Companion.fromServerValue(jsonReader.nextString());
                        }
                    } else if (nextName.equals("expiration")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            try {
                                arrayList.add(U(jsonReader));
                            } catch (Exception unused) {
                            }
                        }
                        jsonReader.endArray();
                    }
                } else if (nextName.equals("underlying")) {
                    str = jsonReader.nextString();
                    kotlin.jvm.internal.i.e(str, "reader.nextString()");
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new c(instrumentType, str, arrayList);
    }

    /* Access modifiers changed, original: protected */
    public a U(JsonReader jsonReader) {
        kotlin.jvm.internal.i.f(jsonReader, "reader");
        jsonReader.beginObject();
        long j = 0;
        long j2 = j;
        long j3 = j2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1578881592) {
                    if (hashCode != -991726143) {
                        if (hashCode == 3560141 && nextName.equals("time")) {
                            j = jsonReader.nextLong();
                        }
                    } else if (nextName.equals("period")) {
                        j2 = jsonReader.nextLong() * ((long) 1000);
                    }
                } else if (nextName.equals("dead_time")) {
                    j3 = jsonReader.nextLong() * ((long) 1000);
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new a(j, j2, j3, null, 8, null);
    }
}
