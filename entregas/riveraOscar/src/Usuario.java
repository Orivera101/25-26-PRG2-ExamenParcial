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

    public void asignarCuenta(Cuenta cuenta){}
    public Usuario clonarUsuario(){}
    public void mostrarUsuario(){}
    public void modificarUsuario(String nombre, String DNI, String direccion){}
    public Cuenta[] mostrarCuentasUsuario(){}
    public Cuenta mostrarUnaCuenta(int numeroCuenta){}
}
