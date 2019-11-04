package com.iqoption.welcome.d;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.iqoption.core.d;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import io.reactivex.b.f;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Ref.ObjectRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0006\u0010\u0011\u001a\u00020\nJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/welcome/social/GoogleAuthViewModel;", "Lcom/iqoption/welcome/social/BaseSocialAuthViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "RC_SIGN_IN", "", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "googleLogin", "", "fragment", "Landroidx/fragment/app/Fragment;", "handleSignInResult", "result", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "logout", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "revokeAccess", "socialId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "Companion", "welcome_release"})
/* compiled from: GoogleAuthViewModel.kt */
public class c extends a {
    private static final String TAG = c.class.getSimpleName();
    public static final a enr = new a();
    private final int enp = 9001;
    private GoogleSignInClient enq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/welcome/social/GoogleAuthViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "checkPlayServices", "", "welcome_release"})
    /* compiled from: GoogleAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final boolean bbA() {
            try {
                return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(d.Uo()) == 0;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "accessTokenResponse", "Lcom/iqoption/core/microservices/auth/response/AccessTokenResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: GoogleAuthViewModel.kt */
    static final class b<T> implements f<com.iqoption.core.microservices.auth.response.a> {
        final /* synthetic */ String $appKey;
        final /* synthetic */ c ens;
        final /* synthetic */ ObjectRef ent;
        final /* synthetic */ ObjectRef enu;
        final /* synthetic */ GoogleSignInAccount env;

        b(c cVar, ObjectRef objectRef, ObjectRef objectRef2, GoogleSignInAccount googleSignInAccount, String str) {
            this.ens = cVar;
            this.ent = objectRef;
            this.enu = objectRef2;
            this.env = googleSignInAccount;
            this.$appKey = str;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.auth.response.a aVar) {
            c cVar = this.ens;
            String str = (String) this.ent.element;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = (String) this.enu.element;
            if (str3 != null) {
                str2 = str3;
            }
            str3 = this.env.getEmail();
            if (str3 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(str3, "account.email!!");
            String id = this.env.getId();
            if (id == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(id, "account.id!!");
            String str4 = this.$appKey;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String YA = aVar.YA();
            Uri photoUrl = this.env.getPhotoUrl();
            cVar.a(str, str2, str3, id, str4, YA, photoUrl != null ? photoUrl.toString() : null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: GoogleAuthViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ c ens;

        c(c cVar) {
            this.ens = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.ens.baI().postValue(Boolean.valueOf(false));
        }
    }

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        if (!d.Un().Du() && enr.bbA()) {
            this.enq = GoogleSignIn.getClient(d.Uo(), new Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestServerAuthCode(d.Un().Dh()).requestScopes(new Scope("https://www.googleapis.com/auth/userinfo.email"), new Scope("https://www.googleapis.com/auth/userinfo.profile")).requestProfile().requestEmail().build());
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.enp) {
            Task signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
            kotlin.jvm.internal.i.e(signedInAccountFromIntent, "GoogleSignIn.getSignedInAccountFromIntent(data)");
            d(signedInAccountFromIntent);
        }
    }

    private final void d(Task<GoogleSignInAccount> task) {
        Object obj = "";
        try {
            Object result = task.getResult(ApiException.class);
            if (result == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(result, "result.getResult(ApiException::class.java)!!");
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) result;
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = obj;
            ObjectRef objectRef2 = new ObjectRef();
            objectRef2.element = obj;
            String displayName = googleSignInAccount.getDisplayName();
            if (displayName != null) {
                List b = v.b((CharSequence) displayName, new String[]{" "}, false, 0, 6, null);
                if (!(b == null || (b.isEmpty() ^ 1) == 0)) {
                    objectRef.element = (String) b.get(0);
                    if (b.size() > 1) {
                        obj = (String) b.get(1);
                    }
                    objectRef2.element = obj;
                }
            }
            String Dh = d.Un().Dh();
            com.iqoption.core.microservices.auth.a aVar = com.iqoption.core.microservices.auth.a.blA;
            String serverAuthCode = googleSignInAccount.getServerAuthCode();
            if (serverAuthCode == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(serverAuthCode, "account.serverAuthCode!!");
            io.reactivex.disposables.b a = aVar.ai(Dh, serverAuthCode).h(com.iqoption.core.rx.i.aki()).a((f) new b(this, objectRef, objectRef2, googleSignInAccount, Dh), (f) new c(this));
            kotlin.jvm.internal.i.e(a, "AuthRequests.getAccessTo…  }\n                    )");
            b(a);
        } catch (ApiException unused) {
            baI().postValue(Boolean.valueOf(false));
        }
    }

    public final void bs(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        GoogleSignInClient googleSignInClient = this.enq;
        if (googleSignInClient != null) {
            fragment.startActivityForResult(googleSignInClient.getSignInIntent(), this.enp);
        }
    }

    public final void logout() {
        GoogleSignInClient googleSignInClient = this.enq;
        if (googleSignInClient != null) {
            googleSignInClient.signOut();
        }
    }

    /* Access modifiers changed, original: protected */
    public SocialTypeId bby() {
        return SocialTypeId.GOOGLE_PLUS;
    }
}
