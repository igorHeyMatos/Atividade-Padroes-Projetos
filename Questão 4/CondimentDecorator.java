public abstract class CondimentDecorator implements iRelatorio {
    protected iRelatorio relatorio;

    public CondimentDecorator(iRelatorio relatorio){
        this.relatorio = relatorio;
    }
}
