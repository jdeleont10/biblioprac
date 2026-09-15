public class Comic extends Material implements Prestable{
    private String dibujante;
    private int numero;
    private boolean prestado;

    public Comic(String titulo, String autor, String codigo, String dibujante, int numero) {
        super(titulo, autor, codigo);
        this.dibujante = dibujante;
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Código: " + getCodigo());
        System.out.println("Dibujante: " + dibujante);
        System.out.println("Número: " + numero);
    }

    @Override
    public void prestar() {
        this.prestado = true;

    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
