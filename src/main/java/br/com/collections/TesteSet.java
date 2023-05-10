package br.com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {

        //nao mantem ordem - complexidade O(n)
        var testeHashSet = new HashSet<String>();
        testeHashSet.add("a");
        testeHashSet.add("b");
        testeHashSet.add("c");
        testeHashSet.add("a");
        System.out.println(testeHashSet);

        //mantem a ordem de qdo e colocado
        Set testeLinkedHashSet = new LinkedHashSet();
        testeLinkedHashSet.add("a");
        testeLinkedHashSet.add("b");
        testeLinkedHashSet.add("c");
        testeLinkedHashSet.add("a");
        System.out.println(testeLinkedHashSet);

        //ordena e implementa o SortedSet por isso possui mais metodos - complexidade O(log (n))
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(12);
        tree.add(63);
        tree.add(34);
        tree.add(45);
    }
}
