package com.iqoption.debugmenu.debugmenu;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.data.config.ApiConfig.Type;
import com.iqoption.core.util.v;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import okhttp3.Request.Builder;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/debugmenu/debugmenu/SandboxFragment;", "Landroidx/fragment/app/Fragment;", "()V", "applySandbox", "Landroid/view/View;", "mButtonInt", "Landroid/widget/ToggleButton;", "mButtonProd", "mButtonSandbox", "mContainerAdapter", "Lcom/iqoption/debugmenu/debugmenu/SandboxFragment$ContainerAdapter;", "mFilter", "Landroid/widget/EditText;", "mHostEdit", "mList", "Landroid/widget/ListView;", "mProjects", "Landroid/widget/TextView;", "mSandboxContainer", "progress", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "unselectedButton", "ContainerAdapter", "debugmenu_release"})
/* compiled from: SandboxFragment.kt */
public final class f extends Fragment {
    private HashMap apm;
    private EditText cwo;
    private ToggleButton cwp;
    private ToggleButton cwq;
    private ToggleButton cwr;
    private View cws;
    private EditText cwt;
    private TextView cwu;
    private a cwv;
    private View cww;
    private View cwx;
    private ListView mList;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/SandboxFragment$ContainerAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "(Lcom/iqoption/debugmenu/debugmenu/SandboxFragment;)V", "containerEntityArrayList", "", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity;", "filteredContainerEntityArrayList", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setList", "", "list", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$List;", "debugmenu_release"})
    /* compiled from: SandboxFragment.kt */
    public final class a extends BaseAdapter implements Filterable {
        private List<ContainerEntity> cwy = m.emptyList();
        private List<ContainerEntity> cwz = m.emptyList();

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0014¨\u0006\n"}, bng = {"com/iqoption/debugmenu/debugmenu/SandboxFragment$ContainerAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraintInput", "", "publishResults", "", "constraint", "results", "debugmenu_release"})
        /* compiled from: SandboxFragment.kt */
        public static final class a extends Filter {
            final /* synthetic */ a cwB;

            a(a aVar) {
                this.cwB = aVar;
            }

            /* Access modifiers changed, original: protected */
            public void publishResults(CharSequence charSequence, FilterResults filterResults) {
                kotlin.jvm.internal.i.f(charSequence, "constraint");
                kotlin.jvm.internal.i.f(filterResults, "results");
                a aVar = this.cwB;
                Object obj = filterResults.values;
                if (obj != null) {
                    aVar.cwz = (ArrayList) obj;
                    this.cwB.notifyDataSetChanged();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.iqoption.debugmenu.debugmenu.ContainerEntity>");
            }

            /* Access modifiers changed, original: protected */
            public FilterResults performFiltering(CharSequence charSequence) {
                kotlin.jvm.internal.i.f(charSequence, "constraintInput");
                FilterResults filterResults = new FilterResults();
                ArrayList arrayList = new ArrayList();
                String obj = charSequence.toString();
                String str = "null cannot be cast to non-null type java.lang.String";
                if (obj != null) {
                    obj = obj.toLowerCase();
                    String str2 = "(this as java.lang.String).toLowerCase()";
                    kotlin.jvm.internal.i.e(obj, str2);
                    charSequence = obj;
                    for (ContainerEntity containerEntity : this.cwB.cwy) {
                        String hostName = containerEntity.aob().getHostName();
                        if (hostName != null) {
                            hostName = hostName.toLowerCase();
                            kotlin.jvm.internal.i.e(hostName, str2);
                            if (v.b((CharSequence) hostName, (CharSequence) charSequence.toString(), false, 2, null)) {
                                arrayList.add(containerEntity);
                            }
                        } else {
                            throw new TypeCastException(str);
                        }
                    }
                    filterResults.count = arrayList.size();
                    filterResults.values = arrayList;
                    return filterResults;
                }
                throw new TypeCastException(str);
            }
        }

        public final void a(ContainerEntity.List list) {
            kotlin.jvm.internal.i.f(list, "list");
            this.cwy = list;
        }

        public int getCount() {
            if ((this.cwz.isEmpty() ^ 1) != 0) {
                return this.cwz.size();
            }
            return this.cwy.size();
        }

        /* renamed from: fw */
        public ContainerEntity getItem(int i) {
            if ((this.cwz.isEmpty() ^ 1) != 0) {
                return (ContainerEntity) this.cwz.get(i);
            }
            return (ContainerEntity) this.cwy.get(i);
        }

        public long getItemId(int i) {
            if ((this.cwz.isEmpty() ^ 1) != 0) {
                return ((ContainerEntity) this.cwz.get(i)).getId();
            }
            return ((ContainerEntity) this.cwy.get(i)).getId();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            kotlin.jvm.internal.i.f(view, "convertView");
            kotlin.jvm.internal.i.f(viewGroup, "parent");
            view = LayoutInflater.from(f.this.getContext()).inflate(17367043, null);
            TextView textView = (TextView) view.findViewById(16908308);
            ContainerEntity fw = getItem(i);
            kotlin.jvm.internal.i.e(textView, "textView");
            textView.setText(fw.aob().getHostName());
            textView.setEnabled(fw.isSuccess());
            kotlin.jvm.internal.i.e(view, "rowView");
            return view;
        }

        public Filter getFilter() {
            return new a(this);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: SandboxFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ f cwA;

        b(f fVar) {
            this.cwA = fVar;
        }

        public final void onClick(View view) {
            this.cwA.aoh();
            f.b(this.cwA).setChecked(true);
            f.c(this.cwA).setText(a.cvl);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: SandboxFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ f cwA;

        e(f fVar) {
            this.cwA = fVar;
        }

        public final void onClick(View view) {
            this.cwA.aoh();
            f.d(this.cwA).setChecked(true);
            f.c(this.cwA).setText(a.cvk);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: SandboxFragment.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ f cwA;

        f(f fVar) {
            this.cwA = fVar;
        }

        public final void onClick(View view) {
            this.cwA.aoh();
            f.e(this.cwA).setChecked(true);
            f.c(this.cwA).setText(a.cvm);
            f.c(this.cwA).setSelection(12);
            f.c(this.cwA).requestFocus();
            v.b(this.cwA.getContext(), f.c(this.cwA));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: SandboxFragment.kt */
    static final class g implements OnClickListener {
        final /* synthetic */ f cwA;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: SandboxFragment.kt */
        /* renamed from: com.iqoption.debugmenu.debugmenu.f$g$1 */
        static final class AnonymousClass1 implements io.reactivex.b.a {
            final /* synthetic */ g cwD;

            AnonymousClass1(g gVar) {
                this.cwD = gVar;
            }

            public final void run() {
                com.iqoption.core.d.EH().Io();
                com.iqoption.core.d.EH().In();
                if (this.cwD.cwA.isAdded()) {
                    f.f(this.cwD.cwA).setVisibility(8);
                    f.g(this.cwD.cwA).setEnabled(false);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Host changed = ");
                stringBuilder.append(f.c(this.cwD.cwA).getText().toString());
                com.iqoption.core.d.a(stringBuilder.toString(), 0, 2, null);
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: SandboxFragment.kt */
        /* renamed from: com.iqoption.debugmenu.debugmenu.f$g$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<Throwable> {
            final /* synthetic */ g cwD;

            AnonymousClass2(g gVar) {
                this.cwD = gVar;
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
                if (this.cwD.cwA.isAdded()) {
                    f.f(this.cwD.cwA).setVisibility(8);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to change host to ");
                    stringBuilder.append(f.c(this.cwD.cwA).getText().toString());
                    com.iqoption.core.d.a(stringBuilder.toString(), 0, 2, null);
                }
            }
        }

        g(f fVar) {
            this.cwA = fVar;
        }

        public final void onClick(View view) {
            String obj = f.c(this.cwA).getText().toString();
            if (u.b(obj, "/", false, 2, null)) {
                Type type;
                f.f(this.cwA).setVisibility(0);
                if (f.d(this.cwA).isChecked()) {
                    type = Type.PROD;
                } else if (f.b(this.cwA).isChecked()) {
                    type = Type.INT;
                } else {
                    type = Type.SANDBOX;
                }
                a.b(f.c(this.cwA).getText().toString(), type).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new AnonymousClass1(this), new AnonymousClass2(this));
                return;
            }
            EditText c = f.c(this.cwA);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(obj);
            stringBuilder.append('/');
            c.setText(stringBuilder.toString());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, bng = {"com/iqoption/debugmenu/debugmenu/SandboxFragment$onViewCreated$5", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "debugmenu_release"})
    /* compiled from: SandboxFragment.kt */
    public static final class h implements TextWatcher {
        final /* synthetic */ f cwA;

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
        }

        h(f fVar) {
            this.cwA = fVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
            f.g(this.cwA).setEnabled(true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, bng = {"com/iqoption/debugmenu/debugmenu/SandboxFragment$onViewCreated$6", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "debugmenu_release"})
    /* compiled from: SandboxFragment.kt */
    public static final class i implements TextWatcher {
        final /* synthetic */ f cwA;

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
        }

        i(f fVar) {
            this.cwA = fVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
            f.h(this.cwA).getFilter().filter(charSequence);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/AdapterView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "<anonymous parameter 3>", "", "onItemClick"})
    /* compiled from: SandboxFragment.kt */
    static final class j implements OnItemClickListener {
        final /* synthetic */ f cwA;

        j(f fVar) {
            this.cwA = fVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ContainerEntity fw = f.h(this.cwA).getItem(i);
            if (fw.isSuccess()) {
                f.c(this.cwA).setText(fw.aob().getHostName());
                f.i(this.cwA).setText(fw.toString());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"})
    /* compiled from: SandboxFragment.kt */
    static final class k implements OnTouchListener {
        public static final k cwE = new k();

        k() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.i.e(view, "v");
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$List;", "call"})
    /* compiled from: SandboxFragment.kt */
    static final class l<V> implements Callable<T> {
        final /* synthetic */ String cwF;

        l(String str) {
            this.cwF = str;
        }

        /* renamed from: aoi */
        public final ContainerEntity.List call() {
            com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
            Builder builder = new Builder().url(this.cwF).get();
            kotlin.jvm.internal.i.e(builder, "Request.Builder().url(sandBoxBuildsUrl).get()");
            return (ContainerEntity.List) com.iqoption.core.connect.http.c.a(cVar, builder, SandboxFragment$onViewCreated$9$1.cwG, null, null, 12, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "response", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$List;", "accept"})
    /* compiled from: SandboxFragment.kt */
    static final class c<T> implements io.reactivex.b.f<ContainerEntity.List> {
        final /* synthetic */ f cwA;

        c(f fVar) {
            this.cwA = fVar;
        }

        /* renamed from: b */
        public final void accept(ContainerEntity.List list) {
            if (this.cwA.isAdded() && list != null && !list.isEmpty()) {
                f.h(this.cwA).a(list);
                f.h(this.cwA).notifyDataSetChanged();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SandboxFragment.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d cwC = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ ToggleButton b(f fVar) {
        ToggleButton toggleButton = fVar.cwp;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonInt");
        }
        return toggleButton;
    }

    public static final /* synthetic */ EditText c(f fVar) {
        EditText editText = fVar.cwo;
        if (editText == null) {
            kotlin.jvm.internal.i.lG("mHostEdit");
        }
        return editText;
    }

    public static final /* synthetic */ ToggleButton d(f fVar) {
        ToggleButton toggleButton = fVar.cwq;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonProd");
        }
        return toggleButton;
    }

    public static final /* synthetic */ ToggleButton e(f fVar) {
        ToggleButton toggleButton = fVar.cwr;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonSandbox");
        }
        return toggleButton;
    }

    public static final /* synthetic */ View f(f fVar) {
        View view = fVar.cwx;
        if (view == null) {
            kotlin.jvm.internal.i.lG(NotificationCompat.CATEGORY_PROGRESS);
        }
        return view;
    }

    public static final /* synthetic */ View g(f fVar) {
        View view = fVar.cww;
        if (view == null) {
            kotlin.jvm.internal.i.lG("applySandbox");
        }
        return view;
    }

    public static final /* synthetic */ a h(f fVar) {
        a aVar = fVar.cwv;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("mContainerAdapter");
        }
        return aVar;
    }

    public static final /* synthetic */ TextView i(f fVar) {
        TextView textView = fVar.cwu;
        if (textView == null) {
            kotlin.jvm.internal.i.lG("mProjects");
        }
        return textView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return layoutInflater.inflate(com.iqoption.debugmenu.c.c.debug_console_sandbox, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(com.iqoption.debugmenu.c.b.sandboxContainer);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.sandboxContainer)");
        this.cws = findViewById;
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.filter);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.filter)");
        this.cwt = (EditText) findViewById;
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.list);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.list)");
        this.mList = (ListView) findViewById;
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.projects);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.projects)");
        this.cwu = (TextView) findViewById;
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.editTextHost);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.editTextHost)");
        this.cwo = (EditText) findViewById;
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.debugProgress);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.debugProgress)");
        this.cwx = findViewById;
        String Va = com.iqoption.core.d.EE().Va();
        EditText editText = this.cwo;
        String str = "mHostEdit";
        if (editText == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        editText.setText(Va);
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.buttonInt);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.buttonInt)");
        this.cwp = (ToggleButton) findViewById;
        ToggleButton toggleButton = this.cwp;
        String str2 = "mButtonInt";
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        toggleButton.setOnClickListener(new b(this));
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.buttonProd);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.buttonProd)");
        this.cwq = (ToggleButton) findViewById;
        toggleButton = this.cwq;
        String str3 = "mButtonProd";
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        toggleButton.setOnClickListener(new e(this));
        findViewById = view.findViewById(com.iqoption.debugmenu.c.b.buttonSandbox);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById(R.id.buttonSandbox)");
        this.cwr = (ToggleButton) findViewById;
        toggleButton = this.cwr;
        String str4 = "mButtonSandbox";
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG(str4);
        }
        toggleButton.setOnClickListener(new f(this));
        int i = g.aob[com.iqoption.core.d.EE().UY().ordinal()];
        if (i == 1) {
            toggleButton = this.cwq;
            if (toggleButton == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            toggleButton.callOnClick();
        } else if (i == 2) {
            toggleButton = this.cwp;
            if (toggleButton == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            toggleButton.callOnClick();
        } else if (i == 3) {
            toggleButton = this.cwr;
            if (toggleButton == null) {
                kotlin.jvm.internal.i.lG(str4);
            }
            toggleButton.callOnClick();
        }
        EditText editText2 = this.cwo;
        if (editText2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        editText2.setText(com.iqoption.core.d.EE().Va());
        view = view.findViewById(com.iqoption.debugmenu.c.b.applySandbox);
        kotlin.jvm.internal.i.e(view, "view.findViewById(R.id.applySandbox)");
        this.cww = view;
        view = this.cww;
        if (view == null) {
            kotlin.jvm.internal.i.lG("applySandbox");
        }
        view.setOnClickListener(new g(this));
        EditText editText3 = this.cwo;
        if (editText3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        editText3.addTextChangedListener(new h(this));
        editText3 = this.cwt;
        if (editText3 == null) {
            kotlin.jvm.internal.i.lG("mFilter");
        }
        editText3.addTextChangedListener(new i(this));
        this.cwv = new a();
        ListView listView = this.mList;
        Va = "mList";
        if (listView == null) {
            kotlin.jvm.internal.i.lG(Va);
        }
        a aVar = this.cwv;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("mContainerAdapter");
        }
        listView.setAdapter(aVar);
        listView = this.mList;
        if (listView == null) {
            kotlin.jvm.internal.i.lG(Va);
        }
        listView.setOnItemClickListener(new j(this));
        listView = this.mList;
        if (listView == null) {
            kotlin.jvm.internal.i.lG(Va);
        }
        listView.setOnTouchListener(k.cwE);
        p.j(new l("http://sandbox.mobbtech.com/builds/?access-token=DxaNVwQiPwmRSx28AZY2bTlGlAKbdKBb")).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new c(this), (io.reactivex.b.f) d.cwC);
    }

    private final void aoh() {
        View view = this.cws;
        if (view == null) {
            kotlin.jvm.internal.i.lG("mSandboxContainer");
        }
        view.setVisibility(8);
        ToggleButton toggleButton = this.cwp;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonInt");
        }
        toggleButton.setChecked(false);
        toggleButton = this.cwq;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonProd");
        }
        toggleButton.setChecked(false);
        toggleButton = this.cwr;
        if (toggleButton == null) {
            kotlin.jvm.internal.i.lG("mButtonSandbox");
        }
        toggleButton.setChecked(false);
    }
}
