package com.iqoption.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.dialogs.b.q;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/dialogs/SimpleDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/dialogs/databinding/DialogSimpleBinding;", "config", "Lcom/iqoption/dialogs/SimpleDialog$Config;", "close", "", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "shakeAnimation", "ActionConfig", "Companion", "Config", "Styling", "dialogs_release"})
/* compiled from: SimpleDialog.kt */
public final class f extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    private static final d cLq = new d(com.iqoption.dialogs.d.a.black_40, com.iqoption.dialogs.d.c.simple_dialog_bg, com.iqoption.dialogs.d.a.black, com.iqoption.dialogs.d.a.black, com.iqoption.dialogs.d.a.black, com.iqoption.dialogs.d.a.black, com.iqoption.dialogs.d.a.black);
    private static final d cLr = new d(com.iqoption.dialogs.d.a.black_40, com.iqoption.dialogs.d.c.simple_dialog_bg_dark, com.iqoption.dialogs.d.a.white, com.iqoption.dialogs.d.a.grey_blue, com.iqoption.dialogs.d.a.grey_blue, com.iqoption.dialogs.d.a.white, com.iqoption.dialogs.d.a.white);
    private static final d cLs = new d(com.iqoption.dialogs.d.a.black_40, com.iqoption.dialogs.d.c.simple_dialog_bg_dark, com.iqoption.dialogs.d.a.white, com.iqoption.dialogs.d.a.grey_blue, com.iqoption.dialogs.d.a.grey_blue, com.iqoption.dialogs.d.a.green, com.iqoption.dialogs.d.a.green);
    public static final b cLt = new b();
    private HashMap apm;
    private c cLo;
    private q cLp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, bng = {"Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "onClick", "", "dialog", "Lcom/iqoption/dialogs/SimpleDialog;", "dialogs_release"})
    /* compiled from: SimpleDialog.kt */
    public interface a {
        void a(f fVar);

        CharSequence getLabel();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/dialogs/SimpleDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "THEME_DARK", "Lcom/iqoption/dialogs/SimpleDialog$Styling;", "getTHEME_DARK", "()Lcom/iqoption/dialogs/SimpleDialog$Styling;", "THEME_DARK_GREEN_BUTTONS", "getTHEME_DARK_GREEN_BUTTONS", "THEME_LIGHT", "getTHEME_LIGHT", "newInstance", "Lcom/iqoption/dialogs/SimpleDialog;", "config", "Lcom/iqoption/dialogs/SimpleDialog$Config;", "dialogs_release"})
    /* compiled from: SimpleDialog.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final String Bx() {
            return f.TAG;
        }

        public final d auF() {
            return f.cLq;
        }

        public final f a(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "config");
            f fVar = new f();
            fVar.setRetainInstance(true);
            fVar.cLo = cVar;
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001e"}, bng = {"Lcom/iqoption/dialogs/SimpleDialog$Config;", "", "actionConfig1", "Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "getActionConfig1", "()Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "actionConfig2", "getActionConfig2", "closeable", "", "getCloseable", "()Z", "info", "", "getInfo", "()Ljava/lang/CharSequence;", "maxWidth", "", "getMaxWidth", "()I", "styling", "Lcom/iqoption/dialogs/SimpleDialog$Styling;", "getStyling", "()Lcom/iqoption/dialogs/SimpleDialog$Styling;", "text", "getText", "title", "getTitle", "onDismiss", "", "dialogs_release"})
    /* compiled from: SimpleDialog.kt */
    public interface c {

        @i(bne = {1, 1, 15})
        /* compiled from: SimpleDialog.kt */
        public static final class a {
            public static CharSequence b(c cVar) {
                return null;
            }

            public static boolean c(c cVar) {
                return true;
            }

            public static void e(c cVar) {
            }

            public static int d(c cVar) {
                return com.iqoption.dialogs.d.b.dp280;
            }
        }

        d apC();

        a apD();

        a apE();

        boolean apF();

        CharSequence apG();

        int getMaxWidth();

        CharSequence getText();

        CharSequence getTitle();

        void onDismiss();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, bng = {"Lcom/iqoption/dialogs/SimpleDialog$Styling;", "", "veilColor", "", "bgColor", "titleColor", "textColor", "infoColor", "button1Color", "button2Color", "(IIIIIII)V", "getBgColor", "()I", "getButton1Color", "getButton2Color", "getInfoColor", "getTextColor", "getTitleColor", "getVeilColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "dialogs_release"})
    /* compiled from: SimpleDialog.kt */
    public static final class d {
        private final int bgColor;
        private final int cLu;
        private final int cLv;
        private final int cLw;
        private final int cLx;
        private final int cLy;
        private final int textColor;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if ((this.cLu == dVar.cLu ? 1 : null) != null) {
                        if ((this.bgColor == dVar.bgColor ? 1 : null) != null) {
                            if ((this.cLv == dVar.cLv ? 1 : null) != null) {
                                if ((this.textColor == dVar.textColor ? 1 : null) != null) {
                                    if ((this.cLw == dVar.cLw ? 1 : null) != null) {
                                        if ((this.cLx == dVar.cLx ? 1 : null) != null) {
                                            if ((this.cLy == dVar.cLy ? 1 : null) != null) {
                                                return true;
                                            }
                                        }
                                    }
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
            return (((((((((((this.cLu * 31) + this.bgColor) * 31) + this.cLv) * 31) + this.textColor) * 31) + this.cLw) * 31) + this.cLx) * 31) + this.cLy;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Styling(veilColor=");
            stringBuilder.append(this.cLu);
            stringBuilder.append(", bgColor=");
            stringBuilder.append(this.bgColor);
            stringBuilder.append(", titleColor=");
            stringBuilder.append(this.cLv);
            stringBuilder.append(", textColor=");
            stringBuilder.append(this.textColor);
            stringBuilder.append(", infoColor=");
            stringBuilder.append(this.cLw);
            stringBuilder.append(", button1Color=");
            stringBuilder.append(this.cLx);
            stringBuilder.append(", button2Color=");
            stringBuilder.append(this.cLy);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.cLu = i;
            this.bgColor = i2;
            this.cLv = i3;
            this.textColor = i4;
            this.cLw = i5;
            this.cLx = i6;
            this.cLy = i7;
        }

        public final int auG() {
            return this.cLu;
        }

        public final int auH() {
            return this.bgColor;
        }

        public final int getTitleColor() {
            return this.cLv;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int auI() {
            return this.cLw;
        }

        public final int auJ() {
            return this.cLx;
        }

        public final int auK() {
            return this.cLy;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/SimpleDialog$onCreateView$1$1"})
    /* compiled from: SimpleDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ c cLA;
        final /* synthetic */ f cLz;

        e(f fVar, c cVar) {
            this.cLz = fVar;
            this.cLA = cVar;
        }

        public final void onClick(View view) {
            if (this.cLA.apF()) {
                this.cLz.close();
            } else {
                this.cLz.auD();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/SimpleDialog$onCreateView$1$5$1", "com/iqoption/dialogs/SimpleDialog$$special$$inlined$apply$lambda$1"})
    /* compiled from: SimpleDialog.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ c cLA;
        final /* synthetic */ a cLB;
        final /* synthetic */ q cLC;
        final /* synthetic */ f cLz;

        f(a aVar, q qVar, f fVar, c cVar) {
            this.cLB = aVar;
            this.cLC = qVar;
            this.cLz = fVar;
            this.cLA = cVar;
        }

        public final void onClick(View view) {
            this.cLB.a(this.cLz);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/SimpleDialog$onCreateView$1$6$1", "com/iqoption/dialogs/SimpleDialog$$special$$inlined$let$lambda$1"})
    /* compiled from: SimpleDialog.kt */
    static final class g implements OnClickListener {
        final /* synthetic */ c cLA;
        final /* synthetic */ q cLC;
        final /* synthetic */ a cLD;
        final /* synthetic */ f cLz;

        g(a aVar, q qVar, f fVar, c cVar) {
            this.cLD = aVar;
            this.cLC = qVar;
            this.cLz = fVar;
            this.cLA = cVar;
        }

        public final void onClick(View view) {
            this.cLD.a(this.cLz);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String simpleName = e.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RateUsDialog::class.java.simpleName");
        TAG = simpleName;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.a.a(com.iqoption.core.ui.animation.transitions.c.bHB, this, 0, 2, null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        c cVar = this.cLo;
        if (cVar == null) {
            return null;
        }
        TextView textView;
        TextView textView2;
        q qVar = (q) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.dialogs.d.e.dialog_simple, viewGroup, false, 4, null);
        this.cLp = qVar;
        ViewDataBinding viewDataBinding = qVar;
        qVar.aHP.setBackgroundColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().auG()));
        qVar.aIv.setBackgroundResource(cVar.apC().auH());
        qVar.alH.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().getTitleColor()));
        qVar.ani.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().getTextColor()));
        qVar.cMy.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().auI()));
        qVar.cMw.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().auJ()));
        qVar.cMx.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, cVar.apC().auK()));
        ConstraintLayout constraintLayout = qVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout, "content");
        constraintLayout.setMaxWidth(cVar.getMaxWidth());
        qVar.aHP.setOnClickListener(new e(this, cVar));
        CharSequence title = cVar.getTitle();
        String str = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
        if (title != null) {
            textView = qVar.alH;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(title);
        } else {
            textView2 = qVar.alH;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
        }
        title = cVar.getText();
        str = "text";
        if (title != null) {
            textView = qVar.ani;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(title);
        } else {
            textView2 = qVar.ani;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
        }
        title = cVar.apG();
        str = "info";
        if (title != null) {
            textView = qVar.cMy;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(title);
        } else {
            textView2 = qVar.cMy;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
        }
        a apD = cVar.apD();
        TextView textView3 = qVar.cMw;
        kotlin.jvm.internal.i.e(textView3, "btnAction1");
        textView3.setText(apD.getLabel());
        qVar.cMw.setOnClickListener(new f(apD, qVar, this, cVar));
        apD = cVar.apE();
        str = "btnAction2";
        if (apD != null) {
            textView = qVar.cMx;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(apD.getLabel());
            qVar.cMx.setOnClickListener(new g(apD, qVar, this, cVar));
        } else {
            TextView textView4 = qVar.cMx;
            kotlin.jvm.internal.i.e(textView4, str);
            com.iqoption.core.ext.a.al(textView4);
        }
        return qVar.getRoot();
    }

    private final void auD() {
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        int bi = com.iqoption.core.util.b.bi(context);
        q qVar = this.cLp;
        if (qVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ConstraintLayout constraintLayout = qVar.aIv;
        kotlin.jvm.internal.i.e(constraintLayout, "binding.content");
        com.iqoption.core.util.b.o(constraintLayout, bi);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (isRemoving()) {
            c cVar = this.cLo;
            if (cVar != null) {
                cVar.onDismiss();
            }
        }
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        c cVar = this.cLo;
        if (cVar == null || cVar.apF()) {
            return false;
        }
        auD();
        return true;
    }

    public final void close() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && !fragmentManager.isStateSaved() && !fragmentManager.isDestroyed()) {
            fragmentManager.popBackStack();
        }
    }
}
