package androidx.constraintlayout.solver.widgets;

public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public void setBounds(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    /* Access modifiers changed, original: 0000 */
    public void grow(int i, int i2) {
        this.x -= i;
        this.y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean intersects(Rectangle rectangle) {
        int i = this.x;
        int i2 = rectangle.x;
        if (i >= i2 && i < i2 + rectangle.width) {
            i = this.y;
            i2 = rectangle.y;
            if (i >= i2 && i < i2 + rectangle.height) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(int i, int i2) {
        int i3 = this.x;
        if (i >= i3 && i < i3 + this.width) {
            i = this.y;
            if (i2 >= i && i2 < i + this.height) {
                return true;
            }
        }
        return false;
    }

    public int getCenterX() {
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.y + this.height) / 2;
    }
}
