package Polymorphism;

class College {
    void classRm() {
        System.out.println("Asm College");
    }
}

class Teacher extends College {

    @Override
    void classRm() {
        System.out.println("Jyoti Auti");
    }
}

public class OverrideAnnotation {

    public static void main(String[] args) {
   
    	College c = new College();
        c.classRm();

        Teacher t = new Teacher();
        t.classRm();
    }
}