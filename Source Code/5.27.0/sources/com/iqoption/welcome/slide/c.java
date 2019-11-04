package com.iqoption.welcome.slide;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.RawRes;
import androidx.annotation.StringRes;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0016\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/welcome/slide/WelcomeSlideData;", "Landroid/os/Parcelable;", "image", "", "title", "description", "(Ljava/lang/Integer;II)V", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "welcome_release"})
/* compiled from: WelcomeSlideData.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String description;
    private final Integer emL;
    private final String title;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        Integer num = this.emL;
        if (num != null) {
            parcel.writeInt(1);
            i = num.intValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }

    public c(@RawRes Integer num, String str, String str2) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        this.emL = num;
        this.title = str;
        this.description = str2;
    }

    public final Integer bbq() {
        return this.emL;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public c(@RawRes Integer num, @StringRes int i, @StringRes int i2) {
        String string = d.Uo().getString(i);
        kotlin.jvm.internal.i.e(string, "appContext.getString(title)");
        this(num, string, d.Uo().getString(i2));
    }
}
