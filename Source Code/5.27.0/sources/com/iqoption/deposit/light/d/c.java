package com.iqoption.deposit.light.d;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ext.a;
import com.iqoption.core.util.e;
import com.iqoption.deposit.b.ap;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.d;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/light/presets/PresetLightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemPresetLightBinding;", "listener", "Lcom/iqoption/deposit/light/presets/OnPresetLightClickListener;", "(Lcom/iqoption/deposit/databinding/ItemPresetLightBinding;Lcom/iqoption/deposit/light/presets/OnPresetLightClickListener;)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ItemPresetLightBinding;", "bound", "Lcom/iqoption/deposit/light/presets/PresetItem;", "bind", "", "item", "deposit_release"})
/* compiled from: PresetLightViewHolder.kt */
public final class c extends ViewHolder {
    private b cFX;
    private final ap cFY;

    public c(ap apVar, final a aVar) {
        kotlin.jvm.internal.i.f(apVar, "binding");
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        super(apVar.getRoot());
        this.cFY = apVar;
        this.cFY.getRoot().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ c cFZ;

            public final void onClick(View view) {
                a aVar = aVar;
                b a = this.cFZ.cFX;
                if (a == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                aVar.a(a);
            }
        });
    }

    public final void b(b bVar) {
        int i;
        kotlin.jvm.internal.i.f(bVar, "item");
        this.cFX = bVar;
        TextView textView = this.cFY.cDe;
        textView.setText(e.a(new BigDecimal(bVar.asL().ZC()), 0, bVar.aoo().getMask(), true, false, null, 25, null));
        if (bVar.asM()) {
            i = b.black;
        } else {
            i = b.deposit_dark_grey;
        }
        Context context = textView.getContext();
        String str = "context";
        kotlin.jvm.internal.i.e(context, str);
        textView.setTextColor(a.k(context, i));
        FrameLayout frameLayout = this.cFY.cDf;
        frameLayout.setSelected(bVar.asM());
        String str2 = "binding.presetVipBadge";
        Context context2;
        ImageView imageView;
        if (kotlin.jvm.internal.i.y(bVar.asL().aaw(), "vip")) {
            context2 = frameLayout.getContext();
            kotlin.jvm.internal.i.e(context2, str);
            frameLayout.setBackground(a.n(context2, d.bg_grey_orange_rounded));
            imageView = this.cFY.cDg;
            kotlin.jvm.internal.i.e(imageView, str2);
            a.ak(imageView);
            return;
        }
        context2 = frameLayout.getContext();
        kotlin.jvm.internal.i.e(context2, str);
        frameLayout.setBackground(a.n(context2, d.bg_grey_green_rounded));
        imageView = this.cFY.cDg;
        kotlin.jvm.internal.i.e(imageView, str2);
        a.al(imageView);
    }
}
