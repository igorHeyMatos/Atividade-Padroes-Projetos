import java.util.HashMap;
import java.util.Map;

public class SiteNoticias {
    private Map<String, Assunto> topicos = new HashMap();

    public void publicarNoticia(String topico, String noticia) {
        Assunto assuntoTopico = topicos.get(topico);
        if (assuntoTopico != null) {
            assuntoTopico.setNoticia(noticia);
        }
    }

    public void criarTopico(String nomeTopico) {
        topicos.put(nomeTopico, new Assunto(nomeTopico));
    }

    public void inscreverLeitor(String topico, Leitor leitor) {
        Assunto assuntoTopico = topicos.get(topico);
        if (assuntoTopico != null) {
            leitor.inscreverLeitor(assuntoTopico);
        }
    }

}