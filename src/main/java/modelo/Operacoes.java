package modelo;

public class Operacoes {
    private double valorA;
    private double ValorB;
    
    public Operacoes(){
        this(0.0,0.0);
    }

    public Operacoes(double valorA, double valorB) {
        this.valorA = valorA;
        this.ValorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double valorB) {
        this.ValorB = valorB;
    }
    
    public double getSoma(){
        return valorA + ValorB;
    }
    
    public double getDiferenca(){
        return valorA - ValorB;
    }
    
    public double getProduto(){
        return valorA * ValorB;
    }
    
    public double getQuociente(){
        return valorA / ValorB;
    }
}
