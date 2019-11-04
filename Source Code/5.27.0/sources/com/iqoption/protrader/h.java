package com.iqoption.protrader;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"Lcom/iqoption/protrader/Retail;", "Lcom/iqoption/protrader/ClientCategory;", "categoryId", "", "(Ljava/lang/Integer;)V", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_optionXRelease"})
/* compiled from: ClientCategory.kt */
public final class h extends a {
    private final Integer dQk;

    public h(Integer num) {
        super(num, null);
        this.dQk = num;
    }

    public Integer aSR() {
        return this.dQk;
    }
}
