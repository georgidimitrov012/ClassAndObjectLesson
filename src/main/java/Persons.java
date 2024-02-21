public class Persons {
    private String name;
    private int age;

    public Persons() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static String ageCategory(int age) {
        if (age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public String ageCategory() {
        if (age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }


}
