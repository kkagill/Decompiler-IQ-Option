package com.iqoption.protrader;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/protrader/ClientCategory;", "", "categoryId", "", "(Ljava/lang/Integer;)V", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "Lcom/iqoption/protrader/Retail;", "Lcom/iqoption/protrader/ProTrader;", "app_optionXRelease"})
/* compiled from: ClientCategory.kt */
public abstract class a {
    public static final a dQl = new a();
    private final Integer dQk;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/protrader/ClientCategory$Companion;", "", "()V", "fromInt", "Lcom/iqoption/protrader/ClientCategory;", "categoryId", "", "(Ljava/lang/Integer;)Lcom/iqoption/protrader/ClientCategory;", "app_optionXRelease"})
    /* compiled from: ClientCategory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a q(Integer num) {
            if (num != null && num.intValue() == 2) {
                return new b();
            }
            return new h(num);
        }
    }

    public static final a q(Integer num) {
        return dQl.q(num);
    }

    private a(Integer num) {
        this.dQk = num;
    }

    public /* synthetic */ a(Integer num, f fVar) {
        this(num);
    }

    public Integer aSR() {
        return this.dQk;
    }
}
