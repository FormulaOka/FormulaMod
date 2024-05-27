package net.mcreator.formula.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SwordsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1, 7));
	}
}
