package service;

import model.Spectacle;
import repositories.SpectacleRepository;

import java.util.ArrayList;

public class SpectacleService {

    private SpectacleRepository spectacleRepository = new SpectacleRepository();
    private static SpectacleService instance = new SpectacleService();

    private SpectacleService() { }

    public static SpectacleService getInstance() {
        return instance;
    }

    public void addSpectacle(Spectacle spectacle) {
        spectacleRepository.add(spectacle);
    }

    public Spectacle getSpectacleById(int id) {
        return spectacleRepository.getSpectacleById(id);
    }

    public Spectacle getSpectacleByTitle(String title) {
        return spectacleRepository.getSpectacleByTitle(title);
    }

    public ArrayList<Spectacle> getAllSpectacles() {
        return spectacleRepository.getAll();
    }

    public void changePriceByIdSpectacle(int id, int price) {
        Spectacle spectacle = spectacleRepository.getSpectacleById(id);
        if(spectacle == null) {
            System.out.println("This spectacle doesn't exist.");
        } else {
            spectacle.setPrice(price);
        }
    }

    public void showSpectacle(Spectacle spectacle) {
        spectacleRepository.show(spectacle);
    }

}
