public abstract class  Membresia {

    protected Integer idMiembro;
    protected String nombreUsuario;

    public Membresia (Integer idMiembro, String nombreUsuario) {
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    abstract public boolean verificarAcceso();

    public void mostrarDatos(){
        System.out.println("Id: " + idMiembro);
        System.out.println("Nombre: " + nombreUsuario + "\n");
    }

}
