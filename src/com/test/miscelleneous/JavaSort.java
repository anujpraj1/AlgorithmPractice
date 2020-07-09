package com.test.miscelleneous;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
class SortStudents implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student currSt = (Student) o1;
        Student currSt2 = (Student) o2;
        if (currSt.getCgpa() == currSt2.getCgpa()) {
            if (currSt.getFname().equals(currSt2.getFname())) {
                if (currSt.getId() > currSt2.getId()) {
                    return 1;
                } else {
                    return  -1;
                }
            } else {
                return currSt.getFname().compareTo(currSt2.getFname());
            }
        } else {
            if (currSt.getCgpa() > currSt2.getCgpa()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            Collections.sort(studentList, new SortStudents());

            testCases--;
        }

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
