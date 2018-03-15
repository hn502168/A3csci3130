package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Contact implements Serializable {

    public  String uid;
    public  String Businessnumber;
    public  String Name;
    public  String Primarybusiness;
    public  String Address;
    public  String Proviceterritory;

    public Contact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Contact(String uid, String Businessnumber, String name, String Primarybusiness, String Address, String Proviceterritory){
        this.uid = uid;
        this.Businessnumber = Businessnumber;
        this.Name = name;
        this.Primarybusiness = Primarybusiness;
        this.Address = Address;
        this.Proviceterritory = Proviceterritory;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("Businessnumber", Businessnumber);
        result.put("Name", Name);
        result.put("Primarybusiness", Primarybusiness);
        result.put("Address", Address);
        result.put("Proviceterritory", Proviceterritory);

        return result;
    }
}
