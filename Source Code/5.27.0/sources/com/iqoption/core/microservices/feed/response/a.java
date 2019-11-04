package com.iqoption.core.microservices.feed.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.core.microservices.feed.d;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÁ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001J\u0013\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\u0006\u0010I\u001a\u00020\u0005J\u0012\u0010J\u001a\u0004\u0018\u00010\u00052\u0006\u0010K\u001a\u00020LH\u0016J\t\u0010M\u001a\u00020EHÖ\u0001J\n\u0010N\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010O\u001a\u0004\u0018\u00010\u0005H\u0016J\t\u0010P\u001a\u00020\u0005HÖ\u0001J\u0019\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020EHÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u001e\u0010\u0016\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0017\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%¨\u0006V"}, bng = {"Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "Lcom/iqoption/core/microservices/feed/response/FeedItem;", "Lcom/iqoption/core/microservices/feed/Previewable;", "Landroid/os/Parcelable;", "title", "", "description", "source", "sourceUrl", "imageUrl", "icons", "", "author", "date", "", "mainTopic", "topics", "lang", "hidden", "", "priority", "Lcom/iqoption/core/microservices/feed/response/FeedPriority;", "like", "showImage", "button", "Lcom/iqoption/core/microservices/feed/response/FeedButton;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/iqoption/core/microservices/feed/response/FeedPriority;ZZLcom/iqoption/core/microservices/feed/response/FeedButton;)V", "getAuthor", "()Ljava/lang/String;", "getButton", "()Lcom/iqoption/core/microservices/feed/response/FeedButton;", "getDate", "()J", "getDescription", "getHidden", "()Z", "getIcons", "()Ljava/util/List;", "getImageUrl", "getLang", "getLike", "setLike", "(Z)V", "getMainTopic", "getPriority", "()Lcom/iqoption/core/microservices/feed/response/FeedPriority;", "getShowImage", "getSource", "getSourceUrl", "getTitle", "getTopics", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "getContentUrl", "getKeyBase", "type", "Lcom/iqoption/core/microservices/feed/MediaType;", "hashCode", "originalPreviewUrl", "thumbnailPreviewUrl", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: FeedResponses.kt */
public final class a extends FeedItem implements Parcelable, d {
    public static final Creator CREATOR = new a();
    @SerializedName("date")
    private final long aSH;
    @SerializedName("image_url")
    private final String bkn;
    @SerializedName("author")
    private final String brb;
    @SerializedName("source")
    private final String bth;
    @SerializedName("source_url")
    private final String bti;
    @SerializedName("icons")
    private final List<String> btj;
    @SerializedName("main_topic")
    private final String btk;
    @SerializedName("topics")
    private final List<String> btl;
    @SerializedName("lang")
    private final String btm;
    @SerializedName("priority")
    private final FeedPriority btn;
    @SerializedName("like")
    private boolean bto;
    @SerializedName("show_image")
    private final boolean btp;
    @SerializedName("button")
    private final c btq;
    @SerializedName("description")
    private final String description;
    @SerializedName("hidden")
    private final boolean fq;
    @SerializedName("title")
    private final String title;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (FeedPriority) Enum.valueOf(FeedPriority.class, parcel.readString()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel2) : null);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public String adC() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.title, aVar.title) && kotlin.jvm.internal.i.y(this.description, aVar.description) && kotlin.jvm.internal.i.y(this.bth, aVar.bth) && kotlin.jvm.internal.i.y(this.bti, aVar.bti) && kotlin.jvm.internal.i.y(this.bkn, aVar.bkn) && kotlin.jvm.internal.i.y(this.btj, aVar.btj) && kotlin.jvm.internal.i.y(this.brb, aVar.brb)) {
                    if ((this.aSH == aVar.aSH ? 1 : null) != null && kotlin.jvm.internal.i.y(this.btk, aVar.btk) && kotlin.jvm.internal.i.y(this.btl, aVar.btl) && kotlin.jvm.internal.i.y(this.btm, aVar.btm)) {
                        if ((this.fq == aVar.fq ? 1 : null) != null && kotlin.jvm.internal.i.y(this.btn, aVar.btn)) {
                            if ((this.bto == aVar.bto ? 1 : null) != null) {
                                if ((this.btp == aVar.btp ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.btq, aVar.btq)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bth;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bti;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bkn;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.btj;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str2 = this.brb;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.aSH;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.btk;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        list = this.btl;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str2 = this.btm;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.fq;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        FeedPriority feedPriority = this.btn;
        hashCode = (hashCode + (feedPriority != null ? feedPriority.hashCode() : 0)) * 31;
        i2 = this.bto;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.btp;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        c cVar = this.btq;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommonFeedItem(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", source=");
        stringBuilder.append(this.bth);
        stringBuilder.append(", sourceUrl=");
        stringBuilder.append(this.bti);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.bkn);
        stringBuilder.append(", icons=");
        stringBuilder.append(this.btj);
        stringBuilder.append(", author=");
        stringBuilder.append(this.brb);
        stringBuilder.append(", date=");
        stringBuilder.append(this.aSH);
        stringBuilder.append(", mainTopic=");
        stringBuilder.append(this.btk);
        stringBuilder.append(", topics=");
        stringBuilder.append(this.btl);
        stringBuilder.append(", lang=");
        stringBuilder.append(this.btm);
        stringBuilder.append(", hidden=");
        stringBuilder.append(this.fq);
        stringBuilder.append(", priority=");
        stringBuilder.append(this.btn);
        stringBuilder.append(", like=");
        stringBuilder.append(this.bto);
        stringBuilder.append(", showImage=");
        stringBuilder.append(this.btp);
        stringBuilder.append(", button=");
        stringBuilder.append(this.btq);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.bth);
        parcel.writeString(this.bti);
        parcel.writeString(this.bkn);
        parcel.writeStringList(this.btj);
        parcel.writeString(this.brb);
        parcel.writeLong(this.aSH);
        parcel.writeString(this.btk);
        parcel.writeStringList(this.btl);
        parcel.writeString(this.btm);
        parcel.writeInt(this.fq);
        FeedPriority feedPriority = this.btn;
        if (feedPriority != null) {
            parcel.writeInt(1);
            parcel.writeString(feedPriority.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.bto);
        parcel.writeInt(this.btp);
        c cVar = this.btq;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSource() {
        return this.bth;
    }

    public final String adH() {
        return this.bti;
    }

    public final List<String> adI() {
        return this.btj;
    }

    public final String adJ() {
        return this.brb;
    }

    public final long getDate() {
        return this.aSH;
    }

    public final List<String> adK() {
        return this.btl;
    }

    public final FeedPriority adL() {
        return this.btn;
    }

    public final boolean adM() {
        return this.bto;
    }

    public final void cA(boolean z) {
        this.bto = z;
    }

    public final c adN() {
        return this.btq;
    }

    public a(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, long j, String str7, List<String> list2, String str8, boolean z, FeedPriority feedPriority, boolean z2, boolean z3, c cVar) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        List<String> list3 = list;
        List<String> list4 = list2;
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        kotlin.jvm.internal.i.f(str3, "source");
        kotlin.jvm.internal.i.f(str4, "sourceUrl");
        kotlin.jvm.internal.i.f(list, "icons");
        kotlin.jvm.internal.i.f(list4, "topics");
        this.title = str9;
        this.description = str10;
        this.bth = str11;
        this.bti = str12;
        this.bkn = str5;
        this.btj = list3;
        this.brb = str6;
        this.aSH = j;
        this.btk = str7;
        this.btl = list4;
        this.btm = str8;
        this.fq = z;
        this.btn = feedPriority;
        this.bto = z2;
        this.btp = z3;
        this.btq = cVar;
    }

    public String a(MediaType mediaType) {
        kotlin.jvm.internal.i.f(mediaType, "type");
        int i = b.aob[mediaType.ordinal()];
        if (i == 1) {
            return adC();
        }
        if (i == 2) {
            return adD();
        }
        throw new NoWhenBranchMatchedException();
    }

    public String adD() {
        return this.bkn;
    }

    public final String adG() {
        String type = getType();
        if (type.hashCode() == 112202875 && type.equals("video")) {
            return this.bti;
        }
        return this.bti;
    }
}
