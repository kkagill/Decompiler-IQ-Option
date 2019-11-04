package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jumio.gui.Drawables;
import io.card.payment.a.a;
import io.card.payment.a.c;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.b;

public final class DataEntryActivity extends Activity implements TextWatcher {
    private static final String TAG = "DataEntryActivity";
    private boolean eJW;
    private EditText eKA;
    private n eKB;
    private EditText eKC;
    private n eKD;
    private EditText eKE;
    private n eKF;
    private EditText eKG;
    private n eKH;
    private EditText eKI;
    private n eKJ;
    private ImageView eKK;
    private Button eKL;
    private Button eKM;
    private CreditCard eKN;
    private boolean eKO;
    private String eKP;
    private int eKQ;
    private int eKx = 1;
    private int eKy = 100;
    private TextView eKz;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            onBackPressed();
            return;
        }
        LinearLayout linearLayout;
        RelativeLayout relativeLayout;
        String str;
        String str2;
        int i;
        LinearLayout linearLayout2;
        LayoutParams layoutParams;
        TextView textView;
        int i2;
        this.eJW = getIntent().getBooleanExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, false);
        a.b(this, this.eJW);
        this.eKQ = new TextView(this).getTextColors().getDefaultColor();
        this.eKP = a.biR() ? "12dip" : "2dip";
        b.x(getIntent());
        String str3 = "4dip";
        int d = c.d(str3, this);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        if (!this.eJW) {
            relativeLayout2.setBackgroundColor(io.card.payment.a.b.eLI);
        }
        ScrollView scrollView = new ScrollView(this);
        int i3 = this.eKx;
        this.eKx = i3 + 1;
        scrollView.setId(i3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        relativeLayout2.addView(scrollView, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        scrollView.addView(linearLayout3, -1, -1);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        LayoutParams layoutParams3 = new LayoutParams(-1, -1);
        this.eKN = (CreditCard) getIntent().getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
        this.eKO = getIntent().getBooleanExtra("debug_autoAcceptResult", false);
        CreditCard creditCard = this.eKN;
        String str4 = "8dip";
        if (creditCard != null) {
            this.eKB = new b(creditCard.cardNumber);
            this.eKK = new ImageView(this);
            LayoutParams layoutParams4 = new LayoutParams(-1, -2);
            this.eKK.setPadding(0, 0, 0, d);
            layoutParams4.weight = 1.0f;
            this.eKK.setImageBitmap(CardIOActivity.eKa);
            linearLayout4.addView(this.eKK, layoutParams4);
            c.b(this.eKK, null, null, null, str4);
        } else {
            this.eKz = new TextView(this);
            this.eKz.setTextSize(24.0f);
            if (!this.eJW) {
                this.eKz.setTextColor(io.card.payment.a.b.eLE);
            }
            linearLayout4.addView(this.eKz);
            c.a(this.eKz, null, null, null, str4);
            c.j(this.eKz, -2, -2);
            linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            c.a(linearLayout, null, str3, null, str3);
            TextView textView2 = new TextView(this);
            c.a(textView2, this.eKP, null, null, null);
            textView2.setText(b.a(StringKey.ENTRY_CARD_NUMBER));
            if (!this.eJW) {
                textView2.setTextColor(io.card.payment.a.b.eLT);
            }
            linearLayout.addView(textView2, -2, -2);
            this.eKA = new EditText(this);
            EditText editText = this.eKA;
            int i4 = this.eKy;
            this.eKy = i4 + 1;
            editText.setId(i4);
            this.eKA.setMaxLines(1);
            this.eKA.setImeOptions(6);
            this.eKA.setTextAppearance(getApplicationContext(), 16842816);
            this.eKA.setInputType(3);
            this.eKA.setHint("1234 5678 1234 5678");
            if (!this.eJW) {
                this.eKA.setHintTextColor(Drawables.DEFAULT_LIST_ROW_COLOR_PRESSED);
            }
            this.eKB = new b();
            this.eKA.addTextChangedListener(this.eKB);
            this.eKA.addTextChangedListener(this);
            this.eKA.setFilters(new InputFilter[]{new DigitsKeyListener(), this.eKB});
            linearLayout.addView(this.eKA, -1, -2);
            linearLayout4.addView(linearLayout, -1, -1);
        }
        linearLayout = new LinearLayout(this);
        LayoutParams layoutParams5 = new LayoutParams(-1, -2);
        c.a(linearLayout, null, str3, null, str3);
        linearLayout.setOrientation(0);
        boolean booleanExtra = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, false);
        boolean booleanExtra2 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CVV, false);
        boolean booleanExtra3 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false);
        if (booleanExtra) {
            LinearLayout linearLayout5 = new LinearLayout(this);
            relativeLayout = relativeLayout2;
            str = str3;
            str2 = str4;
            LayoutParams layoutParams6 = new LayoutParams(0, -1, 1.0f);
            linearLayout5.setOrientation(1);
            TextView textView3 = new TextView(this);
            if (!this.eJW) {
                textView3.setTextColor(io.card.payment.a.b.eLT);
            }
            textView3.setText(b.a(StringKey.ENTRY_EXPIRES));
            c.a(textView3, this.eKP, null, null, null);
            linearLayout5.addView(textView3, -2, -2);
            this.eKC = new EditText(this);
            EditText editText2 = this.eKC;
            i = this.eKy;
            this.eKy = i + 1;
            editText2.setId(i);
            this.eKC.setMaxLines(1);
            this.eKC.setImeOptions(6);
            this.eKC.setTextAppearance(getApplicationContext(), 16842816);
            this.eKC.setInputType(3);
            this.eKC.setHint(b.a(StringKey.EXPIRES_PLACEHOLDER));
            if (!this.eJW) {
                this.eKC.setHintTextColor(Drawables.DEFAULT_LIST_ROW_COLOR_PRESSED);
            }
            CreditCard creditCard2 = this.eKN;
            if (creditCard2 != null) {
                this.eKD = new d(creditCard2.expiryMonth, this.eKN.expiryYear);
            } else {
                this.eKD = new d();
            }
            if (this.eKD.apr()) {
                this.eKC.setText(this.eKD.getValue());
            }
            this.eKC.addTextChangedListener(this.eKD);
            this.eKC.addTextChangedListener(this);
            this.eKC.setFilters(new InputFilter[]{new DateKeyListener(), this.eKD});
            linearLayout5.addView(this.eKC, -1, -2);
            linearLayout.addView(linearLayout5, layoutParams6);
            str3 = (booleanExtra2 || booleanExtra3) ? str : null;
            c.b(linearLayout5, null, null, str3, null);
        } else {
            str = str3;
            relativeLayout = relativeLayout2;
            str2 = str4;
            this.eKD = new a();
        }
        if (booleanExtra2) {
            linearLayout2 = new LinearLayout(this);
            layoutParams = new LayoutParams(0, -1, 1.0f);
            linearLayout2.setOrientation(1);
            textView = new TextView(this);
            if (!this.eJW) {
                textView.setTextColor(io.card.payment.a.b.eLT);
            }
            c.a(textView, this.eKP, null, null, null);
            textView.setText(b.a(StringKey.ENTRY_CVV));
            linearLayout2.addView(textView, -2, -2);
            this.eKE = new EditText(this);
            EditText editText3 = this.eKE;
            i2 = this.eKy;
            this.eKy = i2 + 1;
            editText3.setId(i2);
            this.eKE.setMaxLines(1);
            this.eKE.setImeOptions(6);
            this.eKE.setTextAppearance(getApplicationContext(), 16842816);
            this.eKE.setInputType(3);
            this.eKE.setHint("123");
            if (!this.eJW) {
                this.eKE.setHintTextColor(Drawables.DEFAULT_LIST_ROW_COLOR_PRESSED);
            }
            int i5 = 4;
            if (this.eKN != null) {
                i5 = CardType.fromCardNumber(this.eKB.getValue()).cvvLength();
            }
            this.eKF = new e(i5);
            this.eKE.setFilters(new InputFilter[]{new DigitsKeyListener(), this.eKF});
            this.eKE.addTextChangedListener(this.eKF);
            this.eKE.addTextChangedListener(this);
            linearLayout2.addView(this.eKE, -1, -2);
            linearLayout.addView(linearLayout2, layoutParams);
            c.b(linearLayout2, booleanExtra ? str : null, null, booleanExtra3 ? str : null, null);
        } else {
            this.eKF = new a();
        }
        if (booleanExtra3) {
            linearLayout2 = new LinearLayout(this);
            layoutParams = new LayoutParams(0, -1, 1.0f);
            linearLayout2.setOrientation(1);
            textView = new TextView(this);
            if (!this.eJW) {
                textView.setTextColor(io.card.payment.a.b.eLT);
            }
            c.a(textView, this.eKP, null, null, null);
            textView.setText(b.a(StringKey.ENTRY_POSTAL_CODE));
            linearLayout2.addView(textView, -2, -2);
            boolean booleanExtra4 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY, false);
            this.eKG = new EditText(this);
            EditText editText4 = this.eKG;
            i2 = this.eKy;
            this.eKy = i2 + 1;
            editText4.setId(i2);
            this.eKG.setMaxLines(1);
            this.eKG.setImeOptions(6);
            this.eKG.setTextAppearance(getApplicationContext(), 16842816);
            if (booleanExtra4) {
                this.eKG.setInputType(3);
            } else {
                this.eKG.setInputType(1);
            }
            if (!this.eJW) {
                this.eKG.setHintTextColor(Drawables.DEFAULT_LIST_ROW_COLOR_PRESSED);
            }
            this.eKH = new g(20);
            this.eKG.addTextChangedListener(this.eKH);
            this.eKG.addTextChangedListener(this);
            linearLayout2.addView(this.eKG, -1, -2);
            linearLayout.addView(linearLayout2, layoutParams);
            String str5 = (booleanExtra || booleanExtra2) ? str : null;
            c.b(linearLayout2, str5, null, null, null);
        } else {
            this.eKH = new a();
        }
        linearLayout4.addView(linearLayout, layoutParams5);
        w(linearLayout4);
        linearLayout3.addView(linearLayout4, layoutParams3);
        str3 = "16dip";
        c.b(linearLayout4, str3, "20dip", str3, "20dip");
        linearLayout2 = new LinearLayout(this);
        i = this.eKx;
        this.eKx = i + 1;
        linearLayout2.setId(i);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(12);
        linearLayout2.setPadding(0, d, 0, 0);
        linearLayout2.setBackgroundColor(0);
        layoutParams2.addRule(2, linearLayout2.getId());
        this.eKL = new Button(this);
        LayoutParams layoutParams8 = new LayoutParams(-1, -2, 1.0f);
        this.eKL.setText(b.a(StringKey.DONE));
        this.eKL.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DataEntryActivity.this.biA();
            }
        });
        this.eKL.setEnabled(false);
        linearLayout2.addView(this.eKL, layoutParams8);
        c.a(this.eKL, true, this, this.eJW);
        String str6 = "5dip";
        c.a(this.eKL, str6, null, str6, null);
        String str7 = str2;
        c.b(this.eKL, str7, str7, str7, str7);
        if (!this.eJW) {
            this.eKL.setTextSize(16.0f);
        }
        this.eKM = new Button(this);
        layoutParams8 = new LayoutParams(-1, -2, 1.0f);
        this.eKM.setText(b.a(StringKey.CANCEL));
        this.eKM.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DataEntryActivity.this.onBackPressed();
            }
        });
        linearLayout2.addView(this.eKM, layoutParams8);
        c.a(this.eKM, false, this, this.eJW);
        c.a(this.eKM, str6, null, str6, null);
        c.b(this.eKM, str, str7, str7, str7);
        if (!this.eJW) {
            this.eKM.setTextSize(16.0f);
        }
        RelativeLayout relativeLayout3 = relativeLayout;
        relativeLayout3.addView(linearLayout2, layoutParams7);
        a.o(this);
        setContentView(relativeLayout3);
        Drawable drawable = getIntent().getBooleanExtra(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, true) ? getResources().getDrawable(R.drawable.cio_ic_paypal_monogram) : null;
        if (booleanExtra && this.eKD.isValid()) {
            afterTextChanged(this.eKC.getEditableText());
        }
        a.a(this, this.eKz, b.a(StringKey.MANUAL_ENTRY_TITLE), "card.io - ", drawable);
    }

    private void biA() {
        if (this.eKN == null) {
            this.eKN = new CreditCard();
        }
        if (this.eKC != null) {
            this.eKN.expiryMonth = ((d) this.eKD).month;
            this.eKN.expiryYear = ((d) this.eKD).year;
        }
        CreditCard creditCard = new CreditCard(this.eKB.getValue(), this.eKN.expiryMonth, this.eKN.expiryYear, this.eKF.getValue(), this.eKH.getValue(), this.eKJ.getValue());
        Intent intent = new Intent();
        intent.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, creditCard);
        Intent intent2 = getIntent();
        String str = CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE;
        if (intent2.hasExtra(str)) {
            intent.putExtra(str, getIntent().getByteArrayExtra(str));
        }
        setResult(CardIOActivity.RESULT_CARD_INFO, intent);
        finish();
    }

    public void onBackPressed() {
        setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        getWindow().setFlags(0, 1024);
        a.q(this);
        biC();
        if (this.eKA != null || this.eKC == null || this.eKD.isValid()) {
            biB();
        } else {
            this.eKC.requestFocus();
        }
        if (this.eKA != null || this.eKC != null || this.eKE != null || this.eKG != null || this.eKI != null) {
            getWindow().setSoftInputMode(5);
        }
    }

    private EditText biB() {
        int i = 100;
        while (true) {
            int i2 = i + 1;
            EditText editText = (EditText) findViewById(i);
            if (editText == null) {
                return null;
            }
            if (editText.getText().length() == 0 && editText.requestFocus()) {
                return editText;
            }
            i = i2;
        }
    }

    private void biC() {
        Button button = this.eKL;
        boolean z = this.eKB.isValid() && this.eKD.isValid() && this.eKF.isValid() && this.eKH.isValid() && this.eKJ.isValid();
        button.setEnabled(z);
        if (this.eKO && this.eKB.isValid() && this.eKD.isValid() && this.eKF.isValid() && this.eKH.isValid() && this.eKJ.isValid()) {
            biA();
        }
    }

    public void afterTextChanged(Editable editable) {
        EditText editText = this.eKA;
        if (editText == null || editable != editText.getText()) {
            editText = this.eKC;
            if (editText == null || editable != editText.getText()) {
                editText = this.eKE;
                if (editText == null || editable != editText.getText()) {
                    editText = this.eKG;
                    if (editText == null || editable != editText.getText()) {
                        editText = this.eKI;
                        if (editText != null && editable == editText.getText()) {
                            if (!this.eKJ.apr()) {
                                g(this.eKI);
                            } else if (this.eKJ.isValid()) {
                                g(this.eKI);
                            } else {
                                this.eKI.setTextColor(io.card.payment.a.b.eLS);
                            }
                        }
                    } else if (!this.eKH.apr()) {
                        g(this.eKG);
                    } else if (this.eKH.isValid()) {
                        g(this.eKG);
                    } else {
                        this.eKG.setTextColor(io.card.payment.a.b.eLS);
                    }
                } else if (!this.eKF.apr()) {
                    g(this.eKE);
                } else if (this.eKF.isValid()) {
                    g(this.eKE);
                    biB();
                } else {
                    this.eKE.setTextColor(io.card.payment.a.b.eLS);
                }
            } else if (!this.eKD.apr()) {
                g(this.eKC);
            } else if (this.eKD.isValid()) {
                g(this.eKC);
                biB();
            } else {
                this.eKC.setTextColor(io.card.payment.a.b.eLS);
            }
        } else {
            if (!this.eKB.apr()) {
                g(this.eKA);
            } else if (this.eKB.isValid()) {
                g(this.eKA);
                biB();
            } else {
                this.eKA.setTextColor(io.card.payment.a.b.eLS);
            }
            if (this.eKE != null) {
                e eVar = (e) this.eKF;
                int cvvLength = CardType.fromCardNumber(this.eKB.getValue().toString()).cvvLength();
                eVar.eKT = cvvLength;
                this.eKE.setHint(cvvLength == 4 ? "1234" : "123");
            }
        }
        biC();
    }

    private void g(EditText editText) {
        if (this.eJW) {
            editText.setTextColor(this.eKQ);
        } else {
            editText.setTextColor(-12303292);
        }
    }

    private void w(ViewGroup viewGroup) {
        if (getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, false)) {
            LinearLayout linearLayout = new LinearLayout(this);
            c.a(linearLayout, null, "4dip", null, null);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            if (!this.eJW) {
                textView.setTextColor(io.card.payment.a.b.eLT);
            }
            c.a(textView, this.eKP, null, null, null);
            textView.setText(b.a(StringKey.ENTRY_CARDHOLDER_NAME));
            linearLayout.addView(textView, -2, -2);
            this.eKI = new EditText(this);
            EditText editText = this.eKI;
            int i = this.eKy;
            this.eKy = i + 1;
            editText.setId(i);
            this.eKI.setMaxLines(1);
            this.eKI.setImeOptions(6);
            this.eKI.setTextAppearance(getApplicationContext(), 16842816);
            this.eKI.setInputType(1);
            if (!this.eJW) {
                this.eKI.setHintTextColor(Drawables.DEFAULT_LIST_ROW_COLOR_PRESSED);
            }
            this.eKJ = new g(175);
            this.eKI.addTextChangedListener(this.eKJ);
            this.eKI.addTextChangedListener(this);
            linearLayout.addView(this.eKI, -1, -2);
            viewGroup.addView(linearLayout, -1, -2);
            return;
        }
        this.eKJ = new a();
    }
}
