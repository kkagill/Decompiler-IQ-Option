package com.google.common.collect;

class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    static final EmptyImmutableListMultimap VQ = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.sW(), 0);
    }

    private Object readResolve() {
        return VQ;
    }
}
