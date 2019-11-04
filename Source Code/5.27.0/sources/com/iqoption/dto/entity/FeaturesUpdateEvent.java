package com.iqoption.dto.entity;

import com.google.common.collect.ImmutableList;
import com.iqoption.core.microservices.features.a.a;

public class FeaturesUpdateEvent {
    public final ImmutableList<a> features;

    public FeaturesUpdateEvent(ImmutableList<a> immutableList) {
        this.features = immutableList;
    }
}
