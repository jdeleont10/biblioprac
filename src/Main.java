import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro(
                "El Quijote",
                "Miguel de Cervantes",
                "L001",
                "Editorial",
                1605
        );

        Revista revista = new Revista(
                "National Geographic",
                "Varios autores",
                "R001",
                "National Geographic",
                202,
                2023
        );

        Comic comic = new Comic(
                "Spider-Man",
                "Stan Lee",
                "C001",
                "Steve Ditko",
                1
        );

        Audiolibro audiolibro = new Audiolibro(
                "El Quijote",
                "Miguel de Cervantes",
                "A001",
                "2 horas",
                "Juan Pérez"
        );
        ArrayList<Material> materiales = new ArrayList<>();
        materiales.add(libro);
        materiales.add(revista);
        materiales.add(comic);
        materiales.add(audiolibro);

        for (Material material : materiales) {
            material.mostrarInformacion();
            System.out.println();
        }
    }
}