package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class DependencyCycleException extends DependencyException {
    private final List<b<?>> componentsInCycle;

    @KeepForSdk
    public DependencyCycleException(List<b<?>> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString(list.toArray()));
        super(stringBuilder.toString());
        this.componentsInCycle = list;
    }
}
