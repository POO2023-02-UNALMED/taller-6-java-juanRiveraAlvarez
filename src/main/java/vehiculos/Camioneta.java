package vehiculos;
public class Camioneta extends Vehiculo{
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso,  Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        if(tiposVehiculos.containsKey("Camioneta")){
            tiposVehiculos.put("Camioneta", tiposVehiculos.get("Camioneta")+1);
        }else{
            tiposVehiculos.put("Camioneta",1);
        }
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
}
