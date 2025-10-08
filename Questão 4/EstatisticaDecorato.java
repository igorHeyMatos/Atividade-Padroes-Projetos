public class EstatisticaDecorato extends CondimentDecorator {
    public EstatisticaDecorato(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Conteudo() {
        return relatorio.Conteudo() + "\nESTATÍSTICAS EXEMPLO";
    }
}
