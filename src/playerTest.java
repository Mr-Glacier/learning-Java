public class playerTest {
    public static void main(String[] args){
        footballplayer player1 = new footballplayer("姆巴佩");
        footballplayer player2 = new footballplayer("梅西");

        //调用对象方法
        player1.plyerAge(27);
        player1.playerposition("左边锋");
        player1.playersalary(10000);
        player1.printplayer();

        player2.plyerAge(36);
        player2.playerposition("前锋");
        player2.playersalary(5000);
        player2.printplayer();
    }
}
