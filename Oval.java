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
public class Oval extends Shape {
    protected int width;
    protected int height;
    
    
    public Oval() {}
    
    public Oval(int x, int y, int width, int height, Color color, int stroke) {
        super(x, y, color, stroke);
        this.width = width;
        this.height = height;
        
    }

    @Override
    public void paint(Graphics g) {
        prepMemers(g);
        g2.drawOval(x, y, width, height);
    }

    
    @XmlAttribute(name = "width")
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    
    @XmlAttribute(name = "height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    protected void prepMembers(Graphics g) {
        super.prepMemers(g);
    }
    
}
