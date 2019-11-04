package com.iqoption.fragment.rightpanel.a.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callIcon", "Landroid/graphics/drawable/Drawable;", "getCallIcon", "()Landroid/graphics/drawable/Drawable;", "greenColor", "", "getGreenColor", "()I", "putIcon", "getPutIcon", "redColor", "getRedColor", "app_optionXRelease"})
/* compiled from: UIConfig.kt */
public final class c {
    @ColorInt
    private final int amj;
    @ColorInt
    private final int amk;
    private final Drawable dqh;
    private final Drawable dqi;

    public c(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        this.amj = ContextCompat.getColor(context, R.color.green);
        this.amk = ContextCompat.getColor(context, R.color.red);
        this.dqh = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_call_10dp);
        this.dqi = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_put_10dp);
    }

    public final int aHT() {
        return this.amj;
    }

    public final int aHU() {
        return this.amk;
    }

    public final Drawable aHV() {
        return this.dqh;
    }

    public final Drawable aHW() {
        return this.dqi;
    }
}
