public class   App {
    private static final Fighter witch = null;

    public static void main(String[] args) {
        // Static Polymorphism pada class Hero
        Hero hero = new Hero("Hero");
        hero.move();
        hero.move("kesana");

        // Static Polymorphism pada class Anemy
        Enemy anemy = new Enemy("Enemy");
        anemy.move();
        anemy.move(3);

        // Dynamic Polymorphism sebuah referensi dari class Karakter ke objek class Kero, Anemy, Fighter, dan Witch
        Character[] listCharacter = new Character[4];
        listCharacter[0] = new Hero("Hero HARRY POTTER");
        listCharacter[1] = new Enemy("Enemy TOM MARVOLO");
        listCharacter[2] = new Fighter("Fighter");
        listCharacter[3] = new Witch("Witch");

        for (int i = 0; i < listCharacter.length; i++) {
            listCharacter[i].move();
        }

        // Dynamic Polymorphism sebuah referensi dari class Karakter ke objek Witch yang berubah (di cast) menjadi objek Fighter
        Character character5 = new Witch("sapu");
        if (character5 instanceof Fighter) {
            Fighter fighter = (Fighter) character5;
            fighter.move();
            
        }

        System.out.println("Soal C");
        System.out.println("=".repeat(50));
        ((Fighter)witch).move();
        System.out.println("=".repeat(50));

        
    }
}
