package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Map;

@Class(creator = "RemoteMessageCreator")
@Reserved({1})
public final class c extends AbstractSafeParcelable {
    public static final Creator<c> CREATOR = new j();
    @Field(id = 2)
    Bundle aer;
    private Map<String, String> aes;
    private a aet;

    public static class a {
        private final String aeA;
        private final String[] aeu;
        private final String aev;
        private final String aew;
        private final String aex;
        private final String aey;
        private final String aez;
        private final String tag;
        private final String zzeh;
        private final String zzei;
        private final String zzek;
        private final String[] zzem;
        private final String zzep;
        private final Uri zzet;

        private a(Bundle bundle) {
            String str = "gcm.n.title";
            this.zzeh = e.d(bundle, str);
            this.zzei = e.g(bundle, str);
            this.aeu = c(bundle, str);
            str = "gcm.n.body";
            this.zzek = e.d(bundle, str);
            this.aev = e.g(bundle, str);
            this.zzem = c(bundle, str);
            this.aew = e.d(bundle, "gcm.n.icon");
            this.zzep = e.C(bundle);
            this.tag = e.d(bundle, "gcm.n.tag");
            this.aey = e.d(bundle, "gcm.n.color");
            this.aez = e.d(bundle, "gcm.n.click_action");
            this.aeA = e.d(bundle, "gcm.n.android_channel_id");
            this.zzet = e.D(bundle);
            this.aex = e.d(bundle, "gcm.n.image");
        }

        private static String[] c(Bundle bundle, String str) {
            Object[] e = e.e(bundle, str);
            if (e == null) {
                return null;
            }
            String[] strArr = new String[e.length];
            for (int i = 0; i < e.length; i++) {
                strArr[i] = String.valueOf(e[i]);
            }
            return strArr;
        }

        @Nullable
        public String getTitle() {
            return this.zzeh;
        }

        @Nullable
        public String getBody() {
            return this.zzek;
        }

        /* synthetic */ a(Bundle bundle, i iVar) {
            this(bundle);
        }
    }

    @Constructor
    public c(@Param(id = 2) Bundle bundle) {
        this.aer = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.aer, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Nullable
    public final String wU() {
        return this.aer.getString("from");
    }

    public final Map<String, String> wV() {
        if (this.aes == null) {
            Bundle bundle = this.aer;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!(str.startsWith("google.") || str.startsWith("gcm.") || str.equals("from") || str.equals("message_type") || str.equals("collapse_key"))) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.aes = arrayMap;
        }
        return this.aes;
    }

    @Nullable
    public final a wW() {
        if (this.aet == null && e.B(this.aer)) {
            this.aet = new a(this.aer, null);
        }
        return this.aet;
    }
}
