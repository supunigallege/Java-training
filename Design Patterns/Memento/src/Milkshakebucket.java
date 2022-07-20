import java.util.ArrayList;

public class Milkshakebucket {
	ArrayList<Layer> layers = new ArrayList<>();

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public ArrayList<Layer> getLayers() {
        return (ArrayList) layers.clone();

    }

    public MilkshakeMemento save() {
        return new MilkshakeMemento(getLayers());
    }

    public void revert(MilkshakeMemento milkshakeMemento) {
        layers = milkshakeMemento.getlLayers();
    }

    @Override
    public String toString() {
        return "PizzaBasket{" + "layers" + layers + '}';
    }

    static class MilkshakeMemento {
        ArrayList<Layer> layers;

        public MilkshakeMemento(ArrayList<Layer> layers) {
            this.layers = layers;
        }

        private ArrayList<Layer> getlLayers() {
            return layers;
        }

    }

}
