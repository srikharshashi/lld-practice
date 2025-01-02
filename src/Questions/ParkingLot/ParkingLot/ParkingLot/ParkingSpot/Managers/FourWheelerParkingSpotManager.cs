using System;
using System.Collections.Generic;

namespace ParkingLot.ParkingSpot.Managers
{
    internal class FourWheelerParkingSpotManager : ParkingSpotManager
    {
        private static FourWheelerParkingSpotManager? _instance;

        private FourWheelerParkingSpotManager(List<BaseParkingSpot> parkingSpots) : base(parkingSpots)
        {
        }

        public static FourWheelerParkingSpotManager Instance(List<BaseParkingSpot> parkingSpots)
        {
            if (_instance == null)
            {
                _instance = new FourWheelerParkingSpotManager(parkingSpots);
            }
            return _instance;
        }
    }
}
