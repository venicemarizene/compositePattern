import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units;
    
    public College(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }
    
    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }
    
    public void removeUnit(EducationalUnit unit) {
        units.remove(unit);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void display() {
    System.out.println("College: " + name);
    for (EducationalUnit unit : units) {
        System.out.print("  ");
        unit.display();
    }
}
    
    @Override
    public int getStudentCount() {
        int total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getStudentCount();
        }
        return total;
    }
    
    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}