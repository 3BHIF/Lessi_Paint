/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author lukas
 */
public class Circle extends Oval {
    public Circle() {}
    
    public Circle(int x, int y, int radius, Color color, int stroke) {
        super(x - radius, y - radius, radius * 2, radius * 2, color, stroke);
    }  
}
