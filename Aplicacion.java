
public class Aplicacion{
    public static void main( String args[] ){
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setCuenta( "00001" );
        cuenta1.setSaldoCuenta( 5000.25 );
        cuenta1.setSaldoAhorro( 300.25 );


        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.setCuenta( "00002" );
        cuenta2.setSaldoCuenta( 3000.45 );
        cuenta2.setSaldoAhorro( 200.25 );


        CuentaBancaria cuenta3 = new CuentaBancaria();
        cuenta3.setCuenta( "00003" );
        cuenta3.setSaldoCuenta( 500.25 );
        cuenta3.setSaldoAhorro( 100.25 );


        CuentaBancaria cuenta4 = new CuentaBancaria();
        cuenta4.setCuenta( "00004" );
        cuenta4.setSaldoCuenta( 2000.402 );
        cuenta4.setSaldoAhorro( 150.25 );


        CuentaBancaria cuenta5 = new CuentaBancaria();
        cuenta5.setCuenta( "00005" );
        cuenta5.setSaldoCuenta( 300.2556 );
        cuenta5.setSaldoAhorro( 10.25 );


        System.out.println( cuenta1.toString() );
        System.out.println( cuenta2.toString() );
        System.out.println( cuenta3.toString() );
        System.out.println( cuenta4.toString() );
        System.out.println( cuenta5.toString() );
        System.out.println("\n----- Cantidad total de Dinero que posee el banco -----");
        System.out.println( CuentaBancaria.cantidadTotal() );
        System.out.println("\n----- Cantidad de usuario que tiene el banco  -----");
        System.out.println( CuentaBancaria.contadorDeCuentas() );
        System.out.println("\n---------------------------------------------------");
        cuenta1.depositarSaldoAhorro(500);
        System.out.println( cuenta1.toString());
        cuenta2.retirarSaldoAhorro(600);
        System.out.println( cuenta2.toString());
    }
}