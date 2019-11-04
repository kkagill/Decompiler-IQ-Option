package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map.Entry;

/* compiled from: Serialization */
final class ac {

    /* compiled from: Serialization */
    static final class a<T> {
        private final Field field;

        /* synthetic */ a(Field field, AnonymousClass1 anonymousClass1) {
            this(field);
        }

        private a(Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        /* Access modifiers changed, original: 0000 */
        public void set(T t, Object obj) {
            try {
                this.field.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void set(T t, int i) {
            try {
                this.field.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    static int c(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static <E> void a(x<E> xVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(xVar.entrySet().size());
        for (com.google.common.collect.x.a aVar : xVar.entrySet()) {
            objectOutputStream.writeObject(aVar.ur());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    static <E> void a(x<E> xVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            xVar.e(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static <K, V> void a(w<K, V> wVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(wVar.sg().size());
        for (Entry entry : wVar.sg().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    static <K, V> void a(w<K, V> wVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection az = wVar.az(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                az.add(objectInputStream.readObject());
            }
        }
    }

    static <T> a<T> b(Class<T> cls, String str) {
        try {
            return new a(cls.getDeclaredField(str), null);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
