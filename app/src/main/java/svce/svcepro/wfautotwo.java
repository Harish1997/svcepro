package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;


public class wfautotwo extends Activity {


    private WebView mywebview;
    Integer x, r;

    Activity activity;
    private ProgressDialog progDailog;

    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webcli);


        Bundle extras = getIntent().getExtras();
        r = extras.getInt("yearsem");
        x = extras.getInt("mysel");
        activity = this;

        progDailog = ProgressDialog.show(activity, "Loading", "Please wait...", true);
        progDailog.setCancelable(false);


        mywebview = (WebView) findViewById(R.id.webview);


        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);
        mywebview.getSettings().setSupportZoom(true);
        mywebview.getSettings().setDisplayZoomControls(true);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // progDailog.show();
                view.loadUrl(url);

                return true;
            }

            @Override
            public void onPageFinished(WebView view, final String url) {
                progDailog.dismiss();
            }
        });
// switch here

        switch (r)  //  hee r act as respective sem )2,4,6,8)

        {
            case 2: // scnd sem
            {

                switch (x) {
                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://svcepro-my.sharepoint.com/personal/deaned_svcepro_onmicrosoft_com/_layouts/15/guestaccess.aspx?folderid=01a68a4b2de1e40f1a291cfe6fd8971df&authkey=AR95s88B50os2-vdWnCx8ds");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://svcepro-my.sharepoint.com/personal/deaned_svcepro_onmicrosoft_com/_layouts/15/guestaccess.aspx?folderid=01517a9b6bf5040beacfc5321a7a92a5c&authkey=AVlvxtQ2Lb16vmjCthCNoVA");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }
            case 4: // 4th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://goo.gl/B5ZIxE");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://goo.gl/B5ZIxE");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }
            case 6: // 6th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl(" https://goo.gl/Wt5Rwt");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl(" https://goo.gl/Wt5Rwt");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;

            }
            case 8://8th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://goo.gl/XwpgQS");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://goo.gl/XwpgQS");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }



        }
        Button bb;
        bb=(Button)findViewById(R.id.bb);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(wfautotwo.this,navandtab.class);
                startActivity(intent);
            }
        });

    }
    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mywebview.canGoBack()) {
                        mywebview.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    } */

}
