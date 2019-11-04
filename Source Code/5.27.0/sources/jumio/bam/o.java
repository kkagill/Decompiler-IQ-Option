package jumio.bam;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TableLayout;
import com.jumio.bam.R;
import com.jumio.bam.enums.CreditCardType;
import com.jumio.commons.utils.ScreenUtil;
import java.util.ArrayList;

/* compiled from: ManualEntryView */
public class o extends TableLayout implements m {
    private l a;
    private k b;
    private k c;
    private a d;

    /* compiled from: ManualEntryView */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: ManualEntryView */
    /* renamed from: jumio.bam.o$2 */
    class AnonymousClass2 extends jumio.bam.k.a {
        final /* synthetic */ CreditCardType b;
        private boolean d = true;

        AnonymousClass2(k kVar, CreditCardType creditCardType) {
            this.b = creditCardType;
            kVar.getClass();
            super();
        }

        public void afterTextChanged(Editable editable) {
            if (((this.b == CreditCardType.AMERICAN_EXPRESS && editable.length() == 4) || (this.b != CreditCardType.AMERICAN_EXPRESS && editable.length() == 3)) && this.d) {
                for (int i = 0; i < o.this.getChildCount(); i++) {
                    if (o.this.getChildAt(i) == o.this.b) {
                        int i2 = i + 1;
                        if (i2 < o.this.getChildCount() && (o.this.getChildAt(i2) instanceof k)) {
                            o oVar = o.this;
                            oVar.c(oVar.b);
                        }
                    }
                    this.d = false;
                }
            }
            super.afterTextChanged(editable);
        }
    }

    public o(Context context, a aVar) {
        super(context);
        setLayoutParams(new LayoutParams(-1, -1));
        this.d = aVar;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.bam_manualEntryBackgroundColor, typedValue, true);
        setBackgroundColor(typedValue.data);
    }

    public void a(boolean z, boolean z2, boolean z3, ArrayList<aa> arrayList, boolean z4) {
        if (z) {
            a();
            this.a.setAutoShowNextView(z4);
            this.a.setAutoFocusNextView(z4 ^ 1);
        }
        if (z3) {
            c();
            this.c.setAutoShowNextView(z4);
        }
        if (z2) {
            b();
            this.b.setAutoShowNextView(z4);
            this.b.setAutoFocusNextView(z4 ^ 1);
        }
        if (arrayList != null) {
            int i = 1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                aa aaVar = (aa) arrayList.get(i2);
                boolean z5 = aaVar instanceof ac;
                if (z5 || (aaVar instanceof ab)) {
                    int i3;
                    n a;
                    if (z5) {
                        ac acVar = (ac) aaVar;
                        int i4 = i + 1;
                        i3 = i4 + 1;
                        a = a(i, i4, aaVar.b(), acVar.c(), acVar.d(), acVar.e());
                    } else {
                        ab abVar = (ab) aaVar;
                        i3 = i + 1;
                        n a2 = a(i, aaVar.b());
                        if (abVar.c() != -1) {
                            ((k) a2).setInputType(abVar.c());
                        }
                        k kVar = (k) a2;
                        kVar.setValidationPattern(abVar.d());
                        kVar.c();
                        a = a2;
                    }
                    a.setTag(aaVar.a());
                    a.setAutoFocusNextView(false);
                    a.setAutoShowNextView(true);
                    if (i2 == 0) {
                        a.a(0, ScreenUtil.dpToPx(getContext(), 10), 0, 0);
                    }
                    i = i3;
                }
            }
        }
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setVisibility(0);
            childAt.post(new Runnable() {
                public void run() {
                    View childAt = o.this.getChildAt(0);
                    if (o.this.c(childAt)) {
                        ((InputMethodManager) o.this.getContext().getSystemService("input_method")).toggleSoftInputFromWindow(o.this.getApplicationWindowToken(), 1, 0);
                    }
                    if ((childAt instanceof k) && ((k) childAt).getAutoShowNextView()) {
                        o.this.d(childAt);
                    }
                }
            });
        }
    }

    public void a() {
        this.a = new l(getContext());
        this.a.setLabelText(getContext().getString(R.string.bam_manual_entry_valid_through));
        this.a.setValidationCallback(this);
        this.a.setVisibility(4);
        addView(this.a);
    }

    public void a(char[] cArr, char[] cArr2) {
        l lVar = this.a;
        if (lVar != null) {
            lVar.a(cArr, cArr2);
        }
    }

    public void b() {
        this.b = a(R.id.cvvInputEditText, getContext().getString(R.string.bam_manual_entry_cvv));
        this.b.setInputType(0);
        this.b.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.b.setFilters(new InputFilter[]{new LengthFilter(3)});
        this.b.setValidationPattern("[0-9]{3}");
        this.b.setValidationCallback(this);
        this.b.c();
    }

    public void c() {
        this.c = a(R.id.nameInputEditText, getContext().getString(R.string.bam_manual_entry_cardholder_name));
        this.c.setAutoFocusNextView(false);
        this.c.setInputType(4096);
        this.c.setValidationPattern("^.+$");
        this.c.setValidationCallback(this);
        this.c.setFilters(new InputFilter[]{new AllCaps()});
        this.c.setInputType(4096);
        this.c.c();
    }

    public void a(CharSequence charSequence) {
        k kVar = this.c;
        if (kVar != null) {
            kVar.setValueText(charSequence);
        }
    }

    public void a(CreditCardType creditCardType) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.getClass();
            kVar.a(new AnonymousClass2(kVar, creditCardType));
            int i = 3;
            int i2 = R.string.bam_manual_entry_cvv;
            String str = "[0-9]{3}";
            switch (creditCardType) {
                case UNKNOWN:
                case VISA:
                case DINERS_CLUB:
                    i2 = R.string.bam_manual_entry_cvv;
                    break;
                case MASTER_CARD:
                    i2 = R.string.bam_manual_entry_cvc;
                    break;
                case DISCOVER:
                    i2 = R.string.bam_manual_entry_cid;
                    break;
                case AMERICAN_EXPRESS:
                    i = 4;
                    this.b.setAutoFocusNextView(false);
                    i2 = R.string.bam_manual_entry_cid;
                    str = "[0-9]{3,}";
                    break;
                case CHINA_UNIONPAY:
                case JCB:
                    i2 = R.string.bam_manual_entry_cav;
                    break;
            }
            this.b.setFilters(new InputFilter[]{new LengthFilter(i)});
            this.b.setValidationPattern(str);
            this.b.setLabelText(i2 != 0 ? getContext().getString(i2) : "");
        }
    }

    public r a(int i, int i2, String str, ArrayList<String> arrayList, boolean z, String str2) {
        r rVar = new r(getContext(), z, str2);
        rVar.setLabelId(i);
        rVar.setValueId(i2);
        rVar.setLabelText(str);
        rVar.setValues(arrayList);
        rVar.setVisibility(4);
        rVar.setValidationCallback(this);
        addView(rVar);
        return rVar;
    }

    public k a(int i, String str) {
        k kVar = new k(getContext());
        kVar.setValueId(i);
        kVar.setLabelText(str);
        kVar.setVisibility(4);
        kVar.setValidationCallback(this);
        addView(kVar);
        return kVar;
    }

    public void a(w wVar) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.equals(this.a)) {
                wVar.e(new StringBuilder(this.a.getMonthText()));
                wVar.f(new StringBuilder(this.a.getYearText()));
            } else if (childAt.equals(this.b)) {
                wVar.g(new StringBuilder(this.b.getValueText()));
            } else if (childAt.equals(this.c)) {
                wVar.b(new StringBuilder(this.c.getValueText()));
            } else if ((childAt instanceof k) || (childAt instanceof r)) {
                wVar.a((String) childAt.getTag(), ((n) childAt).getValueText().toString());
            }
        }
    }

    public boolean d() {
        boolean z = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 0) {
                z = false;
            } else if (childAt instanceof l) {
                z = ((l) childAt).a();
            } else if ((childAt instanceof k) || (childAt instanceof r)) {
                z = ((n) childAt).a();
            }
            if (!z) {
                break;
            }
        }
        return z;
    }

    private boolean c(View view) {
        View focusSearch = view.focusSearch(130);
        if (focusSearch == null) {
            focusSearch = view.focusSearch(2);
        }
        if (view == focusSearch) {
            focusSearch = null;
        }
        if (focusSearch != null) {
            if (focusSearch.getParent() != null) {
                ViewParent parent = focusSearch.getParent().getParent();
                ViewParent viewParent = this.c;
                if (!(parent != viewParent || viewParent.getValueText() == null || this.c.getValueText().length() == 0)) {
                    return c(focusSearch);
                }
            }
            focusSearch.requestFocus();
        }
        return focusSearch != null;
    }

    public void a(View view) {
        d(view);
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(d());
        }
    }

    private void d(View view) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == view) {
                int i2 = i + 1;
                if (i2 < getChildCount()) {
                    View childAt = getChildAt(i2);
                    if (childAt.getVisibility() != 0) {
                        childAt.setVisibility(0);
                        if ((childAt instanceof k) || (childAt instanceof r)) {
                            childAt = (n) childAt;
                            if (childAt.getValueText().length() != 0) {
                                childAt.b();
                            }
                            if (((view instanceof k) || (view instanceof r)) && ((n) view).getAutoFocusNextView()) {
                                c(view);
                            }
                            if (childAt.getAutoShowNextView()) {
                                a(childAt);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void b(View view) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
