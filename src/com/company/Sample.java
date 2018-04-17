package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>
{
    private long studentid;
    private String studentFname;
    private String studentLname;
    private List<Integer> marks;
    public Student(long studentid,String studentFname,String studentLname,List<Integer> marks)
    {
        this.studentid=studentid;this.studentFname=studentFname;this.studentLname=studentLname;this.marks=marks;
    }

    public long getStudentid() {
        return studentid;
    }

    public String getStudentFname() {
        return studentFname;
    }

    public String getStudentLname() {
        return studentLname;
    }

    public List<Integer> getMarks() {
        return marks;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentFname.compareTo(o.studentFname);
    }
}
class SortById implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {

        return (int) (o1.getStudentid()-o2.getStudentid());
    }
}
class SortByStudentLname implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentLname().compareTo(o2.getStudentLname());
    }
}
class SortByStudentMarks implements Comparator<Student>
{
    static int sum(Student o)
    {
        int sum=0;
        for(Integer i:o.getMarks())
        {
            sum+=i;
        }
        return sum;
    }
    @Override
    public int compare(Student o1, Student o2) {
        return sum(o1)-sum(o2);
    }
}
public class Sample
{
    public Sample()
    {
        List<Student> list=getStudents();
        Collections.sort(list);
        //Collections.reverse(list);
        //Collections.sort(list,new SortByStudentLname());
        //Collections.sort(list,new SortByStudentMarks());
        for(Student s:list)
        {
            Collections.shuffle(s.getMarks());
            System.out.println(s.getStudentFname()+"--"+s.getStudentLname()+"--"+s.getStudentid()+"--"+s.getMarks());
        }

    }
    static List<Student> getStudents()
    {
        List<Integer> list1,list2,list3;
        list1=new LinkedList<>();//ArrayList<>();
        list1.add(90);
        list1.add(70);
        list1.add(80);
        list1.add(70);
        list2=new LinkedList<>();
        list2.add(95);
        list2.add(75);
        list2.add(85);
        list2.add(75);
        list3=new LinkedList<>();
        list3.add(92);
        list3.add(72);
        list3.add(82);
        list3.add(72);
        List<Student> list=new LinkedList<>();
        Student s1=new Student(40,"ajay","G",list1);
        Student s2=new Student(30,"mohan","J",list2);
        Student s3=new Student(50,"vijay","M",list3);
        list.add(s1);list.add(s2);list.add(s3);
        return list;
    }
}
