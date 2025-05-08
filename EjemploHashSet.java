import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();


        emails.add("ana@example.com");
        emails.add("juan@example.com");
        emails.add("ana@example.com");


        System.out.println("Correos registrados:");
        for (String email : emails) {
            System.out.println(email);
        }


        String nuevoCorreo = "ana@example.com";
        if (emails.contains(nuevoCorreo)) {
            System.out.println(nuevoCorreo + " ya está registrado.");
        } else {
            emails.add(nuevoCorreo);
        }
    }
}
