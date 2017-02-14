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
public interface Retiros {
    boolean existeCuenta(int noCuenta);
    float conocerSaldo(int noCuenta);
    String retirar(int noCuenta, float montoRetiro);
}
