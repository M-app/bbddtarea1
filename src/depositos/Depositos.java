/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositos;

/**
 *
 * @author alumno
 */
public interface Depositos {
    boolean existeCuenta(int noCuenta);
    float conocerSaldo(int noCuenta);
    String depositar(int noCuenta, float montoDeposito);
}
