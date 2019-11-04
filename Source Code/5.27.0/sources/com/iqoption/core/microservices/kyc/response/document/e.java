package com.iqoption.core.microservices.kyc.response.document;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J+\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0012J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010!\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "Landroid/os/Parcelable;", "documents", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "findWithStatus", "verificationType", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "statuses", "", "Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;", "(Lcom/iqoption/core/microservices/kyc/response/VerificationType;[Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;)Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "getDeclinedComment", "", "getForType", "type", "hasStatuses", "(Lcom/iqoption/core/microservices/kyc/response/VerificationType;[Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;)Z", "hashCode", "isDeclined", "isUnderReview", "isVerified", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycDocumentsResult.kt */
public final class e implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("documents")
    private final List<b> buX;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((b) b.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new e(arrayList);
        }

        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.buX, ((com.iqoption.core.microservices.kyc.response.document.e) r2).buX) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.microservices.kyc.response.document.e;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.microservices.kyc.response.document.e) r2;
        r0 = r1.buX;
        r2 = r2.buX;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.document.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.buX;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycDocumentsResult(documents=");
        stringBuilder.append(this.buX);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        List<b> list = this.buX;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public e(List<b> list) {
        kotlin.jvm.internal.i.f(list, "documents");
        this.buX = list;
    }

    public final List<b> aeT() {
        return this.buX;
    }

    public final boolean d(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "verificationType");
        return a(verificationType, DocumentStatus.APPROVED);
    }

    public final boolean e(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "verificationType");
        return a(verificationType, DocumentStatus.VERIFYING);
    }

    public final boolean f(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "verificationType");
        return a(verificationType, DocumentStatus.DECLINED);
    }

    public final String g(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "verificationType");
        b b = b(verificationType, DocumentStatus.DECLINED);
        return b != null ? b.getComment() : null;
    }

    private final boolean a(VerificationType verificationType, DocumentStatus... documentStatusArr) {
        return b(verificationType, (DocumentStatus[]) Arrays.copyOf(documentStatusArr, documentStatusArr.length)) != null;
    }

    private final b b(VerificationType verificationType, DocumentStatus... documentStatusArr) {
        for (Object next : this.buX) {
            Object obj;
            b bVar = (b) next;
            if (bVar.aeO() == verificationType && i.contains((Object[]) documentStatusArr, (Object) bVar.aeN())) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (b) next2;
    }

    public final b h(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "type");
        for (Object next : this.buX) {
            Object obj;
            if (((b) next).aeO() == verificationType) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (b) next2;
    }
}
