public class FactoryPix implements PagamentoFactory {
    @Override
    public iPagamento criarPagamento() {
        return new Pix();
    }
}
