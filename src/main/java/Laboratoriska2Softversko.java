import java.util.ArrayList;
import java.util.List;

public class Laboratoriska2Softversko {

    class Time {
        int hours;
        int minutes;
        int seconds;

        public Time(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public int getHours() {
            return hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public int getSeconds() {
            return seconds;
        }
    }

    public class SILab2 {

        public List<Integer> function(List<Time> timesList) {//A
            List<Integer> result = new ArrayList<>();//A

            for (int i = 0; i < timesList.size(); i++) { //A
                int hr = timesList.get(i).getHours(); //A
                int min = timesList.get(i).getMinutes();//A
                int sec = timesList.get(i).getSeconds();//A
                if (hr < 0 || hr > 24){ //A
                    if (hr < 0){//B
                        throw new RuntimeException("The hours are smaller than the minimum");//C
                    }
                    else {//D
                        throw new RuntimeException("The hours are grater than the maximum");//E
                    }
                }
                else if (hr < 24) {//F
                    if (min < 0 || min > 59)//G
                        throw new RuntimeException("The minutes are not valid!");//H
                    else {//I
                        if (sec >= 0 && sec <= 59)//J
                            result.add(hr * 3600 + min * 60 + sec);//K
                        else//L
                            throw new RuntimeException("The seconds are not valid");//M
                    }
                }
                else if (hr == 24 && min == 0 && sec == 0) {//N
                    result.add(hr * 3600 + min * 60 + sec);//O
                }
                else {//P
                    throw new RuntimeException("The time is greater than the maximum");//Q
                }
            }
            return result;//R
        }
    }
public static void main(String[] args){

}


}
