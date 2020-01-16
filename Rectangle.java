/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author wochi
 */
public class Rectangle extends Shape {
    protected int width;
    protected int height;
    
    public Rectangle() {}

    public Rectangle(int x, int y, int width, int height, Color color, int stroke) {
        super(x, y, color, stroke); 
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        prepMemers(g);
        g2.draw(new Line2D.Float(x, y, x + width, y));
        g2.draw(new Line2D.Float(x + width, y, x + width, y + height));
        g2.draw(new Line2D.Float(x + width, y + height, x, y + height));
        g2.draw(new Line2D.Float(x, y + height, x, y));
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
}
