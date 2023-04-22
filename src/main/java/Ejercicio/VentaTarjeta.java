package Ejercicio;

import java.time.LocalDate;
import java.util.List;

public class VentaTarjeta extends Venta{
    private int cantidadCuotas;
    private double coeficiente;

    public VentaTarjeta(List<Item> items, LocalDate fecha, int cantCuotas, double coeficiente){
      super(items, fecha);
      this.cantidadCuotas = cantCuotas;
      this.coeficiente = coeficiente;
    }

  @Override
  public double importe() {
    return (coeficiente * cantidadCuotas + 0.01 * super.importe()) + super.importe();
  }
}
