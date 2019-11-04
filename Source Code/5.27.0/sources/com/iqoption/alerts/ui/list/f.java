package com.iqoption.alerts.ui.list;

import androidx.annotation.MainThread;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\n"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListInteractor;", "", "createAlert", "", "editAlert", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "alert", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "Companion", "alerts_release"})
/* compiled from: AlertsListInteractor.kt */
public interface f {
    public static final a apy = a.apA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListInteractor$Companion;", "", "()V", "PROVIDER", "Lkotlin/Function1;", "Lcom/iqoption/alerts/ui/list/AlertsListFragment;", "Lcom/iqoption/alerts/ui/list/AlertsListInteractor;", "getPROVIDER", "()Lkotlin/jvm/functions/Function1;", "setPROVIDER", "(Lkotlin/jvm/functions/Function1;)V", "alerts_release"})
    /* compiled from: AlertsListInteractor.kt */
    public static final class a {
        static final /* synthetic */ a apA = new a();
        private static b<? super e, ? extends f> apz;

        private a() {
        }

        public final b<e, f> Bn() {
            return apz;
        }

        public final void a(b<? super e, ? extends f> bVar) {
            apz = bVar;
        }
    }

    @MainThread
    void Bm();

    @MainThread
    void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2);
}
