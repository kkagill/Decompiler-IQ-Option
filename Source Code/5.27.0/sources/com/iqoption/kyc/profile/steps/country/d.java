package com.iqoption.kyc.profile.steps.country;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.util.v;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.profile.steps.ProfileStep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u000eH\u0014J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\nH\u0016J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0014J\u001a\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002J\u0010\u00108\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0019XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006:"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "Lcom/iqoption/kyc/profile/steps/country/OnCountryCallbacks;", "()V", "adapter", "Lcom/iqoption/kyc/profile/steps/country/KycCountryAdapter;", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycCountryBinding;", "countries", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "countryViewModel", "Lcom/iqoption/kyc/profile/steps/country/KycCountryViewModel;", "isContinuePressedAnalytics", "", "()Z", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mode", "Lcom/iqoption/kyc/profile/steps/country/CountryMode;", "getMode", "()Lcom/iqoption/kyc/profile/steps/country/CountryMode;", "mode$delegate", "Lkotlin/Lazy;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "selectedCountry", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "applyData", "", "hasSearch", "onCountryChecked", "country", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onProfileUpdated", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "onViewCreated", "view", "showIsCitizenCheckIfNeeded", "updateItems", "validateAndSaveData", "Companion", "kyc_release"})
/* compiled from: KycCountryFragment.kt */
public final class d extends com.iqoption.kyc.profile.steps.a implements k {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "mode", "getMode()Lcom/iqoption/kyc/profile/steps/country/CountryMode;"))};
    public static final a dBX = new a();
    private HashMap apm;
    private LinearLayoutManager apt;
    private com.iqoption.core.microservices.configuration.a.c bIj;
    private List<com.iqoption.core.microservices.configuration.a.c> countries;
    private final kotlin.d dBT = g.c(new KycCountryFragment$mode$2(this));
    private com.iqoption.kyc.b.c dBU;
    private h dBV;
    private b dBW;
    private final String dtM = "PersonalData";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryFragment$Companion;", "", "()V", "ARG_COUNTRY_MODE", "", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "mode", "Lcom/iqoption/kyc/profile/steps/country/CountryMode;", "tag", "kyc_release"})
    /* compiled from: KycCountryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c a(CountryMode countryMode) {
            CountryMode countryMode2 = countryMode;
            kotlin.jvm.internal.i.f(countryMode2, "mode");
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_COUNTRY_MODE", countryMode2);
            return new com.iqoption.core.ui.d.c(b(countryMode2), d.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        public final String b(CountryMode countryMode) {
            kotlin.jvm.internal.i.f(countryMode, "mode");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.class.getName());
            stringBuilder.append(countryMode.name());
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: KycCountryFragment.kt */
    static final class c implements OnCheckedChangeListener {
        public static final c dBY = new c();

        c() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.d.EC().c("kyc_country-check-mark", z ? 1.0d : 0.0d);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((com.iqoption.core.microservices.configuration.a.c) t).getName(), ((com.iqoption.core.microservices.configuration.a.c) t2).getName());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycCountryFragment.kt */
    static final class b<T> implements Observer<List<? extends com.iqoption.core.microservices.configuration.a.c>> {
        final /* synthetic */ d this$0;

        b(d dVar) {
            this.this$0 = dVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.configuration.a.c> list) {
            this.this$0.countries = list;
            this.this$0.aMh();
        }
    }

    private final CountryMode aMf() {
        kotlin.d dVar = this.dBT;
        j jVar = anY[0];
        return (CountryMode) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIC() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dBV = h.dCc.aG(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBU = (com.iqoption.kyc.b.c) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_country, viewGroup, false, 4, null);
        com.iqoption.kyc.b.c cVar = this.dBU;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return cVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        int i = e.aob[aMf().ordinal()];
        boolean z = true;
        if (i == 1) {
            i = f.country_of_residence;
        } else if (i == 2) {
            i = f.your_citizenship;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        com.iqoption.kyc.b.c cVar = this.dBU;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.duB.setText(i);
        this.dBW = new b(this);
        com.iqoption.kyc.b.c cVar2 = this.dBU;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = cVar2.duz;
        String str2 = "binding.kycCountryList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        b bVar = this.dBW;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(bVar);
        this.apt = new LinearLayoutManager(com.iqoption.core.ext.a.q(this));
        cVar2 = this.dBU;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView = cVar2.duz;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        LinearLayoutManager linearLayoutManager = this.apt;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.i.lG("layoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        aMg();
        cVar2 = this.dBU;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = cVar2.duA;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.kycCountryProgress");
        contentLoadingProgressBar.setVisibility(0);
        i = e.axg[aMf().ordinal()];
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        h hVar = this.dBV;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("countryViewModel");
        }
        hVar.eO(z).observe(this, new b(this));
        cVar2 = this.dBU;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.dux.requestFocus();
        v.az(view);
    }

    private final void aMg() {
        String str = "binding.kycCountryCitizenCheck";
        String str2 = "binding";
        com.iqoption.kyc.b.c cVar;
        CheckBox checkBox;
        if (aMf() == CountryMode.RESIDENCE) {
            cVar = this.dBU;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            checkBox = cVar.duw;
            kotlin.jvm.internal.i.e(checkBox, str);
            com.iqoption.core.ext.a.ak(checkBox);
            cVar = this.dBU;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            cVar.duw.setOnCheckedChangeListener(c.dBY);
            return;
        }
        cVar = this.dBU;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        checkBox = cVar.duw;
        kotlin.jvm.internal.i.e(checkBox, str);
        com.iqoption.core.ext.a.al(checkBox);
    }

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        aMh();
    }

    private final void aMh() {
        List list = this.countries;
        com.iqoption.kyc.profile.a aLY = aLY();
        if (list != null && aLY != null) {
            Long aLS;
            Integer num;
            Object obj;
            com.iqoption.kyc.b.c cVar = this.dBU;
            String str = "binding";
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ContentLoadingProgressBar contentLoadingProgressBar = cVar.duA;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.kycCountryProgress");
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
            String str2 = "binding.kycCountryEmpty";
            String str3 = "binding.kycCountryList";
            RecyclerView recyclerView;
            TextView textView;
            if (list.isEmpty()) {
                cVar = this.dBU;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                CheckBox checkBox = cVar.duw;
                kotlin.jvm.internal.i.e(checkBox, "binding.kycCountryCitizenCheck");
                com.iqoption.core.ext.a.al(checkBox);
                cVar = this.dBU;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                recyclerView = cVar.duz;
                kotlin.jvm.internal.i.e(recyclerView, str3);
                com.iqoption.core.ext.a.al(recyclerView);
                cVar = this.dBU;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = cVar.duy;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.ak(textView);
            } else {
                cVar = this.dBU;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                recyclerView = cVar.duz;
                kotlin.jvm.internal.i.e(recyclerView, str3);
                com.iqoption.core.ext.a.ak(recyclerView);
                cVar = this.dBU;
                if (cVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = cVar.duy;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.al(textView);
                aMg();
            }
            if (aMf() == CountryMode.CITIZENSHIP) {
                aLS = aLY.aLS();
                if (aLS == null) {
                    aLS = aLY.YC();
                }
            } else {
                aLS = aLY.YC();
            }
            Iterator it = list.iterator();
            Object obj2;
            do {
                num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long longValue = ((com.iqoption.core.microservices.configuration.a.c) obj).getId().longValue();
                if (aLS != null && longValue == aLS.longValue()) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
            } while (obj2 == null);
            com.iqoption.core.microservices.configuration.a.c cVar2 = (com.iqoption.core.microservices.configuration.a.c) obj;
            if (cVar2 == null) {
                cVar2 = (com.iqoption.core.microservices.configuration.a.c) u.bV(list);
            }
            this.bIj = cVar2;
            ash();
            if (this.bIj != null) {
                b bVar = this.dBW;
                if (bVar == null) {
                    kotlin.jvm.internal.i.lG("adapter");
                }
                Iterable items = bVar.getItems();
                Collection arrayList = new ArrayList(n.e(items, 10));
                int i = 0;
                for (Object obj3 : items) {
                    int i2 = i + 1;
                    if (i < 0) {
                        m.bno();
                    }
                    arrayList.add(new Pair(Integer.valueOf(i), obj3));
                    i = i2;
                }
                for (Object next : (List) arrayList) {
                    Object obj4;
                    c cVar3 = (c) ((Pair) next).bni();
                    if ((cVar3 instanceof g) && kotlin.jvm.internal.i.y(((g) cVar3).LB(), this.bIj)) {
                        obj4 = 1;
                        continue;
                    } else {
                        obj4 = null;
                        continue;
                    }
                    if (obj4 != null) {
                        break;
                    }
                }
                Object next2 = null;
                Pair pair = (Pair) next2;
                if (pair != null) {
                    num = (Integer) pair.getFirst();
                }
                if (num != null) {
                    int intValue = num.intValue();
                    LinearLayoutManager linearLayoutManager = this.apt;
                    if (linearLayoutManager == null) {
                        kotlin.jvm.internal.i.lG("layoutManager");
                    }
                    linearLayoutManager.scrollToPosition(intValue);
                }
            }
        }
    }

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        com.iqoption.core.microservices.configuration.a.c cVar = this.bIj;
        if (cVar == null) {
            return false;
        }
        int i = e.aFX[aMf().ordinal()];
        if (i == 1) {
            com.iqoption.kyc.profile.a a;
            com.iqoption.kyc.a.a.a("kyc_country", aKn(), aKo(), aLX().Er(), cVar.getId().longValue(), cVar.acN());
            h hVar = this.dBV;
            if (hVar == null) {
                kotlin.jvm.internal.i.lG("countryViewModel");
            }
            hVar.eP(cVar.Er());
            com.iqoption.kyc.b.c cVar2 = this.dBU;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            CheckBox checkBox = cVar2.duw;
            kotlin.jvm.internal.i.e(checkBox, "binding.kycCountryCitizenCheck");
            if (checkBox.isChecked()) {
                a = com.iqoption.kyc.profile.a.a(aVar, null, null, null, null, cVar.getId(), cVar.getId(), cVar.getName(), null, null, null, 911, null);
            } else {
                a = com.iqoption.kyc.profile.a.a(aVar, null, null, null, null, cVar.getId(), null, null, null, null, null, 911, null);
            }
            aLX().p(a);
        } else if (i == 2) {
            aLX().p(com.iqoption.kyc.profile.a.a(aVar, null, null, null, null, null, cVar.getId(), cVar.getName(), null, null, null, 927, null));
        }
        return true;
    }

    public void g(com.iqoption.core.microservices.configuration.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "country");
        this.bIj = cVar;
        ash();
    }

    private final void ash() {
        List list = this.countries;
        if (list != null) {
            List arrayList = new ArrayList();
            Object obj = null;
            Character ch = (Character) null;
            for (com.iqoption.core.microservices.configuration.a.c cVar : u.a((Iterable) list, (Comparator) new d())) {
                char ad = x.ad(cVar.getName());
                if (ch == null || ch.charValue() != ad) {
                    if (ch != null) {
                        arrayList.add(new j(String.valueOf(ad)));
                    }
                    ch = Character.valueOf(ad);
                }
                boolean y = kotlin.jvm.internal.i.y(this.bIj, cVar);
                if (obj == null && y) {
                    obj = 1;
                }
                arrayList.add(new g(cVar, y));
            }
            b bVar = this.dBW;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG("adapter");
            }
            bVar.aG(arrayList);
        }
    }

    public String aKo() {
        return aMf() == CountryMode.CITIZENSHIP ? "InputCountry_Citizenship" : "InputCountry_Resident";
    }

    public boolean aKp() {
        return this.dxb;
    }

    public String aKn() {
        return this.dtM;
    }

    public ProfileStep aMb() {
        return aMf() == CountryMode.CITIZENSHIP ? ProfileStep.CITIZEN_COUNTRY : ProfileStep.COUNTRY;
    }
}
