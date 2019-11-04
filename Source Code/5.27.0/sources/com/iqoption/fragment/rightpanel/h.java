package com.iqoption.fragment.rightpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.iqoption.core.util.af;
import com.iqoption.e.xz;
import com.iqoption.view.d.b;
import com.iqoption.x.R;

/* compiled from: DigitalRightPanelCallPutDelegate */
public final class h implements p {
    private static final String TAG = "h";
    @Nullable
    private OnClickListener dkO;
    @Nullable
    private OnClickListener dkP;
    private final xz dnf;
    private boolean dng;
    private boolean dnh;
    private boolean dni;

    public h(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.dnf = (xz) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_digital_call_put, viewGroup, false);
        this.dnf.csG.setOnClickListener(new b() {
            public void M(View view) {
                if (h.this.dkO != null) {
                    h.this.dkO.onClick(view);
                }
            }
        });
        this.dnf.csK.setOnClickListener(new b() {
            public void M(View view) {
                if (h.this.dkP != null) {
                    h.this.dkP.onClick(view);
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
        return this.dnf.getRoot();
    }

    public void aEZ() {
        bH(this.dnf.csG);
        if (this.dnh) {
            aGO();
        }
    }

    public void aFa() {
        bI(this.dnf.csG);
    }

    public void aFb() {
        bH(this.dnf.csK);
        if (this.dni) {
            aGP();
        }
    }

    public void aFc() {
        bI(this.dnf.csK);
    }

    private void bH(View view) {
        if (this.dng) {
            view.setEnabled(true);
            view.animate().cancel();
            view.setAlpha(1.0f);
            return;
        }
        RightPanelDelegate.bH(view);
    }

    private void bI(View view) {
        if (this.dng) {
            view.setEnabled(false);
            view.animate().cancel();
            view.setAlpha(0.7f);
            return;
        }
        RightPanelDelegate.bI(view);
    }

    public void ec(boolean z) {
        if (z != this.dng) {
            this.dng = z;
            if (!z) {
                if (this.dnh) {
                    aGO();
                }
                if (this.dni) {
                    aGP();
                }
            }
        }
    }

    public void j(double d, int i) {
        this.dnh = false;
        this.dnf.csS.h(af.at(com.iqoption.app.b.DG().DO(), "%.2f"), d);
        this.dnf.csR.H("%s%%", i);
    }

    public void aGO() {
        this.dnh = true;
        if (!this.dng) {
            this.dnf.csS.clear();
            this.dnf.csR.clear();
        }
    }

    public void k(double d, int i) {
        this.dni = false;
        this.dnf.cta.h(af.at(com.iqoption.app.b.DG().DO(), "%.2f"), d);
        this.dnf.csZ.H("%s%%", i);
    }

    public void aGP() {
        this.dni = true;
        if (!this.dng) {
            this.dnf.cta.clear();
            this.dnf.csZ.clear();
        }
    }
}
