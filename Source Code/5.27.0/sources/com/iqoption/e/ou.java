package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.MaxSizeLinearLayout;
import com.iqoption.core.ui.widget.MaxSizeView;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: IqkeyboardFragmentBindingImpl */
public class ou extends ot implements com.iqoption.g.a.a.a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener clU;
    private a clV;
    private b clW;
    private c clX;
    private d clY;
    private e clZ;
    private f cma;

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class a implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public a b(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.bu(view);
        }
    }

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class b implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public b c(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.bq(view);
        }
    }

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class c implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public c d(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.bs(view);
        }
    }

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class d implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public d e(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.bp(view);
        }
    }

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class e implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public e f(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.br(view);
        }
    }

    /* compiled from: IqkeyboardFragmentBindingImpl */
    public static class f implements OnClickListener {
        private com.iqoption.fragment.a.b cmb;

        public f g(com.iqoption.fragment.a.b bVar) {
            this.cmb = bVar;
            return bVar == null ? null : this;
        }

        public void onClick(View view) {
            this.cmb.bt(view);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.content, 17);
        aos.put(R.id.linearLayout, 18);
        aos.put(R.id.leftContainer, 19);
        aos.put(R.id.amountKeyboard, 20);
        aos.put(R.id.exposureTitle, 21);
        aos.put(R.id.exposureValue, 22);
        aos.put(R.id.coefficientContainer, 23);
        aos.put(R.id.coefficient, 24);
        aos.put(R.id.space, 25);
        aos.put(R.id.rightContainer, 26);
        aos.put(R.id.allBalanceContainer, 27);
        aos.put(R.id.balanceValue, 28);
        aos.put(R.id.exposureCallContainer, 29);
        aos.put(R.id.exposureCallValue, 30);
        aos.put(R.id.exposurePutContainer, 31);
        aos.put(R.id.exposurePutValue, 32);
        aos.put(R.id.titlePresetAmount, 33);
        aos.put(R.id.arrowPresetAmount, 34);
        aos.put(R.id.listContainer, 35);
        aos.put(R.id.preset, 36);
        aos.put(R.id.arrowLastAmount, 37);
        aos.put(R.id.titleLastAmount, 38);
        aos.put(R.id.hideKeyboard, 39);
    }

    public ou(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 40, aor, aos));
    }

    private ou(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[27], (RobotoEditText) objArr[20], (ImageView) objArr[37], (ImageView) objArr[34], (FrameLayout) objArr[12], (RobotoTextView) objArr[28], (RobotoEditText) objArr[24], (LinearLayout) objArr[23], (FrameLayout) objArr[17], (ImageView) objArr[13], (TextView) objArr[8], (FrameLayout) objArr[0], (LinearLayout) objArr[29], (RobotoTextView) objArr[30], (LinearLayout) objArr[31], (RobotoTextView) objArr[32], (TextView) objArr[21], (TextView) objArr[22], (TextView) objArr[5], (TextView) objArr[4], (ImageView) objArr[39], (RelativeLayout) objArr[16], (MaxSizeLinearLayout) objArr[19], (RelativeLayout) objArr[18], (FrameLayout) objArr[35], (ImageView) objArr[14], (TextView) objArr[9], (TextView) objArr[1], (TextView) objArr[10], (RecyclerView) objArr[36], (RelativeLayout) objArr[15], (MaxSizeLinearLayout) objArr[26], (TextView) objArr[7], (TextView) objArr[6], (MaxSizeView) objArr[25], (TextView) objArr[3], (RobotoTextView) objArr[38], (RobotoTextView) objArr[33], (TextView) objArr[2], (TextView) objArr[11]);
        this.aot = -1;
        this.clu.setTag(null);
        this.cly.setTag(null);
        this.bfX.setTag("8");
        this.aoG.setTag(null);
        this.bfY.setTag("5");
        this.bfZ.setTag("4");
        this.clG.setTag(null);
        this.clK.setTag(null);
        this.bge.setTag("9");
        this.bgf.setTag("1");
        this.clL.setTag(null);
        this.clN.setTag(null);
        this.bgg.setTag("7");
        this.bgi.setTag("6");
        this.bgj.setTag("3");
        this.bgk.setTag("2");
        this.clS.setTag("0");
        setRootTag(view);
        this.clU = new com.iqoption.g.a.a(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.aot != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        if (4 != i) {
            return false;
        }
        a((com.iqoption.fragment.a.b) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.a.b bVar) {
        this.clT = bVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        OnClickListener onClickListener;
        OnClickListener onClickListener2;
        OnClickListener onClickListener3;
        OnClickListener onClickListener4;
        OnClickListener onClickListener5;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        com.iqoption.fragment.a.b bVar = this.clT;
        long j2 = 3 & j;
        OnClickListener onClickListener6 = null;
        if (j2 == 0 || bVar == null) {
            onClickListener = null;
            onClickListener2 = onClickListener;
            onClickListener3 = onClickListener2;
            onClickListener4 = onClickListener3;
            onClickListener5 = onClickListener4;
        } else {
            a aVar = this.clV;
            if (aVar == null) {
                aVar = new a();
                this.clV = aVar;
            }
            aVar = aVar.b(bVar);
            b bVar2 = this.clW;
            if (bVar2 == null) {
                bVar2 = new b();
                this.clW = bVar2;
            }
            bVar2 = bVar2.c(bVar);
            c cVar = this.clX;
            if (cVar == null) {
                cVar = new c();
                this.clX = cVar;
            }
            cVar = cVar.d(bVar);
            d dVar = this.clY;
            if (dVar == null) {
                dVar = new d();
                this.clY = dVar;
            }
            onClickListener4 = dVar.e(bVar);
            e eVar = this.clZ;
            if (eVar == null) {
                eVar = new e();
                this.clZ = eVar;
            }
            onClickListener5 = eVar.f(bVar);
            f fVar = this.cma;
            if (fVar == null) {
                fVar = new f();
                this.cma = fVar;
            }
            onClickListener = fVar.g(bVar);
            b bVar3 = bVar2;
            onClickListener2 = aVar;
            onClickListener6 = cVar;
            onClickListener3 = bVar3;
        }
        if (j2 != 0) {
            this.clu.setOnClickListener(onClickListener6);
            this.cly.setOnClickListener(onClickListener4);
            this.bfX.setOnClickListener(onClickListener);
            this.bfY.setOnClickListener(onClickListener);
            this.bfZ.setOnClickListener(onClickListener);
            this.clG.setOnClickListener(onClickListener2);
            this.clK.setOnClickListener(onClickListener3);
            this.bge.setOnClickListener(onClickListener);
            this.bgf.setOnClickListener(onClickListener);
            this.clL.setOnClickListener(onClickListener5);
            this.clN.setOnClickListener(onClickListener2);
            this.bgg.setOnClickListener(onClickListener);
            this.bgi.setOnClickListener(onClickListener);
            this.bgj.setOnClickListener(onClickListener);
            this.bgk.setOnClickListener(onClickListener);
            this.clS.setOnClickListener(onClickListener);
        }
        if ((j & 2) != 0) {
            this.aoG.setOnClickListener(this.clU);
        }
    }

    public final void a(int i, View view) {
        com.iqoption.fragment.a.b bVar = this.clT;
        if ((bVar != null ? 1 : null) != null) {
            bVar.onBackPressed();
        }
    }
}
