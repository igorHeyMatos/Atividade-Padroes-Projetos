public class ConsumidorSistemaLogistica {

    // Utilizei o Factory Method pois o sistema precisa gerenciar vários tipos de
    // transporte (terrestre, aéreo, marítimo), onde cada um possui regras próprias
    // e específicas para cálculo de tarifas, assim eu consigo tratar todos os tipos
    // de forma genérica.
    public static void main(String[] args) {
        TransporteFactory factoryTerrestre = new TransporteTerrestreFactory();
        TransporteFactory factoryAereo = new TransporteAereoFactory();
        TransporteFactory factoryMaritimo = new TransporteMaritimoFactory();

        System.out.println("=== CÁLCULO DE TARIFAS DE TRANSPORTE ===");

        System.out.println("\n--- Transporte Terrestre ---");
        factoryTerrestre.exibirInformacoes(250.0);

        System.out.println("\n--- Transporte Aéreo ---");
        factoryAereo.exibirInformacoes(30.0);

        System.out.println("\n--- Transporte Marítimo ---");
        factoryMaritimo.exibirInformacoes(7.0);

        System.out.println("\n=== USO DIRETO DOS TRANSPORTES ===");
        iTransporte terrestre = factoryTerrestre.criarTransporte();
        iTransporte aereo = factoryAereo.criarTransporte();

        System.out.println("Tarifa terrestre para 200km: R$ " +
                String.format("%.2f", terrestre.calcularTarifa(200.0)));
        System.out.println("Tarifa aérea para 50kg: R$ " +
                String.format("%.2f", aereo.calcularTarifa(50.0)));
    }
}