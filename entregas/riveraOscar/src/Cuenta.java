class Cuenta{
    public Cuenta(String IBAN, double saldo, String tipo){}
    public Cuenta(String IBAN){}
    public Cuenta(){}

    public void modificarCuenta(String IBAN, double saldo, String tipo){}
    public void mostrarCuenta(){}
    public Cuenta clonarCuenta(){}
    public void ingresar(double monto){}
    public void retirar(double monto){}
    public void transferir(double monto, Cuenta cuenta){}
    public double consultarSaldo(){}
    public void consultarMovimientos(){}
}