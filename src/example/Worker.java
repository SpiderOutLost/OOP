package example;

public class Worker {
    String name;
    String post;
    double salary;
    Worker(String name,String post,double salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    void ShowInfo(){
        System.out.println(name +"\n" +  post+ "\n" + salary);
    }

}
