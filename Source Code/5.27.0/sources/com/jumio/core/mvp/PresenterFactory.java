package com.jumio.core.mvp;

import androidx.annotation.Nullable;
import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.core.mvp.presenter.RequiresPresenter;

public class PresenterFactory {
    @Nullable
    public static <T extends Presenter> T createClass(Class<?> cls) {
        RequiresPresenter requiresPresenter = (RequiresPresenter) cls.getAnnotation(RequiresPresenter.class);
        if (requiresPresenter != null) {
            Class value = requiresPresenter.value();
            if (value == null) {
                return null;
            }
            try {
                return (Presenter) value.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" must be annotated with the @RequiresPresenter annotation!");
        throw new RuntimeException(stringBuilder.toString());
    }
}
