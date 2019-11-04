package com.iqoption.core.microservices.kyc.response.step;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "EMAIL", "PHONE", "PROFILE", "TIN", "KYC_QUESTIONNAIRE", "KYC_DOCUMENTS_POI", "KYC_DOCUMENTS_POA", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: KycStepType.kt */
public enum KycStepType {
    EMAIL(r2),
    PHONE(r2),
    PROFILE(r2),
    TIN(r2),
    KYC_QUESTIONNAIRE(r2),
    KYC_DOCUMENTS_POI(r2),
    KYC_DOCUMENTS_POA(r2),
    UNKNOWN("_UNKNOWN_TYPE");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/step/KycStepType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "value", "", "core_release"})
    /* compiled from: KycStepType.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final KycStepType fromServerValue(String str) {
            for (KycStepType kycStepType : KycStepType.values()) {
                if (u.v(kycStepType.getServerValue(), str, true)) {
                    break;
                }
            }
            KycStepType kycStepType2 = null;
            return kycStepType2 != null ? kycStepType2 : KycStepType.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/step/KycStepType$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: KycStepType.kt */
    public static final class a extends TypeAdapter<KycStepType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, KycStepType kycStepType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(kycStepType != null ? kycStepType.getServerValue() : null);
        }

        /* renamed from: L */
        public KycStepType read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return KycStepType.Companion.fromServerValue(jsonReader.nextString());
        }
    }

    public static final KycStepType fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private KycStepType(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
