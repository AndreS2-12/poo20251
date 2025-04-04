package Clase8;
public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args) {
        
        Cuenta[] c = new Cuenta[2]; //Creación de una estructura de arreglos para la cuenta
        c[0]= new Cuenta (10200346, "Ahorros", 2000.0);
        c[1]= new Cuenta (2525002, "Corriente", 5000.0 );
        /*
        //Creacion de los objetos para validar el modelo
        Cuenta objCuenta1 = new Cuenta (10200346, "Ahorros", 2000.0);
        Cuenta obCuenta2 = new Cuenta (2525002, "Corriente", 5000.0 );
         */
        Cliente1 objCliente1= new Cliente1(1143183953, "Andrés");
        Cliente1 objCliente2= new Cliente1(100720480, "Sofia Gutierrez");

        Banco objBanco1= new Banco("Bancamalo", "cll 5 # 3-10", c);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
        //Banco objBanco2= new Banco("Bva", "cll 5 # 3-10", objCuenta2);
    }
}
