package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.c.b;
import kotlin.reflect.jvm.internal.c.e;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.calls.c;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.calls.d.h;
import kotlin.reflect.jvm.internal.calls.g;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Member;", "invoke"})
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$caller$2 extends Lambda implements a<c<? extends Member>> {
    final /* synthetic */ i this$0;

    KFunctionImpl$caller$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: bpc */
    public final c<Member> invoke() {
        Object lJ;
        d a;
        c d = ab.eYn.d(this.this$0.box());
        Class bnC;
        Collection arrayList;
        if (d instanceof c.d) {
            if (this.this$0.boB()) {
                bnC = this.this$0.boA().bnC();
                Iterable<KParameter> parameters = this.this$0.getParameters();
                arrayList = new ArrayList(n.e(parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    if (name2 == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    arrayList.add(name2);
                }
                return new AnnotationConstructorCaller(bnC, (List) arrayList, CallMode.POSITIONAL_CALL, Origin.KOTLIN, null, 16, null);
            }
            lJ = this.this$0.boA().lJ(((c.d) d).bol());
        } else if (d instanceof e) {
            e eVar = (e) d;
            lJ = this.this$0.boA().ba(eVar.getMethodName(), eVar.bom());
        } else if (d instanceof c.c) {
            lJ = ((c.c) d).bok();
        } else if (d instanceof b) {
            lJ = ((b) d).boj();
        } else if (d instanceof c.a) {
            List ajQ = ((c.a) d).ajQ();
            bnC = this.this$0.boA().bnC();
            Iterable<Method> iterable = ajQ;
            arrayList = new ArrayList(n.e(iterable, 10));
            for (Method method : iterable) {
                kotlin.jvm.internal.i.e(method, "it");
                arrayList.add(method.getName());
            }
            return new AnnotationConstructorCaller(bnC, (List) arrayList, CallMode.POSITIONAL_CALL, Origin.JAVA, ajQ);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (lJ instanceof Constructor) {
            i iVar = this.this$0;
            a = iVar.a((Constructor) lJ, iVar.box());
        } else if (lJ instanceof Method) {
            h a2;
            Method method2 = (Method) lJ;
            if (!Modifier.isStatic(method2.getModifiers())) {
                a2 = this.this$0.e(method2);
            } else if (this.this$0.box().brE().i(ae.bpW()) != null) {
                a2 = this.this$0.d(method2);
            } else {
                a2 = this.this$0.c(method2);
            }
            a = a2;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not compute caller for function: ");
            stringBuilder.append(this.this$0.box());
            stringBuilder.append(" (member = ");
            stringBuilder.append(lJ);
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
        return g.a(a, this.this$0.box(), false, 2, null);
    }
}
