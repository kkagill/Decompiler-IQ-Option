package com.iqoption.mobbtech.connect.response;

import com.google.common.base.e;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.iqoption.dto.entity.result.BuybackResult;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayBuybackResponse {
    public ArrayList<a> dIE;
    public List<Long> dIF;

    public static class BuybackResponseDeserializer implements JsonDeserializer<ArrayBuybackResponse> {
        private static final String TAG = "com.iqoption.mobbtech.connect.response.ArrayBuybackResponse$BuybackResponseDeserializer";

        /* renamed from: n */
        public ArrayBuybackResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            ArrayBuybackResponse arrayBuybackResponse = new ArrayBuybackResponse();
            Gson create = new GsonBuilder().create();
            Set<Entry> entrySet = jsonElement.getAsJsonObject().entrySet();
            if (entrySet == null) {
                return null;
            }
            for (Entry value : entrySet) {
                Object obj;
                try {
                    obj = (a) create.fromJson((JsonElement) value.getValue(), a.class);
                } catch (Exception unused) {
                    obj = null;
                }
                if (arrayBuybackResponse.dIE == null) {
                    arrayBuybackResponse.dIE = new ArrayList();
                }
                if (obj != null) {
                    arrayBuybackResponse.dIE.add(obj);
                }
            }
            return arrayBuybackResponse;
        }
    }

    public static class a extends j {
        @SerializedName("result")
        public BuybackResult dIG;
    }

    public static class Map extends HashMap<Long, BuybackResult> {
    }

    public static final ArrayBuybackResponse aPM() {
        ArrayBuybackResponse arrayBuybackResponse = new ArrayBuybackResponse();
        arrayBuybackResponse.dIE = null;
        arrayBuybackResponse.dIF = new ArrayList();
        return arrayBuybackResponse;
    }

    public String toString() {
        return e.aj(this).d("super", super.toString()).toString();
    }
}
