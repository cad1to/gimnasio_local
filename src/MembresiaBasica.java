public class MembresiaBasica extends Membresia {

    private Integer visitasRestantes;

    public MembresiaBasica(Integer idMiembro, String nombreUsuario, Integer visitasRestantes){
        super (idMiembro,nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }


    @Override
    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            visitasRestantes--;
            System.out.println("¡Bienvenido!\n" +
                    "Visitas restantes: " + visitasRestantes + "\n");
            return true;
        } else {
            System.out.println("Acceso denegado\n" +
                    "Sin visitas restantes \n");
            return false;
        }
    }
}
