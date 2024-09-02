package io.github.runcows.paintingRotate;

import org.bukkit.Art;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Painting;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class InteractEntityListener implements Listener {
    PaintingRotate plugin = PaintingRotate.getInstance();

    @EventHandler
    public void onInteractWithEntity (PlayerInteractEntityEvent event)
    {
        Entity entity = event.getRightClicked();
        if (entity.getType() == EntityType.PAINTING)
        {
            if(event.getHand().equals(EquipmentSlot.OFF_HAND))
            {
                return;
            }
            if(!event.getPlayer().isSneaking())
            {
                return;
            }
            Painting painting = (Painting) entity;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute as " + painting.getUniqueId().toString() + " run function beehive_paintings:rotate with entity @s");
        }
    }
}
