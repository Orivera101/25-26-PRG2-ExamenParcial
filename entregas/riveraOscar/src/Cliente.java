public class Cliente {
    public static void main(String[] args){
        Usuario AnaG = new Usuario("Ana Gomez", "DNI12345678A", "Madrid");
        Usuario JuanP = new Usuario("Juan Perez", "DNI87654321B", "Barcelona");
        
        Cuenta cuenta1 = new Cuenta("ES91 1234 5678 9012 3456", 5000.0, "Nominal");
        Cuenta cuenta2 = new Cuenta("ES91 9876 5432 1098 7654", 3000.0, "Estandar");
        Cuenta cuenta3 = new Cuenta("ES91 5555 6666 7777 8888", 10000.0, "Premium");

        AnaG.asignarCuenta(cuenta1);
        AnaG.asignarCuenta(cuenta3);
        JuanP.asignarCuenta(cuenta2);

        cuenta1.ingresar(1000.0);
        cuenta2.retirar(200.0);
        cuenta3.transferir(500.0, cuenta1);
        cuenta2.consultarSaldo();
        cuenta1.consultarMovimientos();
    }
}