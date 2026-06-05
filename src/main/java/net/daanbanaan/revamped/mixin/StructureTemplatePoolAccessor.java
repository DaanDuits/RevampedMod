package net.daanbanaan.revamped.mixin;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.datafixers.util.Pair;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

@Mixin(StructureTemplatePool.class)
public interface StructureTemplatePoolAccessor {
	@Accessor("rawTemplates")
	List<Pair<StructurePoolElement, Integer>> getRawTemplates();
	@Accessor("rawTemplates")
    @Mutable 
    void setRawTemplates(List<Pair<StructurePoolElement, Integer>> rawTemplates);
	
	@Accessor("templates")
	ObjectArrayList<StructurePoolElement> getTemplates();
}
