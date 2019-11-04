package com.iqoption.core.microservices.kyc.response.questionnaire;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getServerValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "ECONOMIC_PROFILE", "APPROPRIATENESS_ASSESSMENT", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: QuestionnaireType.kt */
public enum QuestionnaireType {
    ECONOMIC_PROFILE(Integer.valueOf(1)),
    APPROPRIATENESS_ASSESSMENT(Integer.valueOf(2)),
    UNKNOWN(Integer.valueOf(-1));
    
    public static final b Companion = null;
    private final Integer serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "value", "", "(Ljava/lang/Integer;)Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "core_release"})
    /* compiled from: QuestionnaireType.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final QuestionnaireType fromServerValue(Integer num) {
            if (num == null) {
                return QuestionnaireType.UNKNOWN;
            }
            Enum enumR = QuestionnaireType.UNKNOWN;
            for (QuestionnaireType questionnaireType : QuestionnaireType.values()) {
                if (kotlin.jvm.internal.i.y(questionnaireType.getServerValue(), num)) {
                    break;
                }
            }
            QuestionnaireType questionnaireType2 = null;
            Enum enumR2 = questionnaireType2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (QuestionnaireType) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "questionnaireType", "core_release"})
    /* compiled from: QuestionnaireType.kt */
    public static final class a extends TypeAdapter<QuestionnaireType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, QuestionnaireType questionnaireType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (questionnaireType == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value((Number) questionnaireType.getServerValue());
            }
        }

        /* renamed from: D */
        public QuestionnaireType read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return QuestionnaireType.Companion.fromServerValue(Integer.valueOf(jsonReader.nextInt()));
        }
    }

    public static final QuestionnaireType fromServerValue(Integer num) {
        return Companion.fromServerValue(num);
    }

    private QuestionnaireType(Integer num) {
        this.serverValue = num;
    }

    public final Integer getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
