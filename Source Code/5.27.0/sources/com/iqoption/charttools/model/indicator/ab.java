package com.iqoption.charttools.model.indicator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.e;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.event.OtnEmissionExecuted;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0005H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\f¨\u0006%"}, bng = {"Lcom/iqoption/charttools/model/indicator/MovingAverage;", "Lcom/iqoption/charttools/model/indicator/LocalIndicator;", "()V", "APPLY_TOS", "", "", "[Ljava/lang/String;", "KEY_MA_VALUE", "KEY_TYPE", "LOCALIZED_APPLY_TOS", "", "getLOCALIZED_APPLY_TOS", "()[I", "TYPES", "getTYPES", "()[Ljava/lang/String;", "canHostFigures", "", "getCanHostFigures", "()Z", "keys", "getKeys", "titleKeysIndices", "getTitleKeysIndices", "getMaxInstances", "", "getParsedValue", "Lcom/google/gson/JsonElement;", "key", "index", "json", "Lcom/google/gson/JsonObject;", "getWrittenValue", "values", "Lcom/google/gson/JsonArray;", "isTypeMatches", "type", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class ab extends v {
    private static final String[] TYPES = new String[]{"SMA", "WMA", "EMA", "SSMA"};
    private static final String[] aIP = new String[]{"type", "ma_value", OtnEmissionExecuted.COUNT, "color", "ma_width"};
    private static final int[] aIQ = new int[]{2};
    private static final String[] aJD = new String[]{"close", Position.STATUS_OPEN, "min", "max"};
    private static final int[] aJE = new int[]{n.i.close_noun, n.i.open_noun, n.i.min_abbr, n.i.max_abbr};
    public static final ab aJF = new ab();

    public boolean Od() {
        return false;
    }

    public int Oe() {
        return 32;
    }

    private ab() {
        super("MovingAverage", "MA", n.i.iq4_indicators_title_moving_average, n.i.iq4_indicators_hint_moving_average, e.ic_icon_instrument_ma, null, 32, null);
    }

    public final String[] Ov() {
        return TYPES;
    }

    public final int[] Ow() {
        return aJE;
    }

    /* Access modifiers changed, original: protected */
    public String[] Ob() {
        return aIP;
    }

    public int[] Oc() {
        return aIQ;
    }

    public JsonElement a(String str, int i, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(jsonArray, "values");
        int hashCode = str.hashCode();
        int i2 = 0;
        String[] strArr;
        JsonElement jsonElement;
        JsonPrimitive asJsonPrimitive;
        if (hashCode != -286948602) {
            if (hashCode == 3575610 && str.equals("type")) {
                strArr = TYPES;
                jsonElement = jsonArray.get(i);
                if (jsonElement != null) {
                    asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive != null) {
                        i2 = asJsonPrimitive.getAsInt();
                    }
                }
                return new JsonPrimitive(strArr[i2]);
            }
        } else if (str.equals("ma_value")) {
            strArr = aJD;
            jsonElement = jsonArray.get(i);
            if (jsonElement != null) {
                asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive != null) {
                    i2 = asJsonPrimitive.getAsInt();
                }
            }
            return new JsonPrimitive(strArr[i2]);
        }
        return super.a(str, i, jsonArray);
    }

    /* JADX WARNING: Missing block: B:11:0x0037, code skipped:
            if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:21:0x006a, code skipped:
            if (r4 != null) goto L_0x0071;
     */
    public com.google.gson.JsonElement a(java.lang.String r4, int r5, com.google.gson.JsonObject r6) {
        /*
        r3 = this;
        r0 = "key";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "json";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r4.hashCode();
        r1 = -286948602; // 0xffffffffeee58306 float:-3.5515232E28 double:NaN;
        r2 = 0;
        if (r0 == r1) goto L_0x004e;
    L_0x0014:
        r1 = 3575610; // 0x368f3a float:5.010497E-39 double:1.766586E-317;
        if (r0 == r1) goto L_0x001a;
    L_0x0019:
        goto L_0x0081;
    L_0x001a:
        r0 = "type";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0081;
    L_0x0023:
        r5 = new com.google.gson.JsonPrimitive;
        r0 = TYPES;
        r4 = r6.get(r4);
        if (r4 == 0) goto L_0x003a;
    L_0x002d:
        r4 = r4.getAsJsonPrimitive();
        if (r4 == 0) goto L_0x003a;
    L_0x0033:
        r4 = r4.getAsString();
        if (r4 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003e;
    L_0x003a:
        r4 = TYPES;
        r4 = r4[r2];
    L_0x003e:
        r4 = kotlin.collections.i.indexOf(r0, r4);
        r4 = java.lang.Integer.valueOf(r4);
        r4 = (java.lang.Number) r4;
        r5.<init>(r4);
        r5 = (com.google.gson.JsonElement) r5;
        goto L_0x0085;
    L_0x004e:
        r0 = "ma_value";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0081;
    L_0x0056:
        r5 = new com.google.gson.JsonPrimitive;
        r0 = aJD;
        r4 = r6.get(r4);
        if (r4 == 0) goto L_0x006d;
    L_0x0060:
        r4 = r4.getAsJsonPrimitive();
        if (r4 == 0) goto L_0x006d;
    L_0x0066:
        r4 = r4.getAsString();
        if (r4 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0071;
    L_0x006d:
        r4 = aJD;
        r4 = r4[r2];
    L_0x0071:
        r4 = kotlin.collections.i.indexOf(r0, r4);
        r4 = java.lang.Integer.valueOf(r4);
        r4 = (java.lang.Number) r4;
        r5.<init>(r4);
        r5 = (com.google.gson.JsonElement) r5;
        goto L_0x0085;
    L_0x0081:
        r5 = super.a(r4, r5, r6);
    L_0x0085:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.model.indicator.ab.a(java.lang.String, int, com.google.gson.JsonObject):com.google.gson.JsonElement");
    }

    public boolean eN(String str) {
        kotlin.jvm.internal.i.f(str, "type");
        return i.contains((Object[]) TYPES, (Object) str) || super.eN(str);
    }
}
