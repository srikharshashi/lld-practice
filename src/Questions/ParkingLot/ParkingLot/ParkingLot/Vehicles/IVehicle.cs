using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingLot.Vehicles
{
    enum VehicleType
    {
        TwoWheeeler,
        FourWheeler,
    }

    internal interface IVehicle
    {
        VehicleType VehicleType { get; set; }
        string VehicleNumber { get; set; }

    }
}
