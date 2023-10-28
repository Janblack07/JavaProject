/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import Estudiante.estudiante;
import Estudiante.Estudiantes;
import java.sql.Connection;
import Conexion.conexion;
import Estudiante.Estudiante1;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author JANBLACK
 */
public class RMI extends UnicastRemoteObject implements estudiante {

    public RMI() throws RemoteException{}


@Override
public List<estudiante> consultar() throws RemoteException {
    List<estudiante> estudiantes = new ArrayList<>();

    try {
        // Connect to the database
        conexion con1 = new conexion();
        Connection conet = con1.Conectar();

        // Execute a SQL query to select all students from the database
        Statement st = conet.createStatement();
        ResultSet result = st.executeQuery("select * from estudiantes");

        // Iterate over the results of the SQL query and add each student to the List of Estudiante objects
        while (result.next()) {
            Estudiante1 x = new Estudiante1();
            estudiantes.add((estudiante) x);
        }

        // Close the database connection
        result.close();
        st.close();
        conet.close();
    } catch (Exception e) {
        throw new RemoteException(e.getMessage());
    }

    return estudiantes;
}


public void agregar() throws RemoteException {
Estudiante1 estudiante = new Estudiante1();
    try {
        // Connect to the database
        conexion con1 = new conexion();
        Connection conet = con1.Conectar();

        // Create a prepared statement to insert the new student into the database
        String sql = "INSERT INTO estudiantes (Nombres, Apellidos, Cedula, Carrera, Nivel, Paralelo) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement st = conet.prepareStatement(sql);

        // Set the values of the prepared statement
        st.setString(1, estudiante.getNombres());
        st.setString(2, estudiante.getApellidos());
        st.setString(3, estudiante.getCedula());
        st.setString(4, estudiante.getCarrera());
        st.setString(5, estudiante.getNivel());
        st.setString(6, estudiante.getParalelo());

        // Execute the prepared statement
        st.executeUpdate();

        // Close the database connection
        conet.close();
    } catch (Exception e) {
        throw new RemoteException(e.getMessage());
    }
}

public void modificar() throws RemoteException {
Estudiante1 estudiante = new Estudiante1();
    try {
        // Connect to the database
        conexion con1 = new conexion();
        Connection conet = con1.Conectar();

        // Create a prepared statement to update the student in the database
        String sql = "UPDATE estudiantes SET Nombres=?, Apellidos=?, Cedula=?, Carrera=?, Nivel=?, Paralelo=? WHERE Id_Estudiante=?";
        PreparedStatement st = conet.prepareStatement(sql);

        // Set the values of the prepared statement
        st.setString(1, estudiante.getNombres());
        st.setString(2, estudiante.getApellidos());
        st.setString(3, estudiante.getCedula());
        st.setString(4, estudiante.getCarrera());
        st.setString(5, estudiante.getNivel());
        st.setString(6, estudiante.getParalelo());
        st.setInt(7, estudiante.getId_Estudiante());

        // Execute the prepared statement
        st.executeUpdate();

        // Close the database connection
        conet.close();
    } catch (Exception e) {
        throw new RemoteException(e.getMessage());
    }
}

public void eliminar() throws RemoteException {
int id_Estudiante = 0;
    try {
        // Connect to the database
        conexion con1 = new conexion();
        Connection conet = con1.Conectar();

        // Create a prepared statement to delete the student from the database
        String sql = "DELETE FROM estudiantes WHERE Id_Estudiante=?";
        PreparedStatement st = conet.prepareStatement(sql);

        // Set the values of the prepared statement
        st.setInt(1, id_Estudiante);

        // Execute the prepared statement
        st.executeUpdate();

        // Close the database connection
        conet.close();
    } catch (Exception e) {
        throw new RemoteException(e.getMessage());
    }
}

  


   
}
