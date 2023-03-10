package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Coin_Bronze extends Entity {

    GamePanel gp;

    public OBJ_Coin_Bronze(GamePanel gp) {
        super(gp);
        this.gp = gp;

        type = typePickupOnly;
        name = "Bronze Coin";
        coinVal = 1;
        down1 = setup("/objects/coin_bronze", gp.tileSize, gp.tileSize);
    }

    public void use(Entity entity) {

        gp.playSoundEffect(gp.keyPickup);
        gp.ui.addMessage("Coin +" + coinVal);
        gp.player.coins += coinVal;
    }

}
