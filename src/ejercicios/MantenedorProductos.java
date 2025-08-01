package ejercicios;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class MantenedorProductos {
    public static void main(String[] args) {
        int opcionIndice = 0;

        // Creamos el menú de opciones usando un Map
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        // Convertimos las claves del mapa en un arreglo para mostrar en el menú
        Object[] opcionesArray = opciones.keySet().toArray();

        // Bucle principal del programa
        do {
            Object opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesArray,
                    opcionesArray[0]
            );

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                continue; // vuelve a mostrar el menú
            }

            // Obtenemos el número asociado a la opción seleccionada
            opcionIndice = opciones.get(opcion.toString());

            // Evaluamos la opción seleccionada
            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Lista de productos mostrada correctamente");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Haz salido con éxito!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }

        } while (opcionIndice != 5);
    }
}
