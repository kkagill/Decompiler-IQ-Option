package com.google.gson.internal;

import java.lang.reflect.Modifier;

public abstract class UnsafeAllocator {
    public abstract <T> T newInstance(Class<T> cls);

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0067 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r0 = java.io.ObjectInputStream.class.getDeclaredMethod(r0, new java.lang.Class[]{java.lang.Class.class, java.lang.Class.class});
            r0.setAccessible(true);
     */
    /* JADX WARNING: Missing block: B:11:0x007f, code skipped:
            return new com.google.gson.internal.UnsafeAllocator.AnonymousClass3();
     */
    /* JADX WARNING: Missing block: B:14:0x0085, code skipped:
            return new com.google.gson.internal.UnsafeAllocator.AnonymousClass4();
     */
    public static com.google.gson.internal.UnsafeAllocator create() {
        /*
        r0 = "newInstance";
        r1 = 0;
        r2 = 0;
        r3 = 1;
        r4 = "sun.misc.Unsafe";
        r4 = java.lang.Class.forName(r4);	 Catch:{ Exception -> 0x002c }
        r5 = "theUnsafe";
        r5 = r4.getDeclaredField(r5);	 Catch:{ Exception -> 0x002c }
        r5.setAccessible(r3);	 Catch:{ Exception -> 0x002c }
        r5 = r5.get(r1);	 Catch:{ Exception -> 0x002c }
        r6 = "allocateInstance";
        r7 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x002c }
        r8 = java.lang.Class.class;
        r7[r2] = r8;	 Catch:{ Exception -> 0x002c }
        r4 = r4.getMethod(r6, r7);	 Catch:{ Exception -> 0x002c }
        r6 = new com.google.gson.internal.UnsafeAllocator$1;	 Catch:{ Exception -> 0x002c }
        r6.<init>(r4, r5);	 Catch:{ Exception -> 0x002c }
        return r6;
    L_0x002c:
        r4 = 2;
        r5 = java.io.ObjectStreamClass.class;
        r6 = "getConstructorId";
        r7 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0067 }
        r8 = java.lang.Class.class;
        r7[r2] = r8;	 Catch:{ Exception -> 0x0067 }
        r5 = r5.getDeclaredMethod(r6, r7);	 Catch:{ Exception -> 0x0067 }
        r5.setAccessible(r3);	 Catch:{ Exception -> 0x0067 }
        r6 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0067 }
        r7 = java.lang.Object.class;
        r6[r2] = r7;	 Catch:{ Exception -> 0x0067 }
        r1 = r5.invoke(r1, r6);	 Catch:{ Exception -> 0x0067 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0067 }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x0067 }
        r5 = java.io.ObjectStreamClass.class;
        r6 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0067 }
        r7 = java.lang.Class.class;
        r6[r2] = r7;	 Catch:{ Exception -> 0x0067 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0067 }
        r6[r3] = r7;	 Catch:{ Exception -> 0x0067 }
        r5 = r5.getDeclaredMethod(r0, r6);	 Catch:{ Exception -> 0x0067 }
        r5.setAccessible(r3);	 Catch:{ Exception -> 0x0067 }
        r6 = new com.google.gson.internal.UnsafeAllocator$2;	 Catch:{ Exception -> 0x0067 }
        r6.<init>(r5, r1);	 Catch:{ Exception -> 0x0067 }
        return r6;
    L_0x0067:
        r1 = java.io.ObjectInputStream.class;
        r4 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0080 }
        r5 = java.lang.Class.class;
        r4[r2] = r5;	 Catch:{ Exception -> 0x0080 }
        r2 = java.lang.Class.class;
        r4[r3] = r2;	 Catch:{ Exception -> 0x0080 }
        r0 = r1.getDeclaredMethod(r0, r4);	 Catch:{ Exception -> 0x0080 }
        r0.setAccessible(r3);	 Catch:{ Exception -> 0x0080 }
        r1 = new com.google.gson.internal.UnsafeAllocator$3;	 Catch:{ Exception -> 0x0080 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0080 }
        return r1;
    L_0x0080:
        r0 = new com.google.gson.internal.UnsafeAllocator$4;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.UnsafeAllocator.create():com.google.gson.internal.UnsafeAllocator");
    }

    static void assertInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        StringBuilder stringBuilder;
        if (Modifier.isInterface(modifiers)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Interface can't be instantiated! Interface name: ");
            stringBuilder.append(cls.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Abstract class can't be instantiated! Class name: ");
            stringBuilder.append(cls.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }
}
