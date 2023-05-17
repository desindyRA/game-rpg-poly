public class Enemy extends Character {

    Enemy(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.name +" Bergerak Menggunakan Kekuatanya");
      //  System.out.println("==================================================");
    }

    public void move(int step) {
        super.move();
        System.out.println(step + " langkah");
       
    }


}