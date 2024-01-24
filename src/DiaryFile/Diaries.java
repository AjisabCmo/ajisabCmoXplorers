package DiaryFile;

import java.util.ArrayList;

public class Diaries {
    ArrayList<Diary> diaries = new ArrayList<>();


public void add(String userName ,String password){
    String nameOne= generateUserName(userName);
    String passWord= generatePassWord(password);
    Diary diary = new Diary(nameOne, passWord);
    diaries.add(diary);
}

    private String generatePassWord(String password) {
        return password;
    }

    private String generateUserName(String userName) {
        return userName;
    }
    public Diary findByUserName(String userName){
    for (Diary diary: diaries){
        if (diary.generateUserName().equals(userName)){
            return diary;
        }

    }
        throw new InvalidUserName("UserName not found");
    }
    public int userNameCount(){

        return diaries.size();
    }
}
