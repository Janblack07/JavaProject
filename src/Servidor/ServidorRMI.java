/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Servidor;
import RMI.RMI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;
/**
 *
 * @author JANBLACK
 */
public class ServidorRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame = new JFrame("Servidor RMI");
        JButton button = new JButton("Iniciar servidor");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Registry r = LocateRegistry.createRegistry(1099);
                    r.rebind("RMI", (Remote) new RMI());
                    JOptionPane.showMessageDialog(null, "Servidor esta en linea");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Servidor fuera de linea");
                }
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    
    }
    
}
