package com.iqoption.core.microservices.auth.response;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@JsonAdapter(JsonAdapterFactory.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/auth/response/ResponseOld;", "", "isSuccessful", "", "message", "(ZLjava/lang/Object;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "()Z", "getMessage", "()Ljava/lang/Object;", "JsonAdapterFactory", "core_release"})
/* compiled from: MessageResponse.kt */
public final class ResponseOld {
    private final boolean blS;
    private final Object blT;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/auth/response/ResponseOld$JsonAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", "T", "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "core_release"})
    /* compiled from: MessageResponse.kt */
    public static final class JsonAdapterFactory implements TypeAdapterFactory {

        @i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, bng = {"com/iqoption/core/microservices/auth/response/ResponseOld$JsonAdapterFactory$create$1", "Lcom/google/gson/TypeAdapter;", "getRawEventTypeAdapter", "T", "gson", "Lcom/google/gson/Gson;", "isSuccessful", "", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "core_release"})
        /* compiled from: MessageResponse.kt */
        public static final class a extends TypeAdapter<T> {
            final /* synthetic */ TypeAdapter blU;
            final /* synthetic */ Gson blV;

            @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/auth/response/ResponseOld$JsonAdapterFactory$create$1$getRawEventTypeAdapter$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "core_release"})
            /* compiled from: MessageResponse.kt */
            public static final class a extends TypeToken<List<? extends String>> {
                a() {
                }
            }

            a(TypeAdapter typeAdapter, Gson gson) {
                this.blU = typeAdapter;
                this.blV = gson;
            }

            public void write(JsonWriter jsonWriter, T t) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                ResponseOld responseOld = (ResponseOld) (!(t instanceof ResponseOld) ? null : t);
                if (responseOld != null) {
                    this.blU.write(jsonWriter, t);
                    a(this.blV, responseOld.isSuccessful()).write(jsonWriter, responseOld.Zl());
                }
            }

            public T read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                jsonReader.beginObject();
                boolean z = false;
                Object obj = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    JsonToken peek = jsonReader.peek();
                    if (nextName != null) {
                        int hashCode = nextName.hashCode();
                        if (hashCode != 954925063) {
                            if (hashCode == 1437640548 && nextName.equals("isSuccessful")) {
                                z = jsonReader.nextBoolean();
                            }
                        } else if (nextName.equals("message")) {
                            if (peek == JsonToken.BEGIN_OBJECT) {
                                obj = a(this.blV, z).read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return new ResponseOld(z, obj);
            }

            private final <T> TypeAdapter<T> a(Gson gson, boolean z) {
                TypeAdapter<T> adapter;
                if (z) {
                    adapter = gson.getAdapter((TypeToken) new a());
                } else {
                    adapter = gson.getAdapter(e.class);
                }
                if (adapter != null) {
                    return adapter;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.google.gson.TypeAdapter<T>");
            }
        }

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            kotlin.jvm.internal.i.f(gson, "gson");
            kotlin.jvm.internal.i.f(typeToken, "type");
            TypeAdapter nullSafe = new a(gson.getDelegateAdapter(this, typeToken), gson).nullSafe();
            kotlin.jvm.internal.i.e(nullSafe, "object : TypeAdapter<T>(…\n            }.nullSafe()");
            return nullSafe;
        }
    }

    public ResponseOld() {
        this(false, null, 3, null);
    }

    public ResponseOld(boolean z, Object obj) {
        this.blS = z;
        this.blT = obj;
    }

    public final boolean isSuccessful() {
        return this.blS;
    }

    public /* synthetic */ ResponseOld(boolean z, Object obj, int i, f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        this(z, obj);
    }

    public final Object Zl() {
        return this.blT;
    }
}
