class Cuenta{
    private String IBAN;
    private double saldo;
    private String tipo;
    private String historial = "";

    public Cuenta(String IBAN, double saldo, String tipo){
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.tipo = tipo;
        this.historial = this.historial + "Cuenta creada con saldo: " + saldo + "€\n";
    }
    public Cuenta(String IBAN){
        this(IBAN, 0.0, "Estandar");
    }
    public Cuenta(){
        this("ES91 0000 0000 0000 0000", 0.0, "Estandar");
    }

    public void modificarCuenta(String IBAN, double saldo, String tipo){
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public void mostrarCuenta(){
        System.out.println("IBAN: " + IBAN + "\nSaldo: " + saldo + "\nTipo: " + tipo);
    }
    public Cuenta clonarCuenta(){
        return new Cuenta(this.IBAN, this.saldo, this.tipo);
    }
    public void ingresar(double monto){
        saldo = saldo + monto;
        this.historial = this.historial + "Ingreso: +" + monto + "€\n";
    }
    public void retirar(double monto){
        if (saldo >= monto) {
            saldo = saldo - monto;
            this.historial = this.historial + "Retiro: -" + monto + "€\n";
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void transferir(double monto, Cuenta cuenta){
        if (saldo >= monto) {
            retirar(monto);
            cuenta.ingresar(monto);
            this.historial += "Transferencia enviada: -" + monto + "€ a " + cuenta.IBAN + "\n";
        }
    }
    public double consultarSaldo(){
        System.out.println("La cuenta " + IBAN + " cuenta con un saldo de " + saldo + "€.");
        return saldo;
    }
    public void consultarMovimientos(){
        System.out.println("--- Movimientos de la cuenta " + IBAN + " ---");
        System.out.println(historial);
    }
}