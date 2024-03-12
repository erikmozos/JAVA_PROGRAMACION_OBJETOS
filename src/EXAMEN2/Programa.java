package EXAMEN2;

public class Programa {

	public static void main(String[] args) {
		
		OficinaAtencionCliente oficina = new OficinaAtencionCliente();
        oficina.menuPrincipal();
    }

    private void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Ver la cola de personas");
            System.out.println("2. Llegada de una nueva persona a la oficina");
            System.out.println("3. Atención de la primera persona de la cola");
            System.out.println("4. Ver lista de personas atendidas correctamente por orden de entrada");
            System.out.println("5. Ver lista de personas que no se han podido atender correctamente por orden de entrada");
            System.out.println("6. Ver lista de personas atendidas correctamente ordenadas por DNI");
            System.out.println("7. Ver lista de personas que no se han podido atender correctamente ordenadas por DNI");
            System.out.println("0. Salir");

            System.out.print("Ingrese su elección: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verColaPersonas();
                    break;
                case 2:
                    llegadaNuevaPersona();
                    break;
                case 3:
                    atencionPrimeraPersona();
                    break;
                case 4:
                    verListaAtendidosPorEntrada();
                    break;
                case 5:
                    verListaNoAtendidosPorEntrada();
                    break;
                case 6:
                    verListaAtendidosPorDni();
                    break;
                case 7:
                    verListaNoAtendidosPorDni();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void verColaPersonas() {
        System.out.println("\nCola de Personas:");
        for (Persona persona : colaPersonas) {
            System.out.println(persona.toString());
        }
    }

    private void llegadaNuevaPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        try {
            Persona nuevaPersona = new Persona(dni, nombre, edad);
            colaPersonas.add(nuevaPersona);
            System.out.println("Persona agregada a la cola correctamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar persona a la cola. Intente de nuevo.");
        }
    }

    private void atencionPrimeraPersona() {
        if (!colaPersonas.isEmpty()) {
            Persona personaActual = colaPersonas.poll();
            boolean documentacionCompleta = Math.random() < 0.8; // 80% de probabilidad de tener documentación completa

            Atencion atencion = new Atencion(personaActual, LocalDate.now(), LocalTime.now(), documentacionCompleta);

            if (documentacionCompleta) {
                atendidosCorrectamente.add(atencion);
                System.out.println("Persona atendida correctamente.");
            } else {
                noAtendidosCorrectamente.add(atencion);
                System.out.println("Persona no atendida correctamente debido a documentación incompleta.");
            }
        } else {
            System.out.println("No hay personas en la cola para atender.");
        }
    }

    private void verListaAtendidosPorEntrada() {
        System.out.println("\nLista de Personas Atendidas Correctamente por Orden de Entrada:");
        for (Atencion atencion : atendidosCorrectamente) {
            System.out.println(atencion.toString());
        }
    }

    private void verListaNoAtendidosPorEntrada() {
        System.out.println("\nLista de Personas No Atendidas Correctamente por Orden de Entrada:");
        for (Atencion atencion : noAtendidosCorrectamente) {
            System.out.println(atencion.toString());
        }
    }

    private void verListaAtendidosPorDni() {
        List<Atencion> copiaAtendidos = new ArrayList<>(atendidosCorrectamente);
        Collections.sort(copiaAtendidos, Comparator.comparing(o -> o.getPersona().getDni()));

        System.out.println("\nLista de Personas Atendidas Correctamente por Orden de DNI:");
        for (Atencion atencion : copiaAtendidos) {
            System.out.println(atencion.toString());
        }
    }

    private void verListaNoAtendidosPorDni() {
        List<Atencion> copiaNoAtendidos = new ArrayList<>(noAtendidosCorrectamente);
        Collections.sort(copiaNoAtendidos, Comparator.comparing(o -> o.getPersona().getDni()));

        System.out.println("\nLista de Personas No Atendidas Correctamente por Orden de DNI:");

	}

}
