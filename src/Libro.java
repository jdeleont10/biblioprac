public class Libro extends Material implements Prestable {

    private String editorial;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, String codigo, String editorial, int anioPublicacion) {
        super(titulo, autor, codigo);
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Código: " + getCodigo());
        System.out.println("Editorial: " + editorial);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }
}
