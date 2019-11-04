package com.iqoption.core.ui.d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "Landroid/os/Parcelable;", "type", "", "arguments", "Landroid/os/Bundle;", "(ILandroid/os/Bundle;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "navigate", "", "fragment", "Landroidx/fragment/app/Fragment;", "entry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "writeToParcel", "dest", "flags", "Companion", "core_release"})
/* compiled from: ParcelableNavigator.kt */
public final class d implements Parcelable {
    public static final Creator<d> CREATOR = new b();
    public static final a bJk = new a();
    private final Bundle bJj;
    private final int type;

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/ui/navigation/ParcelableNavigator$Companion;", "", "()V", "ARG_STACK_IS_ROOT", "", "ARG_STACK_OPERATION", "ARG_STACK_POP_IS_INCLUSIVE", "ARG_STACK_POP_TAG", "ARG_UID", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "STACK_OPERATION_ADD", "", "STACK_OPERATION_POP", "STACK_OPERATION_REPLACE", "TYPE_SLOT", "TYPE_STACK", "stackReplace", "uid", "isRoot", "", "core_release"})
    /* compiled from: ParcelableNavigator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, bng = {"com/iqoption/core/ui/navigation/ParcelableNavigator$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "core_release"})
    /* compiled from: ParcelableNavigator.kt */
    public static final class b implements Creator<d> {
        b() {
        }

        /* renamed from: aa */
        public d createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "source");
            return new d(parcel);
        }

        /* renamed from: fe */
        public d[] newArray(int i) {
            d[] dVarArr = new d[i];
            int length = dVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                dVarArr[i2] = null;
            }
            return dVarArr;
        }
    }

    public int describeContents() {
        return 0;
    }

    public d(Parcel parcel) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        this.type = parcel.readInt();
        this.bJj = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "dest");
        parcel.writeInt(this.type);
        parcel.writeBundle(this.bJj);
    }

    public final void a(Fragment fragment, c cVar) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        kotlin.jvm.internal.i.f(cVar, "entry");
        int i = this.type;
        String str = "arg.uid";
        String str2 = null;
        Bundle bundle;
        if (i == 1) {
            bundle = this.bJj;
            if (bundle != null) {
                str2 = bundle.getString(str);
            }
            e a = i.a(fragment, str2);
            if (a != null) {
                a.a(cVar);
            }
        } else if (i == 2) {
            bundle = this.bJj;
            g b = i.b(fragment, bundle != null ? bundle.getString(str) : null);
            if (b != null) {
                Integer valueOf;
                bundle = this.bJj;
                if (bundle != null) {
                    valueOf = Integer.valueOf(bundle.getInt("arg.stackOperation"));
                }
                String str3 = "arg.isRoot";
                if (valueOf != null && valueOf.intValue() == 1) {
                    b.a(cVar, this.bJj.getBoolean(str3));
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    b.b(cVar, this.bJj.getBoolean(str3));
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    String string = this.bJj.getString("arg.stackPopTag");
                    if (string != null) {
                        b.q(string, this.bJj.getBoolean("arg.stackPopIsInclusive", false));
                    } else {
                        b.alG();
                    }
                }
            }
        }
    }
}
