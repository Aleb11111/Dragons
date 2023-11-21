package net.ale.dragon_mod.item;

import net.ale.dragon_mod.DragonMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonMod.MOD_ID);

    public static final RegistryObject<Item> DRAGON_EGG = ITEMS.register("dragon_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGON_CLAW = ITEMS.register("dragon_claw",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
