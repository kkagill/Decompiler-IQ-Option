package jumio.bam;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatEditText;
import com.jumio.commons.log.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MaskedEditText */
public class p extends AppCompatEditText implements OnFocusChangeListener, OnTouchListener {
    private Context a;
    private String b;
    private Character[] c;
    private String d;
    private boolean e;
    private ArrayList<Integer> f = new ArrayList();
    private Integer g;
    private Integer h;
    private Drawable i;
    private OnFocusChangeListener j;
    private a k;
    private String l;
    private b m;

    /* compiled from: MaskedEditText */
    public interface a {
        void a();
    }

    /* compiled from: MaskedEditText */
    class b implements InputFilter {
        private boolean b = true;
        private boolean c = false;

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (this.c) {
                return charSequence;
            }
            StringBuilder stringBuilder = new StringBuilder();
            boolean c = c(i3);
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                String a = p.this.a(i3, String.valueOf(charAt), spanned.toString());
                String str = "";
                if (a == null) {
                    return str;
                }
                if (c) {
                    this.b = false;
                    if (a.length() + i3 <= p.this.getText().length()) {
                        p.this.getText().replace(i3, a.length() + i3, str);
                    }
                    this.b = true;
                    stringBuilder.append(a);
                    int i5 = i3 + 1;
                    if (c(i5)) {
                        i5 = i3;
                    }
                    a(i5);
                } else if (i3 != p.this.b.length()) {
                    int a2 = a(!c(i3) ? i3 + 1 : i3);
                    p.this.getText().replace(a2, a2, Character.toString(charAt));
                }
                i++;
            }
            if (this.b && TextUtils.isEmpty(charSequence) && i4 != 0) {
                stringBuilder.append(p.this.b.charAt(i3));
                b(i3);
            }
            return stringBuilder.toString();
        }

        private int a(int i) {
            i = a(i, false);
            if (i > p.this.h.intValue()) {
                i = p.this.h.intValue();
            }
            p.this.setSelection(i);
            return i;
        }

        private void b(int i) {
            p.this.setSelection(a(i, true));
        }

        private int a(int i, boolean z) {
            if (!p.this.f.contains(Integer.valueOf(i))) {
                return b(i, z);
            }
            ListIterator listIterator = p.this.f.listIterator(p.this.f.indexOf(Integer.valueOf(i)));
            if (z) {
                if (listIterator.hasPrevious()) {
                    return ((Integer) listIterator.previous()).intValue() + 1;
                }
            } else if (listIterator.hasNext()) {
                i = ((Integer) listIterator.next()).intValue();
            }
            return i;
        }

        private int b(int i, boolean z) {
            ListIterator listIterator;
            Integer num;
            if (z) {
                listIterator = p.this.f.listIterator(p.this.f.size() - 1);
                while (listIterator.hasPrevious()) {
                    num = (Integer) listIterator.previous();
                    if (num.intValue() <= i) {
                        return num.intValue() + 1;
                    }
                }
                return p.this.g.intValue();
            } else if (i <= p.this.g.intValue()) {
                return p.this.g.intValue();
            } else {
                listIterator = p.this.f.listIterator();
                while (listIterator.hasNext()) {
                    num = (Integer) listIterator.next();
                    if (num.intValue() >= i) {
                        return num.intValue() - 1;
                    }
                }
                return p.this.h.intValue();
            }
        }

        private boolean c(int i) {
            if (i < p.this.b.length()) {
                p pVar = p.this;
                if (pVar.a(pVar.b.charAt(i), p.this.c)) {
                    return true;
                }
            }
            return false;
        }

        public void a(boolean z) {
            this.c = z;
        }
    }

    /* Access modifiers changed, original: protected */
    public String a(int i, String str, String str2) {
        return null;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
    }

    public p(Context context) {
        super(context);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        Context context2 = context;
        a(context2, "", new Character[0], null, null);
    }

    public p(Context context, String str, Character[] chArr) {
        super(context);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        a(context, str, chArr, null, null);
    }

    public p(Context context, String str, Character[] chArr, Drawable drawable) {
        super(context);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        a(context, str, chArr, drawable, null);
    }

    public p(Context context, String str, Character[] chArr, Drawable drawable, a aVar) {
        super(context);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        a(context, str, chArr, drawable, aVar);
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        a(context);
    }

    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer valueOf = Integer.valueOf(0);
        this.g = valueOf;
        this.h = valueOf;
        a(context);
    }

    /* Access modifiers changed, original: protected */
    public void a(Context context) {
        Context context2 = context;
        a(context2, "", new Character[0], null, null);
    }

    private void a(Context context, String str, Character[] chArr, Drawable drawable, a aVar) {
        this.a = context;
        this.i = drawable;
        this.k = aVar;
        a(str, chArr);
        b();
        setLongClickable(false);
        setSingleLine(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void a(String str, Character[] chArr) {
        this.b = str;
        this.c = (Character[]) Arrays.copyOf(chArr, chArr.length);
        a();
    }

    private void a() {
        if (!TextUtils.isEmpty(this.b)) {
            Character[] chArr = this.c;
            if (chArr.length != 0) {
                this.d = "";
                b(this.b, chArr);
                this.l = this.b;
                setText(this.l, BufferType.NORMAL);
                this.m = new b();
                setFilters(new InputFilter[]{this.m, new LengthFilter(this.b.length())});
                return;
            }
        }
        Log.e("Mask not correct initialised ");
    }

    private void b() {
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicHeight(), this.i.getIntrinsicHeight());
            Drawable[] compoundDrawables = getCompoundDrawables();
            setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], this.i, compoundDrawables[3]);
        }
        super.setOnFocusChangeListener(this);
        super.setOnTouchListener(this);
    }

    private void b(String str, Character[] chArr) {
        char[] toCharArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (a(toCharArray[i], chArr)) {
                this.f.add(Integer.valueOf(i));
            }
        }
        this.g = (Integer) this.f.get(0);
        ArrayList arrayList = this.f;
        this.h = (Integer) arrayList.get(arrayList.size() - 1);
    }

    public boolean a(char c, Character[] chArr) {
        for (Character charValue : chArr) {
            if (charValue.charValue() == c) {
                return true;
            }
        }
        return false;
    }

    public void setInputType(int i) {
        if (i == -1) {
            i = 524416;
        }
        if (i == 2 || i == 4096 || i == 8192 || i == 3) {
            String symbolExceptions = getSymbolExceptions();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("0123456789.");
            stringBuilder.append(symbolExceptions);
            setKeyListener(DigitsKeyListener.getInstance(stringBuilder.toString()));
            return;
        }
        super.setInputType(i);
    }

    private String getSymbolExceptions() {
        String str = "";
        if (TextUtils.isEmpty(this.l)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : this.l.toCharArray()) {
            if (!Character.isDigit(c) && stringBuilder.indexOf(String.valueOf(c)) == -1) {
                stringBuilder.append(c);
            }
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public String getUnmaskedText() {
        Editable text = super.getText();
        String str = this.b;
        if (str == null || str.isEmpty()) {
            return text.toString().trim();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (text != null && text.length() > 0 && num.intValue() < text.length()) {
                spannableStringBuilder.append(text.charAt(num.intValue()));
            }
        }
        String str2 = this.d;
        if (str2 == null || str2.isEmpty()) {
            return spannableStringBuilder.toString().trim();
        }
        return a(spannableStringBuilder.toString(), this.d);
    }

    public void setMaskedText(String str) {
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            String str2 = "";
            if (stringBuilder.length() < this.f.size()) {
                while (stringBuilder.length() < this.f.size()) {
                    stringBuilder.append(str2);
                }
            } else if (stringBuilder.length() > this.f.size()) {
                stringBuilder.replace(this.f.size(), stringBuilder.length(), str2);
            }
            StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
            if (getText() != null) {
                for (int i = 0; i < this.b.length(); i++) {
                    if (!this.f.contains(Integer.valueOf(i))) {
                        stringBuilder2.insert(i, String.valueOf(this.b.charAt(i)));
                    }
                }
                this.m.a(true);
                setText(stringBuilder2.toString());
                this.m.a(false);
            }
        }
    }

    private String a(String str, String str2) {
        Matcher matcher = Pattern.compile("(\\[[\\d]+\\])").matcher(str2);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, b(str, matcher.group()));
        }
        return stringBuffer.toString();
    }

    private String b(String str, String str2) {
        String str3 = "";
        return String.valueOf(str.toCharArray()[Integer.valueOf(str2.replace("[", str3).replace("]", str3)).intValue() - 1]);
    }

    public void setFormat(String str) {
        this.d = str;
    }

    public void setRequired(boolean z) {
        this.e = z;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.j = onFocusChangeListener;
    }

    public void onFocusChange(View view, boolean z) {
        OnFocusChangeListener onFocusChangeListener = this.j;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        if (z) {
            setSelection(this.g.intValue());
            requestFocus();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isVisible() && x > (getWidth() - getPaddingRight()) - this.i.getIntrinsicWidth()) {
            if (motionEvent.getAction() == 1) {
                this.k.a();
            }
            return true;
        } else if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 0) || !TextUtils.isEmpty(getUnmaskedText())) {
            return false;
        } else {
            setSelection(this.g.intValue());
            requestFocus();
            ((InputMethodManager) this.a.getSystemService("input_method")).showSoftInput(this, 1);
            return true;
        }
    }

    public void setMaskIconCallback(a aVar) {
        this.k = aVar;
    }
}
