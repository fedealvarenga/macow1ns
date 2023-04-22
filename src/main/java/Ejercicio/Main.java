package Ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda camisa = new Prenda(4000, new NuevaPrenda());
        Prenda zapato = new Prenda(20000, new Liquidacion());
        Prenda pantalon_vestir = new Prenda( 3000, new Promocion(500));

        Item item1 = new Item(camisa, 3);
        Item item2 = new Item(zapato, 1);
        Item item3 = new Item(pantalon_vestir, 2);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Venta ventaEfectivo = new VentaEfectivo(LocalDate.now(), items);

        VentaTarjeta ventaTarjeta = new VentaTarjeta(items, LocalDate.now(), 3, 0.25);

        Tienda macoWins = new Tienda();
        macoWins.agregarVenta(ventaTarjeta);
        macoWins.agregarVenta(ventaEfectivo);


        double gananciasHoy = macoWins.gananciasSegunFecha(LocalDate.now());
        System.out.println("Las ganancias de hoy son $" + gananciasHoy);
    }
}