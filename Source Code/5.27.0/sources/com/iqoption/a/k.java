package com.iqoption.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.iqoption.dto.SupportMessage;
import com.iqoption.x.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: SupportOverviewAdapter */
public class k extends BaseAdapter {
    private Activity activity;
    private List<SupportMessage> anc = new ArrayList();
    private SimpleDateFormat ann = new SimpleDateFormat("HH:mm dd.MM.yyyy");

    /* compiled from: SupportOverviewAdapter */
    private static class a {
        private TextView anh;
        private TextView ani;
        private TextView anj;

        public a(View view) {
            this.ani = (TextView) view.findViewById(R.id.supportText);
            this.anh = (TextView) view.findViewById(R.id.supportSubject);
            this.anj = (TextView) view.findViewById(R.id.supportTime);
        }
    }

    public long getItemId(int i) {
        return 0;
    }

    public k(Activity activity, List<SupportMessage> list) {
        this.activity = activity;
        r(list);
    }

    public void r(List<SupportMessage> list) {
        if (list != null) {
            this.anc = list;
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
            view = this.activity.getLayoutInflater().inflate(R.layout.support_overview_item, null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        SupportMessage supportMessage = (SupportMessage) this.anc.get(i);
        aVar.ani.setText(supportMessage.text);
        if (supportMessage.isIncoming(this.activity)) {
            aVar.ani.setTextColor(this.activity.getResources().getColor(R.color.blue));
        } else {
            aVar.ani.setTextColor(this.activity.getResources().getColor(R.color.gray_color));
        }
        aVar.anh.setText(supportMessage.subject);
        aVar.anj.setText(this.ann.format(new Date(supportMessage.created.longValue())));
        return view;
    }
}
