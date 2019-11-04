package com.iqoption.gl;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.ui.widget.gl.GLChartSurfaceView.a;
import com.iqoption.core.ui.widget.gl.c;
import com.iqoption.core.ui.widget.gl.d;
import com.iqoption.core.util.g;
import com.iqoption.x.R;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.Ref.DoubleRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010\u001f\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020)J\u001c\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0002J\u000e\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020#J\u0018\u00100\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020)J\u0018\u00101\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020)J\u0018\u00102\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020)J\b\u00103\u001a\u00020\u0011H\u0016J\b\u00104\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, bng = {"Lcom/iqoption/gl/ChartController;", "Lcom/iqoption/core/ui/widget/gl/GLChartView$Controller;", "Lcom/iqoption/core/ui/widget/gl/GLChartSurfaceView$Controller;", "context", "Landroid/content/Context;", "chart", "Lcom/iqoption/core/gl/ChartWindow;", "(Landroid/content/Context;Lcom/iqoption/core/gl/ChartWindow;)V", "enableDrawingCommand", "Lcom/iqoption/core/util/CycledCommand;", "frame", "Lcom/iqoption/core/ui/widget/gl/ChartFrame;", "gestureDetector", "Lcom/iqoption/core/ui/widget/gl/ChartGestureDetector;", "renderer", "Lcom/iqoption/core/ui/widget/gl/ChartRenderer;", "initPadding", "", "rect", "Landroid/graphics/Rect;", "initScaleFactor", "factor", "", "initTexts", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onSurfaceChanged", "width", "", "height", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setBottomPadding", "padding", "duration", "", "setFeatureState", "featureName", "", "forceStatus", "setInvestmentAmountEnabled", "enabled", "setLeftPadding", "setRightPadding", "setTopPadding", "startDrawing", "stopDrawing", "app_optionXRelease"})
/* compiled from: ChartController.kt */
public final class b implements a, d.a {
    private final ChartWindow aDk;
    private final com.iqoption.core.ui.widget.gl.a bNM = new com.iqoption.core.ui.widget.gl.a();
    private final com.iqoption.core.ui.widget.gl.b drt;
    private final c dru;
    private final g drv;

    public b(Context context, ChartWindow chartWindow) {
        double d;
        double ey;
        Context context2 = context;
        ChartWindow chartWindow2 = chartWindow;
        kotlin.jvm.internal.i.f(context2, "context");
        kotlin.jvm.internal.i.f(chartWindow2, "chart");
        this.aDk = chartWindow2;
        this.drt = new com.iqoption.core.ui.widget.gl.b(context2, this.aDk, this.bNM);
        this.dru = new c(this.aDk, this.bNM, 0, 0, 12, null);
        this.drv = new g(null, ChartController$enableDrawingCommand$1.dry, new ChartController$enableDrawingCommand$2(this), new ChartController$enableDrawingCommand$3(this), 1, null);
        this.aDk.commonSetDrawEnabled(0);
        final DoubleRef doubleRef = new DoubleRef();
        doubleRef.element = (double) com.iqoption.core.d.ey(R.dimen.dp100);
        if (com.iqoption.core.d.EH().ej("asset-info")) {
            d = doubleRef.element;
            double ey2 = (double) com.iqoption.core.d.ey(R.dimen.dp50);
            Double.isNaN(ey2);
            doubleRef.element = d + ey2;
        }
        if (com.iqoption.core.d.EH().ej("price-alerts")) {
            d = doubleRef.element;
            ey = (double) com.iqoption.core.d.ey(R.dimen.dp50);
            Double.isNaN(ey);
            doubleRef.element = d + ey;
        }
        ey = (double) com.iqoption.core.ext.a.l(context2, (int) R.dimen.time_scale_bar_height);
        float l = com.iqoption.core.ext.a.l(context2, (int) R.dimen.dp10) / ((float) 20);
        Rect rect = new Rect(com.iqoption.core.ext.a.m(context2, R.dimen.dp48), com.iqoption.core.ext.a.m(context2, R.dimen.dp48), com.iqoption.core.ext.a.m(context2, R.dimen.dp130), 0);
        aa(l);
        l(rect);
        aIx();
        com.iqoption.core.rx.i.akl().m(new Runnable(this) {
            final /* synthetic */ b this$0;

            public final void run() {
                com.iqoption.l.b aTS = com.iqoption.l.b.aTS();
                ChartWindow a = this.this$0.aDk;
                kotlin.jvm.internal.i.e(aTS, "settingsManager");
                a.setTradersMoodEnabled(aTS.Pk());
                this.this$0.aDk.setLiveDealsEnabled(aTS.Pl());
                this.this$0.aDk.setSmallDealsEnabled(aTS.aTV(), 1);
                this.this$0.aDk.setSmallDealsEnabled(aTS.aTW(), 0);
                this.this$0.aDk.setBetTickerExtendedView(aTS.aTZ());
                this.this$0.aDk.tabSetHighLowVisible(aTS.Fp());
                this.this$0.aDk.setTimeScaleBarXOffsetAndPadding(doubleRef.element, 0.0d, ey, 0.0d);
                this.this$0.aDk.setFirstDOSellExperience(com.iqoption.app.d.dW("first_do_sell_experience"));
                this.this$0.setFeatureState("take-profit", "enabled");
                b.a(this.this$0, "profit-loss-limits", null, 2, null);
                b.a(this.this$0, "strikes-display-mode", null, 2, null);
                b.a(this.this$0, "fx-option-strikes-display-mode", null, 2, null);
                b.a(this.this$0, "show-itm-on-chart", null, 2, null);
                b.a(this.this$0, "fx-option-payout-limit", null, 2, null);
            }
        });
    }

    static /* synthetic */ void a(b bVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = (String) null;
        }
        bVar.setFeatureState(str, str2);
    }

    private final void setFeatureState(String str, String str2) {
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.core.d.EH().ei(str);
        if (ei != null) {
            ChartWindow chartWindow = this.aDk;
            String name = ei.getName();
            if (str2 == null) {
                str2 = ei.getStatus();
            }
            chartWindow.setFeatureState(name, str2);
        }
    }

    private final void aa(float f) {
        this.aDk.commonSetScaleFactor(f);
    }

    private final void l(Rect rect) {
        c cVar = this.dru;
        c.b(cVar, rect.left, 0, 2, null);
        c.a(cVar, rect.top, 0, 2, null);
        c.c(cVar, rect.right, 0, 2, null);
        c.d(cVar, rect.bottom, 0, 2, null);
    }

    private final void aIx() {
        ChartWindow chartWindow = this.aDk;
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        chartWindow.setProfitMaskText(DG.DO());
        this.aDk.setPurchaseTexts(com.iqoption.core.d.Uq(), com.iqoption.core.d.getString(R.string.purchase_deadline), com.iqoption.core.d.getString(R.string.expiry_time));
        this.aDk.providerTexts(com.iqoption.core.d.getString(R.string.expiration_level_provided_by), com.iqoption.core.d.getString(R.string.thomson_reuters));
        String string = com.iqoption.core.d.getString(R.string.put);
        String str = "null cannot be cast to non-null type java.lang.String";
        if (string != null) {
            string = string.toUpperCase();
            String str2 = "(this as java.lang.String).toUpperCase()";
            kotlin.jvm.internal.i.e(string, str2);
            String string2 = com.iqoption.core.d.getString(R.string.call);
            if (string2 != null) {
                string2 = string2.toUpperCase();
                kotlin.jvm.internal.i.e(string2, str2);
                this.aDk.setTradersMoodTexts(string, string2);
                this.aDk.setTopTradersProfitMaskText("$%s");
                this.aDk.setText("profit_text", com.iqoption.core.d.getString(R.string.profit));
                chartWindow = this.aDk;
                string2 = com.iqoption.core.d.getString(R.string.best_deals);
                if (string2 != null) {
                    str = string2.toUpperCase();
                    kotlin.jvm.internal.i.e(str, str2);
                    chartWindow.setText("best_deals", str);
                    return;
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.i.f(motionEvent, "event");
        return this.drt.onTouchEvent(motionEvent);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.dru.onSurfaceCreated(gl10, eGLConfig);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.dru.onSurfaceChanged(gl10, i, i2);
    }

    public void onDrawFrame(GL10 gl10) {
        this.dru.onDrawFrame(gl10);
    }

    public void amO() {
        this.drv.run();
    }

    public void amP() {
        this.drv.cancel();
    }

    public final void f(int i, long j) {
        this.dru.f(i, j);
    }

    public final void eh(boolean z) {
        this.aDk.setBetTickerExtendedView(z);
    }
}
