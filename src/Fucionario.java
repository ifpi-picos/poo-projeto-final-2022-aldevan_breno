public class Fucionario {
    public String nome;
    public String email;
    public String sexo;
    public String endereco;
    public int telefone;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public Fucionario(String nome, String email, String sexo, String endereco, int telefone) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
}
