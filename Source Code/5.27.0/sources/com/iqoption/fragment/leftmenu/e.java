package com.iqoption.fragment.leftmenu;

import com.google.common.collect.i;
import com.iqoption.app.IQApp;
import com.iqoption.app.b;
import com.iqoption.app.b.b.j;
import com.iqoption.app.b.b.k;
import com.iqoption.app.b.b.p;
import com.iqoption.config.Platform;
import com.iqoption.dto.entity.BackCall;
import com.iqoption.dto.entity.FeaturesUpdateEvent;
import com.iqoption.fragment.leftmenu.content.MainMenu;
import com.iqoption.fragment.leftmenu.content.SettingsMenu;
import com.iqoption.system.a.d;

/* compiled from: LeftMenuStateManager */
public class e {
    private static final String TAG = "com.iqoption.fragment.leftmenu.e";
    private static volatile e diO;
    private boolean diP;
    private final a diQ = new a();
    private boolean diR;

    /* compiled from: LeftMenuStateManager */
    private class a extends d {
        private a() {
        }

        @com.google.common.b.e
        public void onAccountIsDemo(k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    e.this.aEk();
                }
            });
        }

        @com.google.common.b.e
        public void onTickedNotReadCount(p pVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    e.this.aEk();
                }
            });
        }

        @com.google.common.b.e
        public void onIsAnonymousUser(j jVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    e.this.aEk();
                }
            });
        }

        @com.google.common.b.e
        public void onFeatureUpdateEvent(FeaturesUpdateEvent featuresUpdateEvent) {
            if (i.b(featuresUpdateEvent.features).d(new com.google.common.base.j<com.iqoption.core.microservices.features.a.a>() {
                /* renamed from: f */
                public boolean apply(com.iqoption.core.microservices.features.a.a aVar) {
                    return "price-movements".equals(aVar.getName());
                }
            }).isPresent()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        e.this.aEk();
                    }
                });
            }
        }

        @com.google.common.b.e
        public void onClientCategoryChanged(com.iqoption.app.b.b.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    e.this.aEk();
                }
            });
        }
    }

    private void aEl() {
    }

    public static e aEi() {
        if (diO == null) {
            synchronized (e.class) {
                if (diO == null) {
                    diO = new e();
                }
            }
        }
        return diO;
    }

    public void onStart() {
        if (!this.diP) {
            this.diQ.register();
            this.diP = true;
        }
    }

    public void onStop() {
        if (this.diP) {
            this.diQ.unregister();
            aEl();
            this.diP = false;
        }
    }

    private static void aEj() {
        IQApp.Ex().bd(new com.iqoption.fragment.leftmenu.d.a());
    }

    public void aEk() {
        IQApp Eu = IQApp.Eu();
        b aK = b.aK(Eu);
        if (!aK.isVerified() && ((!aK.asi || aK.asn) && aK.asi)) {
            boolean z = aK.asj;
        }
        boolean z2 = true;
        int Ej = aK.Ej() ^ 1;
        int Ej2 = aK.Ej() ^ 1;
        BackCall GN = com.iqoption.app.managers.a.GM().GN();
        boolean z3 = (this.diR || GN == null || !GN.isEnabled()) ? false : true;
        boolean by = com.iqoption.fragment.d.b.by(Eu);
        com.iqoption.debugmenu.debugmenu.a aVar = com.iqoption.debugmenu.debugmenu.a.cvy;
        boolean isAvailable = com.iqoption.debugmenu.debugmenu.a.isAvailable();
        Object obj = 17 == Platform.ANDROID.getId() ? 1 : null;
        int visible = (SettingsMenu.PushNotifications.setVisible(by) | (SettingsMenu.Security.setVisible(Ej2) | (MainMenu.WithdrawFunds.setVisible(Ej) | MainMenu.Debug.setVisible(isAvailable)))) | MainMenu.CallBack.setVisible(z3);
        MainMenu mainMenu = MainMenu.RateUs;
        if (obj == null) {
            z2 = false;
        }
        if (((visible | mainMenu.setVisible(z2)) | MainMenu.VipManager.setVisible(this.diR)) != 0) {
            aEj();
        }
    }

    public void dN(boolean z) {
        this.diR = z;
        aEk();
    }
}
