public class asol {
    public static void main(String[] args) {
        student saklan = new student();
        saklan.prnt();
        System.out.println("\n");
        student ahsan = new student();
        
        ahsan.name = "Habibur Rahman Ahsan";
        ahsan.id = 34;
        ahsan.cgpa = 3.9;
        System.out.println("\n");
        ahsan.prnt();
        System.out.println("\n");
        
        student shihab = new student("Shihab Ahmed",65,3.6);
        shihab.prnt();
    }
}
