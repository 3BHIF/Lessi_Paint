/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author lukas
 */
public class Star extends Polygon {
    private int radius2;
    
    
    public Star() {}
    
    public Star(int x, int y, int radius, int radius2, int corners, Color color, int stroke) {
        super(x, y, radius, corners * 2, color, stroke);
        this.radius2 = radius2;
        if (corners < 4) {
            throw new IllegalArgumentException("Not enough corners!");
        }
    }

    @Override
    public void paint(Graphics g) {
        prepMembers(g);
        java.awt.Polygon poly = new java.awt.Polygon();        
        double angleAdd = angle;
        
        for (int i = 0; i < corners; i++) {
            if (i % 2 == 0) {
                poly.addPoint((int) (x + radius * Math.cos(angleAdd))
                            , (int) (y + radius * Math.sin(angleAdd)));
            } else {
                poly.addPoint((int) (x + radius2 * Math.cos(angleAdd))
                            , (int) (y + radius2 * Math.sin(angleAdd)));
            }
            angleAdd += angle;
        }
        g2.drawPolygon(poly);
    }

    
    @XmlAttribute(name = "radius2")
    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
