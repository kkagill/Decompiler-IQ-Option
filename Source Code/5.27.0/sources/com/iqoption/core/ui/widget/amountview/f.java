package com.iqoption.core.ui.widget.amountview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: LevenshteinUtils */
class f {
    static int[] a(char[] cArr, char[] cArr2, Set<Character> set) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj = i2 == cArr.length ? 1 : null;
            Object obj2 = i3 == cArr2.length ? 1 : null;
            if (obj != null && obj2 != null) {
                break;
            } else if (obj != null) {
                d(arrayList, cArr2.length - i3, 1);
                break;
            } else if (obj2 != null) {
                d(arrayList, cArr.length - i2, 2);
                break;
            } else {
                boolean contains = set.contains(Character.valueOf(cArr[i2]));
                boolean contains2 = set.contains(Character.valueOf(cArr2[i3]));
                if (contains && contains2) {
                    int a = a(cArr, i2 + 1, (Set) set);
                    int a2 = a(cArr2, i3 + 1, (Set) set);
                    a(arrayList, cArr, cArr2, i2, a, i3, a2);
                    i2 = a;
                    i3 = a2;
                } else {
                    if (contains) {
                        arrayList.add(Integer.valueOf(1));
                    } else if (contains2) {
                        arrayList.add(Integer.valueOf(2));
                        i2++;
                    } else {
                        arrayList.add(Integer.valueOf(0));
                        i2++;
                    }
                    i3++;
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        while (i < arrayList.size()) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
            i++;
        }
        return iArr;
    }

    private static int a(char[] cArr, int i, Set<Character> set) {
        while (i < cArr.length) {
            if (!set.contains(Character.valueOf(cArr[i]))) {
                return i;
            }
            i++;
        }
        return cArr.length;
    }

    private static void d(List<Integer> list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            list.add(Integer.valueOf(i2));
        }
    }

    private static void a(List<Integer> list, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4) {
        List<Integer> list2 = list;
        int i5 = i2 - i;
        int i6 = i4 - i3;
        int max = Math.max(i5, i6);
        if (i5 == i6) {
            d(list, max, 0);
            return;
        }
        int i7;
        int i8;
        int i9;
        i5++;
        i6++;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i5, i6});
        for (i7 = 0; i7 < i5; i7++) {
            iArr[i7][0] = i7;
        }
        for (i7 = 0; i7 < i6; i7++) {
            iArr[0][i7] = i7;
        }
        for (i7 = 1; i7 < i5; i7++) {
            for (int i10 = 1; i10 < i6; i10++) {
                i8 = i7 - 1;
                i9 = i10 - 1;
                iArr[i7][i10] = m(iArr[i8][i10] + 1, iArr[i7][i9] + 1, iArr[i8][i9] + (cArr[i8 + i] == cArr2[i9 + i3] ? 0 : 1));
            }
        }
        ArrayList arrayList = new ArrayList(max * 2);
        i5--;
        i6--;
        while (true) {
            if (i5 <= 0 && i6 <= 0) {
                break;
            }
            if (i5 == 0) {
                arrayList.add(Integer.valueOf(1));
            } else {
                if (i6 == 0) {
                    arrayList.add(Integer.valueOf(2));
                } else {
                    i8 = i6 - 1;
                    max = iArr[i5][i8];
                    int i11 = i5 - 1;
                    i9 = iArr[i11][i6];
                    i8 = iArr[i11][i8];
                    if (max < i9 && max < i8) {
                        arrayList.add(Integer.valueOf(1));
                    } else if (i9 < i8) {
                        arrayList.add(Integer.valueOf(2));
                    } else {
                        arrayList.add(Integer.valueOf(0));
                        i5--;
                    }
                }
                i5--;
            }
            i6--;
        }
        for (i5 = arrayList.size() - 1; i5 >= 0; i5--) {
            list.add(arrayList.get(i5));
        }
    }

    private static int m(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }
}
