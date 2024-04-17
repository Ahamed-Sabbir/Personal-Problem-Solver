
package Features;
public class CalculateEventTime {
    int start_h, start_m, end_h, end_m;
    CalculateEventTime(int start_h, int start_m, int end_h, int end_m){
        this.start_h = start_h;
        this.start_m = start_m;
        this.end_h = end_h;
        this.end_m = end_m;
    }
   int d_hr, d_min;
   void calculate_duration(){
    d_hr = end_h - start_h;
    if(d_hr < 0) d_hr = 24 + d_hr;
    d_min = end_m - start_m;
    if(d_min < 0) {
        d_min = 60 + d_min;
        d_hr--;
        if(d_hr < 0) d_hr = 24 + d_hr;
    }
   }
   int hour(){
       if(d_hr == 0 && d_min == 0) return 24;
       return d_hr;
   }
   int min(){
       return d_min;
   }
}
