/**
 * Exercice 2 : Deux Piles Dans Un Tableau
 * Instructions
 * Implémenter deux piles dans un tableau
 *
 * Créez une structure de données twoStacksqui représente deux piles. L'implémentation de twoStacksdoit utiliser un seul tableau,
 * c'est-à-dire que les deux piles doivent utiliser le même tableau pour stocker les éléments.
 *
 * Les fonctions suivantes doivent être prises en charge par twoStacks.
 *
 * push1(int x) –> pushes x to first stack
 * push2(int x) –> pushes x to second stack
 * pop1() –> pops an element from first stack and return the popped element
 * pop2() –> pops an element from second stack and return the popped element
 * La mise en œuvre de twoStack doit être économe en espace.
 *
 * Suivez les étapes ci-dessous pour résoudre le problème :
 *
 * Pour implémenter push1():
 * - Vérifier d'abord si top1 est supérieur à 0
 * - Si c'est le cas alors ajouter un élément à l'index top1 et décrémenter top1 de 1
 * - Sinon retourner Stack Overflow
 *
 * Pour implémenter push2():
 * - Premièrement, vérifier si top2 est inférieur à n – 1
 * - Si c'est le cas alors ajouter un élément à l'index top2 et incrémenter top2 de 1
 * - Sinon retourner Stack Overflow
 *
 * Pour mettre en oeuvre pop1():
 * - Vérifier d'abord si le top1 est inférieur ou égal à n / 2
 * - Si c'est le cas alors incrémenter le top1 de 1 et retourner cet élément.
 * - Sinon, retournez Stack Underflow
 *
 * Pour mettre en oeuvre pop2():
 * - Vérifier d'abord si le top2 est supérieur ou égal à (n + 1) / 2
 * - Si c'est le cas alors décrémenter le top2 de 1 et retourner cet élément.
 * - Sinon, retournez Stack Underflow
 */


package exercice2;

public class TwoStacks {
    private int[] arr; // array to store elements
    private int top1; // index of the top element of stack1
    private int top2; // index of the top element of stack2
    private int n; // total size of the array

    public TwoStacks(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top1 = -1;
        this.top2 = n;
    }

    // push element to stack1
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // push element to stack2
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // pop element from stack1
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // pop element from stack2
    public int pop2() {
        if (top2 < n) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
}
