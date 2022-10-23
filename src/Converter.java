public class Converter {
    double distanceInKilometres(int sum){
        double distanceStep = 0.75/1000;
        return sum * distanceStep;
    }
    double calories(int sum){
        double oneStep = 50/1000;
        return  sum * oneStep;
    }
}

