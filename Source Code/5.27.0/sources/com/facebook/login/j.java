package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.d;
import com.facebook.e;
import com.facebook.f;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.aa;
import com.facebook.internal.l;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: LoginManager */
public class j {
    private static final Set<String> Cr = lZ();
    private static volatile j Cs;
    private LoginBehavior Ca = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience Cb = DefaultAudience.FRIENDS;
    private String Cf = "rerequest";
    private final SharedPreferences sA;

    /* compiled from: LoginManager */
    private static class b {
        private static i Cw;

        private static synchronized i aj(Context context) {
            synchronized (b.class) {
                if (context == null) {
                    context = f.getApplicationContext();
                }
                if (context == null) {
                    return null;
                }
                if (Cw == null) {
                    Cw = new i(context, f.go());
                }
                i iVar = Cw;
                return iVar;
            }
        }
    }

    /* compiled from: LoginManager */
    private static class a implements o {
        private final l Cv;

        a(l lVar) {
            aa.b((Object) lVar, "fragment");
            this.Cv = lVar;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.Cv.startActivityForResult(intent, i);
        }

        public Activity ma() {
            return this.Cv.getActivity();
        }
    }

    j() {
        aa.kV();
        this.sA = f.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);
    }

    public static j lX() {
        if (Cs == null) {
            synchronized (j.class) {
                if (Cs == null) {
                    Cs = new j();
                }
            }
        }
        return Cs;
    }

    public void a(d dVar, final e<l> eVar) {
        if (dVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) dVar).b(RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.a() {
                public boolean b(int i, Intent intent) {
                    return j.this.a(i, intent, eVar);
                }
            });
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(int i, Intent intent) {
        return a(i, intent, null);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(int i, Intent intent, e<l> eVar) {
        Map map;
        Code code;
        boolean z;
        com.facebook.a aVar;
        c cVar;
        int i2 = i;
        Intent intent2 = intent;
        Code code2 = Code.ERROR;
        Exception exception = null;
        boolean z2 = false;
        if (intent2 != null) {
            com.facebook.a aVar2;
            Map map2;
            c cVar2;
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                c cVar3 = result.Ck;
                Code code3 = result.Ch;
                if (i2 == -1) {
                    if (result.Ch == Code.SUCCESS) {
                        aVar2 = result.Ci;
                    } else {
                        exception = new FacebookAuthorizationException(result.errorMessage);
                        aVar2 = null;
                    }
                } else if (i2 == 0) {
                    aVar2 = null;
                    z2 = true;
                } else {
                    aVar2 = null;
                }
                map2 = result.BP;
                Code code4 = code3;
                cVar2 = cVar3;
                code2 = code4;
            } else {
                aVar2 = null;
                map2 = aVar2;
                cVar2 = map2;
            }
            map = map2;
            code = code2;
            z = z2;
            c cVar4 = cVar2;
            aVar = aVar2;
            cVar = cVar4;
        } else if (i2 == 0) {
            code = Code.CANCEL;
            cVar = null;
            aVar = cVar;
            map = aVar;
            z = true;
        } else {
            code = code2;
            cVar = null;
            aVar = cVar;
            map = aVar;
            z = false;
        }
        if (exception == null && aVar == null && !z) {
            exception = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, code, map, exception, true, cVar);
        a(aVar, cVar, exception, z, eVar);
        return true;
    }

    public void lY() {
        com.facebook.a.a(null);
        com.facebook.l.a(null);
        L(false);
    }

    public void a(Fragment fragment, Collection<String> collection) {
        a(new l(fragment), (Collection) collection);
    }

    private void a(l lVar, Collection<String> collection) {
        d(collection);
        b(lVar, (Collection) collection);
    }

    public void b(l lVar, Collection<String> collection) {
        a(new a(lVar), e(collection));
    }

    private void d(Collection<String> collection) {
        if (collection != null) {
            for (String by : collection) {
                if (by(by)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{(String) r4.next()}));
                }
            }
        }
    }

    static boolean by(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || Cr.contains(str));
    }

    private static Set<String> lZ() {
        return Collections.unmodifiableSet(new LoginManager$2());
    }

    /* Access modifiers changed, original: protected */
    public c e(Collection<String> collection) {
        c cVar = new c(this.Ca, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.Cb, this.Cf, f.go(), UUID.randomUUID().toString());
        cVar.K(com.facebook.a.gf());
        return cVar;
    }

    private void a(o oVar, c cVar) {
        a(oVar.ma(), cVar);
        CallbackManagerImpl.a(RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.a() {
            public boolean b(int i, Intent intent) {
                return j.this.b(i, intent);
            }
        });
        if (!b(oVar, cVar)) {
            Exception facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(oVar.ma(), Code.ERROR, null, facebookException, false, cVar);
            throw facebookException;
        }
    }

    private void a(Context context, c cVar) {
        i ak = b.aj(context);
        if (ak != null && cVar != null) {
            ak.g(cVar);
        }
    }

    private void a(Context context, Code code, Map<String, String> map, Exception exception, boolean z, c cVar) {
        i ak = b.aj(context);
        if (ak != null) {
            if (cVar == null) {
                ak.K("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : "0");
                ak.a(cVar.lO(), hashMap, code, map, exception);
            }
        }
    }

    private boolean b(o oVar, c cVar) {
        Intent h = h(cVar);
        if (!g(h)) {
            return false;
        }
        try {
            oVar.startActivityForResult(h, LoginClient.ly());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private boolean g(Intent intent) {
        if (f.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public Intent h(c cVar) {
        Intent intent = new Intent();
        intent.setClass(f.getApplicationContext(), FacebookActivity.class);
        intent.setAction(cVar.lM().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", cVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    static l b(c cVar, com.facebook.a aVar) {
        Set gj = cVar.gj();
        HashSet hashSet = new HashSet(aVar.gj());
        if (cVar.lP()) {
            hashSet.retainAll(gj);
        }
        HashSet hashSet2 = new HashSet(gj);
        hashSet2.removeAll(hashSet);
        return new l(aVar, hashSet, hashSet2);
    }

    private void a(com.facebook.a aVar, c cVar, FacebookException facebookException, boolean z, e<l> eVar) {
        if (aVar != null) {
            com.facebook.a.a(aVar);
            com.facebook.l.hK();
        }
        if (eVar != null) {
            l b = aVar != null ? b(cVar, aVar) : null;
            if (z || (b != null && b.mc().size() == 0)) {
                eVar.onCancel();
            } else if (facebookException != null) {
                eVar.b(facebookException);
            } else if (aVar != null) {
                L(true);
                eVar.onSuccess(b);
            }
        }
    }

    private void L(boolean z) {
        Editor edit = this.sA.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }
}
