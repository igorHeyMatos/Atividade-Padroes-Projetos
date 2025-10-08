public class Pix implements iPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado no pix com sucesso no valor de R$ " + valor);
    }
}
