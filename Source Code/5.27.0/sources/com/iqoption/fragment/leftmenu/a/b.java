package com.iqoption.fragment.leftmenu.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.e.qb;
import com.iqoption.fragment.leftmenu.b.c;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.util.aa;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/fragment/leftmenu/holder/ProTraderHolder;", "Lcom/iqoption/fragment/leftmenu/LeftMenuAdapter$ViewHolder;", "binding", "Lcom/iqoption/databinding/LeftMenuItemProTraderBinding;", "listener", "Lcom/iqoption/fragment/leftmenu/holder/ProTraderHolder$OnProTraderClickListener;", "(Lcom/iqoption/databinding/LeftMenuItemProTraderBinding;Lcom/iqoption/fragment/leftmenu/holder/ProTraderHolder$OnProTraderClickListener;)V", "bind", "", "statusType", "Lcom/iqoption/microservice/regulators/response/StatusType;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "prepareBackground", "prepareButtons", "prepareText", "prepareTitle", "reportClose", "OnProTraderClickListener", "app_optionXRelease"})
/* compiled from: ProTraderHolder.kt */
public final class b extends c {
    private final qb djr;
    private final a djs;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/fragment/leftmenu/holder/ProTraderHolder$OnProTraderClickListener;", "", "onProTraderClose", "", "app_optionXRelease"})
    /* compiled from: ProTraderHolder.kt */
    public interface a {
        void aEh();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderHolder.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ b djt;
        final /* synthetic */ StatusType dju;

        b(b bVar, StatusType statusType) {
            this.djt = bVar;
            this.dju = statusType;
        }

        public final void onClick(View view) {
            this.djt.djs.aEh();
            this.djt.h(this.dju);
        }
    }

    public b(qb qbVar, a aVar) {
        kotlin.jvm.internal.i.f(qbVar, "binding");
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        super(qbVar, R.layout.left_menu_item_pro_trader);
        this.djr = qbVar;
        this.djs = aVar;
    }

    public final void c(StatusType statusType) {
        kotlin.jvm.internal.i.f(statusType, "statusType");
        d(statusType);
        e(statusType);
        f(statusType);
        g(statusType);
        LinearLayout linearLayout = this.djr.cmJ;
        kotlin.jvm.internal.i.e(linearLayout, "binding.itemProContainer");
        linearLayout.setEnabled(statusType != StatusType.PENDING);
    }

    private final void d(StatusType statusType) {
        CharSequence string;
        Context Le = Le();
        int i = c.aob[statusType.ordinal()];
        if (i == 1) {
            string = Le.getString(R.string.application_declined);
        } else if (i == 2) {
            string = Le.getString(R.string.account_category);
        } else if (i != 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Le.getString(R.string.become_a));
            spannableStringBuilder.append("  ");
            Drawable drawable = ContextCompat.getDrawable(Le, R.drawable.ic_pro_badge);
            if (drawable == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(drawable, "ContextCompat.getDrawabl….drawable.ic_pro_badge)!!");
            Context Le2 = Le();
            kotlin.jvm.internal.i.e(Le2, "context()");
            Resources resources = Le2.getResources();
            com.iqoption.view.text.c cVar = new com.iqoption.view.text.c(drawable, resources.getDimensionPixelSize(R.dimen.dp32), resources.getDimensionPixelSize(R.dimen.dp14));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(cVar, length - 1, length, 17);
            string = spannableStringBuilder;
        } else {
            aa.cq(statusType);
            throw null;
        }
        TextView textView = this.djr.cmM;
        kotlin.jvm.internal.i.e(textView, "binding.itemProTitle");
        textView.setText(string);
    }

    private final void e(StatusType statusType) {
        CharSequence charSequence;
        Context Le = Le();
        kotlin.jvm.internal.i.e(Le, "ctx");
        Resources resources = Le.getResources();
        int i = c.axg[statusType.ordinal()];
        String str = "ContextCompat.getDrawabl….drawable.ic_pro_badge)!!";
        if (i != 1) {
            CharSequence charSequence2;
            if (i == 2) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Le.getString(R.string.your_application_for_n1_progress, new Object[]{"*PRO_BADGE_ANCHOR*"}));
                Drawable drawable = ContextCompat.getDrawable(Le, R.drawable.ic_pro_badge);
                if (drawable == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(drawable, str);
                com.iqoption.view.text.c cVar = new com.iqoption.view.text.c(drawable, resources.getDimensionPixelSize(R.dimen.dp23), resources.getDimensionPixelSize(R.dimen.dp10));
                charSequence2 = spannableStringBuilder;
                int a = v.a(charSequence2, r2, 0, false, 6, null);
                spannableStringBuilder.setSpan(cVar, a, a + 18, 17);
            } else if (i != 3) {
                charSequence2 = Le.getString(R.string.learn_more_about_account_categories);
            } else {
                aa.cq(statusType);
                throw null;
            }
            charSequence = charSequence2;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(Le.getString(R.string.your_application_for_n1_declined, new Object[]{"*PRO_BADGE_ANCHOR*"}));
            Drawable drawable2 = ContextCompat.getDrawable(Le, R.drawable.ic_pro_badge);
            if (drawable2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(drawable2, str);
            com.iqoption.view.text.c cVar2 = new com.iqoption.view.text.c(drawable2, resources.getDimensionPixelSize(R.dimen.dp23), resources.getDimensionPixelSize(R.dimen.dp10));
            charSequence = spannableStringBuilder2;
            int a2 = v.a(charSequence, r12, 0, false, 6, null);
            spannableStringBuilder2.setSpan(cVar2, a2, a2 + 18, 17);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(Le.getString(R.string.learn_more));
            spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 17);
            spannableStringBuilder2.append(" ");
            spannableStringBuilder2.append(spannableStringBuilder3);
        }
        TextView textView = this.djr.cmL;
        kotlin.jvm.internal.i.e(textView, "binding.itemProText");
        textView.setText(charSequence);
    }

    private final void f(StatusType statusType) {
        int i = c.aFX[statusType.ordinal()];
        String str = "binding.itemProClose";
        String str2 = "binding.itemProRightArrow";
        if (i == 1 || i == 2) {
            ImageView imageView = this.djr.cmK;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.al(imageView);
            imageView = this.djr.cmI;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
            this.djr.cmI.setOnClickListener(new b(this, statusType));
            return;
        }
        ImageView imageView2 = this.djr.cmK;
        kotlin.jvm.internal.i.e(imageView2, str2);
        com.iqoption.core.ext.a.ak(imageView2);
        imageView2 = this.djr.cmI;
        kotlin.jvm.internal.i.e(imageView2, str);
        com.iqoption.core.ext.a.al(imageView2);
    }

    private final void g(StatusType statusType) {
        LinearLayout linearLayout = this.djr.cmJ;
        kotlin.jvm.internal.i.e(linearLayout, "binding.itemProContainer");
        if (c.aFY[statusType.ordinal()] != 1) {
            linearLayout.setBackgroundColor(ContextCompat.getColor(Le(), R.color.grey_blur_05));
        } else {
            linearLayout.setBackgroundResource(R.drawable.bg_grey_blur_05_boredr_red);
        }
    }

    private final Context Le() {
        View root = this.djr.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root.getContext();
    }

    private final void h(StatusType statusType) {
        String str;
        int i = c.bjZ[statusType.ordinal()];
        if (i == 1) {
            str = "menu_on-review-close";
        } else if (i == 2) {
            str = "menu_declined-close";
        } else {
            aa.cq(statusType);
            throw null;
        }
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, str));
    }
}
