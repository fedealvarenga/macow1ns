package Ejercicio;

public class Liquidacion implements EstadoPrenda{
  @Override
  public double precioFinal(double precioOriginal) {
    return precioOriginal * 0.5;
  }
}
