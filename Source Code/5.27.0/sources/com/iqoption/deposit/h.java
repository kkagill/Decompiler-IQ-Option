package com.iqoption.deposit;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.util.b.b;
import com.iqoption.core.util.b.d;
import com.iqoption.core.util.b.e;
import com.iqoption.deposit.o.g;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/DepositKycUtils;", "", "()V", "setKycVerifyText", "", "fragment", "Landroidx/fragment/app/Fragment;", "textView", "Landroid/widget/TextView;", "message", "", "red", "", "deposit_release"})
/* compiled from: DepositKycUtils.kt */
public final class h {
    public static final h cwJ = new h();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/DepositKycUtils$setKycVerifyText$params$1", "Lcom/iqoption/core/util/link/LinkClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "deposit_release"})
    /* compiled from: DepositKycUtils.kt */
    public static final class a implements b {
        final /* synthetic */ Fragment cwK;

        a(Fragment fragment) {
            this.cwK = fragment;
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            com.iqoption.deposit.navigator.b.cGp.a(this.cwK, false, KycVerificationContext.BILLING_DEPOSIT_AML);
        }
    }

    private h() {
    }

    public final void a(Fragment fragment, TextView textView, CharSequence charSequence, boolean z) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        kotlin.jvm.internal.i.f(textView, "textView");
        kotlin.jvm.internal.i.f(charSequence, "message");
        String string = com.iqoption.core.ext.a.q(fragment).getString(g.kyc_verify_account);
        kotlin.jvm.internal.i.e(string, "ctx.getString(R.string.kyc_verify_account)");
        if (string != null) {
            string = string.toUpperCase();
            kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toUpperCase()");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append(".\n");
            spannableStringBuilder.append(string);
            d.a(new e(new com.iqoption.core.util.b.a[]{new com.iqoption.core.util.b.a(string, "")}, textView, spannableStringBuilder, z ? o.b.red : o.b.green, z ? o.b.red_50 : o.b.green_50, true, new a(fragment)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
