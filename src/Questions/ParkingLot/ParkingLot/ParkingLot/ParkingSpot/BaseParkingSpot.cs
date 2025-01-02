using ParkingLot.Vehicles;

namespace ParkingLot.ParkingSpot
{
    enum ParkingSpotType
    {
        TwoWheeler,
        FourWheeler,
    };
    internal abstract class BaseParkingSpot
    {
        public int Id { get; private set; }
        public int multiplier;
       
        ParkingSpotType parkingSpotType;
        public bool IsEmpty { get; set; }
        public IVehicle? Vehicle { get; set; }
        protected double PricePerMinute;
        protected readonly List<double> pricingPerHour = [4, 3.5, 3.5, 2.5];

        protected List<double> PricingPerHour   { get => pricingPerHour; }

        void parkVehicle(IVehicle vehicle)
        {
            this.Vehicle = vehicle;
            IsEmpty = false;
        }

        void removeVehicle()
        {
            this.Vehicle = null;
            IsEmpty = true;
        }

        public double GetPricePerMinute()
        {
            return this.PricePerMinute * multiplier;
        }

        public List<double> GetPricePerHour()
        {
            return this.pricingPerHour.Select(price => price * multiplier).ToList();
        }

        protected BaseParkingSpot(int id,ParkingSpotType parkingSpotType)
        { 
            Id = id;
            IsEmpty = true;
            PricePerMinute = 0.25;
            this.parkingSpotType = parkingSpotType;
        }

    }
}
