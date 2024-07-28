package com.vasukotadiya.bbadmin.Interface;
import com.vasukotadiya.bbadmin.Model.IDs;

import java.util.List;

public interface IFirebaseLoadDone {
    void onFirebaseLoadSuccess(List<IDs> LocationList);
    void onFirebaseLoadFailed(String Message);
}


