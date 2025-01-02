using System;
using System.Collections.Generic;

namespace ParkingLot.ParkingSpot.Managers
{
    internal class TwoWheelerParkingSpotManager : ParkingSpotManager
    {
        private static TwoWheelerParkingSpotManager? _instance;

        private TwoWheelerParkingSpotManager(List<BaseParkingSpot> parkingSpots) : base(parkingSpots)
        {
        }

        public static TwoWheelerParkingSpotManager Instance(List<BaseParkingSpot> parkingSpots)
        {
            if (_instance == null)
            {
                _instance = new TwoWheelerParkingSpotManager(parkingSpots);
            }
            return _instance;
        }
    }
}
