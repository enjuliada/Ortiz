//  V.O - O QUE O CARRO É E O QUE O CARRO FAZ 

public class Carros {

    //Atributos da classe
    private String modelo;
    private int velMaxima;
    private float potencia, distancia, velAtual;

    //Metodo Construtor
    public Carros(String tmpModelo, int tmpVelMaxima, float tmpPotencia) { //essas não são privates
        this.modelo = tmpModelo;  // Atributo primário dessa classe
        this.velMaxima = tmpVelMaxima;
        this.potencia = tmpPotencia;
        this.distancia = 0;
        this.velAtual = 0;
    }

    //Metodo Funcional
    public void parar() { //não retorna valor, por isso void
        this.velAtual = 0;
    }

    public float acelerar(int tmpAcel) { // COLOCA O TIPO de atributo que ele retorna, Quer uma info em troca, retorna um valor, quer a velocidade que voce parou

        if ((this.velAtual + tmpAcel) <= this.velMaxima) {
            this.velAtual += tmpAcel;
        } else {
            this.velAtual = this.velMaxima;
        }

        this.distancia += this.velAtual * this.potencia;
        return this.velAtual;
    }
    
    public String verModelo(){
        return this.modelo;
    }
    
    public float verDistancia(){
        return this.distancia;
    }
    
   

}

 

