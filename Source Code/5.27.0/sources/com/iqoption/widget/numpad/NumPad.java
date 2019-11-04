package com.iqoption.widget.numpad;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.data.model.Sign;

public final class NumPad extends FrameLayout {
    private static final SparseIntArray eoY = new SparseIntArray();
    ViewDataBinding amm;
    @Nullable
    private b eoZ;
    @Nullable
    private a epa;
    private c epb;

    public interface a {
        void a(Sign sign);
    }

    public interface b {
        void onKeyPressed(int i);
    }

    private class c implements OnLongClickListener {
        private Sign epc = Sign.PLUS;

        c() {
        }

        public boolean onLongClick(View view) {
            if (NumPad.this.epa == null) {
                return false;
            }
            this.epc = this.epc.invert();
            NumPad.this.epa.a(this.epc);
            return true;
        }

        public void setSign(int i) {
            this.epc = Sign.of(i);
        }

        public Sign getSign() {
            return this.epc;
        }
    }

    static {
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_1, 8);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_2, 9);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_3, 10);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_4, 11);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_5, 12);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_6, 13);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_7, 14);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_8, 15);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_9, 16);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_0, 7);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_custom, 158);
        eoY.put(com.iqoption.widget.numpad.b.a.widget_numpad_item_delete, 67);
    }

    public NumPad(@NonNull Context context) {
        super(context);
    }

    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            d(attributeSet);
        }
    }

    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            d(attributeSet);
        }
    }

    @TargetApi(21)
    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (attributeSet != null) {
            d(attributeSet);
        }
    }

    public void setKeyListener(@Nullable b bVar) {
        this.eoZ = bVar;
    }

    public void setChangeSignListener(@Nullable a aVar) {
        this.epa = aVar;
        View findViewById = findViewById(com.iqoption.widget.numpad.b.a.widget_numpad_plus);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        findViewById = findViewById(com.iqoption.widget.numpad.b.a.widget_numpad_minus);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    private void d(@NonNull AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.iqoption.widget.numpad.b.c.NumPad);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(com.iqoption.widget.numpad.b.c.NumPad_layoutId, com.iqoption.widget.numpad.b.b.widget_layout_numpad_default);
            if (isInEditMode()) {
                LayoutInflater.from(getContext()).inflate(resourceId, this);
            } else {
                setBinding(DataBindingUtil.inflate(LayoutInflater.from(getContext()), resourceId, this, false));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public void setBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != this.amm) {
            this.amm = viewDataBinding;
            removeAllViews();
            addView(viewDataBinding.getRoot());
            -$$Lambda$NumPad$IZg-iHVcpPTvUSb4kxDzL_FaE0A -__lambda_numpad_izg-ihvcpptvusb4kxdzl_fae0a = new -$$Lambda$NumPad$IZg-iHVcpPTvUSb4kxDzL_FaE0A(this);
            int size = eoY.size();
            for (int i = 0; i < size; i++) {
                View findViewById = findViewById(eoY.keyAt(i));
                if (findViewById != null) {
                    if (findViewById.getId() == com.iqoption.widget.numpad.b.a.widget_numpad_item_delete) {
                        new com.iqoption.core.ui.widget.e.a(findViewById).a(new -$$Lambda$NumPad$Nv14fsacv6TrawRnoy4RfwgamOg(this));
                    } else {
                        findViewById.setOnClickListener(-__lambda_numpad_izg-ihvcpptvusb4kxdzl_fae0a);
                        if (findViewById.getId() == com.iqoption.widget.numpad.b.a.widget_numpad_item_0) {
                            this.epb = new c();
                            findViewById.setOnLongClickListener(this.epb);
                        }
                    }
                }
            }
        }
    }

    private /* synthetic */ void cm(View view) {
        b bVar = this.eoZ;
        if (bVar != null) {
            bVar.onKeyPressed(eoY.get(view.getId(), 0));
        }
    }

    private /* synthetic */ void j(View view, boolean z) {
        b bVar = this.eoZ;
        if (bVar != null) {
            bVar.onKeyPressed(67);
        }
    }

    public ViewDataBinding getBinding() {
        return this.amm;
    }

    public void setSign(int i) {
        this.epb.setSign(i);
    }

    public Sign getSign() {
        return this.epb.getSign();
    }
}
