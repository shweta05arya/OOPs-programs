class ArrayList {
    String name;
    String department;
    int experience;

    ArrayList(String name, String department, int experience) {
    this.name = name;
    this.department = department;
    this.experience = experience;
    }

    void PrintDetails() {
        System.out.println("Name" + name);
        System.out.println("Department" + department);
         System.out.println("Experience" + experience);

    }
    public class Main {
    public static void main(String[] args) {
        ArrayList emp1 = new ArrayList("Shweta", "IT", 5);
        ArrayList emp2 = new ArrayList("Jane", "HR", 3);
        emp1.PrintDetails();
        emp2.PrintDetails();
    }

}
}