package com.example.projectprm392;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvUser;
private UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
rcvUser=findViewById(R.id.rcv_user);
userAdapter = new UserAdapter(this,getListUser());

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);
RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
rcvUser.addItemDecoration(itemDecoration);
        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);


    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.phamacy,"phamacy"));
        list.add(new User(R.drawable.registry,"registry"));
        list.add(new User(R.drawable.cartwheel,"cartwheel"));
        list.add(new User(R.drawable.clothing,"clothing"));
        list.add(new User(R.drawable.shoes,"shoes"));
        list.add(new User(R.drawable.accessories,"accessories"));
        list.add(new User(R.drawable.baby,"baby"));
        list.add(new User(R.drawable.home,"home"));
        list.add(new User(R.drawable.patio,"patio&garden"));

        return list;
    }
    @Override
protected void onDestroy(){
        super.onDestroy();
        if(userAdapter!=null){
            userAdapter.release();
        }

}
}