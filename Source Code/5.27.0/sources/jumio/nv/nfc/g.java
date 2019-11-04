package jumio.nv.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import java.util.Date;
import net.sf.scuba.smartcards.CardService;
import org.jmrtd.d;

/* compiled from: PassportFactory */
public class g {
    private static r a;
    private Tag b;
    private d c;
    private IsoDep d;

    public g(Tag tag) {
        this.b = tag;
    }

    /* Access modifiers changed, original: protected */
    public d a(Tag tag) {
        if (this.c == null) {
            this.d = IsoDep.get(tag);
            this.c = new d(CardService.getInstance(this.d), 65536, 224, false, false);
        }
        return this.c;
    }

    public k a(String str, Date date, Date date2, String str2) {
        Tag tag = this.b;
        if (tag != null) {
            this.c = a(tag);
        }
        r rVar = a;
        if (rVar != null) {
            return new s(rVar, this.c, str, date, date2, str2);
        }
        if (this.b != null) {
            i iVar = new i(this.c, str, date, date2, str2);
            iVar.a(this.d);
            return iVar;
        }
        throw new IllegalStateException("the factory must be constructed with a Tag object!");
    }
}
