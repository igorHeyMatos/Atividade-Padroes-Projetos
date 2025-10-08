import java.util.ArrayList;
import java.util.List;

public class RelatorioVenda implements iRelatorio {
    private List<String> pedidos;

    public RelatorioVenda() {
        this.pedidos = new ArrayList<>();
        pedidos.add("Pedido 01");
        pedidos.add("Pedidos 02");
        pedidos.add("Pedido 03");
    }

    @Override
    public String Conteudo() {
        String conteudo = "Relatório de Vendas\n";
        for (String pedido : pedidos) {
            conteudo += pedido + "\n";
        }
        return conteudo;
    }
}
