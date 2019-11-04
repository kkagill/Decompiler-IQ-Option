package com.iqoption.a;

import android.graphics.Color;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dialog.c;
import com.iqoption.dto.SupportMessage;
import com.iqoption.x.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: SupportChatAdapter */
public class j extends BaseAdapter {
    private List<SupportMessage> anc = new ArrayList();
    private FragmentActivity and;
    private DateFormat ane = TimeUtil.bRB;
    OnClickListener anf = new OnClickListener() {
        public void onClick(View view) {
            c.bw(((Long) view.getTag()).longValue()).show(j.this.and.getSupportFragmentManager(), "RateTicketDialog");
        }
    };

    /* compiled from: SupportChatAdapter */
    private static class a {
        private TextView anh;
        private TextView ani;
        private TextView anj;
        private TextView ank;
        private View anl;
        private ImageView[] anm = new ImageView[5];

        public a(View view) {
            this.ani = (TextView) view.findViewById(R.id.supportText);
            this.anh = (TextView) view.findViewById(R.id.supportSubject);
            this.anj = (TextView) view.findViewById(R.id.supportTime);
            this.ank = (TextView) view.findViewById(R.id.rateLink);
            this.anl = view.findViewById(R.id.containerStar);
            this.anm[0] = (ImageView) view.findViewById(R.id.star1);
            this.anm[1] = (ImageView) view.findViewById(R.id.star2);
            this.anm[2] = (ImageView) view.findViewById(R.id.star3);
            this.anm[3] = (ImageView) view.findViewById(R.id.star4);
            this.anm[4] = (ImageView) view.findViewById(R.id.star5);
        }
    }

    public long getItemId(int i) {
        return 0;
    }

    public j(FragmentActivity fragmentActivity, List<SupportMessage> list) {
        this.and = fragmentActivity;
        r(list);
    }

    public void r(List<SupportMessage> list) {
        if (list != null) {
            this.anc = list;
        }
    }

    public void b(long j, int i) {
        for (SupportMessage supportMessage : this.anc) {
            if (supportMessage.id == j) {
                supportMessage.canBeRated = false;
                supportMessage.rate = i;
                return;
            }
        }
    }

    public int getCount() {
        return this.anc.size();
    }

    public Object getItem(int i) {
        return this.anc.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.and.getLayoutInflater().inflate(R.layout.support_chat_item, null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        SupportMessage supportMessage = (SupportMessage) this.anc.get(i);
        aVar.anh.setText(supportMessage.isIncoming(this.and) ? R.string.support : R.string.you);
        aVar.anh.setTextColor(supportMessage.isIncoming(this.and) ? Color.parseColor("#93a8c2") : this.and.getResources().getColor(R.color.blue));
        aVar.ani.setText(supportMessage.text);
        aVar.ani.setBackgroundResource(supportMessage.isIncoming(this.and) ? R.drawable.text_bubble : R.drawable.text_bubble2);
        aVar.anj.setText(this.ane.format(new Date(supportMessage.created.longValue())));
        int i2 = 8;
        int i3 = 0;
        if (supportMessage.canBeRated) {
            TextView d = aVar.ank;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<u>");
            stringBuilder.append(this.and.getString(R.string.rate_the_answer));
            stringBuilder.append("</u>");
            d.setText(Html.fromHtml(stringBuilder.toString()));
            aVar.ank.setVisibility(0);
            aVar.ank.setOnClickListener(this.anf);
            aVar.ank.setTag(Long.valueOf(supportMessage.id));
        } else {
            aVar.ank.setVisibility(8);
            aVar.ank.setOnClickListener(null);
        }
        View e = aVar.anl;
        if (supportMessage.rate > 0) {
            i2 = 0;
        }
        e.setVisibility(i2);
        while (i3 < aVar.anm.length) {
            if (i3 < supportMessage.rate) {
                aVar.anm[i3].setImageResource(R.drawable.rate_star_on);
            } else {
                aVar.anm[i3].setImageResource(R.drawable.rate_star_grey_off);
            }
            i3++;
        }
        return view;
    }
}
