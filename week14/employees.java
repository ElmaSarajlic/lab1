package lab12.personnel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        this.employees.addAll(persons);
    }

    public void print() {
        for (Person employee : employees) {
            System.out.println(employee);
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

}