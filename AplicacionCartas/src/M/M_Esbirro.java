/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

import C.Esbirros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Paolo
 */
public class M_Esbirro {
    
        public boolean agregarCarta(Esbirros esbirro){
        //inserte en bdd
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO TABLA_NAME(N_ATRIBUTO1, N_ATRIBUTO2, N_ATRIBUTO3, N_ATRIBUTO4) VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, esbirro.getIdCarta());
            stmt.setString(2, esbirro.getNombre());
            stmt.setString(3, esbirro.getRareza());
            stmt.setString(4, esbirro.getDescripcion());
           
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar libro" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar libro" + e.getMessage());
            return false;
        }
    }
    
}
