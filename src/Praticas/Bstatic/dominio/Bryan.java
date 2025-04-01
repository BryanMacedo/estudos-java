package Praticas.Bstatic.dominio;

public class Bryan {
    private static String name = "Bryan";
    private static int yearOfBirth = 2001;
    private static int age;

    public void imprime(){
        System.out.println(Bryan.name);
        System.out.println(Bryan.yearOfBirth);
        System.out.println(Bryan.age);
    }

    public static String getName() {
        return name;
    }

    public static int getYearOfBirth() {
        return yearOfBirth;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Bryan.age = age;
    }
}
