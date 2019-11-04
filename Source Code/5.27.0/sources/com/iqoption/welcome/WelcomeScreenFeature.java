package com.iqoption.welcome;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/WelcomeScreenFeature;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DISABLED", "WELCOME1", "WELCOME2", "Adapter", "Companion", "welcome_release"})
/* compiled from: WelcomeScreenFeature.kt */
public enum WelcomeScreenFeature {
    DISABLED("disabled"),
    WELCOME1("welcome1"),
    WELCOME2("welcome2");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, bng = {"Lcom/iqoption/welcome/WelcomeScreenFeature$Companion;", "", "()V", "getWelcomeScreenFeature", "Lcom/iqoption/welcome/WelcomeScreenFeature;", "feature", "Lcom/iqoption/core/microservices/features/response/Feature;", "getWelcomeScreenFromStatus", "status", "", "welcome_release"})
    /* compiled from: WelcomeScreenFeature.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final WelcomeScreenFeature getWelcomeScreenFeature(com.iqoption.core.microservices.features.a.a aVar) {
            return kg(aVar != null ? aVar.getStatus() : null);
        }

        private final WelcomeScreenFeature kg(String str) {
            if (str == null) {
                return WelcomeScreenFeature.DISABLED;
            }
            if (kotlin.jvm.internal.i.y("default-welcome-screen", str)) {
                return WelcomeScreenFeature.WELCOME2;
            }
            WelcomeScreenFeature welcomeScreenFeature;
            for (WelcomeScreenFeature welcomeScreenFeature2 : WelcomeScreenFeature.values()) {
                if (kotlin.jvm.internal.i.y(welcomeScreenFeature2.getServerValue(), str)) {
                    welcomeScreenFeature = welcomeScreenFeature2;
                    break;
                }
            }
            welcomeScreenFeature = null;
            return welcomeScreenFeature != null ? welcomeScreenFeature : WelcomeScreenFeature.DISABLED;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/WelcomeScreenFeature$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/welcome/WelcomeScreenFeature;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "type", "welcome_release"})
    /* compiled from: WelcomeScreenFeature.kt */
    public static final class a extends TypeAdapter<WelcomeScreenFeature> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, WelcomeScreenFeature welcomeScreenFeature) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value(welcomeScreenFeature != null ? welcomeScreenFeature.getServerValue() : null);
        }

        /* renamed from: ar */
        public WelcomeScreenFeature read(JsonReader jsonReader) {
            String nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            return WelcomeScreenFeature.Companion.kg(nextString);
        }
    }

    public static final WelcomeScreenFeature getWelcomeScreenFeature(com.iqoption.core.microservices.features.a.a aVar) {
        return Companion.getWelcomeScreenFeature(aVar);
    }

    private WelcomeScreenFeature(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
