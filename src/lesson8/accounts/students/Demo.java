package lesson8.accounts.students;

public class Demo {

    public static Student createHighestParent()
    {

        return new Student("Vasya", "Pupkin", 312, null);
    }

    public static SpecialStudent createLowestChild ()
    {
        return new SpecialStudent("Ferdya", "Lozhkin", 313, null, 222333222, "specstud@gmail.com");
    }
}
