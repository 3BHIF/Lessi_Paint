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
public class Square extends Rectangle {
    public Square() {}
    
    public Square(int x, int y, int length, Color color, int stroke) {
        super(x, y, length, length, color, stroke);
    }

    void prepMembers(Graphics g) {
        super.prepMemers(g);
    }
}
