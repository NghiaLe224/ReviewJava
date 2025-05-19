package section12.generics.challenge;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable>{
    private List<T> elements;

    public Layer(T[] layerElements) {
        this.elements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElements(T... t){
            this.elements.addAll(List.of(t));
    }

    public void renderLayer(){
        for(T t : this.elements){
            t.render();
        }
    }
}
