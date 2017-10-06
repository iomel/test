package lesson8.accounts.students;

public class Demo {

    SpecialStudent createHighestParent()
    {

        return new SpecialStudent("Vasya", "Pupkin", 312, null, 222333222, "specstud@gmail.com");
    }

    Student createLowestChild ()
    {
        return new Student("Ferdya", "Lozhkin", 313, null);
    }
}
