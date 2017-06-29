package svce.svcepro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

import java.util.ArrayList;
import java.util.List;


public class fitbtwo extends AppCompatActivity {
    Integer x,y,z,t;
    BottomBar bottomBar;
    ListView listView;
    List<rowitem> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummylay);
        Bundle extras=getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        t = extras.getInt("sec"); //section se
        setTitle("Hello!");
        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId==R.id.Bottombarone)
                {
                    Bundle bundle=new Bundle();
                    bundle.putInt("year",x);
                    bundle.putInt("sem",y);
                    bundle.putInt("sel",z);
                    bundle.putInt("sec",t);
                    testfitb p=new testfitb();
                    p.setArguments(bundle);
                    getFragmentManager().beginTransaction().replace(R.id.frame,p).commit();
                }
                if(menuItemId==R.id.Bottombartwo)
                {
                    SocialFragment soc=new SocialFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,soc).commit();

                }
                if(menuItemId==R.id.Bottombarthree)
                {
                    PrimaryFragment ph=new PrimaryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,ph).commit();
                }
                if(menuItemId==R.id.Bottombarfour)
                {
                    busfone mail=new busfone();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,mail).commit();
                }
                if(menuItemId==R.id.Bottombarfive)
                {
                    UpdatesFragment fav=new UpdatesFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fav).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        bottomBar.mapColorForTab(0,"#F44336");
        bottomBar.mapColorForTab(1,"#9C27B0");
        bottomBar.mapColorForTab(2,"#03A9F4");
        bottomBar.mapColorForTab(3,"#009688");
        bottomBar.mapColorForTab(4,"#FF9800");

        BottomBarBadge unread;
        unread=bottomBar.makeBadgeForTabAt(3,"#FF0000",13);
        unread.show();



    }


}





//ending
