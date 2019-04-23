public class Livro extends java.lang.Object {

    private String titulo;
    private String Editora;

    public Livro(String titulo,String Editora) {
        this.Editora = Editora;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return Editora;
    }
}
