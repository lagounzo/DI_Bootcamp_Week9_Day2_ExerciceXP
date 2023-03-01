/**
 * Exercice 4 : Distance Maximale
 * Instructions
 * Distance maximale entre deux occurrences du même élément dans le tableau
 *
 * Étant donné un tableau avec des éléments répétés, la tâche consiste à trouver la distance maximale entre deux occurrences d'un élément.
 *
 * Exemples:
 *
 * Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
 * Output: 10
 * // maximum distance for 2 is 11-1 = 10
 * // maximum distance for 1 is 4-2 = 2
 * // maximum distance for 4 is 10-5 = 5
 * Une solution simple à ce problème consiste à sélectionner un par un chaque élément du tableau et à trouver sa première
 * et sa dernière occurrence dans le tableau et à prendre la différence entre la première et la dernière occurrence pour une distance maximale.
 * La complexité temporelle de cette approche est O(n2).
 *
 * Une solution efficace à ce problème consiste à utiliser le hachage.
 * L'idée est de parcourir le tableau d'entrée et de stocker l'index de la première occurrence dans une carte de hachage.
 * Pour chaque autre occurrence, trouvez la différence entre
 * l'index et le premier index stocké dans la carte de hachage. Si la différence est supérieure au résultat jusqu'à présent,
 * mettez à jour le résultat.
 */

package exercice4;

import java.util.*;

public class MaxDistance {
    public static int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDist = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                int dist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int maxDist = maxDistance(arr);
        System.out.println("Maximum distance between two occurrences of the same element: " + maxDist);
    }
}

