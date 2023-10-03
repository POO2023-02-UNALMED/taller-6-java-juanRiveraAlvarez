package vehiculos;
public class Automovil extends Vehiculo{
    private int puestos;

    public Automovil(){

    }

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        if(tiposVehiculos.containsKey("Automovil")){
            tiposVehiculos.put("Automovil", tiposVehiculos.get("Automovil")+1);
        }else{
            tiposVehiculos.put("Automovil",1);
        }
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

}
