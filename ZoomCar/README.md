# Zoomcar Design

- Think of the entities that might get involved 
  - Vehicle
  - Booking
  - User
  - Warehouse
  - Payments
  - Invoice
  - Notification [Success , Reminder for pickup]
  - SearchManager[Nearest Warehouse, Cheapest Price]
  - InventoryManager [addVehicle,removeVehicle]

## Design Patterns Involved
- Singleton for Services and Managers
- Strategy for SearchingStrategy,Notification,PaymentType
- Observer for sending and receiving notification

