package com.iqoption.core.microservices.core.register.response;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: RegisterResponse.kt */
final class RegisterResponse$messages$2 extends Lambda implements a<List<? extends String>> {
    final /* synthetic */ b this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012F\u0010\u0004\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0005H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "", "Lcom/google/gson/JsonElement;", "", "invoke"})
    /* compiled from: RegisterResponse.kt */
    /* renamed from: com.iqoption.core.microservices.core.register.response.RegisterResponse$messages$2$1 */
    static final class AnonymousClass1 extends Lambda implements b<Entry<String, JsonElement>, List<? extends String>> {
        final /* synthetic */ RegisterResponse$messages$2 this$0;

        AnonymousClass1(RegisterResponse$messages$2 registerResponse$messages$2) {
            this.this$0 = registerResponse$messages$2;
            super(1);
        }

        /* renamed from: i */
        public final List<String> invoke(Entry<String, JsonElement> entry) {
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                return l.listOf(((JsonPrimitive) jsonElement).getAsString());
            }
            b bVar = this.this$0.this$0;
            Object value = entry.getValue();
            if (value != null) {
                return bVar.g((JsonArray) value);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonArray");
        }
    }

    RegisterResponse$messages$2(b bVar) {
        this.this$0 = bVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<String> invoke() {
        JsonElement b = this.this$0.bsd;
        if (b instanceof JsonArray) {
            b bVar = this.this$0;
            return bVar.g((JsonArray) bVar.bsd);
        } else if (!(b instanceof JsonObject)) {
            return m.emptyList();
        } else {
            Set entrySet = ((JsonObject) this.this$0.bsd).entrySet();
            kotlin.jvm.internal.i.e(entrySet, "_message.entrySet()");
            Iterator it = n.f(n.f(u.Z(entrySet), new AnonymousClass1(this))).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = u.b((Collection) (List) next, (Iterable) (List) it.next());
                }
                return (List) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }
}
