/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiros;

/**
 *
 * @author alumno
 */
public class RetirosDAO implements Retiros{

    @Override
    public boolean existeCuenta(int noCuenta) {
        return false;
    }

    @Override
    public float conocerSaldo(int noCuenta) {
        return 0;
    }

    @Override
    public String retirar(int noCuenta, float montoRetiro) {
        if(montoRetiro > 0){
            if(montoRetiro <= conocerSaldo(noCuenta)){
                //retirar
                return "Retiro realizado con éxito";
            }else{
                return "El saldo de la cuenta no es sufiente";
            }
        }else{
            return "Monto a retirar incorrecto";
        }
    }
    
}
