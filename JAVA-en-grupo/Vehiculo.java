

public class Vehiculo {
    private String fabricante;
    private String color;
    private String modelo;
    private Boolean sport;
    private Integer cv;
    private Integer velocidad = 0;

    public Vehiculo(String fabricante, String color, String modelo, Boolean sport,Integer cv ) {
        this.fabricante = fabricante;
        this.color = color;
        this.modelo= modelo;
        this.sport= sport;
        this.cv=cv;
        
    };
    public Vehiculo(String fabricante, String color){
        this.fabricante = fabricante;
        this.color = color; 
    };

    public void acelerar(Integer cantidad) {
        this.velocidad += cantidad;
    }
    public Integer getVelocidad(){
        return this.velocidad;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Boolean getSport() {
        return sport;
    }
    public void setSport(Boolean sport) {
        this.sport = sport;
    }
    public Integer getCv() {
        return cv;
    }
    public void setCv(Integer cv) {
        this.cv = cv;
    }
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}

