package com.iqoption.core;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(b.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001c\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/Platform;", "", "serverId", "", "(Ljava/lang/String;II)V", "getServerId", "()I", "toString", "", "UNKNOWN", "ANDROID", "IOS", "WEB", "WEB_MOBILE", "MAC_GL", "WIN_GL", "WEB_GL", "LINUX_GL", "IOS_BROKER", "IOS_HODLY", "ANDROID_HODLY", "WEB_WALLET", "WEB_HODLY", "ANDROID_X", "ANDROID_8X_TRADE", "MAC_GL_8X_TRADE", "WEB_GL_8X_TRADE", "WIN_GL_8X_TRADE", "Companion", "JsonAdapter", "core_release"})
/* compiled from: Platforms.kt */
public enum Platform {
    UNKNOWN(-1),
    ANDROID(2),
    IOS(3),
    WEB(4),
    WEB_MOBILE(5),
    MAC_GL(7),
    WIN_GL(8),
    WEB_GL(9),
    LINUX_GL(11),
    IOS_BROKER(12),
    IOS_HODLY(13),
    ANDROID_HODLY(14),
    WEB_WALLET(15),
    WEB_HODLY(16),
    ANDROID_X(17),
    ANDROID_8X_TRADE(73),
    MAC_GL_8X_TRADE(74),
    WEB_GL_8X_TRADE(75),
    WIN_GL_8X_TRADE(76);
    
    public static final a Companion = null;
    private final int serverId;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/Platform$Companion;", "", "()V", "fromServerId", "Lcom/iqoption/core/Platform;", "id", "", "(Ljava/lang/Integer;)Lcom/iqoption/core/Platform;", "core_release"})
    /* compiled from: Platforms.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Platform fromServerId(Integer num) {
            if (num == null) {
                return Platform.UNKNOWN;
            }
            Enum enumR = Platform.UNKNOWN;
            for (Platform platform : Platform.values()) {
                Object obj = (num != null && platform.getServerId() == num.intValue()) ? 1 : null;
                if (obj != null) {
                    break;
                }
            }
            Platform platform2 = null;
            Enum enumR2 = platform2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (Platform) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/Platform$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/Platform;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
    /* compiled from: Platforms.kt */
    public static final class b extends TypeAdapter<Platform> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Platform platform) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (platform == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value((Number) Integer.valueOf(platform.getServerId()));
            }
        }

        /* renamed from: d */
        public Platform read(JsonReader jsonReader) {
            Integer valueOf;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            a aVar = Platform.Companion;
            if (jsonReader.peek() != JsonToken.NULL) {
                valueOf = Integer.valueOf(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                valueOf = null;
            }
            return aVar.fromServerId(valueOf);
        }
    }

    public static final Platform fromServerId(Integer num) {
        return Companion.fromServerId(num);
    }

    private Platform(int i) {
        this.serverId = i;
    }

    public final int getServerId() {
        return this.serverId;
    }

    static {
        Companion = new a();
    }

    public String toString() {
        return String.valueOf(this.serverId);
    }
}
