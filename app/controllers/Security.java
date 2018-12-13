package controllers;

import models.Teacher;

public class Security extends Secure.Security {

    static boolean authenticate(String username,String password){

        boolean sec= username!=null&&password!=null
                &&username.equals("root")
                && password.equals("123456789");
            session.put("currentUser", username);
            return sec;
//        return Teacher.connect(username,password)!=null;
    }
//    public static boolean check(String profile) {
//
//        if(Security.isConnected()){
//            if(profile.equals("admin")) {
//                String tea_id = Security.connected();
//                Teacher t = Teacher.find("byTea_id", tea_id).first();
//                return t.isAdmin;
//            }
//            else {
//                // 其他角色的判断...
//                return true;
//            }
//        }
//        else
//            return false;
//    }


    public static boolean check(String profile){
        if(Security.isConnected()){
            String user = Security.connected();
            boolean rst = false;
            if(profile.equals("studentNameModify") && user.equals("root"))
                rst = true;
            return rst;
        }
        else{
            return false;
        }
    }

}
