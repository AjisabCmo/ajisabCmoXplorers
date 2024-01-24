package DiaryFile;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;

    private LocalDateTime date = LocalDate.now().atStartOfDay();


    public Entry(int i, String title, String body){
        this.id = id ;
        this.title = title ;
        this.body = body;
        this.date = LocalDate.now().atStartOfDay();
    }


    public int getId() {
        return  id;
    }

    public String getDiaryDetails() {
        return title() + " " + body();
    }

    private String body() {
        return body;
    }

    private String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setBody(String body) {
        this.body=body;
    }
}




