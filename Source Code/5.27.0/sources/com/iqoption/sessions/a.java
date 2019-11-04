package com.iqoption.sessions;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.config.Platform;
import com.iqoption.core.microservices.auth.response.g;
import com.iqoption.e.yt;
import com.iqoption.e.yv;
import com.iqoption.e.yx;
import com.iqoption.x.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001b\u001c\u001d\u001eBQ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012<\u0010\u0006\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000RD\u0010\u0006\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "items", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "terminateListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "sessions", "", "all", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MainItemViewHolder", "OtherItemViewHolder", "TitleViewHolder", "app_optionXRelease"})
/* compiled from: ActiveSessionsAdapter.kt */
public final class a extends Adapter<ViewHolder> {
    private static final DateFormat buo = new SimpleDateFormat("HH:mm, dd.MM", Locale.getDefault());
    private static final Map<Platform, Integer> dSC;
    private static final kotlin.d dSD = g.c(ActiveSessionsAdapter$Companion$appName$2.dSG);
    private static final Map<Platform, String> dSE;
    public static final a dSF = new a();
    private final m<List<g>, Boolean, l> dSB;
    private final List<g> iA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsAdapter$Companion;", "", "()V", "VIEW_TYPE_MAIN_ITEM", "", "VIEW_TYPE_OTHER_ITEM", "VIEW_TYPE_TITLE", "appName", "", "kotlin.jvm.PlatformType", "getAppName", "()Ljava/lang/String;", "appName$delegate", "Lkotlin/Lazy;", "dateFormat", "Ljava/text/DateFormat;", "iconPlatformMap", "", "Lcom/iqoption/config/Platform;", "namePlatformMap", "app_optionXRelease"})
    /* compiled from: ActiveSessionsAdapter.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "appName", "getAppName()Ljava/lang/String;"))};

        private final String aTN() {
            kotlin.d aTM = a.dSD;
            a aVar = a.dSF;
            j jVar = anY[0];
            return (String) aTM.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ActiveSessionsAdapter.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ a dSN;

        e(a aVar) {
            this.dSN = aVar;
        }

        public final void onClick(View view) {
            if (this.dSN.iA.size() > 1) {
                this.dSN.dSB.w(this.dSN.iA.subList(1, this.dSN.iA.size()), Boolean.valueOf(true));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsAdapter$MainItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/SessionMainItemBinding;", "listener", "Landroid/view/View$OnClickListener;", "(Lcom/iqoption/databinding/SessionMainItemBinding;Landroid/view/View$OnClickListener;)V", "getBinding", "()Lcom/iqoption/databinding/SessionMainItemBinding;", "getListener", "()Landroid/view/View$OnClickListener;", "bind", "", "session", "Lcom/iqoption/core/microservices/auth/response/Session;", "count", "", "app_optionXRelease"})
    /* compiled from: ActiveSessionsAdapter.kt */
    public static final class b extends ViewHolder {
        private final OnClickListener anf;
        private final yt dSH;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: ActiveSessionsAdapter.kt */
        /* renamed from: com.iqoption.sessions.a$b$1 */
        static final class AnonymousClass1 implements OnClickListener {
            final /* synthetic */ b dSI;

            AnonymousClass1(b bVar) {
                this.dSI = bVar;
            }

            public final void onClick(View view) {
                this.dSI.aTO().onClick(view);
            }
        }

        public b(yt ytVar, OnClickListener onClickListener) {
            kotlin.jvm.internal.i.f(ytVar, "binding");
            kotlin.jvm.internal.i.f(onClickListener, CastExtraArgs.LISTENER);
            super(ytVar.getRoot());
            this.dSH = ytVar;
            this.anf = onClickListener;
            this.dSH.cud.setOnClickListener(new AnonymousClass1(this));
        }

        public final OnClickListener aTO() {
            return this.anf;
        }

        public final void a(g gVar, int i) {
            kotlin.jvm.internal.i.f(gVar, "session");
            this.dSH.aRh.setImageResource(R.drawable.ic_android_24dp);
            TextView textView = this.dSH.cuc;
            kotlin.jvm.internal.i.e(textView, "binding.platformApp");
            n nVar = n.eWf;
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.dSF.aTN());
            stringBuilder.append(" Android %s");
            Object[] objArr = new Object[]{"5.27.0"};
            String format = String.format(locale, stringBuilder.toString(), Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
            textView.setText(format);
            int i2 = 8;
            String str = "binding.userAgent";
            if (TextUtils.isEmpty(gVar.Zm())) {
                textView = this.dSH.cue;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setVisibility(8);
            } else {
                textView = this.dSH.cue;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setText(gVar.Zm());
            }
            textView = this.dSH.cub;
            kotlin.jvm.internal.i.e(textView, "binding.ip");
            textView.setText(gVar.Zn().Zo());
            TextView textView2 = this.dSH.cud;
            kotlin.jvm.internal.i.e(textView2, "binding.terminateButton");
            if (i > 1) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012<\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RG\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsAdapter$OtherItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/SessionOtherItemBinding;", "terminateListener", "Lkotlin/Function2;", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "Lkotlin/ParameterName;", "name", "sessions", "", "all", "", "(Lcom/iqoption/databinding/SessionOtherItemBinding;Lkotlin/jvm/functions/Function2;)V", "getBinding", "()Lcom/iqoption/databinding/SessionOtherItemBinding;", "getTerminateListener", "()Lkotlin/jvm/functions/Function2;", "bind", "session", "app_optionXRelease"})
    /* compiled from: ActiveSessionsAdapter.kt */
    public static final class c extends ViewHolder {
        private final m<List<g>, Boolean, l> dSB;
        private final yv dSJ;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: ActiveSessionsAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ c dSK;
            final /* synthetic */ g dSL;

            a(c cVar, g gVar) {
                this.dSK = cVar;
                this.dSL = gVar;
            }

            public final void onClick(View view) {
                m aTP = this.dSK.aTP();
                List singletonList = Collections.singletonList(this.dSL);
                kotlin.jvm.internal.i.e(singletonList, "Collections.singletonList(session)");
                aTP.w(singletonList, Boolean.valueOf(false));
            }
        }

        public c(yv yvVar, m<? super List<g>, ? super Boolean, l> mVar) {
            kotlin.jvm.internal.i.f(yvVar, "binding");
            kotlin.jvm.internal.i.f(mVar, "terminateListener");
            super(yvVar.getRoot());
            this.dSJ = yvVar;
            this.dSB = mVar;
        }

        public final m<List<g>, Boolean, l> aTP() {
            return this.dSB;
        }

        public final void a(g gVar) {
            kotlin.jvm.internal.i.f(gVar, "session");
            Integer num = (Integer) a.dSC.get(gVar.Zn().Dx());
            this.dSJ.aRh.setImageResource(num != null ? num.intValue() : 0);
            TextView textView = this.dSJ.cuc;
            kotlin.jvm.internal.i.e(textView, "binding.platformApp");
            String str = (String) a.dSE.get(gVar.Zn().Dx());
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            str = "binding.userAgent";
            if (TextUtils.isEmpty(gVar.Zm())) {
                textView = this.dSJ.cue;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setVisibility(8);
            } else {
                textView = this.dSJ.cue;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setText(gVar.Zm());
            }
            textView = this.dSJ.cub;
            kotlin.jvm.internal.i.e(textView, "binding.ip");
            textView.setText(gVar.Zn().Zo());
            textView = this.dSJ.anC;
            kotlin.jvm.internal.i.e(textView, "binding.date");
            textView.setText(a.buo.format(new Date(gVar.Zn().ki() * ((long) 1000))));
            this.dSJ.cuf.setOnClickListener(new a(this, gVar));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/SessionTitleBinding;", "(Lcom/iqoption/databinding/SessionTitleBinding;)V", "getBinding", "()Lcom/iqoption/databinding/SessionTitleBinding;", "bind", "", "stringRes", "", "app_optionXRelease"})
    /* compiled from: ActiveSessionsAdapter.kt */
    public static final class d extends ViewHolder {
        private final yx dSM;

        public d(yx yxVar) {
            kotlin.jvm.internal.i.f(yxVar, "binding");
            super(yxVar.getRoot());
            this.dSM = yxVar;
        }

        public final void fY(int i) {
            this.dSM.alH.setText(i);
        }
    }

    public int getItemViewType(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                return 3;
            }
        }
        return 1;
    }

    public a(List<g> list, m<? super List<g>, ? super Boolean, l> mVar) {
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(mVar, "terminateListener");
        this.iA = list;
        this.dSB = mVar;
        setHasStableIds(true);
    }

    static {
        r1 = new Pair[18];
        Platform platform = Platform.ANDROID_HODLY;
        Integer valueOf = Integer.valueOf(R.drawable.ic_android_24dp);
        r1[0] = new Pair(platform, valueOf);
        Platform platform2 = Platform.WEB_HODLY;
        Integer valueOf2 = Integer.valueOf(R.drawable.ic_laptop_24dp);
        r1[1] = new Pair(platform2, valueOf2);
        Platform platform3 = Platform.IOS_HODLY;
        Integer valueOf3 = Integer.valueOf(R.drawable.ic_apple);
        r1[2] = new Pair(platform3, valueOf3);
        r1[3] = new Pair(Platform.ANDROID, valueOf);
        r1[4] = new Pair(Platform.ANDROID_X, valueOf);
        r1[5] = new Pair(Platform.IOS, valueOf3);
        r1[6] = new Pair(Platform.IOS_BROKER, valueOf3);
        r1[7] = new Pair(Platform.WEB, valueOf2);
        r1[8] = new Pair(Platform.WIN_GL, valueOf2);
        r1[9] = new Pair(Platform.WEB_WALLET, valueOf2);
        r1[10] = new Pair(Platform.WEB_MOBILE, Integer.valueOf(R.drawable.ic_smartphone_24dp));
        r1[11] = new Pair(Platform.WEB_GL, valueOf2);
        r1[12] = new Pair(Platform.MAC_GL, valueOf2);
        r1[13] = new Pair(Platform.LINUX_GL, valueOf2);
        r1[14] = new Pair(Platform.ANDROID_8X_TRADE, valueOf);
        r1[15] = new Pair(Platform.MAC_GL_8X_TRADE, valueOf2);
        r1[16] = new Pair(Platform.WEB_GL_8X_TRADE, valueOf2);
        r1[17] = new Pair(Platform.WIN_GL_8X_TRADE, valueOf2);
        dSC = af.a(r1);
        Pair[] pairArr = new Pair[18];
        pairArr[0] = new Pair(Platform.ANDROID_HODLY, "Hodly Android");
        pairArr[1] = new Pair(Platform.WEB_HODLY, "Hodly Web");
        pairArr[2] = new Pair(Platform.IOS_HODLY, "Hodly IOS");
        pairArr[3] = new Pair(Platform.ANDROID, "IQ Option Android");
        pairArr[4] = new Pair(Platform.ANDROID_X, "IQ Option X Android");
        pairArr[5] = new Pair(Platform.IOS, "IQ Option IOS");
        pairArr[6] = new Pair(Platform.IOS_BROKER, "IQ Broker IOS");
        pairArr[7] = new Pair(Platform.WEB, "IQ Option Web");
        pairArr[8] = new Pair(Platform.WIN_GL, "IQ Option Win GL");
        pairArr[9] = new Pair(Platform.WEB_MOBILE, "IQ Option Web Mobile");
        pairArr[10] = new Pair(Platform.WEB_GL, "IQ Option WEB");
        pairArr[11] = new Pair(Platform.WEB_WALLET, "IQ Option WEB");
        pairArr[12] = new Pair(Platform.MAC_GL, "IQ Option Mac OS");
        pairArr[13] = new Pair(Platform.LINUX_GL, "IQ Option Linux");
        Platform platform4 = Platform.ANDROID_8X_TRADE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dSF.aTN());
        stringBuilder.append(" Android");
        pairArr[14] = new Pair(platform4, stringBuilder.toString());
        platform4 = Platform.MAC_GL_8X_TRADE;
        stringBuilder = new StringBuilder();
        stringBuilder.append(dSF.aTN());
        stringBuilder.append(" Mac OS");
        pairArr[15] = new Pair(platform4, stringBuilder.toString());
        platform4 = Platform.WEB_GL_8X_TRADE;
        stringBuilder = new StringBuilder();
        stringBuilder.append(dSF.aTN());
        stringBuilder.append(" WEB");
        pairArr[16] = new Pair(platform4, stringBuilder.toString());
        platform4 = Platform.WIN_GL_8X_TRADE;
        stringBuilder = new StringBuilder();
        stringBuilder.append(dSF.aTN());
        stringBuilder.append(" Win GL");
        pairArr[17] = new Pair(platform4, stringBuilder.toString());
        dSE = af.a(pairArr);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        ViewDataBinding inflate;
        if (i == 1) {
            inflate = DataBindingUtil.inflate(from, R.layout.session_title, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…ion_title, parent, false)");
            return new d((yx) inflate);
        } else if (i == 2) {
            inflate = DataBindingUtil.inflate(from, R.layout.session_main_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…main_item, parent, false)");
            return new b((yt) inflate, new e(this));
        } else if (i == 3) {
            inflate = DataBindingUtil.inflate(from, R.layout.session_other_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…ther_item, parent, false)");
            return new c((yv) inflate, this.dSB);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unimplemented view type ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public long getItemId(int i) {
        return getItemViewType(i) == 1 ? -((long) i) : (long) i;
    }

    public int getItemCount() {
        if (this.iA.isEmpty()) {
            return 0;
        }
        if (this.iA.size() == 1) {
            return 2;
        }
        return this.iA.size() + 2;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        if (i == 0) {
            ((d) viewHolder).fY(R.string.current_session);
        } else if (i == 1) {
            ((b) viewHolder).a((g) this.iA.get(0), this.iA.size());
        } else if (i != 2) {
            ((c) viewHolder).a((g) this.iA.get(i - 2));
        } else {
            ((d) viewHolder).fY(R.string.active_sessions);
        }
    }
}
