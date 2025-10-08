public class GerenciadorPagamentoSingleton {
    private static GerenciadorPagamentoSingleton instance;

    private GerenciadorPagamentoSingleton() {
    }

    public static GerenciadorPagamentoSingleton getInstance() {
        if (instance == null) {
            instance = new GerenciadorPagamentoSingleton();
        }
        return instance;
    }

    public PagamentoFactory getFactory(String tipoPagamento, String... parametros) {
        switch (tipoPagamento.toLowerCase()) {
            case "cartaocredito":
                if (parametros.length > 0) {
                    return new FactoryCartaoCredito(parametros[0]);
                }
                throw new IllegalArgumentException("Número do cartão é obrigatório");

            case "boleto":
                return new FactoryBoletoBancario();

            case "pix":
                return new FactoryPix();

            default:
                throw new IllegalArgumentException("Tipo de pagamento não suportado: " + tipoPagamento);
        }
    }
}