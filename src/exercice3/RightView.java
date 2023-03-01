/**
 * Exercice 3 : Déplacer Tous Les Zéros
 * Instructions
 * Imprimer la vue de droite d'un arbre binaire
 *
 * Étant donné un arbre binaire, imprimez-en la vue droite.
 *
 * La vue droite d'un arbre binaire est un ensemble de nœuds visibles lorsque l'arbre est visité du côté droit.
 *
 * Exemples:
 *
 * Input:
 *           1
 *        /     \
 *      2        3
 *    /   \       /  \
 *   4     5   6    7
 *                  \
 *                    8
 * Sortie : la vue de droite de l'arbre est 1 3 7 8
 *
 * Input:
 *           1
 *        /
 *      8
 *    /
 *   7
 * Sortie : la vue de droite de l'arbre est 1 8 7
 *
 * L'idée est d'utiliser la récursivité et de garder une trace du niveau maximum également.
 * Et parcourez l'arbre de manière à ce que le sous-arbre droit soit visité avant le sous-arbre gauche.
 *
 * Suivez les étapes ci-dessous pour résoudre le problème :
 *
 * Effectuez une traversée Postorder pour obtenir le nœud le plus à droite en premier
 * Maintenez un nom de variable max_level qui stockera jusqu'à ce qu'il imprime la bonne vue
 * En parcourant l'arbre de manière post-ordre si le niveau actuel est supérieur à max_levelalors imprimez
 * le nœud actuel et mettez à jour max_levelpar le niveau actuel
 */

package exercice3;

public class RightView {
	
	// Fonction pour imprimer la vue de droite de l'arbre binaire
    public static void printRightView(Node root) {
        // Appel d'une fonction auxiliaire pour effectuer une traversée post-ordre de l'arbre
        traverse(root, 1, new int[]{0});
    }

    // Fonction auxiliaire pour effectuer une traversée post-ordre de l'arbre binaire
    public static void traverse(Node node, int level, int[] maxLevel) {
        if (node == null) {
            return;
        }
        if (level > maxLevel[0]) {
            System.out.print(node.val + " ");
            maxLevel[0] = level;
        }
        traverse(node.right, level + 1, maxLevel);
        traverse(node.left, level + 1, maxLevel);
    }

    // Fonction main pour tester l'algorithme
    public static void main(String[] args) {
        // Exemple 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        root1.right.right.right = new Node(8);

        System.out.print("Right view of tree 1 is: ");
        printRightView(root1); // Output: 1 3 7 8

        // Exemple 2
        Node root2 = new Node(1);
        root2.left = new Node(8);
        root2.left.left = new Node(7);

        System.out.print("\nRight view of tree 2 is: ");
        printRightView(root2); // Output: 1 8 7
    }
}
