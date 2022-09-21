package testandoobjetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    Boolean tampada;
    void scanner(){
        System.out.println("Essa primeira caneta é do modelo " + this.modelo);
        System.out.println("Sua cor é: " + this.cor);
        System.out.println("Com um ponta de: " + this.ponta);
        System.out.println("Ela tem " + this.carga + " porcento de tinta");
        System.out.println("A afirmação de que ela está tampada é: " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não é possivel rabiscar");
        }else{
            System.out.println("Consigo rabiscar!");
        }
    }

    void destampar(){
        this.tampada = false;
    }

    void tampar(){
        this.tampada = true;
    }
}
