class Student {
    String name;
    int id;
    String dep;
    
    public Student(String name, int id, String dep) {
        this.name = name;
        this.id = id;
        this.dep = dep;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dep);
        System.out.println("-------------------");
    }
    
}

class Main {
    public static void main(String[] args) {
       Student student1 = new Student("Raiyan" , 48007, "CSE");
       System.out.println("Student 1 Details:");
        student1.displayInfo();
    }
}
