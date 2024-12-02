package Days;

public class Mainenum {
    public static void main(String[] args) {
        WEEK today = WEEK.THURSDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Bugün ilk is günüdür,we go here againnn :((( ");
                break;

            case TUESDAY:
                System.out.println("Bugün ikinci is günüdür,I will go gym today-legday ");
                break;

            case WEDNESDAY:
                System.out.println("Bugün ücüncü is günüdür,I have a meetings with my friends ");
                break;

            case THURSDAY:
                System.out.println("Bugün dördüncü is günüdür,I will go gym today-cardio day ");
                break;
            case FRIDAY:
                System.out.println("Bugün son is günüdür,Yuppppi I will go party  ");
                break;

            case SATURDAY:
                System.out.println("Bugün is yoxdur,I will go walking at night ");
                break;

            case SUNDAY:
                System.out.println("Bugün is yoxdur,Enjoy last day of weekends ");
                break;

            default:
                System.out.println("Wrong Day selected");

        }


    }
}
