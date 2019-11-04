package com.iqoption.fragment.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.iqoption.app.d;
import com.iqoption.x.R;

/* compiled from: PriceMovementsAttention */
public class a {
    private static a dqj = new a();

    public static a aHX() {
        return dqj;
    }

    public void a(final Context context, final View view, int i) {
        if (!d.aP(context).FW()) {
            com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                public void run() {
                    a.this.c(context, view);
                }
            }, (long) i);
        }
    }

    private void c(Context context, View view) {
        if (!d.aP(context).FW()) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.price_movements_attention, null);
            final PopupWindow popupWindow = new PopupWindow(inflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setAnimationStyle(R.style.PickerPopup);
            inflate.findViewById(R.id.iUnderstand).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    d.aP(view.getContext()).bk(true);
                    popupWindow.dismiss();
                }
            });
            popupWindow.showAtLocation(view, 0, 0, 0);
        }
    }
}
