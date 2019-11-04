package com.iqoption.charttools.model.indicator;

import android.os.Parcel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.iqoption.charttools.model.a;
import com.iqoption.core.data.model.e;
import java.util.Set;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\b\u0010\u0014\u001a\u00020\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0002\u0010\u001cJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0019H\u0016J\u0018\u0010(\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020 H&R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\u00038VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\u0001\u0002*+¨\u0006,"}, bng = {"Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "", "type", "", "(Ljava/lang/String;)V", "canHostFigures", "", "getCanHostFigures", "()Z", "searchTags", "getSearchTags", "()Ljava/lang/String;", "searchTags$delegate", "Lkotlin/Lazy;", "getType", "uid", "getUid", "getCategories", "", "Lcom/iqoption/charttools/model/IndicatorCategory;", "getIcon", "Lcom/iqoption/core/data/model/UrlOrRes;", "getInfo", "getLocalizedTitle", "getMaxInstances", "", "getStaticTitle", "getVideoDuration", "()Ljava/lang/Integer;", "getVideoUrl", "isTypeMatches", "parseValues", "Lcom/google/gson/JsonArray;", "json", "Lcom/google/gson/JsonObject;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeValues", "values", "Lcom/iqoption/charttools/model/indicator/LocalIndicator;", "Lcom/iqoption/charttools/model/indicator/ScriptedIndicator;", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public abstract class x {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(x.class), "searchTags", "getSearchTags()Ljava/lang/String;"))};
    private final d aJz;
    @SerializedName("type")
    private final String type;

    public boolean Od() {
        return true;
    }

    public abstract int Oe();

    public abstract String On();

    public abstract String Oo();

    public abstract e Op();

    public abstract String Oq();

    public String Os() {
        d dVar = this.aJz;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    public abstract void a(JsonObject jsonObject, JsonArray jsonArray);

    public abstract JsonArray b(JsonObject jsonObject);

    public abstract Set<a> getCategories();

    public abstract String getInfo();

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
    }

    private x(String str) {
        this.type = str;
        this.aJz = g.c(new MetaIndicator$searchTags$2(this));
    }

    public /* synthetic */ x(String str, f fVar) {
        this(str);
    }

    public final String getType() {
        return this.type;
    }

    public String Or() {
        return this.type;
    }

    public boolean eN(String str) {
        kotlin.jvm.internal.i.f(str, "type");
        return kotlin.jvm.internal.i.y(this.type, str);
    }
}
