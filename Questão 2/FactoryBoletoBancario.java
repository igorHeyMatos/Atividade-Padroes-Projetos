public class FactoryBoletoBancario implements PagamentoFactory{
    @Override
    public iPagamento criarPagamento(){
        return new BoletoBancario();
    }
}
