package retiros;


public class RetiroDTO {
    private int idRetiro;
    private int idCuenta;
    private String fechaRetiro;
    private float cantidadDeposito;

    public RetiroDTO(int idRetiro, int idCuenta, String fechaRetiro, float cantidadDeposito) {
        this.idRetiro = idRetiro;
        this.idCuenta = idCuenta;
        this.fechaRetiro = fechaRetiro;
        this.cantidadDeposito = cantidadDeposito;
    }

    public int getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(int idRetiro) {
        this.idRetiro = idRetiro;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public float getCantidadDeposito() {
        return cantidadDeposito;
    }

    public void setCantidadDeposito(float cantidadDeposito) {
        this.cantidadDeposito = cantidadDeposito;
    }
    
    
    
}
