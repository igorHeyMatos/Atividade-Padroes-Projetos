public class TransporteAereo implements iTransporte {
    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 1) throw new IllegalArgumentException("Peso é obrigatório para transporte aéreo");
        double peso = parametros[0];
        return 50.00 + (peso * 15.00);
    }
    
    @Override
    public String getTipo() {
        return "Aéreo";
    }
}
  