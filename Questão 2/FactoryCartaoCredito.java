public class FactoryCartaoCredito implements PagamentoFactory{
    private String numeroCartao;

    public FactoryCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    @Override
    public iPagamento criarPagamento(){
        return new CartaoCredito(numeroCartao);
    }
}
