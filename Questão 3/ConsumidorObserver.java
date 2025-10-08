public class ConsumidorObserver {

    // Utilizei o Observer pois toda vez que uma nova notícia é publicada, ocorre a
    // mudança do estado dela para uma nova notícia e com isso os leitores inscritos
    // vão receber uma notificação.
    public static void main(String[] args) {
        SiteNoticias siteDeNoticias = new SiteNoticias();

        siteDeNoticias.criarTopico("Política");
        siteDeNoticias.criarTopico("Esportes");
        siteDeNoticias.criarTopico("Tecnologia");

        Leitor leitor01 = new Leitor("Igor Matos");
        Leitor leitor02 = new Leitor("Leitor Teste 2");

        siteDeNoticias.inscreverLeitor("Política", leitor01);
        siteDeNoticias.inscreverLeitor("Esportes", leitor02);

        siteDeNoticias.publicarNoticia("Política", "Exemplo de notícia de política...");
        System.err.println();

        siteDeNoticias.publicarNoticia("Esportes", "Exemplo de notícia de esportes...");
        System.out.println();
    }
}
