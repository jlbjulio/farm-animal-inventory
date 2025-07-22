import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Variables
        InventarioG inventario = new InventarioG();
        InventarioV inventario1 = new InventarioV();
        Gallina gallina = new Gallina();
        Vaca vaca = new Vaca();
        int opcion = 0;
        int opcionRaza = 0;
        int cantidadLeche;
        String cantidadLecheInput = "";
        int totalLeche = 0;
        boolean bien = true;
        String razaVaca = "";
        String cantidadVacasInput = "";
        String razaVenta = "";
        int cantidadLecheVender;
        String pesoGallinaInput = "";
        String cantidadLecheVenderInput = "";
        String mensaje = "";
        int cantidadVacas = 0;
        String edadGallinaInput = "";
        double m;
        String pesoVacaInput = "";
        String edadVacaInput = "";
        int h;
        int huevos1 = 0;
        int huevos2 = 0;
        int huevos3 = 0;
        int edadVaca = 0;
        double pesoVaca = 0.0;
        int k;
        int i;
        int edadGallina = 0;
        double pesoGallina = 0.0;
        int cantidadHuevos;
        String razaSeleccionada = "";
        String razaGallina = "";
        String cantidadHuevosInput = "";
        int cantidadHuevosVender = 0;
        String cantidadHuevosVenderInput = "";
        double q;
        int ventasH = 0;
        int ventasL = 0;
        String input = "";
        int ventasTotales = 0;
        String entrada = "";
        int cantGallinas = 0;
        double[] historialCrecimiento = null;
        int[] historialProduccionLoh = null;
        int[] historialProduccionIsa = null;
        int[] historialProduccionCah = null;
        int[] brahma = null;
        int[] isaBrown = null;
        int[] Lohman = null;
        int[] CastellanaNegra = null;
        ImageIcon confirmIcon = new ImageIcon("Vaca.png");
        ImageIcon confirm1Icon = new ImageIcon("Gallina.jpg");
        ImageIcon farmIcon = new ImageIcon("Farm.jpg");
        // Programa

        JOptionPane.showMessageDialog(
                null,
                null,
                "\tBienvenido al programa de Administracion de la granja!",
                JOptionPane.INFORMATION_MESSAGE,
                farmIcon);

        while (opcion != 9) {

            input = JOptionPane.showInputDialog(null,
                    "------------------------- MENÚ ----------------------------\n" +
                            "1. Agregar gallina\n" +
                            "2. Agregar vaca\n" +
                            "3. Vender huevos\n" +
                            "4. Vender leche\n" +
                            "5. Generar informe de producción de huevos\n" +
                            "6. Generar informe de producción de leche\n" +
                            "7. Historial de crecimiento\n" +
                            "8. Generar informe de ventas totales\n" +
                            "9. Salir\n" +
                            "\tIngrese la opción deseada:",
                    "Menu Principal", JOptionPane.PLAIN_MESSAGE);

            if (input == null || input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                        JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                System.exit(0);
            }
            do {
                bien = true;
                try {
                    opcion = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.", "Error",
                            JOptionPane.ERROR_MESSAGE, confirmIcon);
                    bien = false;
                }
            } while (!bien);
            try {
                switch (opcion) {
                    case 1:

                        razaGallina = JOptionPane.showInputDialog(null,
                                "Ingrese los datos de una gallina:\nRaza:\n1. Isa Brown\n2. Lohman\n3. Castellana Negra",
                                "Entrada", JOptionPane.PLAIN_MESSAGE);
                        if (razaGallina == null || razaGallina.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                            System.exit(0);
                        }
                        do {
                            bien = true;
                            try {
                                opcionRaza = Integer.parseInt(razaGallina);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.",
                                        "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                bien = false;
                            }

                        } while (!bien);

                        switch (opcionRaza) {
                            case 1:
                                do {
                                    try {
                                        bien = true;
                                        entrada = JOptionPane.showInputDialog(null,
                                                "Ingrese la cantidad de gallinas a agregar: ", "Entrada",
                                                JOptionPane.PLAIN_MESSAGE);
                                        if (entrada == null || entrada.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }
                                        cantGallinas = Integer.parseInt(entrada);
                                        if (cantGallinas <= 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }
                                } while (!bien);
                                gallina.asignar(cantGallinas);

                                razaSeleccionada = "Isa Brown";

                                isaBrown = new int[gallina.getNumGallinas()];

                                for (i = 0; i < isaBrown.length; i++) {
                                    do {
                                        bien = true;
                                        try {
                                            edadGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Edad (en años) de la gallina AISA" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (edadGallinaInput == null || edadGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            edadGallina = Integer.parseInt(edadGallinaInput);
                                            if (edadGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }

                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            continue;
                                        }
                                    } while (!bien);
                                    do {
                                        bien = true;
                                        try {
                                            pesoGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Peso (en kg) de la gallina AISA" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (pesoGallinaInput == null || pesoGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            pesoGallina = Double.parseDouble(pesoGallinaInput);
                                            if (pesoGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }
                                            gallina.asignar(razaSeleccionada, edadGallina, pesoGallina);
                                            if (edadGallina > 0 && pesoGallina >= 1.7 && pesoGallina <= 2.2) {

                                                if (edadGallina <= 6) {

                                                    JOptionPane.showMessageDialog(null,
                                                            "Se ha agregado una gallina correctamente.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                    cantidadHuevos = 0;
                                                    cantidadHuevosInput = JOptionPane
                                                            .showInputDialog(null,
                                                                    "Ingrese la cantidad de docenas de huevos recolectados de la gallina AISA"
                                                                            + (i + 1) + ":",
                                                                    "Entrada", JOptionPane.PLAIN_MESSAGE);
                                                    if (cantidadHuevosInput == null
                                                            || cantidadHuevosInput.isEmpty()) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "¡Gracias por usar el programa!",
                                                                "Salida", JOptionPane.INFORMATION_MESSAGE,
                                                                confirm1Icon);
                                                        System.exit(0);
                                                    }
                                                    do {
                                                        try {
                                                            cantidadHuevos = Integer.parseInt(cantidadHuevosInput);
                                                            if (cantidadHuevos < 0) {
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Error: entrada inválida. Intente nuevamente.",
                                                                        "Error", JOptionPane.ERROR_MESSAGE,
                                                                        confirm1Icon);
                                                                bien = false;
                                                            }

                                                        } catch (NumberFormatException e) {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Error: entrada inválida. Intente nuevamente.",
                                                                    "Error", JOptionPane.ERROR_MESSAGE,
                                                                    confirm1Icon);
                                                            bien = false;
                                                        }
                                                    } while (!bien);
                                                    historialProduccionIsa = new int[isaBrown.length];
                                                    gallina.asignarHistorial(historialProduccionIsa);
                                                    historialProduccionIsa[i] = cantidadHuevos;
                                                    huevos1 += gallina.total();
                                                    inventario.asignarR(cantidadHuevos);
                                                    k = inventario.recolectarHuevosIsa();
                                                    JOptionPane.showMessageDialog(null,
                                                            "En total se han recolectado  " + k
                                                                    + " docenas de huevos.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "La gallina ha superado su vida útil y no puede ser agregada a la granja.",
                                                            "Error", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                    bien = false;
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "La gallina no cumple con los requisitos de edad y peso para ser considerada.",
                                                        "Error", JOptionPane.INFORMATION_MESSAGE,
                                                        confirm1Icon);
                                                bien = false;
                                            }
                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }

                                    } while (!bien);

                                }
                                break;
                            case 2:
                                do {
                                    try {
                                        bien = true;
                                        entrada = JOptionPane.showInputDialog(null,
                                                "Ingrese la cantidad de gallinas a agregar: ", "Entrada",
                                                JOptionPane.PLAIN_MESSAGE);
                                        if (entrada == null || entrada.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }
                                        cantGallinas = Integer.parseInt(entrada);
                                        if (cantGallinas <= 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }
                                } while (!bien);
                                gallina.asignar(cantGallinas);

                                razaSeleccionada = "Lohman";
                                Lohman = new int[gallina.getNumGallinas()];

                                for (i = 0; i < Lohman.length; i++) {
                                    do {
                                        bien = true;
                                        try {
                                            edadGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Edad (en años) de la gallina ALOH" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (edadGallinaInput == null || edadGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            edadGallina = Integer.parseInt(edadGallinaInput);
                                            if (edadGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }

                                            pesoGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Peso (en kg) de la gallina ALOH" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (pesoGallinaInput == null || pesoGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            pesoGallina = Double.parseDouble(pesoGallinaInput);
                                            if (pesoGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }
                                            gallina.asignar(razaSeleccionada, edadGallina, pesoGallina);
                                            if (edadGallina > 0 && pesoGallina >= 1.7 && pesoGallina <= 2.2) {

                                                if (edadGallina <= 6) {

                                                    JOptionPane.showMessageDialog(null,
                                                            "Se ha agregado una gallina correctamente.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                    cantidadHuevos = 0;
                                                    cantidadHuevosInput = JOptionPane
                                                            .showInputDialog(null,
                                                                    "Ingrese la cantidad de docenas de huevos recolectados de la gallina ALOH"
                                                                            + (i + 1) + ":",
                                                                    "Entrada", JOptionPane.PLAIN_MESSAGE);
                                                    if (cantidadHuevosInput == null
                                                            || cantidadHuevosInput.isEmpty()) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "¡Gracias por usar el programa!",
                                                                "Salida", JOptionPane.INFORMATION_MESSAGE,
                                                                confirm1Icon);
                                                        System.exit(0);
                                                    }
                                                    do {
                                                        try {
                                                            cantidadHuevos = Integer.parseInt(cantidadHuevosInput);
                                                            if (cantidadHuevos < 0) {
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Error: entrada inválida. Intente nuevamente.",
                                                                        "Error", JOptionPane.ERROR_MESSAGE,
                                                                        confirm1Icon);
                                                                bien = false;
                                                            }
                                                        } catch (NumberFormatException e) {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Error: entrada inválida. Intente nuevamente.",
                                                                    "Error", JOptionPane.ERROR_MESSAGE,
                                                                    confirm1Icon);
                                                            bien = false;
                                                        }
                                                    } while (!bien);
                                                    historialProduccionLoh = new int[Lohman.length];
                                                    gallina.asignarHistorial(historialProduccionLoh);
                                                    historialProduccionLoh[i] = cantidadHuevos;
                                                    huevos2 += gallina.total();
                                                    inventario.asignarR(cantidadHuevos);
                                                    k = inventario.recolectarHuevosLoh();
                                                    JOptionPane.showMessageDialog(null,
                                                            "En total se han recolectado  " + k
                                                                    + " docenas de huevos.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "La gallina ha superado su vida útil y no puede ser agregada a la granja.",
                                                            "Error", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                    bien = false;
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "La gallina no cumple con los requisitos de edad y peso para ser considerada.",
                                                        "Error", JOptionPane.INFORMATION_MESSAGE,
                                                        confirm1Icon);
                                                bien = false;
                                            }
                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                    } while (!bien);

                                }
                                break;
                            case 3:
                                do {
                                    try {
                                        bien = true;
                                        entrada = JOptionPane.showInputDialog(null,
                                                "Ingrese la cantidad de gallinas a agregar: ", "Entrada",
                                                JOptionPane.PLAIN_MESSAGE);
                                        if (entrada == null || entrada.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }
                                        cantGallinas = Integer.parseInt(entrada);
                                        if (cantGallinas <= 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }
                                } while (!bien);

                                gallina.asignar(cantGallinas);

                                razaSeleccionada = "Castellana Negra";
                                CastellanaNegra = new int[gallina.getNumGallinas()];

                                for (i = 0; i < CastellanaNegra.length; i++) {
                                    do {
                                        bien = true;
                                        try {
                                            edadGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Edad (en años) de la gallina ACAST" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (edadGallinaInput == null || edadGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            edadGallina = Integer.parseInt(edadGallinaInput);
                                            if (edadGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }
                                            pesoGallinaInput = JOptionPane.showInputDialog(null,
                                                    "Peso (en kg) de la gallina ACAST" + (i + 1) + ":", "Entrada",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            if (pesoGallinaInput == null || pesoGallinaInput.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "¡Gracias por usar el programa!", "Salida",
                                                        JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                System.exit(0);
                                            }
                                            pesoGallina = Double.parseDouble(pesoGallinaInput);
                                            if (pesoGallina <= 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Error: entrada inválida. Intente nuevamente.", "Error",
                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }
                                            gallina.asignar(razaSeleccionada, edadGallina, pesoGallina);
                                            if (edadGallina > 0 && pesoGallina >= 1.7 && pesoGallina <= 2.2) {

                                                if (edadGallina <= 6) {

                                                    JOptionPane.showMessageDialog(null,
                                                            "Se ha agregado una gallina correctamente.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                    cantidadHuevos = 0;
                                                    cantidadHuevosInput = JOptionPane
                                                            .showInputDialog(null,
                                                                    "Ingrese la cantidad de docenas de huevos recolectados de la gallina ACAST"
                                                                            + (i + 1) + ":",
                                                                    "Entrada", JOptionPane.PLAIN_MESSAGE);
                                                    if (cantidadHuevosInput == null
                                                            || cantidadHuevosInput.isEmpty()) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "¡Gracias por usar el programa!",
                                                                "Salida",
                                                                JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                        System.exit(0);
                                                    }
                                                    do {
                                                        try {
                                                            cantidadHuevos = Integer.parseInt(cantidadHuevosInput);
                                                            if (cantidadHuevos < 0) {
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Error: entrada inválida. Intente nuevamente.",
                                                                        "Error",
                                                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                                                bien = false;
                                                            }
                                                        } catch (NumberFormatException e) {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Error: entrada inválida. Intente nuevamente.",
                                                                    "Error", JOptionPane.ERROR_MESSAGE,
                                                                    confirm1Icon);
                                                            bien = false;
                                                        }
                                                    } while (!bien);
                                                    historialProduccionCah = new int[CastellanaNegra.length];
                                                    gallina.asignarHistorial(historialProduccionCah);
                                                    historialProduccionCah[i] = cantidadHuevos;
                                                    huevos3 += gallina.total();
                                                    inventario.asignarR(cantidadHuevos);
                                                    k = inventario.recolectarHuevosCa();
                                                    JOptionPane.showMessageDialog(null,
                                                            "En total se han recolectado  " + k
                                                                    + " docenas de huevos.",
                                                            "Confirmación", JOptionPane.INFORMATION_MESSAGE,
                                                            confirm1Icon);
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "La gallina ha superado su vida útil y no puede ser agregada a la granja.",
                                                            "Error", JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                    bien = false;
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "La gallina no cumple con los requisitos de edad y peso para ser considerada.",
                                                        "Error", JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                                bien = false;
                                            }
                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                    } while (!bien);

                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,
                                        "Opción inválida. Por favor, ingrese una opción válida.", "Error",
                                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                continue;
                        }

                        break;

                    case 2:
                        do {
                            bien = true;
                            try {
                                cantidadVacasInput = JOptionPane
                                        .showInputDialog(null, "Ingrese la cantidad de vacas:", "Entrada",
                                                JOptionPane.PLAIN_MESSAGE);
                                if (cantidadVacasInput == null || cantidadVacasInput.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                            JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                                    System.exit(0);
                                }
                                cantidadVacas = Integer.parseInt(cantidadVacasInput);
                                if (cantidadVacas <= 0) {
                                    JOptionPane.showMessageDialog(null,
                                            "Error: entrada inválida. Intente nuevamente.", "Error",
                                            JOptionPane.ERROR_MESSAGE, confirmIcon);
                                    bien = false;
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.",
                                        "Error", JOptionPane.ERROR_MESSAGE, confirmIcon);
                                bien = false;
                            }

                        } while (!bien);

                        vaca.asignar(cantidadVacas);

                        historialCrecimiento = new double[vaca.getCantidad()];
                        brahma = new int[vaca.getCantidad()];
                        razaVaca = "Brahma";
                        for (i = 0; i < brahma.length; i++) {
                            JOptionPane.showMessageDialog(null,
                                    "Ingrese los datos de la vaca Brahma BRAH" + (i + 1) + ": ", "Entrada",
                                    JOptionPane.PLAIN_MESSAGE, confirmIcon);
                            do {
                                bien = true;
                                try {
                                    edadVacaInput = JOptionPane
                                            .showInputDialog(null, "Edad de la vaca Brahma BRAH" + (i + 1) + ": ",
                                                    "Entrada", JOptionPane.PLAIN_MESSAGE);
                                    if (edadVacaInput == null || edadVacaInput.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                "Salida", JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                                        System.exit(0);
                                    }
                                    edadVaca = Integer.parseInt(edadVacaInput);
                                    if (edadVaca <= 0) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirmIcon);
                                        bien = false;
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null,
                                            "Error: entrada inválida. Intente nuevamente.", "Error",
                                            JOptionPane.ERROR_MESSAGE, confirmIcon);
                                    bien = false;
                                }

                            } while (!bien);
                            do {
                                try {
                                    pesoVacaInput = JOptionPane
                                            .showInputDialog(null, "Peso de la vaca Brahma BRAH" + (i + 1) + ": ",
                                                    "Entrada", JOptionPane.PLAIN_MESSAGE);
                                    if (pesoVacaInput == null || pesoVacaInput.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                "Salida", JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                                        System.exit(0);
                                    }
                                    pesoVaca = Double.parseDouble(pesoVacaInput);
                                    if (pesoVaca <= 0) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirmIcon);
                                        bien = false;
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null,
                                            "Error: entrada inválida. Intente nuevamente.", "Error",
                                            JOptionPane.ERROR_MESSAGE, confirmIcon);
                                    bien = false;
                                }
                            } while (!bien);
                            vaca.asignar(razaVaca, edadVaca, pesoVaca);

                            if (edadVaca >= 2 && edadVaca <= 12 && pesoVaca >= 450 && pesoVaca <= 550) {
                                JOptionPane.showMessageDialog(null, "Se ha agregado una vaca correctamente.",
                                        "Confirmación", JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                                cantidadLeche = 0;
                                cantidadLecheInput = JOptionPane
                                        .showInputDialog(null,
                                                "Ingrese la cantidad de litros de leche producidos de la vaca Brahma "
                                                        + (i + 1) + ": ",
                                                "Entrada", JOptionPane.PLAIN_MESSAGE);
                                if (cantidadLecheInput == null || cantidadLecheInput.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                            JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                                    System.exit(0);
                                }
                                do {
                                    bien = true;
                                    try {
                                        cantidadLeche = Integer.parseInt(cantidadLecheInput);
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.", "Error",
                                                JOptionPane.ERROR_MESSAGE, confirmIcon);
                                        bien = false;
                                    }
                                    inventario1.asignarProduccion(cantidadLeche);
                                    totalLeche += inventario1.getProduccion();
                                    h = inventario1.producirLeche();
                                } while (!bien);
                                JOptionPane.showMessageDialog(null, "Se produjeron " + h + " litros de leche.",
                                        "Produccion", JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "La vaca no cumple con los requisitos de edad y peso para ser considerada.",
                                        "Error", JOptionPane.INFORMATION_MESSAGE, confirmIcon);

                            }
                            historialCrecimiento[i] = vaca.getPeso();

                        }

                        break;

                    case 3:
                        razaVenta = JOptionPane.showInputDialog(null,
                                "Ingrese la raza de gallina a vender :\nRaza:\n1. Isa Brown\n2. Lohman\n3. Castellana Negra",
                                "Entrada", JOptionPane.PLAIN_MESSAGE);
                        if (razaVenta == null || razaVenta.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                            System.exit(0);
                        }
                        do {
                            bien = true;
                            try {
                                opcionRaza = Integer.parseInt(razaVenta);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.",
                                        "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                bien = false;
                            }

                        } while (!bien);
                        switch (opcionRaza) {
                            case 1:
                                do {
                                    bien = true;
                                    try {
                                        cantidadHuevosVenderInput = JOptionPane
                                                .showInputDialog(null,
                                                        "Costo por docena : 4.50 " + "\n"
                                                                + "Ingrese la cantidad de docenas de huevos a vender:",
                                                        "Entrada", JOptionPane.PLAIN_MESSAGE);
                                        if (cantidadHuevosVenderInput == null || cantidadHuevosVenderInput.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }

                                        cantidadHuevosVender = Integer.parseInt(cantidadHuevosVenderInput);

                                        if (cantidadHuevosVender < 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                        inventario.asingarV(cantidadHuevosVender);
                                        q = inventario.venderHuevosIsa();

                                        if (inventario.getInventarioHuevosIsa() < cantidadHuevosVender) {
                                            JOptionPane.showMessageDialog(null,
                                                    "No hay suficientes huevos en el inventario.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);

                                        } else {

                                            mensaje = "***************************\n" +
                                                    "    FACTURA DE VENTA\n" +
                                                    "***************************\n" +
                                                    "Fecha: 27/07/2023\n" +
                                                    "Hora: 10:30 AM\n" +
                                                    "***************************\n" +
                                                    "Descripción       Cantidad   Precio\n" +
                                                    "Huevos            " + cantidadHuevosVender + " docenas   $"
                                                    + "4.50" + "\n" +
                                                    "***************************\n" +
                                                    "Total a pagar:              $" + q + "\n" +
                                                    "***************************";
                                            JOptionPane.showMessageDialog(null, mensaje, "Factura",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            ventasH++;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.",
                                                "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }

                                } while (!bien);
                                break;

                            case 2:
                                do {
                                    bien = true;
                                    try {
                                        cantidadHuevosVenderInput = JOptionPane
                                                .showInputDialog(null,
                                                        "Costo por docena : 6.00 " + "\n"
                                                                + "Ingrese la cantidad de docenas de huevos a vender:",
                                                        "Entrada", JOptionPane.PLAIN_MESSAGE);
                                        if (cantidadHuevosVenderInput == null || cantidadHuevosVenderInput.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }

                                        cantidadHuevosVender = Integer.parseInt(cantidadHuevosVenderInput);

                                        if (cantidadHuevosVender < 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                        inventario.asingarV(cantidadHuevosVender);
                                        q = inventario.venderHuevosLoh();

                                        if (inventario.getInventarioHuevosLoh() < cantidadHuevosVender) {
                                            JOptionPane.showMessageDialog(null,
                                                    "No hay suficientes huevos en el inventario.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);

                                        } else {

                                            mensaje = "***************************\n" +
                                                    "    FACTURA DE VENTA\n" +
                                                    "***************************\n" +
                                                    "Fecha: 27/07/2023\n" +
                                                    "Hora: 10:30 AM\n" +
                                                    "***************************\n" +
                                                    "Descripción       Cantidad   Precio\n" +
                                                    "Huevos            " + cantidadHuevosVender + " docenas   $"
                                                    + "6.00" + "\n" +
                                                    "***************************\n" +
                                                    "Total a pagar:              $" + q + "\n" +
                                                    "***************************";
                                            JOptionPane.showMessageDialog(null, mensaje, "Factura",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            ventasH++;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.",
                                                "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }

                                } while (!bien);

                                break;

                            case 3:
                                do {
                                    bien = true;
                                    try {
                                        cantidadHuevosVenderInput = JOptionPane
                                                .showInputDialog(null,
                                                        "Costo por docena : 12.00 " + "\n"
                                                                + "Ingrese la cantidad de docenas de huevos a vender:",
                                                        "Entrada", JOptionPane.PLAIN_MESSAGE);
                                        if (cantidadHuevosVenderInput == null || cantidadHuevosVenderInput.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!",
                                                    "Salida",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            System.exit(0);
                                        }

                                        cantidadHuevosVender = Integer.parseInt(cantidadHuevosVenderInput);

                                        if (cantidadHuevosVender < 0) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error: entrada inválida. Intente nuevamente.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                            bien = false;
                                        }
                                        inventario.asingarV(cantidadHuevosVender);
                                        q = inventario.venderHuevosCa();

                                        if (inventario.getInventarioHuevosCa() < cantidadHuevosVender) {
                                            JOptionPane.showMessageDialog(null,
                                                    "No hay suficientes huevos en el inventario.", "Error",
                                                    JOptionPane.ERROR_MESSAGE, confirm1Icon);

                                        } else {

                                            mensaje = "***************************\n" +
                                                    "    FACTURA DE VENTA\n" +
                                                    "***************************\n" +
                                                    "Fecha: 27/07/2023\n" +
                                                    "Hora: 10:30 AM\n" +
                                                    "***************************\n" +
                                                    "Descripción       Cantidad   Precio\n" +
                                                    "Huevos            " + cantidadHuevosVender + " docenas   $"
                                                    + "12.00" + "\n" +
                                                    "***************************\n" +
                                                    "Total a pagar:              $" + q + "\n" +
                                                    "***************************";
                                            JOptionPane.showMessageDialog(null, mensaje, "Factura",
                                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                            ventasH++;
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Error: entrada inválida. Intente nuevamente.",
                                                "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                        bien = false;
                                    }

                                } while (!bien);
                                break;

                        }

                        break;
                    case 4:
                        do {
                            bien = true;
                            try {
                                cantidadLecheVenderInput = JOptionPane
                                        .showInputDialog(null,
                                                "Costo por litro de leche : 2.00 " + "\n"
                                                        + "Ingrese la cantidad de litros de leche a vender:",
                                                "Entrada", JOptionPane.PLAIN_MESSAGE);
                                if (cantidadLecheVenderInput == null || cantidadLecheVenderInput.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                            JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                    System.exit(0);
                                }
                                cantidadLecheVender = Integer.parseInt(cantidadLecheVenderInput);
                                if (cantidadLecheVender <= 0) {
                                    JOptionPane.showMessageDialog(null,
                                            "Error: entrada inválida. Intente nuevamente.", "Error",
                                            JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                    bien = false;
                                }
                                inventario1.asignarVender(cantidadLecheVender);
                                m = inventario1.venderLeche();
                                if (inventario1.getProduccionLecheDiaria() < m) {
                                    JOptionPane.showMessageDialog(null,
                                            "No hay suficiente leche en la producción diaria.", "Error",
                                            JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                    break;
                                } else {
                                    mensaje = "***************************\n" +
                                            "    FACTURA DE VENTA\n" +
                                            "***************************\n" +
                                            "Fecha: 27/07/2023\n" +
                                            "Hora: 10:30 AM\n" +
                                            "***************************\n" +
                                            "Descripción       Cantidad   Precio\n" +
                                            "Leche            " + cantidadLecheVender + " Litros   $"
                                            + "2.00" + "\n" +
                                            "***************************\n" +
                                            "Total a pagar:              $" + m + "\n" +
                                            "***************************";
                                    JOptionPane.showMessageDialog(null, mensaje, "Factura",
                                            JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                                    ventasL++;
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.",
                                        "Error", JOptionPane.ERROR_MESSAGE, confirm1Icon);
                                bien = false;
                            }

                        } while (!bien);

                        break;
                    case 5:
                        if (inventario.getInventarioHuevosIsa() == 0 && inventario.getInventarioHuevosLoh() == 0
                                && inventario.getInventarioHuevosCa() == 0) {
                            JOptionPane.showMessageDialog(null, "No hay huevos en el inventario.", "Error",
                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                            break;
                        } else {

                            mensaje = "Informe de producción de huevos:\n"
                                    + "Huevos recolectados de gallinas Isa Brown: "
                                    + huevos1 + "\n" + "Huevos recolectados de gallinas Lohman: " + huevos2 + "\n"
                                    + "Huevos recolectados de gallinas Castellana Negra: " + huevos3 + "\n"
                                    + "\n"
                                    + "Huevos totales Isa en inventario: " + inventario.getInventarioHuevosIsa() + "\n"
                                    + "Huevos totales Lohman en inventario: " + inventario.getInventarioHuevosLoh()
                                    + "\n"
                                    + "Huevos totales Castellana Negra en inventario: "
                                    + inventario.getInventarioHuevosCa() + "\n"
                                    + "\n"
                                    + "Huevos total en inventario: " + (inventario.getInventarioHuevosIsa()
                                            + inventario.getInventarioHuevosLoh() + inventario.getInventarioHuevosCa())
                                    + "\n"
                                    + "\n"
                                    + "Huevos totales vendidos: "
                                    + (huevos1 + huevos2 + huevos3 - inventario.getInventarioHuevosIsa()
                                            - inventario.getInventarioHuevosLoh() - inventario.getInventarioHuevosCa())
                                    + "\n";
                            JOptionPane.showMessageDialog(null, mensaje, "Informe", JOptionPane.INFORMATION_MESSAGE,
                                    confirm1Icon);

                        }

                        break;
                    case 6:
                        if (inventario1.getProduccionLecheDiaria() == 0) {
                            JOptionPane.showMessageDialog(null, "No hay leche en la producción diaria.", "Error",
                                    JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                        } else {
                            JOptionPane.showMessageDialog(null, "Informe de producción de leche:" +
                                    "\nCantidad de leche en inventario: " + inventario1.getProduccionLecheDiaria()
                                    + " litros" + "\nProducción diaria de leche: " + totalLeche + " litros" + "\n"
                                    + "\n" + "Cantidad de leche vendida : "
                                    + (totalLeche - inventario1.getProduccionLecheDiaria()),
                                    "Produccion de leche", JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                        }
                        break;

                    case 7:

                        if (historialCrecimiento == null) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay vacas en la granja, está vacía por el momento.", "Vacas",
                                    JOptionPane.INFORMATION_MESSAGE, confirmIcon);
                            break;
                        }
                        mensaje = "Historial de crecimiento peso:\n";

                        for (i = 0; i < historialCrecimiento.length; i++) {
                            mensaje += "Vaca BRAH" + (i + 1) + ": " + historialCrecimiento[i] + "\n";
                        }

                        JOptionPane.showMessageDialog(null, mensaje, "Historial", JOptionPane.INFORMATION_MESSAGE,
                                confirmIcon);
                        break;

                    case 8:
                        ventasTotales = ventasH + ventasL;
                        mensaje = "Informe de ventas totales:\n"
                                + "\n"
                                + "Ventas de huevos: " + ventasH + "\n"
                                + "Ventas de leche: " + ventasL + "\n"
                                + "Ventas totales: " + ventasTotales + "\n";
                        if (ventasH == 0 && ventasL == 0) {
                            JOptionPane.showMessageDialog(null, "No hay ventas registradas.", "Ventas",
                                    JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, mensaje, "Ventas", JOptionPane.INFORMATION_MESSAGE,
                                    confirm1Icon);
                        }
                        break;

                    case 9:
                        JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Salida",
                                JOptionPane.INFORMATION_MESSAGE, confirm1Icon);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,
                                "Opción inválida. Por favor, ingrese una opción válida.", "Error",
                                JOptionPane.ERROR_MESSAGE, confirm1Icon);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: entrada inválida. Intente nuevamente.", "Error",
                        JOptionPane.ERROR_MESSAGE, confirm1Icon);
            }

        }

    }
}
