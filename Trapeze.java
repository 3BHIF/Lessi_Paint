/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author lukas
 */
public class Trapeze extends Rhombus {
    protected int a;
    
    public Trapeze() {}
    
    public Trapeze(int x, int y, int width, int height, int angle, Color color, int stroke) {
        super(x, y, width, angle, color, stroke);
        super.height = height;
    }
    
    @Override
    public void paint(Graphics g) {
        prepMembers(g);
        y2 = y - height;        
        a = (int) (width * Math.cos(this.angle));
        int newX2 = x2 - 4 * a;
        
        g.setColor(color);
        g.drawLine(x, y, newX2, y2);
        g.drawLine(newX2, y2, x2 + width + 2 * a, y2);
        g.drawLine(x, y, x + width, y);
        g.drawLine(x + width, y, x2 + width + 2 * a , y2);
    }
}
