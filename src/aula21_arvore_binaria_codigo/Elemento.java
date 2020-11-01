
package aula21_arvore_binaria_codigo;

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;
    
    public Elemento(TIPO novoValor){
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento<TIPO> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }
    
    
}
