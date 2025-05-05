import java.util.ArrayList;

public class Biblioteca {
    public static void main(String [] args) throws Exception {
        ArrayList<String> libros = new ArrayList<>();

        libros.add("Cien años de soledad");
        libros.add("Boulevar");
        libros.add("El principito");

        System.out.println("Lista de libros: ");
        for (String libro : libros) {
            System.out.print("-"+ libro);
        }

        String buscado = "1984";
        if (libros.contains(buscado)) {
            System.out.println("\nEl libro \""+buscado+"\"esta disponible");
        }else{
            System.out.println("\nEl libro \""+buscado+"\" no se encuentra");
        } 
        
    }
}
