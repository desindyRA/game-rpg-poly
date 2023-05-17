public class Hero extends Character {
    static int baseAtk = 100;

    Hero(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("================== GAME START ====================");
        System.out.println(this.name + " Bergerak Membawa Senjata Apinya");
       // System.out.println("==================================================");
    }

    public void move(String direction) {
        System.out.println(this.name + " Bergerak Menuju" + direction);
      //  System.out.println("==================================================");
    }
}