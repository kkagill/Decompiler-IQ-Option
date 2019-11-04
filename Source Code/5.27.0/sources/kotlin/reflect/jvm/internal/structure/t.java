package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Modifier;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.load.java.l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"})
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface t extends r {

    @i(bne = {1, 1, 15})
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class a {
        public static boolean a(t tVar) {
            return Modifier.isAbstract(tVar.getModifiers());
        }

        public static boolean b(t tVar) {
            return Modifier.isStatic(tVar.getModifiers());
        }

        public static boolean c(t tVar) {
            return Modifier.isFinal(tVar.getModifiers());
        }

        public static aw d(t tVar) {
            int modifiers = tVar.getModifiers();
            aw awVar;
            if (Modifier.isPublic(modifiers)) {
                awVar = av.fde;
                kotlin.jvm.internal.i.e(awVar, "Visibilities.PUBLIC");
                return awVar;
            } else if (Modifier.isPrivate(modifiers)) {
                awVar = av.fda;
                kotlin.jvm.internal.i.e(awVar, "Visibilities.PRIVATE");
                return awVar;
            } else if (Modifier.isProtected(modifiers)) {
                if (Modifier.isStatic(modifiers)) {
                    awVar = l.fhg;
                } else {
                    awVar = l.fhh;
                }
                kotlin.jvm.internal.i.e(awVar, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return awVar;
            } else {
                awVar = l.fhf;
                kotlin.jvm.internal.i.e(awVar, "JavaVisibilities.PACKAGE_VISIBILITY");
                return awVar;
            }
        }
    }

    int getModifiers();
}
