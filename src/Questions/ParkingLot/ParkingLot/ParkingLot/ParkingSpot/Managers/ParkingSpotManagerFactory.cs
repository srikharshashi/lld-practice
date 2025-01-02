using System;
using System.Collections.Generic;

namespace ParkingLot.ParkingSpot.Managers
{
    internal class ParkingSpotManagerFactory
    {
        private static ParkingSpotManagerFactory? _instance;

        private ParkingSpotManagerFactory() { }

        public static ParkingSpotManagerFactory Instance
        {
            get
            {
                if (_instance == null)
                {
                    _instance = new ParkingSpotManagerFactory();
                }
                return _instance;
            }
        }

        public ParkingSpotManager GetParkingSpotManager(ParkingSpotType parkingSpotType, List<BaseParkingSpot> parkingSpots)
        {
            switch (parkingSpotType)
            {
                case ParkingSpotType.TwoWheeler:
                    return TwoWheelerParkingSpotManager.Instance(parkingSpots);
                case ParkingSpotType.FourWheeler:
                    return FourWheelerParkingSpotManager.Instance(parkingSpots);
                default:
                    throw new Exception("Invalid Parking Spot Type");
            }
        }
    }
}
