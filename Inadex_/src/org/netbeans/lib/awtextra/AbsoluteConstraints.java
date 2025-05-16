package org.netbeans.lib.awtextra;



import java.io.Serializable;

public class AbsoluteConstraints implements Serializable {
    public int x, y;
    public int width = -1, height = -1;

    public AbsoluteConstraints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AbsoluteConstraints(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }
}
