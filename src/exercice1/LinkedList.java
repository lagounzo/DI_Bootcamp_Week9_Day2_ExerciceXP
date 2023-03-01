/**
 *  Exercice 1 : Compter L'entier
 * Instructions
 * Écrire une fonction qui compte le nombre de fois qu'un int donné apparaît dans une liste chaînée
 *
 * Étant donné une liste chaînée simple et une clé, comptez le nombre d'occurrences de la clé donnée dans la liste chaînée.
 * Par exemple, si la liste chaînée donnée est 1->2->1->2->1->3->1et que la clé donnée est 1, la sortie doit être 4.
 *
 * Méthode 1- Sans récursivité
 *
 * Algorithm:
 *
 * Step 1: Start
 * Step 2: Create A Function Of A Linked List, Pass A Number
 *         As Arguments And Provide The Count Of The Number To The Function.
 * Step 3: Initialize Count Equal To 0.
 * Step 4: Traverse In Linked List Until Equal Number Found.
 * Step 5: If Found A Number Equal To Update Count By 1.
 * Step 6: After Reaching The End Of The Linked List Return Count.
 * Step 7: Call The Function.
 * Step 8: Prints The Number Of Int Occurrences.
 * Step 9: Stop.
 *
 * Méthode 2- Avec récursivité
 *
 * Algorithm:
 *
 * Algorithm
 * count(head, key);
 * if head is NULL
 * return frequency
 * if(head->data==key)
 * increase frequency by 1
 * count(head->next, key)
 */
package exercice1;

public class LinkedList {
    // Classe interne pour représenter un nœud de la liste
    private static class Node {
        int data; // La valeur stockée dans le nœud
        Node next; // Le prochain nœud dans la liste

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // La tête de la liste

    // Constructeur pour initialiser la liste vide
    public LinkedList() {
        this.head = null;
    }

    // Méthode pour ajouter un élément à la fin de la liste
    public void append(int data) {
        if (head == null) { // Si la liste est vide, créer la tête
            head = new Node(data);
            return;
        }

        // Trouver le dernier nœud dans la liste
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Ajouter le nouveau nœud à la fin de la liste
        current.next = new Node(data);
    }

    // Méthode pour compter le nombre d'occurrences d'une clé dans la liste de manière itérative
    public int countInt(int key) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Méthode pour compter le nombre d'occurrences d'une clé dans la liste de manière récursive
    public int countIntRecursive(int key) {
        return countIntRecursive(head, key, 0);
    }

    // Méthode récursive pour compter le nombre d'occurrences d'une clé dans la liste
    private int countIntRecursive(Node node, int key, int frequency) {
        if (node == null) {
            return frequency;
        }
        if (node.data == key) {
            frequency++;
        }
        return countIntRecursive(node.next, key, frequency);
    }
    
    // Méthode pour afficher la clé et le nombre d'occurrences de manière formatée
    public void printKeyAndResult(int key) {
    	System.out.println("1iere Methode");
    	System.out.println("Clé : " + key);
        System.out.println("Nombre d'occurrences : " + countInt(key));
        System.out.println("");
        System.out.println("2ieme Methodes");
        System.out.println("Clé :"+ key);
        System.out.println("Nombre d'occurrences : " + countIntRecursive(key));
    }
}
