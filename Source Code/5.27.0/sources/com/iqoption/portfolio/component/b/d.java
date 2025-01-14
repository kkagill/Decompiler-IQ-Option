package com.iqoption.portfolio.component.b;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.iqoption.core.features.instrument.b;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BC\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, bng = {"Lcom/iqoption/portfolio/component/data/FilterItem;", "", "text", "", "testTag", "color", "icon", "filter", "mask", "", "(IIIIILjava/lang/String;)V", "getColor", "()I", "getFilter", "getIcon", "getMask", "()Ljava/lang/String;", "getTestTag", "getText", "Companion", "app_optionXRelease"})
/* compiled from: FilterItem.kt */
public final class d {
    public static final a dMZ = new a();
    private final int color;
    private final int dMY;
    private final int filter;
    private final int icon;
    private final String mask;
    private final int text;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/portfolio/component/data/FilterItem$Companion;", "", "()V", "get", "", "Lcom/iqoption/portfolio/component/data/FilterItem;", "context", "Landroid/content/Context;", "app_optionXRelease"})
    /* compiled from: FilterItem.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final List<d> bG(Context context) {
            kotlin.jvm.internal.i.f(context, "context");
            n nVar = n.eWf;
            Object[] objArr = new Object[]{r0.getString(R.string.value1)};
            String format = String.format("%s %%s", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
            ArrayList arrayList = new ArrayList();
            if (b.Xu()) {
                arrayList.add(new d(R.string.cfd, R.string.test_tag_cfd_assets, R.color.grey_blur_70, 0, 4, null, 32, null));
            }
            if (b.Xv()) {
                arrayList.add(new d(R.string.forex, R.string.test_tag_for_assets, R.color.grey_blur_70, 0, 5, null, 32, null));
            }
            if (b.Xw()) {
                arrayList.add(new d(R.string.crypto, R.string.test_tag_cry_assets, R.color.grey_blur_70, 0, 6, null, 32, null));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new d(R.string.all_assets, R.string.test_tag_all_assets, R.color.white, 0, 0, format, null));
            if (!arrayList.isEmpty()) {
                arrayList2.add(new d(R.string.no_expiration, R.string.test_tag_market_assets, R.color.white, R.drawable.ic_infinity_grey_blur_20dp, 2, null, 32, null));
                arrayList2.addAll(arrayList);
            }
            arrayList = new ArrayList();
            if (b.Xr()) {
                arrayList.add(new d(R.string.digital, R.string.test_tag_dig_assets, R.color.grey_blur_70, 0, 7, null, 32, null));
            }
            if (b.Xs()) {
                arrayList.add(new d(R.string.fx, R.string.test_tag_fxo_assets, R.color.grey_blur_70, 0, 8, null, 32, null));
            }
            if (b.Xq()) {
                arrayList.add(new d(R.string.multy, R.string.test_tag_multi_assets, R.color.grey_blur_70, 0, 9, null, 32, null));
            }
            if (b.Xt()) {
                arrayList.add(new d(R.string.binary, R.string.test_tag_bin_assets, R.color.grey_blur_70, 0, 3, null, 32, null));
            }
            if (!arrayList.isEmpty()) {
                arrayList2.add(new d(R.string.expiration, R.string.test_tag_option_assets, R.color.white, R.drawable.ic_infinity_grey_blur_20dp, 1, null, 32, null));
                arrayList2.addAll(arrayList);
            }
            return u.T(arrayList2);
        }
    }

    public static final List<d> bG(Context context) {
        return dMZ.bG(context);
    }

    public /* synthetic */ d(int i, int i2, int i3, int i4, int i5, String str, f fVar) {
        this(i, i2, i3, i4, i5, str);
    }

    private d(@StringRes int i, @StringRes int i2, @ColorRes int i3, @DrawableRes int i4, int i5, String str) {
        this.text = i;
        this.dMY = i2;
        this.color = i3;
        this.icon = i4;
        this.filter = i5;
        this.mask = str;
    }

    public final int getText() {
        return this.text;
    }

    public final int aRp() {
        return this.dMY;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int aQD() {
        return this.filter;
    }

    /* synthetic */ d(int i, int i2, int i3, int i4, int i5, String str, int i6, f fVar) {
        if ((i6 & 32) != 0) {
            str = (String) null;
        }
        this(i, i2, i3, i4, i5, str);
    }

    public final String getMask() {
        return this.mask;
    }
}
