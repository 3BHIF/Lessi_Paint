/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.PI;

/**
 *
 * @author lukas
 */
public class Triangle extends Polygon {
    
    public Triangle() {}
    
    public Triangle(int x, int y, int height, Color color, int stroke) {
        super(x, y, height, 3, color, stroke);
    }
    
    @Override
    public void paint(Graphics g) {
        prepMembers(g);
        double angelAdd = angle;
        java.awt.Polygon poly = new java.awt.Polygon();
        
        for (int i = 0; i < corners; i++) {
            poly.addPoint((int) (x + radius * Math.cos(angelAdd + (30 * PI / 180)))
                        , (int) (y + radius * Math.sin(angelAdd + (30 * PI / 180))));
            angelAdd += angle;
        }
	
	g2.drawPolygon(poly);
    }
}
