package repositories;

import model.Spectacle;

import java.util.ArrayList;

public class SpectacleRepository {

    private ArrayList<Spectacle> spectacles;

    public SpectacleRepository() {
        spectacles = new ArrayList<>();
    }

    public void add(Spectacle spectacle) {
        spectacles.add(spectacle);
    }

    public Spectacle getSpectacleById(int id) {
        for(Spectacle spectacle : spectacles) {
            if(spectacle.getId() == id) {
                return spectacle;
            }
        }
        return null;
    }

    public Spectacle getSpectacleByTitle(String title) {
        for(Spectacle spectacle : spectacles) {
            if(spectacle.getTitle().equals(title)) {
                return spectacle;
            }
        }
        return null;
    }

    public ArrayList<Spectacle> getAll() {
        return spectacles;
    }

    public void show(Spectacle spectacle) {
        spectacle.show();
    }

}
