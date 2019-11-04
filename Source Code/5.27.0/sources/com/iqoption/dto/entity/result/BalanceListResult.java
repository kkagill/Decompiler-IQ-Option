package com.iqoption.dto.entity.result;

import com.iqoption.dto.Balance;
import com.iqoption.util.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class BalanceListResult extends ArrayList<Balance> {
    public ConcurrentHashMap<Long, Balance> getMapBalance() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (!g.isEmpty(this)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                Balance balance = (Balance) it.next();
                concurrentHashMap.put(Long.valueOf(balance.id), balance);
            }
        }
        return concurrentHashMap;
    }
}
