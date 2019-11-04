package com.iqoption.fragment.c.a;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.iqoption.x.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006\u001d"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dateParser", "Ljava/text/SimpleDateFormat;", "getDateParser", "()Ljava/text/SimpleDateFormat;", "grayBlueColor", "", "getGrayBlueColor", "()I", "greenColor", "getGreenColor", "naSymbol", "", "getNaSymbol", "()Ljava/lang/String;", "redColor", "getRedColor", "whiteColor", "getWhiteColor", "setTextColor", "", "textView", "Landroid/widget/TextView;", "value", "", "app_optionXRelease"})
/* compiled from: UIConfig.kt */
public final class a {
    @ColorInt
    private final int amj;
    @ColorInt
    private final int amk;
    @ColorInt
    private final int aml;
    @ColorInt
    private final int cNp;
    private final String dgF;
    private final SimpleDateFormat dgG = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());

    public a(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        this.amj = ContextCompat.getColor(context, R.color.green);
        this.amk = ContextCompat.getColor(context, R.color.red);
        this.aml = ContextCompat.getColor(context, R.color.white);
        this.cNp = ContextCompat.getColor(context, R.color.grey_blue_70);
        String string = context.getString(R.string.n_a);
        kotlin.jvm.internal.i.e(string, "context.getString(R.string.n_a)");
        this.dgF = string;
    }

    public final int aDk() {
        return this.aml;
    }

    public final int aDl() {
        return this.cNp;
    }

    public final String aDm() {
        return this.dgF;
    }

    public final SimpleDateFormat aDn() {
        return this.dgG;
    }

    public final void a(TextView textView, double d) {
        kotlin.jvm.internal.i.f(textView, "textView");
        if (d > 0.001d) {
            textView.setTextColor(this.amj);
        } else if (d < -0.001d) {
            textView.setTextColor(this.amk);
        } else {
            textView.setTextColor(this.aml);
        }
    }
}
