public class Leitor extends ObservadorAbstrato {
    private String nomeLeitor;

    public Leitor(String nome){
        this.nomeLeitor = nome;
    }

    public void inscreverLeitor(Assunto topico){
        this.observado = topico;
        this.observado.anexar(this);
    }

    @Override
    public void atualizar(){
        System.out.println(nomeLeitor + " | Nova Notícia em: " + observado.getNomeTopico() + " - " + observado.getUltimaNoticia());
    }

    public String getNomeLeitor(){
        return nomeLeitor;
    }
}
