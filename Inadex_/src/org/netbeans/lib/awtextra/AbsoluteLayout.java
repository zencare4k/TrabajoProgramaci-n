package org.netbeans.lib.awtextra;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zenca
 */


import java.awt.*;
import java.io.Serializable;
import java.util.Hashtable;

public class AbsoluteLayout implements LayoutManager2, Serializable {
    private final Hashtable<Component, AbsoluteConstraints> constraints = new Hashtable<>();

    public void addLayoutComponent(String name, Component comp) {}

    public void removeLayoutComponent(Component comp) {
        constraints.remove(comp);
    }

    public Dimension preferredLayoutSize(Container parent) {
        return getLayoutSize(parent, true);
    }

    public Dimension minimumLayoutSize(Container parent) {
        return getLayoutSize(parent, false);
    }

    public void layoutContainer(Container parent) {
        for (Component comp : parent.getComponents()) {
            AbsoluteConstraints ac = constraints.get(comp);
            if (ac != null) {
                int w = ac.width == -1 ? comp.getPreferredSize().width : ac.width;
                int h = ac.height == -1 ? comp.getPreferredSize().height : ac.height;
                comp.setBounds(ac.x, ac.y, w, h);
            }
        }
    }

    public void addLayoutComponent(Component comp, Object constr) {
        if (!(constr instanceof AbsoluteConstraints)) {
            throw new IllegalArgumentException("Constraints must be AbsoluteConstraints");
        }
        constraints.put(comp, (AbsoluteConstraints) constr);
    }

    public Dimension maximumLayoutSize(Container target) {
        return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public float getLayoutAlignmentX(Container target) {
        return 0.5f;
    }

    public float getLayoutAlignmentY(Container target) {
        return 0.5f;
    }

    public void invalidateLayout(Container target) {}

    private Dimension getLayoutSize(Container parent, boolean preferred) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (Component comp : parent.getComponents()) {
            AbsoluteConstraints ac = constraints.get(comp);
            if (ac != null) {
                int w = ac.width == -1 ? comp.getPreferredSize().width : ac.width;
                int h = ac.height == -1 ? comp.getPreferredSize().height : ac.height;
                maxWidth = Math.max(maxWidth, ac.x + w);
                maxHeight = Math.max(maxHeight, ac.y + h);
            }
        }
        Insets insets = parent.getInsets();
        return new Dimension(maxWidth + insets.left + insets.right, maxHeight + insets.top + insets.bottom);
    }
}
