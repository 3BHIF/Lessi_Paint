/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lukas
 */
@XmlRootElement(name = "root")
public class ShapeModel {
    @XmlElementWrapper(name = "formen")
    @XmlElements({
            @XmlElement(name = "rechteck", type = Rectangle.class),
            @XmlElement(name = "quadrat", type = Square.class),
            @XmlElement(name = "raute", type = Rhombus.class),
            @XmlElement(name = "trapez", type = Trapeze.class),
            @XmlElement(name = "polygon", type = Polygon.class),
            @XmlElement(name = "dreieck", type = Triangle.class),
            @XmlElement(name = "sechseck", type = Hexagon.class),
            @XmlElement(name = "stern", type = Star.class),
            @XmlElement(name = "kreis", type = Circle.class),
            @XmlElement(name = "oval", type = Oval.class)
    })
    public ArrayList<Shape> shapeList;
}
