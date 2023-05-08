/**
 * Clase principal 
 * @author F javier Mendez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        
        miCuenta = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        try 
        {
            miCuenta.retirar(2300);
        } catch (Exception e)
        {
            System.out.println("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(100.0);
        } catch (Exception e)
        {
            System.out.println("Fallo al ingresar");
        }
                 
        saldoActual = miCuenta.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
        
     
        
    }

}
