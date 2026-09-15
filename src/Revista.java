public class Revista extends Material{
    private String nombre;
    private int numero;
    private int anio;

    public Revista(String titulo, String autor, String codigo, String nombre, int numero, int anio) {
        super(titulo, autor, codigo);
        this.nombre = nombre;
        this.numero = numero;
        this.anio = anio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Código: " + getCodigo());
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Año: " + anio);
    }
}
