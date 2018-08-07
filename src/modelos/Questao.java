
package modelos;

import java.util.ArrayList;
import java.util.List;


public class Questao {
    
    private String enunciado;
    
    private List<String> respostas = new ArrayList<>();
    
    private int respostaCerta;

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }

    public int getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(int respostaCerta) {
        this.respostaCerta = respostaCerta;
    }
    
    
    
}
