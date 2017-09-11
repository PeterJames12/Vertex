package collections;


import def.Alex;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Vladimir on 8/28/2017.
 */
public class Service {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
////        IntStream.range(1,11).forEach(s -> linkedList.add(s));
//        IntStream.range(1,11).forEach(linkedList::add);
//
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            final Integer next = iterator.next();
//            if (next % 2 != 0) {
//                iterator.remove();
//            }
//        }
//
//        linkedList.removeIf(s -> s % 2 != 0);
//
//        System.out.println(linkedList);





//        List<Integer> list = new ArrayList<>();
//        IntStream.range(1, 21).forEach(list::add);
//
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)%2 != 0){
//                list.set(i, 20);
//            } else {
//                list.set(i, 10);
//            }
//        }
//
//        System.out.println(list);
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            final Integer next = iterator.next();
//            if (next == 20) {
//                iterator.remove();
//            }
//        }
//
//        int ind = 0;
//        list.forEach(s -> System.out.println(ind));
//
//        System.out.println(list);
//
//        for (int i:list) {
//            if (i == 10) {
//                list.remove(list.indexOf(i));
//            }
//        }



//        List list1 = new LinkedList();
//
//        list1.add(27);
//        list1.add(48);
//        list1.add(56);
//        list1.add(61);
//        list1.add(33);
//        list1.add(26);
//        list1.add(89);
//
//        list1.add("B");
//        list1.add("A");
//        list1.add("D");
//        list1.add("C");
//        list1.add("E");
//        list1.add("G");
//        list1.add("F");
//
//
//
//        System.out.println(list1);
//        System.out.println(sortToInteger(list1));
//        System.out.println(sortToString(list1));

        Map<Integer, Object> map = new HashMap<>();

        map = fillMap(map);
        List<User> users = toUser(map);
        List<Project> projects = toProject(map);
        printProject(projects);
        System.out.println();
        printUser(users);
    }


    private static void printUser(List<User> users){
        for (User el: users) {
            System.out.println(el.getName() + " " + Integer.toString(el.getAge()));
        }
    }

    private static void printProject(List<Project> projects){
        for (Project el: projects) {
            System.out.println(el.name + " " + el.date);
        }
    }


    private static Map<Integer,Object> fillMap (Map<Integer, Object> map){
        for (int i = 1; i <= 10; i++) {
            map.put(i, new User("Alex" + Integer.toString(i)));
        }

        for (int i = 11; i <= 20; i++) {
            map.put(i, new Project(Integer.toString(i)));
        }

        return map;
    }

    private static List<User> toUser(Map<Integer, Object> map){
        List<User> users = new LinkedList<>();
        for (int i = 0; i < map.size(); i++) {
            Object tmp = map.get(i);
            if (tmp instanceof User){
                users.add((User) tmp);
            }
        }

        return users;
    }

    private static List<Project> toProject(Map<Integer, Object> map){
        List<Project> projects = new LinkedList<>();
        for (int i = 0; i < map.size(); i++) {
            Object tmp = map.get(i);
            if (tmp instanceof Project){
                projects.add((Project) tmp);
            }
        }
        return projects;
    }









    private static List<String> sortToString(List list){
        List<String> tmpStrList = new LinkedList<>();
        for (Object el: list) {
            if (el instanceof String){
                tmpStrList.add((String) el);
            }
        }
        return tmpStrList;
    }

    private static List<Integer> sortToInteger(List list){
        List<Integer> tmpIntList = new LinkedList<>();
        for (Object el: list) {
            if (el instanceof Integer){
                tmpIntList.add((Integer) el);
            }
        }
        return tmpIntList;
    }
}
