package com.mer08.sidaland.sidaland.events;

import com.mer08.sidaland.sidaland.Sidaland;
import com.mer08.sidaland.sidaland.events.loot.orodrop;
import com.mer08.sidaland.sidaland.events.loot.platadrop;
import com.mer08.sidaland.sidaland.events.loot.broncedrop;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Sidaland.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new orodrop.Serializer().setRegistryName
                        (new ResourceLocation(Sidaland.MODID,"sidacoinoro")),
                new platadrop.Serializer().setRegistryName
                        (new ResourceLocation(Sidaland.MODID,"sidacoinplata")),
                new broncedrop.Serializer().setRegistryName
                        (new ResourceLocation(Sidaland.MODID,"sidacoinbronce")));
    }
}
