import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Person[] people = new Person[n];

        // Crear una lista de objetos Person
        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

        // Ordenar la lista de personas por altura en orden descendente
        Arrays.sort(people);

        // Extraer los nombres ordenados
        for (int i = 0; i < n; i++) {
            names[i] = people[i].name;
        }

        return names;
    }

    // Clase auxiliar para almacenar nombres y alturas
    class Person implements Comparable<Person>{
        String name;
        int height;

        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
        @Override
        public int compareTo(Person other) {
            return other.height-this.height; // Orden descendente por altura
        }
    }
}

