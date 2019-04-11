package exo4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Exo 4.1.1
        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5});
        int sum = 0;
        for (Integer i : list){
            sum += i;
        }
        //System.out.println(sum);

        //Exo 4.1.2
        List list2 = Arrays.asList(2,1, "banana", null, "apple", "orange",
                3, new Object(), new java.util.Date());
        HashMap<String, List> resultat = group(list2);
        /*for (Map.Entry<String, List> entry : resultat.entrySet()){
            System.out.print(entry.getKey() + " : ");
            List values = entry.getValue();
            for (Object value : values){
                System.out.print(value + ", ");
            }
            System.out.println();
        }*/

        //Exo 4.2.1
        List resultat2 = groupAvecTri(list2);
        for (Object value : resultat2){
            System.out.println(value + ", ");
        }
    }

    private static HashMap<String, List> group(List list) {

        HashMap<String, List> hashmap = new HashMap();
        hashmap.put("String", new ArrayList());
        hashmap.put("Integer", new ArrayList());
        hashmap.put("Autre", new ArrayList());

        int i = 0;

        while(i < list.size()){
            List groupe;
            if(list.get(i) != null){
                Object o = list.get(i);
                switch (o.getClass().getName()){
                    case "java.lang.String":
                        groupe = hashmap.get("String");
                        groupe.add(o);
                        break;
                    case "java.lang.Integer":
                        groupe = hashmap.get("Integer");
                        groupe.add(o);
                        break;
                    default:
                        groupe = hashmap.get("Autre");
                        groupe.add(o);
                }
            }else{
                groupe = hashmap.get("Autre");
                groupe.add(list.get(i));
            }
            i++;
        }

        return hashmap;
    }

    private static List groupAvecTri(List list) {
        HashMap<String, List> hashmap = new HashMap();
        hashmap.put("String", new ArrayList());
        hashmap.put("Integer", new ArrayList());
        hashmap.put("Autre", new ArrayList());
        List resultat = new ArrayList();

        int i = 0;

        while(i < list.size()){
            List groupe;
            if(list.get(i) != null){
                Object o = list.get(i);
                switch (o.getClass().getName()){
                    case "java.lang.String":
                        groupe = hashmap.get("String");
                        groupe.add(o);
                        groupe.sort(new Comparateur());
                        break;
                    case "java.lang.Integer":
                        groupe = hashmap.get("Integer");
                        groupe.add(o);
                        groupe.sort(new Comparateur());
                        break;
                    default:
                        groupe = hashmap.get("Autre");
                        groupe.add(o);
                }
            }else{
                groupe = hashmap.get("Autre");
                groupe.add(list.get(i));
            }
            i++;
        }

        resultat.addAll(hashmap.get("Integer"));
        resultat.addAll(hashmap.get("String"));
        resultat.addAll(hashmap.get("Autre"));

        return resultat;
    }
}
