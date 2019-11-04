package com.iqoption.core.data.model;

import com.iqoption.core.microservices.configuration.a.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, bng = {"Lcom/iqoption/core/data/model/UserProfile;", "", "id", "", "displayName", "", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "avatarUrl", "registrationTime", "isOnline", "", "isVip", "(JLjava/lang/String;Lcom/iqoption/core/microservices/configuration/response/Country;Ljava/lang/String;JZZ)V", "getAvatarUrl", "()Ljava/lang/String;", "getCountry", "()Lcom/iqoption/core/microservices/configuration/response/Country;", "getDisplayName", "getId", "()J", "()Z", "getRegistrationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: UserProfile.kt */
public final class f {
    private final c aBZ;
    private final long aZf;
    private final boolean arU;
    private final boolean asB;
    private final String avatarUrl;
    private final String bcY;
    private final long id;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if ((this.id == fVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bcY, fVar.bcY) && kotlin.jvm.internal.i.y(this.aBZ, fVar.aBZ) && kotlin.jvm.internal.i.y(this.avatarUrl, fVar.avatarUrl)) {
                    if ((this.aZf == fVar.aZf ? 1 : null) != null) {
                        if ((this.asB == fVar.asB ? 1 : null) != null) {
                            if ((this.arU == fVar.arU ? 1 : null) != null) {
                                return true;
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
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.bcY;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        c cVar = this.aBZ;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        str = this.avatarUrl;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        long j2 = this.aZf;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i3 = this.asB;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.arU;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserProfile(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.bcY);
        stringBuilder.append(", country=");
        stringBuilder.append(this.aBZ);
        stringBuilder.append(", avatarUrl=");
        stringBuilder.append(this.avatarUrl);
        stringBuilder.append(", registrationTime=");
        stringBuilder.append(this.aZf);
        stringBuilder.append(", isOnline=");
        stringBuilder.append(this.asB);
        stringBuilder.append(", isVip=");
        stringBuilder.append(this.arU);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(long j, String str, c cVar, String str2, long j2, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(str, "displayName");
        this.id = j;
        this.bcY = str;
        this.aBZ = cVar;
        this.avatarUrl = str2;
        this.aZf = j2;
        this.asB = z;
        this.arU = z2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.bcY;
    }

    public final c LB() {
        return this.aBZ;
    }

    public final String Uh() {
        return this.avatarUrl;
    }

    public final long Ui() {
        return this.aZf;
    }

    public final boolean Em() {
        return this.arU;
    }
}
