package com.workshop.compactchests.block;

import com.workshop.compactchests.creativetabs.CreativeTabChest;
import com.workshop.compactchests.tileentity.TileEntityTripleChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Toby on 19/08/2014.
 */
public class BlockTripleChest extends BlockChest
{
    public BlockTripleChest()
    {
        super(1);

        setBlockName("triplechest");
        setHardness(1f);
        setResistance(1f);

        setCreativeTab(CreativeTabChest.tab);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int dim)
    {
        return new TileEntityTripleChest();
    }
}
