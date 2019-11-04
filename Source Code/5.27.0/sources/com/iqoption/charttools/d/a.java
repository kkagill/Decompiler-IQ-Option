package com.iqoption.charttools.d;

import com.iqoption.core.ui.fragment.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/navigation/IChartRouter;", "", "selectIndicator", "", "source", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Companion", "techtools_release"})
/* compiled from: IChartRouter.kt */
public interface a {
    public static final a aKh = a.aKj;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/navigation/IChartRouter$Companion;", "", "()V", "instance", "Lcom/iqoption/charttools/navigation/IChartRouter;", "getInstance", "()Lcom/iqoption/charttools/navigation/IChartRouter;", "setInstance", "(Lcom/iqoption/charttools/navigation/IChartRouter;)V", "init", "", "core", "techtools_release"})
    /* compiled from: IChartRouter.kt */
    public static final class a {
        public static a aKi;
        static final /* synthetic */ a aKj = new a();

        private a() {
        }

        public final a OX() {
            a aVar = aKi;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return aVar;
        }

        public final void a(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "core");
            aKi = aVar;
        }
    }

    void c(d dVar);
}
