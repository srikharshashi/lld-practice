using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingLot.Vehicles
{
    internal class Bike : IVehicle
    {
        public VehicleType VehicleType { get; set; }
        public string VehicleNumber { get; set; }

        Bike(string vehicleNumber)
        {
            VehicleType = VehicleType.TwoWheeeler;
            VehicleNumber = vehicleNumber;

        }
    }
}
