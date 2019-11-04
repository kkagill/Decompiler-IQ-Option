package com.google.common.base;

import java.io.Serializable;

public final class Functions {

    private static class ConstantFunction<E> implements d<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        private final E value;

        public ConstantFunction(E e) {
            this.value = e;
        }

        public E apply(Object obj) {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ConstantFunction)) {
                return false;
            }
            return f.equal(this.value, ((ConstantFunction) obj).value);
        }

        public int hashCode() {
            Object obj = this.value;
            return obj == null ? 0 : obj.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Functions.constant(");
            stringBuilder.append(this.value);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static <E> d<Object, E> ah(E e) {
        return new ConstantFunction(e);
    }
}
