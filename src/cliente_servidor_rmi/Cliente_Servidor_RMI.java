/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente_servidor_rmi;

import Estudiante.Estudiantes;
import Estudiante.estudiante;
import RMI.RMI;
import javax.swing.JOptionPane;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
/**
 *
 * @author JANBLACK
 */
public class Cliente_Servidor_RMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        try{ 
        Registry r= LocateRegistry.getRegistry("localhost",1099);
        estudiante  s = (estudiante) Naming.lookup("//192.168.100.48/estudiante");//ruta de la maquina virtual       
           s.consultar();
        } catch (RemoteException e) {
        e.printStackTrace();
        System.exit(1);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al conectar con el servidor RMI: " + e.getMessage());
    }
    }
    }
    

