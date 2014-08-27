package me.modforgery.cc.item;

import me.modforgery.cc.CompactChests;
import me.modforgery.cc.creativetabs.CreativeTabChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Toby on 27/08/2014.
 */
public class ItemBackpack extends Item
{
    public ItemBackpack()
    {
        super();

        setUnlocalizedName("backpack");
        setTextureName("compactchests:backpack");
        setCreativeTab(CreativeTabChest.tab);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.openGui(CompactChests.instance(), 100, world, (int) player.posX, (int) player.posY, (int) player.posZ);
        return stack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 1;
    }
}
