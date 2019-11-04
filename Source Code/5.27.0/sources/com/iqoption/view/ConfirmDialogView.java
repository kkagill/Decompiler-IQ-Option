package com.iqoption.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import com.iqoption.e.em;
import com.iqoption.l.b;
import com.iqoption.system.a.e;
import com.iqoption.util.j;
import com.iqoption.view.d.d;
import com.iqoption.x.R;
import java.text.DecimalFormat;

public class ConfirmDialogView extends LinearLayout implements OnClickListener, OnCheckedChangeListener {
    private a eeD;
    private em eeE;
    private OnClickListener eeF;
    private OnClickListener eeG;

    private static class a extends e<ConfirmDialogView> {
        public a(ConfirmDialogView confirmDialogView) {
            super(confirmDialogView);
        }

        @com.google.common.b.e
        public void onSettingChanged(com.iqoption.l.a.a aVar) {
            ConfirmDialogView confirmDialogView = (ConfirmDialogView) this.dUo.get();
            if (confirmDialogView != null) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$ConfirmDialogView$a$YLinW5dkBrlur6cNkBX7frJBxj0(confirmDialogView, aVar));
            }
        }
    }

    public ConfirmDialogView(Context context) {
        this(context, null);
    }

    public ConfirmDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConfirmDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.eeD == null) {
            this.eeD = new a(this);
        }
        this.eeD.register();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        a aVar = this.eeD;
        if (aVar != null) {
            aVar.unregister();
        }
        super.onDetachedFromWindow();
    }

    private void init() {
        this.eeE = (em) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.confirm_dialog_view, this, true);
        setOrientation(1);
        this.eeE.bZy.setOnClickListener(this);
        this.eeE.bZy.setOnTouchListener(new d(0.5f));
        this.eeE.bZz.setOnClickListener(this);
        this.eeE.bZz.setOnTouchListener(new d(0.5f));
        this.eeE.bZI.setOnCheckedChangeListener(this);
    }

    public void setExpiration(String str) {
        this.eeE.bZG.D(str);
    }

    public void setLevel(String str) {
        this.eeE.bZH.setText(str);
    }

    public void setPrice(@NonNull String str) {
        this.eeE.bZF.setVisibility(0);
        this.eeE.bZE.setText(str);
    }

    public void aXR() {
        this.eeE.bZF.setVisibility(8);
    }

    public void setBep(String str) {
        this.eeE.bZB.setVisibility(0);
        this.eeE.bZA.setText(str);
    }

    public void aXS() {
        this.eeE.bZB.setVisibility(8);
    }

    public void b(double d, @NonNull DecimalFormat decimalFormat) {
        this.eeE.bZD.setVisibility(0);
        this.eeE.bZC.setText(j.a(d, decimalFormat));
    }

    public void setInvest(String str) {
        this.eeE.bZC.setText(str);
    }

    public void setType(boolean z) {
        this.eeE.bZK.setImageResource(z ? R.drawable.arrow_green : R.drawable.arrow_red);
    }

    public void setTypeVisibility(boolean z) {
        this.eeE.bZL.setVisibility(z ? 0 : 8);
    }

    public void setConfirmListener(OnClickListener onClickListener) {
        this.eeF = onClickListener;
    }

    public void setCancelListener(OnClickListener onClickListener) {
        this.eeG = onClickListener;
    }

    public void onClick(View view) {
        int id = view.getId();
        OnClickListener onClickListener;
        if (id == R.id.btnConfirm) {
            onClickListener = this.eeF;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (id == R.id.cancelIcon) {
            onClickListener = this.eeG;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.purchaseOneClickSwitcher && b.aTS().aUa() != z) {
            b.aTS().fg(z);
        }
    }
}
