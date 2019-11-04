package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.c.e;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.calls.c;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.calls.d.h;
import kotlin.reflect.jvm.internal.calls.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Member;", "invoke"})
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$defaultCaller$2 extends Lambda implements a<c<? extends Member>> {
    final /* synthetic */ i this$0;

    KFunctionImpl$defaultCaller$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: bpc */
    public final c<Member> invoke() {
        Member u;
        d a;
        c d = ab.eYn.d(this.this$0.box());
        c<Member> cVar = null;
        Class bnC;
        Collection arrayList;
        if (d instanceof e) {
            KDeclarationContainerImpl boA = this.this$0.boA();
            e eVar = (e) d;
            String methodName = eVar.getMethodName();
            String bom = eVar.bom();
            Member bpY = this.this$0.boy().bpY();
            if (bpY == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            u = boA.u(methodName, bom, Modifier.isStatic(bpY.getModifiers()) ^ 1);
        } else if (d instanceof c.d) {
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
                return new AnnotationConstructorCaller(bnC, (List) arrayList, CallMode.CALL_BY_NAME, Origin.KOTLIN, null, 16, null);
            }
            u = this.this$0.boA().lK(((c.d) d).bol());
        } else if (d instanceof c.a) {
            List ajQ = ((c.a) d).ajQ();
            bnC = this.this$0.boA().bnC();
            Iterable<Method> iterable = ajQ;
            arrayList = new ArrayList(n.e(iterable, 10));
            for (Method method : iterable) {
                kotlin.jvm.internal.i.e(method, "it");
                arrayList.add(method.getName());
            }
            return new AnnotationConstructorCaller(bnC, (List) arrayList, CallMode.CALL_BY_NAME, Origin.JAVA, ajQ);
        } else {
            u = null;
        }
        if (u instanceof Constructor) {
            i iVar = this.this$0;
            a = iVar.a((Constructor) u, iVar.box());
        } else if (u instanceof Method) {
            h b;
            if (this.this$0.box().brE().i(ae.bpW()) != null) {
                k brj = this.this$0.box().brj();
                if (brj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                } else if (!((kotlin.reflect.jvm.internal.impl.descriptors.d) brj).bry()) {
                    b = this.this$0.d((Method) u);
                    a = b;
                }
            }
            b = this.this$0.c((Method) u);
            a = b;
        } else {
            a = null;
        }
        if (a != null) {
            cVar = g.a(a, this.this$0.box(), true);
        }
        return cVar;
    }
}
