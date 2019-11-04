package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean CACHE_MEASURED_DIMENSION = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.3";
    SparseArray<View> mChildrenByIds = new SparseArray();
    private ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList(4);
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap();
    private boolean mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    private Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOptimizationLevel = 7;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList(100);

    public static class LayoutParams extends MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String dimensionRatio = null;
        int dimensionRatioSide = 1;
        float dimensionRatioValue = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneLeftMargin = -1;
        public int goneRightMargin = -1;
        public int goneStartMargin = -1;
        public int goneTopMargin = -1;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        boolean horizontalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
        public float horizontalWeight = -1.0f;
        boolean isGuideline = false;
        boolean isHelper = false;
        boolean isInPlaceholder = false;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int matchConstraintDefaultHeight = 0;
        public int matchConstraintDefaultWidth = 0;
        public int matchConstraintMaxHeight = 0;
        public int matchConstraintMaxWidth = 0;
        public int matchConstraintMinHeight = 0;
        public int matchConstraintMinWidth = 0;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        boolean needsBaseline = false;
        public int orientation = -1;
        int resolveGoneLeftMargin = -1;
        int resolveGoneRightMargin = -1;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias = 0.5f;
        int resolvedLeftToLeft = -1;
        int resolvedLeftToRight = -1;
        int resolvedRightToLeft = -1;
        int resolvedRightToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        boolean verticalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
        public float verticalWeight = -1.0f;
        ConstraintWidget widget = new ConstraintWidget();

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map = new SparseIntArray();

            private Table() {
            }

            static {
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                map.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.widget = layoutParams.widget;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = Table.map.get(index);
                String str = ConstraintLayout.TAG;
                float f;
                switch (i2) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        this.circleConstraint = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        if (this.circleConstraint != -1) {
                            break;
                        }
                        this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        f = this.circleAngle;
                        if (f >= 0.0f) {
                            break;
                        }
                        this.circleAngle = (360.0f - f) % 360.0f;
                        break;
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        this.leftToLeft = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        if (this.leftToLeft != -1) {
                            break;
                        }
                        this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 9:
                        this.leftToRight = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        if (this.leftToRight != -1) {
                            break;
                        }
                        this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 10:
                        this.rightToLeft = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        if (this.rightToLeft != -1) {
                            break;
                        }
                        this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 11:
                        this.rightToRight = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        if (this.rightToRight != -1) {
                            break;
                        }
                        this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 12:
                        this.topToTop = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        if (this.topToTop != -1) {
                            break;
                        }
                        this.topToTop = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 13:
                        this.topToBottom = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        if (this.topToBottom != -1) {
                            break;
                        }
                        this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 14:
                        this.bottomToTop = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        if (this.bottomToTop != -1) {
                            break;
                        }
                        this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 15:
                        this.bottomToBottom = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        if (this.bottomToBottom != -1) {
                            break;
                        }
                        this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 16:
                        this.baselineToBaseline = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        if (this.baselineToBaseline != -1) {
                            break;
                        }
                        this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 17:
                        this.startToEnd = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        if (this.startToEnd != -1) {
                            break;
                        }
                        this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 18:
                        this.startToStart = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        if (this.startToStart != -1) {
                            break;
                        }
                        this.startToStart = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 19:
                        this.endToStart = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        if (this.endToStart != -1) {
                            break;
                        }
                        this.endToStart = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 20:
                        this.endToEnd = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        if (this.endToEnd != -1) {
                            break;
                        }
                        this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                        break;
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                        if (this.matchConstraintDefaultWidth != 1) {
                            break;
                        }
                        Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    case 32:
                        this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                        if (this.matchConstraintDefaultHeight != 1) {
                            break;
                        }
                        Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) != -2) {
                                break;
                            }
                            this.matchConstraintMinWidth = -2;
                            break;
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) != -2) {
                                break;
                            }
                            this.matchConstraintMaxWidth = -2;
                            break;
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) != -2) {
                                break;
                            }
                            this.matchConstraintMinHeight = -2;
                            break;
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) != -2) {
                                break;
                            }
                            this.matchConstraintMaxHeight = -2;
                            break;
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        break;
                    case 44:
                        this.dimensionRatio = obtainStyledAttributes.getString(index);
                        this.dimensionRatioValue = Float.NaN;
                        this.dimensionRatioSide = -1;
                        String str2 = this.dimensionRatio;
                        if (str2 == null) {
                            break;
                        }
                        index = str2.length();
                        i2 = this.dimensionRatio.indexOf(44);
                        if (i2 <= 0 || i2 >= index - 1) {
                            i2 = 0;
                        } else {
                            str = this.dimensionRatio.substring(0, i2);
                            if (str.equalsIgnoreCase("W")) {
                                this.dimensionRatioSide = 0;
                            } else if (str.equalsIgnoreCase("H")) {
                                this.dimensionRatioSide = 1;
                            }
                            i2++;
                        }
                        int indexOf = this.dimensionRatio.indexOf(58);
                        if (indexOf >= 0 && indexOf < index - 1) {
                            str2 = this.dimensionRatio.substring(i2, indexOf);
                            String substring = this.dimensionRatio.substring(indexOf + 1);
                            if (str2.length() > 0 && substring.length() > 0) {
                                try {
                                    f = Float.parseFloat(str2);
                                    float parseFloat = Float.parseFloat(substring);
                                    if (f > 0.0f && parseFloat > 0.0f) {
                                        if (this.dimensionRatioSide != 1) {
                                            this.dimensionRatioValue = Math.abs(f / parseFloat);
                                            break;
                                        } else {
                                            this.dimensionRatioValue = Math.abs(parseFloat / f);
                                            break;
                                        }
                                    }
                                } catch (NumberFormatException unused5) {
                                    break;
                                }
                            }
                        }
                        str2 = this.dimensionRatio.substring(i2);
                        if (str2.length() <= 0) {
                            break;
                        }
                        this.dimensionRatioValue = Float.parseFloat(str2);
                        break;
                        break;
                    case 45:
                        this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 46:
                        this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 47:
                        this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 50:
                        this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    default:
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.verticalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                this.horizontalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                this.verticalDimensionFixed = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                if (!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
                ((Guideline) this.widget).setOrientation(this.orientation);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r7) {
            /*
            r6 = this;
            r0 = r6.leftMargin;
            r1 = r6.rightMargin;
            super.resolveLayoutDirection(r7);
            r7 = -1;
            r6.resolvedRightToLeft = r7;
            r6.resolvedRightToRight = r7;
            r6.resolvedLeftToLeft = r7;
            r6.resolvedLeftToRight = r7;
            r6.resolveGoneLeftMargin = r7;
            r6.resolveGoneRightMargin = r7;
            r2 = r6.goneLeftMargin;
            r6.resolveGoneLeftMargin = r2;
            r2 = r6.goneRightMargin;
            r6.resolveGoneRightMargin = r2;
            r2 = r6.horizontalBias;
            r6.resolvedHorizontalBias = r2;
            r2 = r6.guideBegin;
            r6.resolvedGuideBegin = r2;
            r2 = r6.guideEnd;
            r6.resolvedGuideEnd = r2;
            r2 = r6.guidePercent;
            r6.resolvedGuidePercent = r2;
            r2 = r6.getLayoutDirection();
            r3 = 0;
            r4 = 1;
            if (r4 != r2) goto L_0x0036;
        L_0x0034:
            r2 = 1;
            goto L_0x0037;
        L_0x0036:
            r2 = 0;
        L_0x0037:
            if (r2 == 0) goto L_0x009a;
        L_0x0039:
            r2 = r6.startToEnd;
            if (r2 == r7) goto L_0x0041;
        L_0x003d:
            r6.resolvedRightToLeft = r2;
        L_0x003f:
            r3 = 1;
            goto L_0x0048;
        L_0x0041:
            r2 = r6.startToStart;
            if (r2 == r7) goto L_0x0048;
        L_0x0045:
            r6.resolvedRightToRight = r2;
            goto L_0x003f;
        L_0x0048:
            r2 = r6.endToStart;
            if (r2 == r7) goto L_0x004f;
        L_0x004c:
            r6.resolvedLeftToRight = r2;
            r3 = 1;
        L_0x004f:
            r2 = r6.endToEnd;
            if (r2 == r7) goto L_0x0056;
        L_0x0053:
            r6.resolvedLeftToLeft = r2;
            r3 = 1;
        L_0x0056:
            r2 = r6.goneStartMargin;
            if (r2 == r7) goto L_0x005c;
        L_0x005a:
            r6.resolveGoneRightMargin = r2;
        L_0x005c:
            r2 = r6.goneEndMargin;
            if (r2 == r7) goto L_0x0062;
        L_0x0060:
            r6.resolveGoneLeftMargin = r2;
        L_0x0062:
            r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            if (r3 == 0) goto L_0x006c;
        L_0x0066:
            r3 = r6.horizontalBias;
            r3 = r2 - r3;
            r6.resolvedHorizontalBias = r3;
        L_0x006c:
            r3 = r6.isGuideline;
            if (r3 == 0) goto L_0x00be;
        L_0x0070:
            r3 = r6.orientation;
            if (r3 != r4) goto L_0x00be;
        L_0x0074:
            r3 = r6.guidePercent;
            r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
            if (r5 == 0) goto L_0x0084;
        L_0x007c:
            r2 = r2 - r3;
            r6.resolvedGuidePercent = r2;
            r6.resolvedGuideBegin = r7;
            r6.resolvedGuideEnd = r7;
            goto L_0x00be;
        L_0x0084:
            r2 = r6.guideBegin;
            if (r2 == r7) goto L_0x008f;
        L_0x0088:
            r6.resolvedGuideEnd = r2;
            r6.resolvedGuideBegin = r7;
            r6.resolvedGuidePercent = r4;
            goto L_0x00be;
        L_0x008f:
            r2 = r6.guideEnd;
            if (r2 == r7) goto L_0x00be;
        L_0x0093:
            r6.resolvedGuideBegin = r2;
            r6.resolvedGuideEnd = r7;
            r6.resolvedGuidePercent = r4;
            goto L_0x00be;
        L_0x009a:
            r2 = r6.startToEnd;
            if (r2 == r7) goto L_0x00a0;
        L_0x009e:
            r6.resolvedLeftToRight = r2;
        L_0x00a0:
            r2 = r6.startToStart;
            if (r2 == r7) goto L_0x00a6;
        L_0x00a4:
            r6.resolvedLeftToLeft = r2;
        L_0x00a6:
            r2 = r6.endToStart;
            if (r2 == r7) goto L_0x00ac;
        L_0x00aa:
            r6.resolvedRightToLeft = r2;
        L_0x00ac:
            r2 = r6.endToEnd;
            if (r2 == r7) goto L_0x00b2;
        L_0x00b0:
            r6.resolvedRightToRight = r2;
        L_0x00b2:
            r2 = r6.goneStartMargin;
            if (r2 == r7) goto L_0x00b8;
        L_0x00b6:
            r6.resolveGoneLeftMargin = r2;
        L_0x00b8:
            r2 = r6.goneEndMargin;
            if (r2 == r7) goto L_0x00be;
        L_0x00bc:
            r6.resolveGoneRightMargin = r2;
        L_0x00be:
            r2 = r6.endToStart;
            if (r2 != r7) goto L_0x0108;
        L_0x00c2:
            r2 = r6.endToEnd;
            if (r2 != r7) goto L_0x0108;
        L_0x00c6:
            r2 = r6.startToStart;
            if (r2 != r7) goto L_0x0108;
        L_0x00ca:
            r2 = r6.startToEnd;
            if (r2 != r7) goto L_0x0108;
        L_0x00ce:
            r2 = r6.rightToLeft;
            if (r2 == r7) goto L_0x00dd;
        L_0x00d2:
            r6.resolvedRightToLeft = r2;
            r2 = r6.rightMargin;
            if (r2 > 0) goto L_0x00eb;
        L_0x00d8:
            if (r1 <= 0) goto L_0x00eb;
        L_0x00da:
            r6.rightMargin = r1;
            goto L_0x00eb;
        L_0x00dd:
            r2 = r6.rightToRight;
            if (r2 == r7) goto L_0x00eb;
        L_0x00e1:
            r6.resolvedRightToRight = r2;
            r2 = r6.rightMargin;
            if (r2 > 0) goto L_0x00eb;
        L_0x00e7:
            if (r1 <= 0) goto L_0x00eb;
        L_0x00e9:
            r6.rightMargin = r1;
        L_0x00eb:
            r1 = r6.leftToLeft;
            if (r1 == r7) goto L_0x00fa;
        L_0x00ef:
            r6.resolvedLeftToLeft = r1;
            r7 = r6.leftMargin;
            if (r7 > 0) goto L_0x0108;
        L_0x00f5:
            if (r0 <= 0) goto L_0x0108;
        L_0x00f7:
            r6.leftMargin = r0;
            goto L_0x0108;
        L_0x00fa:
            r1 = r6.leftToRight;
            if (r1 == r7) goto L_0x0108;
        L_0x00fe:
            r6.resolvedLeftToRight = r1;
            r7 = r6.leftMargin;
            if (r7 > 0) goto L_0x0108;
        L_0x0104:
            if (r0 <= 0) goto L_0x0108;
        L_0x0106:
            r6.leftMargin = r0;
        L_0x0108:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            obj = (String) obj;
            i = obj.indexOf("/");
            if (i != -1) {
                obj = obj.substring(i + 1);
            }
            this.mDesignIds.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
        }
        return null;
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    private void init(AttributeSet attributeSet) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    index = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.load(getContext(), index);
                    } catch (NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = index;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.widget = new Guideline();
            layoutParams.isGuideline = USE_CONSTRAINTS_HELPER;
            ((Guideline) layoutParams.widget).setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.remove(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private void updateHierarchy() {
        int childCount = getChildCount();
        Object obj = null;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.mVariableDimensionsWidgets.clear();
            setChildrenConstraints();
        }
    }

    private void setChildrenConstraints() {
        int i;
        View childAt;
        String resourceName;
        int indexOf;
        ConstraintWidget viewWidget;
        int i2;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        if (isInEditMode) {
            for (i = 0; i < childCount; i++) {
                childAt = getChildAt(i);
                try {
                    resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        }
        for (i = 0; i < childCount; i++) {
            viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (this.mConstraintSetId != -1) {
            for (i = 0; i < childCount; i++) {
                childAt = getChildAt(i);
                if (childAt.getId() == this.mConstraintSetId && (childAt instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this);
        }
        this.mLayoutWidget.removeAllChildren();
        i = this.mConstraintHelpers.size();
        if (i > 0) {
            for (i2 = 0; i2 < i; i2++) {
                ((ConstraintHelper) this.mConstraintHelpers.get(i2)).updatePreLayout(this);
            }
        }
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).updatePreLayout(this);
            }
        }
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            ConstraintWidget viewWidget2 = getViewWidget(childAt);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.validate();
                if (layoutParams.helped) {
                    layoutParams.helped = z;
                } else if (isInEditMode) {
                    try {
                        resourceName = getResources().getResourceName(childAt.getId());
                        setDesignInformation(z, resourceName, Integer.valueOf(childAt.getId()));
                        getTargetWidget(childAt.getId()).setDebugName(resourceName.substring(resourceName.indexOf("id/") + 3));
                    } catch (NotFoundException unused2) {
                    }
                }
                viewWidget2.setVisibility(childAt.getVisibility());
                if (layoutParams.isInPlaceholder) {
                    viewWidget2.setVisibility(8);
                }
                viewWidget2.setCompanionWidget(childAt);
                this.mLayoutWidget.add(viewWidget2);
                if (!(layoutParams.verticalDimensionFixed && layoutParams.horizontalDimensionFixed)) {
                    this.mVariableDimensionsWidgets.add(viewWidget2);
                }
                if (layoutParams.isGuideline) {
                    Guideline guideline = (Guideline) viewWidget2;
                    i2 = layoutParams.resolvedGuideBegin;
                    indexOf = layoutParams.resolvedGuideEnd;
                    float f = layoutParams.resolvedGuidePercent;
                    if (VERSION.SDK_INT < 17) {
                        i2 = layoutParams.guideBegin;
                        indexOf = layoutParams.guideEnd;
                        f = layoutParams.guidePercent;
                    }
                    if (f != -1.0f) {
                        guideline.setGuidePercent(f);
                    } else if (i2 != -1) {
                        guideline.setGuideBegin(i2);
                    } else if (indexOf != -1) {
                        guideline.setGuideEnd(indexOf);
                    }
                } else if (layoutParams.leftToLeft != -1 || layoutParams.leftToRight != -1 || layoutParams.rightToLeft != -1 || layoutParams.rightToRight != -1 || layoutParams.startToStart != -1 || layoutParams.startToEnd != -1 || layoutParams.endToStart != -1 || layoutParams.endToEnd != -1 || layoutParams.topToTop != -1 || layoutParams.topToBottom != -1 || layoutParams.bottomToTop != -1 || layoutParams.bottomToBottom != -1 || layoutParams.baselineToBaseline != -1 || layoutParams.editorAbsoluteX != -1 || layoutParams.editorAbsoluteY != -1 || layoutParams.circleConstraint != -1 || layoutParams.width == -1 || layoutParams.height == -1) {
                    int i3;
                    int i4;
                    i2 = layoutParams.resolvedLeftToLeft;
                    indexOf = layoutParams.resolvedLeftToRight;
                    int i5 = layoutParams.resolvedRightToLeft;
                    int i6 = layoutParams.resolvedRightToRight;
                    int i7 = layoutParams.resolveGoneLeftMargin;
                    int i8 = layoutParams.resolveGoneRightMargin;
                    float f2 = layoutParams.resolvedHorizontalBias;
                    if (VERSION.SDK_INT < 17) {
                        i3 = layoutParams.leftToLeft;
                        i2 = layoutParams.leftToRight;
                        i5 = layoutParams.rightToLeft;
                        i6 = layoutParams.rightToRight;
                        int i9 = layoutParams.goneLeftMargin;
                        indexOf = layoutParams.goneRightMargin;
                        f2 = layoutParams.horizontalBias;
                        if (i3 == -1 && i2 == -1) {
                            if (layoutParams.startToStart != -1) {
                                i3 = layoutParams.startToStart;
                            } else if (layoutParams.startToEnd != -1) {
                                i2 = layoutParams.startToEnd;
                            }
                        }
                        int i10 = i2;
                        i2 = i3;
                        i3 = i10;
                        if (i5 == -1 && i6 == -1) {
                            if (layoutParams.endToStart != -1) {
                                i5 = layoutParams.endToStart;
                            } else if (layoutParams.endToEnd != -1) {
                                i6 = layoutParams.endToEnd;
                            }
                        }
                        i8 = i9;
                        i4 = indexOf;
                    } else {
                        i3 = indexOf;
                        i4 = i8;
                        i8 = i7;
                    }
                    i7 = i6;
                    float f3 = f2;
                    int i11 = i5;
                    if (layoutParams.circleConstraint != -1) {
                        ConstraintWidget targetWidget = getTargetWidget(layoutParams.circleConstraint);
                        if (targetWidget != null) {
                            viewWidget2.connectCircularConstraint(targetWidget, layoutParams.circleAngle, layoutParams.circleRadius);
                        }
                    } else {
                        ConstraintWidget targetWidget2;
                        float f4;
                        if (i2 != -1) {
                            targetWidget2 = getTargetWidget(i2);
                            if (targetWidget2 != null) {
                                Type type = Type.LEFT;
                                f4 = f3;
                                Type type2 = Type.LEFT;
                                i3 = i7;
                                viewWidget2.immediateConnect(type, targetWidget2, type2, layoutParams.leftMargin, i8);
                            } else {
                                f4 = f3;
                                i3 = i7;
                            }
                            i2 = i3;
                        } else {
                            f4 = f3;
                            i2 = i7;
                            if (i3 != -1) {
                                targetWidget2 = getTargetWidget(i3);
                                if (targetWidget2 != null) {
                                    viewWidget2.immediateConnect(Type.LEFT, targetWidget2, Type.RIGHT, layoutParams.leftMargin, i8);
                                }
                            }
                        }
                        if (i11 != -1) {
                            targetWidget2 = getTargetWidget(i11);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.RIGHT, targetWidget2, Type.LEFT, layoutParams.rightMargin, i4);
                            }
                        } else if (i2 != -1) {
                            targetWidget2 = getTargetWidget(i2);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.RIGHT, targetWidget2, Type.RIGHT, layoutParams.rightMargin, i4);
                            }
                        }
                        if (layoutParams.topToTop != -1) {
                            targetWidget2 = getTargetWidget(layoutParams.topToTop);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.TOP, targetWidget2, Type.TOP, layoutParams.topMargin, layoutParams.goneTopMargin);
                            }
                        } else if (layoutParams.topToBottom != -1) {
                            targetWidget2 = getTargetWidget(layoutParams.topToBottom);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.TOP, targetWidget2, Type.BOTTOM, layoutParams.topMargin, layoutParams.goneTopMargin);
                            }
                        }
                        if (layoutParams.bottomToTop != -1) {
                            targetWidget2 = getTargetWidget(layoutParams.bottomToTop);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.BOTTOM, targetWidget2, Type.TOP, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                            }
                        } else if (layoutParams.bottomToBottom != -1) {
                            targetWidget2 = getTargetWidget(layoutParams.bottomToBottom);
                            if (targetWidget2 != null) {
                                viewWidget2.immediateConnect(Type.BOTTOM, targetWidget2, Type.BOTTOM, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                            }
                        }
                        if (layoutParams.baselineToBaseline != -1) {
                            View view = (View) this.mChildrenByIds.get(layoutParams.baselineToBaseline);
                            viewWidget = getTargetWidget(layoutParams.baselineToBaseline);
                            if (!(viewWidget == null || view == null || !(view.getLayoutParams() instanceof LayoutParams))) {
                                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                                layoutParams.needsBaseline = USE_CONSTRAINTS_HELPER;
                                layoutParams2.needsBaseline = USE_CONSTRAINTS_HELPER;
                                viewWidget2.getAnchor(Type.BASELINE).connect(viewWidget.getAnchor(Type.BASELINE), 0, -1, Strength.STRONG, 0, USE_CONSTRAINTS_HELPER);
                                viewWidget2.getAnchor(Type.TOP).reset();
                                viewWidget2.getAnchor(Type.BOTTOM).reset();
                            }
                        }
                        f2 = f4;
                        if (f2 >= 0.0f && f2 != 0.5f) {
                            viewWidget2.setHorizontalBiasPercent(f2);
                        }
                        if (layoutParams.verticalBias >= 0.0f && layoutParams.verticalBias != 0.5f) {
                            viewWidget2.setVerticalBiasPercent(layoutParams.verticalBias);
                        }
                    }
                    if (isInEditMode && !(layoutParams.editorAbsoluteX == -1 && layoutParams.editorAbsoluteY == -1)) {
                        viewWidget2.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
                    }
                    if (layoutParams.horizontalDimensionFixed) {
                        viewWidget2.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                        viewWidget2.setWidth(layoutParams.width);
                    } else if (layoutParams.width == -1) {
                        viewWidget2.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.getAnchor(Type.LEFT).mMargin = layoutParams.leftMargin;
                        viewWidget2.getAnchor(Type.RIGHT).mMargin = layoutParams.rightMargin;
                    } else {
                        viewWidget2.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                        viewWidget2.setWidth(0);
                    }
                    if (layoutParams.verticalDimensionFixed) {
                        z = false;
                        viewWidget2.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                        viewWidget2.setHeight(layoutParams.height);
                    } else if (layoutParams.height == -1) {
                        viewWidget2.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.getAnchor(Type.TOP).mMargin = layoutParams.topMargin;
                        viewWidget2.getAnchor(Type.BOTTOM).mMargin = layoutParams.bottomMargin;
                        z = false;
                    } else {
                        viewWidget2.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                        z = false;
                        viewWidget2.setHeight(0);
                    }
                    if (layoutParams.dimensionRatio != null) {
                        viewWidget2.setDimensionRatio(layoutParams.dimensionRatio);
                    }
                    viewWidget2.setHorizontalWeight(layoutParams.horizontalWeight);
                    viewWidget2.setVerticalWeight(layoutParams.verticalWeight);
                    viewWidget2.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
                    viewWidget2.setVerticalChainStyle(layoutParams.verticalChainStyle);
                    viewWidget2.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
                    viewWidget2.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
                }
            }
        }
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = (View) this.mChildrenByIds.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        ConstraintWidget constraintWidget;
        if (view == null) {
            constraintWidget = null;
        } else {
            constraintWidget = ((LayoutParams) view.getLayoutParams()).widget;
        }
        return constraintWidget;
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        ConstraintWidget constraintWidget;
        if (view == null) {
            constraintWidget = null;
        } else {
            constraintWidget = ((LayoutParams) view.getLayoutParams()).widget;
        }
        return constraintWidget;
    }

    private void internalMeasureChildren(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.widget;
                if (!(layoutParams.isGuideline || layoutParams.isHelper)) {
                    int childMeasureSpec;
                    Object obj;
                    Object obj2;
                    constraintWidget.setVisibility(childAt.getVisibility());
                    int i6 = layoutParams.width;
                    int i7 = layoutParams.height;
                    Object obj3 = (layoutParams.horizontalDimensionFixed || layoutParams.verticalDimensionFixed || ((!layoutParams.horizontalDimensionFixed && layoutParams.matchConstraintDefaultWidth == 1) || layoutParams.width == -1 || (!layoutParams.verticalDimensionFixed && (layoutParams.matchConstraintDefaultHeight == 1 || layoutParams.height == -1)))) ? 1 : null;
                    if (obj3 != null) {
                        int childMeasureSpec2;
                        if (i6 == 0) {
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                            obj = 1;
                        } else if (i6 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                            obj = null;
                        } else {
                            obj = i6 == -2 ? 1 : null;
                            childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                        }
                        if (i7 == 0) {
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                            obj2 = 1;
                        } else if (i7 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                            obj2 = null;
                        } else {
                            obj2 = i7 == -2 ? 1 : null;
                            childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        Metrics metrics = this.mMetrics;
                        if (metrics != null) {
                            metrics.measures++;
                        }
                        constraintWidget.setWidthWrapContent(i6 == -2 ? USE_CONSTRAINTS_HELPER : false);
                        constraintWidget.setHeightWrapContent(i7 == -2 ? USE_CONSTRAINTS_HELPER : false);
                        i6 = childAt.getMeasuredWidth();
                        i7 = childAt.getMeasuredHeight();
                    } else {
                        obj = null;
                        obj2 = null;
                    }
                    constraintWidget.setWidth(i6);
                    constraintWidget.setHeight(i7);
                    if (obj != null) {
                        constraintWidget.setWrapWidth(i6);
                    }
                    if (obj2 != null) {
                        constraintWidget.setWrapHeight(i7);
                    }
                    if (layoutParams.needsBaseline) {
                        childMeasureSpec = childAt.getBaseline();
                        if (childMeasureSpec != -1) {
                            constraintWidget.setBaselineDistance(childMeasureSpec);
                        }
                    }
                }
            }
        }
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).updatePostMeasure(this);
            }
        }
        childCount = this.mConstraintHelpers.size();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                ((ConstraintHelper) this.mConstraintHelpers.get(i2)).updatePostMeasure(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    private void internalMeasureDimensions(int r24, int r25) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r3 = r23.getPaddingTop();
        r4 = r23.getPaddingBottom();
        r3 = r3 + r4;
        r4 = r23.getPaddingLeft();
        r5 = r23.getPaddingRight();
        r4 = r4 + r5;
        r5 = r23.getChildCount();
        r7 = 0;
    L_0x001d:
        r8 = 1;
        r10 = 8;
        r12 = -2;
        if (r7 >= r5) goto L_0x00de;
    L_0x0024:
        r14 = r0.getChildAt(r7);
        r15 = r14.getVisibility();
        if (r15 != r10) goto L_0x0030;
    L_0x002e:
        goto L_0x00d6;
    L_0x0030:
        r10 = r14.getLayoutParams();
        r10 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r10;
        r15 = r10.widget;
        r6 = r10.isGuideline;
        if (r6 != 0) goto L_0x00d6;
    L_0x003c:
        r6 = r10.isHelper;
        if (r6 == 0) goto L_0x0042;
    L_0x0040:
        goto L_0x00d6;
    L_0x0042:
        r6 = r14.getVisibility();
        r15.setVisibility(r6);
        r6 = r10.width;
        r13 = r10.height;
        if (r6 == 0) goto L_0x00c6;
    L_0x004f:
        if (r13 != 0) goto L_0x0053;
    L_0x0051:
        goto L_0x00c6;
    L_0x0053:
        if (r6 != r12) goto L_0x0058;
    L_0x0055:
        r16 = 1;
        goto L_0x005a;
    L_0x0058:
        r16 = 0;
    L_0x005a:
        r11 = getChildMeasureSpec(r1, r4, r6);
        if (r13 != r12) goto L_0x0063;
    L_0x0060:
        r17 = 1;
        goto L_0x0065;
    L_0x0063:
        r17 = 0;
    L_0x0065:
        r12 = getChildMeasureSpec(r2, r3, r13);
        r14.measure(r11, r12);
        r11 = r0.mMetrics;
        if (r11 == 0) goto L_0x0077;
    L_0x0070:
        r12 = r3;
        r2 = r11.measures;
        r2 = r2 + r8;
        r11.measures = r2;
        goto L_0x0078;
    L_0x0077:
        r12 = r3;
    L_0x0078:
        r2 = -2;
        if (r6 != r2) goto L_0x007d;
    L_0x007b:
        r3 = 1;
        goto L_0x007e;
    L_0x007d:
        r3 = 0;
    L_0x007e:
        r15.setWidthWrapContent(r3);
        if (r13 != r2) goto L_0x0085;
    L_0x0083:
        r2 = 1;
        goto L_0x0086;
    L_0x0085:
        r2 = 0;
    L_0x0086:
        r15.setHeightWrapContent(r2);
        r2 = r14.getMeasuredWidth();
        r3 = r14.getMeasuredHeight();
        r15.setWidth(r2);
        r15.setHeight(r3);
        if (r16 == 0) goto L_0x009c;
    L_0x0099:
        r15.setWrapWidth(r2);
    L_0x009c:
        if (r17 == 0) goto L_0x00a1;
    L_0x009e:
        r15.setWrapHeight(r3);
    L_0x00a1:
        r6 = r10.needsBaseline;
        if (r6 == 0) goto L_0x00af;
    L_0x00a5:
        r6 = r14.getBaseline();
        r8 = -1;
        if (r6 == r8) goto L_0x00af;
    L_0x00ac:
        r15.setBaselineDistance(r6);
    L_0x00af:
        r6 = r10.horizontalDimensionFixed;
        if (r6 == 0) goto L_0x00d7;
    L_0x00b3:
        r6 = r10.verticalDimensionFixed;
        if (r6 == 0) goto L_0x00d7;
    L_0x00b7:
        r6 = r15.getResolutionWidth();
        r6.resolve(r2);
        r2 = r15.getResolutionHeight();
        r2.resolve(r3);
        goto L_0x00d7;
    L_0x00c6:
        r12 = r3;
        r2 = r15.getResolutionWidth();
        r2.invalidate();
        r2 = r15.getResolutionHeight();
        r2.invalidate();
        goto L_0x00d7;
    L_0x00d6:
        r12 = r3;
    L_0x00d7:
        r7 = r7 + 1;
        r2 = r25;
        r3 = r12;
        goto L_0x001d;
    L_0x00de:
        r12 = r3;
        r2 = r0.mLayoutWidget;
        r2.solveGraph();
        r2 = 0;
    L_0x00e5:
        if (r2 >= r5) goto L_0x02e2;
    L_0x00e7:
        r3 = r0.getChildAt(r2);
        r6 = r3.getVisibility();
        if (r6 != r10) goto L_0x00f3;
    L_0x00f1:
        goto L_0x02ce;
    L_0x00f3:
        r6 = r3.getLayoutParams();
        r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6;
        r7 = r6.widget;
        r11 = r6.isGuideline;
        if (r11 != 0) goto L_0x02ce;
    L_0x00ff:
        r11 = r6.isHelper;
        if (r11 == 0) goto L_0x0105;
    L_0x0103:
        goto L_0x02ce;
    L_0x0105:
        r11 = r3.getVisibility();
        r7.setVisibility(r11);
        r11 = r6.width;
        r13 = r6.height;
        if (r11 == 0) goto L_0x0116;
    L_0x0112:
        if (r13 == 0) goto L_0x0116;
    L_0x0114:
        goto L_0x02ce;
    L_0x0116:
        r14 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT;
        r14 = r7.getAnchor(r14);
        r14 = r14.getResolutionNode();
        r15 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r15 = r7.getAnchor(r15);
        r15 = r15.getResolutionNode();
        r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT;
        r10 = r7.getAnchor(r10);
        r10 = r10.getTarget();
        if (r10 == 0) goto L_0x0144;
    L_0x0136:
        r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = r7.getAnchor(r10);
        r10 = r10.getTarget();
        if (r10 == 0) goto L_0x0144;
    L_0x0142:
        r10 = 1;
        goto L_0x0145;
    L_0x0144:
        r10 = 0;
    L_0x0145:
        r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP;
        r8 = r7.getAnchor(r8);
        r8 = r8.getResolutionNode();
        r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r9 = r7.getAnchor(r9);
        r9 = r9.getResolutionNode();
        r17 = r5;
        r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP;
        r5 = r7.getAnchor(r5);
        r5 = r5.getTarget();
        if (r5 == 0) goto L_0x0175;
    L_0x0167:
        r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r5 = r7.getAnchor(r5);
        r5 = r5.getTarget();
        if (r5 == 0) goto L_0x0175;
    L_0x0173:
        r5 = 1;
        goto L_0x0176;
    L_0x0175:
        r5 = 0;
    L_0x0176:
        if (r11 != 0) goto L_0x0188;
    L_0x0178:
        if (r13 != 0) goto L_0x0188;
    L_0x017a:
        if (r10 == 0) goto L_0x0188;
    L_0x017c:
        if (r5 == 0) goto L_0x0188;
    L_0x017e:
        r5 = r25;
        r20 = r2;
        r3 = -1;
        r10 = -2;
        r18 = 1;
        goto L_0x02d8;
    L_0x0188:
        r20 = r2;
        r2 = r0.mLayoutWidget;
        r2 = r2.getHorizontalDimensionBehaviour();
        r21 = r6;
        r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r2 == r6) goto L_0x0198;
    L_0x0196:
        r6 = 1;
        goto L_0x0199;
    L_0x0198:
        r6 = 0;
    L_0x0199:
        r2 = r0.mLayoutWidget;
        r2 = r2.getVerticalDimensionBehaviour();
        r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r2 == r0) goto L_0x01a5;
    L_0x01a3:
        r0 = 1;
        goto L_0x01a6;
    L_0x01a5:
        r0 = 0;
    L_0x01a6:
        if (r6 != 0) goto L_0x01af;
    L_0x01a8:
        r2 = r7.getResolutionWidth();
        r2.invalidate();
    L_0x01af:
        if (r0 != 0) goto L_0x01b8;
    L_0x01b1:
        r2 = r7.getResolutionHeight();
        r2.invalidate();
    L_0x01b8:
        if (r11 != 0) goto L_0x01f0;
    L_0x01ba:
        if (r6 == 0) goto L_0x01e7;
    L_0x01bc:
        r2 = r7.isSpreadWidth();
        if (r2 == 0) goto L_0x01e7;
    L_0x01c2:
        if (r10 == 0) goto L_0x01e7;
    L_0x01c4:
        r2 = r14.isResolved();
        if (r2 == 0) goto L_0x01e7;
    L_0x01ca:
        r2 = r15.isResolved();
        if (r2 == 0) goto L_0x01e7;
    L_0x01d0:
        r2 = r15.getResolvedValue();
        r10 = r14.getResolvedValue();
        r2 = r2 - r10;
        r11 = (int) r2;
        r2 = r7.getResolutionWidth();
        r2.resolve(r11);
        r2 = getChildMeasureSpec(r1, r4, r11);
        r14 = r2;
        goto L_0x01f8;
    L_0x01e7:
        r2 = -2;
        r6 = getChildMeasureSpec(r1, r4, r2);
        r14 = r6;
        r2 = 1;
        r6 = 0;
        goto L_0x0204;
    L_0x01f0:
        r2 = -2;
        r10 = -1;
        if (r11 != r10) goto L_0x01fa;
    L_0x01f4:
        r14 = getChildMeasureSpec(r1, r4, r10);
    L_0x01f8:
        r2 = 0;
        goto L_0x0204;
    L_0x01fa:
        if (r11 != r2) goto L_0x01fe;
    L_0x01fc:
        r2 = 1;
        goto L_0x01ff;
    L_0x01fe:
        r2 = 0;
    L_0x01ff:
        r10 = getChildMeasureSpec(r1, r4, r11);
        r14 = r10;
    L_0x0204:
        if (r13 != 0) goto L_0x0240;
    L_0x0206:
        if (r0 == 0) goto L_0x0236;
    L_0x0208:
        r10 = r7.isSpreadHeight();
        if (r10 == 0) goto L_0x0236;
    L_0x020e:
        if (r5 == 0) goto L_0x0236;
    L_0x0210:
        r5 = r8.isResolved();
        if (r5 == 0) goto L_0x0236;
    L_0x0216:
        r5 = r9.isResolved();
        if (r5 == 0) goto L_0x0236;
    L_0x021c:
        r5 = r9.getResolvedValue();
        r8 = r8.getResolvedValue();
        r5 = r5 - r8;
        r13 = (int) r5;
        r5 = r7.getResolutionHeight();
        r5.resolve(r13);
        r5 = r25;
        r8 = getChildMeasureSpec(r5, r12, r13);
        r9 = r0;
        r0 = r8;
        goto L_0x024c;
    L_0x0236:
        r5 = r25;
        r8 = -2;
        r0 = getChildMeasureSpec(r5, r12, r8);
        r8 = 1;
        r9 = 0;
        goto L_0x025c;
    L_0x0240:
        r5 = r25;
        r8 = -2;
        r9 = -1;
        if (r13 != r9) goto L_0x024e;
    L_0x0246:
        r10 = getChildMeasureSpec(r5, r12, r9);
        r9 = r0;
        r0 = r10;
    L_0x024c:
        r8 = 0;
        goto L_0x025c;
    L_0x024e:
        if (r13 != r8) goto L_0x0252;
    L_0x0250:
        r8 = 1;
        goto L_0x0253;
    L_0x0252:
        r8 = 0;
    L_0x0253:
        r9 = getChildMeasureSpec(r5, r12, r13);
        r22 = r9;
        r9 = r0;
        r0 = r22;
    L_0x025c:
        r3.measure(r14, r0);
        r0 = r23;
        r10 = r0.mMetrics;
        if (r10 == 0) goto L_0x026e;
    L_0x0265:
        r14 = r10.measures;
        r18 = 1;
        r14 = r14 + r18;
        r10.measures = r14;
        goto L_0x0270;
    L_0x026e:
        r18 = 1;
    L_0x0270:
        r10 = -2;
        if (r11 != r10) goto L_0x0275;
    L_0x0273:
        r11 = 1;
        goto L_0x0276;
    L_0x0275:
        r11 = 0;
    L_0x0276:
        r7.setWidthWrapContent(r11);
        if (r13 != r10) goto L_0x027d;
    L_0x027b:
        r11 = 1;
        goto L_0x027e;
    L_0x027d:
        r11 = 0;
    L_0x027e:
        r7.setHeightWrapContent(r11);
        r11 = r3.getMeasuredWidth();
        r13 = r3.getMeasuredHeight();
        r7.setWidth(r11);
        r7.setHeight(r13);
        if (r2 == 0) goto L_0x0294;
    L_0x0291:
        r7.setWrapWidth(r11);
    L_0x0294:
        if (r8 == 0) goto L_0x0299;
    L_0x0296:
        r7.setWrapHeight(r13);
    L_0x0299:
        if (r6 == 0) goto L_0x02a3;
    L_0x029b:
        r2 = r7.getResolutionWidth();
        r2.resolve(r11);
        goto L_0x02aa;
    L_0x02a3:
        r2 = r7.getResolutionWidth();
        r2.remove();
    L_0x02aa:
        if (r9 == 0) goto L_0x02b4;
    L_0x02ac:
        r2 = r7.getResolutionHeight();
        r2.resolve(r13);
        goto L_0x02bb;
    L_0x02b4:
        r2 = r7.getResolutionHeight();
        r2.remove();
    L_0x02bb:
        r6 = r21;
        r2 = r6.needsBaseline;
        if (r2 == 0) goto L_0x02cc;
    L_0x02c1:
        r2 = r3.getBaseline();
        r3 = -1;
        if (r2 == r3) goto L_0x02d8;
    L_0x02c8:
        r7.setBaselineDistance(r2);
        goto L_0x02d8;
    L_0x02cc:
        r3 = -1;
        goto L_0x02d8;
    L_0x02ce:
        r20 = r2;
        r17 = r5;
        r18 = r8;
        r3 = -1;
        r10 = -2;
        r5 = r25;
    L_0x02d8:
        r2 = r20 + 1;
        r5 = r17;
        r8 = r18;
        r10 = 8;
        goto L_0x00e5;
    L_0x02e2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.internalMeasureDimensions(int, int):void");
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0386  */
    public void onMeasure(int r25, int r26) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r2 = r26;
        java.lang.System.currentTimeMillis();
        r3 = android.view.View.MeasureSpec.getMode(r25);
        r4 = android.view.View.MeasureSpec.getSize(r25);
        r5 = android.view.View.MeasureSpec.getMode(r26);
        r6 = android.view.View.MeasureSpec.getSize(r26);
        r7 = r24.getPaddingLeft();
        r8 = r24.getPaddingTop();
        r9 = r0.mLayoutWidget;
        r9.setX(r7);
        r9 = r0.mLayoutWidget;
        r9.setY(r8);
        r9 = r0.mLayoutWidget;
        r10 = r0.mMaxWidth;
        r9.setMaxWidth(r10);
        r9 = r0.mLayoutWidget;
        r10 = r0.mMaxHeight;
        r9.setMaxHeight(r10);
        r9 = android.os.Build.VERSION.SDK_INT;
        r10 = 0;
        r11 = 1;
        r12 = 17;
        if (r9 < r12) goto L_0x004f;
    L_0x0041:
        r9 = r0.mLayoutWidget;
        r12 = r24.getLayoutDirection();
        if (r12 != r11) goto L_0x004b;
    L_0x0049:
        r12 = 1;
        goto L_0x004c;
    L_0x004b:
        r12 = 0;
    L_0x004c:
        r9.setRtl(r12);
    L_0x004f:
        r24.setSelfDimensionBehaviour(r25, r26);
        r9 = r0.mLayoutWidget;
        r9 = r9.getWidth();
        r12 = r0.mLayoutWidget;
        r12 = r12.getHeight();
        r13 = r0.mDirtyHierarchy;
        if (r13 == 0) goto L_0x0069;
    L_0x0062:
        r0.mDirtyHierarchy = r10;
        r24.updateHierarchy();
        r13 = 1;
        goto L_0x006a;
    L_0x0069:
        r13 = 0;
    L_0x006a:
        r14 = r0.mOptimizationLevel;
        r15 = 8;
        r14 = r14 & r15;
        if (r14 != r15) goto L_0x0073;
    L_0x0071:
        r14 = 1;
        goto L_0x0074;
    L_0x0073:
        r14 = 0;
    L_0x0074:
        if (r14 == 0) goto L_0x0084;
    L_0x0076:
        r15 = r0.mLayoutWidget;
        r15.preOptimize();
        r15 = r0.mLayoutWidget;
        r15.optimizeForDimensions(r9, r12);
        r24.internalMeasureDimensions(r25, r26);
        goto L_0x0087;
    L_0x0084:
        r24.internalMeasureChildren(r25, r26);
    L_0x0087:
        r24.updatePostMeasures();
        r15 = r24.getChildCount();
        if (r15 <= 0) goto L_0x0097;
    L_0x0090:
        if (r13 == 0) goto L_0x0097;
    L_0x0092:
        r13 = r0.mLayoutWidget;
        androidx.constraintlayout.solver.widgets.Analyzer.determineGroups(r13);
    L_0x0097:
        r13 = r0.mLayoutWidget;
        r13 = r13.mGroupsWrapOptimized;
        if (r13 == 0) goto L_0x00d7;
    L_0x009d:
        r13 = r0.mLayoutWidget;
        r13 = r13.mHorizontalWrapOptimized;
        r15 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r13 == 0) goto L_0x00bb;
    L_0x00a5:
        if (r3 != r15) goto L_0x00bb;
    L_0x00a7:
        r13 = r0.mLayoutWidget;
        r13 = r13.mWrapFixedWidth;
        if (r13 >= r4) goto L_0x00b4;
    L_0x00ad:
        r13 = r0.mLayoutWidget;
        r11 = r13.mWrapFixedWidth;
        r13.setWidth(r11);
    L_0x00b4:
        r11 = r0.mLayoutWidget;
        r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r11.setHorizontalDimensionBehaviour(r13);
    L_0x00bb:
        r11 = r0.mLayoutWidget;
        r11 = r11.mVerticalWrapOptimized;
        if (r11 == 0) goto L_0x00d7;
    L_0x00c1:
        if (r5 != r15) goto L_0x00d7;
    L_0x00c3:
        r11 = r0.mLayoutWidget;
        r11 = r11.mWrapFixedHeight;
        if (r11 >= r6) goto L_0x00d0;
    L_0x00c9:
        r11 = r0.mLayoutWidget;
        r13 = r11.mWrapFixedHeight;
        r11.setHeight(r13);
    L_0x00d0:
        r11 = r0.mLayoutWidget;
        r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r11.setVerticalDimensionBehaviour(r13);
    L_0x00d7:
        r11 = r0.mOptimizationLevel;
        r13 = 32;
        r11 = r11 & r13;
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r11 != r13) goto L_0x0133;
    L_0x00e0:
        r11 = r0.mLayoutWidget;
        r11 = r11.getWidth();
        r13 = r0.mLayoutWidget;
        r13 = r13.getHeight();
        r10 = r0.mLastMeasureWidth;
        if (r10 == r11) goto L_0x00fa;
    L_0x00f0:
        if (r3 != r15) goto L_0x00fa;
    L_0x00f2:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWidgetGroups;
        r10 = 0;
        androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r10, r11);
    L_0x00fa:
        r3 = r0.mLastMeasureHeight;
        if (r3 == r13) goto L_0x0108;
    L_0x00fe:
        if (r5 != r15) goto L_0x0108;
    L_0x0100:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWidgetGroups;
        r5 = 1;
        androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r5, r13);
    L_0x0108:
        r3 = r0.mLayoutWidget;
        r3 = r3.mHorizontalWrapOptimized;
        if (r3 == 0) goto L_0x011d;
    L_0x010e:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWrapFixedWidth;
        if (r3 <= r4) goto L_0x011d;
    L_0x0114:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWidgetGroups;
        r10 = 0;
        androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r10, r4);
        goto L_0x011e;
    L_0x011d:
        r10 = 0;
    L_0x011e:
        r3 = r0.mLayoutWidget;
        r3 = r3.mVerticalWrapOptimized;
        if (r3 == 0) goto L_0x0133;
    L_0x0124:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWrapFixedHeight;
        if (r3 <= r6) goto L_0x0133;
    L_0x012a:
        r3 = r0.mLayoutWidget;
        r3 = r3.mWidgetGroups;
        r4 = 1;
        androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r4, r6);
        goto L_0x0134;
    L_0x0133:
        r4 = 1;
    L_0x0134:
        r3 = r24.getChildCount();
        if (r3 <= 0) goto L_0x013f;
    L_0x013a:
        r3 = "First pass";
        r0.solveLinearSystem(r3);
    L_0x013f:
        r3 = r0.mVariableDimensionsWidgets;
        r3 = r3.size();
        r5 = r24.getPaddingBottom();
        r8 = r8 + r5;
        r5 = r24.getPaddingRight();
        r7 = r7 + r5;
        if (r3 <= 0) goto L_0x0371;
    L_0x0151:
        r6 = r0.mLayoutWidget;
        r6 = r6.getHorizontalDimensionBehaviour();
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r6 != r11) goto L_0x015d;
    L_0x015b:
        r6 = 1;
        goto L_0x015e;
    L_0x015d:
        r6 = 0;
    L_0x015e:
        r11 = r0.mLayoutWidget;
        r11 = r11.getVerticalDimensionBehaviour();
        r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r11 != r13) goto L_0x016a;
    L_0x0168:
        r11 = 1;
        goto L_0x016b;
    L_0x016a:
        r11 = 0;
    L_0x016b:
        r13 = r0.mLayoutWidget;
        r13 = r13.getWidth();
        r4 = r0.mMinWidth;
        r4 = java.lang.Math.max(r13, r4);
        r13 = r0.mLayoutWidget;
        r13 = r13.getHeight();
        r10 = r0.mMinHeight;
        r10 = java.lang.Math.max(r13, r10);
        r13 = r4;
        r5 = r10;
        r4 = 0;
        r10 = 0;
        r17 = 0;
    L_0x0189:
        r18 = 1;
        if (r4 >= r3) goto L_0x02ca;
    L_0x018d:
        r15 = r0.mVariableDimensionsWidgets;
        r15 = r15.get(r4);
        r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15;
        r20 = r15.getCompanionWidget();
        r21 = r3;
        r3 = r20;
        r3 = (android.view.View) r3;
        if (r3 != 0) goto L_0x01a9;
    L_0x01a1:
        r20 = r9;
        r23 = r10;
        r22 = r12;
        goto L_0x02b6;
    L_0x01a9:
        r20 = r3.getLayoutParams();
        r22 = r12;
        r12 = r20;
        r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12;
        r20 = r9;
        r9 = r12.isHelper;
        if (r9 != 0) goto L_0x02b4;
    L_0x01b9:
        r9 = r12.isGuideline;
        if (r9 == 0) goto L_0x01bf;
    L_0x01bd:
        goto L_0x02b4;
    L_0x01bf:
        r9 = r3.getVisibility();
        r23 = r10;
        r10 = 8;
        if (r9 != r10) goto L_0x01cb;
    L_0x01c9:
        goto L_0x02b6;
    L_0x01cb:
        if (r14 == 0) goto L_0x01e2;
    L_0x01cd:
        r9 = r15.getResolutionWidth();
        r9 = r9.isResolved();
        if (r9 == 0) goto L_0x01e2;
    L_0x01d7:
        r9 = r15.getResolutionHeight();
        r9 = r9.isResolved();
        if (r9 == 0) goto L_0x01e2;
    L_0x01e1:
        goto L_0x01c9;
    L_0x01e2:
        r9 = r12.width;
        r10 = -2;
        if (r9 != r10) goto L_0x01f2;
    L_0x01e7:
        r9 = r12.horizontalDimensionFixed;
        if (r9 == 0) goto L_0x01f2;
    L_0x01eb:
        r9 = r12.width;
        r9 = getChildMeasureSpec(r1, r7, r9);
        goto L_0x01fc;
    L_0x01f2:
        r9 = r15.getWidth();
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10);
    L_0x01fc:
        r10 = r12.height;
        r1 = -2;
        if (r10 != r1) goto L_0x020c;
    L_0x0201:
        r1 = r12.verticalDimensionFixed;
        if (r1 == 0) goto L_0x020c;
    L_0x0205:
        r1 = r12.height;
        r1 = getChildMeasureSpec(r2, r8, r1);
        goto L_0x0216;
    L_0x020c:
        r1 = r15.getHeight();
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10);
    L_0x0216:
        r3.measure(r9, r1);
        r1 = r0.mMetrics;
        if (r1 == 0) goto L_0x0223;
    L_0x021d:
        r9 = r1.additionalMeasures;
        r9 = r9 + r18;
        r1.additionalMeasures = r9;
    L_0x0223:
        r1 = r3.getMeasuredWidth();
        r9 = r3.getMeasuredHeight();
        r10 = r15.getWidth();
        if (r1 == r10) goto L_0x025a;
    L_0x0231:
        r15.setWidth(r1);
        if (r14 == 0) goto L_0x023d;
    L_0x0236:
        r10 = r15.getResolutionWidth();
        r10.resolve(r1);
    L_0x023d:
        if (r6 == 0) goto L_0x0258;
    L_0x023f:
        r1 = r15.getRight();
        if (r1 <= r13) goto L_0x0258;
    L_0x0245:
        r1 = r15.getRight();
        r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = r15.getAnchor(r10);
        r10 = r10.getMargin();
        r1 = r1 + r10;
        r13 = java.lang.Math.max(r13, r1);
    L_0x0258:
        r23 = 1;
    L_0x025a:
        r1 = r15.getHeight();
        if (r9 == r1) goto L_0x028a;
    L_0x0260:
        r15.setHeight(r9);
        if (r14 == 0) goto L_0x026c;
    L_0x0265:
        r1 = r15.getResolutionHeight();
        r1.resolve(r9);
    L_0x026c:
        if (r11 == 0) goto L_0x0288;
    L_0x026e:
        r1 = r15.getBottom();
        if (r1 <= r5) goto L_0x0288;
    L_0x0274:
        r1 = r15.getBottom();
        r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r9 = r15.getAnchor(r9);
        r9 = r9.getMargin();
        r1 = r1 + r9;
        r1 = java.lang.Math.max(r5, r1);
        r5 = r1;
    L_0x0288:
        r23 = 1;
    L_0x028a:
        r1 = r12.needsBaseline;
        if (r1 == 0) goto L_0x02a0;
    L_0x028e:
        r1 = r3.getBaseline();
        r9 = -1;
        if (r1 == r9) goto L_0x02a0;
    L_0x0295:
        r9 = r15.getBaselineDistance();
        if (r1 == r9) goto L_0x02a0;
    L_0x029b:
        r15.setBaselineDistance(r1);
        r23 = 1;
    L_0x02a0:
        r1 = android.os.Build.VERSION.SDK_INT;
        r9 = 11;
        if (r1 < r9) goto L_0x02b1;
    L_0x02a6:
        r1 = r3.getMeasuredState();
        r3 = r17;
        r17 = combineMeasuredStates(r3, r1);
        goto L_0x02ba;
    L_0x02b1:
        r3 = r17;
        goto L_0x02ba;
    L_0x02b4:
        r23 = r10;
    L_0x02b6:
        r3 = r17;
        r17 = r3;
    L_0x02ba:
        r10 = r23;
        r4 = r4 + 1;
        r1 = r25;
        r9 = r20;
        r3 = r21;
        r12 = r22;
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0189;
    L_0x02ca:
        r21 = r3;
        r20 = r9;
        r23 = r10;
        r22 = r12;
        r3 = r17;
        if (r23 == 0) goto L_0x0319;
    L_0x02d6:
        r1 = r0.mLayoutWidget;
        r4 = r20;
        r1.setWidth(r4);
        r1 = r0.mLayoutWidget;
        r4 = r22;
        r1.setHeight(r4);
        if (r14 == 0) goto L_0x02eb;
    L_0x02e6:
        r1 = r0.mLayoutWidget;
        r1.solveGraph();
    L_0x02eb:
        r1 = "2nd pass";
        r0.solveLinearSystem(r1);
        r1 = r0.mLayoutWidget;
        r1 = r1.getWidth();
        if (r1 >= r13) goto L_0x02ff;
    L_0x02f8:
        r1 = r0.mLayoutWidget;
        r1.setWidth(r13);
        r11 = 1;
        goto L_0x0300;
    L_0x02ff:
        r11 = 0;
    L_0x0300:
        r1 = r0.mLayoutWidget;
        r1 = r1.getHeight();
        if (r1 >= r5) goto L_0x0310;
    L_0x0308:
        r1 = r0.mLayoutWidget;
        r1.setHeight(r5);
        r16 = 1;
        goto L_0x0312;
    L_0x0310:
        r16 = r11;
    L_0x0312:
        if (r16 == 0) goto L_0x0319;
    L_0x0314:
        r1 = "3rd pass";
        r0.solveLinearSystem(r1);
    L_0x0319:
        r1 = r21;
        r4 = 0;
    L_0x031c:
        if (r4 >= r1) goto L_0x0372;
    L_0x031e:
        r5 = r0.mVariableDimensionsWidgets;
        r5 = r5.get(r4);
        r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5;
        r6 = r5.getCompanionWidget();
        r6 = (android.view.View) r6;
        if (r6 != 0) goto L_0x0333;
    L_0x032e:
        r10 = 8;
    L_0x0330:
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x036e;
    L_0x0333:
        r9 = r6.getMeasuredWidth();
        r10 = r5.getWidth();
        if (r9 != r10) goto L_0x0347;
    L_0x033d:
        r9 = r6.getMeasuredHeight();
        r10 = r5.getHeight();
        if (r9 == r10) goto L_0x032e;
    L_0x0347:
        r9 = r5.getVisibility();
        r10 = 8;
        if (r9 == r10) goto L_0x0330;
    L_0x034f:
        r9 = r5.getWidth();
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11);
        r5 = r5.getHeight();
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11);
        r6.measure(r9, r5);
        r5 = r0.mMetrics;
        if (r5 == 0) goto L_0x036e;
    L_0x0368:
        r12 = r5.additionalMeasures;
        r12 = r12 + r18;
        r5.additionalMeasures = r12;
    L_0x036e:
        r4 = r4 + 1;
        goto L_0x031c;
    L_0x0371:
        r3 = 0;
    L_0x0372:
        r1 = r0.mLayoutWidget;
        r1 = r1.getWidth();
        r1 = r1 + r7;
        r4 = r0.mLayoutWidget;
        r4 = r4.getHeight();
        r4 = r4 + r8;
        r5 = android.os.Build.VERSION.SDK_INT;
        r6 = 11;
        if (r5 < r6) goto L_0x03bf;
    L_0x0386:
        r5 = r25;
        r1 = resolveSizeAndState(r1, r5, r3);
        r3 = r3 << 16;
        r2 = resolveSizeAndState(r4, r2, r3);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r1 = r1 & r3;
        r2 = r2 & r3;
        r3 = r0.mMaxWidth;
        r1 = java.lang.Math.min(r3, r1);
        r3 = r0.mMaxHeight;
        r2 = java.lang.Math.min(r3, r2);
        r3 = r0.mLayoutWidget;
        r3 = r3.isWidthMeasuredTooSmall();
        r4 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        if (r3 == 0) goto L_0x03ae;
    L_0x03ad:
        r1 = r1 | r4;
    L_0x03ae:
        r3 = r0.mLayoutWidget;
        r3 = r3.isHeightMeasuredTooSmall();
        if (r3 == 0) goto L_0x03b7;
    L_0x03b6:
        r2 = r2 | r4;
    L_0x03b7:
        r0.setMeasuredDimension(r1, r2);
        r0.mLastMeasureWidth = r1;
        r0.mLastMeasureHeight = r2;
        goto L_0x03c6;
    L_0x03bf:
        r0.setMeasuredDimension(r1, r4);
        r0.mLastMeasureWidth = r1;
        r0.mLastMeasureHeight = r4;
    L_0x03c6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                i = Math.min(this.mMaxWidth, i) - paddingLeft;
            }
            i = 0;
        } else {
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                i2 = Math.min(this.mMaxHeight, i2) - paddingTop;
            }
            i2 = 0;
        } else {
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.setMinWidth(0);
        this.mLayoutWidget.setMinHeight(0);
        this.mLayoutWidget.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.mLayoutWidget.setWidth(i);
        this.mLayoutWidget.setVerticalDimensionBehaviour(dimensionBehaviour2);
        this.mLayoutWidget.setHeight(i2);
        this.mLayoutWidget.setMinWidth((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.setMinHeight((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    /* Access modifiers changed, original: protected */
    public void solveLinearSystem(String str) {
        this.mLayoutWidget.layout();
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.resolutions++;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        i2 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || isInEditMode) && !layoutParams.isInPlaceholder) {
                int drawX = constraintWidget.getDrawX();
                int drawY = constraintWidget.getDrawY();
                int width = constraintWidget.getWidth() + drawX;
                int height = constraintWidget.getHeight() + drawY;
                childAt.layout(drawX, drawY, width, height);
                if (childAt instanceof Placeholder) {
                    childAt = ((Placeholder) childAt).getContent();
                    if (childAt != null) {
                        childAt.setVisibility(0);
                        childAt.layout(drawX, drawY, width, height);
                    }
                }
            }
        }
        childCount = this.mConstraintHelpers.size();
        if (childCount > 0) {
            while (i2 < childCount) {
                ((ConstraintHelper) this.mConstraintHelpers.get(i2)).updatePostLayout(this);
                i2++;
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(SupportMenu.CATEGORY_MASK);
                            float f = (float) parseInt;
                            float f2 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) parseInt2;
                            float f4 = f;
                            float f5 = f;
                            f = f3;
                            Paint paint2 = paint;
                            float f6 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            float f7 = (float) (parseInt2 + parseInt4);
                            f4 = f2;
                            float f8 = f7;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f = f7;
                            f6 = f5;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f4 = f5;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            paint = paint2;
                            paint.setColor(-16711936);
                            Paint paint4 = paint;
                            f6 = f2;
                            paint3 = paint4;
                            canvas2.drawLine(f4, f3, f6, f7, paint3);
                            canvas2.drawLine(f4, f7, f6, f3, paint3);
                        }
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
