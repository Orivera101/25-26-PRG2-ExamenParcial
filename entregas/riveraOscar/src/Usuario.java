class Usuario {
    private String nombre;
    private String DNI;
    private String direccion;
    private Cuenta[] cuentas;

    public Usuario(String nombre, String DNI, String direccion){}
    public Usuario(String nombre, String DNI, String direccion, Cuenta[] cuentas){}
    public Usuario(String DNI){}
    public Usuario(){}

    public void asignarCuenta(Cuenta cuenta){}
    public Usuario clonarUsuario(){}
    public void mostrarUsuario(){}
    public void modificarUsuario(String nombre, String DNI, String direccion){}
    public Cuenta[] mostrarCuentasUsuario(){}
    public Cuenta mostrarUnaCuenta(int numeroCuenta){}
}
