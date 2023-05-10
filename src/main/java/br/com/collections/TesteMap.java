package br.com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
    public static void main(String[] args) {
        //nao mantem ordem - complexidade O(n)
        Map testeMap = new HashMap();
        testeMap.put("civic", "azul");
        testeMap.put("corolla", "preto");
        testeMap.put("prisma", "branco");
        testeMap.put("civic", "amarelo");
        System.out.println(testeMap);

        //mantem ordem de entrada - complexidade O(n)
        Map testeLinkedHashMap = new LinkedHashMap();
        testeLinkedHashMap.put("civic", "azul");
        testeLinkedHashMap.put("corolla", "preto");
        testeLinkedHashMap.put("prisma", "branco");
        testeLinkedHashMap.put("civic", "amarelo");
        System.out.println(testeLinkedHashMap);

        //ordena pela chave - complexidade O(log N)
        Map testeTreeMap = new TreeMap();
        testeTreeMap.put("civic", "azul");
        testeTreeMap.put("corolla", "preto");
        testeTreeMap.put("prisma", "branco");
        testeTreeMap.put("civic", "amarelo");
        testeTreeMap.put("azera", "cinza");
        System.out.println(testeTreeMap);
    }
}
