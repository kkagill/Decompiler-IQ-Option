package com.iqoption.core.microservices.core.register;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonObject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, bng = {"getAnalyticsParams", "Lcom/google/gson/JsonObject;", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "getAnalyticsValue", "", "core_release"})
/* compiled from: SocialTypeId.kt */
public final class b {
    private static final int b(SocialTypeId socialTypeId) {
        int i = c.aob[socialTypeId.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final JsonObject c(SocialTypeId socialTypeId) {
        kotlin.jvm.internal.i.f(socialTypeId, "$this$getAnalyticsParams");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(NotificationCompat.CATEGORY_SOCIAL, (Number) Integer.valueOf(b(socialTypeId)));
        return jsonObject;
    }
}
