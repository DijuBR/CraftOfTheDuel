package com.dijubr.craftoftheduel.item;

import com.dijubr.craftoftheduel.CraftOfTheDuel;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister ITEMS = DeferredRegister.createItems(CraftOfTheDuel.MOD_ID);
    public static final DeferredItem<Item> CARD = ITEMS.register("card",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
