public class TransporteMaritimo implements iTransporte {
    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 1)
            throw new IllegalArgumentException("Volume é obrigatório para transporte marítimo");
        double volume = parametros[0];
        return 100.00 + (volume * 30.00);
    }

    @Override
    public String getTipo() {
        return "Marítimo";
    }
}