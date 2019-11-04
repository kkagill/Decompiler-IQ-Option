package com.iqoption.cardsverification;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.iqoption.core.ext.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\f¨\u0006\r"}, bng = {"Lcom/iqoption/cardsverification/VerifyToolbarUtils;", "", "()V", "initToolbarWithTittle", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "tittle", "", "tittleId", "", "cardsverification_release"})
/* compiled from: VerifyToolbarUtils.kt */
public final class j {
    public static final j aAu = new j();

    private j() {
    }

    /* JADX WARNING: Missing block: B:3:0x000c, code skipped:
            if (r4 != null) goto L_0x0011;
     */
    public final void a(androidx.appcompat.app.AppCompatActivity r2, androidx.appcompat.widget.Toolbar r3, @androidx.annotation.StringRes int r4) {
        /*
        r1 = this;
        r0 = "toolbar";
        kotlin.jvm.internal.i.f(r3, r0);
        if (r2 == 0) goto L_0x000f;
    L_0x0008:
        r4 = r2.getString(r4);
        if (r4 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r4 = "";
    L_0x0011:
        r4 = (java.lang.CharSequence) r4;
        r1.a(r2, r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.cardsverification.j.a(androidx.appcompat.app.AppCompatActivity, androidx.appcompat.widget.Toolbar, int):void");
    }

    public final void a(AppCompatActivity appCompatActivity, Toolbar toolbar, CharSequence charSequence) {
        kotlin.jvm.internal.i.f(toolbar, "toolbar");
        kotlin.jvm.internal.i.f(charSequence, "tittle");
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(toolbar);
        }
        ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
            supportActionBar.setTitle(charSequence);
            supportActionBar.setDisplayShowTitleEnabled(true);
        }
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            Context context = toolbar.getContext();
            kotlin.jvm.internal.i.e(context, "toolbar.context");
            navigationIcon.setColorFilter(a.k(context, g.a.white), Mode.SRC_ATOP);
        }
    }
}
