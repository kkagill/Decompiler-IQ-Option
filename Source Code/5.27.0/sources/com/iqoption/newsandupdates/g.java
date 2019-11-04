package com.iqoption.newsandupdates;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.busapi.response.b;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, bng = {"Lcom/iqoption/newsandupdates/NewsAndUpdatesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getSettings", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/newsandupdates/NewsAndUpdatesItem;", "setPersonalDataPolicy", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "policy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "Companion", "app_optionXRelease"})
/* compiled from: NewsAndUpdatesViewModel.kt */
public final class g extends AndroidViewModel {
    public static final a dJQ = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/newsandupdates/NewsAndUpdatesViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/newsandupdates/NewsAndUpdatesViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: NewsAndUpdatesViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g z(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…tesViewModel::class.java]");
            return (g) viewModel;
        }
    }

    public g(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final LiveData<List<f>> aQi() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        b Ed = com.iqoption.app.b.aK(getApplication()).Ed();
        kotlin.jvm.internal.i.e(Ed, "IQAccount.getInstance(ge…ion()).personalDataPolicy");
        f[] fVarArr = new f[4];
        Type type = Type.EMAIL;
        Boolean abw = Ed.abw();
        boolean z = true;
        fVarArr[0] = new f(type, R.string.email_notifications, R.string.email_notifications_description, abw != null ? abw.booleanValue() : true);
        type = Type.PUSH;
        Boolean abx = Ed.abx();
        fVarArr[1] = new f(type, R.string.push_notifications, R.string.news_and_updates_push_notifications_description, abx != null ? abx.booleanValue() : true);
        Type type2 = Type.CALL;
        Boolean aby = Ed.aby();
        fVarArr[2] = new f(type2, R.string.phone_calls, R.string.phone_calls_description, aby != null ? aby.booleanValue() : true);
        type2 = Type.THIRD_PARTY;
        Boolean abz = Ed.abz();
        if (abz != null) {
            z = abz.booleanValue();
        }
        fVarArr[3] = new f(type2, R.string.partners, R.string.i_let_iq_option_share, z);
        mutableLiveData.setValue(m.listOf(fVarArr));
        return mutableLiveData;
    }

    public final t<Void> b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "policy");
        return com.iqoption.core.microservices.busapi.a.bpm.b(bVar);
    }
}
