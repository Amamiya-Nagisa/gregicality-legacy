package gregicadditions.integrations.mysticalagriculture;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraftforge.common.util.EnumHelper;

import java.util.function.Predicate;

public class MysticalAgricultureEnum {

    public static void preInit() {
        /*EnumHelper.addEnum(MaterialIconType.class, "seed", new Class[0]);
        EnumHelper.addEnum(MaterialIconType.class, "crop", new Class[0]);
        EnumHelper.addEnum(MaterialIconType.class, "essence", new Class[0]);

        EnumHelper.addEnum(OrePrefix.class, "seed",
                new Class[]{String.class, long.class, Material.class, MaterialIconType.class, long.class, Predicate.class},
                "Seed", -1L, null, MaterialIconType.valueOf("seed"), OrePrefix.Flags.ENABLE_UNIFICATION | OrePrefix.Flags.DISALLOW_RECYCLING,
                pred((mat) ->
                        mat instanceof DustMaterial));

        EnumHelper.addEnum(OrePrefix.class, "crop",
                new Class[]{String.class, long.class, Material.class, MaterialIconType.class, long.class, Predicate.class},
                "Crop", -1L, null, MaterialIconType.valueOf("crop"), OrePrefix.Flags.ENABLE_UNIFICATION | OrePrefix.Flags.DISALLOW_RECYCLING,
                pred((mat) ->
                        mat instanceof DustMaterial));

        EnumHelper.addEnum(OrePrefix.class, "essence",
                new Class[]{String.class, long.class, Material.class, MaterialIconType.class, long.class, Predicate.class},
                "Essence", -1L, null, MaterialIconType.valueOf("essence"), OrePrefix.Flags.ENABLE_UNIFICATION | OrePrefix.Flags.DISALLOW_RECYCLING,
                pred((mat) ->
                        mat instanceof DustMaterial));


        ignoreMysticalAgriculture(Materials.Paper);
        ignoreMysticalAgriculture(Materials.Glass);
        ignoreMysticalAgriculture(Materials.Wood);
        ignoreMysticalAgriculture(Materials.Wheat);*/

    }

    public static void ignoreMysticalAgriculture(Material material) {
        OrePrefix.getPrefix("seed").setIgnored(material);
        OrePrefix.getPrefix("crop").setIgnored(material);
        OrePrefix.getPrefix("essence").setIgnored(material);

    }

    private static Predicate<Material> pred(Predicate<Material> in) {
        return (mat) -> in.test(mat);
    }
}
