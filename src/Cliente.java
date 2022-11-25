public class Cliente {
    public String nome;
    public String email;
    public String sexo;
    public String endereco;
    public String telefone;
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
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Cliente(String nome, String email, String sexo, String endereco, String telefone) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    

}
