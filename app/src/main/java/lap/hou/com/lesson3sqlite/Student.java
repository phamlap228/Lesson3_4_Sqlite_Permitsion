package lap.hou.com.lesson3sqlite;

/**
 * Created by Lap on 14/10/2017.
 */

public class Student  {
    private int mId;
    private String mName;
    private String mAddress;
    private String mPhone_number;

    public Student(int id, String name, String address, String phone_number) {
        mId = id;
        mName = name;
        mAddress = address;
        mPhone_number = phone_number;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getPhone_number() {
        return mPhone_number;
    }

    public void setPhone_number(String phone_number) {
        mPhone_number = phone_number;
    }
}
