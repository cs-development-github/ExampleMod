package net.chrisDev.chrismod.block;

import net.chrisDev.chrismod.Chrismod;
import net.chrisDev.chrismod.block.custom.SpeedyBlock;
import net.chrisDev.chrismod.item.ModItemGroup;
import net.chrisDev.chrismod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {

    public static  final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Chrismod.MOD_ID);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)), ModItemGroup.ChrisModTab);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)), ModItemGroup.ChrisModTab, "tooltip.chrismod.block.speedy_block");

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return  toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.ChrisModTab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return  toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.ChrisModTab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }



}


