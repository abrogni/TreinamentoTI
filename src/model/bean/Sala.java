package model.bean;
import java.util.ArrayList;

public class Sala {
    private String nomeSala;
    private int lotacao;
    
    private static ArrayList<Sala> salas = new ArrayList();
    
    public static void adicionaSala(Sala sala){
        salas.add(sala);
        sala.getNomeSala();
        sala.getLotacao();
    }

    public static ArrayList<Sala> getSala(){
        return salas;
    }
    
    public String getNomeSala() {
        return nomeSala;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
}
