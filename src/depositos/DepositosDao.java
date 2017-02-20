/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositos;

import cuenta.CuentaDTO;
import domain.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class DepositosDao implements Depositos{

    @Override
    public boolean existeCuenta(int noCuenta) {
        final CuentaDTO objetoRetorno = new CuentaDTO();
        try {
            Connection conn = Conexion.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call BuscaCuenta(?)}");
            sentencia.setInt(1, noCuenta);
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return false;
    }

    @Override
    public float conocerSaldo(int noCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String depositar(int noCuenta, float montoDeposito) {
        try {
            Connection conn = Conexion.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call InsertarDeposito(?,?,?,?)}");
            int idDeposito = 124;
            sentencia.setInt(1, idDeposito);
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dateobj = new Date();
            System.out.println(df.format(dateobj));
          
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date = formatter.parse(df.format(dateobj));
                System.out.println(date);
                sentencia.setDate(2,new java.sql.Date(date.getTime()));
                System.out.println(formatter.format(date));

            } catch (ParseException e) {
                e.printStackTrace();
            }
            sentencia.setFloat(3, montoDeposito);
            sentencia.setInt(4, noCuenta);
            sentencia.execute();
            return "Deposito realizado con éxito";
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            return "no se realizo el deposito";
        }
    }

   
    
}
