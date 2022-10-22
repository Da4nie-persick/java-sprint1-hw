public class Converter {
    double distanceInKilometres(int sum){
        double distanceStep = 0.00075;
        return sum * distanceStep;
    }
    double calories(int sum){
        double oneStep = 0.05;
        return  sum * oneStep;
    }
}

