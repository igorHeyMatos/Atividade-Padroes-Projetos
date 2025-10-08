public class TransporteTerrestre implements iTransporte {
    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 1) throw new IllegalArgumentException("Distância é obrigatória para transporte terrestre");
        double distancia = parametros[0];
        return 10.00 + (distancia * 2.50);
    }
    
    @Override
    public String getTipo() {
        return "Terrestre";
    }
}