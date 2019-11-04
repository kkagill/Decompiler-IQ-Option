package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.RotatedAnimatedVectorSwitchView;
import com.iqoption.x.R;

/* compiled from: AssetFragmentBindingImpl */
public class au extends at implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener bVA;
    @Nullable
    private final OnClickListener bVB;
    @Nullable
    private final OnClickListener bVC;
    @Nullable
    private final OnClickListener bVD;
    @Nullable
    private final OnClickListener bVr;
    @Nullable
    private final OnClickListener bVs;
    @Nullable
    private final OnClickListener bVt;
    @Nullable
    private final OnClickListener bVu;
    @Nullable
    private final OnClickListener bVv;
    @Nullable
    private final OnClickListener bVw;
    @Nullable
    private final OnClickListener bVx;
    @Nullable
    private final OnClickListener bVy;
    @Nullable
    private final OnClickListener bVz;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 22);
        aos.put(R.id.typeContainerScrollView, 23);
        aos.put(R.id.raw, 24);
        aos.put(R.id.titleToggleOption, 25);
        aos.put(R.id.countToggleOptione, 26);
        aos.put(R.id.selectedBinary, 27);
        aos.put(R.id.titleBinaryType, 28);
        aos.put(R.id.countBinaryType, 29);
        aos.put(R.id.selectedDigital, 30);
        aos.put(R.id.titleDigitalType, 31);
        aos.put(R.id.countDigitalType, 32);
        aos.put(R.id.selectedFx, 33);
        aos.put(R.id.titleStrikeFx, 34);
        aos.put(R.id.countFxType, 35);
        aos.put(R.id.selectedForex, 36);
        aos.put(R.id.titleForexType, 37);
        aos.put(R.id.countForexType, 38);
        aos.put(R.id.selectedForexClassic, 39);
        aos.put(R.id.titleForexClassic, 40);
        aos.put(R.id.countForexClassic, 41);
        aos.put(R.id.selectedForexExpiration, 42);
        aos.put(R.id.titleForexExpiration, 43);
        aos.put(R.id.countForexExpiration, 44);
        aos.put(R.id.selectedStock, 45);
        aos.put(R.id.titleStockType, 46);
        aos.put(R.id.countStockActive, 47);
        aos.put(R.id.selectedCrypto, 48);
        aos.put(R.id.titleCryptoType, 49);
        aos.put(R.id.countCryptoType, 50);
        aos.put(R.id.selectedCommodity, 51);
        aos.put(R.id.f32titleommodityType, 52);
        aos.put(R.id.countCommodityActive, 53);
        aos.put(R.id.selectedEtf, 54);
        aos.put(R.id.titleEtfType, 55);
        aos.put(R.id.countEtfActive, 56);
        aos.put(R.id.selectedIndex, 57);
        aos.put(R.id.titleIndexType, 58);
        aos.put(R.id.countIndexActive, 59);
        aos.put(R.id.selectedBond, 60);
        aos.put(R.id.titleBoundType, 61);
        aos.put(R.id.countBondActive, 62);
        aos.put(R.id.more_type, 63);
        aos.put(R.id.selectedMore, 64);
        aos.put(R.id.titleMoreType, 65);
        aos.put(R.id.activeContainer, 66);
        aos.put(R.id.activeProTraderFragment, 67);
        aos.put(R.id.activeLinearContainer, 68);
        aos.put(R.id.searchEdit, 69);
        aos.put(R.id.assetSort, 70);
        aos.put(R.id.assetSortArrow, 71);
        aos.put(R.id.sortSwitcher, 72);
        aos.put(R.id.cfdSortContainer, 73);
        aos.put(R.id.diffSort, 74);
        aos.put(R.id.diffSortArrow, 75);
        aos.put(R.id.spreadSort, 76);
        aos.put(R.id.spreadSortArrow, 77);
        aos.put(R.id.leverageSort, 78);
        aos.put(R.id.leverageSortArrow, 79);
        aos.put(R.id.expirationSort, 80);
        aos.put(R.id.expirationSortArrow, 81);
        aos.put(R.id.spotProfitSort, 82);
        aos.put(R.id.spotProfitSortArrow, 83);
        aos.put(R.id.profitSort, 84);
        aos.put(R.id.profitSortArrow, 85);
        aos.put(R.id.assetList, 86);
        aos.put(R.id.activeMoreFragment, 87);
    }

    public au(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 88, aor, aos));
    }

    private au(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[66], (LinearLayout) objArr[68], (FrameLayout) objArr[87], (FrameLayout) objArr[67], (RecyclerView) objArr[86], (RobotoTextView) objArr[70], (RotatedAnimatedVectorSwitchView) objArr[71], (RelativeLayout) objArr[14], (RelativeLayout) objArr[2], (LinearLayout) objArr[13], (LinearLayout) objArr[73], (LinearLayout) objArr[10], (LinearLayout) objArr[22], (TextView) objArr[29], (TextView) objArr[62], (TextView) objArr[53], (TextView) objArr[50], (TextView) objArr[32], (TextView) objArr[56], (TextView) objArr[41], (TextView) objArr[44], (TextView) objArr[38], (TextView) objArr[35], (TextView) objArr[59], (TextView) objArr[47], (TextView) objArr[26], (LinearLayout) objArr[9], (RobotoTextView) objArr[74], (RotatedAnimatedVectorSwitchView) objArr[75], (LinearLayout) objArr[15], (RelativeLayout) objArr[3], (LinearLayout) objArr[11], (FrameLayout) objArr[0], (RobotoTextView) objArr[80], (RotatedAnimatedVectorSwitchView) objArr[81], (LinearLayout) objArr[18], (RelativeLayout) objArr[6], (RelativeLayout) objArr[7], (LinearLayout) objArr[5], (RelativeLayout) objArr[4], (ImageView) objArr[21], (LinearLayout) objArr[12], (RobotoTextView) objArr[78], (RotatedAnimatedVectorSwitchView) objArr[79], (LinearLayout) objArr[17], (LinearLayout) objArr[63], (RobotoTextView) objArr[84], (RotatedAnimatedVectorSwitchView) objArr[85], (RelativeLayout) objArr[20], (LinearLayout) objArr[24], (EditText) objArr[69], (View) objArr[27], (View) objArr[60], (View) objArr[51], (View) objArr[48], (View) objArr[30], (View) objArr[54], (View) objArr[36], (View) objArr[39], (View) objArr[42], (View) objArr[33], (View) objArr[57], (View) objArr[64], (View) objArr[45], (ViewSwitcher) objArr[72], (RobotoTextView) objArr[82], (RotatedAnimatedVectorSwitchView) objArr[83], (LinearLayout) objArr[19], (RobotoTextView) objArr[76], (RotatedAnimatedVectorSwitchView) objArr[77], (LinearLayout) objArr[16], (LinearLayout) objArr[8], (TextView) objArr[28], (TextView) objArr[61], (TextView) objArr[49], (TextView) objArr[31], (TextView) objArr[55], (TextView) objArr[40], (TextView) objArr[43], (TextView) objArr[37], (TextView) objArr[58], (TextView) objArr[65], (TextView) objArr[52], (TextView) objArr[46], (TextView) objArr[34], (TextView) objArr[25], (LinearLayout) objArr[1], (ScrollView) objArr[23]);
        this.aot = -1;
        this.bTP.setTag(null);
        this.bTQ.setTag(null);
        this.bTR.setTag(null);
        this.bTT.setTag(null);
        this.bUh.setTag(null);
        this.bUk.setTag(null);
        this.bUl.setTag(null);
        this.bUm.setTag(null);
        this.aoG.setTag(null);
        this.bUp.setTag(null);
        this.bUq.setTag(null);
        this.bUr.setTag(null);
        this.bUs.setTag(null);
        this.bUt.setTag(null);
        this.bUu.setTag(null);
        this.bUv.setTag(null);
        this.bUy.setTag(null);
        this.bUC.setTag(null);
        this.bUV.setTag(null);
        this.bUY.setTag(null);
        this.bUZ.setTag(null);
        this.bVo.setTag(null);
        setRootTag(view);
        this.bVr = new com.iqoption.g.a.a(this, 6);
        this.bVs = new com.iqoption.g.a.a(this, 9);
        this.bVt = new com.iqoption.g.a.a(this, 7);
        this.bVu = new com.iqoption.g.a.a(this, 10);
        this.bVv = new com.iqoption.g.a.a(this, 4);
        this.bVw = new com.iqoption.g.a.a(this, 3);
        this.bVx = new com.iqoption.g.a.a(this, 5);
        this.bVy = new com.iqoption.g.a.a(this, 13);
        this.bVz = new com.iqoption.g.a.a(this, 1);
        this.bVA = new com.iqoption.g.a.a(this, 2);
        this.bVB = new com.iqoption.g.a.a(this, 8);
        this.bVC = new com.iqoption.g.a.a(this, 11);
        this.bVD = new com.iqoption.g.a.a(this, 12);
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
        a((com.iqoption.fragment.a) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.a aVar) {
        this.bVq = aVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        com.iqoption.fragment.a aVar = this.bVq;
        if ((j & 2) != 0) {
            Void voidR = (Void) null;
            b.a(this.bTP, voidR);
            this.bTQ.setOnClickListener(this.bVA);
            this.bTR.setOnClickListener(this.bVy);
            this.bTT.setOnClickListener(this.bVu);
            this.bUh.setOnClickListener(this.bVs);
            b.a(this.bUk, voidR);
            this.bUl.setOnClickListener(this.bVw);
            this.bUm.setOnClickListener(this.bVC);
            b.a(this.bUp, voidR);
            this.bUq.setOnClickListener(this.bVr);
            this.bUr.setOnClickListener(this.bVt);
            this.bUs.setOnClickListener(this.bVx);
            this.bUt.setOnClickListener(this.bVv);
            b.a(this.bUu, voidR);
            this.bUv.setOnClickListener(this.bVD);
            b.a(this.bUy, voidR);
            b.a(this.bUC, voidR);
            b.a(this.bUV, voidR);
            b.a(this.bUY, voidR);
            this.bUZ.setOnClickListener(this.bVB);
            this.bVo.setOnClickListener(this.bVz);
        }
    }

    public final void a(int i, View view) {
        Object obj = 1;
        com.iqoption.fragment.a aVar;
        switch (i) {
            case 1:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.axb();
                    return;
                }
                return;
            case 2:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 3:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 4:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 5:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aW(view);
                    return;
                }
                return;
            case 6:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 7:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 8:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 9:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 10:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 11:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 12:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            case 13:
                aVar = this.bVq;
                if (aVar == null) {
                    obj = null;
                }
                if (obj != null) {
                    aVar.aX(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
