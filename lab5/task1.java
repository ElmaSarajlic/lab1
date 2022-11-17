lab5;

public class Task1 {
    public class Player {
        private String name;

        public setName(String newName){
            this.name = newName;
        }

        public String getName(){
            return this.name;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
    }
}



