package com.iqoption.feed.feedlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.d;
import com.iqoption.dto.Currencies;
import com.iqoption.feed.i.f;
import com.iqoption.feed.i.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 ,2\u00020\u0001:\u0002,-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010J\b\u0010\u001e\u001a\u00020\u0018H\u0002J0\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J\u001a\u0010)\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0015R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/feed/feedlist/TagLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allTags", "", "", "expandItem", "Landroid/widget/TextView;", "horizontalPadding", "item", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "offset", "textItemSize", "", "topicClickListener", "Lcom/iqoption/feed/feedlist/TagLayout$TopicClickListener;", "verticalPadding", "addTag", "", "inflater", "Landroid/view/LayoutInflater;", "topic", "bindTags", "feedAdapterItem", "expand", "onLayout", "changed", "", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "processAttributes", "setTopicClickListener", "listener", "Companion", "TopicClickListener", "feed_release"})
/* compiled from: TagLayout.kt */
public final class TagLayout extends ViewGroup {
    private static final LruCache<String, Integer> cRc = new LruCache(128);
    private static final Map<String, Integer> cRd;
    public static final a cRe = new a();
    private static final CRC32 crc = new CRC32();
    private static int[] hR;
    private int bJm;
    private int bJn;
    private d cQX;
    private float cQY;
    private final List<String> cQZ;
    private final TextView cRa;
    private b cRb;
    private final int offset;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: TagLayout.kt */
    /* renamed from: com.iqoption.feed.feedlist.TagLayout$1 */
    static final class AnonymousClass1 implements OnClickListener {
        final /* synthetic */ TagLayout cRf;

        AnonymousClass1(TagLayout tagLayout) {
            this.cRf = tagLayout;
        }

        public final void onClick(View view) {
            d b = this.cRf.cQX;
            if (b == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            b.dj(true);
            b a = this.cRf.cRb;
            if (a != null) {
                a.fP(b.YQ().getId());
            }
            this.cRf.rx();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/feed/feedlist/TagLayout$Companion;", "", "()V", "COLOR_CACHE", "Landroid/util/LruCache;", "", "", "PREVIEW_COUNT", "colors", "", "crc", "Ljava/util/zip/CRC32;", "tagPallete", "", "colorForTag", "tag", "getUnsignedCrc", "", "value", "resolveColor", "colorRes", "resolveTagColor", "feed_release"})
    /* compiled from: TagLayout.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final int fQ(int i) {
            return ContextCompat.getColor(d.Uo(), i);
        }

        private final long hY(String str) {
            CRC32 awb = TagLayout.crc;
            Charset forName = Charset.forName("UTF-8");
            kotlin.jvm.internal.i.e(forName, "Charset.forName(\"UTF-8\")");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                kotlin.jvm.internal.i.e(bytes, "(this as java.lang.String).getBytes(charset)");
                awb.update(bytes);
                long value = TagLayout.crc.getValue();
                TagLayout.crc.reset();
                return value & 4294967295L;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        private final int hZ(String str) {
            Integer num = (Integer) TagLayout.cRc.get(str);
            if (num != null) {
                return num.intValue();
            }
            long hY = hY(str);
            if (TagLayout.hR == null) {
                TypedArray obtainTypedArray = d.Uo().getResources().obtainTypedArray(com.iqoption.feed.i.a.default_feed);
                TagLayout.hR = new int[obtainTypedArray.length()];
                int length = obtainTypedArray.length();
                for (int i = 0; i < length; i++) {
                    int[] awd = TagLayout.hR;
                    if (awd == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    awd[i] = obtainTypedArray.getColor(i, 0);
                }
                obtainTypedArray.recycle();
            }
            int[] awd2 = TagLayout.hR;
            if (awd2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            int length2 = (int) (hY % ((long) awd2.length));
            int[] awd3 = TagLayout.hR;
            if (awd3 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            int i2 = awd3[length2];
            TagLayout.cRc.put(str, Integer.valueOf(i2));
            return i2;
        }

        private final int ia(String str) {
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
            if (str != null) {
                str = str.toUpperCase(locale);
                kotlin.jvm.internal.i.e(str, "(this as java.lang.String).toUpperCase(locale)");
                Integer num = (Integer) TagLayout.cRd.get(str);
                return num != null ? num.intValue() : hZ(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, bng = {"Lcom/iqoption/feed/feedlist/TagLayout$TopicClickListener;", "", "onExpandClick", "", "id", "", "onTopicClick", "topic", "", "feed_release"})
    /* compiled from: TagLayout.kt */
    public interface b {
        void fP(int i);

        void hV(String str);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: TagLayout.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ TagLayout cRf;
        final /* synthetic */ String cRg;

        c(TagLayout tagLayout, String str) {
            this.cRf = tagLayout;
            this.cRg = str;
        }

        public final void onClick(View view) {
            b a = this.cRf.cRb;
            if (a != null) {
                a.hV(this.cRg);
            }
        }
    }

    public TagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TagLayout(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public TagLayout(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.offset = context.getResources().getDimensionPixelOffset(com.iqoption.feed.i.c.dp6);
        this.cQZ = new ArrayList();
        c(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(f.expand_tag_item, this, false);
        if (inflate != null) {
            this.cRa = (TextView) inflate;
            TextView textView = this.cRa;
            int i2 = this.bJm;
            i = this.bJn;
            textView.setPadding(i2, i, i2, i);
            this.cRa.setTextSize(0, this.cQY);
            this.cRa.setOnClickListener(new AnonymousClass1(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    static {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("ETC", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_bch_etc_neo)));
        pairArr[1] = new Pair("BCH", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_bch_etc_neo)));
        pairArr[2] = new Pair("NEO", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_bch_etc_neo)));
        pairArr[3] = new Pair(Currencies.BTC_CURRENCY, Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_btc)));
        pairArr[4] = new Pair(Currencies.ETH_CURRENCY, Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_eth_lth)));
        pairArr[5] = new Pair("LTH", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_eth_lth)));
        pairArr[6] = new Pair(Currencies.OTN_CURRENCY, Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_otn)));
        pairArr[7] = new Pair("XRP", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_dash_xrp_qtm)));
        pairArr[8] = new Pair("DASH", Integer.valueOf(cRe.fQ(com.iqoption.feed.i.b.feed_dash_xrp_qtm)));
        cRd = af.a(pairArr);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.TagLayout, 0, 0);
        try {
            this.bJm = (int) obtainStyledAttributes.getDimension(h.TagLayout_horizontalItemPadding, (float) context.getResources().getDimensionPixelOffset(com.iqoption.feed.i.c.dp8));
            this.bJn = (int) obtainStyledAttributes.getDimension(h.TagLayout_verticalItemPadding, (float) context.getResources().getDimensionPixelOffset(com.iqoption.feed.i.c.dp3));
            this.cQY = obtainStyledAttributes.getDimension(h.TagLayout_itemTextSize, (float) context.getResources().getDimensionPixelOffset(com.iqoption.feed.i.c.sp10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        i = getPaddingTop();
        i2 = getMeasuredWidth() - getPaddingEnd();
        i4 = i2 - paddingStart;
        i3 = (getMeasuredHeight() - getPaddingBottom()) - i;
        int childCount = getChildCount();
        int i5 = i;
        int i6 = 0;
        i = paddingStart;
        for (paddingStart = 0; paddingStart < childCount; paddingStart++) {
            View childAt = getChildAt(paddingStart);
            kotlin.jvm.internal.i.e(childAt, "child");
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i + measuredWidth >= i2) {
                    i5 += i6 + this.offset;
                    i = 0;
                    i6 = 0;
                }
                childAt.layout(i, i5, i + measuredWidth, i5 + measuredHeight);
                if (i6 < measuredHeight) {
                    i6 = measuredHeight;
                }
                i += measuredWidth + this.offset;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            kotlin.jvm.internal.i.e(childAt, "child");
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                if (childAt.getMeasuredWidth() + i5 > getMeasuredWidth()) {
                    i3 += childAt.getMeasuredHeight() + this.offset;
                    i5 = 0;
                } else {
                    i3 = Math.max(i3, childAt.getMeasuredHeight());
                }
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
                i5 += childAt.getMeasuredWidth() + this.offset;
            }
        }
        setMeasuredDimension(getMeasuredWidth(), View.resolveSizeAndState(Math.max(i3, getSuggestedMinimumHeight()), i2, i4 << 16));
    }

    public final void setTopicClickListener(b bVar) {
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        this.cRb = bVar;
    }

    public final void p(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "feedAdapterItem");
        this.cQX = dVar;
        List adK = dVar.YQ().adK();
        if (getChildCount() != 0) {
            removeAllViews();
        }
        this.cQZ.clear();
        this.cQZ.addAll(adK);
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = dVar.avX() ? adK.size() : 3;
        for (String str : u.g(adK, size)) {
            kotlin.jvm.internal.i.e(from, "inflater");
            a(from, str);
        }
        if (this.cQZ.size() > size) {
            TextView textView = this.cRa;
            n nVar = n.eWf;
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
            Object[] objArr = new Object[]{Integer.valueOf(this.cQZ.size() - 3)};
            String format = String.format(locale, "+%d", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
            textView.setText(format);
            addView(this.cRa);
        }
    }

    private final void rx() {
        removeView(this.cRa);
        LayoutInflater from = LayoutInflater.from(getContext());
        List list = this.cQZ;
        for (String str : u.j(list, list.size() - 3)) {
            kotlin.jvm.internal.i.e(from, "inflater");
            a(from, str);
        }
    }

    private final void a(LayoutInflater layoutInflater, String str) {
        View inflate = layoutInflater.inflate(f.tag_item, this, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(str);
            textView.getBackground().setColorFilter(cRe.ia(str), Mode.SRC_ATOP);
            int i = this.bJm;
            int i2 = this.bJn;
            textView.setPadding(i, i2, i, i2);
            textView.setTextSize(0, this.cQY);
            textView.setOnClickListener(new c(this, str));
            textView.setContentDescription("smartfeed_tag");
            addView(textView);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
