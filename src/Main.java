import Entities.Player;
import Objets.Objet;
import Weapon.Sword;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Eddy");
        Objet item = new Objet();
        Sword sword = new Sword();
        item.Name = "baton";
        System.out.println(player.name);
    }
}