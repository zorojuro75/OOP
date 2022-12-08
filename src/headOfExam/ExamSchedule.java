package headOfExam;

import javafx.beans.property.SimpleStringProperty;

public class ExamSchedule {
    SimpleStringProperty ExName, ExCode,ExDate,Extime;

    public ExamSchedule(String exName, String exCode, String exDate, String extime) {
        this.ExName=new SimpleStringProperty(exName);
        this.ExCode=new SimpleStringProperty(exCode);
        this.ExDate=new SimpleStringProperty(exDate);
        this.Extime=new SimpleStringProperty(extime);
//        System.out.println(" Write Done");
//        System.out.println(ExName);
//        System.out.println(ExCode);
//        System.out.println(ExDate);
//        System.out.println(Extime);


    }

    public String getExName() {
        return ExName.get();
    }

    public String getExCode() {
        return ExCode.get();
    }

    public String getExDate() {
        return ExDate.get();
    }

    public String getExtime() {
        return Extime.get();
    }
}
