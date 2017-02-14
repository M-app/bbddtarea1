/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiros;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class RetirosContoller {
    
    Retiros retiros;

    public RetirosContoller(Retiros retiros) {
        this.retiros = retiros;
    }
    
    public void comprobarCuenta(int noCuenta, JLabel statusLabel, JButton btnRetirar, JTextField txtNoCuenta){
        if(retiros.existeCuenta(noCuenta)){
            statusLabel.setText("La cuenta fue encontrada exitosamente");
            txtNoCuenta.setEditable(false);
        }else{
            statusLabel.setText("No se encontró la cuenta");
            btnRetirar.setEnabled(false);
        }
    }
    
    public void retirar(int noCuenta,float monto, JLabel statusLabel){
        statusLabel.setText(retiros.retirar(noCuenta, monto));
    }
}
