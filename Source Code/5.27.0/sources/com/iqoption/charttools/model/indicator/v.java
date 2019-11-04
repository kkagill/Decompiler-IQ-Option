package com.iqoption.charttools.model.indicator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.iqoption.charttools.model.a;
import com.iqoption.core.d;
import com.iqoption.core.data.model.e;
import com.iqoption.core.ext.c;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(J \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0003H\u0016J\u000f\u00100\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u00101J\n\u00102\u001a\u0004\u0018\u00010\u0003H\u0016J \u00103\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0016J\u000e\u00104\u001a\u00020(2\u0006\u0010-\u001a\u00020.J\u0016\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020(R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0001\u0013789:;<=>?@ABCDEFGHI¨\u0006J"}, bng = {"Lcom/iqoption/charttools/model/indicator/LocalIndicator;", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "uid", "", "title", "localizedTitleId", "", "infoId", "iconRes", "categoriesSet", "", "Lcom/iqoption/charttools/model/IndicatorCategory;", "(Ljava/lang/String;Ljava/lang/String;IIILjava/util/Set;)V", "cachedIcon", "Lcom/iqoption/core/data/model/UrlOrRes;", "getCategoriesSet$techtools_release", "()Ljava/util/Set;", "setCategoriesSet$techtools_release", "(Ljava/util/Set;)V", "getIconRes", "()I", "getInfoId", "keys", "", "getKeys", "()[Ljava/lang/String;", "getLocalizedTitleId", "getTitle", "()Ljava/lang/String;", "titleKeysIndices", "", "getTitleKeysIndices", "()[I", "getCategories", "getIcon", "getInfo", "getLocalizedTitle", "getMaxInstances", "getParams", "values", "Lcom/google/gson/JsonArray;", "getParsedValue", "Lcom/google/gson/JsonElement;", "key", "index", "json", "Lcom/google/gson/JsonObject;", "getStaticTitle", "getVideoDuration", "()Ljava/lang/Integer;", "getVideoUrl", "getWrittenValue", "parseValues", "writeValues", "", "Lcom/iqoption/charttools/model/indicator/Figure;", "Lcom/iqoption/charttools/model/indicator/BollingerBands;", "Lcom/iqoption/charttools/model/indicator/Alligator;", "Lcom/iqoption/charttools/model/indicator/MovingAverage;", "Lcom/iqoption/charttools/model/indicator/RSI;", "Lcom/iqoption/charttools/model/indicator/ADX;", "Lcom/iqoption/charttools/model/indicator/ATR;", "Lcom/iqoption/charttools/model/indicator/AwesomeOscillator;", "Lcom/iqoption/charttools/model/indicator/CCI;", "Lcom/iqoption/charttools/model/indicator/Fractal;", "Lcom/iqoption/charttools/model/indicator/MACD;", "Lcom/iqoption/charttools/model/indicator/ParabolicSAR;", "Lcom/iqoption/charttools/model/indicator/StochasticOscillator;", "Lcom/iqoption/charttools/model/indicator/BelkhayateTiming;", "Lcom/iqoption/charttools/model/indicator/DPO;", "Lcom/iqoption/charttools/model/indicator/Ichimoku;", "Lcom/iqoption/charttools/model/indicator/KDJ;", "Lcom/iqoption/charttools/model/indicator/Momentum;", "Lcom/iqoption/charttools/model/indicator/WilliamsPercentRange;", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public abstract class v extends x {
    private e aJu;
    private final int aJv;
    private final int aJw;
    private transient Set<a> aJx;
    private final int iconRes;
    private final String title;

    public abstract String[] Ob();

    public int Oe() {
        return Integer.MAX_VALUE;
    }

    public String Oq() {
        return null;
    }

    /* synthetic */ v(String str, String str2, int i, int i2, int i3, Set set, int i4, f fVar) {
        if ((i4 & 32) != 0) {
            set = al.emptySet();
        }
        this(str, str2, i, i2, i3, set);
    }

    public final void i(Set<a> set) {
        kotlin.jvm.internal.i.f(set, "<set-?>");
        this.aJx = set;
    }

    private v(String str, String str2, int i, int i2, int i3, Set<a> set) {
        super(str, null);
        this.title = str2;
        this.aJv = i;
        this.aJw = i2;
        this.iconRes = i3;
        this.aJx = set;
    }

    public int[] Oc() {
        return c.bgU;
    }

    public final JsonArray b(JsonObject jsonObject) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        JsonArray jsonArray = new JsonArray();
        String[] Ob = Ob();
        int length = Ob.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            jsonArray.add(a(Ob[i], i2, jsonObject));
            i++;
            i2 = i3;
        }
        return jsonArray;
    }

    public final void a(JsonObject jsonObject, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        kotlin.jvm.internal.i.f(jsonArray, "values");
        y.a(Ob(), jsonArray);
        String[] Ob = Ob();
        int length = Ob.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = Ob[i];
            int i3 = i2 + 1;
            jsonObject.add(str, a(str, i2, jsonArray));
            i++;
            i2 = i3;
        }
    }

    public JsonElement a(String str, int i, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(jsonArray, "values");
        JsonElement jsonElement = jsonArray.get(i);
        kotlin.jvm.internal.i.e(jsonElement, "values[index]");
        return jsonElement;
    }

    public JsonElement a(String str, int i, JsonObject jsonObject) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(jsonObject, "json");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement;
        }
        JsonNull jsonNull = JsonNull.INSTANCE;
        kotlin.jvm.internal.i.e(jsonNull, "JsonNull.INSTANCE");
        return jsonNull;
    }

    public final String e(JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(jsonArray, "values");
        return i.a(Oc(), (CharSequence) ", ", null, null, 0, null, (b) new LocalIndicator$getParams$1(jsonArray), 30, null);
    }

    public String On() {
        return d.getString(this.aJv);
    }

    public String Oo() {
        return this.title;
    }

    public String getInfo() {
        return d.getString(this.aJw);
    }

    public e Op() {
        e eVar = this.aJu;
        if (eVar != null) {
            return eVar;
        }
        eVar = new e(null, this.iconRes, 1, null);
        this.aJu = eVar;
        return eVar;
    }

    public Set<a> getCategories() {
        return this.aJx;
    }
}
