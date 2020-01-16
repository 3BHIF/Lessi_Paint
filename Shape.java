/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author wochi
 */
public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;
    protected int stroke;
    protected Graphics2D g2;
    
    
    public Shape() {}
    
    public Shape(int x, int y, Color color, int stroke)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.stroke = stroke;
    }
 
    public abstract void paint(Graphics g);
    
    
    protected void prepMemers(Graphics g) {
        g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(stroke));
        g2.setColor(color);
    }

    
    @XmlAttribute(name = "x")
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    
    @XmlAttribute(name = "y")
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }   

    
    @XmlAttribute (name = "color")
    public String getColor() {
        String strColor = "";
        strColor += color.getRed() + "|";
        strColor += color.getGreen() + "|";
        strColor += color.getBlue();
        return strColor;
    }

    public void setColor(String color) {
        String[] rgbValues = color.split("[|]");
        this.color = new Color(Integer.parseInt(rgbValues[0])
                             , Integer.parseInt(rgbValues[1])
                             , Integer.parseInt(rgbValues[2]));
    }

    @XmlAttribute (name = "stroke")
    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }
}
