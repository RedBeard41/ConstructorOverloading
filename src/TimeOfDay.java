public class TimeOfDay {

    //instance variables
    private int mHour;
    private int mMinutes;

    //constructors
    public TimeOfDay() {
        this(0,0);
    }
    public TimeOfDay(int pHour) {
        this(pHour,0);
    }

    public TimeOfDay(int pHour, int pMinutes) {
        this.mHour = pHour;
        this.mMinutes = pMinutes;
    }






    public int getmHour() {
        return mHour;
    }




    public int getmMinutes() {
        return mMinutes;
    }
}
