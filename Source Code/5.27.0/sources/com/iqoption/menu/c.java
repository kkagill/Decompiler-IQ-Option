package com.iqoption.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.IQApp;
import com.iqoption.core.analytics.d;
import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.rx.i;
import com.iqoption.core.ui.widget.d.a.b;
import com.iqoption.e.tz;
import com.iqoption.kyc.e;
import com.iqoption.kyc.q;
import com.iqoption.kyc.r;
import com.iqoption.verify.VerifyCardsActivity;
import com.iqoption.view.SelectionButton;
import com.iqoption.view.f;
import com.iqoption.view.spinner.AwesomeTextSpinner;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: PersonalInfoView */
public class c extends FrameLayout {
    private static final String TAG = "com.iqoption.menu.c";
    protected ViewPager Ol;
    @NonNull
    private d aZI;
    protected Gender arO;
    private com.iqoption.core.analytics.c bIW;
    protected TradeRoomActivity cHp;
    protected List<com.iqoption.core.microservices.configuration.a.c> countries;
    protected ImageView cpE;
    protected ImageView cpI;
    protected EditText cpJ;
    protected AwesomeTextSpinner cpK;
    protected EditText cpO;
    private TextView cpl;
    private LinearLayout cpm;
    private ImageView cpn;
    protected TextView cpx;
    protected AwesomeTextSpinner cpz;
    protected View dFA;
    private List<a> dFB;
    private tz dFC;
    protected EditText dFD;
    protected EditText dFE;
    protected ArrayAdapter dFF;
    protected ArrayAdapter dFG;
    protected EditText dFH;
    protected EditText dFI;
    protected View dFJ;
    protected View dFK;
    private final b dFL;
    protected EditText dFM;
    protected EditText dFN;
    protected EditText dFO;
    protected EditText dFP;
    protected View dFQ;
    protected EditText dFR;
    protected EditText dFS;
    protected EditText dFT;
    protected View dFU;
    protected View dFV;
    private View dFW;
    private View dFX;
    private View dFY;
    private a dFZ;
    protected SelectionButton dFu;
    protected SelectionButton dFv;
    protected SelectionButton dFw;
    protected View dFx;
    protected SelectionButton dFy;
    protected View dFz;

    /* compiled from: PersonalInfoView */
    public interface a {
        void axY();
    }

    public c(TradeRoomActivity tradeRoomActivity) {
        this(tradeRoomActivity, null);
    }

    public c(TradeRoomActivity tradeRoomActivity, AttributeSet attributeSet) {
        this(tradeRoomActivity, attributeSet, 0);
    }

    public c(TradeRoomActivity tradeRoomActivity, AttributeSet attributeSet, int i) {
        super(tradeRoomActivity, attributeSet, i);
        this.countries = new ArrayList();
        this.dFL = new b();
        this.cHp = tradeRoomActivity;
        this.aZI = IQApp.Eu().EC();
        this.bIW = this.aZI.dm("personal-data_show");
        LayoutInflater.from(getContext()).inflate(R.layout.personal_info_dialog, this, true);
        atz();
        aNU();
        getCountries();
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Personal data");
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get("&cid"))).build());
    }

    /* Access modifiers changed, original: protected */
    public void atz() {
        com.iqoption.app.b aK = com.iqoption.app.b.aK(getContext());
        this.dFY = findViewById(R.id.savePersonalInfo);
        this.dFY.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.Ol.getCurrentItem() == 0) {
                    c.this.aNV();
                } else if (c.this.Ol.getCurrentItem() == 1) {
                    c.this.aNY();
                } else if (c.this.Ol.getCurrentItem() == 2) {
                    c.this.cHp.onBackPressed();
                }
            }
        });
        aNQ();
        TextView textView = (TextView) findViewById(R.id.personalId);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getContext().getString(R.string.personal_cabinet));
        stringBuilder.append(" ");
        stringBuilder.append(aK.getUserId());
        textView.setText(stringBuilder.toString());
        this.Ol = (ViewPager) findViewById(R.id.personalViewPager);
        this.Ol.setOnPageChangeListener(new OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                c.this.setActiveTab(i);
            }
        });
        this.dFJ = findViewById(R.id.iconAlertDocs);
        this.dFu = (SelectionButton) findViewById(R.id.infoTab);
        this.dFv = (SelectionButton) findViewById(R.id.passTab);
        this.dFw = (SelectionButton) findViewById(R.id.docsTab);
        this.dFx = findViewById(R.id.docTabContainer);
        this.dFy = (SelectionButton) findViewById(R.id.cardsTab);
        this.dFz = findViewById(R.id.cardsTabContainer);
        this.dFA = findViewById(R.id.iconAlertCards);
        this.dFB = new ArrayList();
        this.dFB.add(new a(this.dFu, true));
        this.dFB.add(new a(this.dFv, true));
        this.dFB.add(new a(this.dFw, true));
        this.dFB.add(new a(this.dFy, true));
        this.dFx.setVisibility(8);
        g(this.dFw, false);
        if (com.iqoption.core.d.EH().ej("jumio-card-verification")) {
            this.dFz.setVisibility(0);
        } else {
            this.dFz.setVisibility(8);
            g(this.dFy, false);
        }
        b.bj(this.dFB);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getInfoPage());
        arrayList.add(getPassPage());
        this.Ol.setAdapter(new f(arrayList));
        this.dFu.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.Ol.setCurrentItem(0, true);
                c.this.aZI.di("personal-data_info");
            }
        });
        this.dFv.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.Ol.setCurrentItem(1, true);
                c.this.aZI.di("personal-data_password");
            }
        });
        this.dFw.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.cHp != null) {
                    e eVar = new e();
                    eVar.aIK();
                    eVar.bA(c.this.cHp);
                    c.this.aZI.di("personal-data_documents");
                }
            }
        });
        this.dFy.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.cHp != null) {
                    VerifyCardsActivity.bA(c.this.cHp);
                    c.this.aZI.di("personal-data_cards");
                }
            }
        });
        findViewById(R.id.backButton).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.cHp.onBackPressed();
            }
        });
        aNX();
        setActiveTab(0);
        this.dFW = findViewById(R.id.kycStatusLayout);
        this.cpm = (LinearLayout) findViewById(R.id.kycStatus);
        this.cpn = (ImageView) findViewById(R.id.kycStatusIcon);
        this.cpl = (TextView) findViewById(R.id.kycDocumentStatus);
        this.dFX = findViewById(R.id.kycButton);
        this.dFX.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.cHp != null) {
                    com.iqoption.app.b aK = com.iqoption.app.b.aK(c.this.getContext());
                    if (aK.asd == 2 || aK.asl) {
                        e eVar = new e();
                        eVar.aIK();
                        eVar.iE(com.iqoption.kyc.fragment.b.e.TAG);
                        eVar.bA(c.this.cHp);
                        return;
                    }
                    new e().bA(c.this.cHp);
                }
            }
        });
        aNR();
    }

    private void aNQ() {
        ((TextView) findViewById(R.id.personalName)).setText(com.iqoption.app.b.DG().Ep());
    }

    private boolean g(@NonNull View view, boolean z) {
        for (a aVar : this.dFB) {
            if (view.getId() == aVar.getView().getId()) {
                if (aVar.aNP() != z) {
                    aVar.setVisible(z);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void onBackPressed() {
        this.aZI.di("personal-data_back");
        this.bIW.Cc();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    private void aNR() {
        /*
        r5 = this;
        r0 = r5.cpm;
        r0 = r0.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r1 = r5.dFx;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0013;
    L_0x0010:
        r1 = 1091567616; // 0x41100000 float:9.0 double:5.39306059E-315;
        goto L_0x0015;
    L_0x0013:
        r1 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
    L_0x0015:
        r0.weight = r1;
        r0 = r5.getContext();
        r0 = com.iqoption.app.b.aK(r0);
        r1 = r0.ase;
        r1 = r1.getValue();
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r0 = r0.asd;
        r2 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        if (r0 == r2) goto L_0x0039;
    L_0x0033:
        r4 = 2;
        if (r0 == r4) goto L_0x0039;
    L_0x0036:
        r1 = 3;
    L_0x0037:
        r2 = 0;
        goto L_0x005d;
    L_0x0039:
        r0 = -1;
        if (r1 == r0) goto L_0x0037;
    L_0x003c:
        r0 = r5.getResources();
        r1 = 2131100174; // 0x7f06020e float:1.7812722E38 double:1.052903384E-314;
        r4 = 0;
        r0 = androidx.core.content.res.ResourcesCompat.getColor(r0, r1, r4);
        r1 = r5.cpn;
        r4 = 2131231696; // 0x7f0803d0 float:1.807948E38 double:1.0529683643E-314;
        r1.setImageResource(r4);
        r1 = r5.cpl;
        r4 = 2131887290; // 0x7f1204ba float:1.9409183E38 double:1.053292271E-314;
        r1.setText(r4);
        r1 = r5.cpl;
        r1.setTextColor(r0);
    L_0x005d:
        r0 = 8;
        if (r2 == 0) goto L_0x006e;
    L_0x0061:
        r1 = r5.dFW;
        r1.setVisibility(r3);
        r1 = r5.dFC;
        r1 = r1.cpQ;
        r1.setVisibility(r0);
        goto L_0x0086;
    L_0x006e:
        r1 = r5.dFW;
        r1.setVisibility(r0);
        r0 = r5.dFC;
        r0 = r0.cpQ;
        r0.setVisibility(r3);
        r0 = r5.dFC;
        r0 = r0.cpQ;
        r1 = new com.iqoption.menu.c$13;
        r1.<init>();
        r0.setOnClickListener(r1);
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.menu.c.aNR():void");
    }

    /* Access modifiers changed, original: protected */
    public void setActiveTab(int i) {
        if (i == 0) {
            this.dFu.setSelected(true);
            this.dFv.setSelected(false);
            this.dFw.setSelected(false);
            axX();
        } else if (i == 1) {
            this.dFu.setSelected(false);
            this.dFv.setSelected(true);
            this.dFw.setSelected(false);
            this.dFY.setVisibility(0);
        } else if (i == 2) {
            this.dFu.setSelected(false);
            this.dFv.setSelected(false);
            this.dFw.setSelected(true);
            this.dFY.setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected */
    public void aNS() {
        this.arO = Gender.MALE;
        this.cpI.setImageResource(R.drawable.radio_button_on);
        this.cpE.setImageResource(R.drawable.radio_button_off);
    }

    /* Access modifiers changed, original: protected */
    public void aNT() {
        this.arO = Gender.FEMALE;
        this.cpI.setImageResource(R.drawable.radio_button_off);
        this.cpE.setImageResource(R.drawable.radio_button_on);
    }

    /* Access modifiers changed, original: protected */
    public void aNU() {
        com.iqoption.app.b aK = com.iqoption.app.b.aK(getContext());
        this.cpJ.setText(aK.getFirstName());
        this.cpO.setText(aK.getLastName());
        this.dFD.setText(aK.getEmail());
        this.dFD.setEnabled(false);
        this.dFE.setText(aK.DZ());
        this.dFH.setText(aK.getCountryCode());
        this.dFI.setText(aK.getPhone());
        this.dFM.setText(com.iqoption.core.microservices.kyc.c.bur.aes().format(Long.valueOf(aK.DU() * 1000)));
        this.dFN.setText(aK.getCity());
        this.dFO.setText(aK.DW());
        this.dFP.setText(aK.getAddress());
        if (aK.DT() == null || aK.DT() != Gender.MALE) {
            aNT();
        } else {
            aNS();
        }
    }

    /* Access modifiers changed, original: protected */
    @SuppressLint({"CheckResult"})
    public void aNV() {
        String obj = this.cpJ.getText().toString();
        String obj2 = this.cpO.getText().toString();
        String obj3 = (this.dFE.isEnabled() && this.dFE.getVisibility() == 0) ? this.dFE.getText().toString() : null;
        String str = obj3;
        String obj4 = this.dFH.getText().toString();
        String obj5 = this.dFI.getText().toString();
        if (this.countries.isEmpty()) {
            obj3 = com.iqoption.app.b.DG().DX();
        } else {
            obj3 = ((com.iqoption.core.microservices.configuration.a.c) this.countries.get(this.cpK.getSelection())).getName();
        }
        String str2 = obj3;
        String obj6 = this.dFN.getText().toString();
        String obj7 = this.dFO.getText().toString();
        String obj8 = this.dFP.getText().toString();
        com.iqoption.core.microservices.kyc.response.b WW = com.iqoption.core.data.repository.d.bdF.WW();
        Context context = getContext();
        r rVar = r.dth;
        Context context2;
        if (TextUtils.isEmpty(obj) || !(WW == null || rVar.g(obj, WW.getFirstName(), false))) {
            context2 = context;
            com.iqoption.app.a.b.b(context2.getString(R.string.please_enter_your_name), context2);
        } else if (TextUtils.isEmpty(obj2) || !(WW == null || rVar.g(obj2, WW.getLastName(), false))) {
            context2 = context;
            com.iqoption.app.a.b.b(context2.getString(R.string.please_enter_your_surname), context2);
        } else if (TextUtils.isEmpty(obj4)) {
            com.iqoption.app.a.b.b(context.getString(R.string.please_enter_your_country_code), context);
        } else if (TextUtils.isEmpty(obj5)) {
            com.iqoption.app.a.b.b(context.getString(R.string.please_enter_your_phone_number), context);
        } else {
            String b = q.b(this.dFL);
            if (b != null) {
                com.iqoption.app.a.b.b(b, context);
                return;
            }
            b = q.a(this.dFL);
            long longValue = !this.countries.isEmpty() ? ((com.iqoption.core.microservices.configuration.a.c) this.countries.get(this.cpz.getSelection())).getId().longValue() : -1;
            if (longValue == -1 || longValue == 0) {
                context2 = context;
                com.iqoption.app.a.b.b(context2.getString(R.string.please_enter_your_country), context2);
            } else if (TextUtils.isEmpty(str2)) {
                com.iqoption.app.a.b.b(context.getString(R.string.please_enter_your_n1, new Object[]{context.getString(R.string.citizenship)}).toLowerCase(), context);
            } else if (TextUtils.isEmpty(obj6) || !(WW == null || rVar.g(obj6, WW.getCity(), false))) {
                context2 = context;
                com.iqoption.app.a.b.b(context2.getString(R.string.please_enter_your_n1, new Object[]{context2.getString(R.string.city)}).toLowerCase(), context2);
            } else if (TextUtils.isEmpty(obj8) || !(WW == null || rVar.g(obj8, WW.getAddress(), false))) {
                context2 = context;
                com.iqoption.app.a.b.b(context2.getString(R.string.please_enter_your_n1, new Object[]{context2.getString(R.string.address).toLowerCase()}), context2);
            } else if (TextUtils.isEmpty(obj7) || (WW != null && rVar.g(obj7, WW.DY(), false))) {
                boolean z = this.arO == Gender.MALE;
                boolean z2 = (ObjectsCompat.equals(com.iqoption.app.b.DG().getCountryCode(), obj4) && ObjectsCompat.equals(com.iqoption.app.b.DG().getPhone(), obj5)) ? false : true;
                context2 = context;
                com.iqoption.mobbtech.connect.request.e.a(obj, obj2, b, str2, obj6, obj7, obj8, z, longValue, str, obj4, obj5, z2).h(i.aki()).g(i.akj()).a(new -$$Lambda$c$bG55L6kxwzqzrEfTCRkan-85hkk(this, context2), new -$$Lambda$c$xL0ZCa1UQIPlR43uEUbpMiLE_ao(context2));
            } else {
                com.iqoption.app.a.b.b(context.getString(R.string.please_enter_your_n1, new Object[]{context.getString(R.string.zip).toLowerCase()}), context);
            }
        }
    }

    private /* synthetic */ void a(Context context, Pair pair) {
        com.iqoption.core.microservices.kyc.response.d dVar = (com.iqoption.core.microservices.kyc.response.d) pair.bnk();
        String message = dVar != null ? dVar.getMessage() : null;
        if (TextUtils.isEmpty(message)) {
            message = context.getString(R.string.your_personal_data_has_been_successfully_changed);
        }
        com.iqoption.app.a.b.b(message, context);
        axX();
        aNQ();
    }

    private static /* synthetic */ void b(Context context, Throwable th) {
        String K = com.iqoption.service.websocket.a.K(th);
        if (TextUtils.isEmpty(K)) {
            com.iqoption.app.a.b.aQ(context);
        } else {
            com.iqoption.app.a.b.b(K, context);
        }
    }

    /* Access modifiers changed, original: protected */
    public void getCountries() {
        new com.iqoption.mobbtech.connect.request.c().a(new -$$Lambda$c$v42gQ-LcpqaFN99_3JpAzeYRGNc(this));
    }

    private /* synthetic */ void bk(List list) {
        this.countries.clear();
        this.countries.addAll(list);
        this.dFF.notifyDataSetChanged();
        this.dFG.notifyDataSetChanged();
        long El = com.iqoption.app.b.aK(getContext()).El();
        String DX = com.iqoption.app.b.aK(getContext()).DX();
        for (int i = 0; i < list.size(); i++) {
            if (((com.iqoption.core.microservices.configuration.a.c) list.get(i)).getId().longValue() == El) {
                this.cpz.setSelection(i, true);
            }
            if (((com.iqoption.core.microservices.configuration.a.c) list.get(i)).getName().equalsIgnoreCase(DX)) {
                this.cpK.setSelection(i, true);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public View getPassPage() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.personal_pass_page, null);
        this.dFR = (EditText) inflate.findViewById(R.id.currentPassword);
        this.dFS = (EditText) inflate.findViewById(R.id.confirmPassword1);
        this.dFT = (EditText) inflate.findViewById(R.id.confirmPassword2);
        return inflate;
    }

    /* Access modifiers changed, original: protected */
    public View getInfoPage() {
        this.dFC = (tz) com.iqoption.core.ext.a.a((ViewGroup) this, (int) R.layout.personal_info_page, (ViewGroup) this, false);
        View root = this.dFC.getRoot();
        this.cpJ = (EditText) root.findViewById(R.id.nameEdit);
        this.cpO = (EditText) root.findViewById(R.id.surnameEdit);
        this.dFD = (EditText) root.findViewById(R.id.personalEmail);
        this.dFE = (EditText) root.findViewById(R.id.tin);
        this.dFH = (EditText) root.findViewById(R.id.countryCode);
        this.dFI = (EditText) root.findViewById(R.id.phone);
        this.dFK = root.findViewById(R.id.iconAlertConfirm);
        this.cpx = (TextView) root.findViewById(R.id.confirmLink);
        this.cpx.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.cHp != null) {
                    e eVar = new e();
                    eVar.e(KycStepType.PHONE);
                    eVar.c(KycVerificationContext.BILLING_CASHBOX);
                    eVar.bA(c.this.cHp);
                }
            }
        });
        this.dFM = (EditText) root.findViewById(R.id.birthDay);
        this.dFM.addTextChangedListener(this.dFL);
        this.dFN = (EditText) root.findViewById(R.id.city);
        this.dFQ = root.findViewById(R.id.genderLayout);
        this.dFO = (EditText) root.findViewById(R.id.zip);
        this.dFP = (EditText) root.findViewById(R.id.address);
        this.dFP.setHorizontallyScrolling(false);
        this.dFP.setMaxLines(100);
        this.cpz = (AwesomeTextSpinner) root.findViewById(R.id.countrySpinner);
        Context context = getContext();
        this.dFF = new ArrayAdapter(context, R.layout.dark_string_item, R.id.name, this.countries);
        this.cpz.setAdapter(this.dFF);
        this.cpz.setItemSelectedListener(new com.iqoption.view.spinner.AwesomeTextSpinner.a() {
            public void gm(int i) {
                i = ((com.iqoption.core.microservices.configuration.a.c) c.this.countries.get(i)).acM();
                if (i > 0 && TextUtils.isEmpty(c.this.dFH.getText())) {
                    EditText editText = c.this.dFH;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append("");
                    editText.setText(stringBuilder.toString());
                }
            }
        });
        this.cpK = (AwesomeTextSpinner) root.findViewById(R.id.nationalitySpinner);
        this.dFG = new ArrayAdapter(context, R.layout.dark_string_item, R.id.name, this.countries);
        this.cpK.setAdapter(this.dFG);
        this.cpI = (ImageView) root.findViewById(R.id.maleCheck);
        this.cpE = (ImageView) root.findViewById(R.id.femaleCheck);
        this.dFU = root.findViewById(R.id.male);
        this.dFV = root.findViewById(R.id.female);
        this.dFU.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.aNS();
            }
        });
        this.dFV.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.aNT();
            }
        });
        this.dFE.setVisibility(8);
        aNW();
        axX();
        if (com.iqoption.gdpr.a.bz(context)) {
            this.dFC.cpC.setVisibility(0);
            this.dFC.cpA.setOnClickListener(new -$$Lambda$c$ArUb1fE71EVVjrPAXY__ocOmFqU(this));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getString(R.string.deletion_of_account_hint1));
            String str = "\n\n";
            stringBuilder.append(str);
            stringBuilder.append(context.getString(R.string.deletion_of_account_hint2));
            stringBuilder.append(str);
            stringBuilder.append(context.getString(R.string.deletion_of_account_hint3));
            this.dFC.cpB.setText(stringBuilder);
        } else {
            this.dFC.cpC.setVisibility(8);
        }
        return root;
    }

    private /* synthetic */ void bK(View view) {
        a aVar = this.dFZ;
        if (aVar != null) {
            aVar.axY();
            this.aZI.di("personal-data_delete-account");
        }
    }

    public void axX() {
        com.iqoption.app.b aK = com.iqoption.app.b.aK(getContext());
        boolean z = false;
        if (aK.asl) {
            this.cpJ.setEnabled(false);
            this.cpO.setEnabled(false);
            this.dFD.setEnabled(false);
            this.dFE.setEnabled(false);
            this.dFM.setEnabled(false);
            this.cpK.setEnabled(false);
            this.dFN.setEnabled(false);
            this.dFO.setEnabled(false);
            this.dFP.setEnabled(false);
            this.cpI.setEnabled(false);
            this.cpE.setEnabled(false);
            this.dFQ.setEnabled(false);
            this.dFU.setEnabled(false);
            this.dFV.setEnabled(false);
            this.dFY.setVisibility(8);
        }
        if (!TextUtils.isEmpty(com.iqoption.app.b.DG().DZ())) {
            this.dFE.setEnabled(false);
        }
        if (aK.Eo() || !TextUtils.isEmpty(aK.getPhone())) {
            this.dFI.setEnabled(false);
            this.dFH.setEnabled(false);
        }
        AwesomeTextSpinner awesomeTextSpinner = this.cpz;
        if (!aK.asl && com.iqoption.kyc.c.aIF()) {
            z = true;
        }
        awesomeTextSpinner.setEnabled(z);
    }

    public void aNW() {
        if (com.iqoption.app.b.aK(getContext()).Eo()) {
            this.cpx.setVisibility(8);
            this.dFK.setVisibility(8);
            return;
        }
        this.cpx.setVisibility(0);
        this.dFK.setVisibility(0);
        TextView textView = this.cpx;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<u>");
        stringBuilder.append(this.cHp.getString(R.string.confirm));
        stringBuilder.append("</u>");
        textView.setText(Html.fromHtml(stringBuilder.toString()));
    }

    public void aNX() {
        com.iqoption.app.b aK = com.iqoption.app.b.aK(getContext());
        if (!aK.asn || aK.asj) {
            this.dFJ.setVisibility(0);
        } else {
            this.dFJ.setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected */
    public void aNY() {
        String obj = this.dFS.getText().toString();
        String obj2 = this.dFT.getText().toString();
        if (obj.isEmpty() || !obj.equals(obj2)) {
            com.iqoption.app.a.b.b(getContext().getString(R.string.passwords_not_match), getContext());
            return;
        }
        new com.iqoption.mobbtech.connect.request.b().b(getContext(), this.dFR.getText().toString(), obj, obj2);
    }

    public void setCardVerificationFailed(boolean z) {
        this.dFA.setVisibility(z ? 0 : 8);
    }

    public void setCallback(a aVar) {
        this.dFZ = aVar;
    }
}
