package InMemoryModel;

import java.util.List;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Scene;
import ModelElements.PoligonalModel.PoligonalModel; 

public class ModelStore {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers; 

    public Scene getScena(Integer number) {
        return new Scene();
    }

    public void NotifyChange(IModelChanger sender) {}

    
}
