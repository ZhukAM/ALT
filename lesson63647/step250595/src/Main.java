class Clock {

    int hours = 12;  // 1 ... 12
    int minutes = 0; // 0 ... 59
    void next(){
        if (minutes == 59 & hours == 12) {
            hours = 1;
            minutes = 0;
        } else if(minutes == 59 & hours != 12){
            hours++;
            minutes = 0;
        } else minutes++;
    }    
}