package vehiculos;

import java.util.Map;

public class Pais {
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        int  mayor  = -9999;
        Pais pais  = new Pais("Chimchombia");
        for (Map.Entry<Pais, Integer> entrada : Fabricante.vehiculosVendidos.entrySet()) {
            Pais clave = entrada.getKey();
            Integer valor = entrada.getValue();
            if(valor > mayor){
                mayor = valor;
                pais = clave;
            }
        }
        return pais;
    }
    
}
