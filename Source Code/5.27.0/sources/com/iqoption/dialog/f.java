package com.iqoption.dialog;

import android.app.Dialog;
import android.view.View;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.util.a;
import com.iqoption.x.R;

/* compiled from: ReloginDialog */
public class f extends Dialog {
    private TradeRoomActivity cHp;

    public f(TradeRoomActivity tradeRoomActivity) {
        super(tradeRoomActivity, 16973840);
        this.cHp = tradeRoomActivity;
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.relogin_dialog);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        findViewById(R.id.relogin).setOnClickListener(new -$$Lambda$f$OcM9WIT2pXQscw-Jhoxgu5Etr4c(this, tradeRoomActivity));
        findViewById(R.id.logout).setOnClickListener(new -$$Lambda$f$A4Nyg_vHiixfOeoI3Tb4h33wiBg(this, tradeRoomActivity));
    }

    private /* synthetic */ void b(TradeRoomActivity tradeRoomActivity, View view) {
        tradeRoomActivity.Aq();
        a.l(tradeRoomActivity);
        dismiss();
    }

    private /* synthetic */ void a(TradeRoomActivity tradeRoomActivity, View view) {
        tradeRoomActivity.Aq();
        tradeRoomActivity.zZ();
        dismiss();
    }
}
