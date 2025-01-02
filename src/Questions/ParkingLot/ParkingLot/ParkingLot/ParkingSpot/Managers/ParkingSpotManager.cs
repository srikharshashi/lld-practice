using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ParkingLot.Vehicles;

namespace ParkingLot.ParkingSpot.Managers
{
    internal abstract class ParkingSpotManager
    {
        List<BaseParkingSpot> parkingSpots;

        private BaseParkingSpot FindParkingSpace()
        {
            return parkingSpots[0];
        }

        void AddParkingSpot(BaseParkingSpot parkingSpot)
        {
            parkingSpots.Add(parkingSpot);
        }

        void RemoveParkingSpot(BaseParkingSpot parkingSpot)
        {
            parkingSpots.Remove(parkingSpot);
        }

        void ParkVehicle(IVehicle vehicle)
        {
            BaseParkingSpot parkingSpot = FindParkingSpace();
            parkingSpot.Vehicle = vehicle;
            parkingSpot.IsEmpty = false;

        }

        void UnParkVehicle(IVehicle vehicle)
        {
            BaseParkingSpot parkingSpot = parkingSpots.Find(p => p.Vehicle == vehicle)!;
            parkingSpot!.Vehicle = null;
            parkingSpot.IsEmpty = true;
        }



        public ParkingSpotManager(List<BaseParkingSpot> parkingSpots)
        {
            this.parkingSpots = parkingSpots;
        }



    }
}
