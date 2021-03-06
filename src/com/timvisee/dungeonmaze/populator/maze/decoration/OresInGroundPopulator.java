package com.timvisee.dungeonmaze.populator.maze.decoration;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

public class OresInGroundPopulator extends BlockPopulator {
	public static final int CHANCE_OF_ORE = 5; //Promile

	@Override
	public void populate(World world, Random random, Chunk source) {
		// The layers for each 4 rooms in the variable y
		for (int y=1; y <= 29; y+=1) {
			for (int x=0; x < 16; x+=1) {
				for (int z=0; z < 16; z+=1) {
					
					if (random.nextInt(1000) < CHANCE_OF_ORE) {
						switch (random.nextInt(9)) {
    					case 0:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.GOLD_ORE);
    						break;
    					case 1:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.IRON_ORE);
    						break;
    					case 2:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.COAL_ORE);
    						break;
    					case 3:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.LAPIS_ORE);
    						break;
    					case 4:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.DIAMOND_ORE);
    						break;
    					case 5:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.REDSTONE_ORE);
    						break;
    					case 6:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.EMERALD_ORE);
    						break;
    					case 7:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.CLAY);
    						break;
    					case 8:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.COAL_ORE);
    						break;
    					default:
    						source.getBlock((source.getX() * 16) + x, y, (source.getZ() * 16) + z).setType(Material.COAL_ORE);
						}
					}
				}
			}
		}
	}
}