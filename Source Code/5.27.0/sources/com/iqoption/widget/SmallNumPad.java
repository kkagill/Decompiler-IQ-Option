package com.iqoption.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.databinding.DataBindingUtil;
import com.iqoption.e.yz;
import com.iqoption.view.d.c;
import com.iqoption.x.R;

public class SmallNumPad extends FrameLayout {
    private int eoH = 0;
    @Nullable
    private b eoL;
    private yz eoM;

    private class a implements OnClickListener {
        private final int value;

        /* synthetic */ a(SmallNumPad smallNumPad, int i, AnonymousClass1 anonymousClass1) {
            this(i);
        }

        private a(int i) {
            this.value = i;
        }

        public void onClick(View view) {
            if (SmallNumPad.this.eoL != null) {
                SmallNumPad.this.eoL.onKeyPressed(this.value);
            }
        }
    }

    public interface b {
        void onKeyPressed(int i);
    }

    public SmallNumPad(@NonNull Context context) {
        super(context);
        initialize();
    }

    public SmallNumPad(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
        initialize();
    }

    public SmallNumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
        initialize();
    }

    @RequiresApi(api = 21)
    public SmallNumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
        initialize();
    }

    public void setKeyListener(@Nullable b bVar) {
        this.eoL = bVar;
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.SmallNumPad, 0, 0);
        try {
            this.eoH = obtainStyledAttributes.getInt(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void bbP() {
        b bVar = this.eoL;
        if (bVar != null) {
            bVar.onKeyPressed(67);
        }
    }

    private void initialize() {
        this.eoM = (yz) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.small_numpad, this, true);
        this.eoM.bgf.setOnClickListener(new a(this, 145, null));
        this.eoM.bgk.setOnClickListener(new a(this, 146, null));
        this.eoM.bgj.setOnClickListener(new a(this, 147, null));
        this.eoM.bfZ.setOnClickListener(new a(this, 148, null));
        this.eoM.bfY.setOnClickListener(new a(this, 149, null));
        this.eoM.bgi.setOnClickListener(new a(this, 150, null));
        this.eoM.bgg.setOnClickListener(new a(this, 151, null));
        this.eoM.bfX.setOnClickListener(new a(this, 152, null));
        this.eoM.bge.setOnClickListener(new a(this, 153, null));
        this.eoM.clS.setOnClickListener(new a(this, 144, null));
        new com.iqoption.view.text.g.a().ci(this.eoM.bfU).a(new c()).a(new com.iqoption.view.text.g.b() {
            public void bj(View view) {
                SmallNumPad.this.bbP();
            }
        }).aYG();
        int i = this.eoH;
        CharSequence charSequence = "";
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                i2 = 81;
                charSequence = "+";
            } else if (i == 2) {
                i2 = 158;
                charSequence = ".";
            }
            this.eoM.bfV.setText(charSequence);
            this.eoM.bfV.setOnClickListener(new a(this, i2, null));
            return;
        }
        this.eoM.bfV.setText(charSequence);
        this.eoM.bfV.setClickable(false);
        this.eoM.bfV.setFocusable(false);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a(this.eoM.bga, z);
        a(this.eoM.bgb, z);
        a(this.eoM.bgc, z);
        a(this.eoM.bgd, z);
    }

    private void a(LinearLayout linearLayout, boolean z) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }
}
