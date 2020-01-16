/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;

/**
 *
 * @author lukas
 */
public class Hexagon extends Polygon {
    public Hexagon() {}
    
    public Hexagon(int x, int y, int radius, Color color, int stroke) {
        super(x, y, radius, 6, color, stroke);
    }
}
