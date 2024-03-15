
public class Auto{
    private String marca;
    private String modelo;
    private String linea;
    private double precio;
    private String placa;

    public Auto(String marca, String modelo, String linea, double precio, String placa){

        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.precio = precio;
        this.placa = placa;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}