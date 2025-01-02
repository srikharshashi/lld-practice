using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingLot.Vehicles
{
    internal class Car : IVehicle
    {
        public VehicleType VehicleType { get; set; }
        public string VehicleNumber { get; set; }

        Car(string vehicleNumber)
        {
            VehicleType = VehicleType.FourWheeler;
            VehicleNumber = vehicleNumber;

        }
    }
}
