package com.iqoption.protrader.web;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import com.iqoption.fragment.b.d;
import com.iqoption.x.R;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, bng = {"Lcom/iqoption/protrader/web/ProTraderWebActivity;", "Lcom/iqoption/activity/IQActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderWebActivity.kt */
public final class ProTraderWebActivity extends com.iqoption.activity.a {
    public static final a dQJ = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/protrader/web/ProTraderWebActivity$Companion;", "", "()V", "EXTRA_TYPE", "", "show", "", "activity", "Landroid/app/Activity;", "type", "Lcom/iqoption/protrader/web/ProTraderWebType;", "app_optionXRelease"})
    /* compiled from: ProTraderWebActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(Activity activity, ProTraderWebType proTraderWebType) {
            kotlin.jvm.internal.i.f(activity, "activity");
            kotlin.jvm.internal.i.f(proTraderWebType, "type");
            Intent intent = new Intent(activity, ProTraderWebActivity.class);
            intent.putExtra("EXTRA_TYPE", proTraderWebType);
            activity.startActivity(intent);
        }
    }

    public static final void a(Activity activity, ProTraderWebType proTraderWebType) {
        dQJ.a(activity, proTraderWebType);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pro_trader_web);
        if (bundle == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_TYPE");
            if (serializableExtra != null) {
                ProTraderWebType proTraderWebType = (ProTraderWebType) serializableExtra;
                com.iqoption.protrader.web.a.a aVar = a.dQP;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                kotlin.jvm.internal.i.e(supportFragmentManager, "supportFragmentManager");
                aVar.a(supportFragmentManager, R.id.proTraderFragment, proTraderWebType);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.protrader.web.ProTraderWebType");
        }
    }

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "fm");
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            BackStackEntry backStackEntryAt = supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1);
            kotlin.jvm.internal.i.e(backStackEntryAt, "fm.getBackStackEntryAt(fm.backStackEntryCount - 1)");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(backStackEntryAt.getName());
            if (findFragmentByTag != null && (findFragmentByTag instanceof d) && ((d) findFragmentByTag).onBackPressed()) {
                return;
            }
        }
        finish();
    }
}
