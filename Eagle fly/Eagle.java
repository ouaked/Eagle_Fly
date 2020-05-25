public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("TakeOff!");
    }

    @Override
	public int ascend(int meters) {
        System.out.println(this.getName() + " ascending " + meters);
        this.setAltitude(getAltitude() + meters);
         System.out.println("Height is " + this.getAltitude());
       return this.getAltitude();
	}
	
    @Override
	public int descend(int meters) {
        System.out.println(this.getName() + " descending " + meters);
        if (this.getAltitude() < meters) {
         	System.out.println("Height is " + this.getAltitude());
         	System.out.println("cannot descend any more!");
        }
        else {       	
        	this.setAltitude(this.getAltitude() - meters);
        	System.out.println("Height is " + this.getAltitude());
        }
       	return this.getAltitude();
	}

    @Override
	public void land () {
        System.out.println("Land");
        this.setAltitude(0);
	}

    @Override
	public void glide () {
        System.out.println("glides into the air.");
	}


}


