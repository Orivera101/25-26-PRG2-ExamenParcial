class Usuario {
    private String nombre;
    private String DNI;
    private String direccion;
    private Cuenta[] cuentas;

    public Usuario(String nombre, String DNI, String direccion){
        this(nombre, DNI, direccion, new Cuenta[10]);
    }
    public Usuario(String nombre, String DNI, String direccion, Cuenta[] cuentas){
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.cuentas = cuentas;
    }
    public Usuario(String DNI){
        this("Sin nombre", DNI, "Sin direccion");
    }
    public Usuario(){
        this("DNI00000000");
    }

    public void asignarCuenta(Cuenta cuenta){
        for (int i = 0; i < this.cuentas.length; i++) {
            if (this.cuentas[i] == null) {
                this.cuentas[i] = cuenta;
                break;
            }
        }
    }
    public Usuario clonarUsuario(){
        return new Usuario(this.nombre, this.DNI, this.direccion, this.cuentas);
    }
    public void mostrarUsuario(){
        System.out.println("DNI: " + DNI + "\nNombre: " + nombre + "\nDirección: " + direccion);
    }
    public void modificarUsuario(String nombre, String DNI, String direccion){
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
    }
    public Cuenta[] mostrarCuentasUsuario(){
        return this.cuentas;
    }
    public Cuenta mostrarUnaCuenta(int numeroCuenta){
        return this.cuentas[numeroCuenta];
    }
}
