public class TransporteMaritimoFactory extends TransporteFactory {
    @Override
    public iTransporte criarTransporte() {
        return new TransporteMaritimo();
    }
}