package com.iqoption.charttools.model.indicator;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.e;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.techinstruments.a.b;
import com.iqoption.core.microservices.videoeducation.response.g;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B5\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010B{\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\u001cJ\b\u00103\u001a\u00020\u0017H\u0016J\u0013\u00104\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u00108\u001a\u00020\u001eH\u0016J\n\u00109\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\u0017H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\u000f\u0010=\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010>J\n\u0010?\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010@\u001a\u00020\u0017H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0018\u0010H\u001a\u00020F2\u0006\u0010C\u001a\u00020D2\u0006\u0010I\u001a\u00020BH\u0016R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u00020\u00198\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u001b\u0010+\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006K"}, bng = {"Lcom/iqoption/charttools/model/indicator/ScriptedIndicator;", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "Landroid/os/Parcelable;", "()V", "indicator", "Lcom/iqoption/core/microservices/techinstruments/response/Indicator;", "iconUrl", "", "video", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "categories", "", "Lcom/iqoption/charttools/model/IndicatorCategory;", "(Lcom/iqoption/core/microservices/techinstruments/response/Indicator;Ljava/lang/String;Lcom/iqoption/core/microservices/videoeducation/response/Video;Ljava/util/Set;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "type", "id", "", "name", "description", "instanceCount", "", "canHostFigures", "", "keywords", "categories_", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/videoeducation/response/Video;IZLjava/lang/String;Ljava/util/Set;)V", "cachedIcon", "Lcom/iqoption/core/data/model/UrlOrRes;", "getCanHostFigures", "()Z", "getDescription", "()Ljava/lang/String;", "getIconUrl", "getId", "()J", "getInstanceCount", "()I", "isScripted", "getKeywords", "getName", "searchTags", "getSearchTags", "searchTags$delegate", "Lkotlin/Lazy;", "uid", "getUid", "getVideo", "()Lcom/iqoption/core/microservices/videoeducation/response/Video;", "describeContents", "equals", "other", "", "getCategories", "getIcon", "getInfo", "getLocalizedTitle", "getMaxInstances", "getStaticTitle", "getVideoDuration", "()Ljava/lang/Integer;", "getVideoUrl", "hashCode", "parseValues", "Lcom/google/gson/JsonArray;", "json", "Lcom/google/gson/JsonObject;", "writeToParcel", "", "flags", "writeValues", "values", "CREATOR", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class ae extends x implements Parcelable {
    public static final a CREATOR = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(ae.class), "searchTags", "getSearchTags()Ljava/lang/String;"))};
    @SerializedName("icon")
    private final String aIF;
    @SerializedName("video")
    private final g aJI;
    @SerializedName("instCount")
    private final int aJJ;
    @SerializedName("canHostFigures")
    private final boolean aJK;
    @SerializedName("keywords")
    private final String aJL;
    private final transient Set<com.iqoption.charttools.model.a> aJM;
    private e aJu;
    private final d aJz;
    @SerializedName("desc")
    private final String description;
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/model/indicator/ScriptedIndicator$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/iqoption/charttools/model/indicator/ScriptedIndicator;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/iqoption/charttools/model/indicator/ScriptedIndicator;", "techtools_release"})
    /* compiled from: MetaIndicator.kt */
    public static final class a implements Creator<ae> {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        /* renamed from: V */
        public ae createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            return new ae(parcel);
        }

        /* renamed from: eq */
        public ae[] newArray(int i) {
            return new ae[i];
        }
    }

    public String Os() {
        d dVar = this.aJz;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    public int describeContents() {
        return 0;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ ae(String str, long j, String str2, String str3, String str4, g gVar, int i, boolean z, String str5, Set set, int i2, f fVar) {
        int i3 = i2;
        String str6 = (i3 & 1) != 0 ? "Scripted" : str;
        this(str6, (i3 & 2) != 0 ? -1 : j, (i3 & 4) != 0 ? (String) null : str2, (i3 & 8) != 0 ? (String) null : str3, (i3 & 16) != 0 ? (String) null : str4, (i3 & 32) != 0 ? (g) null : gVar, (i3 & 64) != 0 ? 1 : i, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? (String) null : str5, (i3 & 512) != 0 ? (Set) null : set);
    }

    public boolean Od() {
        return this.aJK;
    }

    public final String getKeywords() {
        return this.aJL;
    }

    public ae(String str, long j, String str2, String str3, String str4, g gVar, int i, boolean z, String str5, Set<com.iqoption.charttools.model.a> set) {
        kotlin.jvm.internal.i.f(str, "type");
        super(str, null);
        this.id = j;
        this.name = str2;
        this.description = str3;
        this.aIF = str4;
        this.aJI = gVar;
        this.aJJ = i;
        this.aJK = z;
        this.aJL = str5;
        this.aJM = set;
        this.aJz = g.c(new ScriptedIndicator$searchTags$2(this));
    }

    public String Or() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.Or());
        stringBuilder.append(':');
        stringBuilder.append(this.id);
        return stringBuilder.toString();
    }

    public final boolean Ox() {
        return kotlin.jvm.internal.i.y(getType(), "Scripted");
    }

    public ae() {
        this("Scripted", 0, null, null, null, null, 0, false, null, null, 1022, null);
    }

    public ae(b bVar, String str, g gVar, Set<com.iqoption.charttools.model.a> set) {
        b bVar2 = bVar;
        kotlin.jvm.internal.i.f(bVar, "indicator");
        this(bVar.getType(), bVar.getId(), bVar.getName(), bVar.getDescription(), str, gVar, bVar.aht(), bVar.Od(), bVar.getKeywords(), set);
    }

    public ae(Parcel parcel) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        this(readString, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (g) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt(), parcel.readByte() != ((byte) 0), parcel.readString(), com.iqoption.core.ext.a.g(parcel, com.iqoption.charttools.model.a.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(getType());
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.aIF);
        parcel.writeParcelable(this.aJI, i);
        parcel.writeInt(this.aJJ);
        parcel.writeByte(Od());
        parcel.writeString(this.aJL);
        com.iqoption.core.ext.a.a(parcel, this.aJM, i);
    }

    public JsonArray b(JsonObject jsonObject) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        return com.iqoption.core.ext.d.b(jsonObject, "values", null, 2, null);
    }

    public void a(JsonObject jsonObject, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(jsonObject, "json");
        String str = "values";
        kotlin.jvm.internal.i.f(jsonArray, str);
        jsonObject.add(str, jsonArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            if (this.id != ((ae) obj).id) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.model.indicator.ScriptedIndicator");
    }

    public int hashCode() {
        return Long.valueOf(this.id).hashCode();
    }

    public String On() {
        return c.fU(this.name);
    }

    public String Oo() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getInfo() {
        return c.fU(this.description);
    }

    public e Op() {
        e eVar = this.aJu;
        if (eVar != null) {
            return eVar;
        }
        eVar = new e(this.aIF, 0, 2, null);
        this.aJu = eVar;
        return eVar;
    }

    public String Oq() {
        g gVar = this.aJI;
        return gVar != null ? gVar.ajp() : null;
    }

    public int Oe() {
        int i = this.aJJ;
        return i != 0 ? i : Integer.MAX_VALUE;
    }

    public Set<com.iqoption.charttools.model.a> getCategories() {
        Set<com.iqoption.charttools.model.a> set = this.aJM;
        return set != null ? set : al.emptySet();
    }
}
