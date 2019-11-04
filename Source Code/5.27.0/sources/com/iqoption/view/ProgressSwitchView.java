package com.iqoption.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import com.iqoption.core.ui.widget.c;
import com.iqoption.x.R;

public class ProgressSwitchView extends FrameLayout {
    private c bJU;
    private ImageView bJZ;
    private Switch efO;

    public ProgressSwitchView(Context context) {
        super(context);
        b(context, null);
    }

    public ProgressSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public ProgressSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }

    @TargetApi(21)
    public ProgressSwitchView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(context, attributeSet);
    }

    public void setChecked(boolean z) {
        this.efO.setChecked(z);
    }

    public boolean isChecked() {
        return this.efO.isChecked();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.efO.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private void b(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_security_progress_switch_layout, this, true);
        this.efO = (Switch) inflate.findViewById(R.id.switchView);
        this.bJU = new c(context, inflate);
        this.bJZ = (ImageView) inflate.findViewById(R.id.progressView);
        if (!isInEditMode()) {
            this.bJZ.setImageDrawable(this.bJU);
        }
    }

    public void d(boolean z, boolean z2) {
        this.efO.setClickable(z ^ 1);
        if (z) {
            if (z2) {
                this.efO.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f);
                this.bJZ.setAlpha(0.0f);
                this.bJZ.setScaleX(0.0f);
                this.bJZ.setScaleY(0.0f);
                this.bJZ.setVisibility(0);
                this.bJZ.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
            } else {
                this.efO.setAlpha(0.0f);
                this.bJZ.setVisibility(0);
                this.bJZ.setAlpha(1.0f);
            }
            this.bJU.start();
        } else if (z2) {
            this.efO.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
            this.bJZ.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ProgressSwitchView.this.bJU.stop();
                    ProgressSwitchView.this.bJZ.setVisibility(8);
                }
            });
        } else {
            this.bJU.stop();
            this.efO.setScaleX(1.0f);
            this.efO.setScaleY(1.0f);
            this.efO.setAlpha(1.0f);
            this.efO.setVisibility(0);
            this.bJZ.setAlpha(0.0f);
            this.bJZ.setVisibility(8);
        }
    }
}
