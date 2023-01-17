package Task3;

public class Demo {
    public static void main(String[] args) {
        MyIfIm my = new MyIfIm();
        System.out.println("Идентификатор пользователя " + my.getUserId());
        System.out.println("Идентификатор админа " + my.getAdminId());

        int id = MyIf.getUniversalId();
        System.out.println("Универсальный Идентификатор " + id);
        System.out.println("++++ " + MyIf.getUniversalId());
    }
}
