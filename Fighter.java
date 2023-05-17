public class Fighter extends Hero {

    Fighter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.name + " Bergerak dengan sangat cepat ");
      //  System.out.println("==================================================");
    }
}