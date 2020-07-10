package de.lucgameshd.morefeatures;

import cn.nukkit.entity.Entity;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import de.lucgameshd.morefeatures.entity.EntityArmorStand;
import de.lucgameshd.morefeatures.item.ItemArmorStand;

public class MoreFeatures extends PluginBase {

    @Override
    public void onLoad() {
        //this.getLogger().info( "Loading MoreFeature Plugin..." );
        Entity.registerEntity( "ArmorStand", EntityArmorStand.class );

        //Register items
        Class[] list = Item.list;
        list[Item.ARMOR_STAND] = ItemArmorStand.class;
    }

    /*@Override
    public void onEnable() {
        this.getLogger().info( "The plugin has been successfully loaded!" );
    }

    @Override
    public void onDisable() {

    }*/
}
