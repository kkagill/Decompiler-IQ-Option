package com.iqoption.kyc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/ToolbarUtils;", "", "()V", "hideToolbar", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "initEmptyToolbar", "initToolbarWithBackButton", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "initToolbarWithTittle", "tittle", "", "initToolbarWithoutBackButton", "kyc_release"})
/* compiled from: ToolbarUtils.kt */
public final class s {
    public static final s dti = new s();

    private s() {
    }

    public static final void a(AppCompatActivity appCompatActivity, Toolbar toolbar) {
        kotlin.jvm.internal.i.f(toolbar, "toolbar");
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(toolbar);
        }
        ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public static final void b(AppCompatActivity appCompatActivity, Toolbar toolbar) {
        kotlin.jvm.internal.i.f(toolbar, "toolbar");
        ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(toolbar);
        }
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public static final void a(AppCompatActivity appCompatActivity) {
        ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public static final void a(AppCompatActivity appCompatActivity, Toolbar toolbar, CharSequence charSequence) {
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
    }

    public static final void b(AppCompatActivity appCompatActivity) {
        ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }
}
