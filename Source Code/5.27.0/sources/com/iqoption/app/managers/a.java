package com.iqoption.app.managers;

import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.dto.PushSetting;
import com.iqoption.dto.entity.BackCall;
import com.iqoption.dto.entity.SpecialOffer;
import com.iqoption.dto.entity.Tournament;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DataManager */
public class a {
    private static final String TAG = "com.iqoption.app.managers.a";
    private static final n<a> aty = Suppliers.a(-$$Lambda$a$zk9zxEhbH-_8QG5V4xJYqBNSH0g.INSTANCE);
    private BackCall atA;
    private final ArrayList<Tournament> atB = new ArrayList();
    private final Map<Integer, Set<Integer>> atC = new ConcurrentHashMap();
    private final ArrayList<SpecialOffer> atz = new ArrayList();
    private final ArrayList<PushSetting> pushSettings = new ArrayList();

    private a() {
    }

    public static a GM() {
        return (a) aty.get();
    }

    public void clear() {
        this.atB.clear();
        this.pushSettings.clear();
        this.atz.clear();
        this.atC.clear();
    }

    public BackCall GN() {
        return this.atA;
    }

    public void a(BackCall backCall) {
        this.atA = backCall;
    }

    public ArrayList<PushSetting> GO() {
        return this.pushSettings;
    }

    public ArrayList<Tournament> GP() {
        return this.atB;
    }

    public void a(Integer num, Set<Integer> set) {
        this.atC.put(num, set);
    }

    public boolean a(Integer num, int i) {
        Set set = (Set) this.atC.get(num);
        return set == null || set.contains(Integer.valueOf(i));
    }
}
