package com.codegym;

import java.awt.*;
import java.util.*;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("HV01", "Nguyen Tung Anh", "Ha Noi"));
        list.add(new Student("HV02", "Nguyen Tung Hieu", "Ha Noi"));
        list.add(new Student("HV03", "Nguyen Tung Lam", "Ha Noi"));
        list.add(new Student("HV04", "Nguyen Tung Binh", "Ha Noi"));
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.sort(list);
        studentManagement.display(list);
        studentManagement.remove(list);
        studentManagement.update(list);
    }

    public void sort(ArrayList<Student> list) {
        System.out.println("----------------");
        System.out.println("After sort : ");
        Collections.sort(list);
    }

    public void display(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void remove(ArrayList<Student> list) {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT INDEX TO REMOVE : ");
        index = sc.nextInt();
        list.remove(index);
        System.out.println("-------------------");
        System.out.println("After remove : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void update(ArrayList<Student> list) {
        int index;
        Student student = new Student("HV10", "Lam", "PARIS");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Input index to update : ");
        index = sc.nextInt();
        list.set(index, student);
        System.out.println("-------------------");
        System.out.println("After update : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void findStudent(ArrayList<Student> list){
        String stringFind;
        System.out.println(" Nhap chuoi can tim : ");
        Scanner sc = new Scanner(System.in);
        stringFind = sc.next();
        for (int i = 0; i < list.size(); i++){
            if (list.equals(stringFind)){
                System.out.println(i);
            }
        }
    }
}
