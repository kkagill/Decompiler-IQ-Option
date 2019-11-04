package com.iqoption.dialog;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.IQApp;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.mobbtech.connect.response.g;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.util.HashMap;

/* compiled from: RateTicketDialog */
public class c extends com.iqoption.fragment.b.c {
    private ImageView[] anm = new ImageView[5];
    private EditText cGT;
    private View cGU;
    private ProgressBar cGV;
    private int cGW = 0;

    /* compiled from: RateTicketDialog */
    private class a implements OnClickListener {
        private int cHa;

        public a(int i) {
            this.cHa = i;
        }

        public void onClick(View view) {
            for (int i = 0; i < c.this.anm.length; i++) {
                if (i <= this.cHa) {
                    c.this.anm[i].setImageResource(R.drawable.rate_star_on);
                } else {
                    c.this.anm[i].setImageResource(R.drawable.rate_star_off);
                }
            }
            if (this.cHa <= 2) {
                c.this.cGT.setVisibility(0);
            } else {
                c.this.cGT.setVisibility(8);
            }
            c.this.cGW = this.cHa + 1;
            if (c.this.cGW > 3 || !TextUtils.isEmpty(c.this.cGT.getText().toString())) {
                c.this.cGU.setEnabled(true);
            } else {
                c.this.cGU.setEnabled(false);
            }
        }
    }

    public static c bw(long j) {
        c cVar = new c();
        cVar.setStyle(2, 16973937);
        Bundle bundle = new Bundle();
        bundle.putLong("idTicket", j);
        cVar.setArguments(bundle);
        return cVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawableResource(17170445);
        getDialog().setCanceledOnTouchOutside(true);
        getDialog().getWindow().setFlags(8, 8);
        getDialog().setOnShowListener(new OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                c.this.getDialog().getWindow().clearFlags(8);
                y.aA(c.this.getDialog().getWindow().getDecorView());
            }
        });
        return layoutInflater.inflate(R.layout.rate_ticket_dialog, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final long j = getArguments().getLong("idTicket");
        this.anm[0] = (ImageView) view.findViewById(R.id.star1);
        this.anm[1] = (ImageView) view.findViewById(R.id.star2);
        this.anm[2] = (ImageView) view.findViewById(R.id.star3);
        this.anm[3] = (ImageView) view.findViewById(R.id.star4);
        this.anm[4] = (ImageView) view.findViewById(R.id.star5);
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.anm;
            if (i < imageViewArr.length) {
                imageViewArr[i].setOnClickListener(new a(i));
                i++;
            } else {
                this.cGV = (ProgressBar) view.findViewById(R.id.rateProgress);
                this.cGT = (EditText) view.findViewById(R.id.comment);
                this.cGT.setHorizontallyScrolling(false);
                this.cGT.setMaxLines(100);
                this.cGT.addTextChangedListener(new TextWatcher() {
                    public void afterTextChanged(Editable editable) {
                    }

                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (c.this.cGW > 3 || !TextUtils.isEmpty(c.this.cGT.getText().toString())) {
                            c.this.cGU.setEnabled(true);
                        } else {
                            c.this.cGU.setEnabled(false);
                        }
                    }
                });
                this.cGU = view.findViewById(R.id.confirm);
                this.cGU.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        c.this.cGU.setVisibility(4);
                        c.this.cGV.setVisibility(0);
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", String.valueOf(j));
                        hashMap.put("mark", String.valueOf(c.this.cGW));
                        hashMap.put("mark_comment", c.this.cGT.getText().toString());
                        String Vb = IQApp.Ev().Vb();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(Vb);
                        Vb = "api/ticket/rate";
                        stringBuilder.append(Vb);
                        new com.iqoption.mobbtech.connect.request.a.a.a(RequestManager.b(stringBuilder.toString(), hashMap, c.this.getActivity()), new com.iqoption.mobbtech.connect.a.a() {
                            /* renamed from: a */
                            public void onSuccess(g gVar) {
                                ((TradeRoomActivity) c.this.getActivity()).b(j, c.this.cGW);
                                c.this.dismiss();
                            }

                            public void a(f fVar) {
                                c.this.cGU.setVisibility(0);
                                c.this.cGV.setVisibility(8);
                            }
                        }, Vb).aPG();
                    }
                });
                this.cGU.setEnabled(false);
                view.findViewById(R.id.cancel).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        c.this.dismiss();
                    }
                });
                return;
            }
        }
    }
}
