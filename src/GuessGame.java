public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() throws InterruptedException{
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");
        while(true){
            System.out.println("Число которое нужно угадать - " + targetNumber);

            p1.guess();
            Thread.sleep(1000);
            p2.guess();
            Thread.sleep(1000);
            p3.guess();
            Thread.sleep(1000);

            guessp1 = p1.number;
            System.out.println("Первый игрок думает что это число - " + guessp1);
            Thread.sleep(1000);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает что это число - " + guessp2);
            Thread.sleep(1000);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает что это число - " + guessp3);
            Thread.sleep(1000);
            System.out.println("Проверяем ответы...");
            Thread.sleep(2500);

            if(guessp1 == targetNumber){
                p1IsRight = true;
            }if(guessp2 == targetNumber){
                p2IsRight = true;
            }if(guessp3 == targetNumber){
                p3IsRight = true;
            }

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("У нас есть победитель!");
                if(p1IsRight == true) {
                    System.out.println("Первый игрок угадал? " + "Да!");
                }if(p2IsRight == true) {
                    System.out.println("Второй игрок угадал? " + "Да!");
                }if(p3IsRight == true) {
                    System.out.println("Третий игрок угадал? " + "Да!");
                }
                Thread.sleep(1000);
                System.out.println("End Game!");
                break;
            }else{
                Thread.sleep(1500);
                System.out.println("Нет правильного ответа.");
                Thread.sleep(100);
                System.out.println("Продолжаем игру!");
            }
        }
    }
}
