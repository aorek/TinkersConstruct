package slimeknights.tconstruct.tables.tileentity.table;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraftforge.common.util.LazyOptional;
import slimeknights.tconstruct.shared.inventory.ConfigurableInvWrapperCapability;
import slimeknights.tconstruct.tables.TinkerTables;
import slimeknights.tconstruct.tables.inventory.table.toolstation.ToolStationContainer;
import slimeknights.tconstruct.tables.tileentity.TableTileEntity;

import javax.annotation.Nullable;

public class ToolStationTileEntity extends TableTileEntity {
  public ToolStationTileEntity() {
    super(TinkerTables.toolStationTile.get(), "gui.tconstruct.tool_station", 6);
    this.itemHandler = new ConfigurableInvWrapperCapability(this, false, false);
    this.itemHandlerCap = LazyOptional.of(() -> this.itemHandler);
  }

  @Nullable
  @Override
  public Container createMenu(int menuId, PlayerInventory playerInventory, PlayerEntity playerEntity) {
    return new ToolStationContainer(menuId, playerInventory, this);
  }
}