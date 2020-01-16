/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;
import java.awt.Graphics;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author lukas
 */
public class Rhombus extends Square {
    protected double angle;         //in RAD
    protected int x2;
    protected int y2;    
    
    public Rhombus() {
    }
    
    public Rhombus(int x, int y, int length, int angleDeg, Color color, int stroke) {
        super(x, y, length, color, stroke);
        this.angle = (angleDeg * Math.PI / 180);
    }
    
    @Override
    public void paint(Graphics g) {
        prepMembers(g);
        
        g.setColor(color);
        g.drawLine(x, y, x + width, y);
        g.drawLine(x, y, x2, y2);
        g.drawLine(x2, y2, x2 + width, y2);
        g.drawLine(x + width, y, x2 + width, y2);
    }
    
    
    @Override
    protected void prepMembers(Graphics g) {
        super.prepMembers(g);
        x2 = x + (int) (width * Math.cos(this.angle));
        y2 = y - (int) (width * Math.sin(this.angle));
    }
    
    
    @XmlAttribute(name = "angle")
    public double getAngle() {
        return angle * 180 / Math.PI;
    }
    
    public void setAngle(double angle) {
        this.angle = (angle * Math.PI / 180);
    }
}
