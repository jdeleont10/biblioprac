import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Material> materialesPrestados;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materialesPrestados = new ArrayList<>();
    }

    public void prestarMaterial(Material material) {
        materialesPrestados.add(material);
    }
    public void devolverMaterial(Material material) {
        materialesPrestados.remove(material);
    }
    public void mostrarPrestamos() {
        System.out.println("Usuario: " + nombre + " (ID: " + id + ")");
        System.out.println("Materiales prestados:");
        for (Material material : materialesPrestados) {
            material.mostrarInformacion();
            System.out.println();
        }
    }
}
