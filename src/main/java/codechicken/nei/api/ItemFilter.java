package codechicken.nei.api;

import net.minecraft.item.ItemStack;

public interface ItemFilter {
	boolean matches(ItemStack item);

	/**
	 * Provides an item filter. May be called from any thread. Returned filter should only reference objects with immutable state.
	 */
	interface ItemFilterProvider {
		ItemFilter getFilter();
	}
}