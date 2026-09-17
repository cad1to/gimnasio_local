public class MembresiaPremium extends Membresia{

    private Integer pasesInvitados;

    public MembresiaPremium (Integer idMiembro, String nombreUsuario, Integer pasesInvitados) {
        super (idMiembro, nombreUsuario);
        this.pasesInvitados = pasesInvitados;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Usuatrio premium \n" +
                "¡Bienvenido!\n");
        return true;
    }

    public boolean ingresarConInvitado() {
        if (pasesInvitados > 0) {
            pasesInvitados--;
            System.out.println("¡Bienvenidos pueden pasar!\n" +
                    "Pases de invitados restantes: " + pasesInvitados + "\n");
            return true;
        } else {
            System.out.println("Sin pases de invitados restantes\n");
            return false;
        }
    }

}
