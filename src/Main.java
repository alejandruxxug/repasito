import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void opciones(){
        System.out.print("1. Crear autor ");
        System.out.print("2. Crear libro ");
        System.out.print("3. Crear usuario ");
        System.out.print("4. Listar Autores ");
        System.out.print("5. Autor con mas libros ");
        System.out.print("6. Libro mas leido(mas prestado) ");
        System.out.print("7. Usuario con mas prestamos");
        System.out.print("8. Usuario en orden alfabetico");
        System.out.print("9. Salir");
        System.out.print("10. Prestar libro");
        System.out.print("11. Devolver libro");
    }

    public static void main(String[] args) {

    boolean salido = false;
    int opcion;

    ArrayList<Autor> autores = new ArrayList<>();
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();



    Scanner input = new Scanner(System.in);
    Scanner text = new Scanner(System.in);

    while (!salido) {
        opciones();
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el Nombre del autor: ");
                String nombreAutor = text.nextLine();
                System.out.print("Ingresa la nacionalidad del autor: ");
                String nacionalidadAutor = text.nextLine();

                Autor autor = new Autor(nombreAutor, nacionalidadAutor);
                autores.add(autor);
                System.out.print("Autor creado: " + nombreAutor +"");
                break;

            case 2:
                System.out.print("Ingresa el Nombre del Titulo: ");
                String tituloLibro = text.nextLine();
                System.out.print("El genero ");
                String generoLibro = text.nextLine();
                System.out.print("El Año de publicacion ");
                String anoPublicacionLibro = text.nextLine();

                System.out.print("Elige el Autor ");

                for (int  i = 0; i < autores.size(); i++) {
                    System.out.println("Autor: " + autores.get(i).getName() + " Id: " + autores.get(i).getId() + "");
                }

                System.out.print("Escribe del id del autor que deseas añadir ");
                int id = input.nextInt();

                Libro libro = new Libro(tituloLibro, generoLibro, anoPublicacionLibro, true, autores.get(id));

                libros.add(libro);
                break;
            case 3:
                System.out.print("Ingresa el Nombre del usuario: ");
                String username = text.nextLine();
                System.out.print("El telefono ");
                String phone = text.nextLine();
                System.out.print("correo");
                String email = text.nextLine();

                Usuario usuario = new Usuario(username, email, phone);
                usuarios.add(usuario);
                break;
            case 4:
                System.out.print("Lista de autores: ");
                for (int i = 0; i < autores.size(); i++) {
                    System.out.println("Autor: " + autores.get(i).getName() + " Id: " + autores.get(i).getId() + "");
                }

                break;
            case 5:

                int libroMayor;

                int[] numeroLibros = new int[autores.size()];

                for (int i = 0; i < numeroLibros.length; i++) {
                    numeroLibros[i] = autores.get(i).libros.size();
                }

                Arrays.sort(numeroLibros);

                libroMayor=numeroLibros[numeroLibros.length-1];

                for (int i = 0; i < autores.size(); i++) {
                    if(libroMayor == autores.get(i).libros.size()){
                        System.out.println("El autor con mas libros es: " + autores.get(i).getName());
                    }
                }

                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                salido = true;
                System.out.println("Saliendo..");
                break;
            case 10:
                System.out.println("Ingrese la fecha de hoy");
                String fechaHoy = text.nextLine();

                for (int  i = 0; i < usuarios.size(); i++) {
                    System.out.println("Usuario: " + usuarios.get(i).getNombre() + " Id: " + usuarios.get(i).getId() + "");
                }

                System.out.print("Escribe del id del usuario que deseas añadir ");
                int idUsuario = input.nextInt();

                for (int  i = 0; i < libros.size(); i++) {
                    System.out.println("Libro: " + libros.get(i).getTitulo() + " Id: " + libros.get(i).getId() + "");
                }

                System.out.print("Escribe del id del libro que deseas añadir ");
                int idLibro = input.nextInt();


                PrestamoManager prestamo = new PrestamoManager(fechaHoy, "prestado", libros.get(idLibro), usuarios.get(idUsuario));

                if (libros.get(idLibro).isDisponible()) {
                    libros.get(idLibro).fuePrestadoA.add(prestamo);
                    libros.get(idLibro).setDisponible(false);
                    usuarios.get(idUsuario).prestoEste.add(prestamo);
                } else {
                    System.out.println("El libro no puede estar disponible, intentelo de nuevo");
                }
                break;

            case 11:

                for (int  i = 0; i < usuarios.size(); i++) {
                    System.out.println("Usuario: " + usuarios.get(i).getNombre() + " Id: " + usuarios.get(i).getId() + "");
                }

                System.out.print("Escribe del id del usuario que deseas devolver el libro ");
                int idUsuarioDevolucion = input.nextInt();

                for (int  i = 0; i < usuarios.get(idUsuarioDevolucion).prestoEste.size(); i++) {

                    if(usuarios.get(idUsuarioDevolucion).prestoEste.get(i).getEstadoPrestamo() == "prestado"){
                        System.out.println("Titulo libro:" + usuarios.get(idUsuarioDevolucion).prestoEste.get(i).getLibro().getTitulo() + "ID: " + usuarios.get(idUsuarioDevolucion).prestoEste.get(i).getLibro().getId());
                    }
                }

                System.out.println("Escribe el id del libro que deseas devolver");
                int idLibroDevolucion = input.nextInt();


                int tempID = -1;
                if (!libros.get(idLibroDevolucion).isDisponible()) {


                    for (int  i = 0; i < usuarios.get(idUsuarioDevolucion).prestoEste.size(); i++) {
                        if (usuarios.get(idUsuarioDevolucion).prestoEste.get(i).getLibro().getId() == idLibroDevolucion) {
                            tempID = i;
                            break;
                        }
                    }

                    if(tempID != -1){
                        libros.get(idLibroDevolucion).setDisponible(true);
                        usuarios.get(idUsuarioDevolucion).prestoEste.get(tempID).setEstadoPrestamo("devuelto");
                    }
                    else{
                        System.out.println("No se encontro en el historial de prestamo");
                    }
                }

                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }


    }

    }
