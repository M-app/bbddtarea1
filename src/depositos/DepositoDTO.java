package depositos;


public class DepositoDTO {
    private int idDeposito;
    private int idCuenta;
    private String fechaDeposito;
    private float monto;
    
    public DepositoDTO(){
        
    }

    public DepositoDTO(int idDeposito, int idCuenta, String fechaDeposito, float monto) {
        this.idDeposito = idDeposito;
        this.idCuenta = idCuenta;
        this.fechaDeposito = fechaDeposito;
        this.monto = monto;
    }

    public int getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) {
        this.idDeposito = idDeposito;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(String fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}
