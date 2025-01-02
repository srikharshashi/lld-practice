
namespace ParkingLot.ParkingSpot
{
    internal class FourWheelerParkingSpot : BaseParkingSpot
    {
        public FourWheelerParkingSpot(int id, ParkingSpotType parkingSpotType) : base(id,parkingSpotType)
        {
            multiplier = 4;
        }
    }   
    
}
