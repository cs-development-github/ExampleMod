package net.chrisDev.chrismod.item;

import net.chrisDev.chrismod.Chrismod;
import net.chrisDev.chrismod.item.custom.CoalCokeItem;
import net.chrisDev.chrismod.item.custom.DowsingRodItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chrismod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ChrisModTab)) );

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ChrisModTab)) );

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModItemGroup.ChrisModTab).durability(16)) );

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ChrisModTab).food(ModFoods.CUCUMBER)) );

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModTiers.CITRINE , 2 , 3f , new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModTiers.CITRINE , 2 , 3f , new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModTiers.CITRINE , 2 , 3f , new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModTiers.CITRINE , 2 , 3f , new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModTiers.CITRINE , 2 , 3f , new Item.Properties().tab(ModItemGroup.ChrisModTab)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
