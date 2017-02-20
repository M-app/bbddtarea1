
package cuenta;

public class CuentaDTO {
    private int idCuenta;
    private String nombre;
    private float saldo;

    public CuentaDTO(){
        
    }
    
    public CuentaDTO(int idCuenta, String nombre, float saldo) {
        this.idCuenta = idCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    
}
