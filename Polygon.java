/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.PI;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author lukas
 */
public class Polygon extends Shape {
    protected int corners;
    protected int radius;
    protected double angle;
    protected double angleCorrection = 0;
    protected int[] intx;
    protected int[] inty;    
    
    public Polygon() {    
    }
    
    public Polygon(int x, int y, int radius, int  corners, Color color, int stroke) {
        super(x, y, color, stroke);
        this.radius = radius;
        this.corners = corners;
    }

    @Override
    public void paint(Graphics g) {
        prepMembers(g);
        double angelAdd = angle;
        java.awt.Polygon poly = new java.awt.Polygon();
        
        for (int i = 0; i < corners; i++) {
            poly.addPoint((int) (x + radius * Math.cos(angelAdd))
                        , (int) (y + radius * Math.sin(angelAdd)));
            angelAdd += angle;
        }
	
	g2.drawPolygon(poly);
    }
    
    
    protected void prepMembers(Graphics g) {
        super.prepMemers(g);
        angle = 2 * PI / corners;
    }

    
    @XmlAttribute(name = "corners")
    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    
    @XmlAttribute(name = "radius")
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
