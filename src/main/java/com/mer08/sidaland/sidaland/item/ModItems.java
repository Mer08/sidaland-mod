package com.mer08.sidaland.sidaland.item;

import com.mer08.sidaland.sidaland.Sidaland;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Sidaland.MODID);

    public static final RegistryObject<Item> SIDACOIN_ORO = ITEMS.register("sidacoin_oro",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SIDACOIN_PLATA = ITEMS.register("sidacoin_plata",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SIDACOIN_BRONCE = ITEMS.register("sidacoin_bronce",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.COMMON)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }

}
