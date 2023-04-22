package Ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
  private List<Venta> ventas;

  public Tienda(){
    this.ventas = new ArrayList<>();
  }

  public void agregarVenta(Venta venta){
    this.ventas.add(venta);
  }

  public double gananciasSegunFecha(LocalDate fecha){

    return ventas.stream().filter(venta -> venta.esFecha(fecha)).mapToDouble(Venta::importe).sum();
  }
}
