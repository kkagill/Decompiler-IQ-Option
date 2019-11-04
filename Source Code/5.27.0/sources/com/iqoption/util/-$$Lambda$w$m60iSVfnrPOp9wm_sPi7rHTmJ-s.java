package com.iqoption.util;

import com.google.common.base.n;
import com.google.gson.GsonBuilder;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamPropertyDeserializer;
import com.iqoption.core.util.KotlinGsonAdapterFactory;
import com.iqoption.microservice.quotes.history.response.GetFirstCandlesDeserializer;
import com.iqoption.microservice.quotes.history.response.a;
import com.iqoption.microservice.vip.VipManagerDeserializer;
import com.iqoption.microservice.vip.d;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse.BuybackResponseDeserializer;
import com.iqoption.mobbtech.connect.response.ProfileSaveDataResponseDeserializer;
import com.iqoption.mobbtech.connect.response.h;
import com.iqoption.mobbtech.connect.response.options.OpenOptionGroupDeserializer;
import com.iqoption.mobbtech.connect.response.options.OpenOptionGroupSerializer;
import com.iqoption.mobbtech.connect.response.options.OptionDeserializer;
import com.iqoption.mobbtech.connect.response.options.b;
import com.iqoption.mobbtech.connect.response.options.c;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$w$m60iSVfnrPOp9wm_sPi7rHTmJ-s implements n {
    public static final /* synthetic */ -$$Lambda$w$m60iSVfnrPOp9wm_sPi7rHTmJ-s INSTANCE = new -$$Lambda$w$m60iSVfnrPOp9wm_sPi7rHTmJ-s();

    private /* synthetic */ -$$Lambda$w$m60iSVfnrPOp9wm_sPi7rHTmJ-s() {
    }

    public final Object get() {
        return new GsonBuilder().registerTypeAdapterFactory(new KotlinGsonAdapterFactory()).registerTypeAdapter(ArrayBuybackResponse.class, new BuybackResponseDeserializer()).registerTypeAdapter(ExtraParamProperty.class, new ExtraParamPropertyDeserializer()).registerTypeAdapter(h.class, new ProfileSaveDataResponseDeserializer()).registerTypeAdapter(c.class, new OptionDeserializer()).registerTypeAdapter(b.class, new OpenOptionGroupSerializer()).registerTypeAdapter(b.class, new OpenOptionGroupDeserializer()).registerTypeAdapter(a.class, new GetFirstCandlesDeserializer()).registerTypeAdapter(d.class, new VipManagerDeserializer()).create();
    }
}
