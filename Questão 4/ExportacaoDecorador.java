public class ExportacaoDecorador extends CondimentDecorator {
    public ExportacaoDecorador(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Conteudo() {
        return relatorio.Conteudo() + "\nEXPORTAÇÃO DE EXEMPLO";
    }
}
