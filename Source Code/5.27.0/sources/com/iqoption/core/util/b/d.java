package com.iqoption.core.util.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a'\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0018\u001a5\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001a\u001a\u000e\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d¨\u0006\u001e"}, bng = {"addLinkSpan", "", "builder", "Landroid/text/SpannableStringBuilder;", "listener", "Lcom/iqoption/core/util/link/LinkClickListener;", "link", "Lcom/iqoption/core/util/link/Link;", "linkNormalColor", "", "linkPressedColor", "underline", "", "openEmail", "context", "Landroid/content/Context;", "email", "", "flags", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z", "openLink", "uri", "Landroid/net/Uri;", "alternateUrl", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Integer;Ljava/lang/String;)Z", "url", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Z", "setTextWithLinks", "params", "Lcom/iqoption/core/util/link/LinkifyParams;", "core_release"})
/* compiled from: LinkUtils.kt */
public final class d {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/util/link/LinkUtilsKt$addLinkSpan$clickableSpan$1", "Lcom/iqoption/core/util/link/TouchableSpan;", "onClick", "", "textView", "Landroid/view/View;", "core_release"})
    /* compiled from: LinkUtils.kt */
    public static final class a extends i {
        final /* synthetic */ b bRR;
        final /* synthetic */ a bRS;
        final /* synthetic */ int bRT;
        final /* synthetic */ int bRU;

        a(b bVar, a aVar, int i, int i2, int i3, int i4) {
            this.bRR = bVar;
            this.bRS = aVar;
            this.bRT = i;
            this.bRU = i2;
            super(i3, i4);
        }

        public void onClick(View view) {
            kotlin.jvm.internal.i.f(view, "textView");
            this.bRR.onLinkClicked(this.bRS);
        }
    }

    public static final boolean a(Context context, String str, Integer num) {
        return a(context, str, num, null, 8, null);
    }

    public static final void a(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "params");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(eVar.getText());
        Context context = eVar.anS().getContext();
        for (a a : eVar.anR()) {
            a(spannableStringBuilder, eVar.anW(), a, ContextCompat.getColor(context, eVar.anT()), ContextCompat.getColor(context, eVar.anU()), eVar.anV());
        }
        TextView anS = eVar.anS();
        anS.setText(spannableStringBuilder);
        anS.setMovementMethod(new c());
        anS.setHighlightColor(0);
    }

    private static final void a(SpannableStringBuilder spannableStringBuilder, b bVar, a aVar, @ColorInt int i, @ColorInt int i2, boolean z) {
        a aVar2 = new a(bVar, aVar, i, i2, i, i2);
        CharSequence text = aVar.getText();
        int a = v.a((CharSequence) spannableStringBuilder, text.toString(), 0, false, 6, null);
        if (a != -1) {
            int length = text.length() + a;
            spannableStringBuilder.setSpan(aVar2, a, length, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), a, length, 33);
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), a, length, 33);
            }
        }
    }

    public static final boolean a(Context context, String str, Integer num, String str2) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(str, "url");
        Uri parse = Uri.parse(str);
        kotlin.jvm.internal.i.e(parse, "Uri.parse(url)");
        return a(context, parse, num, str2);
    }

    public static final boolean a(Context context, Uri uri, Integer num, String str) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (num != null) {
            num.intValue();
            intent.setFlags(num.intValue());
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return true;
        }
        if (str != null) {
            a(context, str, num, null, 8, null);
        }
        return false;
    }

    public static final boolean b(Context context, String str, Integer num) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(str, "email");
        Intent intent = new Intent("android.intent.action.SEND");
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
