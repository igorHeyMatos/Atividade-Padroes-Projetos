import java.util.ArrayList;
import java.util.List;

public class Assunto {
    private String nomeTopico;
    private String ultimaNoticia;
    private List<ObservadorAbstrato> observadores = new ArrayList<>();

    public Assunto(String nomeTopico){
        this.nomeTopico = nomeTopico;
    }

    private void notificarObservadores(){
        for(ObservadorAbstrato o : this.observadores){
            o.atualizar();
        }
    }

    public void setNoticia(String noticia){
        this.ultimaNoticia = noticia;
        this.notificarObservadores();
    }

    public void anexar(ObservadorAbstrato o){
        this.observadores.add(o);
    }

    public String getNomeTopico(){
        return nomeTopico;
    }

    public String getUltimaNoticia(){
        return ultimaNoticia;
    }
}
