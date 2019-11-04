package com.iqoption.core.ui.d;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.ref.WeakReference;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 E2\u00020\u0001:\u0001EB\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0014J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010<\u001a\u00020\u0000J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\nHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001a\u0010\f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u001a\u0010\r\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001c¨\u0006F"}, bng = {"Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "", "name", "", "fClass", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fArgs", "Landroid/os/Bundle;", "enterAnim", "", "exitAnim", "popEnterAnim", "popExitAnim", "enterTransition", "Landroidx/transition/Transition;", "exitTransition", "reenterTransition", "returnTransition", "(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;IIIILandroidx/transition/Transition;Landroidx/transition/Transition;Landroidx/transition/Transition;Landroidx/transition/Transition;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;IIIILandroidx/transition/Transition;Landroidx/transition/Transition;Landroidx/transition/Transition;Landroidx/transition/Transition;)V", "getEnterAnim", "()I", "setEnterAnim", "(I)V", "getEnterTransition", "()Landroidx/transition/Transition;", "setEnterTransition", "(Landroidx/transition/Transition;)V", "getExitAnim", "setExitAnim", "getExitTransition", "setExitTransition", "getFArgs", "()Landroid/os/Bundle;", "getFClass", "()Ljava/lang/String;", "fragmentRef", "Ljava/lang/ref/WeakReference;", "getName", "getPopEnterAnim", "setPopEnterAnim", "getPopExitAnim", "setPopExitAnim", "getReenterTransition", "setReenterTransition", "getReturnTransition", "setReturnTransition", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "enableSimpleAnimations", "equals", "", "other", "getFragment", "context", "Landroid/content/Context;", "hashCode", "toString", "Companion", "core_release"})
/* compiled from: NavigatorEntry.kt */
public final class c {
    public static final a bJi = new a();
    private Transition bHq;
    private Transition bHr;
    private Transition bHs;
    private Transition bHt;
    private WeakReference<Fragment> bJf;
    private final String bJg;
    private final Bundle bJh;
    private int enterAnim;
    private int exitAnim;
    private final String name;
    private int popEnterAnim;
    private int popExitAnim;

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\bJ!\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\tH\bJ\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\t¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/ui/navigation/NavigatorEntry$Companion;", "", "()V", "from", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "Cls", "Landroidx/fragment/app/Fragment;", "args", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "Lkotlin/ExtensionFunctionType;", "cls", "Ljava/lang/Class;", "core_release"})
    /* compiled from: NavigatorEntry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ c a(a aVar, Class cls, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = (Bundle) null;
            }
            return aVar.a(cls, bundle);
        }

        public final c a(Class<? extends Fragment> cls, Bundle bundle) {
            Class<? extends Fragment> cls2 = cls;
            kotlin.jvm.internal.i.f(cls2, "cls");
            String name = cls.getName();
            kotlin.jvm.internal.i.e(name, "cls.name");
            return new c(name, cls2, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, Bundle bundle, int i, int i2, int i3, int i4, Transition transition, Transition transition2, Transition transition3, Transition transition4, int i5, Object obj) {
        c cVar2 = cVar;
        int i6 = i5;
        return cVar.a((i6 & 1) != 0 ? cVar2.name : str, (i6 & 2) != 0 ? cVar2.bJg : str2, (i6 & 4) != 0 ? cVar2.bJh : bundle, (i6 & 8) != 0 ? cVar2.enterAnim : i, (i6 & 16) != 0 ? cVar2.exitAnim : i2, (i6 & 32) != 0 ? cVar2.popEnterAnim : i3, (i6 & 64) != 0 ? cVar2.popExitAnim : i4, (i6 & 128) != 0 ? cVar2.bHq : transition, (i6 & 256) != 0 ? cVar2.bHs : transition2, (i6 & 512) != 0 ? cVar2.bHr : transition3, (i6 & 1024) != 0 ? cVar2.bHt : transition4);
    }

    public final c a(String str, String str2, Bundle bundle, int i, int i2, int i3, int i4, Transition transition, Transition transition2, Transition transition3, Transition transition4) {
        String str3 = str;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        String str4 = str2;
        kotlin.jvm.internal.i.f(str2, "fClass");
        return new c(str3, str4, bundle, i, i2, i3, i4, transition, transition2, transition3, transition4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.i.y(this.name, cVar.name) && kotlin.jvm.internal.i.y(this.bJg, cVar.bJg) && kotlin.jvm.internal.i.y(this.bJh, cVar.bJh)) {
                    if ((this.enterAnim == cVar.enterAnim ? 1 : null) != null) {
                        if ((this.exitAnim == cVar.exitAnim ? 1 : null) != null) {
                            if ((this.popEnterAnim == cVar.popEnterAnim ? 1 : null) != null) {
                                if (!((this.popExitAnim == cVar.popExitAnim ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bHq, cVar.bHq) && kotlin.jvm.internal.i.y(this.bHs, cVar.bHs) && kotlin.jvm.internal.i.y(this.bHr, cVar.bHr) && kotlin.jvm.internal.i.y(this.bHt, cVar.bHt))) {
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
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bJg;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Bundle bundle = this.bJh;
        hashCode = (((((((((hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim) * 31;
        Transition transition = this.bHq;
        hashCode = (hashCode + (transition != null ? transition.hashCode() : 0)) * 31;
        transition = this.bHs;
        hashCode = (hashCode + (transition != null ? transition.hashCode() : 0)) * 31;
        transition = this.bHr;
        hashCode = (hashCode + (transition != null ? transition.hashCode() : 0)) * 31;
        transition = this.bHt;
        if (transition != null) {
            i = transition.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NavigatorEntry(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", fClass=");
        stringBuilder.append(this.bJg);
        stringBuilder.append(", fArgs=");
        stringBuilder.append(this.bJh);
        stringBuilder.append(", enterAnim=");
        stringBuilder.append(this.enterAnim);
        stringBuilder.append(", exitAnim=");
        stringBuilder.append(this.exitAnim);
        stringBuilder.append(", popEnterAnim=");
        stringBuilder.append(this.popEnterAnim);
        stringBuilder.append(", popExitAnim=");
        stringBuilder.append(this.popExitAnim);
        stringBuilder.append(", enterTransition=");
        stringBuilder.append(this.bHq);
        stringBuilder.append(", exitTransition=");
        stringBuilder.append(this.bHs);
        stringBuilder.append(", reenterTransition=");
        stringBuilder.append(this.bHr);
        stringBuilder.append(", returnTransition=");
        stringBuilder.append(this.bHt);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(String str, String str2, Bundle bundle, int i, int i2, int i3, int i4, Transition transition, Transition transition2, Transition transition3, Transition transition4) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "fClass");
        this.name = str;
        this.bJg = str2;
        this.bJh = bundle;
        this.enterAnim = i;
        this.exitAnim = i2;
        this.popEnterAnim = i3;
        this.popExitAnim = i4;
        this.bHq = transition;
        this.bHs = transition2;
        this.bHr = transition3;
        this.bHt = transition4;
    }

    public final String getName() {
        return this.name;
    }

    public final String alF() {
        return this.bJg;
    }

    public final Transition RY() {
        return this.bHq;
    }

    public final Transition Sb() {
        return this.bHs;
    }

    public final Transition RZ() {
        return this.bHr;
    }

    public final Transition Sa() {
        return this.bHt;
    }

    public /* synthetic */ c(String str, Class cls, Bundle bundle, int i, int i2, int i3, int i4, Transition transition, Transition transition2, Transition transition3, Transition transition4, int i5, f fVar) {
        int i6 = i5;
        this(str, cls, (i6 & 4) != 0 ? (Bundle) null : bundle, (i6 & 8) != 0 ? -1 : i, (i6 & 16) != 0 ? -1 : i2, (i6 & 32) != 0 ? -1 : i3, (i6 & 64) != 0 ? -1 : i4, (i6 & 128) != 0 ? (Transition) null : transition, (i6 & 256) != 0 ? (Transition) null : transition2, (i6 & 512) != 0 ? (Transition) null : transition3, (i6 & 1024) != 0 ? (Transition) null : transition4);
    }

    public c(String str, Class<? extends Fragment> cls, Bundle bundle, int i, int i2, int i3, int i4, Transition transition, Transition transition2, Transition transition3, Transition transition4) {
        String str2 = str;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        Class<? extends Fragment> cls2 = cls;
        kotlin.jvm.internal.i.f(cls, "fClass");
        String name = cls.getName();
        kotlin.jvm.internal.i.e(name, "fClass.name");
        this(str2, name, bundle, i, i2, i3, i4, transition, transition2, transition3, transition4);
    }

    public final Fragment bh(Context context) {
        Fragment fragment;
        Fragment instantiate;
        kotlin.jvm.internal.i.f(context, "context");
        WeakReference weakReference = this.bJf;
        if (weakReference != null) {
            fragment = (Fragment) weakReference.get();
            if (fragment != null) {
                return fragment;
            }
        }
        Bundle bundle = this.bJh;
        if (bundle != null) {
            instantiate = Fragment.instantiate(context, this.bJg, bundle);
        } else {
            instantiate = Fragment.instantiate(context, this.bJg);
        }
        fragment = instantiate;
        this.bJf = new WeakReference(fragment);
        kotlin.jvm.internal.i.e(fragment, "if (fArgs != null) {\n   …akReference(it)\n        }");
        return fragment;
    }
}
