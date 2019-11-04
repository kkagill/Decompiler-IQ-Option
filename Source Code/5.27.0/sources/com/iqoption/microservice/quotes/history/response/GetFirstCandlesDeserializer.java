package com.iqoption.microservice.quotes.history.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.dto.entity.position.Position;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Set;

public class GetFirstCandlesDeserializer implements JsonDeserializer<a> {
    /* renamed from: l */
    public a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Set<Entry> entrySet = jsonElement.getAsJsonObject().get("candles_by_size").getAsJsonObject().entrySet();
        int size = entrySet.size();
        a aVar = new a(size);
        int i = 0;
        for (Entry entry : entrySet) {
            if (i < size) {
                JsonObject asJsonObject = ((JsonElement) entry.getValue()).getAsJsonObject();
                aVar.bxB[i] = asJsonObject.get("id").getAsInt();
                aVar.bxy[i] = asJsonObject.get("from").getAsLong();
                aVar.bxz[i] = asJsonObject.get("to").getAsLong();
                aVar.bxC[i] = asJsonObject.get(Position.STATUS_OPEN).getAsDouble();
                aVar.bxD[i] = asJsonObject.get("close").getAsDouble();
                aVar.bxE[i] = asJsonObject.get("min").getAsDouble();
                aVar.bxF[i] = asJsonObject.get("max").getAsDouble();
                aVar.bxG[i] = asJsonObject.get("volume").getAsDouble();
            }
            i++;
        }
        return aVar;
    }
}
