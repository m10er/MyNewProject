package applications.horoscopePrediction;

import api.ProjectController;
import applications.horoscopePrediction.Service.HoroscopeService;
import applications.horoscopePrediction.Service.HoroscopeServiceTurkce;
import users.User;

public class HoroscopePredictionManager {

    ProjectController projectController;
   HoroscopeService horoscopeService;
    User user;

    public HoroscopePredictionManager(User user, String languageLetter) {
        projectController= new ProjectController();
        this.user = user;
        if (languageLetter.equalsIgnoreCase("T")) {
           this.horoscopeService= new HoroscopeServiceTurkce();
        } else {
            System.out.println("Only Turkish option is available in this application.");
            projectController.start(user,languageLetter);
        }
        this.user = user;
        horoscopeService.startHoroscopePrediction();

    }
}
