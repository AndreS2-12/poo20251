package Clase8;
public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args) {
        
        //Creacion de los objetos para validar el modelo
        Cuenta objCuenta1 = new Cuenta (10200346, "Ahorros", 2000.0);
        Cuenta obCuenta2 = new Cuenta (2525002, "Corriente", 5000.0 );
        
        Cliente objCliente1= new Cliente(1143183953, "Andrés");
        Cliente objCliente2= new Cliente(100720480, "Sofia Gutierrez");

        Banco objBanco1= new Banco("Bancamalo", "cll 5 # 3-10", objCuenta1);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
        //Banco objBanco2= new Banco("Bva", "cll 5 # 3-10", objCuenta2);
    }
}
