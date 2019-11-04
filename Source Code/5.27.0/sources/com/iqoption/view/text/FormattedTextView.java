package com.iqoption.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

public class FormattedTextView extends AppCompatTextView {
    private TransformationMethod eig;
    private com.iqoption.view.c.a eih;
    private a eii;

    private enum Capitalize {
        none,
        firstLetter,
        allCaps,
        allLowerCase,
        phoneNumber,
        hiddenPhoneNumber,
        creditCard,
        camelSpace
    }

    public interface a {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    private static class b implements TransformationMethod {
        private List<TransformationMethod> transformations;

        public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        }

        private b() {
            this.transformations = new ArrayList();
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            for (TransformationMethod transformation : this.transformations) {
                charSequence = transformation.getTransformation(charSequence, view);
            }
            return charSequence;
        }

        public b b(TransformationMethod transformationMethod) {
            this.transformations.add(transformationMethod);
            return this;
        }

        public TransformationMethod B(Class<?> cls) {
            for (TransformationMethod transformationMethod : this.transformations) {
                if (cls.isInstance(transformationMethod)) {
                    return transformationMethod;
                }
            }
            return null;
        }
    }

    public FormattedTextView(Context context) {
        super(context);
    }

    public FormattedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FormattedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public void setOnSizeChangedListener(a aVar) {
        this.eii = aVar;
    }

    public void setFrameTopGapSize(float f) {
        com.iqoption.view.c.a aVar = this.eih;
        if (aVar != null) {
            aVar.setFrameTopGapSize(f);
            return;
        }
        throw new RuntimeException("frame should be enabled, use FormattedTextView_isDrawFrame attribute");
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.FormattedTextView, 0, 0);
        try {
            this.eig = getTransformationMethod();
            setCapitalize(Capitalize.values()[obtainStyledAttributes.getInt(0, 0)]);
            setTextLines(obtainStyledAttributes.getInt(6, 0));
            if (this.eig != null) {
                setTransformationMethod(this.eig);
            }
            d(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void d(TypedArray typedArray) {
        if (typedArray.getBoolean(5, false)) {
            this.eih = new com.iqoption.view.c.a(typedArray.getDimension(2, 0.0f), typedArray.getColor(1, -1), typedArray.getDimension(3, 1.0f), typedArray.getDimension(4, 0.0f));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.iqoption.view.c.a aVar = this.eih;
        if (aVar != null) {
            aVar.onDraw(canvas);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.eii;
        if (aVar != null) {
            aVar.onSizeChanged(i, i2, i3, i4);
        }
    }

    private void setCapitalize(Capitalize capitalize) {
        switch (capitalize) {
            case firstLetter:
                a(new e(getContext()));
                return;
            case allCaps:
                a(new AllCapsTransformationMethod(getContext()));
                return;
            case allLowerCase:
                a(new a(getContext()));
                return;
            case phoneNumber:
                if (!isInEditMode()) {
                    a(new h(getContext()));
                    return;
                }
                return;
            case hiddenPhoneNumber:
                if (!isInEditMode()) {
                    a(new f(getContext()));
                    return;
                }
                return;
            case creditCard:
                if (!isInEditMode()) {
                    a(new d());
                    return;
                }
                return;
            case camelSpace:
                a(new b(getContext()));
                return;
            default:
                return;
        }
    }

    public void setTextLines(int i) {
        if (i > 0) {
            i iVar = (i) B(i.class);
            if (iVar == null) {
                a(new i(i));
            } else {
                iVar.setLines(i);
            }
        }
    }

    private TransformationMethod B(Class<?> cls) {
        TransformationMethod transformationMethod = this.eig;
        if (transformationMethod == null) {
            return null;
        }
        if (transformationMethod instanceof b) {
            ((b) transformationMethod).B(cls);
        } else if (cls.isInstance(transformationMethod)) {
            return this.eig;
        }
        return null;
    }

    private void a(TransformationMethod transformationMethod) {
        TransformationMethod transformationMethod2 = this.eig;
        if (transformationMethod2 == null) {
            this.eig = transformationMethod;
        } else if (transformationMethod2 instanceof b) {
            ((b) transformationMethod2).b(transformationMethod);
        } else {
            b bVar = new b();
            bVar.b(this.eig);
            bVar.b(transformationMethod);
            this.eig = bVar;
        }
    }
}
