public class footballplayer {
    String name;
    int age;
    String position;
    double salary;
    //football player 构造器
    public footballplayer(String name){
        this.name = name;
    }

    public void plyerAge(int plyerAge) {
        age = plyerAge;
    }
    public void playerposition(String playerposition){
        position = playerposition;
    }
    public  void playersalary(double playersalary){
        salary = playersalary;
    }
    public void printplayer(){
        System.out.println("姓名: "+ name);
        System.out.println("年龄："+ age);
        System.out.println("位置："+ position);
        System.out.println("薪水："+salary);
    }

}
