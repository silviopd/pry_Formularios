/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.UIManager;

/**
 *
 * @author laboratorio_computo
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        System.out.println("Este es el primer programa en java");
        System.out.println("Auto: Silvio Peña");
        
        FrmEjercicio01 obj = new FrmEjercicio01();
        obj.setVisible(true);
    }
    
}
