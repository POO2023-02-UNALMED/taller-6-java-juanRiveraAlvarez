package vehiculos;
public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        if(tiposVehiculos.containsKey("Camion")){
            tiposVehiculos.put("Camion", tiposVehiculos.get("Camion")+1);
        }else{
            tiposVehiculos.put("Camion",1);
        }
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
