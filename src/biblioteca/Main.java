import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();
        List<Usuari> usuaris = new java.util.ArrayList<>();

        int opcio;

        do {
            System.out.println("\n=== MENÚ DE GESTIÓ DE BIBLIOTECA ===");
            System.out.println("1. Afegir llibre");
            System.out.println("2. Afegir usuari");
            System.out.println("3. Prestar llibre");
            System.out.println("4. Llistar llibres");
            System.out.println("5. Llistar usuaris");
            System.out.println("6. Cercar llibre");
            System.out.println("7. Cercar usuari");
            System.out.println("0. Sortir");
            System.out.print("Tria una opció: ");
            opcio = Integer.parseInt(scanner.nextLine());

            switch (opcio) {
                case 1 -> {
                    System.out.print("Títol del llibre: ");
                    String titol = scanner.nextLine();
                    System.out.print("Autor del llibre: ");
                    String autor = scanner.nextLine();
                    biblioteca.afegirLlibre(new Llibre(titol, autor));
                    System.out.println("Llibre afegit.");
                }

                case 2 -> {
                    System.out.print("Nom de l'usuari: ");
                    String nom = scanner.nextLine();
                    usuaris.add(new Usuari(nom));
                    System.out.println("Usuari afegit.");
                }

                case 3 -> {
                    System.out.print("Nom de l'usuari: ");
                    String nomUsuari = scanner.nextLine();
                    Usuari usuari = trobarUsuari(usuaris, nomUsuari);

                    if (usuari == null) {
                        System.out.println("Usuari no trobat.");
                        break;
                    }

                    System.out.print("Títol del llibre: ");
                    String titolLlibre = scanner.nextLine();
                    Llibre llibre = biblioteca.buscarLlibre(titolLlibre);

                    if (llibre == null) {
                        System.out.println("Llibre no trobat.");
                        break;
                    }

                    gestor.prestarLlibre(usuari, llibre);
                }

                case 4 -> {
                    System.out.println("Llibres a la biblioteca:");
                    for (Llibre l : biblioteca.getLlibres()) {
                        System.out.println("• " + l);
                    }
                }

                case 5 -> {
                    System.out.println("Usuaris registrats:");
                    for (Usuari u : usuaris) {
                        System.out.println("• " + u.getNom());
                    }
                }

                case 6 -> {
                    System.out.print("Títol del llibre a cercar: ");
                    String titol = scanner.nextLine();
                    Llibre llibre = biblioteca.buscarLlibre(titol);
                    if (llibre != null) {
                        System.out.println("Llibre trobat: " + llibre);
                    } else {
                        System.out.println("Llibre no trobat.");
                    }
                }

                case 7 -> {
                    System.out.print("Nom de l'usuari a cercar: ");
                    String nom = scanner.nextLine();
                    Usuari usuari = trobarUsuari(usuaris, nom);
                    if (usuari != null) {
                        System.out.println("Usuari trobat: " + usuari.getNom());
                    } else {
                        System.out.println("Usuari no trobat.");
                    }
                }

                case 0 -> System.out.println("Sortint del programa...");

                default -> System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);

        scanner.close();
    }

    // Metode auxiliar per trobar un usuari pel nom
    private static Usuari trobarUsuari(List<Usuari> usuaris, String nom) {
        for (Usuari u : usuaris) {
            if (u.getNom().equalsIgnoreCase(nom)) {
                return u;
            }
        }
        return null;
    }
}
