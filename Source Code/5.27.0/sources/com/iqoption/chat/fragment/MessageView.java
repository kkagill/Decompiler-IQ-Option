package com.iqoption.chat.fragment;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.text.util.LinkifyCompat;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.d;
import com.iqoption.chat.e.f;
import com.iqoption.chat.e.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002CDB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0014J\u0018\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0007H\u0014J\u0010\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u00188F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R$\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R(\u0010)\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R$\u0010,\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR(\u0010/\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u00188F@FX\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u000e\u00102\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R$\u00103\u001a\u00020 2\u0006\u0010\t\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, bng = {"Lcom/iqoption/chat/fragment/MessageView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "linkColor", "getLinkColor", "()I", "setLinkColor", "(I)V", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColor", "getTextColor", "setTextColor", "Landroid/graphics/Typeface;", "textFont", "getTextFont", "()Landroid/graphics/Typeface;", "setTextFont", "(Landroid/graphics/Typeface;)V", "textHolder", "Lcom/iqoption/chat/fragment/MessageView$TextHolder;", "", "textSize", "getTextSize", "()F", "setTextSize", "(F)V", "textTimeExtraHeight", "textTimeExtraWidth", "textTimeGap", "time", "getTime", "setTime", "timeColor", "getTimeColor", "setTimeColor", "timeFont", "getTimeFont", "setTimeFont", "timeHolder", "timeSize", "getTimeSize", "setTimeSize", "useExtraHeight", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "readAttributes", "TextHolder", "TextMetrics", "chat_release"})
/* compiled from: MessageView.kt */
public final class MessageView extends View {
    private a aTZ;
    private a aUa;
    private final int aUb;
    private final int aUc;
    private final int aUd;
    private boolean aUe;

    @i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 I2\u00020\u0001:\u0002IJB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nJ\u000e\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\nJ\u0016\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0014J\u0016\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nJ&\u0010G\u001a\u00020\u0003*\u0004\u0018\u00010#2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148G@GX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R$\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\rR\u0011\u0010&\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\rR\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R$\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\t\u001a\u0004\u0018\u00010/@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\u0004\u0018\u0001052\b\u0010\t\u001a\u0004\u0018\u0001058F@FX\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006K"}, bng = {"Lcom/iqoption/chat/fragment/MessageView$TextHolder;", "", "linkify", "", "(Z)V", "buffer", "Landroid/text/SpannableStringBuilder;", "getBuffer", "()Landroid/text/SpannableStringBuilder;", "value", "", "color", "getColor", "()I", "setColor", "(I)V", "isSingleLine", "()Z", "layout", "Landroid/text/Layout;", "", "letterSpacing", "getLetterSpacing", "()F", "setLetterSpacing", "(F)V", "lineCount", "getLineCount", "lineSpacingExtra", "getLineSpacingExtra", "setLineSpacingExtra", "linkColor", "getLinkColor", "setLinkColor", "measureCache", "Lcom/iqoption/chat/fragment/MessageView$TextHolder$MeasureCache;", "measuredHeight", "getMeasuredHeight", "measuredWidth", "getMeasuredWidth", "metrics", "Lcom/iqoption/chat/fragment/MessageView$TextMetrics;", "paint", "Landroid/text/TextPaint;", "size", "getSize", "setSize", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getLineForVertical", "offset", "getLineWidth", "line", "getOffsetForHorizontal", "measure", "outWidth", "outHeight", "isApplicable", "textHolder", "Companion", "MeasureCache", "chat_release"})
    /* compiled from: MessageView.kt */
    public static final class a {
        public static final a aUm = new a();
        private final TextPaint aUf = new TextPaint(1);
        private Layout aUg;
        private final b aUh = new b();
        private b aUi;
        private final SpannableStringBuilder aUj = new SpannableStringBuilder();
        private float aUk;
        private final boolean aUl;
        private String text;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/chat/fragment/MessageView$TextHolder$Companion;", "", "()V", "BOX_HEIGHT_MAX", "", "BOX_WIDTH_MAX", "chat_release"})
        /* compiled from: MessageView.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, bng = {"Lcom/iqoption/chat/fragment/MessageView$TextHolder$MeasureCache;", "", "()V", "outHeight", "", "getOutHeight", "()I", "setOutHeight", "(I)V", "outWidth", "getOutWidth", "setOutWidth", "size", "", "getSize", "()F", "setSize", "(F)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "chat_release"})
        /* compiled from: MessageView.kt */
        private static final class b {
            private Typeface Po;
            private int outHeight = -1;
            private int outWidth = -1;
            private float size = -1.0f;
            private String text;

            public final int Sy() {
                return this.outWidth;
            }

            public final void eC(int i) {
                this.outWidth = i;
            }

            public final int Sz() {
                return this.outHeight;
            }

            public final void eD(int i) {
                this.outHeight = i;
            }

            public final void K(float f) {
                this.size = f;
            }

            public final float getSize() {
                return this.size;
            }

            public final Typeface getTypeface() {
                return this.Po;
            }

            public final void setTypeface(Typeface typeface) {
                this.Po = typeface;
            }

            public final String getText() {
                return this.text;
            }

            public final void setText(String str) {
                this.text = str;
            }
        }

        public a(boolean z) {
            this.aUl = z;
        }

        public final String getText() {
            return this.text;
        }

        public final void setText(String str) {
            if ((kotlin.jvm.internal.i.y(this.text, str) ^ 1) != 0) {
                this.text = str;
                this.aUj.clear();
                this.aUj.append(this.text);
                if (this.aUl) {
                    LinkifyCompat.addLinks((Spannable) this.aUj, 1);
                }
            }
        }

        public final SpannableStringBuilder Sw() {
            return this.aUj;
        }

        public final float getSize() {
            return this.aUf.getTextSize();
        }

        public final void K(float f) {
            this.aUf.setTextSize(f);
        }

        public final Typeface getTypeface() {
            return this.aUf.getTypeface();
        }

        public final void setTypeface(Typeface typeface) {
            this.aUf.setTypeface(typeface);
        }

        public final int getColor() {
            return this.aUf.getColor();
        }

        public final void setColor(int i) {
            this.aUf.setColor(i);
        }

        public final int getLinkColor() {
            return this.aUf.linkColor;
        }

        public final void setLinkColor(int i) {
            this.aUf.linkColor = i;
        }

        @TargetApi(21)
        public final void setLetterSpacing(float f) {
            this.aUf.setLetterSpacing(f);
        }

        public final void L(float f) {
            this.aUk = f;
        }

        public final int getMeasuredWidth() {
            Layout layout = this.aUg;
            return layout != null ? layout.getWidth() : 0;
        }

        public final int getMeasuredHeight() {
            Layout layout = this.aUg;
            return layout != null ? layout.getHeight() : 0;
        }

        public final int getLineCount() {
            Layout layout = this.aUg;
            return layout != null ? layout.getLineCount() : 1;
        }

        public final boolean Sx() {
            return getLineCount() == 1;
        }

        public final float getLineWidth(int i) {
            Layout layout = this.aUg;
            return layout != null ? layout.getLineWidth(i) : 0.0f;
        }

        public final int getLineForVertical(int i) {
            Layout layout = this.aUg;
            return layout != null ? layout.getLineForVertical(i) : 0;
        }

        public final int getOffsetForHorizontal(int i, float f) {
            Layout layout = this.aUg;
            return layout != null ? layout.getOffsetForHorizontal(i, f) : 0;
        }

        public final void measure(int i, int i2) {
            if (!a(this.aUi, this, i, i2)) {
                Layout layout;
                String str = this.text;
                if (str == null) {
                    str = "";
                }
                this.aUf.getFontMetrics(this.aUh);
                Alignment alignment = Alignment.ALIGN_NORMAL;
                CharSequence charSequence = str;
                Metrics isBoring = BoringLayout.isBoring(charSequence, this.aUf);
                Object obj = (isBoring == null || isBoring.width > i) ? null : 1;
                if (obj != null) {
                    BoringLayout replaceOrMake;
                    int i3 = isBoring.width;
                    Layout layout2 = this.aUg;
                    if (layout2 instanceof BoringLayout) {
                        replaceOrMake = ((BoringLayout) layout2).replaceOrMake(this.aUj, this.aUf, i3, alignment, 1.0f, this.aUk, isBoring, false);
                    } else {
                        replaceOrMake = BoringLayout.make(this.aUj, this.aUf, i3, alignment, 1.0f, this.aUk, isBoring, false);
                    }
                    layout = replaceOrMake;
                } else {
                    layout = new StaticLayout(this.aUj, this.aUf, Math.min(c.au(StaticLayout.getDesiredWidth(charSequence, this.aUf)), i), alignment, 1.0f, this.aUk, false);
                }
                this.aUg = layout;
                b bVar = this.aUi;
                if (bVar == null) {
                    bVar = new b();
                    this.aUi = bVar;
                }
                bVar.eC(i);
                bVar.eD(i2);
                bVar.K(getSize());
                bVar.setTypeface(getTypeface());
                bVar.setText(str);
            }
        }

        private final boolean a(b bVar, a aVar, int i, int i2) {
            if (bVar == null) {
                return false;
            }
            Layout layout = aVar.aUg;
            if (layout == null) {
                return false;
            }
            if (i != bVar.Sy() && layout.getWidth() >= i) {
                return false;
            }
            if ((i2 == bVar.Sz() || layout.getHeight() < i2) && aVar.getSize() == bVar.getSize() && (kotlin.jvm.internal.i.y(aVar.getTypeface(), bVar.getTypeface()) ^ 1) == 0 && (kotlin.jvm.internal.i.y(aVar.text, bVar.getText()) ^ 1) == 0) {
                return true;
            }
            return false;
        }

        public final void draw(Canvas canvas) {
            kotlin.jvm.internal.i.f(canvas, "canvas");
            Layout layout = this.aUg;
            if (layout != null) {
                layout.draw(canvas);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/chat/fragment/MessageView$TextMetrics;", "Landroid/graphics/Paint$FontMetrics;", "()V", "chat_release"})
    /* compiled from: MessageView.kt */
    public static final class b extends FontMetrics {
    }

    public MessageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MessageView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.aTZ = new a(true);
        this.aUa = new a(false);
        this.aUb = com.iqoption.core.ext.a.i((View) this, d.dp8);
        this.aUc = com.iqoption.core.ext.a.i((View) this, d.dp2);
        this.aUd = com.iqoption.core.ext.a.i((View) this, d.dp2);
        if (attributeSet != null) {
            d(attributeSet);
        }
        if (VERSION.SDK_INT >= 21) {
            this.aTZ.setLetterSpacing(0.01f);
            this.aTZ.L(com.iqoption.core.ext.a.h((View) this, d.sp6));
            this.aUa.setLetterSpacing(0.02f);
        }
    }

    public final String getText() {
        return this.aTZ.getText();
    }

    public final void setText(String str) {
        String text = this.aTZ.getText();
        this.aTZ.setText(str);
        if ((kotlin.jvm.internal.i.y(text, str) ^ 1) != 0) {
            requestLayout();
        }
    }

    public final float getTextSize() {
        return this.aTZ.getSize();
    }

    public final void setTextSize(float f) {
        float size = this.aTZ.getSize();
        this.aTZ.K(f);
        if (size != f) {
            requestLayout();
        }
    }

    public final Typeface getTextFont() {
        return this.aTZ.getTypeface();
    }

    public final void setTextFont(Typeface typeface) {
        Typeface typeface2 = this.aTZ.getTypeface();
        this.aTZ.setTypeface(typeface);
        if ((kotlin.jvm.internal.i.y(typeface2, typeface) ^ 1) != 0) {
            requestLayout();
        }
    }

    public final int getTextColor() {
        return this.aTZ.getColor();
    }

    public final void setTextColor(int i) {
        int color = this.aTZ.getColor();
        this.aTZ.setColor(i);
        if (color != i) {
            invalidate();
        }
    }

    public final int getLinkColor() {
        return this.aTZ.getLinkColor();
    }

    public final void setLinkColor(int i) {
        int linkColor = this.aTZ.getLinkColor();
        this.aTZ.setLinkColor(i);
        if (linkColor != i) {
            invalidate();
        }
    }

    public final String getTime() {
        return this.aUa.getText();
    }

    public final void setTime(String str) {
        String text = this.aUa.getText();
        this.aUa.setText(str);
        if ((kotlin.jvm.internal.i.y(text, str) ^ 1) != 0) {
            requestLayout();
        }
    }

    public final float getTimeSize() {
        return this.aUa.getSize();
    }

    public final void setTimeSize(float f) {
        float size = this.aUa.getSize();
        this.aUa.K(f);
        if (size != f) {
            requestLayout();
        }
    }

    public final Typeface getTimeFont() {
        return this.aUa.getTypeface();
    }

    public final void setTimeFont(Typeface typeface) {
        Typeface typeface2 = this.aUa.getTypeface();
        this.aUa.setTypeface(typeface);
        if ((kotlin.jvm.internal.i.y(typeface2, typeface) ^ 1) != 0) {
            requestLayout();
        }
    }

    public final int getTimeColor() {
        return this.aUa.getColor();
    }

    public final void setTimeColor(int i) {
        int color = this.aUa.getColor();
        this.aUa.setColor(i);
        if (color != i) {
            invalidate();
        }
    }

    private final void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.MessageView);
        setText(obtainStyledAttributes.getString(l.MessageView_message));
        setTextSize(obtainStyledAttributes.getDimension(l.MessageView_messageSize, com.iqoption.core.ext.a.h((View) this, d.dp16)));
        if (!isInEditMode()) {
            setTextFont(com.iqoption.core.ext.a.j(this, obtainStyledAttributes.getResourceId(l.MessageView_messageFont, f.regular)));
        }
        setTextColor(obtainStyledAttributes.getColor(l.MessageView_messageColor, com.iqoption.core.ext.a.f(this, c.chat_message_text)));
        setLinkColor(obtainStyledAttributes.getColor(l.MessageView_linkColor, com.iqoption.core.ext.a.f(this, c.chat_message_link)));
        setTime(obtainStyledAttributes.getString(l.MessageView_time));
        setTimeSize(obtainStyledAttributes.getDimension(l.MessageView_timeSize, com.iqoption.core.ext.a.h((View) this, d.dp10)));
        if (!isInEditMode()) {
            setTimeFont(com.iqoption.core.ext.a.j(this, obtainStyledAttributes.getResourceId(l.MessageView_timeFont, f.regular)));
        }
        setTimeColor(obtainStyledAttributes.getColor(l.MessageView_timeColor, com.iqoption.core.ext.a.f(this, c.chat_message_time)));
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    public void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        super.onMeasure(r10, r11);
        r0 = android.view.View.MeasureSpec.getMode(r10);
        r10 = android.view.View.MeasureSpec.getSize(r10);
        r1 = r9.getPaddingStart();
        r2 = r9.getPaddingEnd();
        r1 = r1 + r2;
        r2 = r9.getPaddingTop();
        r3 = r9.getPaddingBottom();
        r2 = r2 + r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = 0;
        r6 = 1;
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r0 == r4) goto L_0x002f;
    L_0x0028:
        if (r0 == 0) goto L_0x002c;
    L_0x002a:
        if (r0 == r3) goto L_0x0031;
    L_0x002c:
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x002f:
        r0 = 0;
        goto L_0x0032;
    L_0x0031:
        r0 = 1;
    L_0x0032:
        r10 = r10 - r1;
        r8 = android.view.View.MeasureSpec.getMode(r11);
        r11 = android.view.View.MeasureSpec.getSize(r11);
        if (r8 == r4) goto L_0x0044;
    L_0x003d:
        if (r8 == 0) goto L_0x0041;
    L_0x003f:
        if (r8 == r3) goto L_0x0046;
    L_0x0041:
        r11 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0044:
        r3 = 0;
        goto L_0x0047;
    L_0x0046:
        r3 = 1;
    L_0x0047:
        r11 = r11 - r2;
        r4 = r9.aTZ;
        r4.measure(r10, r11);
        r4 = r9.aUa;
        r4.measure(r7, r7);
        r9.aUe = r5;
        if (r0 == 0) goto L_0x0057;
    L_0x0056:
        goto L_0x00b0;
    L_0x0057:
        r0 = r9.aTZ;
        r0 = r0.Sx();
        if (r0 == 0) goto L_0x007f;
    L_0x005f:
        r0 = r9.aTZ;
        r0 = r0.getMeasuredWidth();
        r4 = r9.aUb;
        r0 = r0 + r4;
        r4 = r9.aUa;
        r4 = r4.getMeasuredWidth();
        r0 = r0 + r4;
        r4 = r9.aUc;
        r0 = r0 + r4;
        if (r0 <= r10) goto L_0x007d;
    L_0x0074:
        r9.aUe = r6;
        r10 = r9.aTZ;
        r10 = r10.getMeasuredWidth();
        goto L_0x00b0;
    L_0x007d:
        r10 = r0;
        goto L_0x00b0;
    L_0x007f:
        r0 = r9.aTZ;
        r4 = r0.getLineCount();
        r4 = r4 - r6;
        r0 = r0.getLineWidth(r4);
        r0 = kotlin.e.c.au(r0);
        r4 = r9.aUb;
        r0 = r0 + r4;
        r4 = r9.aUa;
        r4 = r4.getMeasuredWidth();
        r0 = r0 + r4;
        r4 = r9.aUc;
        r0 = r0 + r4;
        if (r0 <= r10) goto L_0x00a6;
    L_0x009d:
        r9.aUe = r6;
        r10 = r9.aTZ;
        r10 = r10.getMeasuredWidth();
        goto L_0x00b0;
    L_0x00a6:
        r10 = r9.aTZ;
        r10 = r10.getMeasuredWidth();
        r10 = java.lang.Math.max(r0, r10);
    L_0x00b0:
        r10 = r10 + r1;
        if (r3 == 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00d1;
    L_0x00b4:
        r11 = r9.aUe;
        if (r11 == 0) goto L_0x00c8;
    L_0x00b8:
        r11 = r9.aTZ;
        r11 = r11.getMeasuredHeight();
        r0 = r9.aUa;
        r0 = r0.getMeasuredHeight();
        r11 = r11 + r0;
        r0 = r9.aUd;
        goto L_0x00d0;
    L_0x00c8:
        r11 = r9.aTZ;
        r11 = r11.getMeasuredHeight();
        r0 = r9.aUd;
    L_0x00d0:
        r11 = r11 + r0;
    L_0x00d1:
        r11 = r11 + r2;
        r9.setMeasuredDimension(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.fragment.MessageView.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float) getPaddingStart(), (float) getPaddingTop());
        this.aTZ.draw(canvas);
        canvas.translate((float) (((getWidth() - getPaddingStart()) - getPaddingEnd()) - this.aUa.getMeasuredWidth()), (float) (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.aUa.getMeasuredHeight()));
        this.aUa.draw(canvas);
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.i.f(motionEvent, "event");
        int action = motionEvent.getAction();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 1 || action == 0) {
            int offsetForHorizontal = this.aTZ.getOffsetForHorizontal(this.aTZ.getLineForVertical((((int) motionEvent.getY()) - getPaddingTop()) + getScrollY()), (float) ((((int) motionEvent.getX()) - getPaddingLeft()) + getScrollX()));
            SpannableStringBuilder Sw = this.aTZ.Sw();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) Sw.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            kotlin.jvm.internal.i.e(clickableSpanArr, "links");
            if (((clickableSpanArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(this);
                } else if (action == 0) {
                    Selection.setSelection(Sw, Sw.getSpanStart(clickableSpanArr[0]), Sw.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(Sw);
        }
        return onTouchEvent;
    }
}
