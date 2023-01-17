    /**
    * @Autor: Marcos Diaz y Diego Soto
      @Date: 11-11-2022
    * Clase principal donde el usuario interactua con el programa
    */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        radio radio = new radio();
        boolean salir = false;
        boolean salir1 = false;
        boolean salirfp = false;
        int op = 0;
        int op1 = 0;
        int opmr = 0;
        int volumen = 0;
        double emi = 100.50;
       
        /**
         * Menu con todas las opciones que el usuario puede escoger
         */

        while(!salir){
            try{
                System.out.println("Desea encender la radio?");
                System.out.println("1. Si \n2. No\n");
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch(op1){
                    case 1: {
                        while(!salir1){
                            // Menu principal del programa;
                            System.out.println(" Bienvenido a la radio, a continuacion se te presentan las siguientes opciones:\n");
                            System.out.println("1. Cambiar Volumen");
                            System.out.println("2. Modo Radio");
                            System.out.println("3. Modo Reproduccion");
                            System.out.println("4. Modo Telefono");
                            System.out.println("5. Modo productividad");
                            System.out.println("6. Salir");
                            System.out.println("Porfavor elije una opcion:");
                            op = Integer.parseInt(teclado.nextLine());
            
                            switch(op){

                                // Opcion para subir o bajar el volumen de la radio
                                case 1:{ 
                                    radio.cambiarVolumen(volumen);      
                                break;
                                }
                                
                                case 2: {
                                    boolean salirmr = false;
                                    while(!salirmr){
                                        // Menu de opciones cuando se selecciona el modo radio
                                        System.out.println("1. Cambiar de FM a AM o viceversa");
                                        System.out.println("2. Cambiar de emisora");
                                        System.out.println("3. Guardar emisora");
                                        System.out.println("4. Cargar emisora");
                                        System.out.println("5. Salir");
                                        opmr = Integer.parseInt(teclado.nextLine());
                                        switch (opmr) {
                                            // Opcion de cambiar de FM a AM y viceversa
                                            case 1:{
                                                radio.cambiarFMAM();
                                                break;
                                            }

                                            // Opcion para cambiar de emisora
                                            case 2:{
                                                radio.cambiarEmisora(emi);
                                                break;
                                            }

                                            // Opcion para guardar una emisora
                                            case 3:{
                                                radio.guardarEmisora();
                                                break;
                                            }

                                            // Opcion para cargar una emisora de las que ya estaban guardadas
                                            case 4:{
                                                radio.cargarEmisora();
                                                break;
                                            }

                                            // Opcion para salir
                                            case 5:{
                                                salirmr = true;
                                                break;
                                            }
                                        
                                            // Metodo que hace si el usuario llega a confundirse
                                            default:{
                                                System.out.println("Opcion no existente");
                                                break;
                                            }
                                        }

                                    }
                                    break;
                                }
    
                                case 3: {
                                    boolean salir2 = false;
                                    while(!salir2){
                                        // Menu de opciones para cuando la radio esta en modo reproduccion
                                        System.out.println("\n1. Seleccionar Lista \n2. Cambiar cancion \n3. Eschuchar cancion \n4. Salir");
                                        int op2 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op2){
                                            // Opcion para escoger una lista de reproduccion
                                            case 1: {
                                                System.out.println(radio.desplegar());
                                                System.out.println("Escoga una lista de reproduccion");
                                                int xd = teclado.nextInt();
                                                teclado.nextLine();
                                                System.out.println(radio.seleccionarLista(xd));
                                                break;
                                            }

                                            // Opcion para cambiar una cancion
                                            case 2: {
                                                System.out.println(radio.cambiarCancion());
                                                break;
                                            }

                                            // Opcion para escuchar una cancion, mostrando su respectiva informacion
                                            case 3: {
                                                System.out.println(radio.escucharCancion());
                                                break;
                                            }

                                            // Opcion para salir
                                            case 4: {
                                                salir2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                
                                case 4: {
                                    boolean salir3 = false;
                                    while(!salir3){
                                        // Menu de opciones para cuando la radio esta en modo telefono
                                        System.out.println("\n1. Conectar/Desconectar telefono \n2. Mostrar contactos \n3. Llamar contacto \n4. Cambiar a speaker o auriculares \n5. Salir");
                                        int op3 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op3){
                                            // Opcion para conectar y desconectar un telefono
                                            case 1: {
                                                if (radio.ConectDesconectTelefono()){
                                                    System.out.println("Desconectando telefono...");
                                                }
                                                else{
                                                    System.out.println("Conectando telefono...");
                                                }
                                                break;
                                            }

                                            // Opcion que muestra los contactos del telefono conectado
                                            case 2: {
                                                System.out.println(radio.MostrarContactos());
                                                break;
                                            }

                                            // Opcion para llamar a un contacto del telefono conectado
                                            case 3: {
                                                System.out.println(radio.MostrarContactos());
                                                System.out.println("Ingrese el numero de telefono de su contacto");
                                                String numero = teclado.nextLine();
                                                System.out.println(radio.llamarContactos(numero));
                                                System.out.println("\n1. Finalizar llamada");
                                                System.out.println("Seleccione una opcion");
                                                int op5 = teclado.nextInt();
                                                System.out.println(radio.FinalizarLlamada());
                                                break;
                                            }

                                            //Opcion para cambiar de speaker a auriculares y viceversa
                                            case 4: {
                                                if (radio.CambiarSpeaker()){
                                                    System.out.println("Cambiando a auriculares...");
                                                }
                                                else{
                                                    System.out.println("Cambiando a speaker...");
                                                }
                                                break;
                                            }

                                            // Opcion para salir
                                            case 5: {
                                                salir3 = true;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
    
                                case 5: {
                                    boolean salir4 = false;
                                    while(!salir4){
                                        // Menu de opciones para cuando la radio esta en modo planificacion
                                        System.out.println("\n1. Planificar Viaje \n2. Salir");
                                        System.out.println("Seleccione una opcion");
                                        int op4 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op4){
                                            // Opcion que planifica viajes
                                            case 1: {
                                                System.out.println("Ingrese su destino: ");
                                                String destino = teclado.nextLine();
                                                System.out.println(radio.PlanificarViajes(destino));
                                                break;
                                            }

                                            // Opcion para salir
                                            case 2: {
                                                salir4 = true;
                                            }

                                        }
                                    }
                                    break;
                                }
    
                                // Opcion para salir del menu principal
                                case 6: {
                                    salir1 = true;
                                    break;
                                }
                                
                                // Metodo que se utiliza por si se ingresa una opcion no existente
                                default: {
                                    System.out.println("Ingrese una opcion entre 1 a 6");
                                    break;
                                }

                            }
                        }
                    }
                    // Opcion por si la radio decide ser apagada
                    case 2:{
                        System.out.println("Estado de la radio: apagada");
                        salir = true;
                    }
                }
            }catch(Exception e){
            // TODO: handle exception
                System.out.println(" La entrada es incorrecta/la opcion no existe, porfavor verifica lo que ingresaste");
            }
        }   
    }
}