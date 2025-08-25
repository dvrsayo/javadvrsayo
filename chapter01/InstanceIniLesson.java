package chapter01;

public class InstanceIniLesson {

    int code = 1;
    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();
        {System.out.println("Buritto");}
        System.out.println(ini.code);
    }

    {System.out.println("Almond");}
}
