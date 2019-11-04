package com.iqoption.deposit.hold;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.iqoption.core.ext.a;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.d;
import com.iqoption.deposit.verification.VerificationState;
import com.iqoption.deposit.verification.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, bng = {"applyWarningMessage", "", "textView", "Landroid/widget/TextView;", "verifyWarning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "setStartDrawable", "view", "drawableResId", "", "deposit_release"})
/* compiled from: BaseDepositHoldFragment.kt */
public final class c {
    private static final void a(TextView textView, e<?> eVar) {
        VerificationState ath;
        Context context = textView.getContext();
        if (eVar != null) {
            ath = eVar.ath();
        } else {
            ath = null;
        }
        if (ath != null) {
            int i = d.aob[ath.ordinal()];
            String str = "context";
            if (i == 1) {
                a.ak(textView);
                g(textView, d.ic_wait);
                kotlin.jvm.internal.i.e(context, str);
                textView.setTextColor(a.k(context, b.deposit_dimmed_grey));
                textView.setText(eVar.getMessage());
                return;
            } else if (i != 2) {
                a.ak(textView);
                g(textView, d.ic_error_red);
                kotlin.jvm.internal.i.e(context, str);
                textView.setTextColor(a.k(context, b.deposit_red));
                textView.setText(eVar.getMessage());
                return;
            }
        }
        a.al(textView);
    }

    private static final void g(TextView textView, @DrawableRes int i) {
        Context context = textView.getContext();
        kotlin.jvm.internal.i.e(context, "context");
        Drawable n = a.n(context, i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.iqoption.deposit.o.c.dp20);
        n.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        a.c(textView, n);
    }
}
