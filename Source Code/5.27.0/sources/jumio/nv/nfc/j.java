package jumio.nv.nfc;

import android.os.AsyncTask;
import com.jumio.commons.utils.StringUtil;
import com.jumio.core.mvp.model.PublisherWithUpdate;
import com.jumio.nv.nfc.core.communication.TagAccessSpec;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.scuba.smartcards.CardServiceException;

/* compiled from: PassportAuthenticator */
public class j extends PublisherWithUpdate<o, o> implements Serializable {
    private final h a;
    private final String b;
    private final Date c;
    private final Date d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private g f;
    private String g;
    private boolean h;

    /* compiled from: PassportAuthenticator */
    public class a extends AsyncTask<Boolean, o, o> {
        private boolean b;
        private k c;

        /* Access modifiers changed, original: protected|varargs */
        /* renamed from: a */
        public o doInBackground(Boolean... boolArr) {
            String str = "PassportAuthenticator";
            this.b = boolArr[0].booleanValue();
            Throwable b;
            try {
                if (StringUtil.nullOrEmpty(j.this.b) || j.this.c == null || j.this.d == null) {
                    throw new GeneralSecurityException(String.format("Invalid BAC credentials! No.=%s, dob=%s, doe=%s ", new Object[]{j.this.b, j.this.c, j.this.d}));
                }
                this.c = j.this.f.a(j.this.b, j.this.c, j.this.d, j.this.g);
                o oVar = new o();
                oVar.a(p.INIT);
                oVar.a(q.NOT_AVAILABLE);
                try {
                    publishProgress(new o[]{this.c.a()});
                    oVar.a(p.BAC_CHECK);
                    b = this.c.b();
                    if (b.e()) {
                        j.this.publishError(b);
                        return b;
                    }
                    b(new o(p.BAC_CHECK, b.b()));
                    b.a(p.READ_LDS);
                    o a = this.c.a(this.b);
                    if (b.e()) {
                        j.this.publishError(b);
                        return b;
                    }
                    if (!b.f()) {
                        a.a(this.c.h());
                    }
                    b(a);
                    b.a(p.PASSIVE_AUTH_DSC_CHECK);
                    oVar = this.c.d();
                    b(new o(oVar));
                    Thread.sleep(500);
                    oVar.a(p.PASSIVE_AUTH_ROOT_CERT_CHECK);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("obtain CSCA for ");
                    stringBuilder.append(j.this.g.toUpperCase());
                    f.a(str, stringBuilder.toString());
                    b(new o(this.c.a(j.this.a)));
                    Thread.sleep(500);
                    oVar.a(p.PASSIVE_AUTH_HASH_CHECK);
                    List<o> c = this.c.c();
                    oVar.a(q.SUCCESSFUL);
                    oVar.a(p.PASSIVE_AUTH_HASH_CHECK);
                    Object treeMap = new TreeMap();
                    boolean z = false;
                    for (o oVar2 : c) {
                        if (oVar2.g() == null) {
                            treeMap.put(Integer.valueOf(0), oVar2.b());
                        } else {
                            treeMap.put((Integer) oVar2.g(), oVar2.b());
                        }
                        z = oVar2.e();
                    }
                    if (z) {
                        oVar.a(q.FAILED);
                    }
                    oVar.a(treeMap);
                    b(new o(oVar));
                    Thread.sleep(500);
                    oVar.a(p.ACTIVE_AUTH_CHECK);
                    oVar = this.c.e();
                    if (oVar.d()) {
                        this.c.f();
                    }
                    b(new o(oVar));
                    Thread.sleep(500);
                    oVar.a(p.ADDITIONAL_DATA);
                    b(new o(this.c.g()));
                    Thread.sleep(500);
                    b(new o(oVar));
                    return oVar;
                } catch (IOException | CardServiceException e) {
                    f.a(str, "NFC-related exception occurred", e);
                    oVar.a(q.ERROR, e);
                    j.this.publishError(oVar);
                } catch (Exception e2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("general exception occurred: ");
                    stringBuilder2.append(e2.getClass());
                    f.a(str, stringBuilder2.toString(), e2);
                    oVar.a(q.ERROR, e2);
                    j.this.publishError(oVar);
                }
            } catch (IllegalArgumentException | GeneralSecurityException | CardServiceException b2) {
                f.b(str, "error initializing PassportAuthenticator", b2);
                Throwable oVar3 = new o(p.INIT, q.ERROR, b2);
                j.this.publishError(oVar3);
                return oVar3;
            }
        }

        /* Access modifiers changed, original: protected|varargs */
        /* renamed from: a */
        public void onProgressUpdate(o... oVarArr) {
            super.onProgressUpdate(oVarArr);
            j.this.publishUpdate(oVarArr[0]);
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: a */
        public void onPostExecute(o oVar) {
            super.onPostExecute(oVar);
            j.this.e.set(false);
            j.this.publishResult(oVar);
        }

        private void b(o oVar) {
            publishProgress(new o[]{oVar});
            if (oVar.f()) {
                throw new CardServiceException(oVar.toString());
            }
        }
    }

    public j(h hVar, g gVar, TagAccessSpec tagAccessSpec) {
        this.a = hVar;
        this.f = gVar;
        this.b = tagAccessSpec.getIdNumber();
        this.c = tagAccessSpec.getDateOfBirth();
        this.d = tagAccessSpec.getDateOfExpiry();
        this.g = tagAccessSpec.getCountryIso3();
        this.h = tagAccessSpec.shouldDownloadFaceImage();
    }

    public boolean a() {
        return this.e.get();
    }

    public void b() {
        if (this.e.compareAndSet(false, true)) {
            new a().execute(new Boolean[]{Boolean.valueOf(this.h)});
        }
    }
}
