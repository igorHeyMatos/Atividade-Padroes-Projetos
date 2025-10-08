public class ConsumidorRelatorio {

    // Utilizei o Decorator pois preciso adicionar recursos/funcionalidades
    // adicionais ao relatório básico sem alterar seu código existente, e com ele
    // posso estender dinamicamente a funcionalidade do relatório através de
    // composição.
    public static void main(String[] args) {
        iRelatorio relatorio = new RelatorioVenda();
        System.out.println("=== RELATÓRIO BÁSICO ===\n");
        System.out.println(relatorio.Conteudo());
        System.out.println("\n=== FINAL ===");

        relatorio = new EstatisticaDecorato(relatorio);
        System.out.println("\n=== RELATÓRIO + ESTATÍSTICAS ===\n");
        System.out.println(relatorio.Conteudo());
        System.out.println("\n=== FINAL ===");

        relatorio = new GraficoDecorador(relatorio);
        System.out.println("\n=== RELATÓRIO + ESTATÍSTICAS + GRÁFICOS ===\n");
        System.out.println(relatorio.Conteudo());
        System.out.println("\n=== FINAL ===");

        relatorio = new ExportacaoDecorador(relatorio);
        System.out.println("\n=== RELATÓRIO + ESTATÍSTICAS + GRÁFICOS + EXPORTAÇÃO ===\n");
        System.out.println(relatorio.Conteudo());
        System.out.println("\n=== FINAL ===");

    }

}
