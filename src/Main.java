import java.util.ArrayList;
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
                break;
            case 4:
                break;
            case 5:
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

                default:
                    System.out.println("Opcion invalida.");
                    break;
        }
    }


    }

    }
