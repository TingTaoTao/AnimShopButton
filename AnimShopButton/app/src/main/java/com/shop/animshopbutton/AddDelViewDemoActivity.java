package com.shop.animshopbutton;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shoplibrary.AnimShopButton;
import com.shoplibrary.IOnAddDelListener;
import com.t.library.rv.CommonAdapter;
import com.t.library.rv.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yt on 2017/1/19.
 */
public class AddDelViewDemoActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_del_view_demo);
        final RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        findViewById(R.id.btnChange).setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View v) {
                if ((i++ & 1) == 1) {
                    rv.setLayoutManager(new LinearLayoutManager(AddDelViewDemoActivity.this));
                } else {
                    rv.setLayoutManager(new GridLayoutManager(AddDelViewDemoActivity.this, 2));
                }

            }
        });


//        rv.setAdapter(new CommonAdapter<AddDelBean>(this, getDatas(), R.layout.item_add_del) {
//            @Override
//            public void convert(RecyclerView.ViewHolder holder, final AddDelBean addDelBean) {
//                holder.setText(R.id.tv, addDelBean.getName());
//                AnimShopButton animShopButton = holder.getView(R.id.addDelView);
//                animShopButton.setCount(addDelBean.getCount());
//                animShopButton.setMaxCount(addDelBean.getMaxCount());
//                animShopButton.setOnAddDelListener(new IOnAddDelListener() {
//                    @Override
//                    public void onAddSuccess(int count) {
//                        addDelBean.setCount(count);
//                    }
//
//                    @Override
//                    public void onAddFailed(int count, FailType failType) {
//
//                    }
//
//                    @Override
//                    public void onDelSuccess(int count) {
//                        addDelBean.setCount(count);
//                    }
//
//                    @Override
//                    public void onDelFaild(int count, FailType failType) {
//
//                    }
//                });
///*                if (holder.getLayoutPosition() == 1) {
//                    addDelView.setNoDelFunc(true);
//                }else {
//                    addDelView.setNoDelFunc(false);
//                }*/
//            }
//        });
    }

    public List<AddDelBean> getDatas() {
        List<AddDelBean> result = new ArrayList<>();
/*        result.add(new AddDelBean(5, 1));
        result.add(new AddDelBean(10, 1));

        result.add(new AddDelBean(1, 1));
        result.add(new AddDelBean(0, 0));

        result.add(new AddDelBean(4, 2));*/

        for (int i = 0; i < 10; i++) {
            result.add(new AddDelBean(10, i));
        }

        return result;
    }
}
