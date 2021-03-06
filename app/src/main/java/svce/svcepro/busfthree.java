package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.bumptech.glide.Glide;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class busfthree extends Fragment {

    private DatabaseReference root;
    ImageView img;

    private ProgressDialog progDailog;
    List<String> busdates=new ArrayList<String>();
    List<String> busdays=new ArrayList<String>();
    List<String> busnumbers=new ArrayList<String>();


    Set<String> hs=new LinkedHashSet<>();
    Set<String> hs1=new HashSet<>();
    Set<String> hs2=new HashSet<>();


    public RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_a, null);
        img=(ImageView)v.findViewById(R.id.mornimg);

        if (isNetworkAvailable(getActivity())) {
            Glide.with(getActivity()).load("http://24.media.tumblr.com/bff3dfb603a0c27245101f4270ce59c2/tumblr_n0ql0raVWU1qe9vdto1_500.jpg").into(img);
            root = FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("busevening");

            root.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    busevening(dataSnapshot, v);
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                    busevening(dataSnapshot, v);
                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }


        return v;
    }

    public List<busdata> fill_with_data() {

        List<busdata> data = new ArrayList<>();

        {
            hs.addAll(busdates);
            busdates.clear();
            busdates.addAll(hs);
        }

        /*{
            hs1.addAll(newscontent);
            newscontent.clear();
            newscontent.addAll(hs);
        }

        {
            hs2.addAll(newsurl);
            newsurl.clear();
            newsurl.addAll(hs);
        }*/


        for(int i=0;i<busdates.size();i++)
        {

            data.add(new busdata(busdates.get(i),busdays.get(i),busnumbers.get(i)));
        }
        return data;
    }
    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }


    String date,day,info;
    private void busevening(DataSnapshot dataSnapshot,View view)
    {



        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {
            date=(String)((DataSnapshot)i.next()).getValue();
            //content="none";
            //titl="none";
            day= (String) ((DataSnapshot)i.next()).getValue();
            //url="none";
            info= (String) ((DataSnapshot)i.next()).getValue();

            //Toast.makeText(Areaselected.this,"title"+titl,Toast.LENGTH_SHORT).show();
            busdates.add(date);
            busdays.add(day);
            busnumbers.add(info);
        }
        List<busdata> busdatas = fill_with_data();
        busView_Adapter adapter = new busView_Adapter(busdatas,getActivity());

        recyclerView=(RecyclerView)view.findViewById(R.id.recybusmorning);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        switch (position)
                        {
                            default:
                            {

                            }

                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {

                        }
                        // do whatever
                    }
                })
        );
        bustab.load.setVisibility(View.INVISIBLE);

    }

}