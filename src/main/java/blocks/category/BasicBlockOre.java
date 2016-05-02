package blocks.category;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlockOre extends Block {

    public BasicBlockOre(String name, Material material, float hardness, float resistance) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
    }
}