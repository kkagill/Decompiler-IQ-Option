package io.reactivex.internal.util;

import io.reactivex.b.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public enum ArrayListSupplier implements g<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> g<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public List<Object> call() {
        return new ArrayList();
    }

    public List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
