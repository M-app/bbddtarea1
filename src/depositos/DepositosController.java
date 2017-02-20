/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositos;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class DepositosController {
    
    Depositos depositos;

    public DepositosController(Depositos retiros) {
        this.depositos = retiros;
    }
    
    public void comprobarCuenta(int noCuenta, JLabel statusLabel, JButton btnRetirar, JTextField txtNoCuenta){
        if(depositos.existeCuenta(noCuenta)){
            statusLabel.setText("La cuenta fue encontrada exitosamente");
            txtNoCuenta.setEditable(false);
        }else{
            statusLabel.setText("No se encontró la cuenta");
            btnRetirar.setEnabled(false);
        }
    }
    
    public void depositar(int noCuenta,float monto, JLabel statusLabel){
        statusLabel.setText(depositos.depositar(noCuenta, monto));
    }
}
