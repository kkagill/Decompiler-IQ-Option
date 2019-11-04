package com.iqoption.chat.component;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.d;
import com.iqoption.core.ui.picasso.b;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/picasso/PathTransformation;", "invoke"})
/* compiled from: RoomsAdapter.kt */
final class RoomsAdapter$avatarTransformation$2 extends Lambda implements a<b> {
    final /* synthetic */ aj this$0;

    RoomsAdapter$avatarTransformation$2(aj ajVar) {
        this.this$0 = ajVar;
        super(0);
    }

    /* renamed from: RN */
    public final b invoke() {
        Paint paint = new Paint(1);
        paint.setColor(this.this$0.getColor(c.green));
        float es = this.this$0.es(d.dp40);
        final float f = es / 2.0f;
        float es2 = this.this$0.es(d.dp5);
        final float es3 = this.this$0.es(d.dp8);
        es -= es2;
        b bVar = new b(new a<Path>(es) {
            final /* synthetic */ float $x0;

            /* renamed from: RO */
            public final Path invoke() {
                Path path = new Path();
                Path path2 = new Path();
                path2.addCircle(this.$x0, es, es3, Direction.CW);
                float f = f;
                path.addCircle(f, f, f, Direction.CW);
                path.op(path2, Op.DIFFERENCE);
                return path;
            }
        });
        bVar.m(new RoomsAdapter$avatarTransformation$2$$special$$inlined$apply$lambda$1(es, es, es2, paint));
        return bVar;
    }
}
