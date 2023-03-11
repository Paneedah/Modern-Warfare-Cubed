package com.paneedah.mwc.skins;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleItems;
import com.paneedah.weaponlib.melee.MeleeSkin;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class MeleeSkins {

    public static MeleeSkin CrimsonBlood;
    public static MeleeSkin Chrome;
    public static MeleeSkin GodWillsIt;
    public static MeleeSkin Murasaki;
    public static MeleeSkin Evangelion;

    public static void init(Object mod, CompatibleFmlPreInitializationEvent event) {
        CrimsonBlood = new MeleeSkin.Builder()
        .withTextureVariant("TacKnifeCrimsonBlood")

        .withCreativeTab(ModernWarfareMod.AttachmentsTab)
        .withName("CrimsonBlood")
        .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 0, 0),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 1, 1)
                )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Chrome = new MeleeSkin.Builder()
        .withTextureVariant("TacKnifeChrome")

        .withCreativeTab(ModernWarfareMod.AttachmentsTab)
        .withName("Chrome")
        .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 11, 11)
                )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        GodWillsIt = new MeleeSkin.Builder()
        .withTextureVariant("TacKnifeGodWillsIt")

        .withCreativeTab(ModernWarfareMod.AttachmentsTab)
        .withName("GodWillsIt")
        .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 11, 11),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 15, 15)
                )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Murasaki = new MeleeSkin.Builder()
        .withTextureVariant("TacKnifeMurasaki")

        .withCreativeTab(ModernWarfareMod.AttachmentsTab)
        .withName("Murasaki")
        .withCraftingRecipe("AA",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5)
                )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Evangelion = new MeleeSkin.Builder()
        .withTextureVariant("TacKnifeEvangelion")

        .withCreativeTab(ModernWarfareMod.AttachmentsTab)
        .withName("Evangelion")
        .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 10, 10)
                )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);
    }

}