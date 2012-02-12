package com.nautilusapps.samples;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.nautilusapps.RestDroid.RestCall;
import com.nautilusapps.RestDroid.RestConnector;
import com.nautilusapps.RestDroid.RestResponse;

public class main extends Activity {
	private static final String TAG = "RestDroid_Sample";
	
	public static final String SERVER = ""; // localhost on emulator
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void start(View view) {
    	// INDEX
    	Log.d(TAG, "INDEX");
    	RestCall call = new RestCall(SERVER + "/");
    	RestResponse response = RestConnector.getSharedInstance().execute(call);
    	Log.d(TAG, response.toString());
    	
    	
    	
    }
    
    
    public void runIt(View view) {
    	
    	
        // INDEX
//        Log.d(TAG, "INDEX");
//        Observer indexObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "Index call failure");
//                else
//                    Log.d(TAG, "Index call success");
//            }
//        };
//        RESTCall indexRestCall = new RESTCall(SERVER + "/users");
//        indexRestCall.addObserver(indexObserver);
//        new RESTConnector().execute(indexRestCall);
//
//        // NEW
//        Log.d(TAG, "NEW");
//        Observer newObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "New call failure");
//                else {
//                    Log.d(TAG, "New call success");
//                }
//            }
//        };
//        RESTCall newRestCall = new RESTCall(SERVER + "/users/new");
//        newRestCall.addObserver(newObserver);
//        new RESTConnector().execute(newRestCall);
//
//        // CREATE
//        Log.d(TAG, "CREATE");
//        Observer createObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "Create call failure");
//                else {
//                    Log.d(TAG, "Create call success");
//
//                    JSONObject jo = response.getJsonArray().optJSONObject(0);
//                    if (jo != null) {
//                        jo = jo.optJSONObject("user");
//                        if (jo != null) {
//                            otherActions(jo.optInt("id"));
//                        }
//                    }
//                }
//            }
//        };
//        RESTCall createRestCall = new RESTCall(SERVER + "/users");
//        createRestCall.addObserver(createObserver);
//        createRestCall.setRestVerb(RestVerb.POST);
//        createRestCall.setExpectedResult(RESTCall.CREATED_201);
//        // "user" : {
//        //   "first_name" : "Billy",
//        //   "last_name" : "Bobby",
//        //   "age" : "32",
//        //   "active" : "true"
//        // }
//        RESTParam param = new RESTParam("user");
//        param.add(new RESTNameValuePair("first_name", "Billy"));
//        param.add(new RESTNameValuePair("last_name", "Bobby"));
//        param.add(new RESTNameValuePair("age", 32));
//        param.add(new RESTNameValuePair("active", true));
//        // Important to catch JSON errors when building REST call
//        try {
//            createRestCall.putParam(param);
//        } catch (JSONException e) {
//            Log.d(TAG, "Problems building JSON params");
//        }
//        new RESTConnector().execute(createRestCall);
    }

//    private void otherActions(int userId) {
//        // SHOW
//        Log.d(TAG, "SHOW");
//        Observer showObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "Show call failure");
//                else
//                    Log.d(TAG, "Show call success");
//            }
//        };
//        RESTCall showRestCall = new RESTCall(SERVER + "/users/" + userId);
//        showRestCall.addObserver(showObserver);
//        new RESTConnector().execute(showRestCall);
//
//        // UPDATE
//        Log.d(TAG, "UPDATE");
//        Observer updateObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "Update call failure");
//                else
//                    Log.d(TAG, "Update call success");
//            }
//        };
//        RESTCall updateRestCall = new RESTCall(SERVER + "/users/" + userId);
//        updateRestCall.addObserver(updateObserver);
//        updateRestCall.setRestVerb(RestVerb.PUT);
//        try {
//            // "user" : {
//            //   "first_name" : "Bob",
//            //   "last_name" : "Saget",
//            //   "age" : "59",
//            //   "active" : "false",
//            // }
//            RESTParam param = new RESTParam("user");
//            param.add(new RESTNameValuePair("first_name", "Bob"));
//            param.add(new RESTNameValuePair("last_name", "Saget"));
//            param.add(new RESTNameValuePair("age", 59));
//            param.add(new RESTNameValuePair("active", false));
//            updateRestCall.putParam(param);
//
//            // Note: the following params are for example, the rails app doesn't use them
//            // "single" : "value"
//            updateRestCall.putParam(new RESTNameValuePair("single", "value"));
//
//            // A mixed up array
//            // "mixed_list" : {
//            //   "value1",
//            //   "value2",
//            //   {
//            //     "phone", "123-456-7890",
//            //     "email", "test@example.com"
//            //   }
//            // }
//            ArrayList<Object> params = new ArrayList<Object>();
//            params.add("value1");
//            params.add("value2");
//            param = new RESTParam();
//            param.add(new RESTNameValuePair("phone", "123-456-7890"));
//            param.add(new RESTNameValuePair("email", "test@example.com"));
//            params.add(param);
//            updateRestCall.putParamArray("mixed_list", params);
//        } catch (JSONException exception) {
//            Log.d(TAG, "Problems building JSON params");
//        }
//        new RESTConnector().execute(updateRestCall);
//
//        // DESTROY
//        Log.d(TAG, "DESTROY");
//        Observer destroyObserver = new Observer() {
//
//            @Override
//            public void update(Observable observable, Object data) {
//                RESTResponse response = (RESTResponse)data;
//                if (response.hasError())
//                    Log.e(TAG, "Destroy call failure");
//                else
//                    Log.d(TAG, "Destroy call success");
//            }
//        };
//        RESTCall destroyRestCall = new RESTCall(SERVER + "/users/" + userId);
//        destroyRestCall.addObserver(destroyObserver);
//        destroyRestCall.setRestVerb(RestVerb.DELETE);
//        new RESTConnector().execute(destroyRestCall);
//    }
    
}