package com.iqoption.chat.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/viewmodel/UserInfoViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "isReleased", "", "userInfo", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel$UserInfo;", "getUserInfo", "()Landroidx/lifecycle/LiveData;", "userInfoData", "Landroidx/lifecycle/MutableLiveData;", "loadUserInfo", "", "userId", "", "countryId", "Companion", "UserInfo", "chat_release"})
/* compiled from: UserInfoViewModel.kt */
public final class s extends com.iqoption.core.ui.f.d {
    private static final String TAG = s.class.getSimpleName();
    public static final a aZe = new a();
    private final MutableLiveData<b> aZd = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/chat/viewmodel/UserInfoViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "create", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "chat_release"})
    /* compiled from: UserInfoViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final s o(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(s.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…nfoViewModel::class.java]");
            return (s) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006%"}, bng = {"Lcom/iqoption/chat/viewmodel/UserInfoViewModel$UserInfo;", "", "id", "", "name", "", "avatarUrl", "registrationTime", "isVip", "", "flagUrl", "country", "isOnline", "(JLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Z)V", "getAvatarUrl", "()Ljava/lang/String;", "getCountry", "getFlagUrl", "getId", "()J", "()Z", "getName", "getRegistrationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"})
    /* compiled from: UserInfoViewModel.kt */
    public static final class b {
        private final long aZf;
        private final String aZg;
        private final boolean arU;
        private final boolean asB;
        private final String avatarUrl;
        private final String country;
        private final long id;
        private final String name;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.id == bVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, bVar.name) && kotlin.jvm.internal.i.y(this.avatarUrl, bVar.avatarUrl)) {
                        if ((this.aZf == bVar.aZf ? 1 : null) != null) {
                            if ((this.arU == bVar.arU ? 1 : null) != null && kotlin.jvm.internal.i.y(this.aZg, bVar.aZg) && kotlin.jvm.internal.i.y(this.country, bVar.country)) {
                                if ((this.asB == bVar.asB ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.id;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.name;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.avatarUrl;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j2 = this.aZf;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i3 = this.arU;
            if (i3 != 0) {
                i3 = 1;
            }
            i = (i + i3) * 31;
            str = this.aZg;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.country;
            if (str != null) {
                i2 = str.hashCode();
            }
            i = (i + i2) * 31;
            i3 = this.asB;
            if (i3 != 0) {
                i3 = 1;
            }
            return i + i3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UserInfo(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(", avatarUrl=");
            stringBuilder.append(this.avatarUrl);
            stringBuilder.append(", registrationTime=");
            stringBuilder.append(this.aZf);
            stringBuilder.append(", isVip=");
            stringBuilder.append(this.arU);
            stringBuilder.append(", flagUrl=");
            stringBuilder.append(this.aZg);
            stringBuilder.append(", country=");
            stringBuilder.append(this.country);
            stringBuilder.append(", isOnline=");
            stringBuilder.append(this.asB);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(long j, String str, String str2, long j2, boolean z, String str3, String str4, boolean z2) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(str4, "country");
            this.id = j;
            this.name = str;
            this.avatarUrl = str2;
            this.aZf = j2;
            this.arU = z;
            this.aZg = str3;
            this.country = str4;
            this.asB = z2;
        }

        public final String getName() {
            return this.name;
        }

        public final String Uh() {
            return this.avatarUrl;
        }

        public final long Ui() {
            return this.aZf;
        }

        public final boolean Em() {
            return this.arU;
        }

        public final String Uj() {
            return this.aZg;
        }

        public final String getCountry() {
            return this.country;
        }

        public final boolean Ey() {
            return this.asB;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "it", "", "apply"})
    /* compiled from: UserInfoViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c aZh = new c();

        c() {
        }

        /* renamed from: ak */
        public final com.iqoption.core.microservices.h.a.a apply(List<com.iqoption.core.microservices.h.a.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return (com.iqoption.core.microservices.h.a.a) u.bU(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel$UserInfo;", "profile", "Lcom/iqoption/core/data/model/UserProfile;", "availability", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "apply"})
    /* compiled from: UserInfoViewModel.kt */
    static final class d<T1, T2, R> implements io.reactivex.b.c<com.iqoption.core.data.model.f, com.iqoption.core.microservices.h.a.a, b> {
        public static final d aZi = new d();

        d() {
        }

        /* JADX WARNING: Missing block: B:7:0x0040, code skipped:
            if (r13 != null) goto L_0x0045;
     */
        /* renamed from: a */
        public final com.iqoption.chat.viewmodel.s.b apply(com.iqoption.core.data.model.f r13, com.iqoption.core.microservices.h.a.a r14) {
            /*
            r12 = this;
            r0 = "profile";
            kotlin.jvm.internal.i.f(r13, r0);
            r0 = "availability";
            kotlin.jvm.internal.i.f(r14, r0);
            r0 = new com.iqoption.chat.viewmodel.s$b;
            r2 = r13.getId();
            r4 = r13.getDisplayName();
            r5 = r13.Uh();
            r6 = r13.Ui();
            r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r6 = r6 * r8;
            r8 = r13.Em();
            r1 = com.iqoption.core.util.m.bQG;
            r9 = r13.LB();
            if (r9 == 0) goto L_0x0031;
        L_0x002c:
            r9 = r9.acO();
            goto L_0x0032;
        L_0x0031:
            r9 = 0;
        L_0x0032:
            r9 = r1.Y(r9);
            r13 = r13.LB();
            if (r13 == 0) goto L_0x0043;
        L_0x003c:
            r13 = r13.getName();
            if (r13 == 0) goto L_0x0043;
        L_0x0042:
            goto L_0x0045;
        L_0x0043:
            r13 = "";
        L_0x0045:
            r10 = r13;
            r13 = r14.getStatus();
            r14 = "online";
            r11 = kotlin.jvm.internal.i.y(r13, r14);
            r1 = r0;
            r1.<init>(r2, r4, r5, r6, r8, r9, r10, r11);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.viewmodel.s$d.apply(com.iqoption.core.data.model.f, com.iqoption.core.microservices.h.a.a):com.iqoption.chat.viewmodel.s$b");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel$UserInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: UserInfoViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<b> {
        final /* synthetic */ s aZj;

        e(s sVar) {
            this.aZj = sVar;
        }

        /* renamed from: b */
        public final void accept(b bVar) {
            this.aZj.aZd.postValue(bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: UserInfoViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f aZk = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final LiveData<b> Ug() {
        return this.aZd;
    }

    public final void o(long j, long j2) {
        p.a(com.iqoption.core.data.repository.i.bfa.aO(j), com.iqoption.core.microservices.h.a.bDf.a(j).t(c.aZh), d.aZi).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) f.aZk);
    }
}
