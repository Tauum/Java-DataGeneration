//import lombok.Builder;
//import lombock.Data;

public class SpaceShip {

        public int ID;
        public String Name;
        public int Delta_V;
        public double Fuel_Balance;
        public char CallSign;
        public String Pilot_Status;
        public boolean Live;


        public SpaceShip(int id, String name, int delta_v, double fuel_balance, char callsign, String pilot_status, boolean live ) {
            this.ID = id;
            this.Name = name;
            this.Delta_V = delta_v;
            this.Fuel_Balance = fuel_balance;
            this.CallSign = callsign;
            this.Pilot_Status = pilot_status;
            this.Live = live;
        }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDelta_V() {
        return Delta_V;
    }

    public void setDelta_V(int delta_V) {
        Delta_V = delta_V;
    }

    public double getFuel_Balance() {
        return Fuel_Balance;
    }

    public void setFuel_Balance(double fuel_Balance) {
        Fuel_Balance = fuel_Balance;
    }

    public char getCallSign() {
        return CallSign;
    }

    public void setCallSign(char callSign) {
        CallSign = callSign;
    }

    public String getPilot_Status() {
        return Pilot_Status;
    }

    public void setPilot_Status(String pilot_Status) {
        Pilot_Status = pilot_Status;
    }

    public boolean isLive() {
        return Live;
    }

    public void setLive(boolean live) {
        Live = live;
    }

    public String getDetails(){  return "ID > " + ID +
            "| Name > " + Name + "| DV > " + Delta_V + "| FB > " + Fuel_Balance +
            "| CS > " + CallSign + "| PS > " + Pilot_Status + "| Live > " + Live; }

}
