public class Enndereco {
    public String estado;
    public String cidade;
    public String bairro;
    public String rua;
    public int cep;
    public int numero;
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Enndereco(String estado, String cidade, String bairro, String rua, int cep, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }
}
