import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Classe LinkedList
class LinkL extends LinkedList {}

// Classe ArrayList
class ArrL extends ArrayList {}

class ArrayListMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkL linkL = new LinkL();
        ArrL arrL;
        int nElement;
        long startTime, endTime, duration;

        System.out.println("Entrer le nombre d'éléments de votre liste");
        String element = scanner.nextLine();
        System.out.println("Entree utilisateur: " + element);
        if(element.isEmpty() || element == ""){
            nElement = 1000;
        }
        else {
            nElement = Integer.parseInt(element);
        }

        // creer la liste selon le N que l'utisateur a entre
        for(int i = 0; i< nElement ; i ++) {
            linkL.add(i);
            System.out.println( "Element linkedlist = " + i);
        }

        // afficher les elements
        System.out.println("Liste : ");
        for(int i = 0; i< linkL.size(); i++) {
            System.out.println(i + " = " + linkL.get(i));
        }
        // Supprimer le premier element
        startTime = System.nanoTime();
        System.out.println("Element to be removed: " + linkL.removeFirst());
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String linkListDuree = "Suppression des éléments de LinkL avec la méthode removeFirst() de LinkedList, avec une durée duréeLinkedList";
        System.out.println(String.format(linkListDuree + " = %s ", duration + " nanosecondes"));
        // afficher les nouveaux elements
        System.out.println("Nouvelle liste : ");
        for(int i = 0; i< linkL.size(); i++) {
            System.out.println(i + " = " + linkL.get(i));
        }
        System.out.println("Size nouvelle liste: " + linkL.size());

        // creation de l'instance de arrL de linkL
        arrL = new ArrL();
        System.out.println("ArrayList : ");
        for(Object number: linkL) {
            arrL.add(number);
            System.out.println("Element Arraylist = " + number);
        }
        System.out.println("Size arrayList " + arrL.size());
        // supprimer
        startTime = System.nanoTime();
        arrL.remove(0);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String arrLDureeDirecte = "Suppression des éléments de ArrL avec remove(0) d’un ArrayList, durée duréeArrayDirect = ";
        System.out.println(String.format(arrLDureeDirecte + " %s ", duration + " nanosecondes"));
        // afficher les nouveaux elements
        System.out.println("Nouvelle ArrayList : ");
        for(Object number: arrL) {
            System.out.println("Element = " + number);
        }
        System.out.println("Size nouvelle arrayList: " + arrL.size());

        // ArrayList inverse
        arrL = new ArrL();
        System.out.println("ArrayList inverse: ");
        for(Object number: linkL) {
            arrL.add(number);
            System.out.println("Element inverse = " + number);
        }
        System.out.println("Size array inverse: " + arrL.size());
        // calculer l'index
        int index = arrL.size() - 1;
        System.out.println("index: " + index);
        startTime = System.nanoTime();
        // supprimer le dernier element du arrayList;
        arrL.remove(index);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        String arrLDureeInverse = "Suppression des éléments de ArrL avec remove(i) ciblant les derniers éléments d’un ArrayList, avec une durée de duréeArrayInverse = ";
        System.out.println(String.format(arrLDureeInverse + " %s ", duration + " nanosecondes"));
        // afficher les nouveaux elements
        System.out.println("Nouvelle ArrayList inverse: ");
        for(Object number: arrL) {
            System.out.println("Element inverse= " + number);
        }
        System.out.println("Size nouvelle arrayList inverse: " + arrL.size());
    }
}
