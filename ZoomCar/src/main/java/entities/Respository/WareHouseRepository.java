package entities.Respository;

import entities.Bookings.Vehicle;
import entities.Repository;
import entities.WareHouse.WareHouses;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class WareHouseRepository implements Repository<WareHouses> {

    private final AtomicInteger warehouseId;

    private static ConcurrentHashMap<Integer, WareHouses> wareHouseHashMap;

    private static WareHouseRepository instance = null;

    private WareHouseRepository() {
        wareHouseHashMap = new ConcurrentHashMap<>();
        warehouseId = new AtomicInteger(0);
    }

    public static synchronized WareHouseRepository getInstance() {
        if (instance == null) instance = new WareHouseRepository();
        return instance;
    }

    public WareHouses save(WareHouses wareHouses) {
        wareHouseHashMap.put(warehouseId.incrementAndGet(), wareHouses);
        wareHouses.setWarehouseId(warehouseId.get());
        return wareHouses;
    }

    public WareHouses addVehicles(Integer wareHouseId, List<Vehicle> vehicles) {
        WareHouses wareHouses = wareHouseHashMap.get(warehouseId.incrementAndGet());
        wareHouses.getVehicles().addAll(vehicles);
        return wareHouses;
    }

    public WareHouses removeVehicles(Integer wareHouseId, Integer vehicleId) {
        WareHouses wareHouses = wareHouseHashMap.get(warehouseId.incrementAndGet());
        List<Vehicle> vehicles = wareHouses.getVehicles().stream().filter(vehicle -> !vehicle.getVehicleId().equals(vehicleId)).collect(Collectors.toList());
        wareHouses.setVehicles(vehicles);
        wareHouseHashMap.put(wareHouseId, wareHouses);
        return wareHouses;
    }

}
