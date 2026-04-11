

// Pass-by-Value


class Student {
    int marks;
}

public class CallByValueObject {

    public static void main(String[] args) {
        Student s = new Student();
        s.marks = 80;

        System.out.println("Before: " + s.marks); // 80
        changeMarks(s);
        System.out.println("After: " + s.marks); // 100
    }

    public static void changeMarks(Student s1) {
        s1.marks = 100; 
    }
}

/*
   Before: 80
  After: 100 
   
 */
