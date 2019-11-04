package com.google.firebase.iid;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

final class au implements Continuation<Bundle, String> {
    private final /* synthetic */ at aek;

    au(at atVar) {
        this.aek = atVar;
    }

    public final /* synthetic */ Object then(@NonNull Task task) {
        return at.y((Bundle) task.getResult(IOException.class));
    }
}
