package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("List A: ");
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>(5);
        a.add(s.nextLine());
        a.add(s.nextLine());
        a.add(s.nextLine());
        a.add(s.nextLine());
        a.add(s.nextLine());


        System.out.println(a);
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> b = new ArrayList<>(5);
        System.out.println("List B:");
        b.add(s.nextLine());
        b.add(s.nextLine());
        b.add(s.nextLine());
        b.add(s.nextLine());
        b.add(s.nextLine());

        System.out.println(b);

        iterator = b.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("List C sorting(b,a) : ");
        ArrayList<String> c = new ArrayList<>(10);
        System.out.println("\n C(A,B)");
        Collections.reverse(b);
        for (int i = 0; i < b.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
            iterator = c.iterator();
        }
        while (iterator.hasNext()) {
            String d = iterator.next();
            System.out.println(d);

        }
        Collections.addAll(c);
        System.out.println("C after sorting");
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }


        });
        iterator = c.iterator();
        while (iterator.hasNext()) {
            String d2 = iterator.next();
            System.out.println(d2);
        }


    }






