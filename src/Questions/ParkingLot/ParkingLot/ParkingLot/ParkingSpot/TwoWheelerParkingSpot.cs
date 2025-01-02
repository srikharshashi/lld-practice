namespace ParkingLot.ParkingSpot
{
    internal class TwoWheelerParkingSpot : BaseParkingSpot
    {
        public TwoWheelerParkingSpot(int id,ParkingSpotType parkingSpotType) : base(id,parkingSpotType)
        {
            multiplier = 2;
        }
    }
}
