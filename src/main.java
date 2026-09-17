import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        ArrayList <Membresia> membresiaArrayList = new ArrayList<>();
        membresiaArrayList.add (new MembresiaBasica(1,"Diego", 0));
        membresiaArrayList.add(new MembresiaPremium(2, "Rosario", 0));

        for (Membresia x : membresiaArrayList) {
            x.mostrarDatos();
            System.out.println("Verificando Acceso");
            x.verificarAcceso();
            if ( x instanceof MembresiaPremium membresiaPremium){
                System.out.println("Verificando si puede ingresar con invitado");
                membresiaPremium.ingresarConInvitado();
            }
        }
    }
}

