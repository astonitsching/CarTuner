/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ImageIcon;

/**
 *
 * @author CMS6227
 */
public class PartRenderer extends JLabel implements ListCellRenderer<Part>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Part> list, Part value, int index, boolean isSelected, boolean cellHasFocus) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(value.getImage()));
        setIcon(imageIcon);
        return this;
    }
    
}
