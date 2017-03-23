/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author boris.fournier
 */
public class Rendu implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
       JLabel lab = new JLabel(value.toString());
       lab.setOpaque(true);
       if (row % 2 == 0)
       {
           lab.setBackground(Color.GRAY); 
       }
       else
       {
           lab.setBackground(Color.CYAN);
       }
       return lab;
    }
    
}
