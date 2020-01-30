package test;
import java.util.*;
public class Collection {
   
    public static void main(String args[])
    {
            ArrayList<Person> al=new ArrayList();
            Person p1=new Person(1,"Aniket");
            Person p2=new Person(2,"Sagar");
            Person p3=new Person(3,"Madhu");
            Person p4=new Person(4,"Ravi");
            al.add(p1);
            al.add(p2);
            al.add(p3);
            al.add(p4);
            al.contains(p4);
            Iterator<Person> it=al.iterator();
            while(it.hasNext())
            {
                Person p=it.next();
                System.out.println(p.getX()+"  "+p.getS());
            }
            System.out.println("via for each loop");
            for(Person p:al)
            {
                System.out.println(p.getX()+"    "+p.getS());
            }
        }
}