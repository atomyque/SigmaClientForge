package com.example

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "examplemod", useMetadata = true)
class ExampleMod {
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        println("Dirt: ${Blocks.dirt.unlocalizedName}")
    }
}
