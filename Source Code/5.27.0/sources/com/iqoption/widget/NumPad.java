package com.iqoption.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.databinding.DataBindingUtil;
import com.iqoption.e.tj;
import com.iqoption.x.R;

public class NumPad extends FrameLayout {
    @Nullable
    private c eoE;
    @Nullable
    private a eoF;
    private tj eoG;
    private int eoH = 0;
    private boolean eoI = false;
    private d eoJ;

    public interface a {
        void onChangeSign(int i);
    }

    private class b implements OnClickListener {
        private final int value;

        private b(int i) {
            this.value = i;
        }

        public void onClick(View view) {
            if (NumPad.this.eoE != null) {
                NumPad.this.eoE.onKeyPressed(this.value);
            }
        }
    }

    public interface c {
        void onKeyPressed(int i);
    }

    private class d implements OnLongClickListener {
        private TextView bgh;
        private int value = 1;

        public d(TextView textView) {
            this.bgh = textView;
            bbO();
        }

        public boolean onLongClick(View view) {
            if (NumPad.this.eoF == null) {
                return false;
            }
            this.value = -this.value;
            NumPad.this.eoF.onChangeSign(this.value);
            bbO();
            return true;
        }

        private void bbO() {
            this.bgh.setText(this.value > 0 ? "-" : "+");
        }

        public void setSign(int i) {
            this.value = i > 0 ? 1 : -1;
            bbO();
        }

        public int getSign() {
            return this.value;
        }
    }

    public NumPad(@NonNull Context context) {
        super(context);
        initialize();
    }

    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
        initialize();
    }

    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
        initialize();
    }

    @RequiresApi(api = 21)
    public NumPad(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
        initialize();
    }

    public void setKeyListener(@Nullable c cVar) {
        this.eoE = cVar;
    }

    public void setChangeSignListener(@Nullable a aVar) {
        this.eoF = aVar;
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.NumPad, 0, 0);
        try {
            this.eoH = obtainStyledAttributes.getInt(3, 0);
            this.eoI = obtainStyledAttributes.getBoolean(1, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void initialize() {
        this.eoG = (tj) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.numpad, this, true);
        this.eoG.bgf.setOnClickListener(new b(145));
        this.eoG.bgk.setOnClickListener(new b(146));
        this.eoG.bgj.setOnClickListener(new b(147));
        this.eoG.bfZ.setOnClickListener(new b(148));
        this.eoG.bfY.setOnClickListener(new b(149));
        this.eoG.bgi.setOnClickListener(new b(150));
        this.eoG.bgg.setOnClickListener(new b(151));
        this.eoG.bfX.setOnClickListener(new b(152));
        this.eoG.bge.setOnClickListener(new b(153));
        this.eoG.bgl.setOnClickListener(new b(144));
        this.eoG.bfU.setOnClickListener(new b(67));
        int i = this.eoH;
        int i2 = 0;
        if (i != 0) {
            CharSequence charSequence;
            if (i == 1) {
                i2 = 81;
                charSequence = "+";
            } else if (i != 2) {
                charSequence = "";
            } else {
                i2 = 158;
                charSequence = ".";
            }
            this.eoG.bfV.setText(charSequence);
            this.eoG.bfV.setOnClickListener(new b(i2));
        } else {
            this.eoG.bfV.setVisibility(4);
            this.eoG.bfV.setClickable(false);
            this.eoG.bfV.setFocusable(false);
        }
        if (this.eoI) {
            this.eoJ = new d(this.eoG.bgh);
            this.eoG.bgl.setOnLongClickListener(this.eoJ);
            this.eoJ.bbO();
            return;
        }
        this.eoG.bgh.setText(" ");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a(this.eoG.bga, z);
        a(this.eoG.bgb, z);
        a(this.eoG.bgc, z);
        a(this.eoG.bgd, z);
    }

    private void a(LinearLayout linearLayout, boolean z) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }

    public void setSign(int i) {
        d dVar = this.eoJ;
        if (dVar != null) {
            dVar.setSign(i);
        }
    }

    public int getSign() {
        d dVar = this.eoJ;
        return dVar != null ? dVar.getSign() : 1;
    }
}
