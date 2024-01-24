
import DiaryFile.CustomerException;
import DiaryFile.Diaries;
import DiaryFile.Diary;
import DiaryFile.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {


    @BeforeEach
    public void setUp() {
        Diary diary = new Diary("ismail", "password");
        diary.Lock();

    }

    @Test
    public void testingUnlockWithPassword() throws CustomerException {
        Diary diary = new Diary("ismail", "password");

        diary.unLock("password");

        boolean mine = diary.getIsLock();

        assertFalse(mine);
    }

    @Test
    public void testingTOUnlockWithWrongPassword() throws CustomerException {

        Diary diary = new Diary("ismail", "password");
        assertThrows(CustomerException.class, () -> diary.unLock("KKK"));

    }

    @Test
    public void TestThatICanCreateEntry() throws CustomerException {
        Diary diary = new Diary("ismail", "password");
        Diaries diaries = new Diaries();

        diary.createEntry("title", "body");
        assertEquals(new Entry(1, "title", "body").getId(), diary.findEntry(1).getId());
    }

    @Test
    public void testingToGetMoreEntry() throws CustomerException {

        Diary diary = new Diary("ismail", "password");

        diary.createEntry("title", "body");

        assertEquals(new Entry(1, "title", "body").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2, "title", "body").getId(), diary.findEntry(2).getId());

    }

//    @Test
//    public void testThatDiaryIsUnlocked() {
//        Diary diary = new Diary("ismail","password");
//        assertTrue(diary.unLock("password"));


    @Test
    public void testThatDiaryCanCollectUserNameAndPassWord() {
        Diary diary = new Diary("ismail", "password");
        diary = new Diary(diary.getUserName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getUserName(), diary.getPassword());
        assertEquals(1, diaries.userNameCount());
    }

    @Test
    public void testThatDiaryCanFindUserName() {
        Diary diary = new Diary("ismail", "password");
        diary = new Diary(diary.getUserName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getUserName(), diary.getPassword());
        assertEquals(1, diaries.userNameCount());
        Diary newUserName = diaries.findByUserName("ismail");
        assertEquals("ismail", newUserName.generateUserName());

    }

    @Test
    public void testForDeleteEntry() throws CustomerException {
        Diary diary = new Diary("ismail", "password");
        diary.unLock("password");
        diary.createEntry("title", "body");
        assertEquals(new Entry(1, "title", "body").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2, "title", "body").getId(), diary.findEntry(2).getId());

        diary.deleteEntry(1);
        int checkSize = diary.getSize();
        assertEquals(0, checkSize);


    }
    @Test
    public void testToUpdateDiary() throws CustomerException {
        Diary diary = new Diary("ismail", "password");
        diary.unLock("password");
        diary.createEntry("title", "body");
        assertEquals(new Entry(1, "title", "body").getId(), diary.findEntry(1).getId());
        assertEquals(new Entry(2, "title", "body").getId(), diary.findEntry(2).getId());
diary.updateEntry(2,"man","humanbeing");
        String check = diary.findEntry(2).getDiaryDetails();
        assertEquals("man humanbeing", check);

    }


}

//}
