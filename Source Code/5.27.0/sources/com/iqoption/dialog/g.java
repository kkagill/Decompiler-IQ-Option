package com.iqoption.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.util.y;
import com.iqoption.welcomeonboarding.a;
import com.iqoption.x.R;

/* compiled from: RetargetDialog */
public class g extends Dialog {
    private TradeRoomActivity cHp;
    private String cHq;
    private String message;

    public g(final TradeRoomActivity tradeRoomActivity, String str, String str2) {
        super(tradeRoomActivity, 16973840);
        this.cHp = tradeRoomActivity;
        this.message = str;
        this.cHq = str2;
        setContentView(R.layout.retarget_dialog);
        getWindow().setFlags(1024, 1024);
        atz();
        setOnDismissListener(new OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                String str = "";
                d.aP(tradeRoomActivity).dJ(str);
                d.aP(tradeRoomActivity).dI(str);
            }
        });
    }

    public void show() {
        getWindow().setFlags(8, 8);
        super.show();
        getWindow().clearFlags(8);
        y.aA(getWindow().getDecorView());
    }

    private void atz() {
        findViewById(R.id.layout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                g.this.dismiss();
            }
        });
        findViewById(R.id.deposit).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (b.aK(g.this.getContext()).Ej()) {
                    a.d(g.this.cHp.getSupportFragmentManager());
                } else {
                    g.this.cHp.Ao();
                }
                g.this.dismiss();
            }
        });
        ((TextView) findViewById(R.id.retargetMessage)).setText(this.message);
    }
}
