package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetItem;", "Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "assetId", "", "getAssetId", "()I", "id", "", "getId", "()Ljava/lang/String;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "localizedName", "tickerName", "matches", "", "constraint", "", "Lcom/iqoption/fragment/assets/model/AssetClosed;", "Lcom/iqoption/fragment/assets/model/AssetBo;", "Lcom/iqoption/fragment/assets/model/AssetDo;", "Lcom/iqoption/fragment/assets/model/AssetFx;", "Lcom/iqoption/fragment/assets/model/AssetMulti;", "Lcom/iqoption/fragment/assets/model/AssetCfd;", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public abstract class k extends a {
    private final a anF;
    private final String bqG;
    private final String dck;
    private final String id;

    private k(a aVar) {
        super();
        this.anF = aVar;
        this.id = b.H(this.anF);
        this.bqG = d.B(this.anF);
        this.dck = this.anF.ahP();
    }

    public /* synthetic */ k(a aVar, f fVar) {
        this(aVar);
    }

    public final a Jt() {
        return this.anF;
    }

    public String getId() {
        return this.id;
    }

    public final int Bs() {
        return this.anF.getActiveId();
    }

    public final InstrumentType getInstrumentType() {
        return this.anF.getInstrumentType();
    }

    public boolean L(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        if (v.b((CharSequence) this.bqG, charSequence, true) || v.b((CharSequence) this.dck, charSequence, true)) {
            return true;
        }
        return false;
    }
}
