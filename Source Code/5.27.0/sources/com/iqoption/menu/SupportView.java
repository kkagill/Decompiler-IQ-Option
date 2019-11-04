package com.iqoption.menu;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.iqoption.a.j;
import com.iqoption.a.k;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.chat.ChatActivity;
import com.iqoption.dto.Event;
import com.iqoption.dto.SupportMessage;
import com.iqoption.dto.SupportSubject;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.a;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.mobbtech.connect.response.g;
import com.iqoption.view.d.b;
import com.iqoption.view.spinner.AwesomeTextSpinner;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SupportView extends FrameLayout {
    private FragmentActivity and;
    private ProgressBar bYs;
    private List<SupportSubject> dGb;
    private Button dGc;
    private Button dGd;
    private ListView dGe;
    private TextView dGf;
    private View dGg;
    private EditText dGh;
    private AwesomeTextSpinner dGi;
    private View dGj;
    private ListView dGk;
    private EditText dGl;
    private k dGm;
    private j dGn;
    private Mode dGo;
    private long dGp;
    private b dGq;
    private b dGr;
    private b dGs;
    private b dGt;

    /* renamed from: com.iqoption.menu.SupportView$9 */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] dGx = new int[Mode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.menu.SupportView.Mode.values();
            r0 = r0.length;
            r0 = new int[r0];
            dGx = r0;
            r0 = dGx;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.menu.SupportView.Mode.OVERVIEW;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = dGx;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.menu.SupportView.Mode.NEW_MESSAGE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = dGx;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.menu.SupportView.Mode.CHAT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.menu.SupportView$AnonymousClass9.<clinit>():void");
        }
    }

    private enum Mode {
        OVERVIEW,
        CHAT,
        NEW_MESSAGE
    }

    public SupportView(FragmentActivity fragmentActivity) {
        this(fragmentActivity, null);
    }

    public SupportView(FragmentActivity fragmentActivity, AttributeSet attributeSet) {
        this(fragmentActivity, attributeSet, 0);
    }

    public SupportView(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i) {
        super(fragmentActivity, attributeSet, i);
        this.dGb = new ArrayList();
        this.dGq = new b() {
            public void M(View view) {
                SupportView supportView = SupportView.this;
                supportView.a(null, Long.valueOf(supportView.dGp), SupportView.this.dGl.getText().toString());
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "support-old-dialog_send-message").build());
            }
        };
        this.dGr = new b() {
            public void M(View view) {
                ChatActivity.aW(SupportView.this.and);
            }
        };
        this.dGs = new b() {
            public void M(View view) {
                SupportView.this.setMode(Mode.NEW_MESSAGE);
                EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "support_create-dialog"));
            }
        };
        this.dGt = new b() {
            public void M(View view) {
                SupportView supportView = SupportView.this;
                supportView.a(((SupportSubject) supportView.dGb.get(SupportView.this.dGi.getSelection())).name, null, SupportView.this.dGh.getText().toString());
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "support-new-dialog_send").build());
            }
        };
        this.and = fragmentActivity;
        LayoutInflater.from(getContext()).inflate(R.layout.support_view, this, true);
        atz();
        setMode(Mode.OVERVIEW);
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Support page");
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get("&cid"))).build());
    }

    private void v(final Long l) {
        Lf();
        HashMap hashMap = new HashMap();
        if (l != null) {
            hashMap.put("pid", l);
        }
        hashMap.put("l", Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT));
        hashMap.put("p", Integer.valueOf(0));
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/ticket/list";
        stringBuilder.append(Vb);
        new a(RequestManager.b(stringBuilder.toString(), hashMap, getContext()), new com.iqoption.mobbtech.connect.a.a() {
            /* renamed from: a */
            public void onSuccess(g gVar) {
                SupportView.this.aNZ();
                try {
                    SupportView.this.dGb.clear();
                    JSONObject jSONObject = gVar.aPR().getJSONObject("result");
                    JSONArray jSONArray = jSONObject.getJSONArray("subjects");
                    int i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        SupportView.this.dGb.add(new SupportSubject(jSONArray.getJSONObject(i2)));
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(SupportView.this.and, R.layout.dark_string_item, R.id.name, SupportView.this.dGb);
                    SupportView.this.dGi.setAdapter(arrayAdapter);
                    if (!arrayAdapter.isEmpty()) {
                        SupportView.this.dGi.setSelection(0);
                    }
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray2 = jSONObject.getJSONArray("tickets");
                    while (i < jSONArray2.length()) {
                        arrayList.add(new SupportMessage(jSONArray2.getJSONObject(i)));
                        i++;
                    }
                    Collections.sort(arrayList, new Comparator<SupportMessage>() {
                        /* renamed from: a */
                        public int compare(SupportMessage supportMessage, SupportMessage supportMessage2) {
                            return supportMessage.created.compareTo(supportMessage2.created);
                        }
                    });
                    if (l == null) {
                        SupportView.this.dGm.r(arrayList);
                        SupportView.this.dGm.notifyDataSetChanged();
                        return;
                    }
                    SupportView.this.dGn.r(arrayList);
                    SupportView.this.dGn.notifyDataSetChanged();
                } catch (JSONException unused) {
                }
            }

            public void a(f fVar) {
                SupportView.this.aNZ();
            }
        }, Vb).aPG();
    }

    private void atz() {
        findViewById(R.id.backButton).setOnClickListener(new -$$Lambda$SupportView$ZsgIX-o6ncQj9uyAHoCA-hNr4V0(this));
        this.bYs = (ProgressBar) findViewById(R.id.progress);
        this.dGd = (Button) findViewById(R.id.newMessage);
        this.dGe = (ListView) findViewById(R.id.overviewListView);
        this.dGf = (TextView) findViewById(R.id.overviewEmptyText);
        this.dGe.setEmptyView(this.dGf);
        this.dGe.setOnItemClickListener(new -$$Lambda$SupportView$F-oSwBiYj_ZKI4OL8LNHPea8qGU(this));
        this.dGm = new k(this.and, null);
        this.dGe.setAdapter(this.dGm);
        this.dGg = findViewById(R.id.newMessageLayout);
        this.dGh = (EditText) findViewById(R.id.newMessageEdit);
        this.dGh.setHorizontallyScrolling(false);
        this.dGh.setMaxLines(100);
        this.dGh.setOnClickListener(-$$Lambda$SupportView$O1esa_cZCO9RERGxpsFpvC-hUGU.INSTANCE);
        this.dGi = (AwesomeTextSpinner) findViewById(R.id.subjectSpinner);
        this.dGi.setItemSelectedListener(new AwesomeTextSpinner.a() {
            public void gm(int i) {
                EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "support-new-dialog_change-subject").setValue(Double.valueOf((double) ((SupportSubject) SupportView.this.dGb.get(i)).id)).build());
            }
        });
        this.dGj = findViewById(R.id.chatLayout);
        this.dGk = (ListView) findViewById(R.id.chatListView);
        this.dGn = new j(this.and, null);
        this.dGk.setAdapter(this.dGn);
        this.dGl = (EditText) findViewById(R.id.chatMessageEdit);
        this.dGl.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EventManager.BS().a(Event.Builder(Event.CATEGORY_TEXT_CHANGED, "support-old-dialog_new-message").build());
            }
        });
        this.dGl.setEnabled(false);
        this.dGc = (Button) findViewById(R.id.sendMessage);
        this.dGc.setText(R.string.go_to_chats);
        this.dGc.setOnClickListener(this.dGr);
    }

    private /* synthetic */ void bM(View view) {
        this.and.onBackPressed();
    }

    public boolean onBackPressed() {
        if (this.dGo != Mode.CHAT && this.dGo != Mode.NEW_MESSAGE) {
            return false;
        }
        setMode(Mode.OVERVIEW);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void setMode(Mode mode) {
        this.dGo = mode;
        int i = AnonymousClass9.dGx[mode.ordinal()];
        if (i == 1) {
            v(null);
            this.dGe.setVisibility(0);
            this.dGg.setVisibility(4);
            this.dGj.setVisibility(4);
            this.dGd.setVisibility(0);
            this.dGd.setText(R.string.go_to_chats);
            this.dGd.setOnClickListener(this.dGr);
        } else if (i == 2) {
            this.dGe.setVisibility(4);
            this.dGg.setVisibility(0);
            this.dGj.setVisibility(4);
            this.dGd.setVisibility(0);
            this.dGd.setText(R.string.send);
            this.dGd.setOnClickListener(this.dGt);
        } else if (i == 3) {
            this.dGe.setVisibility(4);
            this.dGg.setVisibility(4);
            this.dGj.setVisibility(0);
            this.dGd.setVisibility(4);
            this.dGd.setOnClickListener(null);
            v(Long.valueOf(this.dGp));
        }
    }

    private void a(String str, final Long l, String str2) {
        if (!str2.isEmpty()) {
            Lf();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("subject", str);
            }
            if (l != null) {
                hashMap.put("pid", l);
            }
            hashMap.put("question", str2);
            str = IQApp.Ev().Vb();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str = "api/ticket/send";
            stringBuilder.append(str);
            new a(RequestManager.b(stringBuilder.toString(), hashMap, getContext()), new com.iqoption.mobbtech.connect.a.a() {
                /* renamed from: a */
                public void onSuccess(g gVar) {
                    SupportView.this.aNZ();
                    Long l = l;
                    if (l == null) {
                        SupportView.this.setMode(Mode.OVERVIEW);
                    } else {
                        SupportView.this.v(l);
                    }
                    String str = "";
                    SupportView.this.dGl.setText(str);
                    SupportView.this.dGh.setText(str);
                    SupportView.this.dGk.smoothScrollToPosition(SupportView.this.dGk.getCount() - 1);
                    com.iqoption.app.a.b.b(SupportView.this.getResources().getString(R.string.ticket_created), SupportView.this.getContext());
                }

                public void a(f fVar) {
                    SupportView.this.aNZ();
                    try {
                        com.iqoption.app.a.b.b(fVar.aPP().getString("message"), SupportView.this.and);
                    } catch (Exception unused) {
                        com.iqoption.app.a.b.aQ(SupportView.this.and);
                    }
                }
            }, str).aPG();
        }
    }

    public void b(long j, int i) {
        this.dGn.b(j, i);
        this.dGn.notifyDataSetChanged();
    }

    public void Lf() {
        this.dGc.setEnabled(false);
        this.dGd.setEnabled(false);
        this.dGf.setVisibility(8);
        this.bYs.setVisibility(0);
    }

    public void aNZ() {
        this.dGc.setEnabled(true);
        this.dGd.setEnabled(true);
        this.dGf.setVisibility(0);
        this.bYs.setVisibility(8);
    }
}
