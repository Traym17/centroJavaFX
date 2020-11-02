package backend;

import java.util.ArrayList;

public class Datos {
    private ArrayList<Subscriptor>subscriptors;

    public Datos(ArrayList<backend.Subscriptor> subscriptor) {
        subscriptors=new ArrayList<>();
    }

    public Datos() {

    }

    public boolean registrarSubscriptor(Subscriptor subscriptor){
        if(subscriptors.add(subscriptor)){
            return true;
        }else {
            return false;
        }
    }
}
