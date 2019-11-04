package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: predefinedEnhancementInfo.kt */
public final class h {
    private final o fkO;
    private final List<o> fkP;

    public h() {
        this(null, null, 3, null);
    }

    public h(o oVar, List<o> list) {
        i.f(list, "parametersInfo");
        this.fkO = oVar;
        this.fkP = list;
    }

    public /* synthetic */ h(o oVar, List list, int i, f fVar) {
        if ((i & 1) != 0) {
            oVar = (o) null;
        }
        if ((i & 2) != 0) {
            list = m.emptyList();
        }
        this(oVar, list);
    }

    public final o byd() {
        return this.fkO;
    }

    public final List<o> bye() {
        return this.fkP;
    }
}
