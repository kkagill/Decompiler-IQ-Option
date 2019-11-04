package com.iqoption.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.iqoption.x.R;

public final class SettingItemView extends LinearLayout {
    private b egd;
    private a ege;
    private TextView egf;
    private ProgressBar egg;
    private SwitchCompat egh;

    public interface a {
        void onToggled(@NonNull SettingItemView settingItemView, boolean z);
    }

    public interface b {
        boolean a(@NonNull SettingItemView settingItemView, boolean z);
    }

    public SettingItemView(Context context) {
        super(context);
        init(null);
    }

    public SettingItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public SettingItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @TargetApi(21)
    public SettingItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet);
    }

    private void init(@Nullable AttributeSet attributeSet) {
        inflate(getContext(), R.layout.setting_item_view, this);
        setGravity(16);
        setClickable(true);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (SettingItemView.this.egd != null) {
                    b a = SettingItemView.this.egd;
                    SettingItemView settingItemView = SettingItemView.this;
                    if (a.a(settingItemView, settingItemView.egh.isChecked())) {
                        return;
                    }
                }
                SettingItemView.this.toggle();
            }
        });
        this.egf = (TextView) findViewById(R.id.setting_label);
        this.egg = (ProgressBar) findViewById(R.id.setting_progress);
        this.egh = (SwitchCompat) findViewById(R.id.setting_switch);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.iqoption.d.a.SettingItemView);
            setLabel(obtainStyledAttributes.getText(1));
            setChecked(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public void setLabel(@Nullable CharSequence charSequence) {
        this.egf.setText(charSequence);
    }

    public void setProgressVisible(boolean z) {
        this.egg.setVisibility(z ? 0 : 8);
    }

    public void setChecked(boolean z) {
        this.egh.setChecked(z);
    }

    public void toggle() {
        this.egh.performClick();
        a aVar = this.ege;
        if (aVar != null) {
            aVar.onToggled(this, this.egh.isChecked());
        }
    }

    public void setToggleHandler(@Nullable b bVar) {
        this.egd = bVar;
    }

    public void setOnToggleListener(@Nullable a aVar) {
        this.ege = aVar;
    }
}
