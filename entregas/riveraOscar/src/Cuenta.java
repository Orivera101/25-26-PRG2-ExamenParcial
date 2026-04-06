class Cuenta{
    private String IBAN;
    private double saldo;
    private String tipo;

    public Cuenta(String IBAN, double saldo, String tipo){
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public Cuenta(String IBAN){
        this(IBAN, 0.0, "Estandar")
    }
    public Cuenta(){
        this("ES91 0000 0000 0000 0000", 0.0, "Estandar")
    }

    public void modificarCuenta(String IBAN, double saldo, String tipo){}
    public void mostrarCuenta(){}
    public Cuenta clonarCuenta(){}
    public void ingresar(double monto){}
    public void retirar(double monto){}
    public void transferir(double monto, Cuenta cuenta){}
    public double consultarSaldo(){}
    public void consultarMovimientos(){}
}