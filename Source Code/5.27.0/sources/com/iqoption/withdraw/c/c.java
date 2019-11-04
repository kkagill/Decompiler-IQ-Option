package com.iqoption.withdraw.c;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.billing.b;
import com.iqoption.core.microservices.withdraw.response.a;
import com.iqoption.core.microservices.withdraw.response.e;
import com.iqoption.core.microservices.withdraw.response.l;
import com.iqoption.core.util.r;
import com.iqoption.withdraw.d;
import com.iqoption.withdraw.d.f;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, bng = {"setMethodIcon", "", "imageView", "Landroid/widget/ImageView;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "setUpLimit", "textView", "Landroid/widget/TextView;", "mask", "", "withdraw_release"})
/* compiled from: MethodHolders.kt */
public final class c {
    private static final void a(TextView textView, com.iqoption.core.microservices.withdraw.response.c cVar, String str) {
        String a;
        com.iqoption.core.microservices.withdraw.response.c cVar2 = cVar;
        a ajF = cVar.ajF();
        Context context = textView.getContext();
        if (cVar2 instanceof e) {
            a = com.iqoption.core.util.e.a(((e) cVar2).ajG(), 0, str, false, false, false, false, null, null, 253, null);
            a = context.getString(f.up_to_n1, new Object[]{a});
        } else if (ajF != null) {
            a = com.iqoption.core.util.e.a(ajF.getValue(), 0, str, false, false, false, false, null, null, 253, null);
            a = context.getString(f.up_to_n1, new Object[]{a});
        } else {
            a = context.getString(f.no_limits);
        }
        textView.setText(a);
    }

    private static final void a(ImageView imageView, com.iqoption.core.microservices.withdraw.response.c cVar) {
        if (cVar instanceof e) {
            int intValue;
            Context context = imageView.getContext();
            Picasso.with(context).cancelRequest(imageView);
            kotlin.jvm.internal.i.e(context, "context");
            Integer a = b.a(((e) cVar).getCardType());
            if (a != null) {
                intValue = a.intValue();
            } else {
                intValue = com.iqoption.withdraw.d.c.ic_payment_method_placeholder_grey;
            }
            imageView.setImageDrawable(com.iqoption.core.ext.a.n(context, intValue));
            imageView.getLayoutParams().height = context.getResources().getDimensionPixelSize(d.b.dp32);
            imageView.requestLayout();
        } else if (cVar instanceof l) {
            Picasso with = Picasso.with(imageView.getContext());
            kotlin.jvm.internal.i.e(with, "Picasso.with(imageView.context)");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("squarelight-");
            stringBuilder.append(((l) cVar).ajP());
            r.a(with, stringBuilder.toString()).into((ImageView) imageView.findViewById(d.d.withdrawMethodIcon));
            imageView.getLayoutParams().height = -2;
            imageView.requestLayout();
        }
    }
}
