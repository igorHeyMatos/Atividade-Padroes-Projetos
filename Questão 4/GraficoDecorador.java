public class GraficoDecorador extends CondimentDecorator {
    public GraficoDecorador(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Conteudo() {
        return relatorio.Conteudo() + "\nGRÁFICO DE EXEMPLO";
    }
}
