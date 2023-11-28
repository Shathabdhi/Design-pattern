package Singletone.singeltone;

public class client {
    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getInstance().hashCode());
        //hashcode to test Whether it's returning the same address everytime or not

    }
}
