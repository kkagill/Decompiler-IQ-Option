package com.iqoption.templates;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.charttools.e.j;
import com.iqoption.charttools.f;
import com.iqoption.charttools.tools.e;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\n\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0014¨\u0006\r"}, bng = {"Lcom/iqoption/templates/TemplateActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "getArgs", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "onStart", "onStop", "Companion", "app_optionXRelease"})
/* compiled from: TemplateActivity.kt */
public final class TemplateActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG = TemplateActivity.class.getName();
    public static final a dUD = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/templates/TemplateActivity$Companion;", "", "()V", "EXTRA_TEMPLATE_ID", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "app_optionXRelease"})
    /* compiled from: TemplateActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        setContentView(frameLayout, new LayoutParams(-1, -1));
        if (bundle == null) {
            Intent intent = getIntent();
            kotlin.jvm.internal.i.e(intent, "intent");
            bundle = w(intent);
            if (bundle == null) {
                finish();
                return;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.i.e(supportFragmentManager, "supportFragmentManager");
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
            j jVar = new j();
            jVar.setArguments(bundle);
            beginTransaction.add(R.id.content, jVar, j.TAG);
            beginTransaction.commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
        getLifecycle().addObserver(new EventSenderLifecycleObserver(e.aLA.PJ(), null, 2, null));
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        WebSocketHandler.aTn().cj(TAG);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onStop();
    }

    private final Bundle w(Intent intent) {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        TabHelper.i Jh = IM.Jh();
        Bundle bundle = null;
        if (Jh == null) {
            return null;
        }
        long longExtra = intent.getLongExtra("extra.templateId", -1);
        String str = "tab.idString";
        String Ju;
        if (longExtra != -1) {
            com.iqoption.charttools.e.j.a aVar = j.aKq;
            Ju = Jh.Ju();
            kotlin.jvm.internal.i.e(Ju, str);
            return aVar.e(Ju, longExtra);
        }
        TabHelper.j JF = Jh.JF();
        int i = JF.chartType;
        ChartType[] values = ChartType.values();
        for (Enum enumR : values) {
            if ((enumR.ordinal() == i ? 1 : null) != null) {
                break;
            }
        }
        Enum enumR2 = null;
        if (enumR2 == null) {
            enumR2 = values[0];
        }
        Enum enumR3 = enumR2;
        i = (JF.awH ^ 1) != 0 ? 1 : 0;
        ChartColor[] values2 = ChartColor.values();
        for (Enum enumR22 : values2) {
            if ((enumR22.ordinal() == i ? 1 : null) != null) {
                bundle = enumR22;
                break;
            }
        }
        if (bundle == null) {
            bundle = values2[0];
        }
        com.iqoption.charttools.model.a.a aVar2 = new com.iqoption.charttools.model.a.a(enumR3, bundle, Integer.valueOf(JF.candleSize), Boolean.valueOf(JF.awJ), Boolean.valueOf(JF.awI), Boolean.valueOf(com.iqoption.core.data.d.e.bdq.WD()), Boolean.valueOf(com.iqoption.core.data.d.e.bdq.WE()), Boolean.valueOf(f.aCQ.Md()));
        com.iqoption.charttools.e.j.a aVar3 = j.aKq;
        Ju = Jh.Ju();
        kotlin.jvm.internal.i.e(Ju, str);
        return aVar3.a(Ju, aVar2);
    }
}
