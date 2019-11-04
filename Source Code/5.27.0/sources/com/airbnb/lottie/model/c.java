package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.airbnb.lottie.model.content.j;
import java.util.List;

@RestrictTo({Scope.LIBRARY})
/* compiled from: FontCharacter */
public class c {
    private final double hg;
    private final String ho;
    private final List<j> hp;
    private final char hq;
    private final double hr;
    private final String hs;

    public static int a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public c(List<j> list, char c, double d, double d2, String str, String str2) {
        this.hp = list;
        this.hq = c;
        this.hg = d;
        this.hr = d2;
        this.ho = str;
        this.hs = str2;
    }

    public List<j> bi() {
        return this.hp;
    }

    public double bj() {
        return this.hr;
    }

    public int hashCode() {
        return a(this.hq, this.hs, this.ho);
    }
}
