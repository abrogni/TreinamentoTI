package treinamentoti;
import java.util.ArrayList;

public class Participante {

    private String nome;
    private String sobrenome;
    private int id;
    private static int cont = 0;
    
    private static ArrayList<Participante> participantes = new ArrayList();
    
    public static void adicionaParticipante(Participante participante){
        //adiciona o participante no Array
        cont++;
        participante.setId(cont);   
        participantes.add(participante);        
        participante.getNome();
        participante.getSobrenome();
             
    }
    
    //getters e setters
    public static ArrayList<Participante> getParticipante(){
        return participantes;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
}
