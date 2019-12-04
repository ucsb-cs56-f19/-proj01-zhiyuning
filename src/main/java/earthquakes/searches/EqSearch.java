package earthquakes.searches;

public class EqSearch{
    private int distance;
    private int minmag;
    private int lat;
    private int lon;
    private String location;

    
    
    public int getDistance(){
	return distance;
    }

    public int getMinmag(){
	return minmag;
    }

    public int getLat(){
	return lat;
    }

    public int getLon(){
	return lon;
    }

    public String getLocation(){
	return location;
    }

    
    public void setDistance(int distant){
	distance = distant;
    }
    
    public void setMinmag(int MM){
	minmag = MM;
    }

    public void setLat(int Latitude){
	lat = Latitude;
    }

    public void setLon(int Longtitude){
	lon = Longtitude;
    }

    public void setLocation(String Location){
	location = Location;
    }

}
