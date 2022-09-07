public class Main {
    public static void main(String[] args) {
        Student student = new Student("Erik","Khan","PKS-320",5);
        Aspirant aspirant = new Aspirant("Igor", "Tupitsin", "PKS-320", 4, "bomberman");
        Student wNM = new Aspirant("Ilyha", "Erokhin", "PKS-320", 5,"dota");
        Student[] students = {student, aspirant, wNM};

        System.out.println("Имя" + student.firstName + " " + student.lastName + ", группа: " + student.group + ", средняя оценка: " + student.averageMark + ", степуха: " + student.getscolarship());
        System.out.println("Имя" + aspirant.firstName + " " + aspirant.lastName + ", группа: " + aspirant.group + ", средняя оценка: " + aspirant.averageMark + ", научная работа: " + aspirant.nauchnayaRabota + ", степуха: " + aspirant.getscolarship());
        System.out.println("Имя" + wNM.firstName + " " + wNM.lastName + ", группа: " + wNM.group + ", средняя оценка: " + wNM.averageMark + ", степуха: " + wNM.getscolarship());

    }
    }

