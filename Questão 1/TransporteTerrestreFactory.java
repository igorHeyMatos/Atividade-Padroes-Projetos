public class TransporteTerrestreFactory extends TransporteFactory {
    @Override
    public iTransporte criarTransporte() {
        return new TransporteTerrestre();
    }
}