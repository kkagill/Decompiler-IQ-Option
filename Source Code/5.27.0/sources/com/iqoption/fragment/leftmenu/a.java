package com.iqoption.fragment.leftmenu;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.collect.ImmutableMap;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.splash.SplashLogHelper;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.BackCall;
import com.iqoption.fragment.MenuFragment.MenuItem;
import com.iqoption.fragment.ad;
import com.iqoption.fragment.ae;
import com.iqoption.fragment.leftmenu.content.HistoryMenu;
import com.iqoption.fragment.leftmenu.content.MainMenu;
import com.iqoption.fragment.leftmenu.content.SettingsMenu;
import com.iqoption.fragment.leftmenu.content.VipMangerMenu;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.operations.OperationHistoryActivity;
import com.iqoption.sessions.ActiveSessionsActivity;
import com.iqoption.trading.history.TradingHistoryActivity;
import com.iqoption.x.R;

/* compiled from: LeftMenuAction */
public class a {
    private static final String TAG = "com.iqoption.fragment.leftmenu.a";
    private static ImmutableMap<com.iqoption.fragment.leftmenu.content.a, g> dil = new com.google.common.collect.ImmutableMap.a().m(MainMenu.Debug, new c()).m(MainMenu.Deposit, new d()).m(MainMenu.WithdrawFunds, new v()).m(HistoryMenu.Operations, new j()).m(HistoryMenu.Trading, new u()).m(VipMangerMenu.about, new a()).m(VipMangerMenu.education, new e()).m(VipMangerMenu.request_call, new p()).m(SettingsMenu.General, new f()).m(SettingsMenu.Security, new q()).m(SettingsMenu.PushNotifications, new m()).m(SettingsMenu.NewsAndUpdates, new i()).m(SettingsMenu.ActiveSessions, new b()).m(SettingsMenu.TechnicalLog, new s()).m(MainMenu.LogOut, new h()).m(MainMenu.Support, new r()).m(MainMenu.CallBack, new o()).m(MainMenu.RateUs, new n()).m(MainMenu.TermsAndConditions, new t()).tf();
    private static ImmutableMap<Integer, g> dim = new com.google.common.collect.ImmutableMap.a().m(Integer.valueOf(R.layout.left_menu_item_profile), new l()).m(Integer.valueOf(R.layout.left_menu_item_pro_trader), new k()).tf();

    /* compiled from: LeftMenuAction */
    private interface g {
        void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar);
    }

    /* compiled from: LeftMenuAction */
    private static class a implements g {
        private a() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.vip.a.ejn.C(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class b implements g {
        private b() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_active_sessions"));
            ActiveSessionsActivity.dSA.h(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class c implements g {
        private c() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            tradeRoomActivity.getSupportFragmentManager().beginTransaction().add(R.id.other_fragment, com.iqoption.debugmenu.debugmenu.b.cvC.aod(), com.iqoption.debugmenu.debugmenu.b.cvC.Bx()).addToBackStack(com.iqoption.debugmenu.debugmenu.b.cvC.Bx()).commit();
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class d implements g {
        private d() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_deposit"));
            if (com.iqoption.app.b.aK(tradeRoomActivity).Ej()) {
                com.iqoption.analytics.a.aqy = true;
                a.d(tradeRoomActivity);
                return;
            }
            tradeRoomActivity.Ao();
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class e implements g {
        private e() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.vip.i.ejV.C(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class f implements g {
        private f() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_settings"));
            ae.f(tradeRoomActivity.getSupportFragmentManager());
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class h implements g {
        private h() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.util.o.g(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class i implements g {
        private i() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.newsandupdates.d.a(tradeRoomActivity.getSupportFragmentManager(), (int) R.id.other_fragment);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class j implements g {
        private j() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_operation-history"));
            OperationHistoryActivity.dKu.h(tradeRoomActivity);
        }
    }

    /* compiled from: LeftMenuAction */
    private static class k implements g {
        private k() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.fragment.leftmenu.content.b bVar = (com.iqoption.fragment.leftmenu.content.b) aVar;
            tradeRoomActivity.a(bVar.aED());
            f.q(tradeRoomActivity).close();
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, bVar.aED() == StatusType.DECLINED ? "menu_declined-learn-more" : "menu_become-pro"));
        }
    }

    /* compiled from: LeftMenuAction */
    private static class l implements g {
        private l() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_personal-data"));
            if (com.iqoption.app.b.aK(tradeRoomActivity).Ej()) {
                com.iqoption.welcomeonboarding.a.d(tradeRoomActivity.getSupportFragmentManager());
                f.q(tradeRoomActivity).close();
                return;
            }
            tradeRoomActivity.a(MenuItem.PERSONAL_INFO);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class m implements g {
        private m() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_push_settings"));
            ad.f(tradeRoomActivity.getSupportFragmentManager());
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class n implements g {
        private n() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_rate-app"));
            com.iqoption.dialog.d.a((FragmentActivity) tradeRoomActivity, tradeRoomActivity.getSupportFragmentManager());
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class o implements g {
        private o() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            BackCall Ap = tradeRoomActivity.Ap();
            if (Ap != null) {
                new com.iqoption.dialog.a(tradeRoomActivity, Ap).show();
                f.q(tradeRoomActivity).close();
            }
        }
    }

    /* compiled from: LeftMenuAction */
    private static class p implements g {
        private p() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            com.iqoption.vip.e.ejC.J(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class q implements g {
        private q() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_security"));
            tradeRoomActivity.Aj();
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class r implements g {
        private r() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            a.a(tradeRoomActivity, "support");
            tradeRoomActivity.a(MenuItem.SUPPORT);
        }
    }

    /* compiled from: LeftMenuAction */
    private static class s implements g {
        private s() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_technical_log"));
            tradeRoomActivity.getSupportFragmentManager().beginTransaction().add(R.id.other_fragment, com.iqoption.core.ui.fragment.e.bIX.hi(SplashLogHelper.bGE.be(tradeRoomActivity)), com.iqoption.core.ui.fragment.e.bIX.Bx()).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(com.iqoption.core.ui.fragment.e.bIX.Bx()).commit();
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class t implements g {
        private t() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_terms"));
            com.iqoption.core.util.b.d.a(tradeRoomActivity, com.iqoption.core.util.b.f.bn(tradeRoomActivity), Integer.valueOf(268435456));
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class u implements g {
        private u() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_trading-history"));
            TradingHistoryActivity.dVg.h(tradeRoomActivity);
            f.q(tradeRoomActivity).close();
        }
    }

    /* compiled from: LeftMenuAction */
    private static class v implements g {
        private v() {
        }

        public void a(TradeRoomActivity tradeRoomActivity, com.iqoption.fragment.leftmenu.content.a aVar) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "menu_withdrawals"));
            tradeRoomActivity.Ak();
            f.q(tradeRoomActivity).close();
        }
    }

    public static void a(com.iqoption.fragment.leftmenu.content.a aVar, TradeRoomActivity tradeRoomActivity) {
        g gVar = (g) dil.get(aVar);
        if (gVar == null) {
            gVar = (g) dim.get(Integer.valueOf(aVar.layoutResId()));
        }
        if (gVar != null) {
            gVar.a(tradeRoomActivity, aVar);
        }
    }

    private static void a(TradeRoomActivity tradeRoomActivity, String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "menu_open-notification").setParameters(com.iqoption.core.util.u.anp().o("notification_type", str).anr()).build());
    }

    private static void d(TradeRoomActivity tradeRoomActivity) {
        com.iqoption.welcomeonboarding.a.d(tradeRoomActivity.getSupportFragmentManager());
        f.q(tradeRoomActivity).close();
    }
}
