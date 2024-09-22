
public class PooExcersiceV2 {

    private int  number; //declaración de variable

    public PooExcersiceV2(){}
    public boolean isPrimo(int number){
        boolean flag = false;
        this.number=number;
        for (int i = 2; i<this.number; i++){ // comprobación
            if(this.number % i == 0) // si algún residuo es cero, es par
                flag = true;
        }

        return flag;
    }

    public static void main(String[] args){
        PooExcersice obj = new PooExcersice(); //Declaración de instacia de objeto

    }
}
