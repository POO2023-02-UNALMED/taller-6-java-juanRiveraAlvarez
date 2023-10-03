package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String  nombre;
    private  Pais pais;
    public static Map<Pais,Integer> vehiculosVendidos = new HashMap<>();

    public Fabricante() {
    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        if(vehiculosVendidos.containsKey(pais)){
            vehiculosVendidos.put(pais, vehiculosVendidos.get(pais)+1);
        }else{
            vehiculosVendidos.put(pais,1);
        }
    }

    public static Fabricante fabricaMayorVentas(){
        int  mayor  = -9999;
        Fabricante fabricante  = new Fabricante("Fabricante x",new Pais("Chimchombia"));
        for (Map.Entry<Fabricante, Integer> entrada : Vehiculo.ventasFabrica.entrySet()) {
            Fabricante clave = entrada.getKey();
            Integer valor = entrada.getValue();
            if(valor > mayor){
                mayor = valor;
                fabricante = clave;
            }
        }
        return fabricante;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}
