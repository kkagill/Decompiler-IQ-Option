package com.iqoption.core.microservices.core.register;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "", "serverValue", "", "(Ljava/lang/String;II)V", "getServerValue", "()I", "FACEBOOK", "GOOGLE_PLUS", "Companion", "core_release"})
/* compiled from: SocialTypeId.kt */
public enum SocialTypeId {
    FACEBOOK(4),
    GOOGLE_PLUS(5);
    
    public static final a Companion = null;
    private final int serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/core/register/SocialTypeId$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "value", "", "core_release"})
    /* compiled from: SocialTypeId.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final SocialTypeId fromServerValue(int i) {
            for (SocialTypeId socialTypeId : SocialTypeId.values()) {
                if ((socialTypeId.getServerValue() == i ? 1 : null) != null) {
                    return socialTypeId;
                }
            }
            return null;
        }
    }

    public static final SocialTypeId fromServerValue(int i) {
        return Companion.fromServerValue(i);
    }

    private SocialTypeId(int i) {
        this.serverValue = i;
    }

    public final int getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new a();
    }
}
