public class Teacher implements EducationalUnit {
    private String name;
    private String subject;
    private double salary;
    
    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void display() {
        System.out.println("Teacher: " + name + " (Subject: " + subject + 
                         ", Salary: ₱" + String.format("%,.0f", salary) + ")");
    }
    
    @Override
    public int getStudentCount() {
        return 0;
    }
    
    @Override
    public double getBudget() {
        return salary;
    }
}