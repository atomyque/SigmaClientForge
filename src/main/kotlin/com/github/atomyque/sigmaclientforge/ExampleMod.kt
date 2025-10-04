package com.github.atomyque.sigmaclientforge

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "sigmaclientforge", useMetadata = true)
class ExampleMod {
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        println("Dirt: ${Blocks.dirt.unlocalizedName}")
    }
}
