/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formen;

import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author wochi
 */
public class ShapePanel extends JPanel{
    private ShapeModel shapes = new ShapeModel();
    private Shape preview;

    public ShapePanel() {
        shapes.shapeList = new ArrayList<>();
    }
    
    public void addForm(Shape form) {
        shapes.shapeList.add(form);
    }
    
    public void drawPreview(Shape form) {
        preview = form;
    }
    
    public void clearFormen() {
        shapes.shapeList.clear();
        preview = null;
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape f : shapes.shapeList) {
            f.paint(g);
        }
        
        if (preview != null) {
            preview.paint(g);
        }
    }
    
    
    public void Save(File file) throws JAXBException {
        if (file != null) {
            JAXBContext jc = JAXBContext.newInstance(ShapeModel.class);
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(shapes, file);
        }
    }
    
    public void Read(File file)  throws JAXBException {
        if (file != null) {
            shapes = JAXB.unmarshal(file, ShapeModel.class);
            repaint();
        }
    }
}
