import java.util.Objects;

public class Livro {

    private String nome;
    private int isbn;
    private String anoLancamento;
    private String autor;

    public Livro(String nome, int isbn, String anoLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return isbn == livro.isbn && Objects.equals(nome, livro.nome) && Objects.equals(anoLancamento, livro.anoLancamento) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, isbn, anoLancamento, autor);
    }

    @Override
    public String toString() {
        return "Livros {" +
                "Nome='" + nome + '\'' +
                ", Isbn=" + isbn +
                ", Ano de Lançamento='" + anoLancamento + '\'' +
                ", Autor='" + autor + '\'' +
                '}'
                + "\n";
    }
}