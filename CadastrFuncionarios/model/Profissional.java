package model;
public class Profissional{
    private int id;
    private String nome;
    private String funcao;

     public Profissional() {
    }

    public Profissional(int id, String nome, String função) {
        this.id = id;
        this.nome = nome;
        this.funcao = função;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Profissional [id=" + id + ", nome=" + nome + ", função=" + funcao + "]";
    }
    
    
}
