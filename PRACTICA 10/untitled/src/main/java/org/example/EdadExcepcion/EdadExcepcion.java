package org.example.EdadExcepcion;

public class EdadExcepcion extends Exception {


    public EdadExcepcion(){}
    public EdadExcepcion(String mensaje){
        super(mensaje);
    }

    public void validarEdad(int edad) throws EdadExcepcion { // se declra que el metodo para a tirar una exceocion de EdadExceptopnm
        if(!(edad>17)){
            throw new EdadExcepcion("ES MENOR DE EDAD");
            //UTILIZMAOS CONSTRUCTOR PARA DEFINIR EL MENSAJE, GENERAMOS UNA EXCEPCION QUE SE ATIENDE CON UN TRY / CATCH

        }
    }

}
