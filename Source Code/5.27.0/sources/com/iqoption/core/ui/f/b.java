package com.iqoption.core.ui.f;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.util.e;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bJ\u0018\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u000eJ\u000e\u0010*\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010+\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u000eJ\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000b¨\u0006."}, bng = {"Lcom/iqoption/core/ui/viewmodel/DecimalInputHelper;", "", "numberString", "", "precision", "", "(Ljava/lang/String;I)V", "<set-?>", "", "externalNumberValue", "getExternalNumberValue", "()D", "isUserDefinedNumber", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isUserDefinedNumberData", "Landroidx/lifecycle/MutableLiveData;", "number", "getNumber", "numberData", "numberValue", "getNumberValue", "getPrecision", "precisionData", "value", "precisionValue", "getPrecisionValue", "()I", "setPrecisionValue", "(I)V", "trackUserNumber", "setTrackUserNumber", "(Z)V", "userNumberValue", "getUserNumberValue", "plus", "", "step", "setExternalNumber", "str", "force", "setPrecision", "setUserNumber", "validateNumberStringToBeParsedSafe", "Companion", "core_release"})
/* compiled from: DecimalInputHelper.kt */
public final class b {
    private static final Regex bJQ = new Regex("0+");
    private static final Regex bJR = new Regex("0[1-9]+");
    public static final a bJS = new a();
    private int bJJ;
    private boolean bJK;
    private double bJL;
    private double bJM;
    private final MutableLiveData<Integer> bJN;
    private final MutableLiveData<String> bJO;
    private final MutableLiveData<Boolean> bJP;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/ui/viewmodel/DecimalInputHelper$Companion;", "", "()V", "LEADING_ZERO_REGEX", "Lkotlin/text/Regex;", "ZERO_REGEX", "format", "", "value", "", "precision", "", "core_release"})
    /* compiled from: DecimalInputHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String d(double d, int i) {
            return e.a(d, i, null, false, false, false, false, null, null, 254, null);
        }
    }

    public b(String str, int i) {
        kotlin.jvm.internal.i.f(str, "numberString");
        this.bJJ = i;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Integer.valueOf(i));
        this.bJN = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        mutableLiveData2.setValue(str);
        this.bJO = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        mutableLiveData3.setValue(Boolean.valueOf(this.bJK));
        this.bJP = mutableLiveData3;
    }

    public final int alJ() {
        return this.bJJ;
    }

    private final void ff(int i) {
        if (this.bJJ != i) {
            this.bJJ = i;
            this.bJN.setValue(Integer.valueOf(this.bJJ));
        }
    }

    private final void cH(boolean z) {
        if (this.bJK != z) {
            this.bJK = z;
            this.bJP.setValue(Boolean.valueOf(z));
        }
    }

    public final double alK() {
        return this.bJM;
    }

    public final double alL() {
        return this.bJK ? this.bJL : this.bJM;
    }

    public final LiveData<Integer> BI() {
        return this.bJN;
    }

    public final LiveData<String> alM() {
        return this.bJO;
    }

    public final LiveData<Boolean> alN() {
        return this.bJP;
    }

    public final void fg(int i) {
        ff(i);
    }

    public static /* synthetic */ void a(b bVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bVar.r(str, z);
    }

    public final void r(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "str");
        Object hj = hj(str);
        this.bJM = e.ho(hj);
        if (z || !this.bJK) {
            com.iqoption.core.ext.a.a(this.bJO, hj);
            if (this.bJK) {
                cH(false);
            }
        }
    }

    public static /* synthetic */ void b(b bVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bVar.s(str, z);
    }

    public final void s(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "str");
        Object hj = hj(str);
        this.bJL = e.ho(hj);
        if (z || this.bJK) {
            com.iqoption.core.ext.a.a(this.bJO, hj);
            if (!this.bJK) {
                cH(true);
            }
        }
    }

    public final void p(double d) {
        double alL = alL() + d;
        if (alL < ((double) null)) {
            alL = 0.0d;
        }
        b(this, bJS.d(alL, this.bJJ), false, 2, null);
    }

    private final String hj(String str) {
        CharSequence charSequence = str;
        if ((charSequence.length() == 0 ? 1 : null) != null || bJQ.L(charSequence)) {
            return "0";
        }
        if (!bJR.L(charSequence)) {
            return str;
        }
        if (str != null) {
            str = str.substring(1);
            kotlin.jvm.internal.i.e(str, "(this as java.lang.String).substring(startIndex)");
            return str;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
