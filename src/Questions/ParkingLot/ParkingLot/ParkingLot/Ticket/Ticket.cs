using System;
using ParkingLot.ParkingSpot;
using ParkingLot.Vehicles;

namespace ParkingLot.Ticket
{
    internal class Ticket
    {
        DateTime entryTime;
        BaseParkingSpot parkingSpot;
        IVehicle vehicle;

        public Ticket(DateTime entryTime, BaseParkingSpot parkingSpot,IVehicle vehicle)
        {
            this.entryTime = entryTime;
            this.parkingSpot = parkingSpot;
            this.vehicle = vehicle;
        }
    }
}
