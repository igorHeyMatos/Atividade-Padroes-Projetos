public class TransporteAereoFactory extends TransporteFactory {
    @Override
    public iTransporte criarTransporte() {
        return new TransporteAereo();
    }
}