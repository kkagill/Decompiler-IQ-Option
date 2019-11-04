package com.iqoption.fragment.rightpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.iqoption.core.util.af;
import com.iqoption.core.util.j;
import com.iqoption.e.yl;
import com.iqoption.view.d.b;
import com.iqoption.x.R;
import java.text.DecimalFormat;

/* compiled from: BinaryRightPanelCallPutDelegate */
public final class a implements p {
    private final yl dkN;
    @Nullable
    private OnClickListener dkO;
    @Nullable
    private OnClickListener dkP;
    private final DecimalFormat dkQ = j.fq(2);

    public void k(double d, int i) {
    }

    public a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.dkN = (yl) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_turbo_binary_call_put, viewGroup, false);
        this.dkN.ctD.setOnClickListener(new b() {
            public void M(View view) {
                if (a.this.dkO != null) {
                    a.this.dkO.onClick(view);
                }
            }
        });
        this.dkN.ctE.setOnClickListener(new b() {
            public void M(View view) {
                if (a.this.dkP != null) {
                    a.this.dkP.onClick(view);
                }
            }
        });
    }

    public void a(OnClickListener onClickListener) {
        this.dkO = onClickListener;
    }

    public void b(OnClickListener onClickListener) {
        this.dkP = onClickListener;
    }

    public View getView() {
        return this.dkN.getRoot();
    }

    public void aEZ() {
        RightPanelDelegate.bH(this.dkN.ctD);
    }

    public void aFa() {
        RightPanelDelegate.bI(this.dkN.ctD);
    }

    public void aFb() {
        RightPanelDelegate.bH(this.dkN.ctE);
    }

    public void aFc() {
        RightPanelDelegate.bI(this.dkN.ctE);
    }

    public void j(double d, int i) {
        this.dkN.ctI.setText(com.iqoption.util.j.a(d, this.dkQ));
        this.dkN.ctH.setText(af.s((double) i));
    }
}
