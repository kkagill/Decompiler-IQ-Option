package com.iqoption.view.spinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.iqoption.x.R;

public class AwesomeTextSpinner extends FrameLayout {
    private static final String TAG = "com.iqoption.view.spinner.AwesomeTextSpinner";
    private ImageView aIu;
    private TextView bgu;
    private TextView ehI;
    private String ehJ;
    private int ehK;
    private int ehL;
    private int ehM;
    private int ehN;
    private PopupWindow ehO;
    private int ehP;
    private ListView ehQ;
    private a ehR;
    private OnClickListener ehS;

    public interface a {
        void gm(int i);
    }

    public AwesomeTextSpinner(Context context) {
        this(context, null);
    }

    public AwesomeTextSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AwesomeTextSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ehS = new OnClickListener() {
            public void onClick(View view) {
                if (view.isSelected()) {
                    view.setSelected(false);
                    AwesomeTextSpinner.this.aIu.setRotation(0.0f);
                    AwesomeTextSpinner.this.ehO.dismiss();
                    return;
                }
                view.setSelected(true);
                AwesomeTextSpinner.this.aIu.setRotation(180.0f);
                AwesomeTextSpinner.this.ehO.setWidth(AwesomeTextSpinner.this.getWidth());
                AwesomeTextSpinner.this.ehO.showAsDropDown(AwesomeTextSpinner.this);
            }
        };
        g(attributeSet);
        init();
    }

    private void g(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.iqoption.d.a.AwesomeTextSpinner);
        this.ehJ = obtainStyledAttributes.getString(0);
        this.ehK = obtainStyledAttributes.getResourceId(5, R.drawable.spinner_button_state);
        this.ehL = obtainStyledAttributes.getResourceId(4, R.drawable.hate_menu_arrow_up);
        this.ehM = obtainStyledAttributes.getColor(3, -1);
        this.ehN = obtainStyledAttributes.getColor(2, this.ehM);
        obtainStyledAttributes.recycle();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.awesome_text_spinner, this, true);
        setClipChildren(false);
        setClipToPadding(false);
        setOnClickListener(this.ehS);
        this.bgu = (TextView) findViewById(R.id.hintView);
        if (TextUtils.isEmpty(this.ehJ)) {
            this.bgu.setVisibility(8);
        } else {
            this.bgu.setVisibility(0);
            this.bgu.setTextColor(this.ehN);
            TextView textView = this.bgu;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ehJ);
            stringBuilder.append(":");
            textView.setText(stringBuilder.toString());
        }
        this.ehI = (TextView) findViewById(R.id.title);
        this.ehI.setTextColor(this.ehM);
        this.aIu = (ImageView) findViewById(R.id.arrow);
        this.aIu.setImageDrawable(AppCompatResources.getDrawable(getContext(), this.ehL));
        setBackgroundResource(this.ehK);
        aYF();
    }

    private void aYF() {
        this.ehO = new PopupWindow(getContext());
        this.ehO.setOutsideTouchable(true);
        this.ehQ = new ListView(getContext());
        this.ehQ.setDivider(new ColorDrawable(Color.parseColor("#2b313a")));
        this.ehQ.setDividerHeight(getResources().getDimensionPixelSize(R.dimen.dp1));
        this.ehQ.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AwesomeTextSpinner.this.ehO.dismiss();
                AwesomeTextSpinner.this.ehP = i;
                AwesomeTextSpinner.this.ehI.setText(AwesomeTextSpinner.this.ehQ.getAdapter().getItem(i).toString());
                if (AwesomeTextSpinner.this.ehR != null) {
                    AwesomeTextSpinner.this.ehR.gm(i);
                }
            }
        });
        this.ehO.setFocusable(true);
        this.ehO.setWidth(getResources().getDimensionPixelSize(R.dimen.dp140));
        this.ehO.setHeight(-2);
        this.ehO.setOnDismissListener(new OnDismissListener() {
            public void onDismiss() {
                AwesomeTextSpinner.this.setSelected(false);
                AwesomeTextSpinner.this.aIu.setRotation(0.0f);
            }
        });
        this.ehO.setContentView(this.ehQ);
    }

    public void setItemSelectedListener(a aVar) {
        this.ehR = aVar;
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.ehQ.setAdapter(baseAdapter);
    }

    public void setSelection(int i) {
        setSelection(i, false);
    }

    public void setSelection(int i, boolean z) {
        ListAdapter adapter = this.ehQ.getAdapter();
        if (i >= 0 && i < adapter.getCount()) {
            this.ehP = i;
            this.ehQ.setSelection(i);
            this.ehI.setText(adapter.getItem(i).toString());
            if (z) {
                a aVar = this.ehR;
                if (aVar != null) {
                    aVar.gm(i);
                }
            }
        }
    }

    public int getSelection() {
        return this.ehP;
    }
}
