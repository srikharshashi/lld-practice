namespace ParkingLot.ParkingSpot
{
    internal class ParkingSpotFactory
    {
        BaseParkingSpot GetParkingSpot(int id, ParkingSpotType parkingSpotType)
        {
            if (parkingSpotType == ParkingSpotType.TwoWheeler )
            {
                return new TwoWheelerParkingSpot(id, parkingSpotType);
            }
            else
            {
                return new FourWheelerParkingSpot(id, parkingSpotType);
            }
        }
    }
}
