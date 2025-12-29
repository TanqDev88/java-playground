public class test {
    public static void main(String[] args) {
        final double IVA = 0.21;
        String nombre = "Pepe";
        System.out.println("Que Ala te acompañe " + nombre + "no te olvides del " + IVA);

        int a = 100;
        int b = 100;

        if(a<b){
            System.out.println("B es mayor que A");
        }else if(a>b){
            System.out.println("A es mayor que B");
        }
        else {
            System.out.println("A es igual a B");
        }
        String dia = "Domingol";
        switch (dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Dia habil");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("No laborable");
                break;
            default:
                System.out.println("No es un dia");

                System.out.println("Se autocompleta el logueo");
        }
    }
}


