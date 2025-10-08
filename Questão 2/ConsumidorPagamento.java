public class ConsumidorPagamento {

    // Utilizei o Singleton pois precisava de um ponto centralizado para instanciar
    // dinamicamente os processadores de pagamento (cartão, boleto, PIX), garantindo
    // uma única instância do gerenciador em toda aplicação, e utilizei o Factory
    // Method para permitir a integração com diferentes meios de pagamento de forma
    // desacoplada, encapsulando a lógica específica de criação de cada processador,
    // permitindo que o código principal trabalhe com a interface genérica do
    // iPagamento.

    public static void main(String[] args) {
        GerenciadorPagamentoSingleton gerenciador = GerenciadorPagamentoSingleton.getInstance();

        PagamentoFactory cartaoCreditoFactory = gerenciador.getFactory("cartaocredito", "1234567890123456");
        iPagamento cartaoCredito = cartaoCreditoFactory.criarPagamento();
        cartaoCredito.processarPagamento(100);

        PagamentoFactory boletoFactory = gerenciador.getFactory("boleto", "");
        iPagamento boleto = boletoFactory.criarPagamento();
        boleto.processarPagamento(200);

        PagamentoFactory pixFactory = gerenciador.getFactory("pix", "");
        iPagamento pix = pixFactory.criarPagamento();
        pix.processarPagamento(300);
    }
}