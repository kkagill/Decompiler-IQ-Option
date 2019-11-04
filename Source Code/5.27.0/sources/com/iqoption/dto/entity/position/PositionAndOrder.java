package com.iqoption.dto.entity.position;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PositionAndOrder extends Position {
    @SerializedName("orders")
    private ArrayList<Order> orders;

    public List<Order> getOrders() {
        List<Order> list = this.orders;
        return list == null ? Collections.emptyList() : list;
    }
}
