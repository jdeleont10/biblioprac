public abstract class Material {

    private String titulo;
    private String autor;
    private String codigo;


    public Material(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }
    public abstract void mostrarInformacion();

    protected String getTitulo() {
        return titulo;
    }

    protected String getAutor() {
        return autor;
    }

    protected String getCodigo() {
        return codigo;
    }
}

