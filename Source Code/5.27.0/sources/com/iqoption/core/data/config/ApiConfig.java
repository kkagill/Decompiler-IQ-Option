package com.iqoption.core.data.config;

import io.reactivex.a;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\b\u0010\f\u001a\u00020\rH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH&J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H&J\b\u0010\u0015\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/data/config/ApiConfig;", "Lcom/iqoption/core/data/config/ApiConfigData;", "isInitialized", "", "()Z", "isIntegration", "isProduction", "isSandbox", "type", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "getType", "()Lcom/iqoption/core/data/config/ApiConfig$Type;", "initialize", "Lio/reactivex/Completable;", "newCoreUrl", "", "newType", "onRecoveryHostsChanged", "", "hosts", "", "release", "Type", "core_release"})
/* compiled from: ApiConfig.kt */
public interface ApiConfig extends a {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/data/config/ApiConfig$Type;", "", "(Ljava/lang/String;I)V", "INT", "PROD", "SANDBOX", "core_release"})
    /* compiled from: ApiConfig.kt */
    public enum Type {
        INT,
        PROD,
        SANDBOX
    }

    boolean UW();

    boolean UX();

    Type UY();

    a UZ();

    a a(String str, Type type);

    void am(List<String> list);

    boolean isInitialized();

    void release();
}
