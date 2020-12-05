import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Classe LinkedList
class LinkL extends LinkedList {}

// Classe ArrayList
class ArrL extends ArrayList {}

class BunClaireJohnstonJacobDevoir2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkL linkL = new LinkL();
        ArrL arrL;
        int nElement;
        long startTime, endTime, duration;

        //#1
        System.out.println("Entrer le nombre d'éléments de votre liste");
        String element = scanner.nextLine();
        System.out.println("Entree utilisateur: " + element);
        if(element.isEmpty() || element == ""){
            nElement = 1000;
        }
        else {
            nElement = Integer.parseInt(element);
        }

        //#2
        // creer la liste selon le N que l'utisateur a entre
        for(int i = 0; i< nElement ; i ++) {
            linkL.add(i);
        }


        //#3&4
        // Supprimer le premier element
        startTime = System.nanoTime();
        for(int i = 0; i<nElement; i++) {
            linkL.removeFirst();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String linkListDuree = "Suppression des éléments de LinkL avec la méthode removeFirst() de LinkedList, avec une durée duréeLinkedList";
        System.out.println(String.format(linkListDuree + " = %s ", duration + " nanosecondes"));

        //#5
        // creation de l'instance de arrL de linkL
        arrL = new ArrL();
        for(int i = 0; i<nElement; i++) {
            arrL.add(i);
        }

        //#6
        // supprimer
        startTime = System.nanoTime();
        for(int i = 0; i < nElement; i++) {
            arrL.remove(0);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String arrLDureeDirecte = "Suppression des éléments de ArrL avec remove(0) d’un ArrayList, durée duréeArrayDirect = ";
        System.out.println(String.format(arrLDureeDirecte + " %s ", duration + " nanosecondes"));

        //#7
        // ArrayList inverse
        for(int i = 0; i<nElement; i++) {
            arrL.add(i);
        }
        for(int i = nElement -1; i > 0; i--)
        {
            arrL.remove(i);
        }
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String arrLDureeInverse = "Suppression des éléments de ArrL avec remove(i) ciblant les derniers éléments d’un ArrayList, avec une durée de duréeArrayInverse = ";
        System.out.println(String.format(arrLDureeInverse + " %s ", duration + " nanosecondes"));
    }
}
