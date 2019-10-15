import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int networkCapacity;

    public Network(String name, int networkCapacity){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.networkCapacity = 5;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device) {
        if(freeSlots() < networkCapacity){
            devices.add(device);
    }
    }


    public void disconnectAll(){
        devices.clear();
    }

    public int freeSlots(){
        return devices.size() - networkCapacity;
    }
}