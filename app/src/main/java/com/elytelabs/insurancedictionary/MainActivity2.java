package com.elytelabs.insurancedictionary;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Toast;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerListener;
import com.appnext.banners.BannerView;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;

public class MainActivity2 extends AppCompatActivity {
    private BannerView bannerViewOne;
    private BannerView bannerViewTwo;
    private BannerView bannerViewTree;
    private BannerView bannerViewFour;
    private BannerView bannerViewFive;
    private BannerView bannerViewSix;
    private BannerView bannerViewSeven;
    private BannerView bannerViewEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Appnext.init(this);

        bannerViewOne = findViewById(R.id.banner1);
        bannerViewTwo = findViewById(R.id.banner2);
        bannerViewTree = findViewById(R.id.banner3);
        bannerViewFour = findViewById(R.id.banner4);
        bannerViewFive = findViewById(R.id.banner5);
        bannerViewSix = findViewById(R.id.banner6);
        bannerViewSeven = findViewById(R.id.banner7);
        bannerViewEight = findViewById(R.id.banner8);

        BannerAdRequest banner_request = new BannerAdRequest();
        BannerAdRequest banner_request2 = new BannerAdRequest();
        BannerAdRequest banner_request3 = new BannerAdRequest();
        BannerAdRequest banner_request4 = new BannerAdRequest();
        BannerAdRequest banner_request5 = new BannerAdRequest();
        BannerAdRequest banner_request6 = new BannerAdRequest();
        BannerAdRequest banner_request7 = new BannerAdRequest();
        BannerAdRequest banner_request8 = new BannerAdRequest();

        banner_request
                .setCategories("category1, category2")
                .setPostback("");

        banner_request2
                .setCategories("category3, category4")
                .setPostback("");
        banner_request3
                .setCategories("category5, category6")
                .setPostback("");
        banner_request4
                .setCategories("category1, category2")
                .setPostback("");
        banner_request5
                .setCategories("category1, category2")
                .setPostback("");
        banner_request6
                .setCategories("category1, category2")
                .setPostback("");
        banner_request7
                .setCategories("category1, category2")
                .setPostback("");
        banner_request8
                .setCategories("category1, category2")
                .setPostback("");

        bannerViewOne.loadAd(banner_request);
        bannerViewTwo.loadAd(banner_request2);
        bannerViewTree.loadAd(banner_request3);
        bannerViewFour.loadAd(banner_request4);
        bannerViewFive.loadAd(banner_request5);
        bannerViewSix.loadAd(banner_request6);
        bannerViewSeven.loadAd(banner_request7);
        bannerViewEight.loadAd(banner_request8);

        bannerViewOne.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                super.onError(error);
                Toast.makeText(getApplicationContext(), "Banner1: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                //System.out.println(error.toString());
            }

            @Override
            public void onAdLoaded(String s, AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });

        bannerViewTwo.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner2: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });

        bannerViewTree.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner3: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });

        bannerViewFour.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner4: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });

        bannerViewFive.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner5: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });
        bannerViewSix.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner6: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });
        bannerViewSeven.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner7: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });
        bannerViewEight.setBannerListener(new BannerListener() {
            @Override
            public void onError(AppnextError error) {
                Toast.makeText(getApplicationContext(), "Banner8: "+error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(error);
            }

            @Override
            public void onAdLoaded(String s,AppnextAdCreativeType creativeType) {
                super.onAdLoaded(s,creativeType);
            }

            @Override
            public void adImpression() {
                super.adImpression();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bannerViewOne.destroy();
        bannerViewTwo.destroy();
        bannerViewTree.destroy();
        bannerViewFour.destroy();
        bannerViewFive.destroy();
        bannerViewSix.destroy();
        bannerViewSeven.destroy();
        bannerViewEight.destroy();
    }
}