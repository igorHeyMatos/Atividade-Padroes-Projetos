public class BoletoBancario implements iPagamento{
    @Override
    public void processarPagamento(double valor) {
            System.out.println("Pagamento realizado no boleto com sucesso no valor de R$ " + valor);
    }
}
