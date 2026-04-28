public class NewEraUniversityDemo {
    public static void main(String[] args) {
        College university = new College("New Era University");
        
        College engineeringCollege = new College("College of Engineering");
        College infoComputingCollege = new College("College of Information and Computing Science");
        College businessCollege = new College("College of Business");
        
        Department eeDepartment = new Department("Department of Electrical Engineering");
        Department meDepartment = new Department("Department of Mechanical Engineering");
        Department ceDepartment = new Department("Department of Civil Engineering");
        
        Department itDepartment = new Department("Department of Information Technology");
        Department csDepartment = new Department("Department of Computer Science");
        
        Department marketingDepartment = new Department("Department of Marketing");
        
        Teacher profJohnson = new Teacher("Prof. Johnson", "Electrical Circuits", 75000);
        Teacher profSmith = new Teacher("Prof. Smith", "Thermodynamics", 82000);
        Teacher profWilliams = new Teacher("Prof. Williams", "Structural Analysis", 68000);
        
        Teacher profBrown = new Teacher("Prof. Brown", "Data Structures", 70000);
        Teacher profDavis = new Teacher("Prof. Davis", "Web Development", 78000);
        
        Teacher profWilson = new Teacher("Prof. Wilson", "Marketing Strategy", 72000);
        
        Student alice = new Student("Alice Chen", "S001", 15000);
        Student bob = new Student("Bob Wilson", "S002", 15000);
        Student carol = new Student("Carol Martinez", "S003", 15000);
        
        Student david = new Student("David Lee", "S004", 15000);
        Student emma = new Student("Emma Garcia", "S005", 15000);
        Student frank = new Student("Frank Taylor", "S006", 16000);
        Student grace = new Student("Grace Kim", "S007", 15000);
        
        Student henry = new Student("Henry Lopez", "S008", 15500);
        Student iris = new Student("Iris Patel", "S009", 15500);
        
        eeDepartment.addUnit(profJohnson);
        eeDepartment.addUnit(alice);
        eeDepartment.addUnit(bob);
        
        meDepartment.addUnit(profSmith);
        meDepartment.addUnit(carol);
        
        ceDepartment.addUnit(profWilliams);
        ceDepartment.addUnit(david);
        
        engineeringCollege.addUnit(eeDepartment);
        engineeringCollege.addUnit(meDepartment);
        engineeringCollege.addUnit(ceDepartment);
        
        itDepartment.addUnit(profDavis);
        itDepartment.addUnit(emma);
        itDepartment.addUnit(frank);
        
        csDepartment.addUnit(profBrown);
        csDepartment.addUnit(grace);
        
        infoComputingCollege.addUnit(itDepartment);
        infoComputingCollege.addUnit(csDepartment);
        
        marketingDepartment.addUnit(profWilson);
        marketingDepartment.addUnit(henry);
        marketingDepartment.addUnit(iris);
        
        businessCollege.addUnit(marketingDepartment);
        
        university.addUnit(engineeringCollege);
        university.addUnit(infoComputingCollege);
        university.addUnit(businessCollege);
        
        System.out.println("=".repeat(60));
        System.out.println("NEW ERA UNIVERSITY SYSTEM");
        System.out.println("=".repeat(60));
        
        System.out.println("\n--- COMPLETE UNIVERSITY STRUCTURE ---\n");
        university.display();
        
        System.out.println("=".repeat(60));
        System.out.println("--- SUMMARY REPORT ---");
        System.out.println("=".repeat(60));
        
        System.out.println("\nCOLLEGE OF ENGINEERING");
        System.out.println("   Students: " + engineeringCollege.getStudentCount());
        System.out.println("   Budget: ₱" + String.format("%,.0f", engineeringCollege.getBudget()));
        
        System.out.println("\nCOLLEGE OF INFORMATION AND COMPUTING SCIENCE");
        System.out.println("   Students: " + infoComputingCollege.getStudentCount());
        System.out.println("   Budget: ₱" + String.format("%,.0f", infoComputingCollege.getBudget()));
        
        System.out.println("\nCOLLEGE OF BUSINESS");
        System.out.println("   Students: " + businessCollege.getStudentCount());
        System.out.println("   Budget: ₱" + String.format("%,.0f", businessCollege.getBudget()));
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("NEW ERA UNIVERSITY TOTAL");
        System.out.println("   Total Students: " + university.getStudentCount());
        System.out.println("   Total Budget: ₱" + String.format("%,.0f", university.getBudget()));
        System.out.println("=".repeat(60));
    }
}