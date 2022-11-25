import java.time.LocalDate;
import java.util.List;

public class ResitroServico {
    private LocalDate data;
    private Cliente cliente;
    private List<Servico> servicos;
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
    public ResitroServico(LocalDate data, Cliente cliente, List<Servico> servicos) {
        this.data = data;
        this.cliente = cliente;
        this.servicos = servicos;
    }

}
