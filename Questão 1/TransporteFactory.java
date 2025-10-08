public abstract class TransporteFactory {
    public abstract iTransporte criarTransporte();

    public void exibirInformacoes(double... parametros) {
        iTransporte transporte = criarTransporte();
        double tarifa = transporte.calcularTarifa(parametros);
        System.out.println("Transporte " + transporte.getTipo() +
                " - Tarifa: R$ " + String.format("%.2f", tarifa));
    }
}