package com.iqoption.core.microservices.kyc.response.questionnaire;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "QUESTIONNAIRE", "RISK_WARNING", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: QuestionnaireAction.kt */
public enum QuestionnaireAction {
    QUESTIONNAIRE(r2),
    RISK_WARNING(r2),
    UNKNOWN("_UNKNOWN_TYPE");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;", "value", "", "core_release"})
    /* compiled from: QuestionnaireAction.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final QuestionnaireAction fromServerValue(String str) {
            QuestionnaireAction questionnaireAction = null;
            if (str == null) {
                return null;
            }
            Enum enumR = QuestionnaireAction.UNKNOWN;
            for (QuestionnaireAction questionnaireAction2 : QuestionnaireAction.values()) {
                if (kotlin.jvm.internal.i.y(questionnaireAction2.getServerValue(), str)) {
                    questionnaireAction = questionnaireAction2;
                    break;
                }
            }
            Enum enumR2 = questionnaireAction;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (QuestionnaireAction) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "questionnaireAction", "core_release"})
    /* compiled from: QuestionnaireAction.kt */
    public static final class a extends TypeAdapter<QuestionnaireAction> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, QuestionnaireAction questionnaireAction) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (questionnaireAction == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(questionnaireAction.getServerValue());
            }
        }

        /* renamed from: C */
        public QuestionnaireAction read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return QuestionnaireAction.Companion.fromServerValue(jsonReader.nextString());
        }
    }

    public static final QuestionnaireAction fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private QuestionnaireAction(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
