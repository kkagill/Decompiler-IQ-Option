package com.iqoption.dialog.a;

import com.google.common.base.d;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.mobbtech.connect.response.options.c;

/* compiled from: OptionToPositionTransformation */
final class f implements d<c, Position> {
    f() {
    }

    /* renamed from: n */
    public Position apply(c cVar) {
        return cVar instanceof Position ? (Position) cVar : null;
    }
}
