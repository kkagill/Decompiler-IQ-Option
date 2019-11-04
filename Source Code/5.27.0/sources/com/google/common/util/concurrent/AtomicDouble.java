package com.google.common.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong aas;

    public AtomicDouble(double d) {
        this.aas = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    public AtomicDouble() {
        this(0.0d);
    }

    public final double get() {
        return Double.longBitsToDouble(this.aas.get());
    }

    public final void set(double d) {
        this.aas.set(Double.doubleToRawLongBits(d));
    }

    public final double d(double d) {
        double longBitsToDouble;
        long j;
        do {
            j = this.aas.get();
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.aas.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public String toString() {
        return Double.toString(get());
    }

    public int intValue() {
        return (int) get();
    }

    public long longValue() {
        return (long) get();
    }

    public float floatValue() {
        return (float) get();
    }

    public double doubleValue() {
        return get();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.aas = new AtomicLong();
        set(objectInputStream.readDouble());
    }
}
