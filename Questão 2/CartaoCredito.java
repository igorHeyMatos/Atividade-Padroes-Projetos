public class CartaoCredito implements iPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if (!validadorCartao()) {
            System.out.println("Número de cartão inválido!");
        } else {
            System.out.println("Pagamento realizado no cartão de com sucesso no valor de R$ " + valor);
        }
    }

    private boolean validadorCartao() {
        return numeroCartao.length() == 16;
    }
}