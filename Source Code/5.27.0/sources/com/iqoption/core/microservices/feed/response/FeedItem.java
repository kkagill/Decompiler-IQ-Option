package com.iqoption.core.microservices.feed.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import java.lang.reflect.Type;
import kotlin.i;

@JsonAdapter(Deserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\r¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/feed/response/FeedItem;", "", "()V", "id", "", "getId", "()I", "isValid", "", "Ljava/lang/Boolean;", "rating", "getRating", "setRating", "(I)V", "type", "", "getType", "()Ljava/lang/String;", "views", "getViews", "setViews", "isContentValid", "setContentInvalid", "", "Companion", "Deserializer", "core_release"})
/* compiled from: FeedResponses.kt */
public abstract class FeedItem {
    public static final a btv = new a();
    @SerializedName("views")
    private int btt;
    private volatile Boolean btu;
    @SerializedName("id")
    private final int id;
    @SerializedName("rating")
    private int rating;
    @SerializedName("type")
    private final String type = "";

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/feed/response/FeedItem$Companion;", "", "()V", "TYPE_ARTICLE", "", "TYPE_ASSETS", "TYPE_TWEET", "TYPE_VIDEO", "core_release"})
    /* compiled from: FeedResponses.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/feed/response/FeedItem$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/feed/response/FeedItem;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
    /* compiled from: FeedResponses.kt */
    public static final class Deserializer implements JsonDeserializer<FeedItem> {
        /* renamed from: g */
        public FeedItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            kotlin.jvm.internal.i.f(jsonElement, "json");
            kotlin.jvm.internal.i.f(type, "typeOfT");
            kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
            JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("type");
            kotlin.jvm.internal.i.e(jsonElement2, "json.asJsonObject.get(\"type\")");
            String asString = jsonElement2.getAsString();
            if (asString == null) {
                return null;
            }
            switch (asString.hashCode()) {
                case -1408207997:
                    boolean equals = asString.equals("assets");
                    return null;
                case -732377866:
                    if (!asString.equals("article")) {
                        return null;
                    }
                    break;
                case 110773873:
                    if (!asString.equals("tweet")) {
                        return null;
                    }
                    break;
                case 112202875:
                    if (!asString.equals("video")) {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
            return (FeedItem) d.Um().Ez().fromJson(jsonElement, a.class);
        }
    }

    public final int getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final int getRating() {
        return this.rating;
    }

    public final void setRating(int i) {
        this.rating = i;
    }

    public final int adO() {
        return this.btt;
    }

    public final void eS(int i) {
        this.btt = i;
    }

    public final void adE() {
        this.btu = Boolean.valueOf(false);
    }

    public final boolean adF() {
        Boolean bool = this.btu;
        return bool != null ? bool.booleanValue() : true;
    }
}
