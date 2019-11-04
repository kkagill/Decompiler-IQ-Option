package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class b {
    private final String abr;
    private final String abs;
    private final String abt;
    private final String abu;
    private final String abv;
    private final String applicationId;
    private final String oM;

    private b(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(Strings.isEmptyOrWhitespace(str) ^ 1, "ApplicationId must be set.");
        this.applicationId = str;
        this.oM = str2;
        this.abr = str3;
        this.abs = str4;
        this.abt = str5;
        this.abu = str6;
        this.abv = str7;
    }

    public static b az(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new b(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String go() {
        return this.applicationId;
    }

    public String vU() {
        return this.abt;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equal(this.applicationId, bVar.applicationId) && Objects.equal(this.oM, bVar.oM) && Objects.equal(this.abr, bVar.abr) && Objects.equal(this.abs, bVar.abs) && Objects.equal(this.abt, bVar.abt) && Objects.equal(this.abu, bVar.abu) && Objects.equal(this.abv, bVar.abv)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hashCode(this.applicationId, this.oM, this.abr, this.abs, this.abt, this.abu, this.abv);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.applicationId).add("apiKey", this.oM).add("databaseUrl", this.abr).add("gcmSenderId", this.abt).add("storageBucket", this.abu).add("projectId", this.abv).toString();
    }
}
