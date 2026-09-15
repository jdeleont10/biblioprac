public class Audiolibro extends Material {
    private String duracion;
    private String narrador;

    public Audiolibro(String titulo, String autor, String codigo, String duracion, String narrador) {
        super(titulo, autor, codigo);
        this.duracion = duracion;
        this.narrador = narrador;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Código: " + getCodigo());
        System.out.println("Duración: " + duracion);
        System.out.println("Narrador: " + narrador);
    }
}
