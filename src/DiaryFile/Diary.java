package DiaryFile;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Diary {
    private final AtomicInteger idGenerator = new AtomicInteger(1);



    private ArrayList<Entry> entries = new ArrayList<>();
    private String userName;
    private String password;
    private boolean isLock;
    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLock = false;

    }

public void unLock(String password)throws CustomerException {
    validatePassword(password);
    isLock = false;





}

    private void validatePassword(String password) throws CustomerException{
        if(!Objects.equals(password, password)){
            throw new CustomerException("PASSWORD INCORRECT");
        }
    }

    public void Lock(){
        isLock = true;
}
//public boolean isLock() {
//
//    return isLock;
//}
//    public void createDiary(String username, String password) {
//    entries.add(username);
//   entries.add(password);
//
//
//    }

    public ArrayList<Entry> getEntries() {

        return entries;
    }


    public void  createEntry(String title, String body) {
        Entry newEntry = new Entry(1, title,body);
      entries.add(newEntry);

    }
//    public int getSize() {
//        return entries.size();
//    }


    public String generateUserName() {

        return userName;
    }




    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public Entry findEntry(int id) throws CustomerException {
        for (Entry newEntry : entries) {
            if (newEntry.getId() == newEntry.getId())return newEntry;
        }

        throw new CustomerException( "ID" + id + "NOT FOUND");
    }


    public boolean getIsLock() {
        return isLock;
    }

    public void deleteEntry(int id) throws CustomerException {
        if(!isLock){
            int entryId = findEntry(id).getId();
            entries.remove(findEntry(id).getId());

        }else {
            throw new CustomerException("diary locked");
        }
    }

    public int getSize() {
        return entries.size();
    }

    public void updateEntry(int id, String title, String body) throws CustomerException {
        if (!isLock) {
            Entry entry = findEntry(id);
            entry.setTitle(title);
            entry.setBody(body);
        }

    }
}

