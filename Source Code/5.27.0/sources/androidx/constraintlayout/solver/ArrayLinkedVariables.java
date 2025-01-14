package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable.Type;
import java.io.PrintStream;
import java.util.Arrays;

public class ArrayLinkedVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    private static final int NONE = -1;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    int currentSize = 0;
    private int[] mArrayIndices;
    private int[] mArrayNextIndices;
    private float[] mArrayValues;
    private final Cache mCache;
    private boolean mDidFillOnce;
    private int mHead;
    private int mLast;
    private final ArrayRow mRow;

    ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        int i = this.ROW_SIZE;
        this.mArrayIndices = new int[i];
        this.mArrayNextIndices = new int[i];
        this.mArrayValues = new float[i];
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    public final void put(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i = this.mHead;
        int i2;
        int[] iArr;
        if (i == -1) {
            this.mHead = 0;
            float[] fArr = this.mArrayValues;
            int i3 = this.mHead;
            fArr[i3] = f;
            this.mArrayIndices[i3] = solverVariable.id;
            this.mArrayNextIndices[this.mHead] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
                i2 = this.mLast;
                iArr = this.mArrayIndices;
                if (i2 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                }
            }
            return;
        }
        int[] iArr2;
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                this.mArrayValues[i] = f;
                return;
            }
            if (this.mArrayIndices[i] < solverVariable.id) {
                i5 = i;
            }
            i = this.mArrayNextIndices[i];
            i4++;
        }
        i = this.mLast;
        i4 = i + 1;
        if (this.mDidFillOnce) {
            iArr2 = this.mArrayIndices;
            if (iArr2[i] != -1) {
                i = iArr2.length;
            }
        } else {
            i = i4;
        }
        iArr2 = this.mArrayIndices;
        if (i >= iArr2.length && this.currentSize < iArr2.length) {
            i4 = 0;
            while (true) {
                int[] iArr3 = this.mArrayIndices;
                if (i4 >= iArr3.length) {
                    break;
                } else if (iArr3[i4] == -1) {
                    i = i4;
                    break;
                } else {
                    i4++;
                }
            }
        }
        iArr2 = this.mArrayIndices;
        if (i >= iArr2.length) {
            i = iArr2.length;
            this.ROW_SIZE *= 2;
            this.mDidFillOnce = false;
            this.mLast = i - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[i] = solverVariable.id;
        this.mArrayValues[i] = f;
        if (i5 != -1) {
            iArr = this.mArrayNextIndices;
            iArr[i] = iArr[i5];
            iArr[i5] = i;
        } else {
            this.mArrayNextIndices[i] = this.mHead;
            this.mHead = i;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        this.currentSize++;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        if (this.currentSize >= this.mArrayIndices.length) {
            this.mDidFillOnce = true;
        }
        i2 = this.mLast;
        iArr = this.mArrayIndices;
        if (i2 >= iArr.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr.length - 1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void add(SolverVariable solverVariable, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.mHead;
            int i2;
            int i3;
            int[] iArr;
            if (i == -1) {
                this.mHead = 0;
                float[] fArr = this.mArrayValues;
                i2 = this.mHead;
                fArr[i2] = f;
                this.mArrayIndices[i2] = solverVariable.id;
                this.mArrayNextIndices[this.mHead] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.currentSize++;
                if (!this.mDidFillOnce) {
                    this.mLast++;
                    i3 = this.mLast;
                    iArr = this.mArrayIndices;
                    if (i3 >= iArr.length) {
                        this.mDidFillOnce = true;
                        this.mLast = iArr.length - 1;
                    }
                }
                return;
            }
            int[] iArr2;
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.currentSize) {
                if (this.mArrayIndices[i] == solverVariable.id) {
                    float[] fArr2 = this.mArrayValues;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i];
                        } else {
                            iArr = this.mArrayNextIndices;
                            iArr[i5] = iArr[i];
                        }
                        if (z) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i;
                        }
                        solverVariable.usageInRowCount--;
                        this.currentSize--;
                    }
                    return;
                }
                if (this.mArrayIndices[i] < solverVariable.id) {
                    i5 = i;
                }
                i = this.mArrayNextIndices[i];
                i4++;
            }
            int i6 = this.mLast;
            i2 = i6 + 1;
            if (this.mDidFillOnce) {
                iArr2 = this.mArrayIndices;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i2;
            }
            iArr2 = this.mArrayIndices;
            if (i6 >= iArr2.length && this.currentSize < iArr2.length) {
                i2 = 0;
                while (true) {
                    int[] iArr3 = this.mArrayIndices;
                    if (i2 >= iArr3.length) {
                        break;
                    } else if (iArr3[i2] == -1) {
                        i6 = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            iArr2 = this.mArrayIndices;
            if (i6 >= iArr2.length) {
                i6 = iArr2.length;
                this.ROW_SIZE *= 2;
                this.mDidFillOnce = false;
                this.mLast = i6 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i6] = solverVariable.id;
            this.mArrayValues[i6] = f;
            if (i5 != -1) {
                iArr = this.mArrayNextIndices;
                iArr[i6] = iArr[i5];
                iArr[i5] = i6;
            } else {
                this.mArrayNextIndices[i6] = this.mHead;
                this.mHead = i6;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            i3 = this.mLast;
            iArr = this.mArrayIndices;
            if (i3 >= iArr.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr.length - 1;
            }
        }
    }

    public final float remove(SolverVariable solverVariable, boolean z) {
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        int i = this.mHead;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                if (i == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[i] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i;
                }
                return this.mArrayValues[i];
            }
            i2++;
            i3 = i;
            i = this.mArrayNextIndices[i];
        }
        return 0.0f;
    }

    public final void clear() {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean containsKey(SolverVariable solverVariable) {
        int i = this.mHead;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return true;
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasAtLeastOnePositiveVariable() {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayValues[i] > 0.0f) {
                return true;
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void invert() {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] * -1.0f;
            i = this.mArrayNextIndices[i];
            i2++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void divideByAmount(float f) {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] / f;
            i = this.mArrayNextIndices[i];
            i2++;
        }
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    public androidx.constraintlayout.solver.SolverVariable chooseSubject(androidx.constraintlayout.solver.LinearSystem r15) {
        /*
        r14 = this;
        r0 = r14.mHead;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = r1;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
    L_0x000a:
        r9 = -1;
        if (r0 == r9) goto L_0x009b;
    L_0x000d:
        r9 = r14.currentSize;
        if (r2 >= r9) goto L_0x009b;
    L_0x0011:
        r9 = r14.mArrayValues;
        r9 = r9[r0];
        r10 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r11 = r14.mCache;
        r11 = r11.mIndexedVariables;
        r12 = r14.mArrayIndices;
        r12 = r12[r0];
        r11 = r11[r12];
        r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r12 >= 0) goto L_0x0037;
    L_0x0026:
        r10 = -1165815185; // 0xffffffffba83126f float:-0.001 double:NaN;
        r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r10 <= 0) goto L_0x0045;
    L_0x002d:
        r9 = r14.mArrayValues;
        r9[r0] = r3;
        r9 = r14.mRow;
        r11.removeFromRow(r9);
        goto L_0x0044;
    L_0x0037:
        r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r10 >= 0) goto L_0x0045;
    L_0x003b:
        r9 = r14.mArrayValues;
        r9[r0] = r3;
        r9 = r14.mRow;
        r11.removeFromRow(r9);
    L_0x0044:
        r9 = 0;
    L_0x0045:
        r10 = 1;
        r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r12 == 0) goto L_0x0093;
    L_0x004a:
        r12 = r11.mType;
        r13 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED;
        if (r12 != r13) goto L_0x006f;
    L_0x0050:
        if (r4 != 0) goto L_0x005a;
    L_0x0052:
        r4 = r14.isNew(r11, r15);
    L_0x0056:
        r6 = r4;
        r5 = r9;
        r4 = r11;
        goto L_0x0093;
    L_0x005a:
        r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r12 <= 0) goto L_0x0063;
    L_0x005e:
        r4 = r14.isNew(r11, r15);
        goto L_0x0056;
    L_0x0063:
        if (r6 != 0) goto L_0x0093;
    L_0x0065:
        r12 = r14.isNew(r11, r15);
        if (r12 == 0) goto L_0x0093;
    L_0x006b:
        r5 = r9;
        r4 = r11;
        r6 = 1;
        goto L_0x0093;
    L_0x006f:
        if (r4 != 0) goto L_0x0093;
    L_0x0071:
        r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r12 >= 0) goto L_0x0093;
    L_0x0075:
        if (r1 != 0) goto L_0x007f;
    L_0x0077:
        r1 = r14.isNew(r11, r15);
    L_0x007b:
        r8 = r1;
        r7 = r9;
        r1 = r11;
        goto L_0x0093;
    L_0x007f:
        r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r12 <= 0) goto L_0x0088;
    L_0x0083:
        r1 = r14.isNew(r11, r15);
        goto L_0x007b;
    L_0x0088:
        if (r8 != 0) goto L_0x0093;
    L_0x008a:
        r12 = r14.isNew(r11, r15);
        if (r12 == 0) goto L_0x0093;
    L_0x0090:
        r7 = r9;
        r1 = r11;
        r8 = 1;
    L_0x0093:
        r9 = r14.mArrayNextIndices;
        r0 = r9[r0];
        r2 = r2 + 1;
        goto L_0x000a;
    L_0x009b:
        if (r4 == 0) goto L_0x009e;
    L_0x009d:
        return r4;
    L_0x009e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.ArrayLinkedVariables.chooseSubject(androidx.constraintlayout.solver.LinearSystem):androidx.constraintlayout.solver.SolverVariable");
    }

    /* Access modifiers changed, original: final */
    public final void updateFromRow(ArrayRow arrayRow, ArrayRow arrayRow2, boolean z) {
        int i = this.mHead;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.currentSize) {
                if (this.mArrayIndices[i] == arrayRow2.variable.id) {
                    float f = this.mArrayValues[i];
                    remove(arrayRow2.variable, z);
                    ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                    int i3 = arrayLinkedVariables.mHead;
                    int i4 = 0;
                    while (i3 != -1 && i4 < arrayLinkedVariables.currentSize) {
                        add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i3]], arrayLinkedVariables.mArrayValues[i3] * f, z);
                        i3 = arrayLinkedVariables.mArrayNextIndices[i3];
                        i4++;
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    if (z) {
                        arrayRow2.variable.removeFromRow(arrayRow);
                    }
                    i = this.mHead;
                } else {
                    i = this.mArrayNextIndices[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateFromSystem(ArrayRow arrayRow, ArrayRow[] arrayRowArr) {
        int i = this.mHead;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.currentSize) {
                SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if (solverVariable.definitionId != -1) {
                    float f = this.mArrayValues[i];
                    remove(solverVariable, true);
                    ArrayRow arrayRow2 = arrayRowArr[solverVariable.definitionId];
                    if (!arrayRow2.isSimpleDefinition) {
                        ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                        int i3 = arrayLinkedVariables.mHead;
                        int i4 = 0;
                        while (i3 != -1 && i4 < arrayLinkedVariables.currentSize) {
                            add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i3]], arrayLinkedVariables.mArrayValues[i3] * f, true);
                            i3 = arrayLinkedVariables.mArrayNextIndices[i3];
                            i4++;
                        }
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    arrayRow2.variable.removeFromRow(arrayRow);
                    i = this.mHead;
                } else {
                    i = this.mArrayNextIndices[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.candidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i = this.mHead;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayValues[i] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return solverVariable2;
    }

    /* Access modifiers changed, original: 0000 */
    public SolverVariable getPivotCandidate(boolean[] zArr, SolverVariable solverVariable) {
        int i = this.mHead;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayValues[i] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if ((zArr == null || !zArr[solverVariable3.id]) && solverVariable3 != solverVariable && (solverVariable3.mType == Type.SLACK || solverVariable3.mType == Type.ERROR)) {
                    float f2 = this.mArrayValues[i];
                    if (f2 < f) {
                        solverVariable2 = solverVariable3;
                        f = f2;
                    }
                }
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return solverVariable2;
    }

    /* Access modifiers changed, original: final */
    public final SolverVariable getVariable(int i) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (i3 == i) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final float getVariableValue(int i) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (i3 == i) {
                return this.mArrayValues[i2];
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float get(SolverVariable solverVariable) {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return this.mArrayValues[i];
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    public int sizeInBytes() {
        return (((this.mArrayIndices.length * 4) * 3) + 0) + 36;
    }

    public void display() {
        int i = this.currentSize;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(variable);
                stringBuilder.append(" = ");
                stringBuilder.append(getVariableValue(i2));
                stringBuilder.append(" ");
                printStream.print(stringBuilder.toString());
            }
        }
        System.out.println(" }");
    }

    public String toString() {
        int i = this.mHead;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mArrayValues[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mCache.mIndexedVariables[this.mArrayIndices[i]]);
            str = stringBuilder.toString();
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return str;
    }
}
