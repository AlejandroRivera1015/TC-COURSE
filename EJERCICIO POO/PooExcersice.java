/*
* ejercicio POO, numero primo
* */



import java.util.Scanner; // importar clase Scanner


public class PooExcersice { //declaración de clase

    private int  number; //declaración de variable
    public PooExcersice(){ //Constructor vacio
    }

    public void setNumber(int number){ //setter
        this.number = number;
    }

    public static void main(String[] args){ // main
        boolean flag = false; //variable de cotrol

        Scanner entrada = new Scanner (System.in); //declaración de scanner
        PooExcersice obj = new PooExcersice(); //Declaración de instacia de objeto

        System.out.println("Ingrese Número"); //solicitud de número
        obj.setNumber(entrada.nextInt()); // seteo de number

        for (int i = 2; i<obj.number; i++){ // comprobación
            if(obj.number % i == 0) // si algún residuo es cero, es par
                flag = true;
        }

        if(!flag)
            System.out.println("es primo");
        else
            System.out.println("no es primo");



    }
}

