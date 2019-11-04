package com.iqoption.debugmenu.debugmenu;

import com.iqoption.core.d;
import com.iqoption.debugmenu.debugmenu.ContainerEntity.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$List;", "it", "", "invoke"})
/* compiled from: SandboxFragment.kt */
final class SandboxFragment$onViewCreated$9$1 extends Lambda implements b<String, List> {
    public static final SandboxFragment$onViewCreated$9$1 cwG = new SandboxFragment$onViewCreated$9$1();

    SandboxFragment$onViewCreated$9$1() {
        super(1);
    }

    /* renamed from: hB */
    public final List invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (List) d.Um().Ez().fromJson(str, List.class);
    }
}
