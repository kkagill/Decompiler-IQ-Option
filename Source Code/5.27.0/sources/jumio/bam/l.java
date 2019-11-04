package jumio.bam;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.jumio.bam.R;
import com.jumio.bam.gui.ExpiryEditText;
import com.jumio.commons.log.Log;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;

/* compiled from: ExpiryDetailView */
public class l extends k {
    public void setValueId(int i) {
    }

    public void setValueText(CharSequence charSequence) {
    }

    public l(Context context) {
        super(context, R.layout.bam_custom_field_expiry_edit_text);
        String string = context.getString(R.string.bam_manual_entry_hint_month);
        String string2 = context.getString(R.string.bam_manual_entry_hint_year);
        if (string.length() > 2) {
            string = string.substring(0, 2);
        }
        if (string2.length() > 2) {
            string2 = string2.substring(0, 2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append(string2);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string);
        stringBuilder3.append(string2);
        ((ExpiryEditText) this.d).a(stringBuilder2, a(stringBuilder3.toString()));
        this.b = false;
        this.d.setId(R.id.expiryValueEditText);
        this.d.setInputType(2);
        setValidationPattern(z.a());
    }

    private Character[] a(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (char valueOf : str.toCharArray()) {
            linkedHashSet.add(Character.valueOf(valueOf));
        }
        return (Character[]) linkedHashSet.toArray(new Character[linkedHashSet.size()]);
    }

    public boolean a() {
        if (this.a == null) {
            return true;
        }
        Matcher matcher = this.a.matcher(this.d.getText());
        if (this.b) {
            a((boolean) 1 ^ matcher.matches());
        }
        boolean matches = matcher.matches();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isExpiryValid: ");
        stringBuilder.append(matches);
        Log.d(stringBuilder.toString());
        return matches;
    }

    public void a(char[] cArr, char[] cArr2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cArr);
        stringBuilder.append(cArr2);
        ((p) this.d).setMaskedText(stringBuilder.toString());
    }

    public Editable getMonthText() {
        return new SpannableStringBuilder(this.d.getText().toString().substring(0, 2));
    }

    public Editable getYearText() {
        return new SpannableStringBuilder(this.d.getText().toString().substring(3, 5));
    }
}
