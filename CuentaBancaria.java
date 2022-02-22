
public class CuentaBancaria{
    private String cuenta;
    private double saldoCuenta;
    private double saldoAhorro;
    private static double contadorDeCuentas;
    private static double cantidadTotal;

    public CuentaBancaria(){
        this.cuenta = "N/A";
        this.saldoCuenta = 0;
        this.saldoAhorro = 0;
        contadorDeCuentas++;
    }

    public static double contadorDeCuentas() {
        return contadorDeCuentas;
    }

    public static double cantidadTotal() {
        return cantidadTotal;
    }


    public String getCuenta(){
        return this.cuenta;
    }

    public double getSaldoCuenta(){
        return this.saldoCuenta;
    }

    public double getSaldoAhorro(){
        return this.saldoAhorro;
    }

    public void setCuenta( String cuenta){
        this.cuenta = cuenta;
    }

    public void setSaldoCuenta( double saldoCuenta){
        cantidadTotal += saldoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public void setSaldoAhorro( double saldoAhorro ){
        cantidadTotal += saldoAhorro;
        this.saldoAhorro = saldoAhorro;
    }

    public void depositarSaldoCuenta( double saldoCuenta ){
        if(saldoCuenta > 0 ){
            this.saldoCuenta += saldoCuenta;
            cantidadTotal += saldoCuenta;
        }
    }
    public void depositarSaldoAhorro( double saldoAhorro ){
        if(saldoCuenta > 0 ){
            this.saldoAhorro += saldoAhorro;
            cantidadTotal += saldoAhorro;
        }
    }

    public void retirarSaldoCuenta( double saldoCuenta ){
        if(saldoCuenta > 0 && saldoCuenta < this.saldoCuenta ){
            this.saldoCuenta -= saldoCuenta;
            cantidadTotal -= saldoCuenta;
        }
        else{
            System.out.println("No se tienen los fondos suficientes");
        }
    }
    public void retirarSaldoAhorro( double saldoAhorro ){
        if(saldoCuenta > 0 && saldoAhorro < this.saldoAhorro ){
            this.saldoAhorro -= saldoAhorro;
            cantidadTotal -= saldoAhorro;
        }
        else{
            System.out.println("No se tienen los fondos suficientes");
        }
    }


    public String toString(){
        return "Cuenta: " + getCuenta() + "\n" +
               "Saldo: " + getSaldoCuenta() + "\n"+
               "Ahorro:" + getSaldoAhorro() + "\n";
    }

    

   
   
    
    
    


}


