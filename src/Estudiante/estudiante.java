/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Estudiante;

import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author JANBLACK
 */
public interface estudiante extends Remote {
    List<estudiante> consultar() throws RemoteException;

    void agregar() throws RemoteException;

    void modificar() throws RemoteException;

    void eliminar() throws RemoteException;


   

  
    
}
