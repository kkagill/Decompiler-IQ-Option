package jumio.nv.nfc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jumio.commons.PersistWith;
import com.jumio.nv.enums.EMRTDStatus;
import com.jumio.nv.models.MrtdDataModel;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import org.jmrtd.lds.icao.MRZInfo;

@PersistWith("MrtdDataModel")
/* compiled from: EmrtdDataModel */
public class t implements MrtdDataModel {
    @NonNull
    private List<o> a;
    @Nullable
    private n b;
    @Nullable
    private String c;

    /* compiled from: EmrtdDataModel */
    /* renamed from: jumio.nv.nfc.t$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[p.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = jumio.nv.nfc.p.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = jumio.nv.nfc.p.PASSIVE_AUTH_DSC_CHECK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = jumio.nv.nfc.p.PASSIVE_AUTH_HASH_CHECK;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = jumio.nv.nfc.p.PASSIVE_AUTH_ROOT_CERT_CHECK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = jumio.nv.nfc.p.ACTIVE_AUTH_CHECK;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.nfc.t$AnonymousClass1.<clinit>():void");
        }
    }

    public t(@NonNull List<o> list, @Nullable n nVar, @Nullable String str) {
        this.a = list;
        this.b = nVar;
        this.c = str;
    }

    @Nullable
    public String getMrzString() {
        return this.c;
    }

    @Nullable
    private MRZInfo c() {
        n nVar = this.b;
        return nVar != null ? nVar.c() : null;
    }

    public String getMrzFirstName() {
        MRZInfo c = c();
        return (c == null || c.bRZ() == null) ? null : c.bRZ().replace("<", " ").trim();
    }

    public String getMrzLastName() {
        MRZInfo c = c();
        if (c == null) {
            return null;
        }
        return c.bRY();
    }

    public String getMrzPersonalNumber() {
        MRZInfo c = c();
        if (c == null) {
            return null;
        }
        return c.getPersonalNumber();
    }

    public String getMrzIdNumber() {
        MRZInfo c = c();
        if (c == null) {
            return null;
        }
        return c.bQS();
    }

    public String getMrzIssuingCountry() {
        MRZInfo c = c();
        if (c == null) {
            return null;
        }
        return c.bRX();
    }

    public String getMrzOriginatingCountry() {
        MRZInfo c = c();
        if (c == null) {
            return null;
        }
        return c.DX();
    }

    public int getBacCheckResult() {
        return a(p.BAC_CHECK);
    }

    public int getDscCheckResult() {
        return a(p.PASSIVE_AUTH_DSC_CHECK);
    }

    public int getActiveAuthResult() {
        return a(p.ACTIVE_AUTH_CHECK);
    }

    public Map<String, Integer> getHtCheckResults() {
        o b = b(p.PASSIVE_AUTH_HASH_CHECK);
        if (b == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        for (Entry entry : ((SortedMap) b.g()).entrySet()) {
            treeMap.put(String.valueOf(entry.getKey()), Integer.valueOf(((q) entry.getValue()).ordinal()));
        }
        return treeMap;
    }

    public int[] getEncodedDataItems() {
        n nVar = this.b;
        if (nVar == null) {
            return null;
        }
        return nVar.d();
    }

    public int getRootCertCheck() {
        return a(p.PASSIVE_AUTH_ROOT_CERT_CHECK);
    }

    public EMRTDStatus getVerificationStatus() {
        EMRTDStatus eMRTDStatus = EMRTDStatus.NOT_AVAILABLE;
        List list = this.a;
        if (!(list == null || list.isEmpty())) {
            for (o oVar : this.a) {
                int i = AnonymousClass1.a[oVar.a().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    if (!(eMRTDStatus == EMRTDStatus.DENIED || oVar.b() == q.NOT_AVAILABLE)) {
                        if (oVar.e()) {
                            eMRTDStatus = EMRTDStatus.DENIED;
                        } else {
                            eMRTDStatus = EMRTDStatus.VERIFIED;
                        }
                    }
                }
            }
        }
        return eMRTDStatus;
    }

    @Nullable
    public String getPlaceOfBirth() {
        n nVar = this.b;
        m b = nVar != null ? nVar.b() : null;
        if (b == null || b.h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : b.h) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }

    @Nullable
    public Date getIssuingDate() {
        n nVar = this.b;
        l a = nVar != null ? nVar.a() : null;
        if (a == null || a.h == null) {
            return null;
        }
        return a.h;
    }

    private int a(p pVar) {
        o b = b(pVar);
        return b != null ? b.b().ordinal() : 2;
    }

    private o b(p pVar) {
        for (o oVar : this.a) {
            if (oVar.a() == pVar) {
                return oVar;
            }
        }
        return null;
    }

    public List<o> a() {
        return this.a;
    }

    @Nullable
    public n b() {
        return this.b;
    }
}
