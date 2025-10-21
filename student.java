public class student{
    String name;
    int id;
    double cgpa;
    student(){
        name = "Ajharul Islam";
        id = 55;
        cgpa = 4.0;
    }
    student(String nm, int roll){
        name = nm;
        id = roll;
    }
    student(String nm, int roll, double cg){
        name = nm;
        id = roll;
        cgpa = cg;
    }

    void prnt(){
        System.out.println("The Name of the Student is: "+ name);
        System.out.println("The ID number of "+name+" Is : " + id);
        System.out.println("The result of "+name+" Is: "+cgpa);
    }

}
