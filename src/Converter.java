public class Converter {
    double stepLength = 0.75;
    int кilometres = 1000;
    double caloriesPerStep = 0.5;
    int kilocalories = 100;


    double distanceInKilometres(int sum){
        double distanceStep = stepLength/кilometres;
        return sum * distanceStep;
    }
    double calories(int sum){
        double oneStep = caloriesPerStep/kilocalories;
        return  sum * oneStep;
    }
}

