package org.yaml.snakeyaml.introspector;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: GenericProperty */
public abstract class b extends e {
    private Type fKS;
    private boolean fKT;
    private Class<?>[] fKU;

    public b(String str, Class<?> cls, Type type) {
        super(str, cls);
        this.fKS = type;
        this.fKT = type == null;
    }

    public Class<?>[] bUI() {
        if (!this.fKT) {
            Type type = this.fKS;
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length > 0) {
                    this.fKU = new Class[actualTypeArguments.length];
                    for (int i = 0; i < actualTypeArguments.length; i++) {
                        if (!(actualTypeArguments[i] instanceof Class)) {
                            if (!(actualTypeArguments[i] instanceof ParameterizedType)) {
                                if (!(actualTypeArguments[i] instanceof GenericArrayType)) {
                                    this.fKU = null;
                                    break;
                                }
                                Type genericComponentType = ((GenericArrayType) actualTypeArguments[i]).getGenericComponentType();
                                if (!(genericComponentType instanceof Class)) {
                                    this.fKU = null;
                                    break;
                                }
                                this.fKU[i] = Array.newInstance((Class) genericComponentType, 0).getClass();
                            } else {
                                this.fKU[i] = (Class) ((ParameterizedType) actualTypeArguments[i]).getRawType();
                            }
                        } else {
                            this.fKU[i] = (Class) actualTypeArguments[i];
                        }
                    }
                }
            } else if (type instanceof GenericArrayType) {
                if (((GenericArrayType) type).getGenericComponentType() instanceof Class) {
                    this.fKU = new Class[]{(Class) ((GenericArrayType) type).getGenericComponentType()};
                }
            } else if ((type instanceof Class) && ((Class) type).isArray()) {
                this.fKU = new Class[1];
                this.fKU[0] = getType().getComponentType();
            }
            this.fKT = true;
        }
        return this.fKU;
    }
}
