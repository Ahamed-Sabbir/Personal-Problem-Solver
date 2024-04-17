package Features;
//parent class
public class CalculationOfTracker {
    int value1, value2, value3, value4;
    CalculationOfTracker(int value1, int value2, int value3, int value4){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }
    int value_ara[] = new int[4];
    int total_study_hour(){
        return value1+value2+value3+value4;
    }
    
    int health_time(){
        int min = (value2*30) + (value3*15) + (value4*60);
        return min;
    }
    
    int distance(){
        int distance_meter = (value2*400) + (value3*1000);
        return distance_meter;
    }
}
