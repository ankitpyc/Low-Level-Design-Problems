package entities.Inventory;

import entities.Bookings.Vehicle;
import entities.Respository.WareHouseRepository;
import entities.WareHouse.WareHouses;

import java.util.List;

public class InventoryManager {

    private static InventoryManager instance = null;

    private static WareHouseRepository repository;

    private InventoryManager() {
        repository = WareHouseRepository.getInstance();
    }

    public static synchronized InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void AddInventory(Integer warehouseId, List<Vehicle> vehicleList) {
        WareHouses wareHouses = repository.addVehicles(warehouseId, vehicleList);
    }

    public void removeVehicle(Integer warehouseId, Integer vehicleId) {
        WareHouses wareHouses = repository.removeVehicles(warehouseId, vehicleId);
    }

}
